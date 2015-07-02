package cn.com.fero.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {
	@RequestMapping("/index.do")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/byebye.do")
	public String byebye(){
		return "byebye";
	}
}
