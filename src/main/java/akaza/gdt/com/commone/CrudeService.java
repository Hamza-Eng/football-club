package akaza.gdt.com.commone;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import akaza.gdt.com.entity.Terain;

public interface CrudeService <T> {
	List<T> getAll();
	Optional<T> getbyId(long id);
	List<T> search(Map<String, String> cretaria);
	Terain saveOrUpdate(T t);
	boolean delete(long id);
	String ping();
}
