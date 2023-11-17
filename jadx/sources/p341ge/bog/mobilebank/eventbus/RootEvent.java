package p341ge.bog.mobilebank.eventbus;

/* renamed from: ge.bog.mobilebank.eventbus.RootEvent */
public class RootEvent {
    public static final int STATE_DATA_ERROR = 40;
    public static final int STATE_LOADING = 10;
    public static final int STATE_NETWORK_FAILURE = 30;
    public static final int STATE_SUCCESS = 20;
    int currentState;
    String error;
    public String errorCode;
    String errorKey;

    public String getError() {
        return this.error;
    }

    public String getErrorKey() {
        return this.errorKey;
    }

    public int getState() {
        return this.currentState;
    }

    public boolean isErrorOrNetworkFailure() {
        int i = this.currentState;
        return i == 30 || i == 40;
    }

    public boolean isLoadingOrLoaded() {
        int i = this.currentState;
        return i == 10 || i == 20;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setErrorKey(String str) {
        this.errorKey = str;
    }

    public void setState(int i) {
        this.currentState = i;
    }
}
