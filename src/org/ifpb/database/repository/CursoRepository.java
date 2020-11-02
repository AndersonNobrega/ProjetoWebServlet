package org.ifpb.database.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ifpb.database.DBConnection;
import org.ifpb.model.Curso;

public class CursoRepository implements Repository<Curso> {
	private final String SELECT_STATEMENT = "SELECT * FROM curso";
	private final String SELECT_BY_ID_STATEMENT = "SELECT * FROM curso WHERE id=?";
	private final String INSERT_STATEMENT = "INSERT INTO curso VALUES(default, ?)";
	private final String UPDATE_STATEMENT = "UPDATE curso SET nome=? WHERE id=?";
	private final String DELETE_STATEMENT = "DELETE FROM curso WHERE id=?";

	@Override
	public void create(Curso curso) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.INSERT_STATEMENT);
			
			statement.setString(1, curso.getNome());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, Curso curso) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.UPDATE_STATEMENT);
		
			statement.setString(1, curso.getNome());
			statement.setInt(2, id);

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.DELETE_STATEMENT);
		
			statement.setInt(1, id);
			
			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Curso> findAll() {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_STATEMENT);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Curso> listaCurso = new ArrayList<>();
			while(result.next()) {
				listaCurso.add(new Curso(result.getInt(1), result.getString(2)));
			}

			statement.close();
			connection.close();
			
			return listaCurso;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public ArrayList<Curso> findById(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_BY_ID_STATEMENT);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Curso> listaCurso = new ArrayList<>();
			while(result.next()) {
				listaCurso.add(new Curso(result.getInt(1), result.getString(2)));
			}

			statement.close();
			connection.close();
			
			return listaCurso;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

}
