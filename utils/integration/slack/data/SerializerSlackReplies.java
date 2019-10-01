package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerSlackReplies{
	public static void toJson(java.io.PrintWriter _pw, SlackReplies objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"user\":", objeto.user);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"ts\":", objeto.ts);
		_pw.print("}");
	}
	public static void toJsonSlackReplies(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<SlackReplies>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackReplies(java.io.PrintWriter _pw, java.lang.Iterable<SlackReplies> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonSlackReplies(java.io.PrintWriter _pw, java.util.Map<Long, SlackReplies> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
