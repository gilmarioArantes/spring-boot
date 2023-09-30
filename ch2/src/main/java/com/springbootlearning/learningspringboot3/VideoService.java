package com.springbootlearning.learningspringboot3;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {
    List<Video> videos = List.of(
            new Video("Need HELP with your SPRING BOOT 3 App?"),
            new Video("Don't do THIS to your own CODE!"),
            new Video("SECRETS to fix BROKEN CODE!")
    );

    public List<Video> getVideos(){
        return videos;
    }
}
