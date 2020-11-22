package org.ifpb.database.repository;

import java.util.ArrayList;

import org.ifpb.model.Aluno;

public interface Repository<T> {
	public void create(T object);
	public void update(int id, T object);
	public void delete(int id);
	public ArrayList<T> findAll();
	public ArrayList<T> findById(int id);
}
