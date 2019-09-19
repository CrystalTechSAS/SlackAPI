package integration.slack.data;

import java.util.List;

import jcrystal.json.Jsonify;

@Jsonify
public class MessageResponse {
	public String text;
	public String username;
	public String bot_id;
	public List<AttatchmentData> attachments;
	public String type;
	public String subtype;



/* FROMJSON */
	public MessageResponse(){
	}
	public MessageResponse(org.json.JSONObject json)throws org.json.JSONException{
		this.text = json.has("text")&&!json.isNull("text")?json.getString("text"):null;
		this.username = json.has("username")&&!json.isNull("username")?json.getString("username"):null;
		this.bot_id = json.has("bot_id")&&!json.isNull("bot_id")?json.getString("bot_id"):null;
		{
			org.json.JSONArray $Arrayattachments = json.optJSONArray("attachments");
			if($Arrayattachments != null){
				this.attachments = integration.slack.data.AttatchmentData.listFromJson($Arrayattachments);
			}
		}
		this.type = json.has("type")&&!json.isNull("type")?json.getString("type"):null;
		this.subtype = json.has("subtype")&&!json.isNull("subtype")?json.getString("subtype"):null;
	}
	public static java.util.ArrayList<MessageResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<MessageResponse> ret = new java.util.ArrayList<MessageResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new MessageResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
