package io.springboot.mvc;

import java.util.Set;

public interface CrudService<T, ID> {

	Set<T> findAll();
	Book create(T obj);
	void delete(ID id);
	void deleteAll();
	Book findById(ID id);
}
