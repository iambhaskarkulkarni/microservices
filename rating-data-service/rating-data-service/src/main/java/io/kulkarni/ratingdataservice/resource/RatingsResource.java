package io.kulkarni.ratingdataservice.resource;

import io.kulkarni.ratingdataservice.models.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rattingsdata")
public class RatingsResource {

    @RequestMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId)  {
            UserRating userRating = new UserRating();
            userRating.initData(userId);
            return userRating;
    }
}
