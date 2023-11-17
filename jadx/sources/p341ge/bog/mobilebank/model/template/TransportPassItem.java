package p341ge.bog.mobilebank.model.template;

import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.model.template.TransportPassItem */
public final class TransportPassItem {
    private final String logo;
    private final int orderId;
    private final String titleDictionaryKey;

    public TransportPassItem(String str, String str2, int i) {
        C41536l.m120489i(str, "logo");
        C41536l.m120489i(str2, "titleDictionaryKey");
        this.logo = str;
        this.titleDictionaryKey = str2;
        this.orderId = i;
    }

    public static /* synthetic */ TransportPassItem copy$default(TransportPassItem transportPassItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transportPassItem.logo;
        }
        if ((i2 & 2) != 0) {
            str2 = transportPassItem.titleDictionaryKey;
        }
        if ((i2 & 4) != 0) {
            i = transportPassItem.orderId;
        }
        return transportPassItem.copy(str, str2, i);
    }

    public final String component1() {
        return this.logo;
    }

    public final String component2() {
        return this.titleDictionaryKey;
    }

    public final int component3() {
        return this.orderId;
    }

    public final TransportPassItem copy(String str, String str2, int i) {
        C41536l.m120489i(str, "logo");
        C41536l.m120489i(str2, "titleDictionaryKey");
        return new TransportPassItem(str, str2, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportPassItem)) {
            return false;
        }
        TransportPassItem transportPassItem = (TransportPassItem) obj;
        return C41536l.m120484d(this.logo, transportPassItem.logo) && C41536l.m120484d(this.titleDictionaryKey, transportPassItem.titleDictionaryKey) && this.orderId == transportPassItem.orderId;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final int getOrderId() {
        return this.orderId;
    }

    public final String getTitleDictionaryKey() {
        return this.titleDictionaryKey;
    }

    public int hashCode() {
        return (((this.logo.hashCode() * 31) + this.titleDictionaryKey.hashCode()) * 31) + this.orderId;
    }

    public String toString() {
        String str = this.logo;
        String str2 = this.titleDictionaryKey;
        int i = this.orderId;
        return "TransportPassItem(logo=" + str + ", titleDictionaryKey=" + str2 + ", orderId=" + i + ")";
    }
}
