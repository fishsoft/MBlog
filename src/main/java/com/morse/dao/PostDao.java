package com.morse.dao;

import com.morse.entites.PostBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 程 on 2016/11/27.
 */
@Repository("postDao")
public interface PostDao extends Dao<PostBean> {

    @Override
    int add(PostBean postBean);

    @Override
    int del(PostBean postBean);

    @Override
    int update(PostBean postBean);

    @Override
    PostBean findOneById(Serializable postId);

    @Override
    List<PostBean> findAll();


    List<PostBean> findAllNew();

    /**
     * 分页查询
     *
     * @param offset 起始位置
     * @param limit  每页数量
     * @return
     */
    List<PostBean> findAllPublish(@Param("offset") int offset, @Param("limit") int limit);

    int getAllCount();

    List<PostBean> getAllPostDateCount();
}
