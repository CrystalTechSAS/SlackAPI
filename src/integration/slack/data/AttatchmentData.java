package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class AttatchmentData {
	public String text;
	public int id;
	public String fallback;

/* FROMJSON */
	public AttatchmentData(){
	}
	public AttatchmentData(org.json.JSONObject json)throws org.json.JSONException{
		this.text = json.has("text")&&!json.isNull("text")?json.getString("text"):null;
		this.id = json.optInt("id");
		this.fallback = json.has("fallback")&&!json.isNull("fallback")?json.getString("fallback"):null;
	}
	public static java.util.ArrayList<AttatchmentData> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<AttatchmentData> ret = new java.util.ArrayList<AttatchmentData>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new AttatchmentData(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
