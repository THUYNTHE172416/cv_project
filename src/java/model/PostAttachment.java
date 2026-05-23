package model;

import java.time.LocalDateTime;

public class PostAttachment {

    private String postAttachmentsId;
    private String postId;
    private String url;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public PostAttachment() {
    }

    public PostAttachment(String postAttachmentsId, String postId, String url, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.postAttachmentsId = postAttachmentsId;
        this.postId = postId;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getPostAttachmentsId() {
        return postAttachmentsId;
    }

    public void setPostAttachmentsId(String postAttachmentsId) {
        this.postAttachmentsId = postAttachmentsId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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