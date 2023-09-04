
package com.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {
    
    @Autowired
    private ReviewService reviewService;
    
    @PostMapping("/reviews")
    public void addReview(@RequestBody Review review) {
        reviewService.addReview(review);
    }
}
