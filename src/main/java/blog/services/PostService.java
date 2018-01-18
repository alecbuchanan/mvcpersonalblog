package blog.services;

import blog.model.Post;

import java.util.List;

/**
 * Created by abuchanan57 on 1/17/18.
 */
public interface PostService {

    List<Post> findAll();
    List<Post> findLatest5();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);

}
