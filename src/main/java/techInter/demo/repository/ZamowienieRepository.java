package techInter.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import techInter.demo.entity.Zamowienie;

@Repository
public interface ZamowienieRepository extends JpaRepository<Zamowienie, Long> {
}
