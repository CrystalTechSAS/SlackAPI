package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class Channel {
	public String id;
	public boolean is_im;
	public boolean is_org_shared;
	public String user;
	public int unread_count;
	public int unread_count_display;
	public boolean is_open;
	public int priority;

/* FROMJSON */
	public Channel(){
	}
	public Channel(org.json.JSONObject json)throws org.json.JSONException{
		this.id = json.has("id")&&!json.isNull("id")?json.getString("id"):null;
		this.is_im = json.optBoolean("is_im");
		this.is_org_shared = json.optBoolean("is_org_shared");
		this.user = json.has("user")&&!json.isNull("user")?json.getString("user"):null;
		this.unread_count = json.optInt("unread_count");
		this.unread_count_display = json.optInt("unread_count_display");
		this.is_open = json.optBoolean("is_open");
		this.priority = json.optInt("priority");
	}
	public static java.util.ArrayList<Channel> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<Channel> ret = new java.util.ArrayList<Channel>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new Channel(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
