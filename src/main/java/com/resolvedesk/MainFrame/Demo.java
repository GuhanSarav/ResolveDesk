package com.resolvedesk.MainFrame;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/")
    public String Deemo(){
        return "How are you !!";
    }
}
