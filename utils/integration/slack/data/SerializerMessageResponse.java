package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerMessageResponse{
	public static void toJson(java.io.PrintWriter _pw, MessageResponse objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"text\":", objeto.text);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"username\":", objeto.username);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"bot_id\":", objeto.bot_id);
		java.util.List<integration.slack.data.AttatchmentData> val3 = objeto.attachments;
		if(val3 != null){
			if(__first){
				_pw.print("\"attachments\":");
				SerializerAttatchmentData.toJsonAttatchmentData(_pw, val3);
				__first = false;
			}
			else{
				_pw.print(",\"attachments\":");
				SerializerAttatchmentData.toJsonAttatchmentData(_pw, val3);
			}
		}
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"type\":", objeto.type);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"subtype\":", objeto.subtype);
		_pw.print("}");
	}
	public static void toJsonMessageResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<MessageResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonMessageResponse(java.io.PrintWriter _pw, java.lang.Iterable<MessageResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonMessageResponse(java.io.PrintWriter _pw, java.util.Map<Long, MessageResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
