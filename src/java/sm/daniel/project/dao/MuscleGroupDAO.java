package sm.daniel.project.dao;

import java.util.List;

import sm.daniel.project.model.MuscleGroup;

public interface MuscleGroupDAO {
	
	public List<MuscleGroup> getMuscleGroups();
	public List<MuscleGroup> getMuscleGroupsWithExercises();
	public MuscleGroup getMuscleGroup(int id);
	// add ... 
	// delete ...
	// edit ..
}
