package integration.slack.data;

import java.util.List;

import jcrystal.json.Jsonify;

@Jsonify
public class RepliesMessagesResponse {
	public List<SlackMessage> messages;
	public boolean has_more;

/* FROMJSON */
	public RepliesMessagesResponse(){
	}
	public RepliesMessagesResponse(org.json.JSONObject json)throws org.json.JSONException{
		{
			org.json.JSONArray $Arraymessages = json.optJSONArray("messages");
			if($Arraymessages != null){
				this.messages = integration.slack.data.SlackMessage.listFromJson($Arraymessages);
			}
		}
		this.has_more = json.optBoolean("has_more");
	}
	public static java.util.ArrayList<RepliesMessagesResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<RepliesMessagesResponse> ret = new java.util.ArrayList<RepliesMessagesResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new RepliesMessagesResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
