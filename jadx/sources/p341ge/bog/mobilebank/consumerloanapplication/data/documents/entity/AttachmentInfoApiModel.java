package p341ge.bog.mobilebank.consumerloanapplication.data.documents.entity;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.documents.entity.AttachmentInfoApiModel */
public final class AttachmentInfoApiModel {
    private final List<AttachmentExtensionApiModel> attachmentExtensions;
    private final AttachmentTypeApiModel attachmentType;

    public AttachmentInfoApiModel(AttachmentTypeApiModel attachmentTypeApiModel, List<AttachmentExtensionApiModel> list) {
        C41536l.m120489i(attachmentTypeApiModel, "attachmentType");
        C41536l.m120489i(list, "attachmentExtensions");
        this.attachmentType = attachmentTypeApiModel;
        this.attachmentExtensions = list;
    }

    public static /* synthetic */ AttachmentInfoApiModel copy$default(AttachmentInfoApiModel attachmentInfoApiModel, AttachmentTypeApiModel attachmentTypeApiModel, List<AttachmentExtensionApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            attachmentTypeApiModel = attachmentInfoApiModel.attachmentType;
        }
        if ((i & 2) != 0) {
            list = attachmentInfoApiModel.attachmentExtensions;
        }
        return attachmentInfoApiModel.copy(attachmentTypeApiModel, list);
    }

    public final AttachmentTypeApiModel component1() {
        return this.attachmentType;
    }

    public final List<AttachmentExtensionApiModel> component2() {
        return this.attachmentExtensions;
    }

    public final AttachmentInfoApiModel copy(AttachmentTypeApiModel attachmentTypeApiModel, List<AttachmentExtensionApiModel> list) {
        C41536l.m120489i(attachmentTypeApiModel, "attachmentType");
        C41536l.m120489i(list, "attachmentExtensions");
        return new AttachmentInfoApiModel(attachmentTypeApiModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachmentInfoApiModel)) {
            return false;
        }
        AttachmentInfoApiModel attachmentInfoApiModel = (AttachmentInfoApiModel) obj;
        return C41536l.m120484d(this.attachmentType, attachmentInfoApiModel.attachmentType) && C41536l.m120484d(this.attachmentExtensions, attachmentInfoApiModel.attachmentExtensions);
    }

    public final List<AttachmentExtensionApiModel> getAttachmentExtensions() {
        return this.attachmentExtensions;
    }

    public final AttachmentTypeApiModel getAttachmentType() {
        return this.attachmentType;
    }

    public int hashCode() {
        return (this.attachmentType.hashCode() * 31) + this.attachmentExtensions.hashCode();
    }

    public String toString() {
        AttachmentTypeApiModel attachmentTypeApiModel = this.attachmentType;
        List<AttachmentExtensionApiModel> list = this.attachmentExtensions;
        return "AttachmentInfoApiModel(attachmentType=" + attachmentTypeApiModel + ", attachmentExtensions=" + list + ")";
    }
}
