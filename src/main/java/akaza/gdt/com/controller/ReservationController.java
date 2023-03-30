package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Reservation;
import akaza.gdt.com.serviceImplement.ReservationServiceImpl;

public class ReservationController implements CrudeController<Reservation> {
	@Autowired
	private ReservationServiceImpl service;

	@GetMapping("/all")
	@Override
	public List<Reservation> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}
	 
	@GetMapping("/id/{id}")
	@Override
	public Optional<Reservation> getbyId(@PathVariable(name = "id") long id) {
		// TODO Auto-generated method stub
		return service.getbyId(id);
	}

	@Override
	public List<Reservation> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/add")
	@Override
	public Reservation saveOrUpdate(Reservation t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@DeleteMapping("/delete")
	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return service.delete(id);
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();

	}

}
