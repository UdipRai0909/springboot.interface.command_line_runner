package important_interfaces.CommadLineRunnerExample;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerBean implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		String collectstr = Arrays.stream(args).collect(Collectors.joining(","));
		System.out.println(collectstr);	
	}

}
