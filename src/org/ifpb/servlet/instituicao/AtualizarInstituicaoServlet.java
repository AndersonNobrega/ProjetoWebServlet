package org.ifpb.servlet.instituicao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.InstituicaoRepository;
import org.ifpb.model.Instituicao;

/**
 * Servlet implementation class AtualizarInstituicaoServlet
 */
@WebServlet("/instituicao/atualizar")
public class AtualizarInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final InstituicaoRepository instituicaoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AtualizarInstituicaoServlet() {
        super();
        this.instituicaoRepository = new InstituicaoRepository();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/home/instituicao/att_insti.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String nome = request.getParameter("nome");
		String reitor = request.getParameter("reitor");
		String cnpj = request.getParameter("cnpj");
		
		this.instituicaoRepository.update(id, new Instituicao(nome, reitor, cnpj));
		
		response.sendRedirect("/home/instituicao");
	}

}
