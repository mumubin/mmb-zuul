package config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {

	@RequestMapping("/")
	public String sentence() {
		return "sentence";
	}
}
