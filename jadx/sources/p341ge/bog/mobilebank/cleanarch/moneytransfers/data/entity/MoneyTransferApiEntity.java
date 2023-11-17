package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferApiEntity */
public final class MoneyTransferApiEntity {
    private final double amount;
    private final List<MoneyTransferCountryApiEntity> countries;
    private final String currency;
    private final Integer documentId;
    private final Object message;
    @C8664c(alternate = {"mtSystem"}, value = "mts")
    private final String mts;
    private final String receiverName;
    private final String sendCountry;
    private final String senderName;
    private final List<String> senders;
    private final Double totalFee;
    private final String transferNumber;

    public MoneyTransferApiEntity(double d, String str, Double d2, String str2, String str3, Integer num, List<MoneyTransferCountryApiEntity> list, Object obj, String str4, List<String> list2, String str5, String str6) {
        C41536l.m120489i(str, "senderName");
        C41536l.m120489i(str2, "receiverName");
        C41536l.m120489i(str3, "currency");
        C41536l.m120489i(str4, "sendCountry");
        C41536l.m120489i(str5, "transferNumber");
        this.amount = d;
        this.senderName = str;
        this.totalFee = d2;
        this.receiverName = str2;
        this.currency = str3;
        this.documentId = num;
        this.countries = list;
        this.message = obj;
        this.sendCountry = str4;
        this.senders = list2;
        this.transferNumber = str5;
        this.mts = str6;
    }

    public static /* synthetic */ MoneyTransferApiEntity copy$default(MoneyTransferApiEntity moneyTransferApiEntity, double d, String str, Double d2, String str2, String str3, Integer num, List list, Object obj, String str4, List list2, String str5, String str6, int i, Object obj2) {
        MoneyTransferApiEntity moneyTransferApiEntity2 = moneyTransferApiEntity;
        int i2 = i;
        return moneyTransferApiEntity.copy((i2 & 1) != 0 ? moneyTransferApiEntity2.amount : d, (i2 & 2) != 0 ? moneyTransferApiEntity2.senderName : str, (i2 & 4) != 0 ? moneyTransferApiEntity2.totalFee : d2, (i2 & 8) != 0 ? moneyTransferApiEntity2.receiverName : str2, (i2 & 16) != 0 ? moneyTransferApiEntity2.currency : str3, (i2 & 32) != 0 ? moneyTransferApiEntity2.documentId : num, (i2 & 64) != 0 ? moneyTransferApiEntity2.countries : list, (i2 & 128) != 0 ? moneyTransferApiEntity2.message : obj, (i2 & C11398b.f33139r) != 0 ? moneyTransferApiEntity2.sendCountry : str4, (i2 & C11398b.f33140s) != 0 ? moneyTransferApiEntity2.senders : list2, (i2 & C11398b.f33141t) != 0 ? moneyTransferApiEntity2.transferNumber : str5, (i2 & C11398b.f33142u) != 0 ? moneyTransferApiEntity2.mts : str6);
    }

    public final double component1() {
        return this.amount;
    }

    public final List<String> component10() {
        return this.senders;
    }

    public final String component11() {
        return this.transferNumber;
    }

    public final String component12() {
        return this.mts;
    }

    public final String component2() {
        return this.senderName;
    }

    public final Double component3() {
        return this.totalFee;
    }

    public final String component4() {
        return this.receiverName;
    }

    public final String component5() {
        return this.currency;
    }

    public final Integer component6() {
        return this.documentId;
    }

    public final List<MoneyTransferCountryApiEntity> component7() {
        return this.countries;
    }

    public final Object component8() {
        return this.message;
    }

    public final String component9() {
        return this.sendCountry;
    }

