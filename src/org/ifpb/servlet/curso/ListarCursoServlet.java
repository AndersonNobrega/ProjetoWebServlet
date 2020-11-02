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
 * Servlet implementation class ListarCursoServlet
 */
@WebServlet("/curso")
public class ListarCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoRepository cursoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCursoServlet() {
        super();
        this.cursoRepository = new CursoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/curso/list_curso.jsp");

		request.setAttribute("cursos", this.cursoRepository.findAll());
		rd.forward(request, response);
	}
}
