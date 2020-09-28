package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args)throws TwitterException  {
		SpringApplication.run(DemoApplication.class, args);
		Twitter twitter = accessToTwitter();
		twitter.updateStatus("Testing the Twitter");
	}

	private static Twitter accessToTwitter() {
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("Tr3pga70DFxAH5JXSNXcFMv66")
		  .setOAuthConsumerSecret("1HfLV21mukzd9VICBPovvyoMNwV9oqwvPymQh4nV0APaAv4nUJ")
		  .setOAuthAccessToken("1310092108506619904-xh2HhafuDC8VXi2C99ByJ1WiHXGv2E")
		  .setOAuthAccessTokenSecret("0BiQmGMchmCTDK6Lqlli3deO70A6phWjwg5YKQt1twExl");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
		return twitter;
	}
	

}
