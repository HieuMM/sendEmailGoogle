package com.example.demosendmailforgot.controller;

import com.example.demosendmailforgot.service.DefaulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {
    long start = System.currentTimeMillis();
    @Autowired
    DefaulService defaulService;
    @GetMapping("/check")
    public String getform(){
        return "sendEmailToAll";
    }
  //  @GetMapping("/forgot-password")
    @PostMapping("/forgot-password")
    public String forgotPassword(@RequestParam("notes") String note, Model model) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("maiminhhieu1999@gmail.com");
      //  list.add("hieummhe130819@fpt.edu.vn");
        //list.add("dongthanhthao72@gmail.com");
      //  list.add("manhth31@gmail.com");
      //  list.add("coolquanghuu@gmail.com");

      // model.addAttribute(  ,note);
        System.out.println(note);
        for (String email : list) {
          //  defaulService.sendMailResetPassword(email);
            defaulService.sendMailAll(email,note);
        }
        //  String email="maiminhhieu1999@gmail.com";
        // defaulService.sendMailResetPassword(email);

        // some time passes
        long end = System.currentTimeMillis();
         long elapsedTime = end - start;

        System.out.println(elapsedTime);
        return "password";
    }
}
