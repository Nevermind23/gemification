package p341ge.bog.mobilebank.model.notification;

import j81.C36763e;

/* renamed from: ge.bog.mobilebank.model.notification.Notification */
public class Notification implements C36763e {
    private NotificationActionCode actionCode;
    private String channelCode;
    private String content;
    private long customerId;
    private long endDate;

    /* renamed from: id */
    private long f81336id;
    private String languageCode;
    private long notificationId;
    private String sender;
    private long startDate;
    private String subject;

    public NotificationActionCode getActionCode() {
        return this.actionCode;
    }

    public String getContent() {
        return this.content;
    }

    public long getCustomerId() {
        return this.customerId;
    }

    public long getEndDate() {
        return this.endDate;
    }

    public long getId() {
        return this.f81336id;
    }

    public String getMessage() {
        return this.content;
    }

    public String getMessageTitle() {
        return this.subject;
    }

    public long getNotificationId() {
        return this.notificationId;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setActionCode(NotificationActionCode notificationActionCode) {
        this.actionCode = notificationActionCode;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCustomerId(long j) {
        this.customerId = j;
    }

    public void setEndDate(long j) {
        this.endDate = j;
    }

    public void setId(long j) {
        this.f81336id = j;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }

    public void setSubject(String str) {
        this.subject = str;
    }
}
