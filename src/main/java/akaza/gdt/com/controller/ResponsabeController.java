package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Responsable;

public class ResponsabeController implements CrudeController<Responsable>{

	@Override
	public List<Responsable> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Responsable> getbyId(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Responsable> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Responsable saveOrUpdate(Responsable t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();

	}

}
