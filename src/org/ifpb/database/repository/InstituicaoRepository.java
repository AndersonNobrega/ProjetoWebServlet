package org.ifpb.database.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ifpb.database.DBConnection;
import org.ifpb.model.Instituicao;

public class InstituicaoRepository {
	private static final String SELECT_STATEMENT = "SELECT * FROM instituicao";
	private static final String SELECT_BY_ID_STATEMENT = "SELECT * FROM instituicao WHERE id=?";
	private static final String INSERT_STATEMENT = "INSERT INTO instituicao VALUES(default, ?, ?, ?)";
	private static final String UPDATE_STATEMENT = "UPDATE instituicao SET nome=?,reitor=?,cnpj=? WHERE id=?";
	private static final String DELETE_STATEMENT = "DELETE FROM instituicao WHERE id=?";
	
	public static void create(Instituicao instituicao) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(InstituicaoRepository.INSERT_STATEMENT);
			
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
	
	public static void delete(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(InstituicaoRepository.DELETE_STATEMENT);
		
			statement.setInt(1, id);
			
			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update(int id, Instituicao instituicao) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(InstituicaoRepository.UPDATE_STATEMENT);
		
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

	public static ArrayList<Instituicao> findAll() {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(InstituicaoRepository.SELECT_STATEMENT);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Instituicao> listaInstituicao = new ArrayList<>();
			while(result.next()) {
				listaInstituicao.add(new Instituicao(result.getString(2), result.getString(3), result.getString(4)));
			}

			statement.close();
			connection.close();
			
			return listaInstituicao;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}
	
	public static ArrayList<Instituicao> find(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(InstituicaoRepository.SELECT_BY_ID_STATEMENT);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Instituicao> listaInstituicao = new ArrayList<>();
			while(result.next()) {
				listaInstituicao.add(new Instituicao(result.getString(2), result.getString(3), result.getString(4)));
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
