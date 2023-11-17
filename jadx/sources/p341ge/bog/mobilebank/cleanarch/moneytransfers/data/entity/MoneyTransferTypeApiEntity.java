package p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferTypeApiEntity */
public final class MoneyTransferTypeApiEntity {
    private final Long acceptTime;
    private final String acceptUsername;
    private final List<String> currencies;
    private final Long editTime;
    private final String editUsername;
    private final boolean hasUniversalFind;
    private final String info;
    private final String logoUrl;
    private final String mtSystem;
    private final String mtSystemDictionaryKey;
    private final Boolean payoutAmountRequired;
    private final Boolean payoutCurrencyAvailable;
    private final Object previousRevision;
    private final Boolean receiveAvailable;
    private final Boolean requiresSenderCountry;
    private final Integer reviseId;
    private final Boolean sendAvailable;
    private final Boolean sendInCountry;
    private final Boolean skipSendCountrySelection;
    private final String status;
    private final Boolean transferNumberAllowsCharacters;
    private final Integer transferNumberMaxLength;
    private final Integer transferNumberMinLength;

    public MoneyTransferTypeApiEntity(String str, Boolean bool, String str2, Integer num, Long l, Boolean bool2, Long l2, Boolean bool3, Integer num2, String str3, String str4, Boolean bool4, Boolean bool5, Integer num3, Boolean bool6, Boolean bool7, Object obj, String str5, String str6, String str7, List<String> list, Boolean bool8, boolean z) {
        C41536l.m120489i(str, "mtSystem");
        C41536l.m120489i(str2, "mtSystemDictionaryKey");
        this.mtSystem = str;
        this.skipSendCountrySelection = bool;
        this.mtSystemDictionaryKey = str2;
        this.reviseId = num;
        this.acceptTime = l;
        this.transferNumberAllowsCharacters = bool2;
        this.editTime = l2;
        this.payoutAmountRequired = bool3;
        this.transferNumberMinLength = num2;
        this.editUsername = str3;
        this.acceptUsername = str4;
        this.sendInCountry = bool4;
        this.receiveAvailable = bool5;
        this.transferNumberMaxLength = num3;
        this.payoutCurrencyAvailable = bool6;
        this.sendAvailable = bool7;
        this.previousRevision = obj;
        this.info = str5;
        this.status = str6;
        this.logoUrl = str7;
        this.currencies = list;
        this.requiresSenderCountry = bool8;
        this.hasUniversalFind = z;
    }

    public static /* synthetic */ MoneyTransferTypeApiEntity copy$default(MoneyTransferTypeApiEntity moneyTransferTypeApiEntity, String str, Boolean bool, String str2, Integer num, Long l, Boolean bool2, Long l2, Boolean bool3, Integer num2, String str3, String str4, Boolean bool4, Boolean bool5, Integer num3, Boolean bool6, Boolean bool7, Object obj, String str5, String str6, String str7, List list, Boolean bool8, boolean z, int i, Object obj2) {
        MoneyTransferTypeApiEntity moneyTransferTypeApiEntity2 = moneyTransferTypeApiEntity;
        int i2 = i;
        return moneyTransferTypeApiEntity.copy((i2 & 1) != 0 ? moneyTransferTypeApiEntity2.mtSystem : str, (i2 & 2) != 0 ? moneyTransferTypeApiEntity2.skipSendCountrySelection : bool, (i2 & 4) != 0 ? moneyTransferTypeApiEntity2.mtSystemDictionaryKey : str2, (i2 & 8) != 0 ? moneyTransferTypeApiEntity2.reviseId : num, (i2 & 16) != 0 ? moneyTransferTypeApiEntity2.acceptTime : l, (i2 & 32) != 0 ? moneyTransferTypeApiEntity2.transferNumberAllowsCharacters : bool2, (i2 & 64) != 0 ? moneyTransferTypeApiEntity2.editTime : l2, (i2 & 128) != 0 ? moneyTransferTypeApiEntity2.payoutAmountRequired : bool3, (i2 & C11398b.f33139r) != 0 ? moneyTransferTypeApiEntity2.transferNumberMinLength : num2, (i2 & C11398b.f33140s) != 0 ? moneyTransferTypeApiEntity2.editUsername : str3, (i2 & C11398b.f33141t) != 0 ? moneyTransferTypeApiEntity2.acceptUsername : str4, (i2 & C11398b.f33142u) != 0 ? moneyTransferTypeApiEntity2.sendInCountry : bool4, (i2 & C11398b.f33143v) != 0 ? moneyTransferTypeApiEntity2.receiveAvailable : bool5, (i2 & 8192) != 0 ? moneyTransferTypeApiEntity2.transferNumberMaxLength : num3, (i2 & 16384) != 0 ? moneyTransferTypeApiEntity2.payoutCurrencyAvailable : bool6, (i2 & 32768) != 0 ? moneyTransferTypeApiEntity2.sendAvailable : bool7, (i2 & 65536) != 0 ? moneyTransferTypeApiEntity2.previousRevision : obj, (i2 & 131072) != 0 ? moneyTransferTypeApiEntity2.info : str5, (i2 & 262144) != 0 ? moneyTransferTypeApiEntity2.status : str6, (i2 & 524288) != 0 ? moneyTransferTypeApiEntity2.logoUrl : str7, (i2 & 1048576) != 0 ? moneyTransferTypeApiEntity2.currencies : list, (i2 & 2097152) != 0 ? moneyTransferTypeApiEntity2.requiresSenderCountry : bool8, (i2 & 4194304) != 0 ? moneyTransferTypeApiEntity2.hasUniversalFind : z);
    }

