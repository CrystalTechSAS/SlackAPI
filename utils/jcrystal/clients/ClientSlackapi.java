package jcrystal.clients;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface ClientSlackapi{
	public String id() default "slackapi";
}
