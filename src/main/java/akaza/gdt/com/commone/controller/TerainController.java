package akaza.gdt.com.commone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Terain;

public class TerainController implements CrudeController<Terain>{

	@Override
	public List<Terain> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Terain> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Terain> saveOrUpdate(Terain t) {
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
	public Optional<Terain> getbyId(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
