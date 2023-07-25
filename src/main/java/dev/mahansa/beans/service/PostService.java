package dev.mahansa.beans.service;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    public String findAll(){
        return "All Posts";
    }
}
