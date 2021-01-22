package techInter.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "rodzaj_potraw")
public class RodzajePotraw {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_potrawy")
    private Long id;

    private String opis;
}
