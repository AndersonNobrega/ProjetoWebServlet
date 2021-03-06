package org.ifpb.servlet.instituicao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.InstituicaoRepository;

/**
 * Servlet implementation class ListarInstituicaoServlet
 */
@WebServlet("/instituicao")
public class ListarInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final InstituicaoRepository instituicaoRepository;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarInstituicaoServlet() {
    	super();
    	this.instituicaoRepository = new InstituicaoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/instituicao/list_insti.jsp");

		request.setAttribute("instituicoes", this.instituicaoRepository.findAll());
		rd.forward(request, response);
	}

}
