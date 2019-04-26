package com.p2p.qiyun.hjh.entity;

public class Question {
    private Integer qId;

    private Integer qTId;

    private String qQuestion;

    private String qResolvent;

    public Integer getqId() {
        return qId;
    }

    public void setqId(Integer qId) {
        this.qId = qId;
    }

    public Integer getqTId() {
        return qTId;
    }

    public void setqTId(Integer qTId) {
        this.qTId = qTId;
    }

    public String getqQuestion() {
        return qQuestion;
    }

    public void setqQuestion(String qQuestion) {
        this.qQuestion = qQuestion == null ? null : qQuestion.trim();
    }

    public String getqResolvent() {
        return qResolvent;
    }

    public void setqResolvent(String qResolvent) {
        this.qResolvent = qResolvent == null ? null : qResolvent.trim();
    }
}