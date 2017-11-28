package sm.daniel.project.ws;

public enum Database {
	
	USER("User"),
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
		//System.out.println(User.class.getSimpleName());
	}
}
