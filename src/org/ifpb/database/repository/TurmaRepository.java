package org.ifpb.database.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ifpb.database.DBConnection;
import org.ifpb.model.Turma;

public class TurmaRepository implements Repository<Turma> {
	private final String SELECT_STATEMENT = "SELECT * FROM turma";
	private final String SELECT_BY_ID_STATEMENT = "SELECT * FROM turma WHERE id=?";
	private final String INSERT_STATEMENT = "INSERT INTO turma VALUES(default, ?, ?)";
	private final String UPDATE_STATEMENT = "UPDATE turma SET vagas=? WHERE id=?";
	private final String DELETE_STATEMENT = "DELETE FROM turma WHERE id=?";

	@Override
	public void create(Turma turma) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.INSERT_STATEMENT);
			
			statement.setInt(1, turma.getVagas());
			statement.setInt(2, turma.getCursoOfertadoId());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, Turma turma) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.UPDATE_STATEMENT);
		
			statement.setInt(1, turma.getVagas());
			
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
	public ArrayList<Turma> findAll() {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_STATEMENT);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Turma> listaTurma = new ArrayList<>();
			while(result.next()) {
				listaTurma.add(new Turma(result.getInt(2), result.getInt(3)));
			}

			statement.close();
			connection.close();
			
			return listaTurma;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public ArrayList<Turma> findById(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_BY_ID_STATEMENT);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Turma> listaTurma = new ArrayList<>();
			while(result.next()) {
				listaTurma.add(new Turma(result.getInt(2), result.getInt(3)));
			}

			statement.close();
			connection.close();
			
			return listaTurma;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

}
