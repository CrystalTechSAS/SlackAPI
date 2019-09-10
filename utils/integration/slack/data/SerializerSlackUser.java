package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerSlackUser{
	public static void toJson(java.io.PrintWriter _pw, SlackUser objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name);
		_pw.print("}");
	}
	public static void toJsonSlackUser(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<SlackUser>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackUser(java.io.PrintWriter _pw, java.lang.Iterable<SlackUser> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackUser(java.io.PrintWriter _pw, java.util.Map<Long, SlackUser> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
