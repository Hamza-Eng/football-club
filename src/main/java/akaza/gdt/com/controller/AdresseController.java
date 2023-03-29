package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Adresse;

public class AdresseController implements CrudeController<Adresse> {

	@Override
	public List<Adresse> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Adresse> getbyId(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Adresse> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Adresse> saveOrUpdate(Adresse t) {
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
