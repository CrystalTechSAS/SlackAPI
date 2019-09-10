package integration.slack.controllers;

import jcrystal.clients.ClientSlackapi;
import jcrystal.reflection.annotations.Path;
import jcrystal.reflection.annotations.ws.HeaderParam;
import jcrystal.service.types.Authorization;

@ClientSlackapi
public class ManagerUsers {

	@Path("/user.identity")
	public static void identity(Authorization authorization) {
		
	}
}
