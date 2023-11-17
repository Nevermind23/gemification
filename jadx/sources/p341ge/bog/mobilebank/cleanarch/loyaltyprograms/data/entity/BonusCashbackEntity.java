package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusCashbackEntity */
public final class BonusCashbackEntity {
    private long acctKey;
    private String acctNo;
    private BigDecimal cashbackAccrualAmount;
    private Long cashbackAccrualDate;
    private BigDecimal cashbackCalcAmount;
    private Long cashbackStartDate;
    private String ccy;
    private long clientKey;

    /* renamed from: id */
    private long f56691id;
    private Long lastTransferDate;
    private long productKey;

    public BonusCashbackEntity() {
        this(0, 0, 0, (BigDecimal) null, (Long) null, (Long) null, (BigDecimal) null, (Long) null, 0, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusCashbackEntity copy$default(BonusCashbackEntity bonusCashbackEntity, long j, long j2, long j3, BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, Long l3, long j4, String str, String str2, int i, Object obj) {
        BonusCashbackEntity bonusCashbackEntity2 = bonusCashbackEntity;
        int i2 = i;
        return bonusCashbackEntity.copy((i2 & 1) != 0 ? bonusCashbackEntity2.f56691id : j, (i2 & 2) != 0 ? bonusCashbackEntity2.clientKey : j2, (i2 & 4) != 0 ? bonusCashbackEntity2.productKey : j3, (i2 & 8) != 0 ? bonusCashbackEntity2.cashbackCalcAmount : bigDecimal, (i2 & 16) != 0 ? bonusCashbackEntity2.cashbackStartDate : l, (i2 & 32) != 0 ? bonusCashbackEntity2.cashbackAccrualDate : l2, (i2 & 64) != 0 ? bonusCashbackEntity2.cashbackAccrualAmount : bigDecimal2, (i2 & 128) != 0 ? bonusCashbackEntity2.lastTransferDate : l3, (i2 & C11398b.f33139r) != 0 ? bonusCashbackEntity2.acctKey : j4, (i2 & C11398b.f33140s) != 0 ? bonusCashbackEntity2.acctNo : str, (i2 & C11398b.f33141t) != 0 ? bonusCashbackEntity2.ccy : str2);
    }

    public final long component1() {
        return this.f56691id;
    }

    public final String component10() {
        return this.acctNo;
    }

    public final String component11() {
        return this.ccy;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final long component3() {
        return this.productKey;
    }

    public final BigDecimal component4() {
        return this.cashbackCalcAmount;
    }

    public final Long component5() {
        return this.cashbackStartDate;
    }

    public final Long component6() {
        return this.cashbackAccrualDate;
    }

    public final BigDecimal component7() {
        return this.cashbackAccrualAmount;
    }

    public final Long component8() {
        return this.lastTransferDate;
    }

    public final long component9() {
        return this.acctKey;
    }

    public final BonusCashbackEntity copy(long j, long j2, long j3, BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, Long l3, long j4, String str, String str2) {
        return new BonusCashbackEntity(j, j2, j3, bigDecimal, l, l2, bigDecimal2, l3, j4, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusCashbackEntity)) {
            return false;
        }
        BonusCashbackEntity bonusCashbackEntity = (BonusCashbackEntity) obj;
        return this.f56691id == bonusCashbackEntity.f56691id && this.clientKey == bonusCashbackEntity.clientKey && this.productKey == bonusCashbackEntity.productKey && C41536l.m120484d(this.cashbackCalcAmount, bonusCashbackEntity.cashbackCalcAmount) && C41536l.m120484d(this.cashbackStartDate, bonusCashbackEntity.cashbackStartDate) && C41536l.m120484d(this.cashbackAccrualDate, bonusCashbackEntity.cashbackAccrualDate) && C41536l.m120484d(this.cashbackAccrualAmount, bonusCashbackEntity.cashbackAccrualAmount) && C41536l.m120484d(this.lastTransferDate, bonusCashbackEntity.lastTransferDate) && this.acctKey == bonusCashbackEntity.acctKey && C41536l.m120484d(this.acctNo, bonusCashbackEntity.acctNo) && C41536l.m120484d(this.ccy, bonusCashbackEntity.ccy);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final BigDecimal getCashbackAccrualAmount() {
        return this.cashbackAccrualAmount;
    }

    public final Long getCashbackAccrualDate() {
        return this.cashbackAccrualDate;
    }

    public final BigDecimal getCashbackCalcAmount() {
        return this.cashbackCalcAmount;
    }

    public final Long getCashbackStartDate() {
        return this.cashbackStartDate;
    }

    public final String getCcy() {
        return this.ccy;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getId() {
        return this.f56691id;
    }

    public final Long getLastTransferDate() {
        return this.lastTransferDate;
    }

    public final long getProductKey() {
        return this.productKey;
    }

    public int hashCode() {
        int a = ((((C7397t.m28148a(this.f56691id) * 31) + C7397t.m28148a(this.clientKey)) * 31) + C7397t.m28148a(this.productKey)) * 31;
        BigDecimal bigDecimal = this.cashbackCalcAmount;
        int i = 0;
        int hashCode = (a + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l = this.cashbackStartDate;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.cashbackAccrualDate;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.cashbackAccrualAmount;
        int hashCode4 = (hashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l3 = this.lastTransferDate;
        int hashCode5 = (((hashCode4 + (l3 == null ? 0 : l3.hashCode())) * 31) + C7397t.m28148a(this.acctKey)) * 31;
        String str = this.acctNo;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ccy;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode6 + i;
    }

    public final void setAcctKey(long j) {
        this.acctKey = j;
    }

    public final void setAcctNo(String str) {
        this.acctNo = str;
    }

    public final void setCashbackAccrualAmount(BigDecimal bigDecimal) {
        this.cashbackAccrualAmount = bigDecimal;
    }

    public final void setCashbackAccrualDate(Long l) {
        this.cashbackAccrualDate = l;
    }

    public final void setCashbackCalcAmount(BigDecimal bigDecimal) {
        this.cashbackCalcAmount = bigDecimal;
    }

    public final void setCashbackStartDate(Long l) {
        this.cashbackStartDate = l;
    }

    public final void setCcy(String str) {
        this.ccy = str;
    }

    public final void setClientKey(long j) {
        this.clientKey = j;
    }

    public final void setId(long j) {
        this.f56691id = j;
    }

    public final void setLastTransferDate(Long l) {
        this.lastTransferDate = l;
    }

    public final void setProductKey(long j) {
        this.productKey = j;
    }

    public String toString() {
        long j = this.f56691id;
        long j2 = this.clientKey;
        long j3 = this.productKey;
        BigDecimal bigDecimal = this.cashbackCalcAmount;
        Long l = this.cashbackStartDate;
        Long l2 = this.cashbackAccrualDate;
        BigDecimal bigDecimal2 = this.cashbackAccrualAmount;
        Long l3 = this.lastTransferDate;
        long j4 = this.acctKey;
        String str = this.acctNo;
        String str2 = this.ccy;
        return "BonusCashbackEntity(id=" + j + ", clientKey=" + j2 + ", productKey=" + j3 + ", cashbackCalcAmount=" + bigDecimal + ", cashbackStartDate=" + l + ", cashbackAccrualDate=" + l2 + ", cashbackAccrualAmount=" + bigDecimal2 + ", lastTransferDate=" + l3 + ", acctKey=" + j4 + ", acctNo=" + str + ", ccy=" + str2 + ")";
    }

    public BonusCashbackEntity(long j, long j2, long j3, BigDecimal bigDecimal, Long l, Long l2, BigDecimal bigDecimal2, Long l3, long j4, String str, String str2) {
        this.f56691id = j;
        this.clientKey = j2;
        this.productKey = j3;
        this.cashbackCalcAmount = bigDecimal;
        this.cashbackStartDate = l;
        this.cashbackAccrualDate = l2;
        this.cashbackAccrualAmount = bigDecimal2;
        this.lastTransferDate = l3;
        this.acctKey = j4;
        this.acctNo = str;
        this.ccy = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusCashbackEntity(long r17, long r19, long r21, java.math.BigDecimal r23, java.lang.Long r24, java.lang.Long r25, java.math.BigDecimal r26, java.lang.Long r27, long r28, java.lang.String r30, java.lang.String r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r17
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r19
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r8 = r2
            goto L_0x001c
        L_0x001a:
            r8 = r21
        L_0x001c:
            r1 = r0 & 8
            r10 = 0
            if (r1 == 0) goto L_0x0023
            r1 = r10
            goto L_0x0025
        L_0x0023:
            r1 = r23
        L_0x0025:
            r11 = r0 & 16
            if (r11 == 0) goto L_0x002b
            r11 = r10
            goto L_0x002d
        L_0x002b:
            r11 = r24
        L_0x002d:
            r12 = r0 & 32
            if (r12 == 0) goto L_0x0033
            r12 = r10
            goto L_0x0035
        L_0x0033:
            r12 = r25
        L_0x0035:
            r13 = r0 & 64
            if (r13 == 0) goto L_0x003b
            r13 = r10
            goto L_0x003d
        L_0x003b:
            r13 = r26
        L_0x003d:
            r14 = r0 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0043
            r14 = r10
            goto L_0x0045
        L_0x0043:
            r14 = r27
        L_0x0045:
            r15 = r0 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r2 = r28
        L_0x004c:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0052
            r15 = r10
            goto L_0x0054
        L_0x0052:
            r15 = r30
        L_0x0054:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r10 = r31
        L_0x005b:
            r17 = r16
            r18 = r4
            r20 = r6
            r22 = r8
            r24 = r1
            r25 = r11
            r26 = r12
            r27 = r13
            r28 = r14
            r29 = r2
            r31 = r15
            r32 = r10
            r17.<init>(r18, r20, r22, r24, r25, r26, r27, r28, r29, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusCashbackEntity.<init>(long, long, long, java.math.BigDecimal, java.lang.Long, java.lang.Long, java.math.BigDecimal, java.lang.Long, long, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
