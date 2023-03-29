package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.Adresse;
import akaza.gdt.com.entity.TeamHeader;
import akaza.gdt.com.entity.Terain;
import akaza.gdt.com.repository.AdresseRepository;
import akaza.gdt.com.service.AdresseService;
@Service
public class AdresseServiceImpl implements CrudeService<Adresse>, AdresseService {

	@Autowired
	private AdresseRepository repository;

	@Override
	public List<Adresse> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<Adresse> getbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Adresse> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse saveOrUpdate(Adresse t) {
		// TODO Auto-generated method stub
		return repository.save(t);
	}

	@Override
	public boolean delete(long id) {
		repository.deleteById(id);
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
