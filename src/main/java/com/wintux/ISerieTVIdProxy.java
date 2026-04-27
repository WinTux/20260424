package com.wintux;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@Path("/shows")
public interface ISerieTVIdProxy {
    @GET
    @Path("/{id}")
    SerieTV getSeriesTVbyId(@PathParam("id") int id);
}
