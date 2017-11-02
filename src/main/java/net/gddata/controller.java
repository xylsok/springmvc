package net.gddata;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangzf on 17/11/2.
 */
@Controller
@RequestMapping("/mvc")
public class controller {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        System.out.println("xx");
        return "xxx";
    }
}
