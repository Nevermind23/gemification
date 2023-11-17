package p341ge.bog.mobilebank.qrwithdrawal.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.qrwithdrawal.data.model.DenominationApiData */
public final class DenominationApiData {
    @C8664c("EUR")
    private final List<Integer> euro;
    @C8664c("GBP")
    private final List<Integer> gbp;
    @C8664c("GEL")
    private final List<Integer> gel;
    @C8664c("USD")
    private final List<Integer> usd;

    public DenominationApiData(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
        this.usd = list;
        this.gel = list2;
        this.euro = list3;
        this.gbp = list4;
    }

    public static /* synthetic */ DenominationApiData copy$default(DenominationApiData denominationApiData, List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = denominationApiData.usd;
        }
        if ((i & 2) != 0) {
            list2 = denominationApiData.gel;
        }
        if ((i & 4) != 0) {
            list3 = denominationApiData.euro;
        }
        if ((i & 8) != 0) {
            list4 = denominationApiData.gbp;
        }
        return denominationApiData.copy(list, list2, list3, list4);
    }

    public final List<Integer> component1() {
        return this.usd;
    }

    public final List<Integer> component2() {
        return this.gel;
    }

    public final List<Integer> component3() {
        return this.euro;
    }

    public final List<Integer> component4() {
        return this.gbp;
    }

    public final DenominationApiData copy(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
        return new DenominationApiData(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DenominationApiData)) {
            return false;
        }
        DenominationApiData denominationApiData = (DenominationApiData) obj;
        return C41536l.m120484d(this.usd, denominationApiData.usd) && C41536l.m120484d(this.gel, denominationApiData.gel) && C41536l.m120484d(this.euro, denominationApiData.euro) && C41536l.m120484d(this.gbp, denominationApiData.gbp);
    }

    public final List<Integer> getEuro() {
        return this.euro;
    }

    public final List<Integer> getGbp() {
        return this.gbp;
    }

    public final List<Integer> getGel() {
        return this.gel;
    }

    public final List<Integer> getUsd() {
        return this.usd;
    }

    public int hashCode() {
        List<Integer> list = this.usd;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.gel;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Integer> list3 = this.euro;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<Integer> list4 = this.gbp;
        if (list4 != null) {
            i = list4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        List<Integer> list = this.usd;
        List<Integer> list2 = this.gel;
        List<Integer> list3 = this.euro;
        List<Integer> list4 = this.gbp;
        return "DenominationApiData(usd=" + list + ", gel=" + list2 + ", euro=" + list3 + ", gbp=" + list4 + ")";
    }
}
