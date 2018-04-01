package guru.springframework.chucknorrisforactuator.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisQuotImpl implements ChuckNorrisQuot {
	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public ChuckNorrisQuotImpl(){
		this.chuckNorrisQuotes= new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJoke(){
		return chuckNorrisQuotes.getRandomQuote();
	}

}
