package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.Reservation;
import akaza.gdt.com.repository.ReservationRepository;
import akaza.gdt.com.service.ReservationService;
@Service
public class ReservationServiceImpl implements CrudeService<Reservation>, ReservationService {

	@Autowired
	private ReservationRepository repository;

	@Override
	public List<Reservation> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Reservation> getbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Reservation> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation saveOrUpdate(Reservation t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		return true;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
