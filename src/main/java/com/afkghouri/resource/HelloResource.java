package com.afkghouri.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//https://www.journaldev.com/9191/java-web-services-tutorial
//https://www.youtube.com/watch?v=5jQSat1cKMo

//  maven project
// run as: maven build
@Path("/test")
public class HelloResource {

	    @GET
		@Path("/hello/{msg}")
	    @Produces("text/plain")
		public String sayHello(@PathParam(value="msg") String msg){
			return "Hello "+msg;
		}
	    
	    @GET
	    @Produces("text/plain")
		public String sayIt(){
			return "Hello";
		}
	    
	    // url: http://localhost:8080/test/hello/world
}
