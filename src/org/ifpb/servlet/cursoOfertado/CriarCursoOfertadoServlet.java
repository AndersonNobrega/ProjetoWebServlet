package org.ifpb.servlet.cursoOfertado;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.CursoOfertadoRepository;
import org.ifpb.model.CursoOfertado;

/**
 * Servlet implementation class CriaCursoOfertadoServlet
 */
@WebServlet("/cursoOfertado/criar")
public class CriarCursoOfertadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoOfertadoRepository cursoOfertadoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarCursoOfertadoServlet() {
    	super();
    	this.cursoOfertadoRepository = new CursoOfertadoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/instituicao/cursoOfertado/criar_cursoOfertado.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coordenador = request.getParameter("coordenador");
		int vagas = Integer.parseInt(request.getParameter("vagas")); 
		int instituicaoId = Integer.parseInt(request.getParameter("instituicaoId")); 
		int cursoId= Integer.parseInt(request.getParameter("cursoId"));
		
		System.out.println("Coordenador: "+ coordenador);
		
		this.cursoOfertadoRepository.create(new CursoOfertado(coordenador, vagas, instituicaoId,cursoId));
			
		response.sendRedirect("/home/CursoOfertado");
	}

}
