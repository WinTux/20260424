package com.wintux;

import java.util.List;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.json.JsonArray;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;

@Path("/serietv") // http://localhost:8080/serie-tv-api/serietv
public class SerieTVResource {
    @RestClient
    ISerieTVIdProxy proxy;
    @RestClient
    ISerieTVPersonaProxy proxyPersona;
    @GET// http://localhost:8080/serie-tv-api/serietv/1
    @Path("/{id}")
    public SerieTV getSerieTVbyId(@PathParam("id") int id) {
        return proxy.getSeriesTVbyId(id);
    }
    @GET// http://localhost:8080/serie-tv-api/serietv/persona
    @Path("/persona/{nombre}")
    public JsonArray getSerieTVbyPersona(@PathParam("nombre") String nombrePersona) {
        return proxyPersona.getSeriesTVbyPersona(nombrePersona);
    }
}
