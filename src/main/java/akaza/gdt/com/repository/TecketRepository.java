package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.Tecket;
@Repository
public interface TecketRepository extends JpaRepository<Tecket,Long> {

}
