package p341ge.bog.mobilebank.model.foreigntransfer;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.foreigntransfer.ForeignBank */
public class ForeignBank {
    private String address;
    private String bankName;
    private String branch;
    private String city;
    private TransferCountryCode countryCode;
    private String swift;
    private int totalCount;

    public String getAddress() {
        return this.address;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBranch() {
        return this.branch;
    }

    public String getCity() {
        return this.city;
    }

    public TransferCountryCode getCountryCode() {
        return this.countryCode;
    }

    public String getSwift() {
        return this.swift;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryCode(TransferCountryCode transferCountryCode) {
        this.countryCode = transferCountryCode;
    }

    public void setSwift(String str) {
        this.swift = str;
    }

    public void setTotalCount(int i) {
        this.totalCount = i;
    }
}
