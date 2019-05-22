package domashka8;

import java.util.Date;

public class Comments {
    private String nameClientComment;
    private String comment;
    private int likeComment;
    private int dislikeComment;
    private Date dataComment;
    private String commentToComment;

    public String getNameClientComment() {
        return nameClientComment;
    }

    public void setNameClientComment(String nameClientComment) {
        this.nameClientComment = nameClientComment;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getLikeComment() {
        return likeComment;
    }

    public void setLikeComment(int likeComment) {
        this.likeComment = likeComment;
    }

    public int getDislikeComment() {
        return dislikeComment;
    }

    public void setDislikeComment(int dislikeComment) {
        this.dislikeComment = dislikeComment;
    }

    public Date getDataComment() {
        return dataComment;
    }

    public void setDataComment(Date dataComment) {
        this.dataComment = dataComment;
    }

    public String getCommentToComment() {
        return commentToComment;
    }

    public void setCommentToComment(String commentToComment) {
        this.commentToComment = commentToComment;
    }
}
