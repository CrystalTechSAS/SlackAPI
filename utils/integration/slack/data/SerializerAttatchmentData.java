package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerAttatchmentData{
	public static void toJson(java.io.PrintWriter _pw, AttatchmentData objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"id\":", objeto.id);
		PrintWriterUtils.printJsonProp(_pw, false, "\"text\":", objeto.text);
		PrintWriterUtils.printJsonProp(_pw, false, "\"fallback\":", objeto.fallback);
		_pw.print("}");
	}
	public static void toJsonAttatchmentData(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<AttatchmentData>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonAttatchmentData(java.io.PrintWriter _pw, java.lang.Iterable<AttatchmentData> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonAttatchmentData(java.io.PrintWriter _pw, java.util.Map<Long, AttatchmentData> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
