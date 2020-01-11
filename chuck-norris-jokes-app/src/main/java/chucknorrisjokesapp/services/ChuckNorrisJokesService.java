/**
 * 
 */
package chucknorrisjokesapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Maor Zaken
 * Created on Jan 11, 2020
 */
@Service
public class ChuckNorrisJokesService implements JokeService{
	
	private ChuckNorrisQuotes chuckNorrisQuotes;

	/**
	 * @param chuckNorrisQuotes
	 */
	public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}

	@Override
	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
