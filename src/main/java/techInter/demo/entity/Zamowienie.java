package techInter.demo.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="zamowienie")
public class Zamowienie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_zamowienie")
    private Long id;

    @Column(name = "id_klient")
    private Long idKlient;

    private String adres;

    @Column(name="na_kiedy")
    private LocalDateTime naKiedy;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name="status_id", referencedColumnName="id_status")
    })
    private StatusZamowienia statusZamowienia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public LocalDateTime getNaKiedy() {
        return naKiedy;
    }

    public void setNaKiedy(LocalDateTime naKiedy) {
        this.naKiedy = naKiedy;
    }

    public StatusZamowienia getStatusZamowienia() {
        return statusZamowienia;
    }

    public void setStatusZamowienia(StatusZamowienia statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public Long getIdKlient() {
        return idKlient;
    }

    public void setIdKlient(Long idKlient) {
        this.idKlient = idKlient;
    }
}
