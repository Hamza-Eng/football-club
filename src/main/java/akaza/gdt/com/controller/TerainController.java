package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Terain;
import akaza.gdt.com.serviceImplement.TerainServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/terain")
public class TerainController implements CrudeController<Terain> {

	@Autowired
	private TerainServiceImpl service;

	@GetMapping("/all")
	@Override
	public List<Terain> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@GetMapping("/id/{id}")
	@Override
	public Optional<Terain> getbyId(@PathVariable(name = "id") long id) {
		// TODO Auto-generated method stub
		return service.getbyId(id);
	}

	@Override
	public List<Terain> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/add")
	@Override
	public Terain saveOrUpdate(Terain t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@DeleteMapping("delete")
	@Override
	public boolean delete(long id) {
		service.delete(id);
		return false;
	}

	@GetMapping("/ping")
	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();

	}

}
