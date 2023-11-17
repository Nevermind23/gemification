package p341ge.bog.mobilebank.model.template;

import org.parceler.Parcel;
import p277ua.C8662a;

@Parcel
/* renamed from: ge.bog.mobilebank.model.template.TemplateGroupComment */
public class TemplateGroupComment {
    @C8662a
    protected String comment;
    @C8662a
    protected String commentType;
    @C8662a

    /* renamed from: id */
    protected Long f81380id;
    @C8662a
    protected String langCode;

    public String getComment() {
        return this.comment;
    }

    public String getCommentType() {
        return this.commentType;
    }

    public Long getId() {
        return this.f81380id;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setCommentType(String str) {
        this.commentType = str;
    }

    public void setId(Long l) {
        this.f81380id = l;
    }
}
