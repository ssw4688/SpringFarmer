package com.codefarm.farmer.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminJob/*")
public class AdminJobController {

    @GetMapping("/job")
    public String adminJob() {return "/adminJob/job";}

    @GetMapping("/job-participant")
    public String adminJobParticipant() {return "/adminJob/job-participant";}
}


