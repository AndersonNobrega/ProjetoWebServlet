package org.ifpb.servlet.aluno;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.AlunoRepository;
import org.ifpb.model.Aluno;


@WebServlet("/aluno/criar")
public class CriarAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final AlunoRepository alunoRepository;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CriarAlunoServlet() {
    	super();
    	this.alunoRepository = new AlunoRepository();	
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/turma/aluno/cad_aluno.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String rg = request.getParameter("rg");
		String cpf = request.getParameter("cpf");
		int turmaId = Integer.parseInt(request.getParameter("turmaId"));
		
		this.alunoRepository.create(new Aluno(nome, rg, cpf, turmaId));
		
		response.sendRedirect("/aluno?turmaId=" + turmaId);
		
	}

}
