package cn.com.fero.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexAction {
	private String userName;
	
	@RequestMapping("/index.do")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		userName = "dongchangkun";
		request.setAttribute("userName", userName);
		return "index";
	}
	
	@RequestMapping("/byebye.do")
	public String byebye(){
		return "byebye";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
