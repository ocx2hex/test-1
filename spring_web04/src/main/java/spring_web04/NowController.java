package spring_web04;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NowController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		/*
		ModelAndView mav = new ModelAndView();
		
		String time = sdf.format(d);
		mav.addObject("time",time);
		mav.setViewName("hello");
		return mav;
		*/
		return new ModelAndView("hello", "time", sdf.format(d)); //(viewname, 오브젝트속성, 오브젝트내용)
	}

	
}
