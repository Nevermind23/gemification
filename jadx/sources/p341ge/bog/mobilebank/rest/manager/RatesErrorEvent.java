package p341ge.bog.mobilebank.rest.manager;

/* renamed from: ge.bog.mobilebank.rest.manager.RatesErrorEvent */
public class RatesErrorEvent {
    String message;

    public RatesErrorEvent(String str) {
        this.message = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
