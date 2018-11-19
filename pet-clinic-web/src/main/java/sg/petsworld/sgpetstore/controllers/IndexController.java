package sg.petsworld.sgpetstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * created by NR on 19 Nov 2018
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","index.html"})
    public String index() {
        return "index";
    }
}
