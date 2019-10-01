package integration.slack.data;

import java.util.List;

import jcrystal.json.Jsonify;

@Jsonify
public class SlackMessage {
	public String client_msg_id;
	public String type;
	public String text;
	public String user;
	public String ts;
	public String team;
	public String thread_ts;
	public String parent_user_id;
	
	public String subtype;
	public boolean hidden;
	public int reply_count;
	public int reply_users_count;
	public String latest_reply;
	public List<String> reply_users;
	public List<SlackReplies> replies;
	
/* FROMJSON */
	public SlackMessage(){
	}
	public SlackMessage(org.json.JSONObject json)throws org.json.JSONException{
		this.client_msg_id = json.has("client_msg_id")&&!json.isNull("client_msg_id")?json.getString("client_msg_id"):null;
		this.type = json.has("type")&&!json.isNull("type")?json.getString("type"):null;
		this.text = json.has("text")&&!json.isNull("text")?json.getString("text"):null;
		this.user = json.has("user")&&!json.isNull("user")?json.getString("user"):null;
		this.ts = json.has("ts")&&!json.isNull("ts")?json.getString("ts"):null;
		this.team = json.has("team")&&!json.isNull("team")?json.getString("team"):null;
		this.thread_ts = json.has("thread_ts")&&!json.isNull("thread_ts")?json.getString("thread_ts"):null;
		this.parent_user_id = json.has("parent_user_id")&&!json.isNull("parent_user_id")?json.getString("parent_user_id"):null;
		this.subtype = json.has("subtype")&&!json.isNull("subtype")?json.getString("subtype"):null;
		this.hidden = json.optBoolean("hidden");
		this.reply_count = json.optInt("reply_count");
		this.reply_users_count = json.optInt("reply_users_count");
		this.latest_reply = json.has("latest_reply")&&!json.isNull("latest_reply")?json.getString("latest_reply"):null;
		{
			org.json.JSONArray $Arrayreply_users = json.optJSONArray("reply_users");
			if($Arrayreply_users != null){
				this.reply_users = new java.util.ArrayList<>();
				for(int i = 0; i < $Arrayreply_users.length(); i++){
					this.reply_users.add($Arrayreply_users.getString(i));
				}
			}
		}
		{
			org.json.JSONArray $Arrayreplies = json.optJSONArray("replies");
			if($Arrayreplies != null){
				this.replies = integration.slack.data.SlackReplies.listFromJson($Arrayreplies);
			}
		}
	}
	public static java.util.ArrayList<SlackMessage> listFromJson(org.json.JSONArray json)throws org.json.JSONException{
		java.util.ArrayList<SlackMessage> ret = new java.util.ArrayList<SlackMessage>(json.length());
		for(int e = 0, i = json.length(); e < i; e++){
			ret.add(new SlackMessage(json.getJSONObject(e)));
		}
		return ret;
	}
/* END */
}
