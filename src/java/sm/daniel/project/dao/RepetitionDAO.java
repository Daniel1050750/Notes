package sm.daniel.project.dao;

import java.util.List;

import sm.daniel.project.model.Repetition;
import sm.daniel.project.model.Workout;

public interface RepetitionDAO {
	
	public List<Repetition> getRepetitions();
	public List<Repetition> getRepetitions(Workout workout);

}
