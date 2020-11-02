package org.ifpb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.InstituicaoRepository;

/**
 * Servlet implementation class InfoInstituicaoServlet
 */
@WebServlet("/instituicao/info")
public class InfoInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final InstituicaoRepository instituicaoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoInstituicaoServlet() {
        super();
        this.instituicaoRepository = new InstituicaoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		RequestDispatcher rd = request.getRequestDispatcher("/instituicao/instituicao.jsp");
		
		request.setAttribute("nome", this.instituicaoRepository.findById(id).get(0).getNome());
		rd.forward(request, response);
	}

}
