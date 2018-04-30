package com.sujay.notifications;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticContentController {

    @GetMapping("/")
    public String index(){
      return "eventsourcedemo";
    }

}
