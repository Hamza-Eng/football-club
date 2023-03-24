package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import akaza.gdt.com.commone.controller.CrudeController;
import akaza.gdt.com.entity.Terain;

@RestController
@CrossOrigin
public class TerainController implements CrudeController<Terain>{

	@Override
	public List<Terain> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Terain> getbyId() {
		// TODO Auto-generated method stub
		return Optional.empty();
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

}
