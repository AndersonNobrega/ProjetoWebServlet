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
 * Servlet implementation class ListarTurmaServlet
 */
@WebServlet("/turma")
public class ListarTurmaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final TurmaRepository turmaRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarTurmaServlet() {
        super();
		this.turmaRepository = new TurmaRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/instituicao/turma/list_turma.jsp");

		request.setAttribute("turmas", this.turmaRepository.findAll());
		
		rd.forward(request, response);
	}
}
