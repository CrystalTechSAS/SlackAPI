package integration.slack.data;

import java.util.List;

import jcrystal.json.Jsonify;

@Jsonify
public class MemberConversationResponse {
	public boolean ok;
	public List<String> members;
	public MetadataResponse response_metadata;
	public String error;
/* FROMJSON */
	public MemberConversationResponse(){
	}
	public MemberConversationResponse(org.json.JSONObject json)throws org.json.JSONException{
		this.ok = json.optBoolean("ok");
		{
			org.json.JSONArray $Arraymembers = json.optJSONArray("members");
			if($Arraymembers != null){
				this.members = new java.util.ArrayList<>();
				for(int i = 0; i < $Arraymembers.length(); i++){
					this.members.add($Arraymembers.getString(i));
				}
			}
		}
		if(json.has("response_metadata") && !json.isNull("response_metadata")){
			this.response_metadata = new integration.slack.data.MetadataResponse(json.optJSONObject("response_metadata"));
		}
		this.error = json.has("error")&&!json.isNull("error")?json.getString("error"):null;
	}
	public static java.util.ArrayList<MemberConversationResponse> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<MemberConversationResponse> ret = new java.util.ArrayList<MemberConversationResponse>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new MemberConversationResponse(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
