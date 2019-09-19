import static jcrystal.JCrystalConfig.*;

import java.util.Map;

import jcrystal.clients.Client;
import jcrystal.clients.ClientType;
import jcrystal.clients.DefaultInternalConfig;
import jcrystal.clients.JClientMobile;

public class JCrystalConfig {
	public static void config(){
		//JCRYSTAL_SERVER_URL = "http://localhost:8080";
		JCRYSTAL_SERVER_URL = "https://test-dot-back-dot-jcrystal-213302.appspot.com";
		SERVER.web.setBasePackage("integrations.slack");
		
		DefaultInternalConfig config = (DefaultInternalConfig)new Client(ClientType.JAVA, "slackapi")
		.setOutput("/Users/crystaltech/Documents/CrystalTech/SlackAPIJava/jcrystal")
		.setServerUrl("https://slack.com/")
		.configs.get(0);
		config.embeddedResponse(true);
		config.SUCCESS_TYPE(boolean.class);
		config.SUCCESS_DAFAULT_VALUE(false);
		config.SUCCESS_NAME("ok");
		config.ERROR_MESSAGE_NAME("error");
		config.SUCCESS_CONDITION("success");
		config.ERROR_CONDITION("!success");
		config.UNATHORIZED_CONDITION(null);
	}
}