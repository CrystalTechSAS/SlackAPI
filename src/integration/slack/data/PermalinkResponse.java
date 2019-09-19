package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class PermalinkResponse {
	public String permalink;
	public String channel;

/* FROMJSON */
	public PermalinkResponse(){
	}
	public PermalinkResponse(org.json.JSONObject json)throws org.json.JSONException{
		this.permalink = json.has("permalink")&&!json.isNull("permalink")?json.getString("permalink"):null;
		this.channel = json.has("channel")&&!json.isNull("channel")?json.getString("channel"):null;
	}
	public static java.util.ArrayList<PermalinkResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<PermalinkResponse> ret = new java.util.ArrayList<PermalinkResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new PermalinkResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
