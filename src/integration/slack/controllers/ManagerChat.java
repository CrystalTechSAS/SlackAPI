package integration.slack.controllers;

import integration.slack.data.ChatResponse;
import integration.slack.data.PermalinkResponse;
import jcrystal.clients.ClientSlackapi;
import jcrystal.reflection.annotations.Path;
import jcrystal.service.types.Authorization;

@ClientSlackapi
public class ManagerChat {
	
	@Path("/chat.postMessage")
	public static ChatResponse postMessage(String token, String channel, String text, boolean as_user, String attachments) {
		return null;
	}
	
	@Path("/chat.getPermalink")
	public static PermalinkResponse getPermalink(Authorization token, String channel, String message_ts) {
		return null;
	}
}
