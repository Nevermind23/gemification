package p341ge.bog.mobilebank.p975ui.model.qrpay;

import org.parceler.Parcel;

@Parcel
/* renamed from: ge.bog.mobilebank.ui.model.qrpay.QrId */
public class QrId {

    /* renamed from: id */
    String f86304id;
    String issuer;
    String type;
    String version;

    public String getId() {
        return this.f86304id;
    }

    public String getIssuer() {
        return this.issuer;
    }

    public String getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setId(String str) {
        this.f86304id = str;
    }

    public void setIssuer(String str) {
        this.issuer = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
