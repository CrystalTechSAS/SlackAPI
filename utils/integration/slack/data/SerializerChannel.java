package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerChannel{
	public static void toJson(java.io.PrintWriter _pw, Channel objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"is_im\":", objeto.is_im);
		PrintWriterUtils.print(_pw, ",\"is_org_shared\":", objeto.is_org_shared);
		PrintWriterUtils.print(_pw, ",\"unread_count\":", objeto.unread_count);
		PrintWriterUtils.print(_pw, ",\"unread_count_display\":", objeto.unread_count_display);
		PrintWriterUtils.print(_pw, ",\"is_open\":", objeto.is_open);
		PrintWriterUtils.print(_pw, ",\"priority\":", objeto.priority);
		PrintWriterUtils.printJsonProp(_pw, false, "\"id\":", objeto.id);
		PrintWriterUtils.printJsonProp(_pw, false, "\"user\":", objeto.user);
		_pw.print("}");
	}
	public static void toJsonChannel(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<Channel>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonChannel(java.io.PrintWriter _pw, java.lang.Iterable<Channel> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonChannel(java.io.PrintWriter _pw, java.util.Map<Long, Channel> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
