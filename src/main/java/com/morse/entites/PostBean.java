package com.morse.entites;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 程 on 2016/11/27.
 */
public class PostBean implements Serializable {
    /**
     * 版本号
     */
    private static final long serialVersionUID = 4477235816922585138L;

    private String id;

    private String postAuthor;

    private Date postDate;

    private Date postDateGmt;

    private String postContent;

    private String postTitle;

    private String postExcerpt;

    private String postStatus;

    private String commentStatus;

    private String pingStatus;

    private String postPassword;

    private String postName;

    private String toPing;

    private String pinged;

    private Date postModified;

    private Date postModifiedGmt;

    private String postContentFiltered;

    private String postParent;

    private String guid;

    private Integer menuOrder;

    private String postType;

    private String postMimeType;

    private Long commentCount;

    /**
     * 获取
     *
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostAuthor() {
        return this.postAuthor;
    }

    /**
     * 设置
     *
     * @param postAuthor
     */
    public void setPostAuthor(String postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * 获取
     *
     * @return
     */
    public Date getPostDate() {
        return this.postDate;
    }

    /**
     * 设置
     *
     * @param postDate
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     * 获取
     *
     * @return
     */
    public Date getPostDateGmt() {
        return this.postDateGmt;
    }

    /**
     * 设置
     *
     * @param postDateGmt
     */
    public void setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostContent() {
        return this.postContent;
    }

    /**
     * 设置
     *
     * @param postContent
     */
    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostTitle() {
        return this.postTitle;
    }

    /**
     * 设置
     *
     * @param postTitle
     */
    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostExcerpt() {
        return this.postExcerpt;
    }

    /**
     * 设置
     *
     * @param postExcerpt
     */
    public void setPostExcerpt(String postExcerpt) {
        this.postExcerpt = postExcerpt;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostStatus() {
        return this.postStatus;
    }

    /**
     * 设置
     *
     * @param postStatus
     */
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getCommentStatus() {
        return this.commentStatus;
    }

    /**
     * 设置
     *
     * @param commentStatus
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPingStatus() {
        return this.pingStatus;
    }

    /**
     * 设置
     *
     * @param pingStatus
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostPassword() {
        return this.postPassword;
    }

    /**
     * 设置
     *
     * @param postPassword
     */
    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostName() {
        return this.postName;
    }

    /**
     * 设置
     *
     * @param postName
     */
    public void setPostName(String postName) {
        this.postName = postName;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getToPing() {
        return this.toPing;
    }

    /**
     * 设置
     *
     * @param toPing
     */
    public void setToPing(String toPing) {
        this.toPing = toPing;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPinged() {
        return this.pinged;
    }

    /**
     * 设置
     *
     * @param pinged
     */
    public void setPinged(String pinged) {
        this.pinged = pinged;
    }

    /**
     * 获取
     *
     * @return
     */
    public Date getPostModified() {
        return this.postModified;
    }

    /**
     * 设置
     *
     * @param postModified
     */
    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    /**
     * 获取
     *
     * @return
     */
    public Date getPostModifiedGmt() {
        return this.postModifiedGmt;
    }

    /**
     * 设置
     *
     * @param postModifiedGmt
     */
    public void setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostContentFiltered() {
        return this.postContentFiltered;
    }

    /**
     * 设置
     *
     * @param postContentFiltered
     */
    public void setPostContentFiltered(String postContentFiltered) {
        this.postContentFiltered = postContentFiltered;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostParent() {
        return this.postParent;
    }

    /**
     * 设置
     *
     * @param postParent
     */
    public void setPostParent(String postParent) {
        this.postParent = postParent;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getGuid() {
        return this.guid;
    }

    /**
     * 设置
     *
     * @param guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 获取
     *
     * @return
     */
    public Integer getMenuOrder() {
        return this.menuOrder;
    }

    /**
     * 设置
     *
     * @param menuOrder
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostType() {
        return this.postType;
    }

    /**
     * 设置
     *
     * @param postType
     */
    public void setPostType(String postType) {
        this.postType = postType;
    }

    /**
     * 获取
     *
     * @return
     */
    public String getPostMimeType() {
        return this.postMimeType;
    }

    /**
     * 设置
     *
     * @param postMimeType
     */
    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType;
    }

    /**
     * 获取
     *
     * @return
     */
    public Long getCommentCount() {
        return this.commentCount;
    }

    /**
     * 设置
     *
     * @param commentCount
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }


    @Override
    public String toString() {
        return "PostBean{" +
                "id='" + id + '\'' +
                ", postAuthor='" + postAuthor + '\'' +
                ", postDate=" + postDate +
                ", postDateGmt=" + postDateGmt +
                ", postContent='" + postContent + '\'' +
                ", postTitle='" + postTitle + '\'' +
                ", postExcerpt='" + postExcerpt + '\'' +
                ", postStatus='" + postStatus + '\'' +
                ", commentStatus='" + commentStatus + '\'' +
                ", pingStatus='" + pingStatus + '\'' +
                ", postPassword='" + postPassword + '\'' +
                ", postName='" + postName + '\'' +
                ", toPing='" + toPing + '\'' +
                ", pinged='" + pinged + '\'' +
                ", postModified=" + postModified +
                ", postModifiedGmt=" + postModifiedGmt +
                ", postContentFiltered='" + postContentFiltered + '\'' +
                ", postParent='" + postParent + '\'' +
                ", guid='" + guid + '\'' +
                ", menuOrder=" + menuOrder +
                ", postType='" + postType + '\'' +
                ", postMimeType='" + postMimeType + '\'' +
                ", commentCount=" + commentCount +
                '}';
    }
}
