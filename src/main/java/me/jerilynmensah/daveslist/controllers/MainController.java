package me.jerilynmensah.daveslist.controllers;


import me.jerilynmensah.daveslist.DaveslistApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MainController {

    @GetMapping("/index")
    public String showIndex(Model model)
    {
        return "index";
    }


    @GetMapping("/davesList")
    public String showDavesList(Model model)
    {
        return "davesList";
    }

    @PostMapping("/davesform")
    public String showDavesForm(@Valid @ModelAttribute("daveslist") DaveslistApplication daveslistApplication, BindingResult result)
    {
        if(result.hasErrors())
        {
            return "davesform";
        }
        return "daveconfirm";
    }
}
}
