package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerRepliesMessagesResponse{
	public static void toJson(java.io.PrintWriter _pw, RepliesMessagesResponse objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"has_more\":", objeto.has_more);
		java.util.List<integration.slack.data.SlackMessage> val1 = objeto.messages;
		if(val1 != null){
			_pw.print(",\"messages\":");
			SerializerSlackMessage.toJsonSlackMessage(_pw, val1);
		}
		_pw.print("}");
	}
	public static void toJsonRepliesMessagesResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<RepliesMessagesResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonRepliesMessagesResponse(java.io.PrintWriter _pw, java.lang.Iterable<RepliesMessagesResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonRepliesMessagesResponse(java.io.PrintWriter _pw, java.util.Map<Long, RepliesMessagesResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
