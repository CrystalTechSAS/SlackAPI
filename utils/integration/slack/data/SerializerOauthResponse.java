package integration.slack.data;
import jcrystal.datetime.DateType;
import jcrystal.PrintWriterUtils;
@SuppressWarnings("unused")
public class SerializerOauthResponse{
	public static void toJson(java.io.PrintWriter _pw, OauthResponse objeto){
		_pw.print("{");
		PrintWriterUtils.print(_pw, "\"ok\":", objeto.ok);
		integration.slack.data.SlackUser val1 = objeto.user;
		if(val1 != null){
			_pw.print(",\"user\":");
			SerializerSlackUser.toJson(_pw, val1);
		}
		integration.slack.data.SlackTeam val2 = objeto.team;
		if(val2 != null){
			_pw.print(",\"team\":");
			SerializerSlackTeam.toJson(_pw, val2);
		}
		_pw.print("}");
	}
	public static void toJsonOauthResponse(java.io.PrintWriter _pw, jcrystal.manager.utils.FileWrapperResponse<java.util.List<OauthResponse>> lista)throws java.io.IOException{
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonOauthResponse(java.io.PrintWriter _pw, java.lang.Iterable<OauthResponse> lista){
		PrintWriterUtils.toJson(_pw, lista, valor->toJson(_pw, valor));
	}
	public static void toJsonOauthResponse(java.io.PrintWriter _pw, java.util.Map<Long, OauthResponse> mapa){
		PrintWriterUtils.toJson(_pw, mapa, valor-> toJson(_pw, valor));
	}
}
