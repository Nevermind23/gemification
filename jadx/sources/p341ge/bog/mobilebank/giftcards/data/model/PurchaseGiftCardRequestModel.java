package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.PurchaseGiftCardRequestModel */
public final class PurchaseGiftCardRequestModel {
    private final Long dstClientKey;
    private final String dstClientName;
    private final String dstClientPhoneNumber;
    private final Long expDate;
    private final BigDecimal giftCardAmount;
    private final String giftCardAmountCcy;
    private final String giftCardDesignName;
    private final String giftCardNomination;
    private final long giftCardOfferId;
    private final Long sendDate;
    private final long srcAcctKey;
    private final BigDecimal srcAmount;
    private final String srcAmountCcy;
    private final Long srcCardId;
    private final long srcClientKey;

    public PurchaseGiftCardRequestModel(Long l, String str, String str2, Long l2, BigDecimal bigDecimal, String str3, String str4, String str5, long j, Long l3, long j2, BigDecimal bigDecimal2, String str6, Long l4, long j3) {
        BigDecimal bigDecimal3 = bigDecimal2;
        String str7 = str6;
        C41536l.m120489i(str2, "dstClientPhoneNumber");
        C41536l.m120489i(bigDecimal, "giftCardAmount");
        C41536l.m120489i(str3, "giftCardAmountCcy");
        C41536l.m120489i(str4, "giftCardDesignName");
        C41536l.m120489i(bigDecimal3, "srcAmount");
        C41536l.m120489i(str7, "srcAmountCcy");
        this.dstClientKey = l;
        this.dstClientName = str;
        this.dstClientPhoneNumber = str2;
        this.expDate = l2;
        this.giftCardAmount = bigDecimal;
        this.giftCardAmountCcy = str3;
        this.giftCardDesignName = str4;
        this.giftCardNomination = str5;
        this.giftCardOfferId = j;
        this.sendDate = l3;
        this.srcAcctKey = j2;
        this.srcAmount = bigDecimal3;
        this.srcAmountCcy = str7;
        this.srcCardId = l4;
        this.srcClientKey = j3;
    }

    public static /* synthetic */ PurchaseGiftCardRequestModel copy$default(PurchaseGiftCardRequestModel purchaseGiftCardRequestModel, Long l, String str, String str2, Long l2, BigDecimal bigDecimal, String str3, String str4, String str5, long j, Long l3, long j2, BigDecimal bigDecimal2, String str6, Long l4, long j3, int i, Object obj) {
        PurchaseGiftCardRequestModel purchaseGiftCardRequestModel2 = purchaseGiftCardRequestModel;
        int i2 = i;
        return purchaseGiftCardRequestModel.copy((i2 & 1) != 0 ? purchaseGiftCardRequestModel2.dstClientKey : l, (i2 & 2) != 0 ? purchaseGiftCardRequestModel2.dstClientName : str, (i2 & 4) != 0 ? purchaseGiftCardRequestModel2.dstClientPhoneNumber : str2, (i2 & 8) != 0 ? purchaseGiftCardRequestModel2.expDate : l2, (i2 & 16) != 0 ? purchaseGiftCardRequestModel2.giftCardAmount : bigDecimal, (i2 & 32) != 0 ? purchaseGiftCardRequestModel2.giftCardAmountCcy : str3, (i2 & 64) != 0 ? purchaseGiftCardRequestModel2.giftCardDesignName : str4, (i2 & 128) != 0 ? purchaseGiftCardRequestModel2.giftCardNomination : str5, (i2 & C11398b.f33139r) != 0 ? purchaseGiftCardRequestModel2.giftCardOfferId : j, (i2 & C11398b.f33140s) != 0 ? purchaseGiftCardRequestModel2.sendDate : l3, (i2 & C11398b.f33141t) != 0 ? purchaseGiftCardRequestModel2.srcAcctKey : j2, (i2 & C11398b.f33142u) != 0 ? purchaseGiftCardRequestModel2.srcAmount : bigDecimal2, (i2 & C11398b.f33143v) != 0 ? purchaseGiftCardRequestModel2.srcAmountCcy : str6, (i2 & 8192) != 0 ? purchaseGiftCardRequestModel2.srcCardId : l4, (i2 & 16384) != 0 ? purchaseGiftCardRequestModel2.srcClientKey : j3);
    }

