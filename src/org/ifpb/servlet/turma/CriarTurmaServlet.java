package org.ifpb.servlet.turma;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.TurmaRepository;
import org.ifpb.model.Turma;

/**
 * Servlet implementation class CriaTurma
 */
@WebServlet("/CriaTurma")
public class CriarTurmaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final TurmaRepository turmaRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarTurmaServlet() {
    	super();
		this.turmaRepository = new TurmaRepository();        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/instituicao/turma/cad_turma.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int vaga = Integer.parseInt(request.getParameter("vagas"));
		int cursoOfertadoId = Integer.parseInt(request.getParameter("cursoOfertadoId"));
		
		this.turmaRepository.create(new Turma(vaga, cursoOfertadoId));
		
		response.sendRedirect("/home/turma");
	}

}
