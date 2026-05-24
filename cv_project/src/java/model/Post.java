package model;

import enums.PostStatus;
import java.time.LocalDateTime;

public class Post {
    
    private String postId;
    private String userCreated;
    private String content;
    private PostStatus status;
    private LocalDateTime approveAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Post() {
    }

    public Post(String postId, String userCreated, String content, PostStatus status, 
                LocalDateTime approveAt, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postId = postId;
        this.userCreated = userCreated;
        this.content = content;
        this.status = status;
        this.approveAt = approveAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(String userCreated) {
        this.userCreated = userCreated;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PostStatus getStatus() {
        return status;
    }

    public void setStatus(PostStatus status) {
        this.status = status;
    }

    public LocalDateTime getApproveAt() {
        return approveAt;
    }

    public void setApproveAt(LocalDateTime approveAt) {
        this.approveAt = approveAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}