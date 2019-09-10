package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class SlackTeam {
	String id;
	String name;
	String domain;
	
/* FROMJSON */
	public SlackTeam(){
	}
	public SlackTeam(org.json.JSONObject json)throws org.json.JSONException{
		this.id = json.has("id")&&!json.isNull("id")?json.getString("id"):null;
		this.name = json.has("name")&&!json.isNull("name")?json.getString("name"):null;
		this.domain = json.has("domain")&&!json.isNull("domain")?json.getString("domain"):null;
	}
	public static java.util.ArrayList<SlackTeam> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<SlackTeam> ret = new java.util.ArrayList<SlackTeam>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new SlackTeam(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
