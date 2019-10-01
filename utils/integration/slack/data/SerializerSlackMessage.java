package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerSlackMessage{
	public static void toJson(java.io.PrintWriter _pw, SlackMessage objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"hidden\":", objeto.hidden);
		PrintWriterUtils.print(_pw, ",\"reply_count\":", objeto.reply_count);
		PrintWriterUtils.print(_pw, ",\"reply_users_count\":", objeto.reply_users_count);
		PrintWriterUtils.printJsonProp(_pw, false, "\"client_msg_id\":", objeto.client_msg_id);
		PrintWriterUtils.printJsonProp(_pw, false, "\"type\":", objeto.type);
		PrintWriterUtils.printJsonProp(_pw, false, "\"text\":", objeto.text);
		PrintWriterUtils.printJsonProp(_pw, false, "\"user\":", objeto.user);
		PrintWriterUtils.printJsonProp(_pw, false, "\"ts\":", objeto.ts);
		PrintWriterUtils.printJsonProp(_pw, false, "\"team\":", objeto.team);
		PrintWriterUtils.printJsonProp(_pw, false, "\"thread_ts\":", objeto.thread_ts);
		PrintWriterUtils.printJsonProp(_pw, false, "\"parent_user_id\":", objeto.parent_user_id);
		PrintWriterUtils.printJsonProp(_pw, false, "\"subtype\":", objeto.subtype);
		PrintWriterUtils.printJsonProp(_pw, false, "\"latest_reply\":", objeto.latest_reply);
		java.util.List<String> val13 = objeto.reply_users;
		if(val13 != null){
			_pw.print(",\"reply_users\":");
			jcrystal.JSONUtils.jsonQuoteString(_pw, val13);
		}
		java.util.List<integration.slack.data.SlackReplies> val14 = objeto.replies;
		if(val14 != null){
			_pw.print(",\"replies\":");
			SerializerSlackReplies.toJsonSlackReplies(_pw, val14);
		}
		_pw.print("}");
	}
	public static void toJsonSlackMessage(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<SlackMessage>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackMessage(java.io.PrintWriter _pw, java.lang.Iterable<SlackMessage> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackMessage(java.io.PrintWriter _pw, java.util.Map<Long, SlackMessage> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
