package techInter.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "rodzaj_potraw")
public class RodzajePotraw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_rodzaj")
    private Long id;

    private String opis;

    public RodzajePotraw() {
    }

    public RodzajePotraw(String opis) {
        this.opis = opis;
    }

    public Long getId() {
        return id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
