package p341ge.bog.mobilebank.galtandtaggart.data.model;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.galtandtaggart.data.model.ShareSymbolOnlineMinimizedDataApiModel */
public final class ShareSymbolOnlineMinimizedDataApiModel {
    private final String currency;
    private final BigDecimal mktPrice;
    private final BigDecimal priorClose;

    public ShareSymbolOnlineMinimizedDataApiModel(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "mktPrice");
        C41536l.m120489i(str, "currency");
        C41536l.m120489i(bigDecimal2, "priorClose");
        this.mktPrice = bigDecimal;
        this.currency = str;
        this.priorClose = bigDecimal2;
    }

    public static /* synthetic */ ShareSymbolOnlineMinimizedDataApiModel copy$default(ShareSymbolOnlineMinimizedDataApiModel shareSymbolOnlineMinimizedDataApiModel, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = shareSymbolOnlineMinimizedDataApiModel.mktPrice;
        }
        if ((i & 2) != 0) {
            str = shareSymbolOnlineMinimizedDataApiModel.currency;
        }
        if ((i & 4) != 0) {
            bigDecimal2 = shareSymbolOnlineMinimizedDataApiModel.priorClose;
        }
        return shareSymbolOnlineMinimizedDataApiModel.copy(bigDecimal, str, bigDecimal2);
    }

    public final BigDecimal component1() {
        return this.mktPrice;
    }

    public final String component2() {
        return this.currency;
    }

    public final BigDecimal component3() {
        return this.priorClose;
    }

    public final ShareSymbolOnlineMinimizedDataApiModel copy(BigDecimal bigDecimal, String str, BigDecimal bigDecimal2) {
        C41536l.m120489i(bigDecimal, "mktPrice");
        C41536l.m120489i(str, "currency");
        C41536l.m120489i(bigDecimal2, "priorClose");
        return new ShareSymbolOnlineMinimizedDataApiModel(bigDecimal, str, bigDecimal2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareSymbolOnlineMinimizedDataApiModel)) {
            return false;
        }
        ShareSymbolOnlineMinimizedDataApiModel shareSymbolOnlineMinimizedDataApiModel = (ShareSymbolOnlineMinimizedDataApiModel) obj;
        return C41536l.m120484d(this.mktPrice, shareSymbolOnlineMinimizedDataApiModel.mktPrice) && C41536l.m120484d(this.currency, shareSymbolOnlineMinimizedDataApiModel.currency) && C41536l.m120484d(this.priorClose, shareSymbolOnlineMinimizedDataApiModel.priorClose);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final BigDecimal getMktPrice() {
        return this.mktPrice;
    }

    public final BigDecimal getPriorClose() {
        return this.priorClose;
    }

    public int hashCode() {
        return (((this.mktPrice.hashCode() * 31) + this.currency.hashCode()) * 31) + this.priorClose.hashCode();
    }

    public String toString() {
        BigDecimal bigDecimal = this.mktPrice;
        String str = this.currency;
        BigDecimal bigDecimal2 = this.priorClose;
        return "ShareSymbolOnlineMinimizedDataApiModel(mktPrice=" + bigDecimal + ", currency=" + str + ", priorClose=" + bigDecimal2 + ")";
    }
}
