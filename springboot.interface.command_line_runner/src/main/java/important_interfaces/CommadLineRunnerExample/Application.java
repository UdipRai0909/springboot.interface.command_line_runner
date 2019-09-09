package important_interfaces.CommadLineRunnerExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import important_interfaces.CommadLineRunnerExample.service.MessageServiceProvider;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		MessageServiceProvider messageServiceProvider = ctx.getBean(MessageServiceProvider.class);
		String message = messageServiceProvider.message();
		System.out.println(message);
	}
}
