package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusDepositAccountEntity */
public final class BonusDepositAccountEntity {
    private final String acctDesc;
    private final long acctKey;
    private final String acctNo;
    private final Double agreeBalance;
    private final String agreeCcy;
    private final long agreeKey;
    private final String agreeNo;
    private final String agreeType;
    private final String clientKey;
    private final String depositAgreeType;
    private final String depositTypeDictionaryKey;
    private final String name;

    public BonusDepositAccountEntity(String str, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, Double d, String str9) {
        this.clientKey = str;
        this.agreeType = str2;
        this.agreeKey = j;
        this.agreeCcy = str3;
        this.agreeNo = str4;
        this.acctKey = j2;
        this.name = str5;
        this.acctNo = str6;
        this.acctDesc = str7;
        this.depositAgreeType = str8;
        this.agreeBalance = d;
        this.depositTypeDictionaryKey = str9;
    }

    public static /* synthetic */ BonusDepositAccountEntity copy$default(BonusDepositAccountEntity bonusDepositAccountEntity, String str, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, Double d, String str9, int i, Object obj) {
        BonusDepositAccountEntity bonusDepositAccountEntity2 = bonusDepositAccountEntity;
        int i2 = i;
        return bonusDepositAccountEntity.copy((i2 & 1) != 0 ? bonusDepositAccountEntity2.clientKey : str, (i2 & 2) != 0 ? bonusDepositAccountEntity2.agreeType : str2, (i2 & 4) != 0 ? bonusDepositAccountEntity2.agreeKey : j, (i2 & 8) != 0 ? bonusDepositAccountEntity2.agreeCcy : str3, (i2 & 16) != 0 ? bonusDepositAccountEntity2.agreeNo : str4, (i2 & 32) != 0 ? bonusDepositAccountEntity2.acctKey : j2, (i2 & 64) != 0 ? bonusDepositAccountEntity2.name : str5, (i2 & 128) != 0 ? bonusDepositAccountEntity2.acctNo : str6, (i2 & C11398b.f33139r) != 0 ? bonusDepositAccountEntity2.acctDesc : str7, (i2 & C11398b.f33140s) != 0 ? bonusDepositAccountEntity2.depositAgreeType : str8, (i2 & C11398b.f33141t) != 0 ? bonusDepositAccountEntity2.agreeBalance : d, (i2 & C11398b.f33142u) != 0 ? bonusDepositAccountEntity2.depositTypeDictionaryKey : str9);
    }

    public final String component1() {
        return this.clientKey;
    }

    public final String component10() {
        return this.depositAgreeType;
    }

    public final Double component11() {
        return this.agreeBalance;
    }

    public final String component12() {
        return this.depositTypeDictionaryKey;
    }

    public final String component2() {
        return this.agreeType;
    }

    public final long component3() {
        return this.agreeKey;
    }

    public final String component4() {
        return this.agreeCcy;
    }

    public final String component5() {
        return this.agreeNo;
    }

    public final long component6() {
        return this.acctKey;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.acctNo;
    }

    public final String component9() {
        return this.acctDesc;
    }

