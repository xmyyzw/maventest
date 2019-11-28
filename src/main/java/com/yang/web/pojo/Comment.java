package com.yang.web.pojo;

import java.util.Date;

public class Comment {
    private Integer commentId;

    private Date time;

    private Integer aboutCommentId;

    private Integer userId;

    private Integer requirementId;

    private String content;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getAboutCommentId() {
        return aboutCommentId;
    }

    public void setAboutCommentId(Integer aboutCommentId) {
        this.aboutCommentId = aboutCommentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRequirementId() {
        return requirementId;
    }

    public void setRequirementId(Integer requirementId) {
        this.requirementId = requirementId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}