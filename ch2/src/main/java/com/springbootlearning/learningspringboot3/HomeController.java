package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/new-video")
    public String newVideo(@ModelAttribute Video newVideo){
        videoService.create(newVideo);
        return "redirect:/";
    }

    @GetMapping("/react")
    public String react() {
        return "react";
    }

    @PostMapping("/multi-field-search")
    public String multiFieldSearch(@ModelAttribute VideoSearch search, Model model){
        List<VideoEntity> searchResults = videoService.search(search);
        model.addAttribute("video", searchResults);
        return "index";
    }
}
