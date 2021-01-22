package techInter.demo.entity;

import javax.persistence.*;

@Entity
public class Klient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_klient")
    private Long id;

    private String imie;
    private String nazwisko;
    private String nr_telefonu;
    private String typ_klienta_id;

    public String getImie() {
        return imie;
    }
}
