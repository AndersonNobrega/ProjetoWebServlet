package org.ifpb.database.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ifpb.database.DBConnection;
import org.ifpb.model.Aluno;

public class AlunoRepository implements Repository<Aluno> {
	private final String SELECT_STATEMENT = "SELECT * FROM aluno WHERE turma_id=?";
	private final String SELECT_BY_ID_STATEMENT = "SELECT * FROM aluno WHERE id=?";
	private final String INSERT_STATEMENT = "INSERT INTO aluno VALUES(default, ?, ?, ?, ?)";
	private final String UPDATE_STATEMENT = "UPDATE aluno SET nome=?,rg=?,cpf=? WHERE id=?";
	private final String DELETE_STATEMENT = "DELETE FROM aluno WHERE id=?";

	@Override
	public void create(Aluno aluno) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.INSERT_STATEMENT);
			
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getRg());
			statement.setString(3, aluno.getCpf());
			statement.setInt(4, aluno.getTurmaId());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, Aluno aluno) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.UPDATE_STATEMENT);
		
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getRg());
			statement.setString(3, aluno.getCpf());
			
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
	
	public ArrayList<Aluno> findAllByTurma(int turmaId) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_STATEMENT);
			
			statement.setInt(1, turmaId);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Aluno> listaAluno = new ArrayList<>();
			while(result.next()) {
				listaAluno.add(new Aluno(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5)));
			}

			statement.close();
			connection.close();
			
			return listaAluno;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public ArrayList<Aluno> findAll() {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_STATEMENT);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Aluno> listaAluno = new ArrayList<>();
			while(result.next()) {
				listaAluno.add(new Aluno(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5)));
			}

			statement.close();
			connection.close();
			
			return listaAluno;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public ArrayList<Aluno> findById(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_BY_ID_STATEMENT);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Aluno> listaAluno = new ArrayList<>();
			while(result.next()) {
				listaAluno.add(new Aluno(result.getInt(1), result.getString(2), result.getString(3), result.getString(4),  result.getInt(5)));
			}

			statement.close();
			connection.close();
			
			return listaAluno;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

}
