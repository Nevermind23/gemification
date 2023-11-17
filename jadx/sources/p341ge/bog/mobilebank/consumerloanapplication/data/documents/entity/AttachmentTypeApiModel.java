package p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentTypeApiModel */
public final class AttachmentTypeApiModel {
    private final String attachmentType;
    private final long dictionaryKeyId;

    /* renamed from: id */
    private final long f59634id;
    private final long maxSize;
    private final long minSize;
    private final String status;

    public AttachmentTypeApiModel(long j, long j2, String str, long j3, long j4, String str2) {
        C41536l.m120489i(str, "status");
        C41536l.m120489i(str2, "attachmentType");
        this.f59634id = j;
        this.dictionaryKeyId = j2;
        this.status = str;
        this.minSize = j3;
        this.maxSize = j4;
        this.attachmentType = str2;
    }

    public static /* synthetic */ AttachmentTypeApiModel copy$default(AttachmentTypeApiModel attachmentTypeApiModel, long j, long j2, String str, long j3, long j4, String str2, int i, Object obj) {
        AttachmentTypeApiModel attachmentTypeApiModel2 = attachmentTypeApiModel;
        return attachmentTypeApiModel.copy((i & 1) != 0 ? attachmentTypeApiModel2.f59634id : j, (i & 2) != 0 ? attachmentTypeApiModel2.dictionaryKeyId : j2, (i & 4) != 0 ? attachmentTypeApiModel2.status : str, (i & 8) != 0 ? attachmentTypeApiModel2.minSize : j3, (i & 16) != 0 ? attachmentTypeApiModel2.maxSize : j4, (i & 32) != 0 ? attachmentTypeApiModel2.attachmentType : str2);
    }

    public final long component1() {
        return this.f59634id;
    }

    public final long component2() {
        return this.dictionaryKeyId;
    }

    public final String component3() {
        return this.status;
    }

    public final long component4() {
        return this.minSize;
    }

    public final long component5() {
        return this.maxSize;
    }

    public final String component6() {
        return this.attachmentType;
    }

    public final AttachmentTypeApiModel copy(long j, long j2, String str, long j3, long j4, String str2) {
        String str3 = str;
        C41536l.m120489i(str3, "status");
        String str4 = str2;
        C41536l.m120489i(str4, "attachmentType");
        return new AttachmentTypeApiModel(j, j2, str3, j3, j4, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentTypeApiModel)) {
            return false;
        }
        AttachmentTypeApiModel attachmentTypeApiModel = (AttachmentTypeApiModel) obj;
        return this.f59634id == attachmentTypeApiModel.f59634id && this.dictionaryKeyId == attachmentTypeApiModel.dictionaryKeyId && C41536l.m120484d(this.status, attachmentTypeApiModel.status) && this.minSize == attachmentTypeApiModel.minSize && this.maxSize == attachmentTypeApiModel.maxSize && C41536l.m120484d(this.attachmentType, attachmentTypeApiModel.attachmentType);
    }

    public final String getAttachmentType() {
        return this.attachmentType;
    }

    public final long getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public final long getId() {
        return this.f59634id;
    }

    public final long getMaxSize() {
        return this.maxSize;
    }

    public final long getMinSize() {
        return this.minSize;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((((C7397t.m28148a(this.f59634id) * 31) + C7397t.m28148a(this.dictionaryKeyId)) * 31) + this.status.hashCode()) * 31) + C7397t.m28148a(this.minSize)) * 31) + C7397t.m28148a(this.maxSize)) * 31) + this.attachmentType.hashCode();
    }

    public String toString() {
        long j = this.f59634id;
        long j2 = this.dictionaryKeyId;
        String str = this.status;
        long j3 = this.minSize;
        long j4 = this.maxSize;
        String str2 = this.attachmentType;
        return "AttachmentTypeApiModel(id=" + j + ", dictionaryKeyId=" + j2 + ", status=" + str + ", minSize=" + j3 + ", maxSize=" + j4 + ", attachmentType=" + str2 + ")";
    }
}
