package org.ifpb.servlet.cursoOfertado;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.CursoOfertadoRepository;

/**
 * Servlet implementation class RemoveCursoOfertadoServlet
 */
@WebServlet("/RemoveCursoOfertadoServlet")
public class RemoveCursoOfertadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoOfertadoRepository cursoOfertadoRepository;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveCursoOfertadoServlet() {
        super();
    	this.cursoOfertadoRepository = new CursoOfertadoRepository();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/cursoOfertado/rm_cursoOfertado.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		this.cursoOfertadoRepository.delete(id);
		
		response.sendRedirect("/home/cursoOfertado");
	}

}
