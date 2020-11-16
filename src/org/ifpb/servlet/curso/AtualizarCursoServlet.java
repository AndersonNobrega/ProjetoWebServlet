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
 * Servlet implementation class AtualizarCursoServlet
 */
@WebServlet("/curso/atualizar")
public class AtualizarCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoRepository cursoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtualizarCursoServlet() {
        super();
        this.cursoRepository = new CursoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/curso/att_curso.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		
		this.cursoRepository.update(id, new Curso(nome));
		
		response.sendRedirect("/curso");
	}

}
