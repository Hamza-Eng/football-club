package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.TeamHeader;
import akaza.gdt.com.entity.Terain;
import akaza.gdt.com.service.TeamHeaderService;

public class TeameHeaderServiceImpl implements CrudeService<TeamHeader> , TeamHeaderService{

	
	@Override
	public List<TeamHeader> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<TeamHeader> getbyId(long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TeamHeader> search(Map<String, String> cretaria) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Terain saveOrUpdate(TeamHeader t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
