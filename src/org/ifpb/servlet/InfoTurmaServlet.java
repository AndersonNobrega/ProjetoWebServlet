package org.ifpb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ifpb.database.repository.TurmaRepository;
import org.ifpb.model.Turma;

/**
 * Servlet implementation class InfoTurmaServlet
 */
@WebServlet("/turma/info")
public class InfoTurmaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final TurmaRepository turmaRepository;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InfoTurmaServlet() {
    	super();
    	this.turmaRepository = new TurmaRepository();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
	
		RequestDispatcher rd = request.getRequestDispatcher("/turma/turma.jsp");
		
		//int vagas = this.turmaRepository.findById(id).get(0).getVagas();
		
		request.setAttribute("id", id );
		
		rd.forward(request, response);
	
	
	}

}
