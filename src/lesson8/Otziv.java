package lesson8;

import java.util.Date;

public class Otziv {
    private String nameClient;
    private int ages;
    private String plus;
    private String minus;
    private String comments;
    private int like;
    private int dislike;
    private Date dataComments;
    private double reiting;
    private boolean buyInOzon;

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public String getPlus() {
        return plus;
    }

    public void setPlus(String plus) {
        this.plus = plus;
    }

    public String getMinus() {
        return minus;
    }

    public void setMinus(String minus) {
        this.minus = minus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }

    public Date getDataComments() {
        return dataComments;
    }

    public void setDataComments(Date dataComments) {
        this.dataComments = dataComments;
    }

    public double getReiting() {
        return reiting;
    }

    public void setReiting(double reiting) {
        this.reiting = reiting;
    }

    public boolean isBuyInOzon() {
        return buyInOzon;
    }

    public void setBuyInOzon(boolean buyInOzon) {
        this.buyInOzon = buyInOzon;
    }
}
