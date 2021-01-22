package techInter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techInter.demo.entity.Potrawy;

@Repository
public interface PotrawyRepository extends JpaRepository<Potrawy, Long> {

}
