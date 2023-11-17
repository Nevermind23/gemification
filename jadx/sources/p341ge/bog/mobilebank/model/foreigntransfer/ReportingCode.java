package p341ge.bog.mobilebank.model.foreigntransfer;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.model.foreigntransfer.ReportingCode */
public class ReportingCode {
    private String countryCode;
    private String description;
    private String descriptionEn;
    private String descriptionGe;

    /* renamed from: id */
    private long f81320id;
    private String reportingCode;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDescriptionEn() {
        return this.descriptionEn;
    }

    public String getDescriptionGe() {
        return this.descriptionGe;
    }

    public long getId() {
        return this.f81320id;
    }

    public String getReportingCode() {
        return this.reportingCode;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDescriptionEn(String str) {
        this.descriptionEn = str;
    }

    public void setDescriptionGe(String str) {
        this.descriptionGe = str;
    }

    public void setId(long j) {
        this.f81320id = j;
    }

    public void setReportingCode(String str) {
        this.reportingCode = str;
    }
}
