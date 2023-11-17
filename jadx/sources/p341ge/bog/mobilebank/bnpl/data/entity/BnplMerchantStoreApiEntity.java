package p341ge.bog.mobilebank.bnpl.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.bnpl.data.entity.BnplMerchantStoreApiEntity */
public final class BnplMerchantStoreApiEntity {
    private final String addressEN;
    private final String addressGE;
    private final long clientId;
    private final long merchantId;
    private final String qrCode;
    private final String qrSource;

    public BnplMerchantStoreApiEntity(long j, long j2, String str, String str2, String str3, String str4) {
        this.merchantId = j;
        this.clientId = j2;
        this.addressGE = str;
        this.addressEN = str2;
        this.qrCode = str3;
        this.qrSource = str4;
    }

    public static /* synthetic */ BnplMerchantStoreApiEntity copy$default(BnplMerchantStoreApiEntity bnplMerchantStoreApiEntity, long j, long j2, String str, String str2, String str3, String str4, int i, Object obj) {
        BnplMerchantStoreApiEntity bnplMerchantStoreApiEntity2 = bnplMerchantStoreApiEntity;
        return bnplMerchantStoreApiEntity.copy((i & 1) != 0 ? bnplMerchantStoreApiEntity2.merchantId : j, (i & 2) != 0 ? bnplMerchantStoreApiEntity2.clientId : j2, (i & 4) != 0 ? bnplMerchantStoreApiEntity2.addressGE : str, (i & 8) != 0 ? bnplMerchantStoreApiEntity2.addressEN : str2, (i & 16) != 0 ? bnplMerchantStoreApiEntity2.qrCode : str3, (i & 32) != 0 ? bnplMerchantStoreApiEntity2.qrSource : str4);
    }

    public final long component1() {
        return this.merchantId;
    }

    public final long component2() {
        return this.clientId;
    }

    public final String component3() {
        return this.addressGE;
    }

    public final String component4() {
        return this.addressEN;
    }

    public final String component5() {
        return this.qrCode;
    }

    public final String component6() {
        return this.qrSource;
    }

    public final BnplMerchantStoreApiEntity copy(long j, long j2, String str, String str2, String str3, String str4) {
        return new BnplMerchantStoreApiEntity(j, j2, str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BnplMerchantStoreApiEntity)) {
            return false;
        }
        BnplMerchantStoreApiEntity bnplMerchantStoreApiEntity = (BnplMerchantStoreApiEntity) obj;
        return this.merchantId == bnplMerchantStoreApiEntity.merchantId && this.clientId == bnplMerchantStoreApiEntity.clientId && C41536l.m120484d(this.addressGE, bnplMerchantStoreApiEntity.addressGE) && C41536l.m120484d(this.addressEN, bnplMerchantStoreApiEntity.addressEN) && C41536l.m120484d(this.qrCode, bnplMerchantStoreApiEntity.qrCode) && C41536l.m120484d(this.qrSource, bnplMerchantStoreApiEntity.qrSource);
    }

    public final String getAddressEN() {
        return this.addressEN;
    }

    public final String getAddressGE() {
        return this.addressGE;
    }

    public final long getClientId() {
        return this.clientId;
    }

    public final long getMerchantId() {
        return this.merchantId;
    }

    public final String getQrCode() {
        return this.qrCode;
    }

    public final String getQrSource() {
        return this.qrSource;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.merchantId) * 31) + C7397t.m28148a(this.clientId)) * 31;
        String str = this.addressGE;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressEN;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.qrCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.qrSource;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        long j = this.merchantId;
        long j2 = this.clientId;
        String str = this.addressGE;
        String str2 = this.addressEN;
        String str3 = this.qrCode;
        String str4 = this.qrSource;
        return "BnplMerchantStoreApiEntity(merchantId=" + j + ", clientId=" + j2 + ", addressGE=" + str + ", addressEN=" + str2 + ", qrCode=" + str3 + ", qrSource=" + str4 + ")";
    }
}
