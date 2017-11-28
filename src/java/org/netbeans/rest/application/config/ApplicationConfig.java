/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Daniel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(sm.daniel.project.service.AuthenticationService.class);
        resources.add(sm.daniel.project.service.ExerciseService.class);
        resources.add(sm.daniel.project.service.MuscleGroupService.class);
        resources.add(sm.daniel.project.service.TestService.class);
        resources.add(sm.daniel.project.service.WorkoutService.class);
        resources.add(sm.daniel.project.ws.Notes.class);
    }
    
}
