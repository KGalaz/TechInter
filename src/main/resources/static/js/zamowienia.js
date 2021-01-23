const koszykMap = new Map;

function aktualizujKoszyk() {
    //todo dokonczyc
    let elemP = document.getElementById("koszyk");
    let tekst;
    koszykMap.forEach( (v, k) => {
        tekst = tekst + k + ": ilość-> " + k + "<br>"
    })
    elemP.innerHTML = tekst;
}



function dodajPotrawe(param) {
    let ilosc;
    if(koszykMap.get(param) === undefined) {
        ilosc = 0;
    } else {
        ilosc = koszykMap.get(param)
    }
    koszykMap.set(param, ++ilosc)
    console.log("Koszyk: ", koszykMap)
    aktualizujKoszyk();
}

function usunPotrawe(param) {
    let ilosc;
    if(koszykMap.get(param !== undefined)) {
        return;
    }
    ilosc = koszykMap.get(param);
    if(ilosc === 0) {
        return;
    }
    koszykMap.set(param, --ilosc)
    console.log(koszykMap)
    aktualizujKoszyk()
}