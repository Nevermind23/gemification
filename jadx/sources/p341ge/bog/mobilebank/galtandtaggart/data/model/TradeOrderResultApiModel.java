package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.TradeOrderResultApiModel */
public final class TradeOrderResultApiModel {
    private final String orderId;
    private final String orderNo;

    public TradeOrderResultApiModel(String str, String str2) {
        this.orderId = str;
        this.orderNo = str2;
    }

    public static /* synthetic */ TradeOrderResultApiModel copy$default(TradeOrderResultApiModel tradeOrderResultApiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tradeOrderResultApiModel.orderId;
        }
        if ((i & 2) != 0) {
            str2 = tradeOrderResultApiModel.orderNo;
        }
        return tradeOrderResultApiModel.copy(str, str2);
    }

    public final String component1() {
        return this.orderId;
    }

    public final String component2() {
        return this.orderNo;
    }

    public final TradeOrderResultApiModel copy(String str, String str2) {
        return new TradeOrderResultApiModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeOrderResultApiModel)) {
            return false;
        }
        TradeOrderResultApiModel tradeOrderResultApiModel = (TradeOrderResultApiModel) obj;
        return C41536l.m120484d(this.orderId, tradeOrderResultApiModel.orderId) && C41536l.m120484d(this.orderNo, tradeOrderResultApiModel.orderNo);
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getOrderNo() {
        return this.orderNo;
    }

    public int hashCode() {
        String str = this.orderId;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderNo;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.orderId;
        String str2 = this.orderNo;
        return "TradeOrderResultApiModel(orderId=" + str + ", orderNo=" + str2 + ")";
    }
}