    public final String component1() {
        return this.mtSystem;
    }

    public final String component10() {
        return this.editUsername;
    }

    public final String component11() {
        return this.acceptUsername;
    }

    public final Boolean component12() {
        return this.sendInCountry;
    }

    public final Boolean component13() {
        return this.receiveAvailable;
    }

    public final Integer component14() {
        return this.transferNumberMaxLength;
    }

    public final Boolean component15() {
        return this.payoutCurrencyAvailable;
    }

    public final Boolean component16() {
        return this.sendAvailable;
    }

    public final Object component17() {
        return this.previousRevision;
    }

    public final String component18() {
        return this.info;
    }

    public final String component19() {
        return this.status;
    }

    public final Boolean component2() {
        return this.skipSendCountrySelection;
    }

    public final String component20() {
        return this.logoUrl;
    }

    public final List<String> component21() {
        return this.currencies;
    }

    public final Boolean component22() {
        return this.requiresSenderCountry;
    }

    public final boolean component23() {
        return this.hasUniversalFind;
    }

    public final String component3() {
        return this.mtSystemDictionaryKey;
    }

    public final Integer component4() {
        return this.reviseId;
    }

    public final Long component5() {
        return this.acceptTime;
    }

    public final Boolean component6() {
        return this.transferNumberAllowsCharacters;
    }

    public final Long component7() {
        return this.editTime;
    }

    public final Boolean component8() {
        return this.payoutAmountRequired;
    }

    public final Integer component9() {
        return this.transferNumberMinLength;
    }

