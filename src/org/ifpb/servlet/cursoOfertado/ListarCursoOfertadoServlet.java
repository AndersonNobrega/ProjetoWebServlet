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
 * Servlet implementation class ListarCursoOfertadoServlet
 */
@WebServlet("/cursoOfertado")
public class ListarCursoOfertadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final CursoOfertadoRepository cursoOfertadoRepository;

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCursoOfertadoServlet() {
        super();
    	this.cursoOfertadoRepository = new CursoOfertadoRepository();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/instituicao/cursoOfertado/list_cursoOfertado.jsp");

		request.setAttribute("cursos", this.cursoOfertadoRepository.findAll());
		rd.forward(request, response);
	}


}
