package org.ifpb.database.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ifpb.database.DBConnection;
import org.ifpb.model.Instituicao;

public class InstituicaoRepository implements Repository<Instituicao> {
	private final String SELECT_STATEMENT = "SELECT * FROM instituicao";
	private final String SELECT_BY_ID_STATEMENT = "SELECT * FROM instituicao WHERE id=?";
	private final String INSERT_STATEMENT = "INSERT INTO instituicao VALUES(default, ?, ?, ?)";
	private final String UPDATE_STATEMENT = "UPDATE instituicao SET nome=?,reitor=?,cnpj=? WHERE id=?";
	private final String DELETE_STATEMENT = "DELETE FROM instituicao WHERE id=?";
	
	@Override
	public void create(Instituicao instituicao) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.INSERT_STATEMENT);
			
			statement.setString(1, instituicao.getNome());
			statement.setString(2, instituicao.getReitor());
			statement.setString(3, instituicao.getCnpj());

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
	public void update(int id, Instituicao instituicao) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.UPDATE_STATEMENT);
		
			statement.setString(1, instituicao.getNome());
			statement.setString(2, instituicao.getReitor());
			statement.setString(3, instituicao.getCnpj());
			statement.setInt(4, id);
			
			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<Instituicao> findAll() {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_STATEMENT);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Instituicao> listaInstituicao = new ArrayList<>();
			while(result.next()) {
				listaInstituicao.add(new Instituicao(result.getInt(1), result.getString(2), result.getString(3), result.getString(4)));
			}

			statement.close();
			connection.close();
			
			return listaInstituicao;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	@Override
	public ArrayList<Instituicao> findById(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_BY_ID_STATEMENT);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Instituicao> listaInstituicao = new ArrayList<>();
			while(result.next()) {
				listaInstituicao.add(new Instituicao(result.getInt(1), result.getString(2), result.getString(3), result.getString(4)));
			}

			statement.close();
			connection.close();
			
			return listaInstituicao;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
}
