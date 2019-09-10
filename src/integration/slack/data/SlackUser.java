package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class SlackUser {
	public String id;
	public String name;
	
/* FROMJSON */
	public SlackUser(){
	}
	public SlackUser(org.json.JSONObject json)throws org.json.JSONException{
		this.id = json.has("id")&&!json.isNull("id")?json.getString("id"):null;
		this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
	}
	public static java.util.ArrayList<SlackUser> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<SlackUser> ret = new java.util.ArrayList<SlackUser>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new SlackUser(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
