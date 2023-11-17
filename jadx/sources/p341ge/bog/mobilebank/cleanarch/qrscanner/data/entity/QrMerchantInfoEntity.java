package p341ge.bog.mobilebank.cleanarch.qrscanner.data.entity;

import androidx.annotation.Keep;
import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.qrscanner.data.entity.QrMerchantInfoEntity */
public final class QrMerchantInfoEntity {
    private final String deviceId;
    private C24978b isValid;
    private final String merchantName;
    private final String merchantNameInt;

    public QrMerchantInfoEntity(C24978b bVar, String str, String str2, String str3) {
        this.isValid = bVar;
        this.merchantNameInt = str;
        this.merchantName = str2;
        this.deviceId = str3;
    }

    public static /* synthetic */ QrMerchantInfoEntity copy$default(QrMerchantInfoEntity qrMerchantInfoEntity, C24978b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = qrMerchantInfoEntity.isValid;
        }
        if ((i & 2) != 0) {
            str = qrMerchantInfoEntity.merchantNameInt;
        }
        if ((i & 4) != 0) {
            str2 = qrMerchantInfoEntity.merchantName;
        }
        if ((i & 8) != 0) {
            str3 = qrMerchantInfoEntity.deviceId;
        }
        return qrMerchantInfoEntity.copy(bVar, str, str2, str3);
    }

    public final C24978b component1() {
        return this.isValid;
    }

    public final String component2() {
        return this.merchantNameInt;
    }

    public final String component3() {
        return this.merchantName;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final QrMerchantInfoEntity copy(C24978b bVar, String str, String str2, String str3) {
        return new QrMerchantInfoEntity(bVar, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QrMerchantInfoEntity)) {
            return false;
        }
        QrMerchantInfoEntity qrMerchantInfoEntity = (QrMerchantInfoEntity) obj;
        return this.isValid == qrMerchantInfoEntity.isValid && C41536l.m120484d(this.merchantNameInt, qrMerchantInfoEntity.merchantNameInt) && C41536l.m120484d(this.merchantName, qrMerchantInfoEntity.merchantName) && C41536l.m120484d(this.deviceId, qrMerchantInfoEntity.deviceId);
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getMerchantNameInt() {
        return this.merchantNameInt;
    }

    public int hashCode() {
        C24978b bVar = this.isValid;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.merchantNameInt;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.merchantName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.deviceId;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final C24978b isValid() {
        return this.isValid;
    }

    public final void setValid(C24978b bVar) {
        this.isValid = bVar;
    }

    public String toString() {
        C24978b bVar = this.isValid;
        String str = this.merchantNameInt;
        String str2 = this.merchantName;
        String str3 = this.deviceId;
        return "QrMerchantInfoEntity(isValid=" + bVar + ", merchantNameInt=" + str + ", merchantName=" + str2 + ", deviceId=" + str3 + ")";
    }
}
