package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerPermalinkResponse{
	public static void toJson(java.io.PrintWriter _pw, PermalinkResponse objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"permalink\":", objeto.permalink);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"channel\":", objeto.channel);
		_pw.print("}");
	}
	public static void toJsonPermalinkResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<PermalinkResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonPermalinkResponse(java.io.PrintWriter _pw, java.lang.Iterable<PermalinkResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonPermalinkResponse(java.io.PrintWriter _pw, java.util.Map<Long, PermalinkResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
