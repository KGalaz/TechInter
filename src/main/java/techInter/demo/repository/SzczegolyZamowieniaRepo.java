package techInter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techInter.demo.entity.SzczegolyZamowienia;

@Repository
public interface SzczegolyZamowieniaRepo extends JpaRepository<SzczegolyZamowienia, Long> {
}
