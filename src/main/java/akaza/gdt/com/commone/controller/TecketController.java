package akaza.gdt.com.commone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.entity.Tecket;

public class TecketController implements CrudeController<Tecket>{

	@Override
	public List<Tecket> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Tecket> getbyId() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Tecket> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Tecket> saveOrUpdate(Tecket t) {
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

}
