package sm.daniel.project.dao;

import sm.daniel.project.dao.jdbc.ExerciseDAOJDBC;
import sm.daniel.project.dao.jdbc.MuscleGroupDAOJDBC;
import sm.daniel.project.dao.jdbc.RepetitionDAOJDBC;
import sm.daniel.project.dao.jdbc.WorkoutDAOJDBC;

public class MysqlJdbcDAO extends FactoryGym {

	@Override
	public MuscleGroupDAO getMuscleGroupDAO() {
		return new MuscleGroupDAOJDBC();
	}

	@Override
	public WorkoutDAO getWorkoutDAO() {
		return new WorkoutDAOJDBC();
	}

	@Override
	public RepetitionDAO getRepetitionDAO() {
		return new RepetitionDAOJDBC();
	}

	@Override
	public ExerciseDAO getExerciseDAO() {
		return new ExerciseDAOJDBC();
	}
}
