package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class SlackReplies {
	public String user;
	public String ts;
	

/* FROMJSON */
	public SlackReplies(){
	}
	public SlackReplies(org.json.JSONObject json)throws org.json.JSONException{
		this.user = json.has("user")&&!json.isNull("user")?json.getString("user"):null;
		this.ts = json.has("ts")&&!json.isNull("ts")?json.getString("ts"):null;
	}
	public static java.util.ArrayList<SlackReplies> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<SlackReplies> ret = new java.util.ArrayList<SlackReplies>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new SlackReplies(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
