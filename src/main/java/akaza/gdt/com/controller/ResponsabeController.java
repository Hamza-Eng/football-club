package akaza.gdt.com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import akaza.gdt.com.commone.CrudeController;
import akaza.gdt.com.entity.Responsable;
import akaza.gdt.com.serviceImplement.ResponsableServiceImpl;

public class ResponsabeController implements CrudeController<Responsable>{
@Autowired
private ResponsableServiceImpl service;
	
	@Override
	public List<Responsable> getAll() {
		// TODO Auto-generated method stub
		return service.getAll();
	}

	@Override
	public Optional<Responsable> getbyId(@PathVariable(name = "id") long id) {
		// TODO Auto-generated method stub
		return service.getbyId(id);
	}

	@Override
	public List<Responsable> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Responsable saveOrUpdate(Responsable t) {
		// TODO Auto-generated method stub
		return service.saveOrUpdate(t);
	}

	@Override
	public boolean delete(long id) {
		service.delete(id);
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return "ping=>pong" + this.getClass().getSimpleName();

	}

}
