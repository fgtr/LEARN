package aa.learn.springboot1.readinglist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO
 *
 * @CREATE AA @ 2018/10/19 1:59 PM
 */
@Controller
public class IndexController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
//        return "redirect:/reader/login";
//        return "redirect:/reading-list/jeff";
        return "index page";
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
