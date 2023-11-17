package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.BonusPrizeOrderEvent */
public class BonusPrizeOrderEvent extends RootEvent {
    private boolean isScaError;
    private List<String> voucherCodes;

    public List<String> getVoucherCodes() {
        return this.voucherCodes;
    }

    public boolean isScaError() {
        return this.isScaError;
    }

    public void setScaError(boolean z) {
        this.isScaError = z;
    }

    public void setVoucherCodes(List<String> list) {
        this.voucherCodes = list;
    }
}
