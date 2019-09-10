package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class OauthResponse {

	public boolean ok;
	public SlackUser user;
	public SlackTeam team;
	
/* FROMJSON */
	public OauthResponse(){
	}
	public OauthResponse(org.json.JSONObject json)throws org.json.JSONException{
		this.ok = json.optBoolean("ok");
		if(json.has("user") && !json.isNull("user")){
			this.user = new integration.slack.data.SlackUser(json.optJSONObject("user"));
		}
		if(json.has("team") && !json.isNull("team")){
			this.team = new integration.slack.data.SlackTeam(json.optJSONObject("team"));
		}
	}
	public static java.util.ArrayList<OauthResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<OauthResponse> ret = new java.util.ArrayList<OauthResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new OauthResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
