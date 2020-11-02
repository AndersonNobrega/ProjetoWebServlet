package org.ifpb.servlet.aluno;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.ifpb.database.repository.AlunoRepository;

/**
 * Servlet implementation class ListaAlunosServlet
 */
@WebServlet("/aluno")
public class ListarAlunosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AlunoRepository alunoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAlunosServlet() {
        super();
    	this.alunoRepository = new AlunoRepository();	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/turma/aluno/list_aluno.jsp");
	
		request.setAttribute("instituicoes", this.alunoRepository.findAll());
		rd.forward(request, response);
	}
}
