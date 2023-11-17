package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardTransactionsApiModelContainer */
public final class GiftCardTransactionsApiModelContainer {
    private final List<GiftCardTransactionApiModel> dto;

    public GiftCardTransactionsApiModelContainer(List<GiftCardTransactionApiModel> list) {
        this.dto = list;
    }

    public static /* synthetic */ GiftCardTransactionsApiModelContainer copy$default(GiftCardTransactionsApiModelContainer giftCardTransactionsApiModelContainer, List<GiftCardTransactionApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftCardTransactionsApiModelContainer.dto;
        }
        return giftCardTransactionsApiModelContainer.copy(list);
    }

    public final List<GiftCardTransactionApiModel> component1() {
        return this.dto;
    }

    public final GiftCardTransactionsApiModelContainer copy(List<GiftCardTransactionApiModel> list) {
        return new GiftCardTransactionsApiModelContainer(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardTransactionsApiModelContainer) && C41536l.m120484d(this.dto, ((GiftCardTransactionsApiModelContainer) obj).dto);
    }

    public final List<GiftCardTransactionApiModel> getDto() {
        return this.dto;
    }

    public int hashCode() {
        List<GiftCardTransactionApiModel> list = this.dto;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<GiftCardTransactionApiModel> list = this.dto;
        return "GiftCardTransactionsApiModelContainer(dto=" + list + ")";
    }
}
