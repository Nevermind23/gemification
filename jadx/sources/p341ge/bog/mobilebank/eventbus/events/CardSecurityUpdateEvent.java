package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.CardSecurityUpdateEvent */
public class CardSecurityUpdateEvent extends RootEvent {
    private long cardId;
    private boolean digipassEnabled;
    private boolean isScaError;
    private String phone;
    private String smsLang;

    public long getCardId() {
        return this.cardId;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getSmsLang() {
        return this.smsLang;
    }

    public boolean isDigipassEnabled() {
        return this.digipassEnabled;
    }

    public boolean isScaError() {
        return this.isScaError;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setDigipassEnabled(boolean z) {
        this.digipassEnabled = z;
    }

    public void setIsScaError(boolean z) {
        this.isScaError = z;
    }

    public void setPhone(String str) {
        this.phone = str;
    }

    public void setSmsLang(String str) {
        this.smsLang = str;
    }
}
