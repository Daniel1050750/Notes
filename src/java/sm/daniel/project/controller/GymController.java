package sm.daniel.project.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import sm.daniel.project.dao.FactoryGym;
import sm.daniel.project.dao.WorkoutDAO;
import sm.daniel.project.model.Workout;

/**
 * Servlet implementation class GymController
 * http://www.java-only.com/LoadTutorial.javaonly?id=13
 */
//@WebServlet("/GymController")
public class GymController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	@Resource(name = "jdbc/gymlogger")
	private DataSource datasource;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GymController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//testMethod01(request, response);
		//testMethod02(request, response);
		createWorkout(request, response);
		
	}
	
	private void createWorkout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String view = "jsp/create.jsp";
		this.dispatch(request, response, view);
	}
	
	protected void testMethod01(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// gather parameter specific information
		// RequestHelper helper = new RequestHelper(request);
		// Command cmdHelper = helper.getCommand();
		// page = cmdHelper.execute(request,response);
		
		String url = request.getRequestURL().substring(request.getRequestURL().lastIndexOf("/") + 1, request.getRequestURL().length());
		String controller = url.substring( 0 , url.indexOf("."));
		String action = request.getParameter("action");
		String view = "jsp/list.jsp";
		this.dispatch(request, response, view);
	
		// Action action = ActionFactory.getAction(request);
	}

	protected void testMethod02(HttpServletRequest request, HttpServletResponse response) {
		
		WorkoutDAO workoutDAO = FactoryGym.getWorkoutDAO(FactoryGym.STORAGE_TYPE.MYSQL_JDBC);
		List<Workout> workouts = workoutDAO.getWorkoutsWithRepetitions();

		String view = "jsp/listExercice.jsp";

		try {
			this.dispatch(request, response, view);
		}
		catch (Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	
	protected void dispatch(HttpServletRequest request, HttpServletResponse response, String page) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}