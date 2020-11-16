package org.ifpb.servlet.curso;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.CursoRepository;
import org.ifpb.model.Curso;

/**
 * Servlet implementation class CriarCursoServlet
 */
@WebServlet("/curso/criar")
public class CriarCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoRepository cursoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarCursoServlet() {
        super();
        this.cursoRepository = new CursoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/curso/cad_curso.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		
		this.cursoRepository.create(new Curso(nome));
		
		response.sendRedirect("/curso");
	}

}
