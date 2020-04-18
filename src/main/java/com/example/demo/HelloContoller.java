package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author mtaketani
 *
 */
@Controller
public class HelloContoller {
	
	/**
	 * Hello World
	 * 
	 * @return
	 */
    @RequestMapping("/")
    public String hello() {

        return "hello";
        
    }
}
