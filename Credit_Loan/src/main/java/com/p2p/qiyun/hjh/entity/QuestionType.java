package com.p2p.qiyun.hjh.entity;

public class QuestionType {
    @Override
	public String toString() {
		return "QuestionType [qTId=" + qTId + ", qTType=" + qTType + "]";
	}

	private Integer qTId;

    private String qTType;

    public Integer getqTId() {
        return qTId;
    }

    public void setqTId(Integer qTId) {
        this.qTId = qTId;
    }

    public String getqTType() {
        return qTType;
    }

    public void setqTType(String qTType) {
        this.qTType = qTType == null ? null : qTType.trim();
    }
}