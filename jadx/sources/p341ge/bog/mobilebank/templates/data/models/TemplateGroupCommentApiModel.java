package p341ge.bog.mobilebank.templates.data.models;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.templates.data.models.TemplateGroupCommentApiModel */
public final class TemplateGroupCommentApiModel {
    private final String comment;
    private final String commentType;

    /* renamed from: id */
    private final Long f84123id;
    private final String langCode;

    public TemplateGroupCommentApiModel() {
        this((Long) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ TemplateGroupCommentApiModel copy$default(TemplateGroupCommentApiModel templateGroupCommentApiModel, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = templateGroupCommentApiModel.f84123id;
        }
        if ((i & 2) != 0) {
            str = templateGroupCommentApiModel.langCode;
        }
        if ((i & 4) != 0) {
            str2 = templateGroupCommentApiModel.commentType;
        }
        if ((i & 8) != 0) {
            str3 = templateGroupCommentApiModel.comment;
        }
        return templateGroupCommentApiModel.copy(l, str, str2, str3);
    }

    public final Long component1() {
        return this.f84123id;
    }

    public final String component2() {
        return this.langCode;
    }

    public final String component3() {
        return this.commentType;
    }

    public final String component4() {
        return this.comment;
    }

    public final TemplateGroupCommentApiModel copy(Long l, String str, String str2, String str3) {
        return new TemplateGroupCommentApiModel(l, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateGroupCommentApiModel)) {
            return false;
        }
        TemplateGroupCommentApiModel templateGroupCommentApiModel = (TemplateGroupCommentApiModel) obj;
        return C41536l.m120484d(this.f84123id, templateGroupCommentApiModel.f84123id) && C41536l.m120484d(this.langCode, templateGroupCommentApiModel.langCode) && C41536l.m120484d(this.commentType, templateGroupCommentApiModel.commentType) && C41536l.m120484d(this.comment, templateGroupCommentApiModel.comment);
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCommentType() {
        return this.commentType;
    }

    public final Long getId() {
        return this.f84123id;
    }

    public final String getLangCode() {
        return this.langCode;
    }

    public int hashCode() {
        Long l = this.f84123id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.langCode;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.commentType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.comment;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        Long l = this.f84123id;
        String str = this.langCode;
        String str2 = this.commentType;
        String str3 = this.comment;
        return "TemplateGroupCommentApiModel(id=" + l + ", langCode=" + str + ", commentType=" + str2 + ", comment=" + str3 + ")";
    }

    public TemplateGroupCommentApiModel(Long l, String str, String str2, String str3) {
        this.f84123id = l;
        this.langCode = str;
        this.commentType = str2;
        this.comment = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TemplateGroupCommentApiModel(Long l, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
