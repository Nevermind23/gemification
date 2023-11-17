package p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;
import p341ge.bog.mobilebank.eventbus.events.CasHistoryEvent;
import r90.C27950a;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusCasServiceEntity */
public final class BonusCasServiceEntity {
    private final ArrayList<BonusAccountEntity> accounts;
    private final BigDecimal agreeBalance;
    private final String agreeCcy;
    private final long agreeKey;
    private final String agreeNo;
    private final String agreeType;
    private final String agreeTypeDictionaryKey;
    private final CasHistoryEvent casHistoryEvent;
    private final long clientKey;
    private final long clientServiceId;
    private final BigDecimal currentMonthTotalAmount;
    private final ArrayList<BonusDepositAccountEntity> depositAccounts;
    private final String depositTypeDictionaryKey;
    private final String imageUrl;
    private final String name;
    private final String prodType;
    private final String scheme;
    private final String schemeTariffCcy;
    private final long schemeTariffId;
    private final BigDecimal schemeTariffValue;
    private final String status;
    private final BigDecimal totalAmount;

    public BonusCasServiceEntity() {
        this(0, 0, (String) null, 0, (BigDecimal) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BigDecimal) null, (BigDecimal) null, (String) null, (ArrayList) null, (ArrayList) null, (BigDecimal) null, (CasHistoryEvent) null, (String) null, (String) null, 4194303, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BonusCasServiceEntity copy$default(BonusCasServiceEntity bonusCasServiceEntity, long j, long j2, String str, long j3, BigDecimal bigDecimal, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str9, ArrayList arrayList, ArrayList arrayList2, BigDecimal bigDecimal4, CasHistoryEvent casHistoryEvent2, String str10, String str11, int i, Object obj) {
        BonusCasServiceEntity bonusCasServiceEntity2 = bonusCasServiceEntity;
        int i2 = i;
        return bonusCasServiceEntity.copy((i2 & 1) != 0 ? bonusCasServiceEntity2.clientServiceId : j, (i2 & 2) != 0 ? bonusCasServiceEntity2.clientKey : j2, (i2 & 4) != 0 ? bonusCasServiceEntity2.scheme : str, (i2 & 8) != 0 ? bonusCasServiceEntity2.schemeTariffId : j3, (i2 & 16) != 0 ? bonusCasServiceEntity2.schemeTariffValue : bigDecimal, (i2 & 32) != 0 ? bonusCasServiceEntity2.schemeTariffCcy : str2, (i2 & 64) != 0 ? bonusCasServiceEntity2.agreeKey : j4, (i2 & 128) != 0 ? bonusCasServiceEntity2.agreeType : str3, (i2 & C11398b.f33139r) != 0 ? bonusCasServiceEntity2.status : str4, (i2 & C11398b.f33140s) != 0 ? bonusCasServiceEntity2.name : str5, (i2 & C11398b.f33141t) != 0 ? bonusCasServiceEntity2.agreeNo : str6, (i2 & C11398b.f33142u) != 0 ? bonusCasServiceEntity2.prodType : str7, (i2 & C11398b.f33143v) != 0 ? bonusCasServiceEntity2.agreeCcy : str8, (i2 & 8192) != 0 ? bonusCasServiceEntity2.totalAmount : bigDecimal2, (i2 & 16384) != 0 ? bonusCasServiceEntity2.agreeBalance : bigDecimal3, (i2 & 32768) != 0 ? bonusCasServiceEntity2.agreeTypeDictionaryKey : str9, (i2 & 65536) != 0 ? bonusCasServiceEntity2.accounts : arrayList, (i2 & 131072) != 0 ? bonusCasServiceEntity2.depositAccounts : arrayList2, (i2 & 262144) != 0 ? bonusCasServiceEntity2.currentMonthTotalAmount : bigDecimal4, (i2 & 524288) != 0 ? bonusCasServiceEntity2.casHistoryEvent : casHistoryEvent2, (i2 & 1048576) != 0 ? bonusCasServiceEntity2.depositTypeDictionaryKey : str10, (i2 & 2097152) != 0 ? bonusCasServiceEntity2.imageUrl : str11);
    }

    public final long component1() {
        return this.clientServiceId;
    }

    public final String component10() {
        return this.name;
    }

    public final String component11() {
        return this.agreeNo;
    }

    public final String component12() {
        return this.prodType;
    }

    public final String component13() {
        return this.agreeCcy;
    }

    public final BigDecimal component14() {
        return this.totalAmount;
    }

    public final BigDecimal component15() {
        return this.agreeBalance;
    }

    public final String component16() {
        return this.agreeTypeDictionaryKey;
    }

    public final ArrayList<BonusAccountEntity> component17() {
        return this.accounts;
    }

    public final ArrayList<BonusDepositAccountEntity> component18() {
        return this.depositAccounts;
    }

    public final BigDecimal component19() {
        return this.currentMonthTotalAmount;
    }

    public final long component2() {
        return this.clientKey;
    }

    public final CasHistoryEvent component20() {
        return this.casHistoryEvent;
    }

    public final String component21() {
        return this.depositTypeDictionaryKey;
    }

    public final String component22() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.scheme;
    }

