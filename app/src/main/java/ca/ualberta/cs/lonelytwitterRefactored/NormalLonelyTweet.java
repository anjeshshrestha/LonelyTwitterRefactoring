package ca.ualberta.cs.lonelytwitterRefactored;

import java.util.Date;

public class NormalLonelyTweet extends Tweet {
    public NormalLonelyTweet(){

    }

    public NormalLonelyTweet(String text, Date date){
        this.tweetBody = text;
        this.tweetDate = date;
    }
    @Override
    public boolean isValidBody(){
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10) {
            return false;
        }

        return true;
    }
}
