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

/**
 * Servlet implementation class RemoveAluno
 */
@WebServlet("/aluno/remover")
public class RemoverAlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final AlunoRepository alunoRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverAlunoServlet() {
		super();
		this.alunoRepository = new AlunoRepository();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/turma/aluno/rm_aluno.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Aluno aluno = this.alunoRepository.findById(id).get(0);
		this.alunoRepository.delete(id);
		
		response.sendRedirect("/aluno?turmaId=" + aluno.getTurmaId());
	}

}
