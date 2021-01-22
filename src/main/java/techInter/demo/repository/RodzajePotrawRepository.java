package techInter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techInter.demo.entity.RodzajePotraw;

@Repository
public interface RodzajePotrawRepository extends JpaRepository<RodzajePotraw, Long> {
}
