package org.ifpb.database.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.ifpb.database.DBConnection;
import org.ifpb.model.CursoOfertado;

public class CursoOfertadoRepository implements Repository<CursoOfertado> {
	private final String SELECT_STATEMENT = "SELECT * FROM curso_ofertado";
	private final String SELECT_BY_ID_STATEMENT = "SELECT * FROM curso_ofertado WHERE id=?";
	private final String INSERT_STATEMENT = "INSERT INTO curso_ofertado VALUES(default, ?, ?, ?, ?)";
	private final String UPDATE_STATEMENT = "UPDATE curso_ofertado SET coordenador=?,vagas=? WHERE id=?";
	private final String DELETE_STATEMENT = "DELETE FROM curso_ofertado WHERE id=?";
	
	@Override
	public void create(CursoOfertado cursoOfertado) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.INSERT_STATEMENT);
			
			statement.setString(1, cursoOfertado.getCoordenador());
			statement.setInt(2, cursoOfertado.getVagas());
			statement.setInt(3, cursoOfertado.getInstituicaoId());
			statement.setInt(4, cursoOfertado.getCursoId());

			statement.executeUpdate();

			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, CursoOfertado cursoOfertado) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.UPDATE_STATEMENT);
		
			statement.setString(1, cursoOfertado.getCoordenador());
			statement.setInt(2, cursoOfertado.getVagas());
			statement.setInt(3, cursoOfertado.getInstituicaoId());
			statement.setInt(4, cursoOfertado.getCursoId());
			statement.setInt(5, id);

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
	public ArrayList<CursoOfertado> findAll() {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_STATEMENT);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<CursoOfertado> listaCursoOfertado = new ArrayList<>();
			while(result.next()) {
				listaCursoOfertado.add(new CursoOfertado(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), result.getInt(5)));
			}

			statement.close();
			connection.close();
			
			return listaCursoOfertado;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

	@Override
	public ArrayList<CursoOfertado> findById(int id) {
		try {
			Connection connection = DBConnection.initializeDatabase();
			
			PreparedStatement statement = connection.prepareStatement(this.SELECT_BY_ID_STATEMENT);
			
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<CursoOfertado> listaCursoOfertado = new ArrayList<>();
			while(result.next()) {
				listaCursoOfertado.add(new CursoOfertado(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), result.getInt(5)));
			}

			statement.close();
			connection.close();
			
			return listaCursoOfertado;
		} catch(Exception e) {
			e.printStackTrace();
			
			return null;
		}
	}

}
