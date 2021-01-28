package techInter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techInter.demo.entity.StatusZamowienia;

@Repository
public interface StatusRepo extends JpaRepository<StatusZamowienia, Long> {
}
