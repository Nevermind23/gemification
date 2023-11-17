package p341ge.bog.mobilebank.model.datareport;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.datareport.DataReportHeader */
public class DataReportHeader {
    private List<String> appPermissions;
    private String carrier;
    private String deviceID;
    private String deviceManufacturer;
    private String deviceModel;
    private String deviceOS;
    private long phoneDate;
    private String simPhoneNumber;

    public List<String> getAppPermissions() {
        return this.appPermissions;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getDeviceID() {
        return this.deviceID;
    }

    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public String getDeviceModel() {
        return this.deviceModel;
    }

    public String getDeviceOS() {
        return this.deviceOS;
    }

    public long getPhoneDate() {
        return this.phoneDate;
    }

    public String getSimPhoneNumber() {
        return this.simPhoneNumber;
    }

    public void setAppPermissions(List<String> list) {
        this.appPermissions = list;
    }

    public void setCarrier(String str) {
        this.carrier = str;
    }

    public void setDeviceID(String str) {
        this.deviceID = str;
    }

    public void setDeviceManufacturer(String str) {
        this.deviceManufacturer = str;
    }

    public void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public void setDeviceOS(String str) {
        this.deviceOS = str;
    }

    public void setPhoneDate(long j) {
        this.phoneDate = j;
    }

    public void setSimPhoneNumber(String str) {
        this.simPhoneNumber = str;
    }

    public String toString() {
        return "DataReportHeader{appPermissions=" + this.appPermissions + ", deviceID='" + this.deviceID + '\'' + ", deviceManufacturer='" + this.deviceManufacturer + '\'' + ", deviceOS='" + this.deviceOS + '\'' + ", simPhoneNumber='" + this.simPhoneNumber + '\'' + ", carrier='" + this.carrier + '\'' + ", phoneDate=" + this.phoneDate + ", deviceModel='" + this.deviceModel + '\'' + '}';
    }
}
