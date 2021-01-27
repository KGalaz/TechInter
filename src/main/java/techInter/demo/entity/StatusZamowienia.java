package techInter.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="status_zamowienia")
public class StatusZamowienia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_status")
    private Long id;

    @Column(name="opis")
    private String opis;

    public StatusZamowienia(Long id, String opis) {
        this.id = id;
        this.opis = opis;
    }

    public StatusZamowienia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
