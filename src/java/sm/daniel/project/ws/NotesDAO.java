/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.daniel.project.ws;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author Daniel
 */
public interface NotesDAO {
	
    public static final String SQL_QUERY_GET_ALL_NOTES = "SELECT id,name FROM " + Database.EXERCISE.getTableName() + ";";

    public static final String SQL_QUERY_GET_BY_ID =  "SELECT id,name FROM " + Database.EXERCISE.getTableName() + " WHERE id = ?;";

    public static final String SQL_QUERY_GET_BY_MUSCLEGROUPID =  "SELECT id,name FROM " + Database.EXERCISE.getTableName() + " WHERE id_musclegroup = ?;";

    public Collection<Notes> listAllNotes();
    public Notes getExerciceById(int id);
    public Collection<Notes> getExercicesByMuscleGroupId(int id);
    //public Collection<MuscleGroup> listAllMuscleGroups();
}
