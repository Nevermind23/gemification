package p341ge.bog.mobilebank.giftcards.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.giftcards.data.model.ClientGiftCardsContainerApiModel */
public final class ClientGiftCardsContainerApiModel {
    private final List<ClientGiftCardApiModel> dto;

    public ClientGiftCardsContainerApiModel(List<ClientGiftCardApiModel> list) {
        this.dto = list;
    }

    public static /* synthetic */ ClientGiftCardsContainerApiModel copy$default(ClientGiftCardsContainerApiModel clientGiftCardsContainerApiModel, List<ClientGiftCardApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = clientGiftCardsContainerApiModel.dto;
        }
        return clientGiftCardsContainerApiModel.copy(list);
    }

    public final List<ClientGiftCardApiModel> component1() {
        return this.dto;
    }

    public final ClientGiftCardsContainerApiModel copy(List<ClientGiftCardApiModel> list) {
        return new ClientGiftCardsContainerApiModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientGiftCardsContainerApiModel) && C41536l.m120484d(this.dto, ((ClientGiftCardsContainerApiModel) obj).dto);
    }

    public final List<ClientGiftCardApiModel> getDto() {
        return this.dto;
    }

    public int hashCode() {
        List<ClientGiftCardApiModel> list = this.dto;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<ClientGiftCardApiModel> list = this.dto;
        return "ClientGiftCardsContainerApiModel(dto=" + list + ")";
    }
}
