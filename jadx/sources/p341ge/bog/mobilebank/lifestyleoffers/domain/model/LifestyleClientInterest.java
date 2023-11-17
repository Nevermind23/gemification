package p341ge.bog.mobilebank.lifestyleoffers.domain.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.lifestyleoffers.domain.model.LifestyleClientInterest */
public final class LifestyleClientInterest {

    /* renamed from: id */
    private final long f43084id;
    private final String interestSubType;
    private final String interestType;

    public LifestyleClientInterest(long j, String str, String str2) {
        C41536l.m120489i(str, "interestType");
        C41536l.m120489i(str2, "interestSubType");
        this.f43084id = j;
        this.interestType = str;
        this.interestSubType = str2;
    }

    public static /* synthetic */ LifestyleClientInterest copy$default(LifestyleClientInterest lifestyleClientInterest, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = lifestyleClientInterest.f43084id;
        }
        if ((i & 2) != 0) {
            str = lifestyleClientInterest.interestType;
        }
        if ((i & 4) != 0) {
            str2 = lifestyleClientInterest.interestSubType;
        }
        return lifestyleClientInterest.copy(j, str, str2);
    }

    public final long component1() {
        return this.f43084id;
    }

    public final String component2() {
        return this.interestType;
    }

    public final String component3() {
        return this.interestSubType;
    }

    public final LifestyleClientInterest copy(long j, String str, String str2) {
        C41536l.m120489i(str, "interestType");
        C41536l.m120489i(str2, "interestSubType");
        return new LifestyleClientInterest(j, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LifestyleClientInterest)) {
            return false;
        }
        LifestyleClientInterest lifestyleClientInterest = (LifestyleClientInterest) obj;
        return this.f43084id == lifestyleClientInterest.f43084id && C41536l.m120484d(this.interestType, lifestyleClientInterest.interestType) && C41536l.m120484d(this.interestSubType, lifestyleClientInterest.interestSubType);
    }

    public final long getId() {
        return this.f43084id;
    }

    public final String getInterestSubType() {
        return this.interestSubType;
    }

    public final String getInterestType() {
        return this.interestType;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f43084id) * 31) + this.interestType.hashCode()) * 31) + this.interestSubType.hashCode();
    }

    public String toString() {
        long j = this.f43084id;
        String str = this.interestType;
        String str2 = this.interestSubType;
        return "LifestyleClientInterest(id=" + j + ", interestType=" + str + ", interestSubType=" + str2 + ")";
    }
}
