package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.Terain;

@Repository
public interface TerainRepository extends JpaRepository<Terain, Long> {
//	@Query("SELECT u FROM Terain t  WHERE  t.name = :name")
//	List<Terain> findUserByStatusAndNameNamedParams(@Param("name") String name);

}
