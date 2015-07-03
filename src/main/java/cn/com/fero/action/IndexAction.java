package cn.com.fero.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexAction {
	private String userName;

	@RequestMapping("/index")
	public ModelAndView index(String type) {
		ModelAndView mv = new ModelAndView("index");
		if ("obj".equals(type)) {
			mv.addObject("result", new JsonResult(true, type));
		} else if ("lst".equals(type)) {
			List<JsonResult> lst = new ArrayList<JsonResult>();
			lst.add(new JsonResult(true, "001"));
			lst.add(new JsonResult(false, "002"));
			lst.add(new JsonResult(true, "003"));
			lst.add(new JsonResult(false, "004"));
			lst.add(new JsonResult(true, "005"));
			mv.addObject("result", lst);
		} else if ("bool".equals(type)) {
			mv.addObject("result", true);
		} else if ("multiObj".equals(type)) {
			mv.addObject("result", new JsonResult(true, type));
			mv.addObject("result2", new JsonResult(false, type));
		} else {
			mv.addObject("result", new JsonResult(true, type));
		}
		return mv;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
