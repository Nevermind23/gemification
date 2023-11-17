package p341ge.bog.mobilebank.model.notification;

/* renamed from: ge.bog.mobilebank.model.notification.NotificationActionCode */
public enum NotificationActionCode {
    ACTION_CODE_UNREAD("U"),
    ACTION_CODE_READ("R"),
    ACTION_CODE_DELETE("D");
    
    private String code;

    private NotificationActionCode(String str) {
        this.code = str;
    }

    public String getCode() {
        return this.code;
    }
}