    public final MoneyTransferTypeApiEntity copy(String str, Boolean bool, String str2, Integer num, Long l, Boolean bool2, Long l2, Boolean bool3, Integer num2, String str3, String str4, Boolean bool4, Boolean bool5, Integer num3, Boolean bool6, Boolean bool7, Object obj, String str5, String str6, String str7, List<String> list, Boolean bool8, boolean z) {
        String str8 = str;
        C41536l.m120489i(str8, "mtSystem");
        C41536l.m120489i(str2, "mtSystemDictionaryKey");
        return new MoneyTransferTypeApiEntity(str8, bool, str2, num, l, bool2, l2, bool3, num2, str3, str4, bool4, bool5, num3, bool6, bool7, obj, str5, str6, str7, list, bool8, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferTypeApiEntity)) {
            return false;
        }
        MoneyTransferTypeApiEntity moneyTransferTypeApiEntity = (MoneyTransferTypeApiEntity) obj;
        return C41536l.m120484d(this.mtSystem, moneyTransferTypeApiEntity.mtSystem) && C41536l.m120484d(this.skipSendCountrySelection, moneyTransferTypeApiEntity.skipSendCountrySelection) && C41536l.m120484d(this.mtSystemDictionaryKey, moneyTransferTypeApiEntity.mtSystemDictionaryKey) && C41536l.m120484d(this.reviseId, moneyTransferTypeApiEntity.reviseId) && C41536l.m120484d(this.acceptTime, moneyTransferTypeApiEntity.acceptTime) && C41536l.m120484d(this.transferNumberAllowsCharacters, moneyTransferTypeApiEntity.transferNumberAllowsCharacters) && C41536l.m120484d(this.editTime, moneyTransferTypeApiEntity.editTime) && C41536l.m120484d(this.payoutAmountRequired, moneyTransferTypeApiEntity.payoutAmountRequired) && C41536l.m120484d(this.transferNumberMinLength, moneyTransferTypeApiEntity.transferNumberMinLength) && C41536l.m120484d(this.editUsername, moneyTransferTypeApiEntity.editUsername) && C41536l.m120484d(this.acceptUsername, moneyTransferTypeApiEntity.acceptUsername) && C41536l.m120484d(this.sendInCountry, moneyTransferTypeApiEntity.sendInCountry) && C41536l.m120484d(this.receiveAvailable, moneyTransferTypeApiEntity.receiveAvailable) && C41536l.m120484d(this.transferNumberMaxLength, moneyTransferTypeApiEntity.transferNumberMaxLength) && C41536l.m120484d(this.payoutCurrencyAvailable, moneyTransferTypeApiEntity.payoutCurrencyAvailable) && C41536l.m120484d(this.sendAvailable, moneyTransferTypeApiEntity.sendAvailable) && C41536l.m120484d(this.previousRevision, moneyTransferTypeApiEntity.previousRevision) && C41536l.m120484d(this.info, moneyTransferTypeApiEntity.info) && C41536l.m120484d(this.status, moneyTransferTypeApiEntity.status) && C41536l.m120484d(this.logoUrl, moneyTransferTypeApiEntity.logoUrl) && C41536l.m120484d(this.currencies, moneyTransferTypeApiEntity.currencies) && C41536l.m120484d(this.requiresSenderCountry, moneyTransferTypeApiEntity.requiresSenderCountry) && this.hasUniversalFind == moneyTransferTypeApiEntity.hasUniversalFind;
    }

    public final Long getAcceptTime() {
        return this.acceptTime;
    }

    public final String getAcceptUsername() {
        return this.acceptUsername;
    }

    public final List<String> getCurrencies() {
        return this.currencies;
    }

    public final Long getEditTime() {
        return this.editTime;
    }

    public final String getEditUsername() {
        return this.editUsername;
    }

    public final boolean getHasUniversalFind() {
        return this.hasUniversalFind;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getLogoUrl() {
        return this.logoUrl;
    }

    public final String getMtSystem() {
        return this.mtSystem;
    }

    public final String getMtSystemDictionaryKey() {
        return this.mtSystemDictionaryKey;
    }

    public final Boolean getPayoutAmountRequired() {
        return this.payoutAmountRequired;
    }

    public final Boolean getPayoutCurrencyAvailable() {
        return this.payoutCurrencyAvailable;
    }

    public final Object getPreviousRevision() {
        return this.previousRevision;
    }

    public final Boolean getReceiveAvailable() {
        return this.receiveAvailable;
    }

    public final Boolean getRequiresSenderCountry() {
        return this.requiresSenderCountry;
    }

    public final Integer getReviseId() {
        return this.reviseId;
    }

    public final Boolean getSendAvailable() {
        return this.sendAvailable;
    }

    public final Boolean getSendInCountry() {
        return this.sendInCountry;
    }

    public final Boolean getSkipSendCountrySelection() {
        return this.skipSendCountrySelection;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Boolean getTransferNumberAllowsCharacters() {
        return this.transferNumberAllowsCharacters;
    }

    public final Integer getTransferNumberMaxLength() {
        return this.transferNumberMaxLength;
    }

    public final Integer getTransferNumberMinLength() {
        return this.transferNumberMinLength;
    }

    public int hashCode() {
        int hashCode = this.mtSystem.hashCode() * 31;
        Boolean bool = this.skipSendCountrySelection;
        int i = 0;
        int hashCode2 = (((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.mtSystemDictionaryKey.hashCode()) * 31;
        Integer num = this.reviseId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.acceptTime;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.transferNumberAllowsCharacters;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.editTime;
        int hashCode6 = (hashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool3 = this.payoutAmountRequired;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.transferNumberMinLength;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.editUsername;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acceptUsername;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool4 = this.sendInCountry;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.receiveAvailable;
        int hashCode12 = (hashCode11 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Integer num3 = this.transferNumberMaxLength;
        int hashCode13 = (hashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool6 = this.payoutCurrencyAvailable;
        int hashCode14 = (hashCode13 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.sendAvailable;
        int hashCode15 = (hashCode14 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Object obj = this.previousRevision;
        int hashCode16 = (hashCode15 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.info;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.status;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.logoUrl;
        int hashCode19 = (hashCode18 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list = this.currencies;
        int hashCode20 = (hashCode19 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool8 = this.requiresSenderCountry;
        if (bool8 != null) {
            i = bool8.hashCode();
        }
        int i2 = (hashCode20 + i) * 31;
        boolean z = this.hasUniversalFind;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        String str = this.mtSystem;
        Boolean bool = this.skipSendCountrySelection;
        String str2 = this.mtSystemDictionaryKey;
        Integer num = this.reviseId;
        Long l = this.acceptTime;
        Boolean bool2 = this.transferNumberAllowsCharacters;
        Long l2 = this.editTime;
        Boolean bool3 = this.payoutAmountRequired;
        Integer num2 = this.transferNumberMinLength;
        String str3 = this.editUsername;
        String str4 = this.acceptUsername;
        Boolean bool4 = this.sendInCountry;
        Boolean bool5 = this.receiveAvailable;
        Integer num3 = this.transferNumberMaxLength;
        Boolean bool6 = this.payoutCurrencyAvailable;
        Boolean bool7 = this.sendAvailable;
        Object obj = this.previousRevision;
        String str5 = this.info;
        String str6 = this.status;
        String str7 = this.logoUrl;
        List<String> list = this.currencies;
        Boolean bool8 = this.requiresSenderCountry;
        boolean z = this.hasUniversalFind;
        return "MoneyTransferTypeApiEntity(mtSystem=" + str + ", skipSendCountrySelection=" + bool + ", mtSystemDictionaryKey=" + str2 + ", reviseId=" + num + ", acceptTime=" + l + ", transferNumberAllowsCharacters=" + bool2 + ", editTime=" + l2 + ", payoutAmountRequired=" + bool3 + ", transferNumberMinLength=" + num2 + ", editUsername=" + str3 + ", acceptUsername=" + str4 + ", sendInCountry=" + bool4 + ", receiveAvailable=" + bool5 + ", transferNumberMaxLength=" + num3 + ", payoutCurrencyAvailable=" + bool6 + ", sendAvailable=" + bool7 + ", previousRevision=" + obj + ", info=" + str5 + ", status=" + str6 + ", logoUrl=" + str7 + ", currencies=" + list + ", requiresSenderCountry=" + bool8 + ", hasUniversalFind=" + z + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MoneyTransferTypeApiEntity(java.lang.String r28, java.lang.Boolean r29, java.lang.String r30, java.lang.Integer r31, java.lang.Long r32, java.lang.Boolean r33, java.lang.Long r34, java.lang.Boolean r35, java.lang.Integer r36, java.lang.String r37, java.lang.String r38, java.lang.Boolean r39, java.lang.Boolean r40, java.lang.Integer r41, java.lang.Boolean r42, java.lang.Boolean r43, java.lang.Object r44, java.lang.String r45, java.lang.String r46, java.lang.String r47, java.util.List r48, java.lang.Boolean r49, boolean r50, int r51, kotlin.jvm.internal.DefaultConstructorMarker r52) {
        /*
            r27 = this;
            r0 = r51
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r29
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r31
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r32
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r33
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r34
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r35
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0039
            r12 = r2
            goto L_0x003b
        L_0x0039:
            r12 = r36
        L_0x003b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r37
        L_0x0043:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0049
            r14 = r2
            goto L_0x004b
        L_0x0049:
            r14 = r38
        L_0x004b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0051
            r15 = r2
            goto L_0x0053
        L_0x0051:
            r15 = r39
        L_0x0053:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r40
        L_0x005c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0063
            r17 = r2
            goto L_0x0065
        L_0x0063:
            r17 = r41
        L_0x0065:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x006c
            r18 = r2
            goto L_0x006e
        L_0x006c:
            r18 = r42
        L_0x006e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0077
            r19 = r2
            goto L_0x0079
        L_0x0077:
            r19 = r43
        L_0x0079:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0081
            r20 = r2
            goto L_0x0083
        L_0x0081:
            r20 = r44
        L_0x0083:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008b
            r21 = r2
            goto L_0x008d
        L_0x008b:
            r21 = r45
        L_0x008d:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0095
            r22 = r2
            goto L_0x0097
        L_0x0095:
            r22 = r46
        L_0x0097:
            r3 = r27
            r4 = r28
            r6 = r30
            r23 = r47
            r24 = r48
            r25 = r49
            r26 = r50
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.data.entity.MoneyTransferTypeApiEntity.<init>(java.lang.String, java.lang.Boolean, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.lang.Integer, java.lang.Boolean, java.lang.Boolean, java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
