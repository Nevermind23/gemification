package p341ge.bog.mobilebank.transfers.foreign;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.transfers.foreign.FileAttachment */
public class FileAttachment {
    private Integer attachmentId;
    private String fileName;

    public FileAttachment(String str, Integer num) {
        this.fileName = str;
        this.attachmentId = num;
    }

    public Integer getAttachmentId() {
        return this.attachmentId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setAttachmentId(Integer num) {
        this.attachmentId = num;
    }

    public void setFileName(String str) {
        this.fileName = str;
    }
}
