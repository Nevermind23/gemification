package p341ge.bog.mobilebank.transportcard.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.transportcard.data.model.ActivePassApiModel */
public final class ActivePassApiModel {
    private final long chargeAcctKey;
    private final long endDate;
    private final String passDescription;
    private final long passId;
    private final String passTitle;
    private final long startDate;
    private final String typeCode;
    private final long typeId;

    public ActivePassApiModel(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3) {
        C41536l.m120489i(str, "typeCode");
        C41536l.m120489i(str2, "passTitle");
        C41536l.m120489i(str3, "passDescription");
        this.passId = j;
        this.typeId = j2;
        this.startDate = j3;
        this.endDate = j4;
        this.chargeAcctKey = j5;
        this.typeCode = str;
        this.passTitle = str2;
        this.passDescription = str3;
    }

    public static /* synthetic */ ActivePassApiModel copy$default(ActivePassApiModel activePassApiModel, long j, long j2, long j3, long j4, long j5, String str, String str2, String str3, int i, Object obj) {
        ActivePassApiModel activePassApiModel2 = activePassApiModel;
        int i2 = i;
        return activePassApiModel.copy((i2 & 1) != 0 ? activePassApiModel2.passId : j, (i2 & 2) != 0 ? activePassApiModel2.typeId : j2, (i2 & 4) != 0 ? activePassApiModel2.startDate : j3, (i2 & 8) != 0 ? activePassApiModel2.endDate : j4, (i2 & 16) != 0 ? activePassApiModel2.chargeAcctKey : j5, (i2 & 32) != 0 ? activePassApiModel2.typeCode : str, (i2 & 64) != 0 ? activePassApiModel2.passTitle : str2, (i2 & 128) != 0 ? activePassApiModel2.passDescription : str3);
    }

    public final long component1() {
        return this.passId;
    }

    public final long component2() {
        return this.typeId;
    }

    public final long component3() {
        return this.startDate;
    }

    public final long component4() {
        return this.endDate;
    }

    public final long component5() {
        return this.chargeAcctKey;
    }

    public final String component6() {
        return this.typeCode;
    }

    public final String component7() {
        return this.passTitle;
    }

    public final String component8() {
        return this.passDescription;
    }

    public final ActivePassApiModel copy(long j, long j2, long j3, long j4, long j5, String str, String str2, String str3) {
        String str4 = str;
        C41536l.m120489i(str4, "typeCode");
        String str5 = str2;
        C41536l.m120489i(str5, "passTitle");
        String str6 = str3;
        C41536l.m120489i(str6, "passDescription");
        return new ActivePassApiModel(j, j2, j3, j4, j5, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivePassApiModel)) {
            return false;
        }
        ActivePassApiModel activePassApiModel = (ActivePassApiModel) obj;
        return this.passId == activePassApiModel.passId && this.typeId == activePassApiModel.typeId && this.startDate == activePassApiModel.startDate && this.endDate == activePassApiModel.endDate && this.chargeAcctKey == activePassApiModel.chargeAcctKey && C41536l.m120484d(this.typeCode, activePassApiModel.typeCode) && C41536l.m120484d(this.passTitle, activePassApiModel.passTitle) && C41536l.m120484d(this.passDescription, activePassApiModel.passDescription);
    }

    public final long getChargeAcctKey() {
        return this.chargeAcctKey;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getPassDescription() {
        return this.passDescription;
    }

    public final long getPassId() {
        return this.passId;
    }

    public final String getPassTitle() {
        return this.passTitle;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final String getTypeCode() {
        return this.typeCode;
    }

    public final long getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        return (((((((((((((C7397t.m28148a(this.passId) * 31) + C7397t.m28148a(this.typeId)) * 31) + C7397t.m28148a(this.startDate)) * 31) + C7397t.m28148a(this.endDate)) * 31) + C7397t.m28148a(this.chargeAcctKey)) * 31) + this.typeCode.hashCode()) * 31) + this.passTitle.hashCode()) * 31) + this.passDescription.hashCode();
    }

    public String toString() {
        long j = this.passId;
        long j2 = this.typeId;
        long j3 = this.startDate;
        long j4 = this.endDate;
        long j5 = this.chargeAcctKey;
        String str = this.typeCode;
        String str2 = this.passTitle;
        String str3 = this.passDescription;
        return "ActivePassApiModel(passId=" + j + ", typeId=" + j2 + ", startDate=" + j3 + ", endDate=" + j4 + ", chargeAcctKey=" + j5 + ", typeCode=" + str + ", passTitle=" + str2 + ", passDescription=" + str3 + ")";
    }
}
