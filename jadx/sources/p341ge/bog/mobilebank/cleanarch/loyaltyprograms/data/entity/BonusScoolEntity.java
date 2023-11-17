package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusScoolEntity */
public final class BonusScoolEntity {
    private final long acctKey;
    private final String cardHolder;
    private final long cardId;
    private final String cardName;
    private final long childClientKey;
    private final String dictionaryKey;
    private final long expDate;
    private final String lastFour;
    private final String mainCcy;
    private final String productCode;
    private final int sclPoints;
    private final String subProductCode;

    public BonusScoolEntity() {
        this(0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, C11051p3.f31758b, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusScoolEntity copy$default(BonusScoolEntity bonusScoolEntity, long j, long j2, long j3, int i, String str, String str2, String str3, String str4, long j4, String str5, String str6, String str7, int i2, Object obj) {
        BonusScoolEntity bonusScoolEntity2 = bonusScoolEntity;
        int i3 = i2;
        return bonusScoolEntity.copy((i3 & 1) != 0 ? bonusScoolEntity2.cardId : j, (i3 & 2) != 0 ? bonusScoolEntity2.acctKey : j2, (i3 & 4) != 0 ? bonusScoolEntity2.childClientKey : j3, (i3 & 8) != 0 ? bonusScoolEntity2.sclPoints : i, (i3 & 16) != 0 ? bonusScoolEntity2.cardName : str, (i3 & 32) != 0 ? bonusScoolEntity2.productCode : str2, (i3 & 64) != 0 ? bonusScoolEntity2.subProductCode : str3, (i3 & 128) != 0 ? bonusScoolEntity2.cardHolder : str4, (i3 & C11398b.f33139r) != 0 ? bonusScoolEntity2.expDate : j4, (i3 & C11398b.f33140s) != 0 ? bonusScoolEntity2.lastFour : str5, (i3 & C11398b.f33141t) != 0 ? bonusScoolEntity2.mainCcy : str6, (i3 & C11398b.f33142u) != 0 ? bonusScoolEntity2.dictionaryKey : str7);
    }

    public final long component1() {
        return this.cardId;
    }

    public final String component10() {
        return this.lastFour;
    }

    public final String component11() {
        return this.mainCcy;
    }

    public final String component12() {
        return this.dictionaryKey;
    }

    public final long component2() {
        return this.acctKey;
    }

    public final long component3() {
        return this.childClientKey;
    }

    public final int component4() {
        return this.sclPoints;
    }

    public final String component5() {
        return this.cardName;
    }

    public final String component6() {
        return this.productCode;
    }

    public final String component7() {
        return this.subProductCode;
    }

    public final String component8() {
        return this.cardHolder;
    }

    public final long component9() {
        return this.expDate;
    }

    public final BonusScoolEntity copy(long j, long j2, long j3, int i, String str, String str2, String str3, String str4, long j4, String str5, String str6, String str7) {
        return new BonusScoolEntity(j, j2, j3, i, str, str2, str3, str4, j4, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusScoolEntity)) {
            return false;
        }
        BonusScoolEntity bonusScoolEntity = (BonusScoolEntity) obj;
        return this.cardId == bonusScoolEntity.cardId && this.acctKey == bonusScoolEntity.acctKey && this.childClientKey == bonusScoolEntity.childClientKey && this.sclPoints == bonusScoolEntity.sclPoints && C41536l.m120484d(this.cardName, bonusScoolEntity.cardName) && C41536l.m120484d(this.productCode, bonusScoolEntity.productCode) && C41536l.m120484d(this.subProductCode, bonusScoolEntity.subProductCode) && C41536l.m120484d(this.cardHolder, bonusScoolEntity.cardHolder) && this.expDate == bonusScoolEntity.expDate && C41536l.m120484d(this.lastFour, bonusScoolEntity.lastFour) && C41536l.m120484d(this.mainCcy, bonusScoolEntity.mainCcy) && C41536l.m120484d(this.dictionaryKey, bonusScoolEntity.dictionaryKey);
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getCardHolder() {
        return this.cardHolder;
    }

    public final long getCardId() {
        return this.cardId;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final long getChildClientKey() {
        return this.childClientKey;
    }

    public final String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public final long getExpDate() {
        return this.expDate;
    }

    public final String getLastFour() {
        return this.lastFour;
    }

    public final String getMainCcy() {
        return this.mainCcy;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final int getSclPoints() {
        return this.sclPoints;
    }

    public final String getSubProductCode() {
        return this.subProductCode;
    }

    public int hashCode() {
        int a = ((((((C7397t.m28148a(this.cardId) * 31) + C7397t.m28148a(this.acctKey)) * 31) + C7397t.m28148a(this.childClientKey)) * 31) + this.sclPoints) * 31;
        String str = this.cardName;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subProductCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardHolder;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + C7397t.m28148a(this.expDate)) * 31;
        String str5 = this.lastFour;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.mainCcy;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.dictionaryKey;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    public String toString() {
        long j = this.cardId;
        long j2 = this.acctKey;
        long j3 = this.childClientKey;
        int i = this.sclPoints;
        String str = this.cardName;
        String str2 = this.productCode;
        String str3 = this.subProductCode;
        String str4 = this.cardHolder;
        long j4 = this.expDate;
        String str5 = this.lastFour;
        String str6 = this.mainCcy;
        String str7 = this.dictionaryKey;
        return "BonusScoolEntity(cardId=" + j + ", acctKey=" + j2 + ", childClientKey=" + j3 + ", sclPoints=" + i + ", cardName=" + str + ", productCode=" + str2 + ", subProductCode=" + str3 + ", cardHolder=" + str4 + ", expDate=" + j4 + ", lastFour=" + str5 + ", mainCcy=" + str6 + ", dictionaryKey=" + str7 + ")";
    }

    public BonusScoolEntity(long j, long j2, long j3, int i, String str, String str2, String str3, String str4, long j4, String str5, String str6, String str7) {
        this.cardId = j;
        this.acctKey = j2;
        this.childClientKey = j3;
        this.sclPoints = i;
        this.cardName = str;
        this.productCode = str2;
        this.subProductCode = str3;
        this.cardHolder = str4;
        this.expDate = j4;
        this.lastFour = str5;
        this.mainCcy = str6;
        this.dictionaryKey = str7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusScoolEntity(long r17, long r19, long r21, int r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, long r28, java.lang.String r30, java.lang.String r31, java.lang.String r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r16 = this;
            r0 = r33
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
            if (r1 == 0) goto L_0x0022
            r1 = 0
            goto L_0x0024
        L_0x0022:
            r1 = r23
        L_0x0024:
            r10 = r0 & 16
            if (r10 == 0) goto L_0x002a
            r10 = 0
            goto L_0x002c
        L_0x002a:
            r10 = r24
        L_0x002c:
            r12 = r0 & 32
            if (r12 == 0) goto L_0x0032
            r12 = 0
            goto L_0x0034
        L_0x0032:
            r12 = r25
        L_0x0034:
            r13 = r0 & 64
            if (r13 == 0) goto L_0x003a
            r13 = 0
            goto L_0x003c
        L_0x003a:
            r13 = r26
        L_0x003c:
            r14 = r0 & 128(0x80, float:1.794E-43)
            if (r14 == 0) goto L_0x0042
            r14 = 0
            goto L_0x0044
        L_0x0042:
            r14 = r27
        L_0x0044:
            r15 = r0 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r2 = r28
        L_0x004b:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0051
            r15 = 0
            goto L_0x0053
        L_0x0051:
            r15 = r30
        L_0x0053:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0059
            r11 = 0
            goto L_0x005b
        L_0x0059:
            r11 = r31
        L_0x005b:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0061
            r0 = 0
            goto L_0x0063
        L_0x0061:
            r0 = r32
        L_0x0063:
            r17 = r16
            r18 = r4
            r20 = r6
            r22 = r8
            r24 = r1
            r25 = r10
            r26 = r12
            r27 = r13
            r28 = r14
            r29 = r2
            r31 = r15
            r32 = r11
            r33 = r0
            r17.<init>(r18, r20, r22, r24, r25, r26, r27, r28, r29, r31, r32, r33)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusScoolEntity.<init>(long, long, long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
