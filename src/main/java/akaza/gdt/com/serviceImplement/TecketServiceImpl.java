package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.Tecket;
import akaza.gdt.com.repository.TecketRepository;
import akaza.gdt.com.service.TecketService;
@Service
public class TecketServiceImpl implements CrudeService<Tecket> , TecketService{

	
	@Autowired
	private TecketRepository repository;
	@Override
	public List<Tecket> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Tecket> getbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Tecket> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Tecket saveOrUpdate(Tecket t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
