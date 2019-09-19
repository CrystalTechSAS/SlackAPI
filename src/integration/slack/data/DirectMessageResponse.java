package integration.slack.data;


import jcrystal.json.Jsonify;

@Jsonify
public class DirectMessageResponse {
	public Channel channel;
	public boolean no_op;
	public boolean already_open;
/* FROMJSON */
	public DirectMessageResponse(){
	}
	public DirectMessageResponse(org.json.JSONObject json)throws org.json.JSONException{
		if(json.has("channel") && !json.isNull("channel")){
			this.channel = new integration.slack.data.Channel(json.optJSONObject("channel"));
		}
		this.no_op = json.optBoolean("no_op");
		this.already_open = json.optBoolean("already_open");
	}
	public static java.util.ArrayList<DirectMessageResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<DirectMessageResponse> ret = new java.util.ArrayList<DirectMessageResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new DirectMessageResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}

