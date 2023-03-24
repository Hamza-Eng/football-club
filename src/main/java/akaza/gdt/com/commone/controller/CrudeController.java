package akaza.gdt.com.commone.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CrudeController <T>{

	List<T> getAll();
	Optional<T> getbyId();
	List<T> search(Map<String, String> cretaria);
	Optional<T> saveOrUpdate(T t);
	boolean delete();
	String ping();
	
	}
