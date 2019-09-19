package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerMetadataResponse{
	public static void toJson(java.io.PrintWriter _pw, MetadataResponse objeto){
		_pw.print("{");
		PrintWriterUtils.printJsonProp(_pw, true, "\"next_cursor\":", objeto.next_cursor);
		_pw.print("}");
	}
	public static void toJsonMetadataResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<MetadataResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonMetadataResponse(java.io.PrintWriter _pw, java.lang.Iterable<MetadataResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonMetadataResponse(java.io.PrintWriter _pw, java.util.Map<Long, MetadataResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
