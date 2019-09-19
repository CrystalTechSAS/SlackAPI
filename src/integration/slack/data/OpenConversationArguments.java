package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class OpenConversationArguments {
	public String channel;
	public String users;

/* FROMJSON */
	public OpenConversationArguments(){
	}
	public OpenConversationArguments(org.json.JSONObject json)throws org.json.JSONException{
		this.channel = json.has("channel")&&!json.isNull("channel")?json.getString("channel"):null;
		this.users = json.has("users")&&!json.isNull("users")?json.getString("users"):null;
	}
	public static java.util.ArrayList<OpenConversationArguments> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<OpenConversationArguments> ret = new java.util.ArrayList<OpenConversationArguments>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new OpenConversationArguments(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
