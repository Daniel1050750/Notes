package sm.daniel.project.ws;

import java.util.Collection;
import java.util.List;

public interface NotesDAO {
	
    public static final String SQL_QUERY_GET_ALL_NOTES = "SELECT id,name FROM " + Database.EXERCISE.getTableName() + ";";

    public static final String SQL_QUERY_GET_BY_ID =  "SELECT id,name FROM " + Database.EXERCISE.getTableName() + " WHERE id = ?;";

    public static final String SQL_QUERY_GET_BY_MUSCLEGROUPID =  "SELECT id,name FROM " + Database.EXERCISE.getTableName() + " WHERE id_musclegroup = ?;";

    public Collection<Notes> listAllNotes();
    public Notes getExerciceById(int id);
    public Collection<Notes> getExercicesByMuscleGroupId(int id);
    //public Collection<MuscleGroup> listAllMuscleGroups();
}
