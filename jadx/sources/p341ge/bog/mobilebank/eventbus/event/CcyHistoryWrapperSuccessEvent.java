package p341ge.bog.mobilebank.eventbus.event;

import p341ge.bog.mobilebank.model.CcyHistoryWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.event.CcyHistoryWrapperSuccessEvent */
public class CcyHistoryWrapperSuccessEvent {
    CcyHistoryWrapper mCcyHistoryWrapper;

    public CcyHistoryWrapperSuccessEvent(CcyHistoryWrapper ccyHistoryWrapper) {
        this.mCcyHistoryWrapper = ccyHistoryWrapper;
    }

    public CcyHistoryWrapper getCcyHistoryWrapper() {
        return this.mCcyHistoryWrapper;
    }

    public void setCcyHistoryWrapper(CcyHistoryWrapper ccyHistoryWrapper) {
        this.mCcyHistoryWrapper = ccyHistoryWrapper;
    }
}
