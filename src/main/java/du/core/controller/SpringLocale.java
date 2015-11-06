package du.core.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringLocale {

	@Autowired
	private MessageSource messageSource;
	
	@ResponseBody
	@RequestMapping("/ch")
	public String test() {
		
		String str = messageSource.getMessage("nav.brand", null, Locale.CHINA);
//		String str = messageSource.getMessage("nav.brand", null, Locale.US);
		
		return str;
	}
}
