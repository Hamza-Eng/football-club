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
import akaza.gdt.com.entity.TeamHeader;
import akaza.gdt.com.serviceImplement.TeameHeaderServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/teamHeader")
public class TeamHeaderController implements CrudeController<TeamHeader> {

	//@Autowired
	private TeameHeaderServiceImpl service;
	

	public TeamHeaderController(TeameHeaderServiceImpl service) {
		this.service = service;
	}

	@Override
	@GetMapping("/all")
	public List<TeamHeader> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@GetMapping("/id/{id}")
	@Override
	public Optional<TeamHeader> getbyId(@PathVariable(name = "id") long id) {
		// TODO Auto-generated method stub
		return service.getbyId(id);
	}

	@Override
	public List<TeamHeader> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/add")
	@Override
	public TeamHeader saveOrUpdate(TeamHeader t) {
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
