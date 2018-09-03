package com.afkghouri;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

//https://www.youtube.com/watch?v=5jQSat1cKMo

@Path("/test")
public class Hello {

	    @GET
		@Path("/hello/{msg}")
		public String sayHello(@PathParam(value="msg") String msg){
			return "Hello "+msg;
		}
	    
	    // url: http://localhost:8080/test/hello/world
}
