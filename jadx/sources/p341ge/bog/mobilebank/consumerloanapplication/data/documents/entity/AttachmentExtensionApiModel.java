package p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentExtensionApiModel */
public final class AttachmentExtensionApiModel {
    private final long fileAttachmentTypeId;
    private final String fileExtension;

    /* renamed from: id */
    private final long f59633id;

    public AttachmentExtensionApiModel(long j, long j2, String str) {
        this.f59633id = j;
        this.fileAttachmentTypeId = j2;
        this.fileExtension = str;
    }

    public static /* synthetic */ AttachmentExtensionApiModel copy$default(AttachmentExtensionApiModel attachmentExtensionApiModel, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = attachmentExtensionApiModel.f59633id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = attachmentExtensionApiModel.fileAttachmentTypeId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = attachmentExtensionApiModel.fileExtension;
        }
        return attachmentExtensionApiModel.copy(j3, j4, str);
    }

    public final long component1() {
        return this.f59633id;
    }

    public final long component2() {
        return this.fileAttachmentTypeId;
    }

    public final String component3() {
        return this.fileExtension;
    }

    public final AttachmentExtensionApiModel copy(long j, long j2, String str) {
        return new AttachmentExtensionApiModel(j, j2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentExtensionApiModel)) {
            return false;
        }
        AttachmentExtensionApiModel attachmentExtensionApiModel = (AttachmentExtensionApiModel) obj;
        return this.f59633id == attachmentExtensionApiModel.f59633id && this.fileAttachmentTypeId == attachmentExtensionApiModel.fileAttachmentTypeId && C41536l.m120484d(this.fileExtension, attachmentExtensionApiModel.fileExtension);
    }

    public final long getFileAttachmentTypeId() {
        return this.fileAttachmentTypeId;
    }

    public final String getFileExtension() {
        return this.fileExtension;
    }

    public final long getId() {
        return this.f59633id;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.f59633id) * 31) + C7397t.m28148a(this.fileAttachmentTypeId)) * 31;
        String str = this.fileExtension;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f59633id;
        long j2 = this.fileAttachmentTypeId;
        String str = this.fileExtension;
        return "AttachmentExtensionApiModel(id=" + j + ", fileAttachmentTypeId=" + j2 + ", fileExtension=" + str + ")";
    }
}
