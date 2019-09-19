package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerChatResponse{
	public static void toJson(java.io.PrintWriter _pw, ChatResponse objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"channel\":", objeto.channel);
		integration.slack.data.MessageResponse val1 = objeto.message;
		if(val1 != null){
			if(__first){
				_pw.print("\"message\":");
				SerializerMessageResponse.toJson(_pw, val1);
				__first = false;
			}
			else{
				_pw.print(",\"message\":");
				SerializerMessageResponse.toJson(_pw, val1);
			}
		}
		_pw.print("}");
	}
	public static void toJsonChatResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<ChatResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonChatResponse(java.io.PrintWriter _pw, java.lang.Iterable<ChatResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonChatResponse(java.io.PrintWriter _pw, java.util.Map<Long, ChatResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
