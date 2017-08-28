package com.lumatik.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // More efficient, just create on instance of ChuckNorrisQuotes instead of one every time we call it
    public ChuckNorrisJokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomChuckNorrisJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
