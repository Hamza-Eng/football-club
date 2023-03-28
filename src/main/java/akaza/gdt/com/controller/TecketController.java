package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Tecket;
import akaza.gdt.com.repository.TecketRepository;

@RestController
@RequestMapping("/Tecket")
public class TecketController implements CrudeController<Tecket>{

	@Override
	public List<Tecket> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	TecketRepository repository;
	@Override
	public Optional<Tecket> getbyId(long id) {
		return repository.findById(id);
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

	@GetMapping("ping")
	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "hello from hamza";
	}

}
