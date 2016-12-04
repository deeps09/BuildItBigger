package com.udacity.builditbigger.backend;

import com.udacity.builditbigger.JokeProvider;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private String myData;

    public String getData() {
        return myData;
    }

    public void setData(String data) {
        JokeProvider jokeProvider = new JokeProvider();
        myData = jokeProvider.getJoke();
    }
}