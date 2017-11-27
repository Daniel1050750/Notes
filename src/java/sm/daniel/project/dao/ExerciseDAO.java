package sm.daniel.project.dao;

import sm.daniel.project.model.MuscleGroup;
import sm.daniel.project.model.Exercise;
import java.util.Collection;
import java.util.List;

import sm.daniel.project.constants.Database;

public interface ExerciseDAO {
	
	public static final String SQL_QUERY_GET_ALL_EXERCICES = 
		"SELECT id,name FROM " + Database.EXERCISE.getTableName() + ";";

	public static final String SQL_QUERY_GET_BY_ID = 
		"SELECT id,name FROM " + Database.EXERCISE.getTableName() + " WHERE id = ?;";

	public static final String SQL_QUERY_GET_BY_MUSCLEGROUPID = 
		"SELECT id,name FROM " + Database.EXERCISE.getTableName() + " WHERE id_musclegroup = ?;";


	public Collection<Exercise> listAllExercices();
	public Exercise getExerciceById(int id);
	public Collection<Exercise> getExercicesByMuscleGroupId(int id);
	public Collection<MuscleGroup> listAllMuscleGroups();
}
