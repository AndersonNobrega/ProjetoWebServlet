package org.ifpb.servlet.instituicao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.InstituicaoRepository;
import org.ifpb.model.Instituicao;

/**
 * Servlet implementation class CriarInstituicaoServlet
 */
@WebServlet("/instituicao/criar")
public class CriarInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final InstituicaoRepository instituicaoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarInstituicaoServlet() {
		super();
		this.instituicaoRepository = new InstituicaoRepository();
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//this.instituicaoRepository.findAll();
		for(Instituicao instituicao : this.instituicaoRepository.findAll()) {
			System.out.println(instituicao);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String reitor = request.getParameter("reitor");
		String cnpj = request.getParameter("cnpj");
		
		this.instituicaoRepository.create(new Instituicao(nome, reitor, cnpj));
	}

}
