package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Adresse;
import akaza.gdt.com.serviceImplement.AdresseServiceImpl;

@RestController
@RequestMapping("/adresse")
public class AdresseController implements CrudeController<Adresse> {

	@Autowired
	private AdresseServiceImpl service;

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
	public Adresse saveOrUpdate(Adresse t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@GetMapping("/ping")
	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();
	}

}
