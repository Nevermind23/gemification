package p341ge.bog.mobilebank.model;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.FileAttachmentInfo */
public class FileAttachmentInfo {
    private List<AttachmentExtension> attachmentExtensions;
    private AttachmentType attachmentType;

    public List<AttachmentExtension> getAttachmentExtensions() {
        return this.attachmentExtensions;
    }

    public AttachmentType getAttachmentType() {
        return this.attachmentType;
    }

    public void setAttachmentExtensions(List<AttachmentExtension> list) {
        this.attachmentExtensions = list;
    }

    public void setAttachmentType(AttachmentType attachmentType2) {
        this.attachmentType = attachmentType2;
    }
}
