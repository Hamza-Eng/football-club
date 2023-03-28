package akaza.gdt.com.commone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Responsable;

public class ResponsableController implements CrudeController<Responsable>{

	@Override
	public List<Responsable> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Responsable> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Responsable> saveOrUpdate(Responsable t) {
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
	public Optional<Responsable> getbyId(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
