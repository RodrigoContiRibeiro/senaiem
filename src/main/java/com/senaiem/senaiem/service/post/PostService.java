package com.senaiem.senaiem.service.post;

import com.senaiem.senaiem.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {

    public List<Post> findAll();

    public Post findById(Long id);

    public void deleteById(Long id);

    public void save(Post post);
}
