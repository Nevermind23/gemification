package p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Keep
/* renamed from: ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ApplicationSalaryInfoEntity */
public final class ApplicationSalaryInfoEntity {
    private final String amount;
    private final String comment;
    private final String currency;

    /* renamed from: id */
    private final String f59637id;
    private final String organization;
    private final String organizationAddress;
    private final String organizationInn;
    private final String position;
    private final String sourceOfIncome;
    private final String sourceOfIncomeDictionaryKey;

    public ApplicationSalaryInfoEntity() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ApplicationSalaryInfoEntity copy$default(ApplicationSalaryInfoEntity applicationSalaryInfoEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        ApplicationSalaryInfoEntity applicationSalaryInfoEntity2 = applicationSalaryInfoEntity;
        int i2 = i;
        return applicationSalaryInfoEntity.copy((i2 & 1) != 0 ? applicationSalaryInfoEntity2.f59637id : str, (i2 & 2) != 0 ? applicationSalaryInfoEntity2.sourceOfIncome : str2, (i2 & 4) != 0 ? applicationSalaryInfoEntity2.amount : str3, (i2 & 8) != 0 ? applicationSalaryInfoEntity2.currency : str4, (i2 & 16) != 0 ? applicationSalaryInfoEntity2.organization : str5, (i2 & 32) != 0 ? applicationSalaryInfoEntity2.organizationInn : str6, (i2 & 64) != 0 ? applicationSalaryInfoEntity2.organizationAddress : str7, (i2 & 128) != 0 ? applicationSalaryInfoEntity2.position : str8, (i2 & C11398b.f33139r) != 0 ? applicationSalaryInfoEntity2.comment : str9, (i2 & C11398b.f33140s) != 0 ? applicationSalaryInfoEntity2.sourceOfIncomeDictionaryKey : str10);
    }

    public final String component1() {
        return this.f59637id;
    }

    public final String component10() {
        return this.sourceOfIncomeDictionaryKey;
    }

    public final String component2() {
        return this.sourceOfIncome;
    }

    public final String component3() {
        return this.amount;
    }

    public final String component4() {
        return this.currency;
    }

    public final String component5() {
        return this.organization;
    }

    public final String component6() {
        return this.organizationInn;
    }

    public final String component7() {
        return this.organizationAddress;
    }

    public final String component8() {
        return this.position;
    }

    public final String component9() {
        return this.comment;
    }

    public final ApplicationSalaryInfoEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return new ApplicationSalaryInfoEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationSalaryInfoEntity)) {
            return false;
        }
        ApplicationSalaryInfoEntity applicationSalaryInfoEntity = (ApplicationSalaryInfoEntity) obj;
        return C41536l.m120484d(this.f59637id, applicationSalaryInfoEntity.f59637id) && C41536l.m120484d(this.sourceOfIncome, applicationSalaryInfoEntity.sourceOfIncome) && C41536l.m120484d(this.amount, applicationSalaryInfoEntity.amount) && C41536l.m120484d(this.currency, applicationSalaryInfoEntity.currency) && C41536l.m120484d(this.organization, applicationSalaryInfoEntity.organization) && C41536l.m120484d(this.organizationInn, applicationSalaryInfoEntity.organizationInn) && C41536l.m120484d(this.organizationAddress, applicationSalaryInfoEntity.organizationAddress) && C41536l.m120484d(this.position, applicationSalaryInfoEntity.position) && C41536l.m120484d(this.comment, applicationSalaryInfoEntity.comment) && C41536l.m120484d(this.sourceOfIncomeDictionaryKey, applicationSalaryInfoEntity.sourceOfIncomeDictionaryKey);
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getId() {
        return this.f59637id;
    }

    public final String getOrganization() {
        return this.organization;
    }

    public final String getOrganizationAddress() {
        return this.organizationAddress;
    }

    public final String getOrganizationInn() {
        return this.organizationInn;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getSourceOfIncome() {
        return this.sourceOfIncome;
    }

    public final String getSourceOfIncomeDictionaryKey() {
        return this.sourceOfIncomeDictionaryKey;
    }

    public int hashCode() {
        String str = this.f59637id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceOfIncome;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currency;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.organization;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.organizationInn;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.organizationAddress;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.position;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.comment;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.sourceOfIncomeDictionaryKey;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        String str = this.f59637id;
        String str2 = this.sourceOfIncome;
        String str3 = this.amount;
        String str4 = this.currency;
        String str5 = this.organization;
        String str6 = this.organizationInn;
        String str7 = this.organizationAddress;
        String str8 = this.position;
        String str9 = this.comment;
        String str10 = this.sourceOfIncomeDictionaryKey;
        return "ApplicationSalaryInfoEntity(id=" + str + ", sourceOfIncome=" + str2 + ", amount=" + str3 + ", currency=" + str4 + ", organization=" + str5 + ", organizationInn=" + str6 + ", organizationAddress=" + str7 + ", position=" + str8 + ", comment=" + str9 + ", sourceOfIncomeDictionaryKey=" + str10 + ")";
    }

    public ApplicationSalaryInfoEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f59637id = str;
        this.sourceOfIncome = str2;
        this.amount = str3;
        this.currency = str4;
        this.organization = str5;
        this.organizationInn = str6;
        this.organizationAddress = str7;
        this.position = str8;
        this.comment = str9;
        this.sourceOfIncomeDictionaryKey = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ApplicationSalaryInfoEntity(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r13
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r14
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r15
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = r2
            goto L_0x0027
        L_0x0025:
            r6 = r16
        L_0x0027:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002d
            r7 = r2
            goto L_0x002f
        L_0x002d:
            r7 = r17
        L_0x002f:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0035
            r8 = r2
            goto L_0x0037
        L_0x0035:
            r8 = r18
        L_0x0037:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003d
            r9 = r2
            goto L_0x003f
        L_0x003d:
            r9 = r19
        L_0x003f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0045
            r10 = r2
            goto L_0x0047
        L_0x0045:
            r10 = r20
        L_0x0047:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r2 = r21
        L_0x004e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.consumerloanapplication.data.prepareapplication.entity.ApplicationSalaryInfoEntity.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
