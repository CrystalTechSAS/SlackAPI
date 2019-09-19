package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerOpenConversationArguments{
	public static void toJson(java.io.PrintWriter _pw, OpenConversationArguments objeto){
		boolean __first = true;
		_pw.print("{");
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"channel\":", objeto.channel);
		__first = PrintWriterUtils.printJsonProp(_pw, __first, "\"users\":", objeto.users);
		_pw.print("}");
	}
	public static void toJsonOpenConversationArguments(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<OpenConversationArguments>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonOpenConversationArguments(java.io.PrintWriter _pw, java.lang.Iterable<OpenConversationArguments> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonOpenConversationArguments(java.io.PrintWriter _pw, java.util.Map<Long, OpenConversationArguments> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
