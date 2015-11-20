/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Cypher
 */
public class TwitterTest
{
    private ConfigurationBuilder cb;
    
    public TwitterTest()
    {
        //Twitter Conf.
        cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("M5EDIgqxobOzrQS9ty018e8CX")
                .setOAuthConsumerSecret("r8J54Bsrbld0aHzE9N19zliiARdjxBeZxLglleSANFL06X8IMV")
                .setOAuthAccessToken("")
                .setOAuthAccessTokenSecret("");
    }
    
    public List<Status> getAllTweets() throws TwitterException
    {
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        Query query = new Query("teepeecast");
        QueryResult result = twitter.search(query);
        System.out.println("Testing");
        return result.getTweets();
    }
}
