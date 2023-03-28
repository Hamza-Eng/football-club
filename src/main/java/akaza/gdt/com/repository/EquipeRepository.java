package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.TeamHeader;

@Repository
public interface EquipeRepository extends JpaRepository<TeamHeader,Long>{

}
