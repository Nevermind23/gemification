package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.GTMarketInfoApiModel */
public final class GTMarketInfoApiModel {
    private final String nextOpenDate;
    private final MarketStatus status;

    public GTMarketInfoApiModel(MarketStatus marketStatus, String str) {
        this.status = marketStatus;
        this.nextOpenDate = str;
    }

    public static /* synthetic */ GTMarketInfoApiModel copy$default(GTMarketInfoApiModel gTMarketInfoApiModel, MarketStatus marketStatus, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            marketStatus = gTMarketInfoApiModel.status;
        }
        if ((i & 2) != 0) {
            str = gTMarketInfoApiModel.nextOpenDate;
        }
        return gTMarketInfoApiModel.copy(marketStatus, str);
    }

    public final MarketStatus component1() {
        return this.status;
    }

    public final String component2() {
        return this.nextOpenDate;
    }

    public final GTMarketInfoApiModel copy(MarketStatus marketStatus, String str) {
        return new GTMarketInfoApiModel(marketStatus, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTMarketInfoApiModel)) {
            return false;
        }
        GTMarketInfoApiModel gTMarketInfoApiModel = (GTMarketInfoApiModel) obj;
        return this.status == gTMarketInfoApiModel.status && C41536l.m120484d(this.nextOpenDate, gTMarketInfoApiModel.nextOpenDate);
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
        return "GTMarketInfoApiModel(status=" + marketStatus + ", nextOpenDate=" + str + ")";
    }
}
