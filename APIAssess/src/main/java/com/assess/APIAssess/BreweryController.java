package com.assess.APIAssess;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.assess.APIAssess.entities.Brewery;
import com.assess.APIAssess.entities.Jokes;

@Controller
public class BreweryController {

	RestTemplate rt = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();

	@RequestMapping("/")
	public ModelAndView home() {
		headers.add(HttpHeaders.USER_AGENT,"testing");

		String url="https://api.openbrewerydb.org/breweries";
		ResponseEntity<Brewery[]> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), Brewery[].class);
		return new ModelAndView("index","nametype",response.getBody());
	}
	
	@RequestMapping("/details")
	public ModelAndView getDetails(@RequestParam("id") String id) {
		headers.add(HttpHeaders.USER_AGENT,"testing");

		String url="https://api.openbrewerydb.org/breweries/"+id;
		ResponseEntity<Brewery> response = rt.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), Brewery.class);
		return new ModelAndView("detail-page","brew",response.getBody());
	}

	@RequestMapping("go-joke")
	public ModelAndView getJokes() {
		headers.add(HttpHeaders.USER_AGENT,"testing");
		
		String url = "https://api.icndb.com/jokes/random";
		ResponseEntity<Jokes> jokeResp = rt.exchange(url, HttpMethod.GET, new HttpEntity<>(headers), Jokes.class );
		return new ModelAndView("joke-page","values", jokeResp.getBody().getValue());
		
		
	}
	
}
