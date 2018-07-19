package com.morse.entites.Response;

import com.morse.entites.DateCountBean;
import com.morse.entites.PostBean;
import com.morse.entites.TagBean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 程 on 2016/11/29.
 */
public class HomeBean implements Serializable {


    /**
     * code : 1
     * msg : success
     * data : {"posts":[{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}],"author":{},"newPosts":[{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}],"hotPosts":[{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}],"randomPosts":[{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}],"tag":{},"date":{}}
     */

    private int code;
    private String msg;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * posts : [{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}]
         * author : {}
         * newPosts : [{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}]
         * hotPosts : [{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}]
         * randomPosts : [{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0},{"id":"282","postAuthor":"1","postDate":"Nov 16, 2016 12:51:13 AM","postDateGmt":"Nov 15, 2016 4:51:13 PM","postContent":"文章内容","postTitle":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","postExcerpt":"","postStatus":"publish","commentStatus":"open","pingStatus":"open","postPassword":"","postName":"[手把手教程][JavaWeb]优雅的SpringMvc+Mybatis应用（八）","toPing":"","pinged":"","postModified":"Nov 16, 2016 12:51:13 AM","postModifiedGmt":"Nov 15, 2016 4:51:13 PM","postContentFiltered":"","postParent":"0","guid":"http://acheng1314.cn/?p=282","menuOrder":0,"postType":"post","postMimeType":"","commentCount":0}]
         * tag : {}
         * date : {}
         */

        private Object author;
        private TagBean tag;
        private List<DateCountBean> date;
        private List<PostBean> posts;
        private List<PostBean> newPosts;
        private List<PostBean> hotPosts;
        private List<PostBean> randomPosts;
        private int totalNum, pageNum, pageSize;   //总页数,当前页码,每页条数

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(int totalNum) {
            this.totalNum = totalNum;
        }

        public Object getAuthor() {
            return author;
        }

        public void setAuthor(Object author) {
            this.author = author;
        }

        public TagBean getTag() {
            return tag;
        }

        public void setTag(TagBean tag) {
            this.tag = tag;
        }

        public List<DateCountBean> getDate() {
            return date;
        }

        public void setDate(List<DateCountBean> date) {
            this.date = date;
        }

        public List<PostBean> getPosts() {
            return posts;
        }

        public void setPosts(List<PostBean> posts) {
            this.posts = posts;
        }

        public List<PostBean> getNewPosts() {
            return newPosts;
        }

        public void setNewPosts(List<PostBean> newPosts) {
            this.newPosts = newPosts;
        }

        public List<PostBean> getHotPosts() {
            return hotPosts;
        }

        public void setHotPosts(List<PostBean> hotPosts) {
            this.hotPosts = hotPosts;
        }

        public List<PostBean> getRandomPosts() {
            return randomPosts;
        }

        public void setRandomPosts(List<PostBean> randomPosts) {
            this.randomPosts = randomPosts;
        }

    }
}
