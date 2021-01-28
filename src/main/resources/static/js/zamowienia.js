var koszykMap = {}

function aktualizujKoszyk() {
    let elemP = document.getElementById("koszyk");
    let tekst = "";
    for(var klucz in koszykMap) {
        tekst = tekst + "Numer potrawy: " + klucz + ": ilość-> " + koszykMap[klucz] + "<br>"
    }
    elemP.innerHTML = tekst;
}

function dodajPotrawe(param) {
    let ilosc;
    if(koszykMap[param] === undefined) {
        ilosc = 0;
    } else {
        ilosc = koszykMap[param]
    }
    koszykMap[param] = ++ilosc
    aktualizujKoszyk();
}

function usunPotrawe(param) {
    let ilosc;
    if(koszykMap[param] === undefined) {
        return;
    }
    ilosc = koszykMap[param];
    if(ilosc === 0) {
        return;
    }
    koszykMap[param] = --ilosc
    aktualizujKoszyk()
}

function wyslij(event) {
    event.preventDefault()
    var adres = document.getElementById("adres").value
    var na_kiedy = document.getElementById("naKiedy").value
    var koszyk = koszykMap

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/zamowienia/zamow",
        data: JSON.stringify({"adres": adres, "na_kiedy": na_kiedy, "koszyk": koszyk}),
        success: function(data){
            alert(data.text);
        },
        dataType: "json",
        contentType : "application/json"
    });
}