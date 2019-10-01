package integration.slack.data;

import java.util.List;

import jcrystal.json.Jsonify;

@Jsonify
public class ChatResponse {
	public String channel;
	public String ts;
	public MessageResponse message;
		

/* FROMJSON */
	public ChatResponse(){
	}
	public ChatResponse(org.json.JSONObject json)throws org.json.JSONException{
		this.channel = json.has("channel")&&!json.isNull("channel")?json.getString("channel"):null;
		this.ts = json.has("ts")&&!json.isNull("ts")?json.getString("ts"):null;
		if(json.has("message") && !json.isNull("message")){
			this.message = new integration.slack.data.MessageResponse(json.optJSONObject("message"));
		}
	}
	public static java.util.ArrayList<ChatResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<ChatResponse> ret = new java.util.ArrayList<ChatResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new ChatResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
