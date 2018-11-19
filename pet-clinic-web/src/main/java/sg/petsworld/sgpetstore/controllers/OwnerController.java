package sg.petsworld.sgpetstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * created by NR on 19 Nov 2018
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
