package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private final VideoService videoService;

    public HomeController(VideoService videoService){
        this.videoService = videoService;
    }


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("videos",videoService.getVideos());
        return "index";
    }
}
