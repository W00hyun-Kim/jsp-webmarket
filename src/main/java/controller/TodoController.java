package controller;

import java.io.IOException;

import dao.TodoRepository;
import dto.Todo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//톰캣에 컨트롤러의 존재를 노출
@WebServlet(name = "TodoController", urlPatterns = {"/addTodo.do", "/toggleTodo.do", "/removeTodo.do"})

public class TodoController extends HttpServlet{
	private static final long serialVersionUID = -5789298759459019056L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//요청 주소 (processAddTodo.jsp....==> processAddTodo.do)
		String command = req.getRequestURI().substring(req.getContextPath().length());
		TodoRepository repository = TodoRepository.getInstance();

		//processAddtodo.jsp의 역할을 아래서 진행
		if(command.equals("/addTodo.do")) {
			String task = req.getParameter("task");			
			Todo todo = new Todo(task);						
			repository.addTodo(todo);
			
			
		} else if(command.equals("/toggleTodo.do")) {
			long id = Long.parseLong(req.getParameter("id"));			
			repository.toggle(id);
			
			
		} else if(command.equals("/removeTodo.do")) {
			long id = Long.parseLong(req.getParameter("id"));			
			repository.remove(id);
		}
		
		//리다이렉트하면서 주소창에는 노출을 안함.
		req.getRequestDispatcher("todolist.jsp").forward(req, resp);
	}
}
