package se.magnus.api.composite.product;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReviewSummary {
    private int reviewId;
    private String author;
    private String subject;
    private String content;
    private String serviceAddress;

    public ReviewSummary(int reviewId, String author, String subject, String content) {
        this.reviewId = reviewId;
        this.author = author;
        this.subject = subject;
        this.content = content;
        this.serviceAddress = serviceAddress;
    }
}
