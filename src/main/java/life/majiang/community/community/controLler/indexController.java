package life.majiang.community.community.controLler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    //项目根目录下
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
