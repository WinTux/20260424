package com.wintux;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.json.JsonArray;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.QueryParam;

@RegisterRestClient(baseUri = "https://api.tvmaze.com")
@Path("/search")
public interface ISerieTVPersonaProxy {
    @GET
    @Path("/people")
    JsonArray getSeriesTVbyPersona(@QueryParam("q") String nombrePersona);
}
