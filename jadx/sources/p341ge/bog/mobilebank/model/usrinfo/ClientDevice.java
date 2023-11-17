package p341ge.bog.mobilebank.model.usrinfo;

import hd0.C24978b;

/* renamed from: ge.bog.mobilebank.model.usrinfo.ClientDevice */
public class ClientDevice {
    private String defaultContact;
    private String device;
    private String deviceReference;
    private C24978b isThisSession;
    private C24978b isTrusted;
    private String mobile;
    private String route;

    public String getDevice() {
        return this.device;
    }

    public String getDeviceReference() {
        return this.deviceReference;
    }

    public C24978b getIsThisSession() {
        return this.isThisSession;
    }

    public C24978b getIsTrusted() {
        return this.isTrusted;
    }

    public String getMobile() {
        return this.mobile;
    }

    public boolean isDefaultContact() {
        String str = this.defaultContact;
        return str != null && str.equalsIgnoreCase("Y");
    }

    public void setDefaultContact(String str) {
        this.defaultContact = str;
    }

    public void setIsTrusted(C24978b bVar) {
        this.isTrusted = bVar;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setRoute(String str) {
        this.route = str;
    }
}
