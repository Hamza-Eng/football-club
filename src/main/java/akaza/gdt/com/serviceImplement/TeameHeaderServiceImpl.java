package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.TeamHeader;
import akaza.gdt.com.entity.Terain;
import akaza.gdt.com.repository.TeamHeaderRepository;
import akaza.gdt.com.service.TeamHeaderService;

@Service
public class TeameHeaderServiceImpl implements CrudeService<TeamHeader>, TeamHeaderService {

	private TeamHeaderRepository repository;

	public TeameHeaderServiceImpl(TeamHeaderRepository repository) {
		this.repository = repository;
	}

	@Override
	public List<TeamHeader> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<TeamHeader> getbyId(long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<TeamHeader> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TeamHeader saveOrUpdate(TeamHeader t) {
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
		return "pin=>pong";
	}

}
