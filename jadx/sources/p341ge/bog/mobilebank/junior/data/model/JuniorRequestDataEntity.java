package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.JuniorRequestDataEntity */
public final class JuniorRequestDataEntity {
    private final Long childBirthDate;
    private final Long childClientKey;
    private final String childFirstName;
    private final String childLastName;
    private final String childMobileNumber;
    private final String childPin;

    /* renamed from: id */
    private final long f63511id;
    private final Long parentClientKey;
    private final String parentMobileNumber;
    private final YesNoApiEntity status;

    public JuniorRequestDataEntity(long j, String str, Long l, String str2, String str3, Long l2, String str4, Long l3, String str5, YesNoApiEntity yesNoApiEntity) {
        this.f63511id = j;
        this.childPin = str;
        this.childClientKey = l;
        this.childFirstName = str2;
        this.childLastName = str3;
        this.childBirthDate = l2;
        this.childMobileNumber = str4;
        this.parentClientKey = l3;
        this.parentMobileNumber = str5;
        this.status = yesNoApiEntity;
    }

    public static /* synthetic */ JuniorRequestDataEntity copy$default(JuniorRequestDataEntity juniorRequestDataEntity, long j, String str, Long l, String str2, String str3, Long l2, String str4, Long l3, String str5, YesNoApiEntity yesNoApiEntity, int i, Object obj) {
        JuniorRequestDataEntity juniorRequestDataEntity2 = juniorRequestDataEntity;
        int i2 = i;
        return juniorRequestDataEntity.copy((i2 & 1) != 0 ? juniorRequestDataEntity2.f63511id : j, (i2 & 2) != 0 ? juniorRequestDataEntity2.childPin : str, (i2 & 4) != 0 ? juniorRequestDataEntity2.childClientKey : l, (i2 & 8) != 0 ? juniorRequestDataEntity2.childFirstName : str2, (i2 & 16) != 0 ? juniorRequestDataEntity2.childLastName : str3, (i2 & 32) != 0 ? juniorRequestDataEntity2.childBirthDate : l2, (i2 & 64) != 0 ? juniorRequestDataEntity2.childMobileNumber : str4, (i2 & 128) != 0 ? juniorRequestDataEntity2.parentClientKey : l3, (i2 & C11398b.f33139r) != 0 ? juniorRequestDataEntity2.parentMobileNumber : str5, (i2 & C11398b.f33140s) != 0 ? juniorRequestDataEntity2.status : yesNoApiEntity);
    }

    public final long component1() {
        return this.f63511id;
    }

    public final YesNoApiEntity component10() {
        return this.status;
    }

    public final String component2() {
        return this.childPin;
    }

    public final Long component3() {
        return this.childClientKey;
    }

    public final String component4() {
        return this.childFirstName;
    }

    public final String component5() {
        return this.childLastName;
    }

    public final Long component6() {
        return this.childBirthDate;
    }

    public final String component7() {
        return this.childMobileNumber;
    }

    public final Long component8() {
        return this.parentClientKey;
    }

    public final String component9() {
        return this.parentMobileNumber;
    }

    public final JuniorRequestDataEntity copy(long j, String str, Long l, String str2, String str3, Long l2, String str4, Long l3, String str5, YesNoApiEntity yesNoApiEntity) {
        return new JuniorRequestDataEntity(j, str, l, str2, str3, l2, str4, l3, str5, yesNoApiEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JuniorRequestDataEntity)) {
            return false;
        }
        JuniorRequestDataEntity juniorRequestDataEntity = (JuniorRequestDataEntity) obj;
        return this.f63511id == juniorRequestDataEntity.f63511id && C41536l.m120484d(this.childPin, juniorRequestDataEntity.childPin) && C41536l.m120484d(this.childClientKey, juniorRequestDataEntity.childClientKey) && C41536l.m120484d(this.childFirstName, juniorRequestDataEntity.childFirstName) && C41536l.m120484d(this.childLastName, juniorRequestDataEntity.childLastName) && C41536l.m120484d(this.childBirthDate, juniorRequestDataEntity.childBirthDate) && C41536l.m120484d(this.childMobileNumber, juniorRequestDataEntity.childMobileNumber) && C41536l.m120484d(this.parentClientKey, juniorRequestDataEntity.parentClientKey) && C41536l.m120484d(this.parentMobileNumber, juniorRequestDataEntity.parentMobileNumber) && this.status == juniorRequestDataEntity.status;
    }

    public final Long getChildBirthDate() {
        return this.childBirthDate;
    }

    public final Long getChildClientKey() {
        return this.childClientKey;
    }

    public final String getChildFirstName() {
        return this.childFirstName;
    }

    public final String getChildLastName() {
        return this.childLastName;
    }

    public final String getChildMobileNumber() {
        return this.childMobileNumber;
    }

    public final String getChildPin() {
        return this.childPin;
    }

    public final long getId() {
        return this.f63511id;
    }

    public final Long getParentClientKey() {
        return this.parentClientKey;
    }

    public final String getParentMobileNumber() {
        return this.parentMobileNumber;
    }

    public final YesNoApiEntity getStatus() {
        return this.status;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f63511id) * 31;
        String str = this.childPin;
        int i = 0;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.childClientKey;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.childFirstName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.childLastName;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.childBirthDate;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.childMobileNumber;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.parentClientKey;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.parentMobileNumber;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        YesNoApiEntity yesNoApiEntity = this.status;
        if (yesNoApiEntity != null) {
            i = yesNoApiEntity.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        long j = this.f63511id;
        String str = this.childPin;
        Long l = this.childClientKey;
        String str2 = this.childFirstName;
        String str3 = this.childLastName;
        Long l2 = this.childBirthDate;
        String str4 = this.childMobileNumber;
        Long l3 = this.parentClientKey;
        String str5 = this.parentMobileNumber;
        YesNoApiEntity yesNoApiEntity = this.status;
        return "JuniorRequestDataEntity(id=" + j + ", childPin=" + str + ", childClientKey=" + l + ", childFirstName=" + str2 + ", childLastName=" + str3 + ", childBirthDate=" + l2 + ", childMobileNumber=" + str4 + ", parentClientKey=" + l3 + ", parentMobileNumber=" + str5 + ", status=" + yesNoApiEntity + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ JuniorRequestDataEntity(long r16, java.lang.String r18, java.lang.Long r19, java.lang.String r20, java.lang.String r21, java.lang.Long r22, java.lang.String r23, java.lang.Long r24, java.lang.String r25, p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity r26, int r27, kotlin.jvm.internal.DefaultConstructorMarker r28) {
        /*
            r15 = this;
            r0 = r27
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r18
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r19
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r21
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r22
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r24
        L_0x002b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0031
            r14 = r2
            goto L_0x0033
        L_0x0031:
            r14 = r26
        L_0x0033:
            r3 = r15
            r4 = r16
            r8 = r20
            r11 = r23
            r13 = r25
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.junior.data.model.JuniorRequestDataEntity.<init>(long, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.Long, java.lang.String, ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
