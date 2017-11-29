/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sm.daniel.project.ws;

/**
 *
 * @author Daniel
 */
public enum Database {
	
    USER("User"),
    NOTE("Note"),
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
