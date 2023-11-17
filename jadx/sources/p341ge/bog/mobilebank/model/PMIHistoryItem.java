package p341ge.bog.mobilebank.model;

import org.parceler.Parcel;
import p341ge.bog.mobilebank.model.foreigntransfer.ForeignBank;
import p341ge.bog.mobilebank.model.foreigntransfer.ReportingCode;

@Parcel
/* renamed from: ge.bog.mobilebank.model.PMIHistoryItem */
public class PMIHistoryItem {
    public ForeignBank benefBank;
    public boolean benefBankNeeded = false;
    public BogCountry benefCountry;
    public boolean benefCountryNeeded = false;
    public ForeignBank intBank;
    public boolean intBankNeeded = false;
    public ReportingCode reportingCode;
    public boolean reportingCodeNeeded = false;

    public boolean isAllSet() {
        return (!this.benefCountryNeeded || this.benefCountry != null) && (!this.reportingCodeNeeded || this.reportingCode != null) && ((!this.benefBankNeeded || this.benefBank != null) && (!this.intBankNeeded || this.intBank != null));
    }

    public void reset() {
        this.benefCountryNeeded = false;
        this.reportingCodeNeeded = false;
        this.benefBankNeeded = false;
        this.intBankNeeded = false;
    }
}
