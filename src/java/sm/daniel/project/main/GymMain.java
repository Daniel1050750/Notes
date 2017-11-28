package sm.daniel.project.main;

import java.sql.SQLException;
import java.util.Collection;

import sm.daniel.project.ws.ConnectionFactory;
import sm.daniel.project.dao.ExerciseDAO;
import sm.daniel.project.dao.FactoryGym;
import sm.daniel.project.dao.jcabi.Exercises;
import sm.daniel.project.dao.jcabi.MySqlExercises;
import sm.daniel.project.model.Exercise;


public class GymMain {
	
	public static void main(String[] args) {
		
		//muscleGroup();
		textNoORM();
	}

	public static void textNoORM() {

		try {
			ConnectionFactory.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Exercises exercises = new MySqlExercises(ConnectionFactory.getDataSource());
		
		for (sm.daniel.project.dao.jcabi.Exercise exercise : exercises.iterate()) {
			System.out.println(exercise.name());
		}
	}
	
	private static void muscleGroup() {
		
		ExerciseDAO exerciseDAO = FactoryGym.getExerciseDAO(FactoryGym.STORAGE_TYPE.MYSQL_JCABI);
		
		Collection<Exercise> exercises = exerciseDAO.getExercicesByMuscleGroupId(2);
		
//		for (Exercise exercise : exercises) {
//			System.out.println(exercise);
//		}

		Exercise exercise = exerciseDAO.getExerciceById(102);
		System.out.println(exercise);
	
	}
}
