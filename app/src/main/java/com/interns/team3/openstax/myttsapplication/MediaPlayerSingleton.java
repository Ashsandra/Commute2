package com.interns.team3.openstax.myttsapplication;

import android.media.MediaPlayer;

public class MediaPlayerSingleton extends MediaPlayer {
    private static MediaPlayerSingleton mInstance = null;

    private String mString;

    private MediaPlayerSingleton(){
        mString = "Hello";
    }

    public static MediaPlayerSingleton getInstance(){
        if(mInstance == null)
        {
            mInstance = new MediaPlayerSingleton();
        }
        return mInstance;
    }

    public String getString(){
        return this.mString;
    }

    public void setString(String value){
        mString = value;
    }
}

