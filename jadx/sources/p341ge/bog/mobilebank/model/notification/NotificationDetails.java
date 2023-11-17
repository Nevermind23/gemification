package p341ge.bog.mobilebank.model.notification;

/* renamed from: ge.bog.mobilebank.model.notification.NotificationDetails */
public class NotificationDetails {
    private String content;

    /* renamed from: id */
    private long f81337id;
    private String languageCode;
    private long notificationId;
    private String sender;
    private String subject;

    public String getContent() {
        return this.content;
    }

    public long getId() {
        return this.f81337id;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setId(long j) {
        this.f81337id = j;
    }

    public void setSubject(String str) {
        this.subject = str;
    }
}
