package com.morse.service.postService;


import com.morse.entites.DateCountBean;
import com.morse.entites.PostBean;
import com.morse.service.BaseService;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 程 on 2016/11/27.
 */
public interface PostService extends BaseService<PostBean> {
    @Override
    void add(PostBean postBean) throws Exception;

    @Override
    List<PostBean> findAll(int pageNum, int pageSize);

    List<PostBean> findAllPublish(int pageNum, int pageSize);

    /**
     * 获取总条数
     *
     * @return 获取总条数
     */
    int getAllCount();

    /**
     * 获取热点文章
     *
     * @return
     */
    List<PostBean> findAllNew();

    /**
     * 获取所有文章的日期归档
     *
     * @return 返回归档信息
     */
    List<DateCountBean> getAllPostDateCount();

    /**
     * 根据文章ID查找文章
     *
     * @param postId 文章ID
     * @return 文章ID对应的实体
     */
    PostBean findPostById(Serializable postId);
}
