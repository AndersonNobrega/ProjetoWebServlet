package org.ifpb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.CursoRepository;

/**
 * Servlet implementation class InfoCursoServlet
 */
@WebServlet("/curso/info")
public class InfoCursoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoRepository cursoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoCursoServlet() {
		super();
        this.cursoRepository = new CursoRepository();


    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/home/curso/curso.jsp");
		
		request.setAttribute("curso", this.cursoRepository.findById(id).get(0));
		rd.forward(request, response);
		
	}

}
