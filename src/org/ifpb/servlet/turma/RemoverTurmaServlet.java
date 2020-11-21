package org.ifpb.servlet.turma;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.TurmaRepository;

/**
 * Servlet implementation class RemoverTurma
 */
@WebServlet("/turma/remover")
public class RemoverTurmaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final TurmaRepository turmaRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverTurmaServlet() {
        super();
		this.turmaRepository = new TurmaRepository();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/instituicao/turma/rm_turma.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		this.turmaRepository.delete(id);
		
		response.sendRedirect("/ProjetoWebServlet/turma");
	}

}
