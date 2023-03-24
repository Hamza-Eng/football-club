package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse,Long>{

}
