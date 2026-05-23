package model;

import java.time.LocalDateTime;

public class Comment {

    private String commentId;

    private String postId;

    private String userCmt;

    private String name;

    private LocalDateTime createdAt;

    public Comment() {
    }

    public Comment(String commentId, String postId,
                   String userCmt, String name,
                   LocalDateTime createdAt) {

        this.commentId = commentId;
        this.postId = postId;
        this.userCmt = userCmt;
        this.name = name;
        this.createdAt = createdAt;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserCmt() {
        return userCmt;
    }

    public void setUserCmt(String userCmt) {
        this.userCmt = userCmt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}