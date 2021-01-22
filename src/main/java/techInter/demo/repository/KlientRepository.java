package techInter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techInter.demo.entity.Klient;

@Repository
public interface KlientRepository extends JpaRepository<Klient, Long> {
}
