package p341ge.bog.mobilebank.model.datareport;

/* renamed from: ge.bog.mobilebank.model.datareport.DeviceDataReport */
public class DeviceDataReport {
    private AppsDataReport apps;
    private transient long calculationEndDate = -1;
    private DataReportHeader header;
    private LocationDataReport location;
    private MediaDataReport media;
    private PhoneDataReport phoneReport;
    private SmsDataReport smsReport;
    private WifiDataReport wifi;

    public long getCalculationEndDate() {
        return this.calculationEndDate;
    }

    public void setApps(AppsDataReport appsDataReport) {
        this.apps = appsDataReport;
    }

    public void setCalculationEndDate(long j) {
        this.calculationEndDate = j;
    }

    public void setHeader(DataReportHeader dataReportHeader) {
        this.header = dataReportHeader;
    }

    public void setLocation(LocationDataReport locationDataReport) {
        this.location = locationDataReport;
    }

    public void setMedia(MediaDataReport mediaDataReport) {
        this.media = mediaDataReport;
    }

    public void setPhoneReport(PhoneDataReport phoneDataReport) {
        this.phoneReport = phoneDataReport;
    }

    public void setSmsReport(SmsDataReport smsDataReport) {
        this.smsReport = smsDataReport;
    }

    public void setWifi(WifiDataReport wifiDataReport) {
        this.wifi = wifiDataReport;
    }

    public String toString() {
        return "DeviceDataReport{header=" + this.header + ", location=" + this.location + ", wifi=" + this.wifi + ", smsReport=" + this.smsReport + ", phoneReport=" + this.phoneReport + ", apps=" + this.apps + ", media=" + this.media + '}';
    }
}
