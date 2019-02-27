package com.geekymv.designpatterns.state.example;

public interface VoteState {

    public void vote(String user, String voteItem, VoteContext voteContext);
}
