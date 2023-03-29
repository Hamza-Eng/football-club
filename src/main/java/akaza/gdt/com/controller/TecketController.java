package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Tecket;

@RestController
@RequestMapping("/tecket")
public class TecketController implements CrudeController<Tecket> {


	@GetMapping("/all")
	@Override
	public List<Tecket> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/id/{id}")
	@Override
	public Optional<Tecket> getbyId(@PathVariable(name = "id") long id) {
		return null;
	}

	@Override
	public List<Tecket> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@PostMapping("/add")
	@Override
	public Tecket saveOrUpdate(Tecket t) {
		// TODO Auto-generated method stub
		return null;
	}

	@DeleteMapping("/delete")
	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@GetMapping("ping")
	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();

	}

}
