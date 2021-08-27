package com.senaiem.senaiem.controller;

import com.senaiem.senaiem.model.Post;
import com.senaiem.senaiem.service.post.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
    @Autowired
    PostServiceImpl postService;

    @GetMapping("/posts")
    public String list(Model model) {
        model.addAttribute("posts", postService.findAll());
        return "/post/list";
    }

    @GetMapping("/post/add")
    public String add(Model model) {
        model.addAttribute("post", new Post());
        return "/post/add";
    }

    @GetMapping("/post/edit/{id}")
    public String edit(Model model, @PathVariable Long id){
        model.addAttribute("post", postService.findById(id));
        return "/post/edit";
    }

    @GetMapping("/post/delete/{id}")
    public String delete(@PathVariable Long id) {
        postService.deleteById(id);
        return "redirect:/posts";
    }

    @PostMapping("/post/save")
    public String save(Post post) {
        postService.save(post);
        return "redirect:/posts";
    }

}
