package important_interfaces.CommadLineRunnerExample.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceProvider {
	
	public String message() {
		return "Hello World";
	}
}
