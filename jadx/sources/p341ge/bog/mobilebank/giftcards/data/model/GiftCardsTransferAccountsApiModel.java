package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.GiftCardsTransferAccountsApiModel */
public final class GiftCardsTransferAccountsApiModel {
    @C8664c("PAYMENT_WITHIN_BANK")
    private final List<GiftCardsTransferAccountApiModel> bank;

    public GiftCardsTransferAccountsApiModel() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ GiftCardsTransferAccountsApiModel copy$default(GiftCardsTransferAccountsApiModel giftCardsTransferAccountsApiModel, List<GiftCardsTransferAccountApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftCardsTransferAccountsApiModel.bank;
        }
        return giftCardsTransferAccountsApiModel.copy(list);
    }

    public final List<GiftCardsTransferAccountApiModel> component1() {
        return this.bank;
    }

    public final GiftCardsTransferAccountsApiModel copy(List<GiftCardsTransferAccountApiModel> list) {
        return new GiftCardsTransferAccountsApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GiftCardsTransferAccountsApiModel) && C41536l.m120484d(this.bank, ((GiftCardsTransferAccountsApiModel) obj).bank);
    }

    public final List<GiftCardsTransferAccountApiModel> getBank() {
        return this.bank;
    }

    public int hashCode() {
        List<GiftCardsTransferAccountApiModel> list = this.bank;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<GiftCardsTransferAccountApiModel> list = this.bank;
        return "GiftCardsTransferAccountsApiModel(bank=" + list + ")";
    }

    public GiftCardsTransferAccountsApiModel(List<GiftCardsTransferAccountApiModel> list) {
        this.bank = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GiftCardsTransferAccountsApiModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
