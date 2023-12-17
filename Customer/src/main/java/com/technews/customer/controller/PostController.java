package com.technews.customer.controller;

import com.technews.library.dto.CategoryDto;
import com.technews.library.model.Post;
import com.technews.library.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.technews.library.service.PostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class PostController {

    @Autowired
    private PostService postService;

    @Autowired
    private CategoryService categoryService;

}
