package p341ge.bog.mobilebank.galtandtaggart.domain.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.data.model.MarketStatus;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.domain.model.MarketInfo */
public final class MarketInfo {
    private final String nextOpenDate;
    private final MarketStatus status;

    public MarketInfo(MarketStatus marketStatus, String str) {
        this.status = marketStatus;
        this.nextOpenDate = str;
    }

    public static /* synthetic */ MarketInfo copy$default(MarketInfo marketInfo, MarketStatus marketStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            marketStatus = marketInfo.status;
        }
        if ((i & 2) != 0) {
            str = marketInfo.nextOpenDate;
        }
        return marketInfo.copy(marketStatus, str);
    }

    public final MarketStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.nextOpenDate;
    }

    public final MarketInfo copy(MarketStatus marketStatus, String str) {
        return new MarketInfo(marketStatus, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketInfo)) {
            return false;
        }
        MarketInfo marketInfo = (MarketInfo) obj;
        return this.status == marketInfo.status && C41536l.m120484d(this.nextOpenDate, marketInfo.nextOpenDate);
    }

    public final String getNextOpenDate() {
        return this.nextOpenDate;
    }

    public final MarketStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        MarketStatus marketStatus = this.status;
        int i = 0;
        int hashCode = (marketStatus == null ? 0 : marketStatus.hashCode()) * 31;
        String str = this.nextOpenDate;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        MarketStatus marketStatus = this.status;
        String str = this.nextOpenDate;
        return "MarketInfo(status=" + marketStatus + ", nextOpenDate=" + str + ")";
    }
}
