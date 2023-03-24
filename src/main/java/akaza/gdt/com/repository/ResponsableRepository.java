package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.Responsable;

@Repository
public interface ResponsableRepository extends JpaRepository<Responsable,Long>{

}