    public final Long component1() {
        return this.dstClientKey;
    }

    public final Long component10() {
        return this.sendDate;
    }

    public final long component11() {
        return this.srcAcctKey;
    }

    public final BigDecimal component12() {
        return this.srcAmount;
    }

    public final String component13() {
        return this.srcAmountCcy;
    }

    public final Long component14() {
        return this.srcCardId;
    }

    public final long component15() {
        return this.srcClientKey;
    }

    public final String component2() {
        return this.dstClientName;
    }

    public final String component3() {
        return this.dstClientPhoneNumber;
    }

    public final Long component4() {
        return this.expDate;
    }

    public final BigDecimal component5() {
        return this.giftCardAmount;
    }

    public final String component6() {
        return this.giftCardAmountCcy;
    }

    public final String component7() {
        return this.giftCardDesignName;
    }

    public final String component8() {
        return this.giftCardNomination;
    }

    public final long component9() {
        return this.giftCardOfferId;
    }

    public final PurchaseGiftCardRequestModel copy(Long l, String str, String str2, Long l2, BigDecimal bigDecimal, String str3, String str4, String str5, long j, Long l3, long j2, BigDecimal bigDecimal2, String str6, Long l4, long j3) {
        Long l5 = l;
        C41536l.m120489i(str2, "dstClientPhoneNumber");
        C41536l.m120489i(bigDecimal, "giftCardAmount");
        C41536l.m120489i(str3, "giftCardAmountCcy");
        C41536l.m120489i(str4, "giftCardDesignName");
        C41536l.m120489i(bigDecimal2, "srcAmount");
        C41536l.m120489i(str6, "srcAmountCcy");
        return new PurchaseGiftCardRequestModel(l, str, str2, l2, bigDecimal, str3, str4, str5, j, l3, j2, bigDecimal2, str6, l4, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseGiftCardRequestModel)) {
            return false;
        }
        PurchaseGiftCardRequestModel purchaseGiftCardRequestModel = (PurchaseGiftCardRequestModel) obj;
        return C41536l.m120484d(this.dstClientKey, purchaseGiftCardRequestModel.dstClientKey) && C41536l.m120484d(this.dstClientName, purchaseGiftCardRequestModel.dstClientName) && C41536l.m120484d(this.dstClientPhoneNumber, purchaseGiftCardRequestModel.dstClientPhoneNumber) && C41536l.m120484d(this.expDate, purchaseGiftCardRequestModel.expDate) && C41536l.m120484d(this.giftCardAmount, purchaseGiftCardRequestModel.giftCardAmount) && C41536l.m120484d(this.giftCardAmountCcy, purchaseGiftCardRequestModel.giftCardAmountCcy) && C41536l.m120484d(this.giftCardDesignName, purchaseGiftCardRequestModel.giftCardDesignName) && C41536l.m120484d(this.giftCardNomination, purchaseGiftCardRequestModel.giftCardNomination) && this.giftCardOfferId == purchaseGiftCardRequestModel.giftCardOfferId && C41536l.m120484d(this.sendDate, purchaseGiftCardRequestModel.sendDate) && this.srcAcctKey == purchaseGiftCardRequestModel.srcAcctKey && C41536l.m120484d(this.srcAmount, purchaseGiftCardRequestModel.srcAmount) && C41536l.m120484d(this.srcAmountCcy, purchaseGiftCardRequestModel.srcAmountCcy) && C41536l.m120484d(this.srcCardId, purchaseGiftCardRequestModel.srcCardId) && this.srcClientKey == purchaseGiftCardRequestModel.srcClientKey;
    }

    public final Long getDstClientKey() {
        return this.dstClientKey;
    }

    public final String getDstClientName() {
        return this.dstClientName;
    }

    public final String getDstClientPhoneNumber() {
        return this.dstClientPhoneNumber;
    }

    public final Long getExpDate() {
        return this.expDate;
    }

    public final BigDecimal getGiftCardAmount() {
        return this.giftCardAmount;
    }

    public final String getGiftCardAmountCcy() {
        return this.giftCardAmountCcy;
    }

    public final String getGiftCardDesignName() {
        return this.giftCardDesignName;
    }

    public final String getGiftCardNomination() {
        return this.giftCardNomination;
    }

    public final long getGiftCardOfferId() {
        return this.giftCardOfferId;
    }

    public final Long getSendDate() {
        return this.sendDate;
    }

    public final long getSrcAcctKey() {
        return this.srcAcctKey;
    }

    public final BigDecimal getSrcAmount() {
        return this.srcAmount;
    }

    public final String getSrcAmountCcy() {
        return this.srcAmountCcy;
    }

    public final Long getSrcCardId() {
        return this.srcCardId;
    }

    public final long getSrcClientKey() {
        return this.srcClientKey;
    }

    public int hashCode() {
        Long l = this.dstClientKey;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.dstClientName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.dstClientPhoneNumber.hashCode()) * 31;
        Long l2 = this.expDate;
        int hashCode3 = (((((((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.giftCardAmount.hashCode()) * 31) + this.giftCardAmountCcy.hashCode()) * 31) + this.giftCardDesignName.hashCode()) * 31;
        String str2 = this.giftCardNomination;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.giftCardOfferId)) * 31;
        Long l3 = this.sendDate;
        int hashCode5 = (((((((hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31) + C7397t.m28148a(this.srcAcctKey)) * 31) + this.srcAmount.hashCode()) * 31) + this.srcAmountCcy.hashCode()) * 31;
        Long l4 = this.srcCardId;
        if (l4 != null) {
            i = l4.hashCode();
        }
        return ((hashCode5 + i) * 31) + C7397t.m28148a(this.srcClientKey);
    }

    public String toString() {
        Long l = this.dstClientKey;
        String str = this.dstClientName;
        String str2 = this.dstClientPhoneNumber;
        Long l2 = this.expDate;
        BigDecimal bigDecimal = this.giftCardAmount;
        String str3 = this.giftCardAmountCcy;
        String str4 = this.giftCardDesignName;
        String str5 = this.giftCardNomination;
        long j = this.giftCardOfferId;
        Long l3 = this.sendDate;
        long j2 = this.srcAcctKey;
        BigDecimal bigDecimal2 = this.srcAmount;
        String str6 = this.srcAmountCcy;
        BigDecimal bigDecimal3 = bigDecimal2;
        long j3 = this.srcClientKey;
        return "PurchaseGiftCardRequestModel(dstClientKey=" + l + ", dstClientName=" + str + ", dstClientPhoneNumber=" + str2 + ", expDate=" + l2 + ", giftCardAmount=" + bigDecimal + ", giftCardAmountCcy=" + str3 + ", giftCardDesignName=" + str4 + ", giftCardNomination=" + str5 + ", giftCardOfferId=" + j + ", sendDate=" + l3 + ", srcAcctKey=" + j2 + ", srcAmount=" + bigDecimal3 + ", srcAmountCcy=" + str6 + ", srcCardId=" + this.srcCardId + ", srcClientKey=" + j3 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PurchaseGiftCardRequestModel(java.lang.Long r23, java.lang.String r24, java.lang.String r25, java.lang.Long r26, java.math.BigDecimal r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, long r31, java.lang.Long r33, long r34, java.math.BigDecimal r36, java.lang.String r37, java.lang.Long r38, long r39, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            r22 = this;
            r0 = r41
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r24
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r26
        L_0x0013:
            r0 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x001a
            r19 = r2
            goto L_0x001c
        L_0x001a:
            r19 = r38
        L_0x001c:
            r3 = r22
            r4 = r23
            r6 = r25
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r14 = r33
            r15 = r34
            r17 = r36
            r18 = r37
            r20 = r39
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r15, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.giftcards.data.model.PurchaseGiftCardRequestModel.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.math.BigDecimal, java.lang.String, java.lang.String, java.lang.String, long, java.lang.Long, long, java.math.BigDecimal, java.lang.String, java.lang.Long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
