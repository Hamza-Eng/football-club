package akaza.gdt.com.serviceImplement;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.commone.CrudeService;
import akaza.gdt.com.entity.TeamHeader;
import akaza.gdt.com.service.TerainService;

public class TerainServiceImpl implements CrudeService<TeamHeader> , TerainService{

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
	public Optional<TeamHeader> saveOrUpdate(TeamHeader t) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String ping() {
		// TODO Auto-generated method stub
		return null;
	}

}