    public final BonusDepositAccountEntity copy(String str, String str2, long j, String str3, String str4, long j2, String str5, String str6, String str7, String str8, Double d, String str9) {
        return new BonusDepositAccountEntity(str, str2, j, str3, str4, j2, str5, str6, str7, str8, d, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusDepositAccountEntity)) {
            return false;
        }
        BonusDepositAccountEntity bonusDepositAccountEntity = (BonusDepositAccountEntity) obj;
        return C41536l.m120484d(this.clientKey, bonusDepositAccountEntity.clientKey) && C41536l.m120484d(this.agreeType, bonusDepositAccountEntity.agreeType) && this.agreeKey == bonusDepositAccountEntity.agreeKey && C41536l.m120484d(this.agreeCcy, bonusDepositAccountEntity.agreeCcy) && C41536l.m120484d(this.agreeNo, bonusDepositAccountEntity.agreeNo) && this.acctKey == bonusDepositAccountEntity.acctKey && C41536l.m120484d(this.name, bonusDepositAccountEntity.name) && C41536l.m120484d(this.acctNo, bonusDepositAccountEntity.acctNo) && C41536l.m120484d(this.acctDesc, bonusDepositAccountEntity.acctDesc) && C41536l.m120484d(this.depositAgreeType, bonusDepositAccountEntity.depositAgreeType) && C41536l.m120484d(this.agreeBalance, bonusDepositAccountEntity.agreeBalance) && C41536l.m120484d(this.depositTypeDictionaryKey, bonusDepositAccountEntity.depositTypeDictionaryKey);
    }

    public final String getAcctDesc() {
        return this.acctDesc;
    }

    public final long getAcctKey() {
        return this.acctKey;
    }

    public final String getAcctNo() {
        return this.acctNo;
    }

    public final Double getAgreeBalance() {
        return this.agreeBalance;
    }

    public final String getAgreeCcy() {
        return this.agreeCcy;
    }

    public final long getAgreeKey() {
        return this.agreeKey;
    }

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final String getAgreeType() {
        return this.agreeType;
    }

    public final String getClientKey() {
        return this.clientKey;
    }

    public final String getDepositAgreeType() {
        return this.depositAgreeType;
    }

    public final String getDepositTypeDictionaryKey() {
        return this.depositTypeDictionaryKey;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.clientKey;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.agreeType;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.agreeKey)) * 31;
        String str3 = this.agreeCcy;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.agreeNo;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + C7397t.m28148a(this.acctKey)) * 31;
        String str5 = this.name;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.acctNo;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.acctDesc;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.depositAgreeType;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d = this.agreeBalance;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        String str9 = this.depositTypeDictionaryKey;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        String str = this.clientKey;
        String str2 = this.agreeType;
        long j = this.agreeKey;
        String str3 = this.agreeCcy;
        String str4 = this.agreeNo;
        long j2 = this.acctKey;
        String str5 = this.name;
        String str6 = this.acctNo;
        String str7 = this.acctDesc;
        String str8 = this.depositAgreeType;
        Double d = this.agreeBalance;
        String str9 = this.depositTypeDictionaryKey;
        return "BonusDepositAccountEntity(clientKey=" + str + ", agreeType=" + str2 + ", agreeKey=" + j + ", agreeCcy=" + str3 + ", agreeNo=" + str4 + ", acctKey=" + j2 + ", name=" + str5 + ", acctNo=" + str6 + ", acctDesc=" + str7 + ", depositAgreeType=" + str8 + ", agreeBalance=" + d + ", depositTypeDictionaryKey=" + str9 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusDepositAccountEntity(java.lang.String r19, java.lang.String r20, long r21, java.lang.String r23, java.lang.String r24, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Double r31, java.lang.String r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r19
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r20
        L_0x0013:
            r1 = r0 & 4
            r6 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r6
            goto L_0x001d
        L_0x001b:
            r8 = r21
        L_0x001d:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0023
            r1 = r2
            goto L_0x0025
        L_0x0023:
            r1 = r23
        L_0x0025:
            r3 = r0 & 32
            if (r3 == 0) goto L_0x002b
            r10 = r6
            goto L_0x002d
        L_0x002b:
            r10 = r25
        L_0x002d:
            r3 = r0 & 64
            if (r3 == 0) goto L_0x0033
            r12 = r2
            goto L_0x0035
        L_0x0033:
            r12 = r27
        L_0x0035:
            r3 = r0 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x003b
            r13 = r2
            goto L_0x003d
        L_0x003b:
            r13 = r28
        L_0x003d:
            r3 = r0 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0043
            r14 = r2
            goto L_0x0045
        L_0x0043:
            r14 = r29
        L_0x0045:
            r3 = r0 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x004b
            r15 = r2
            goto L_0x004d
        L_0x004b:
            r15 = r30
        L_0x004d:
            r3 = r0 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0054
            r16 = r2
            goto L_0x0056
        L_0x0054:
            r16 = r31
        L_0x0056:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x005d
            r17 = r2
            goto L_0x005f
        L_0x005d:
            r17 = r32
        L_0x005f:
            r3 = r18
            r6 = r8
            r8 = r1
            r9 = r24
            r3.<init>(r4, r5, r6, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusDepositAccountEntity.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
