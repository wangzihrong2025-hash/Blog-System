#BlogPostController.java
 package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/posts")
public class PostController {

    private List<String> posts = new ArrayList<>();

    // 新增文章
    @PostMapping
    public String add(@RequestParam String content) {
        posts.add(content);
        return "added";
    }

    // 取得全部
    @GetMapping
    public List<String> list() {
        return posts;
    }

    // 刪除
    @DeleteMapping
    public String delete(@RequestParam int index) {
        if (index < 0 || index >= posts.size()) {
            return "invalid index";
        }
        posts.remove(index);
        return "deleted";
    }

    // 筆數
    @GetMapping("/count")
    public int count() {
        return posts.size();
    }
}
