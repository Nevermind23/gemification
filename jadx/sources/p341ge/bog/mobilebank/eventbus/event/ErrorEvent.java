package p341ge.bog.mobilebank.eventbus.event;

/* renamed from: ge.bog.mobilebank.eventbus.event.ErrorEvent */
public class ErrorEvent {
    private String mErrorText;

    public ErrorEvent(String str) {
        this.mErrorText = str;
    }

    public String getErrorText() {
        return this.mErrorText;
    }

    public void setErrorText(String str) {
        this.mErrorText = str;
    }
}
