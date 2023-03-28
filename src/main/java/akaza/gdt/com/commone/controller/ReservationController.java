package akaza.gdt.com.commone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Reservation;

public class ReservationController implements CrudeController<Reservation>{

	@Override
	public List<Reservation> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Reservation> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Reservation> saveOrUpdate(Reservation t) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Reservation> getbyId(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
