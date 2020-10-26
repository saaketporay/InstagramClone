package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("og3iUGs8b4sQlNlEMMsjtqWDSEwIIrCNUnLfbvyI")
                .clientKey("BQjXZxC0qIvBnmRzBF9vuBUGQQSMAyjthkergkHJ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
