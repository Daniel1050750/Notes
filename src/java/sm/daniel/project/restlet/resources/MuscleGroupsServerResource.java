package sm.daniel.project.restlet.resources;

import java.util.List;

import org.restlet.data.Status;
import org.restlet.ext.jackson.JacksonRepresentation;
import org.restlet.representation.EmptyRepresentation;
import org.restlet.representation.Representation;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import sm.daniel.project.dao.FactoryGym;
import sm.daniel.project.dao.MuscleGroupDAO;
import sm.daniel.project.model.MuscleGroup;

public class MuscleGroupsServerResource extends ServerResource {
	
	private MuscleGroupDAO groupDAO = FactoryGym.getMuscleGroupDAO( FactoryGym.STORAGE_TYPE.MYSQL_JDBC );
	
	@Override
	protected void doInit() throws ResourceException { }
	
	@Get
	public Representation retrieve() {

		Representation rep = new EmptyRepresentation();
		Status status = null;
		List<MuscleGroup> group; 
		
		try {

			group = groupDAO.getMuscleGroupsWithExercises();
			rep = new JacksonRepresentation<List<MuscleGroup>>(group); 
			status = Status.SUCCESS_OK;

		} catch (Exception e) {
			e.printStackTrace();
			throw new ResourceException(Status.SERVER_ERROR_INTERNAL,e.getMessage());
		}

		this.getResponse().setStatus(status);
		return rep;
	}
}
