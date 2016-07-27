package com.jikexueyuan.demo.springmvc.lesson5.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jikexueyuan.demo.springmvc.lesson5.common.RandomValidateCode;
import com.jikexueyuan.demo.springmvc.lesson5.constant.Constants;

@Controller
public class ToolController {

	@RequestMapping("/topage")
	public String toPage(@RequestParam String pagename){
		return pagename;
		// return "/WEB-INF/jsp/" + pagename + ".jsp";
	}

	@Resource
	RandomValidateCode code;
	@RequestMapping("/vcode")
	public void vcode(HttpServletRequest request, HttpServletResponse response){
		code.getRandcode(request, response);
	}	
	
	@RequestMapping("/doLogin")
	public String doLogin(HttpServletRequest request, HttpServletResponse response, @RequestParam String vcode){
		
		String sessionCode = (String)request.getSession().getAttribute(Constants.RANDOM_CODE_KEY);
		if (vcode.equals(sessionCode)) {
			return "i18n";
		}else {
			request.setAttribute("error", "验证码错误");
			return "login";
		}
		
	}	
	
}
