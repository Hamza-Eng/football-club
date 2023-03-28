package akaza.gdt.com.commone;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CrudeService <T> {
	List<T> getAll();
	Optional<T> getbyId(long id);
	List<T> search(Map<String, String> cretaria);
	Optional<T> saveOrUpdate(T t);
	boolean delete();
	String ping();
}