    public final long component4() {
        return this.schemeTariffId;
    }

    public final BigDecimal component5() {
        return this.schemeTariffValue;
    }

    public final String component6() {
        return this.schemeTariffCcy;
    }

    public final long component7() {
        return this.agreeKey;
    }

    public final String component8() {
        return this.agreeType;
    }

    public final String component9() {
        return this.status;
    }

    public final BonusCasServiceEntity copy(long j, long j2, String str, long j3, BigDecimal bigDecimal, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str9, ArrayList<BonusAccountEntity> arrayList, ArrayList<BonusDepositAccountEntity> arrayList2, BigDecimal bigDecimal4, CasHistoryEvent casHistoryEvent2, String str10, String str11) {
        return new BonusCasServiceEntity(j, j2, str, j3, bigDecimal, str2, j4, str3, str4, str5, str6, str7, str8, bigDecimal2, bigDecimal3, str9, arrayList, arrayList2, bigDecimal4, casHistoryEvent2, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusCasServiceEntity)) {
            return false;
        }
        BonusCasServiceEntity bonusCasServiceEntity = (BonusCasServiceEntity) obj;
        return this.clientServiceId == bonusCasServiceEntity.clientServiceId && this.clientKey == bonusCasServiceEntity.clientKey && C41536l.m120484d(this.scheme, bonusCasServiceEntity.scheme) && this.schemeTariffId == bonusCasServiceEntity.schemeTariffId && C41536l.m120484d(this.schemeTariffValue, bonusCasServiceEntity.schemeTariffValue) && C41536l.m120484d(this.schemeTariffCcy, bonusCasServiceEntity.schemeTariffCcy) && this.agreeKey == bonusCasServiceEntity.agreeKey && C41536l.m120484d(this.agreeType, bonusCasServiceEntity.agreeType) && C41536l.m120484d(this.status, bonusCasServiceEntity.status) && C41536l.m120484d(this.name, bonusCasServiceEntity.name) && C41536l.m120484d(this.agreeNo, bonusCasServiceEntity.agreeNo) && C41536l.m120484d(this.prodType, bonusCasServiceEntity.prodType) && C41536l.m120484d(this.agreeCcy, bonusCasServiceEntity.agreeCcy) && C41536l.m120484d(this.totalAmount, bonusCasServiceEntity.totalAmount) && C41536l.m120484d(this.agreeBalance, bonusCasServiceEntity.agreeBalance) && C41536l.m120484d(this.agreeTypeDictionaryKey, bonusCasServiceEntity.agreeTypeDictionaryKey) && C41536l.m120484d(this.accounts, bonusCasServiceEntity.accounts) && C41536l.m120484d(this.depositAccounts, bonusCasServiceEntity.depositAccounts) && C41536l.m120484d(this.currentMonthTotalAmount, bonusCasServiceEntity.currentMonthTotalAmount) && C41536l.m120484d(this.casHistoryEvent, bonusCasServiceEntity.casHistoryEvent) && C41536l.m120484d(this.depositTypeDictionaryKey, bonusCasServiceEntity.depositTypeDictionaryKey) && C41536l.m120484d(this.imageUrl, bonusCasServiceEntity.imageUrl);
    }

    public final ArrayList<BonusAccountEntity> getAccounts() {
        return this.accounts;
    }

    public final BigDecimal getAgreeBalance() {
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

    public final String getAgreeTypeDictionaryKey() {
        return this.agreeTypeDictionaryKey;
    }

    public final CasHistoryEvent getCasHistoryEvent() {
        return this.casHistoryEvent;
    }

    public final long getClientKey() {
        return this.clientKey;
    }

    public final long getClientServiceId() {
        return this.clientServiceId;
    }

    public final BigDecimal getCurrentMonthTotalAmount() {
        return this.currentMonthTotalAmount;
    }

    public final ArrayList<BonusDepositAccountEntity> getDepositAccounts() {
        return this.depositAccounts;
    }

    public final String getDepositTypeDictionaryKey() {
        return this.depositTypeDictionaryKey;
    }

    public final String getDisplayName() {
        String str = this.name;
        if (str == null) {
            return C27950a.m86287d(this.depositTypeDictionaryKey, false, 2, (Object) null);
        }
        return str;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProdType() {
        return this.prodType;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final String getSchemeTariffCcy() {
        return this.schemeTariffCcy;
    }

    public final long getSchemeTariffId() {
        return this.schemeTariffId;
    }

    public final BigDecimal getSchemeTariffValue() {
        return this.schemeTariffValue;
    }

    public final String getStatus() {
        return this.status;
    }

    public final BigDecimal getTotalAmount() {
        return this.totalAmount;
    }

    public final boolean hasAccount(long j) {
        boolean z;
        ArrayList<BonusAccountEntity> arrayList = this.accounts;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        for (BonusAccountEntity acctKey : arrayList) {
            if (acctKey.getAcctKey() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean hasDeposit(long j) {
        boolean z;
        ArrayList<BonusDepositAccountEntity> arrayList = this.depositAccounts;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        for (BonusDepositAccountEntity acctKey : arrayList) {
            if (acctKey.getAcctKey() == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int a = ((C7397t.m28148a(this.clientServiceId) * 31) + C7397t.m28148a(this.clientKey)) * 31;
        String str = this.scheme;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + C7397t.m28148a(this.schemeTariffId)) * 31;
        BigDecimal bigDecimal = this.schemeTariffValue;
        int hashCode2 = (hashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.schemeTariffCcy;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C7397t.m28148a(this.agreeKey)) * 31;
        String str3 = this.agreeType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.name;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agreeNo;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.prodType;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.agreeCcy;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.totalAmount;
        int hashCode10 = (hashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.agreeBalance;
        int hashCode11 = (hashCode10 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str9 = this.agreeTypeDictionaryKey;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ArrayList<BonusAccountEntity> arrayList = this.accounts;
        int hashCode13 = (hashCode12 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<BonusDepositAccountEntity> arrayList2 = this.depositAccounts;
        int hashCode14 = (hashCode13 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.currentMonthTotalAmount;
        int hashCode15 = (hashCode14 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        CasHistoryEvent casHistoryEvent2 = this.casHistoryEvent;
        int hashCode16 = (hashCode15 + (casHistoryEvent2 == null ? 0 : casHistoryEvent2.hashCode())) * 31;
        String str10 = this.depositTypeDictionaryKey;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.imageUrl;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode17 + i;
    }

    public String toString() {
        long j = this.clientServiceId;
        long j2 = this.clientKey;
        String str = this.scheme;
        long j3 = this.schemeTariffId;
        BigDecimal bigDecimal = this.schemeTariffValue;
        String str2 = this.schemeTariffCcy;
        long j4 = this.agreeKey;
        String str3 = this.agreeType;
        String str4 = this.status;
        String str5 = this.name;
        String str6 = this.agreeNo;
        String str7 = this.prodType;
        String str8 = this.agreeCcy;
        BigDecimal bigDecimal2 = this.totalAmount;
        BigDecimal bigDecimal3 = this.agreeBalance;
        String str9 = this.agreeTypeDictionaryKey;
        ArrayList<BonusAccountEntity> arrayList = this.accounts;
        ArrayList<BonusDepositAccountEntity> arrayList2 = this.depositAccounts;
        BigDecimal bigDecimal4 = this.currentMonthTotalAmount;
        CasHistoryEvent casHistoryEvent2 = this.casHistoryEvent;
        String str10 = this.depositTypeDictionaryKey;
        String str11 = this.imageUrl;
        return "BonusCasServiceEntity(clientServiceId=" + j + ", clientKey=" + j2 + ", scheme=" + str + ", schemeTariffId=" + j3 + ", schemeTariffValue=" + bigDecimal + ", schemeTariffCcy=" + str2 + ", agreeKey=" + j4 + ", agreeType=" + str3 + ", status=" + str4 + ", name=" + str5 + ", agreeNo=" + str6 + ", prodType=" + str7 + ", agreeCcy=" + str8 + ", totalAmount=" + bigDecimal2 + ", agreeBalance=" + bigDecimal3 + ", agreeTypeDictionaryKey=" + str9 + ", accounts=" + arrayList + ", depositAccounts=" + arrayList2 + ", currentMonthTotalAmount=" + bigDecimal4 + ", casHistoryEvent=" + casHistoryEvent2 + ", depositTypeDictionaryKey=" + str10 + ", imageUrl=" + str11 + ")";
    }

    public BonusCasServiceEntity(long j, long j2, String str, long j3, BigDecimal bigDecimal, String str2, long j4, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str9, ArrayList<BonusAccountEntity> arrayList, ArrayList<BonusDepositAccountEntity> arrayList2, BigDecimal bigDecimal4, CasHistoryEvent casHistoryEvent2, String str10, String str11) {
        this.clientServiceId = j;
        this.clientKey = j2;
        this.scheme = str;
        this.schemeTariffId = j3;
        this.schemeTariffValue = bigDecimal;
        this.schemeTariffCcy = str2;
        this.agreeKey = j4;
        this.agreeType = str3;
        this.status = str4;
        this.name = str5;
        this.agreeNo = str6;
        this.prodType = str7;
        this.agreeCcy = str8;
        this.totalAmount = bigDecimal2;
        this.agreeBalance = bigDecimal3;
        this.agreeTypeDictionaryKey = str9;
        this.accounts = arrayList;
        this.depositAccounts = arrayList2;
        this.currentMonthTotalAmount = bigDecimal4;
        this.casHistoryEvent = casHistoryEvent2;
        this.depositTypeDictionaryKey = str10;
        this.imageUrl = str11;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BonusCasServiceEntity(long r27, long r29, java.lang.String r31, long r32, java.math.BigDecimal r34, java.lang.String r35, long r36, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.math.BigDecimal r44, java.math.BigDecimal r45, java.lang.String r46, java.util.ArrayList r47, java.util.ArrayList r48, java.math.BigDecimal r49, p341ge.bog.mobilebank.eventbus.events.CasHistoryEvent r50, java.lang.String r51, java.lang.String r52, int r53, kotlin.jvm.internal.DefaultConstructorMarker r54) {
        /*
            r26 = this;
            r0 = r53
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r4 = r2
            goto L_0x000c
        L_0x000a:
            r4 = r27
        L_0x000c:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0012
            r6 = r2
            goto L_0x0014
        L_0x0012:
            r6 = r29
        L_0x0014:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001a
            r1 = 0
            goto L_0x001c
        L_0x001a:
            r1 = r31
        L_0x001c:
            r9 = r0 & 8
            if (r9 == 0) goto L_0x0022
            r9 = r2
            goto L_0x0024
        L_0x0022:
            r9 = r32
        L_0x0024:
            r11 = r0 & 16
            if (r11 == 0) goto L_0x002a
            r11 = 0
            goto L_0x002c
        L_0x002a:
            r11 = r34
        L_0x002c:
            r12 = r0 & 32
            if (r12 == 0) goto L_0x0032
            r12 = 0
            goto L_0x0034
        L_0x0032:
            r12 = r35
        L_0x0034:
            r13 = r0 & 64
            if (r13 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r2 = r36
        L_0x003b:
            r13 = r0 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L_0x0041
            r13 = 0
            goto L_0x0043
        L_0x0041:
            r13 = r38
        L_0x0043:
            r14 = r0 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0049
            r14 = 0
            goto L_0x004b
        L_0x0049:
            r14 = r39
        L_0x004b:
            r15 = r0 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x0051
            r15 = 0
            goto L_0x0053
        L_0x0051:
            r15 = r40
        L_0x0053:
            r8 = r0 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x0059
            r8 = 0
            goto L_0x005b
        L_0x0059:
            r8 = r41
        L_0x005b:
            r54 = r8
            r8 = r0 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0063
            r8 = 0
            goto L_0x0065
        L_0x0063:
            r8 = r42
        L_0x0065:
            r16 = r8
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x006d
            r8 = 0
            goto L_0x006f
        L_0x006d:
            r8 = r43
        L_0x006f:
            r17 = r8
            r8 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x0077
            r8 = 0
            goto L_0x0079
        L_0x0077:
            r8 = r44
        L_0x0079:
            r18 = r8
            r8 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x0081
            r8 = 0
            goto L_0x0083
        L_0x0081:
            r8 = r45
        L_0x0083:
            r19 = 32768(0x8000, float:4.5918E-41)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x008d
            r19 = 0
            goto L_0x008f
        L_0x008d:
            r19 = r46
        L_0x008f:
            r20 = 65536(0x10000, float:9.18355E-41)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x0098
            r20 = 0
            goto L_0x009a
        L_0x0098:
            r20 = r47
        L_0x009a:
            r21 = 131072(0x20000, float:1.83671E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x00a3
            r21 = 0
            goto L_0x00a5
        L_0x00a3:
            r21 = r48
        L_0x00a5:
            r22 = 262144(0x40000, float:3.67342E-40)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x00ae
            r22 = 0
            goto L_0x00b0
        L_0x00ae:
            r22 = r49
        L_0x00b0:
            r23 = 524288(0x80000, float:7.34684E-40)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x00b9
            r23 = 0
            goto L_0x00bb
        L_0x00b9:
            r23 = r50
        L_0x00bb:
            r24 = 1048576(0x100000, float:1.469368E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x00c4
            r24 = 0
            goto L_0x00c6
        L_0x00c4:
            r24 = r51
        L_0x00c6:
            r25 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r25
            if (r0 == 0) goto L_0x00ce
            r0 = 0
            goto L_0x00d0
        L_0x00ce:
            r0 = r52
        L_0x00d0:
            r27 = r26
            r28 = r4
            r30 = r6
            r32 = r1
            r33 = r9
            r35 = r11
            r36 = r12
            r37 = r2
            r39 = r13
            r40 = r14
            r41 = r15
            r42 = r54
            r43 = r16
            r44 = r17
            r45 = r18
            r46 = r8
            r47 = r19
            r48 = r20
            r49 = r21
            r50 = r22
            r51 = r23
            r52 = r24
            r53 = r0
            r27.<init>(r28, r30, r32, r33, r35, r36, r37, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.BonusCasServiceEntity.<init>(long, long, java.lang.String, long, java.math.BigDecimal, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.math.BigDecimal, ge.bog.mobilebank.eventbus.events.CasHistoryEvent, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
