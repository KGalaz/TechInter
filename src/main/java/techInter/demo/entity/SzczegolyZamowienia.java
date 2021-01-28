package techInter.demo.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Entity
@Table(name = "szczegoly_zamowienia")
public class SzczegolyZamowienia{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="id_zamowienie")
    private Long idZamowienia;

    @Column(name = "ilosc_potraw")
    private int iloscPotraw;

    @Column(name = "id_potrawy")
    private int idPotrway;

    public Long getIdZamowienia() {
        return idZamowienia;
    }

    public void setIdZamowienia(Long idZamowienia) {
        this.idZamowienia = idZamowienia;
    }

    public int getIloscPotraw() {
        return iloscPotraw;
    }

    public void setIloscPotraw(int iloscPotraw) {
        this.iloscPotraw = iloscPotraw;
    }

    public int getIdPotrway() {
        return idPotrway;
    }

    public void setIdPotrway(int idPotrway) {
        this.idPotrway = idPotrway;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
