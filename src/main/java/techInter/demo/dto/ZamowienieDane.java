package techInter.demo.dto;

import java.util.List;
import java.util.Map;

public class ZamowienieDane {
    private String adres;
    private String na_kiedy;
    private Map<String, Integer> koszyk;

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNa_kiedy() {
        return na_kiedy;
    }

    public void setNa_kiedy(String na_kiedy) {
        this.na_kiedy = na_kiedy;
    }

    public Map<String, Integer> getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(Map<String, Integer> koszyk) {
        this.koszyk = koszyk;
    }
}
