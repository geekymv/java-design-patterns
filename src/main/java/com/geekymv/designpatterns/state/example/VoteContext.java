package com.geekymv.designpatterns.state.example;

public class VoteContext {

    // 持有状态处理对象的引用
    private VoteState voteState;

    public void vote(String user, String voteItem) {



        voteState.vote(user, voteItem, this);
    }
}
