package com.dev.jeemonitoring;

import com.airhacks.interceptor.monitoring.boundary.PerformanceSensor;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Stateless
@Path("endpoint")
@Interceptors(PerformanceSensor.class)
public class FacadeREST{

    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public List<Model> get() {
        List<Model> results = new ArrayList();
        results.add(new Model("a", "b"));
        results.add(new Model("a", "b"));
        results.add(new Model("a", "b"));
        results.add(new Model("a", "b"));
        return results;        
    }

    
}
