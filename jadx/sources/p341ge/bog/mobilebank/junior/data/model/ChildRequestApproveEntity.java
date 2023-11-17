package p341ge.bog.mobilebank.junior.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.YesNoApiEntity;

@Keep
/* renamed from: ge.bog.mobilebank.junior.data.model.ChildRequestApproveEntity */
public final class ChildRequestApproveEntity {
    private final long childClientKey;
    private final String childFirstName;
    private final String childFirstNameInt;
    private final String childLastName;
    private final String childLastNameInt;
    private final Long childRequestId;
    private final YesNoApiEntity hasSchoolCard;
    private final int resultCode;

    public ChildRequestApproveEntity(long j, String str, int i, YesNoApiEntity yesNoApiEntity, String str2, String str3, String str4, Long l) {
        C41536l.m120489i(str, "childFirstNameInt");
        C41536l.m120489i(yesNoApiEntity, "hasSchoolCard");
        C41536l.m120489i(str2, "childLastName");
        C41536l.m120489i(str3, "childFirstName");
        C41536l.m120489i(str4, "childLastNameInt");
        this.childClientKey = j;
        this.childFirstNameInt = str;
        this.resultCode = i;
        this.hasSchoolCard = yesNoApiEntity;
        this.childLastName = str2;
        this.childFirstName = str3;
        this.childLastNameInt = str4;
        this.childRequestId = l;
    }

    public static /* synthetic */ ChildRequestApproveEntity copy$default(ChildRequestApproveEntity childRequestApproveEntity, long j, String str, int i, YesNoApiEntity yesNoApiEntity, String str2, String str3, String str4, Long l, int i2, Object obj) {
        ChildRequestApproveEntity childRequestApproveEntity2 = childRequestApproveEntity;
        int i3 = i2;
        return childRequestApproveEntity.copy((i3 & 1) != 0 ? childRequestApproveEntity2.childClientKey : j, (i3 & 2) != 0 ? childRequestApproveEntity2.childFirstNameInt : str, (i3 & 4) != 0 ? childRequestApproveEntity2.resultCode : i, (i3 & 8) != 0 ? childRequestApproveEntity2.hasSchoolCard : yesNoApiEntity, (i3 & 16) != 0 ? childRequestApproveEntity2.childLastName : str2, (i3 & 32) != 0 ? childRequestApproveEntity2.childFirstName : str3, (i3 & 64) != 0 ? childRequestApproveEntity2.childLastNameInt : str4, (i3 & 128) != 0 ? childRequestApproveEntity2.childRequestId : l);
    }

    public final long component1() {
        return this.childClientKey;
    }

    public final String component2() {
        return this.childFirstNameInt;
    }

    public final int component3() {
        return this.resultCode;
    }

    public final YesNoApiEntity component4() {
        return this.hasSchoolCard;
    }

    public final String component5() {
        return this.childLastName;
    }

    public final String component6() {
        return this.childFirstName;
    }

    public final String component7() {
        return this.childLastNameInt;
    }

    public final Long component8() {
        return this.childRequestId;
    }

    public final ChildRequestApproveEntity copy(long j, String str, int i, YesNoApiEntity yesNoApiEntity, String str2, String str3, String str4, Long l) {
        C41536l.m120489i(str, "childFirstNameInt");
        YesNoApiEntity yesNoApiEntity2 = yesNoApiEntity;
        C41536l.m120489i(yesNoApiEntity2, "hasSchoolCard");
        String str5 = str2;
        C41536l.m120489i(str5, "childLastName");
        String str6 = str3;
        C41536l.m120489i(str6, "childFirstName");
        String str7 = str4;
        C41536l.m120489i(str7, "childLastNameInt");
        return new ChildRequestApproveEntity(j, str, i, yesNoApiEntity2, str5, str6, str7, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildRequestApproveEntity)) {
            return false;
        }
        ChildRequestApproveEntity childRequestApproveEntity = (ChildRequestApproveEntity) obj;
        return this.childClientKey == childRequestApproveEntity.childClientKey && C41536l.m120484d(this.childFirstNameInt, childRequestApproveEntity.childFirstNameInt) && this.resultCode == childRequestApproveEntity.resultCode && this.hasSchoolCard == childRequestApproveEntity.hasSchoolCard && C41536l.m120484d(this.childLastName, childRequestApproveEntity.childLastName) && C41536l.m120484d(this.childFirstName, childRequestApproveEntity.childFirstName) && C41536l.m120484d(this.childLastNameInt, childRequestApproveEntity.childLastNameInt) && C41536l.m120484d(this.childRequestId, childRequestApproveEntity.childRequestId);
    }

    public final long getChildClientKey() {
        return this.childClientKey;
    }

    public final String getChildFirstName() {
        return this.childFirstName;
    }

    public final String getChildFirstNameInt() {
        return this.childFirstNameInt;
    }

    public final String getChildLastName() {
        return this.childLastName;
    }

    public final String getChildLastNameInt() {
        return this.childLastNameInt;
    }

    public final Long getChildRequestId() {
        return this.childRequestId;
    }

    public final YesNoApiEntity getHasSchoolCard() {
        return this.hasSchoolCard;
    }

    public final int getResultCode() {
        return this.resultCode;
    }

    public int hashCode() {
        int a = ((((((((((((C7397t.m28148a(this.childClientKey) * 31) + this.childFirstNameInt.hashCode()) * 31) + this.resultCode) * 31) + this.hasSchoolCard.hashCode()) * 31) + this.childLastName.hashCode()) * 31) + this.childFirstName.hashCode()) * 31) + this.childLastNameInt.hashCode()) * 31;
        Long l = this.childRequestId;
        return a + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        long j = this.childClientKey;
        String str = this.childFirstNameInt;
        int i = this.resultCode;
        YesNoApiEntity yesNoApiEntity = this.hasSchoolCard;
        String str2 = this.childLastName;
        String str3 = this.childFirstName;
        String str4 = this.childLastNameInt;
        Long l = this.childRequestId;
        return "ChildRequestApproveEntity(childClientKey=" + j + ", childFirstNameInt=" + str + ", resultCode=" + i + ", hasSchoolCard=" + yesNoApiEntity + ", childLastName=" + str2 + ", childFirstName=" + str3 + ", childLastNameInt=" + str4 + ", childRequestId=" + l + ")";
    }
}
