package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 测试Git
 * @author asus
 *
 */
@Controller
public class FooController {
	
	@GetMapping("/fp")
	@ResponseBody
	public String foo() {
		return "success";
	}
}
