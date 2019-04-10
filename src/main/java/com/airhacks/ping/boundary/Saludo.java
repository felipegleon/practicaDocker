package com.airhacks.ping.boundary;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author airhacks.com
 */
@Path("saludo")
public class Saludo {

    @GET
    public String saludar(@QueryParam("nombre") String nombre) {
        return "hola " + nombre;
    }

}
