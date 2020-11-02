package org.ifpb.servlet.curso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.CursoRepository;

/**
 * Servlet implementation class RemoverCursoServlet
 */
@WebServlet("/curso/remover")
public class RemoverCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoRepository cursoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverCursoServlet() {
        super();
        this.cursoRepository = new CursoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/curso/rm_curso.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		this.cursoRepository.delete(id);
		
		response.sendRedirect("/home/curso");
	}

}
