package p341ge.bog.mobilebank.lifestyleoffers.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.data.entity.LifestyleClientInterestApiModel */
public final class LifestyleClientInterestApiModel {
    private final Long clientKey;

    /* renamed from: id */
    private final Long f43083id;
    private final String inpSysDate;
    private final String interestSubType;
    private final String interestType;

    public LifestyleClientInterestApiModel(Long l, Long l2, String str, String str2, String str3) {
        this.f43083id = l;
        this.clientKey = l2;
        this.interestType = str;
        this.interestSubType = str2;
        this.inpSysDate = str3;
    }

    public static /* synthetic */ LifestyleClientInterestApiModel copy$default(LifestyleClientInterestApiModel lifestyleClientInterestApiModel, Long l, Long l2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            l = lifestyleClientInterestApiModel.f43083id;
        }
        if ((i & 2) != 0) {
            l2 = lifestyleClientInterestApiModel.clientKey;
        }
        Long l3 = l2;
        if ((i & 4) != 0) {
            str = lifestyleClientInterestApiModel.interestType;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = lifestyleClientInterestApiModel.interestSubType;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = lifestyleClientInterestApiModel.inpSysDate;
        }
        return lifestyleClientInterestApiModel.copy(l, l3, str4, str5, str3);
    }

    public final Long component1() {
        return this.f43083id;
    }

    public final Long component2() {
        return this.clientKey;
    }

    public final String component3() {
        return this.interestType;
    }

    public final String component4() {
        return this.interestSubType;
    }

    public final String component5() {
        return this.inpSysDate;
    }

    public final LifestyleClientInterestApiModel copy(Long l, Long l2, String str, String str2, String str3) {
        return new LifestyleClientInterestApiModel(l, l2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleClientInterestApiModel)) {
            return false;
        }
        LifestyleClientInterestApiModel lifestyleClientInterestApiModel = (LifestyleClientInterestApiModel) obj;
        return C41536l.m120484d(this.f43083id, lifestyleClientInterestApiModel.f43083id) && C41536l.m120484d(this.clientKey, lifestyleClientInterestApiModel.clientKey) && C41536l.m120484d(this.interestType, lifestyleClientInterestApiModel.interestType) && C41536l.m120484d(this.interestSubType, lifestyleClientInterestApiModel.interestSubType) && C41536l.m120484d(this.inpSysDate, lifestyleClientInterestApiModel.inpSysDate);
    }

    public final Long getClientKey() {
        return this.clientKey;
    }

    public final Long getId() {
        return this.f43083id;
    }

    public final String getInpSysDate() {
        return this.inpSysDate;
    }

    public final String getInterestSubType() {
        return this.interestSubType;
    }

    public final String getInterestType() {
        return this.interestType;
    }

    public int hashCode() {
        Long l = this.f43083id;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.clientKey;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.interestType;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.interestSubType;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.inpSysDate;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        Long l = this.f43083id;
        Long l2 = this.clientKey;
        String str = this.interestType;
        String str2 = this.interestSubType;
        String str3 = this.inpSysDate;
        return "LifestyleClientInterestApiModel(id=" + l + ", clientKey=" + l2 + ", interestType=" + str + ", interestSubType=" + str2 + ", inpSysDate=" + str3 + ")";
    }
}
