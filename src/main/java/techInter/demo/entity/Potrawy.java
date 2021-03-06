package techInter.demo.entity;

import javax.persistence.*;

@Entity
public class Potrawy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_potrawy")
    private Long id;

    @Column(name = "nazwapotrawy")
    private String nazwaPotrawy;

    @Column(name = "cenapotrawy")
    private double cenaPotrawy;

    @OneToOne
    @JoinColumn(name = "rodzajpotrawy", referencedColumnName = "id_rodzaj")
    private RodzajePotraw rodzajPotrawy;

    public Long getId() {
        return id;
    }

    public String getNazwaPotrawy() {
        return nazwaPotrawy;
    }

    public double getCenaPotrawy() {
        return cenaPotrawy;
    }

    public RodzajePotraw getRodzajPotrawy() {
        return rodzajPotrawy;
    }
}
