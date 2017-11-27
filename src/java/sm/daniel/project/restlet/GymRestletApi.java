package sm.daniel.project.restlet;

import sm.daniel.project.restlet.resources.MuscleGroupServerResource;
import sm.daniel.project.restlet.resources.WorkoutServerResource;
import sm.daniel.project.restlet.resources.WorkoutsServerResource;
import sm.daniel.project.restlet.resources.MuscleGroupsServerResource;
import sm.daniel.project.restlet.resources.ExerciseServerResource;
import sm.daniel.project.restlet.resources.ExercisesServerResource;
import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import sm.daniel.project.restlet.filters.CustomHeaders;

public class GymRestletApi extends Application {

	@Override
	public Restlet createInboundRoot() {
		
		CustomHeaders headers = new CustomHeaders(this.getContext());
		
		Router router = new Router(this.getContext());

		router.attach("/users", MuscleGroupsServerResource.class);
		router.attach("/users/{id}", MuscleGroupsServerResource.class);

		router.attach("/workouts", WorkoutsServerResource.class);
		router.attach("/workouts/", WorkoutsServerResource.class);
		router.attach("/workouts/{id}", WorkoutServerResource.class);
		router.attach("/workouts/{id}/", WorkoutServerResource.class);
		
		router.attach("/groups", MuscleGroupsServerResource.class);
		router.attach("/groups/", MuscleGroupsServerResource.class);
		router.attach("/groups/{id}", MuscleGroupServerResource.class);
		router.attach("/groups/{id}/", MuscleGroupServerResource.class);

		router.attach("/exercices", ExercisesServerResource.class);
		router.attach("/exercises/", ExercisesServerResource.class);
		router.attach("/exercises/{id}", ExerciseServerResource.class);
		router.attach("/exercises/{id}/", ExerciseServerResource.class);
		
		headers.setNext(router);

		return headers;
	}
}