    public final MoneyTransferApiEntity copy(double d, String str, Double d2, String str2, String str3, Integer num, List<MoneyTransferCountryApiEntity> list, Object obj, String str4, List<String> list2, String str5, String str6) {
        String str7 = str;
        C41536l.m120489i(str7, "senderName");
        String str8 = str2;
        C41536l.m120489i(str8, "receiverName");
        String str9 = str3;
        C41536l.m120489i(str9, "currency");
        String str10 = str4;
        C41536l.m120489i(str10, "sendCountry");
        String str11 = str5;
        C41536l.m120489i(str11, "transferNumber");
        return new MoneyTransferApiEntity(d, str7, d2, str8, str9, num, list, obj, str10, list2, str11, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferApiEntity)) {
            return false;
        }
        MoneyTransferApiEntity moneyTransferApiEntity = (MoneyTransferApiEntity) obj;
        return Double.compare(this.amount, moneyTransferApiEntity.amount) == 0 && C41536l.m120484d(this.senderName, moneyTransferApiEntity.senderName) && C41536l.m120484d(this.totalFee, moneyTransferApiEntity.totalFee) && C41536l.m120484d(this.receiverName, moneyTransferApiEntity.receiverName) && C41536l.m120484d(this.currency, moneyTransferApiEntity.currency) && C41536l.m120484d(this.documentId, moneyTransferApiEntity.documentId) && C41536l.m120484d(this.countries, moneyTransferApiEntity.countries) && C41536l.m120484d(this.message, moneyTransferApiEntity.message) && C41536l.m120484d(this.sendCountry, moneyTransferApiEntity.sendCountry) && C41536l.m120484d(this.senders, moneyTransferApiEntity.senders) && C41536l.m120484d(this.transferNumber, moneyTransferApiEntity.transferNumber) && C41536l.m120484d(this.mts, moneyTransferApiEntity.mts);
    }

    public final double getAmount() {
        return this.amount;
    }

    public final List<MoneyTransferCountryApiEntity> getCountries() {
        return this.countries;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Integer getDocumentId() {
        return this.documentId;
    }

    public final Object getMessage() {
        return this.message;
    }

    public final String getMts() {
        return this.mts;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getSendCountry() {
        return this.sendCountry;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final List<String> getSenders() {
        return this.senders;
    }

    public final Double getTotalFee() {
        return this.totalFee;
    }

    public final String getTransferNumber() {
        return this.transferNumber;
    }

    public int hashCode() {
        int a = ((Double.doubleToLongBits(this.amount) * 31) + this.senderName.hashCode()) * 31;
        Double d = this.totalFee;
        int i = 0;
        int hashCode = (((((a + (d == null ? 0 : d.hashCode())) * 31) + this.receiverName.hashCode()) * 31) + this.currency.hashCode()) * 31;
        Integer num = this.documentId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<MoneyTransferCountryApiEntity> list = this.countries;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.message;
        int hashCode4 = (((hashCode3 + (obj == null ? 0 : obj.hashCode())) * 31) + this.sendCountry.hashCode()) * 31;
        List<String> list2 = this.senders;
        int hashCode5 = (((hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.transferNumber.hashCode()) * 31;
        String str = this.mts;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        double d = this.amount;
        String str = this.senderName;
        Double d2 = this.totalFee;
        String str2 = this.receiverName;
        String str3 = this.currency;
        Integer num = this.documentId;
        List<MoneyTransferCountryApiEntity> list = this.countries;
        Object obj = this.message;
        String str4 = this.sendCountry;
        List<String> list2 = this.senders;
        String str5 = this.transferNumber;
        String str6 = this.mts;
        return "MoneyTransferApiEntity(amount=" + d + ", senderName=" + str + ", totalFee=" + d2 + ", receiverName=" + str2 + ", currency=" + str3 + ", documentId=" + num + ", countries=" + list + ", message=" + obj + ", sendCountry=" + str4 + ", senders=" + list2 + ", transferNumber=" + str5 + ", mts=" + str6 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MoneyTransferApiEntity(double r18, java.lang.String r20, java.lang.Double r21, java.lang.String r22, java.lang.String r23, java.lang.Integer r24, java.util.List r25, java.lang.Object r26, java.lang.String r27, java.util.List r28, java.lang.String r29, java.lang.String r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r21
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r10 = r2
            goto L_0x0013
        L_0x0011:
            r10 = r24
        L_0x0013:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            r12 = r2
            goto L_0x001b
        L_0x0019:
            r12 = r26
        L_0x001b:
            r3 = r17
            r4 = r18
            r6 = r20
            r8 = r22
            r9 = r23
            r11 = r25
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferApiEntity.<init>(double, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.Object, java.lang.String, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
