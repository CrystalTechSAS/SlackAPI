package integration.slack.controllers;

import integration.slack.data.OauthResponse;
import jcrystal.clients.ClientSlackapi;
import jcrystal.entity.types.LongText;
import jcrystal.reflection.annotations.FormData;
import jcrystal.reflection.annotations.Path;
import jcrystal.reflection.annotations.Post;
import jcrystal.service.types.Authorization;

@ClientSlackapi
public class ManagerOauth {

	@Path("/oauth.access")
	@FormData
	public static OauthResponse access(LongText client_id, LongText client_secret, LongText redirect_uri, LongText code) {
		return null;
	}
}
