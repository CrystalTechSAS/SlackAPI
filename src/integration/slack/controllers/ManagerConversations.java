package integration.slack.controllers;

import integration.slack.data.DirectMessageResponse;
import integration.slack.data.MemberConversationResponse;
import integration.slack.data.OpenConversationArguments;
import integration.slack.data.RepliesMessagesResponse;
import jcrystal.clients.ClientSlackapi;
import jcrystal.reflection.TipoRuta;
import jcrystal.reflection.annotations.FormData;
import jcrystal.reflection.annotations.Path;
import jcrystal.reflection.annotations.PathMethod;
import jcrystal.service.types.Authorization;

@ClientSlackapi
public class ManagerConversations {
	
	@Path("/conversations.members")
	@PathMethod(TipoRuta.GET)
	public static MemberConversationResponse members(String token, String channel) {
		return null;
	}
	
	@Path("/conversations.open")
	@PathMethod(TipoRuta.POST)
	public static DirectMessageResponse open(Authorization token, OpenConversationArguments body) {
		return null;
	}
	
	@Path("/conversations.replies")
	@PathMethod(TipoRuta.GET)
	public static RepliesMessagesResponse replies(String token, String channel, String ts) {
		return null;
	}

}
