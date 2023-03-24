package akaza.gdt.com.commone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.entity.Equipe;

public class EquipeController implements CrudeController<Equipe>{

	@Override
	public List<Equipe> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Equipe> getbyId() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Equipe> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Equipe> saveOrUpdate(Equipe t) {
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
