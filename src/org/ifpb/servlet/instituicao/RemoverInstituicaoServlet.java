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
 * Servlet implementation class RemoverInstituicaoServlet
 */
@WebServlet("/instituicao/remover")
public class RemoverInstituicaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final InstituicaoRepository instituicaoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverInstituicaoServlet() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		
		this.instituicaoRepository.delete(id);
	}

}
