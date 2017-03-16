package free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author japing
 * @Date 2017/3/14 19:58
 * @Description:
 */
@Controller
public class testController {

    @RequestMapping(value = "/test", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public Object test() {
        return "test--->test";
    }

}
