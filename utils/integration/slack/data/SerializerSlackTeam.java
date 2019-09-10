package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerSlackTeam{
	public static void toJson(java.io.PrintWriter _pw, SlackTeam objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"id\":", objeto.id);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"name\":", objeto.name);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"domain\":", objeto.domain);
		_pw.print("}");
	}
	public static void toJsonSlackTeam(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<SlackTeam>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackTeam(java.io.PrintWriter _pw, java.lang.Iterable<SlackTeam> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackTeam(java.io.PrintWriter _pw, java.util.Map<Long, SlackTeam> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
