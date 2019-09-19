package integration.slack.data;

import jcrystal.json.Jsonify;

@Jsonify
public class MetadataResponse {
	
	public String next_cursor;

/* FROMJSON */
	public MetadataResponse(){
	}
	public MetadataResponse(org.json.JSONObject json)throws org.json.JSONException{
		this.next_cursor = json.has("next_cursor")&&!json.isNull("next_cursor")?json.getString("next_cursor"):null;
	}
	public static java.util.ArrayList<MetadataResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<MetadataResponse> ret = new java.util.ArrayList<MetadataResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new MetadataResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
