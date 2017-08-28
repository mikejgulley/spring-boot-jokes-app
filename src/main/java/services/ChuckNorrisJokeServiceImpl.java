package services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJokeServiceImpl implements ChuckNorrisJokeService {

    @Autowired
    ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getRandomChuckNorrisJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
