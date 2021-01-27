package techInter.demo.dto;

import techInter.demo.entity.Potrawy;
import techInter.demo.entity.RodzajePotraw;

public class PotrawaDto {

    private Long id;
    private String nazwa;
    private double cena;
    private String rodzajPotrawy;

    public PotrawaDto(Potrawy potrawy, RodzajePotraw rodzajPotrawy) {
        this.id = potrawy.getId();
        this.nazwa = potrawy.getNazwaPotrawy();
        this.cena = potrawy.getCenaPotrawy();
        this.rodzajPotrawy = rodzajPotrawy.getOpis();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getRodzajPotrawy() {
        return rodzajPotrawy;
    }

    public void setRodzajPotrawy(String rodzajPotrawy) {
        this.rodzajPotrawy = rodzajPotrawy;
    }
}
