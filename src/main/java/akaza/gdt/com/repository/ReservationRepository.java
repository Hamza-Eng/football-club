package akaza.gdt.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import akaza.gdt.com.entity.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long>{

}
