package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.Responsable;
import akaza.gdt.com.repository.ResponsableRepository;
import akaza.gdt.com.service.ResponsableService;

@Service
public class ResponsableServiceImpl implements CrudeService<Responsable> , ResponsableService{

	@Autowired
	private ResponsableRepository repository;
	
	@Override
	public List<Responsable> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Responsable> getbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Responsable> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Responsable saveOrUpdate(Responsable t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
				repository.deleteById(id);
				return true;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
