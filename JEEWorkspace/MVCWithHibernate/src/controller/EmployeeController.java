package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Employee;
import service.EmployeeService;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		EmployeeService es = new EmployeeService();
		List<Employee> listOfRec= es.getEmployeeInfo();
pw.println("Number of Records are "+listOfRec.size());
//RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	
PrintWriter pw = response.getWriter();
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
float salary = Float.parseFloat(request.getParameter("salary"));

Employee emp = new Employee();
emp.setId(id);emp.setName(name);emp.setSalary(salary);

EmployeeService es = new EmployeeService();
String res = es.storeEmployeeDetails(emp);
pw.println(res);
		
RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
rd.include(request, response);

doGet(request, response);
	}

}

