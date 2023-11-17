package p341ge.bog.mobilebank.model;

/* renamed from: ge.bog.mobilebank.model.AttachmentType */
public class AttachmentType {
    private AttachmentTypeConst attachmentType;
    private long dictionaryKeyId;

    /* renamed from: id */
    private long f81285id;
    private int maxSize;
    private int minSize;
    private String status;

    public AttachmentTypeConst getAttachmentType() {
        return this.attachmentType;
    }

    public long getDictionaryKeyId() {
        return this.dictionaryKeyId;
    }

    public long getId() {
        return this.f81285id;
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int getMinSize() {
        return this.minSize;
    }

    public String getStatus() {
        return this.status;
    }

    public void setAttachmentType(AttachmentTypeConst attachmentTypeConst) {
        this.attachmentType = attachmentTypeConst;
    }

    public void setDictionaryKeyId(long j) {
        this.dictionaryKeyId = j;
    }

    public void setId(long j) {
        this.f81285id = j;
    }

    public void setMaxSize(int i) {
        this.maxSize = i;
    }

    public void setMinSize(int i) {
        this.minSize = i;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
