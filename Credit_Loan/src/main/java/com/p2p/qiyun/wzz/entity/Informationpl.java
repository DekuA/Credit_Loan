package com.p2p.qiyun.wzz.entity;

public class Informationpl {
    private Integer informationId;

    private String informationData;

    private String informationSafe;

    private String informationRisk;

    private String informationEducation;

    private String informationCharge;

    private String informationUs;

    private String informationDuce;

    private String informationNews;

    public Integer getInformationId() {
        return informationId;
    }

    public void setInformationId(Integer informationId) {
        this.informationId = informationId;
    }

    public String getInformationData() {
        return informationData;
    }

    public void setInformationData(String informationData) {
        this.informationData = informationData == null ? null : informationData.trim();
    }

    public String getInformationSafe() {
        return informationSafe;
    }

    public void setInformationSafe(String informationSafe) {
        this.informationSafe = informationSafe == null ? null : informationSafe.trim();
    }

    public String getInformationRisk() {
        return informationRisk;
    }

    public void setInformationRisk(String informationRisk) {
        this.informationRisk = informationRisk == null ? null : informationRisk.trim();
    }

    public String getInformationEducation() {
        return informationEducation;
    }

    public void setInformationEducation(String informationEducation) {
        this.informationEducation = informationEducation == null ? null : informationEducation.trim();
    }

    public String getInformationCharge() {
        return informationCharge;
    }

    public void setInformationCharge(String informationCharge) {
        this.informationCharge = informationCharge == null ? null : informationCharge.trim();
    }

    public String getInformationUs() {
        return informationUs;
    }

    public void setInformationUs(String informationUs) {
        this.informationUs = informationUs == null ? null : informationUs.trim();
    }

    public String getInformationDuce() {
        return informationDuce;
    }

    public void setInformationDuce(String informationDuce) {
        this.informationDuce = informationDuce == null ? null : informationDuce.trim();
    }

    public String getInformationNews() {
        return informationNews;
    }

    public void setInformationNews(String informationNews) {
        this.informationNews = informationNews == null ? null : informationNews.trim();
    }
}