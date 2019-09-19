package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerMemberConversationResponse{
	public static void toJson(java.io.PrintWriter _pw, MemberConversationResponse objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"ok\":", objeto.ok);
		java.util.List<String> val1 = objeto.members;
		if(val1 != null){
			_pw.print(",\"members\":");
			jcrystal.JSONUtils.jsonQuoteString(_pw, val1);
		}
		integration.slack.data.MetadataResponse val2 = objeto.response_metadata;
		if(val2 != null){
			_pw.print(",\"response_metadata\":");
			SerializerMetadataResponse.toJson(_pw, val2);
		}
		PrintWriterUtils.printJsonProp(_pw, false, "\"error\":", objeto.error);
		_pw.print("}");
	}
	public static void toJsonMemberConversationResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<MemberConversationResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonMemberConversationResponse(java.io.PrintWriter _pw, java.lang.Iterable<MemberConversationResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonMemberConversationResponse(java.io.PrintWriter _pw, java.util.Map<Long, MemberConversationResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
