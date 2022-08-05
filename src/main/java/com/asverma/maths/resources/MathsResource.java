package com.asverma.maths.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MathsResource {

    @GET
    @Path("/students")
    public Response getAll() {
        return Response.status(Response.Status.OK)
                .entity("test")
                .build();
    }

    @POST
    @Path("/pos")
    public Response getAllP(
            List<String> myList
    ) {
        int n = 9;
        return Response.status(Response.Status.OK)
                .entity(myList)
                .build();
    }

}
