package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.PreContractEvent */
public class PreContractEvent extends RootEvent {
    private String errorMessage;
    private boolean isLoading;
    private Integer resultCode;

    public PreContractEvent() {
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Integer getResultCode() {
        return this.resultCode;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public PreContractEvent(boolean z) {
        this.isLoading = z;
    }

    public PreContractEvent(Integer num, String str) {
        this.resultCode = num;
        this.errorMessage = str;
    }
}
