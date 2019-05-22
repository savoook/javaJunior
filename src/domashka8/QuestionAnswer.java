package domashka8;

import java.util.Date;

public class QuestionAnswer {
    private String nameClientQuestion;
    private String cityClientOtziv;
    private String typeQuestion;
    private String subtypeQuestion;
    private String Question;
    private Date dataComment;
    private String commentToComment;

    public String getNameClientQuestion() {
        return nameClientQuestion;
    }

    public void setNameClientQuestion(String nameClientQuestion) {
        this.nameClientQuestion = nameClientQuestion;
    }

    public String getCityClientOtziv() {
        return cityClientOtziv;
    }

    public void setCityClientOtziv(String cityClientOtziv) {
        this.cityClientOtziv = cityClientOtziv;
    }

    public String getTypeQuestion() {
        return typeQuestion;
    }

    public void setTypeQuestion(String typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public String getSubtypeQuestion() {
        return subtypeQuestion;
    }

    public void setSubtypeQuestion(String subtypeQuestion) {
        this.subtypeQuestion = subtypeQuestion;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
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
