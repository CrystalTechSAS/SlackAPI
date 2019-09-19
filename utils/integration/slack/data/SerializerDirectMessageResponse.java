package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerDirectMessageResponse{
	public static void toJson(java.io.PrintWriter _pw, DirectMessageResponse objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"no_op\":", objeto.no_op);
		PrintWriterUtils.print(_pw, ",\"already_open\":", objeto.already_open);
		integration.slack.data.Channel val2 = objeto.channel;
		if(val2 != null){
			_pw.print(",\"channel\":");
			SerializerChannel.toJson(_pw, val2);
		}
		_pw.print("}");
	}
	public static void toJsonDirectMessageResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<DirectMessageResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonDirectMessageResponse(java.io.PrintWriter _pw, java.lang.Iterable<DirectMessageResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonDirectMessageResponse(java.io.PrintWriter _pw, java.util.Map<Long, DirectMessageResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
