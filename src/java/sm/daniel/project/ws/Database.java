package sm.daniel.project.ws;


import sm.daniel.project.model.Exercise;
import sm.daniel.project.model.User;

public enum Database {
	
	USER("User"),
	cenas(Exercise.class.getClass().getSimpleName()),
	WORKOUT("Workout"),
	REPETITION("Repetition"),
	EXERCISE("Exercise"),
	MUSCLEGROUP("MuscleGroup");
	
	private String table;
	
	Database(String table) {
		this.table = table;
	}
	
	public String getTableName() {
		return this.table;
	}
	
	public static void main(String[] args) {
		System.out.println(User.class.getSimpleName());
	}
}
