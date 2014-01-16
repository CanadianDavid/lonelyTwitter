package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

// public - anywhere
//        - pkg
// protected - class+subclass
// pivate - class

public class LonelyTweetModel
{
    private String text;
    private Date timestamp;
    
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public Date getTimestamp(){
        return timestamp; // or this.timestamp
    }
    public void setTimestamp(Date timestamp){
        this.timestamp = timestamp;
    }
}
