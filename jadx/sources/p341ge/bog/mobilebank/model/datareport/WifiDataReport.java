package p341ge.bog.mobilebank.model.datareport;

/* renamed from: ge.bog.mobilebank.model.datareport.WifiDataReport */
public class WifiDataReport {
    private String eventType;
    private String macAddress;
    private int networkId;
    private String ssid;

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setMacAddress(String str) {
        this.macAddress = str;
    }

    public void setNetworkId(int i) {
        this.networkId = i;
    }

    public void setSsid(String str) {
        this.ssid = str;
    }

    public String toString() {
        return "WifiDataReport{eventType=" + this.eventType + ", macAddress='" + this.macAddress + '\'' + ", networkId=" + this.networkId + ", ssid='" + this.ssid + '\'' + '}';
    }
}
