package p341ge.bog.mobilebank.model;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.DispatchType */
public class DispatchType {
    String dictionaryKey;
    String dispatchType;
    String tooltipDictionaryKey;

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public String getDispatchType() {
        return this.dispatchType;
    }

    public String getTooltipDictionaryKey() {
        return this.tooltipDictionaryKey;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setDispatchType(String str) {
        this.dispatchType = str;
    }

    public void setTooltipDictionaryKey(String str) {
        this.tooltipDictionaryKey = str;
    }
}
