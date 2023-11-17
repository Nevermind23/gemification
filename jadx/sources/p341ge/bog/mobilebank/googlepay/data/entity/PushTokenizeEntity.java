package p341ge.bog.mobilebank.googlepay.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.googlepay.data.entity.PushTokenizeEntity */
public final class PushTokenizeEntity {
    private final CardNetworkEntity cardNetwork;
    private final String lastDigits;
    private final String opcBase64;
    private final TokenProviderEntity tokenProvider;
    private final UserAddressEntity userAddress;

    public PushTokenizeEntity(CardNetworkEntity cardNetworkEntity, String str, String str2, TokenProviderEntity tokenProviderEntity, UserAddressEntity userAddressEntity) {
        C41536l.m120489i(cardNetworkEntity, "cardNetwork");
        C41536l.m120489i(str, "lastDigits");
        C41536l.m120489i(str2, "opcBase64");
        C41536l.m120489i(tokenProviderEntity, "tokenProvider");
        C41536l.m120489i(userAddressEntity, "userAddress");
        this.cardNetwork = cardNetworkEntity;
        this.lastDigits = str;
        this.opcBase64 = str2;
        this.tokenProvider = tokenProviderEntity;
        this.userAddress = userAddressEntity;
    }

    public static /* synthetic */ PushTokenizeEntity copy$default(PushTokenizeEntity pushTokenizeEntity, CardNetworkEntity cardNetworkEntity, String str, String str2, TokenProviderEntity tokenProviderEntity, UserAddressEntity userAddressEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            cardNetworkEntity = pushTokenizeEntity.cardNetwork;
        }
        if ((i & 2) != 0) {
            str = pushTokenizeEntity.lastDigits;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = pushTokenizeEntity.opcBase64;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            tokenProviderEntity = pushTokenizeEntity.tokenProvider;
        }
        TokenProviderEntity tokenProviderEntity2 = tokenProviderEntity;
        if ((i & 16) != 0) {
            userAddressEntity = pushTokenizeEntity.userAddress;
        }
        return pushTokenizeEntity.copy(cardNetworkEntity, str3, str4, tokenProviderEntity2, userAddressEntity);
    }

    public final CardNetworkEntity component1() {
        return this.cardNetwork;
    }

    public final String component2() {
        return this.lastDigits;
    }

    public final String component3() {
        return this.opcBase64;
    }

    public final TokenProviderEntity component4() {
        return this.tokenProvider;
    }

    public final UserAddressEntity component5() {
        return this.userAddress;
    }

    public final PushTokenizeEntity copy(CardNetworkEntity cardNetworkEntity, String str, String str2, TokenProviderEntity tokenProviderEntity, UserAddressEntity userAddressEntity) {
        C41536l.m120489i(cardNetworkEntity, "cardNetwork");
        C41536l.m120489i(str, "lastDigits");
        C41536l.m120489i(str2, "opcBase64");
        C41536l.m120489i(tokenProviderEntity, "tokenProvider");
        C41536l.m120489i(userAddressEntity, "userAddress");
        return new PushTokenizeEntity(cardNetworkEntity, str, str2, tokenProviderEntity, userAddressEntity);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushTokenizeEntity)) {
            return false;
        }
        PushTokenizeEntity pushTokenizeEntity = (PushTokenizeEntity) obj;
        return this.cardNetwork == pushTokenizeEntity.cardNetwork && C41536l.m120484d(this.lastDigits, pushTokenizeEntity.lastDigits) && C41536l.m120484d(this.opcBase64, pushTokenizeEntity.opcBase64) && this.tokenProvider == pushTokenizeEntity.tokenProvider && C41536l.m120484d(this.userAddress, pushTokenizeEntity.userAddress);
    }

    public final CardNetworkEntity getCardNetwork() {
        return this.cardNetwork;
    }

    public final String getLastDigits() {
        return this.lastDigits;
    }

    public final String getOpcBase64() {
        return this.opcBase64;
    }

    public final TokenProviderEntity getTokenProvider() {
        return this.tokenProvider;
    }

    public final UserAddressEntity getUserAddress() {
        return this.userAddress;
    }

    public int hashCode() {
        return (((((((this.cardNetwork.hashCode() * 31) + this.lastDigits.hashCode()) * 31) + this.opcBase64.hashCode()) * 31) + this.tokenProvider.hashCode()) * 31) + this.userAddress.hashCode();
    }

    public String toString() {
        CardNetworkEntity cardNetworkEntity = this.cardNetwork;
        String str = this.lastDigits;
        String str2 = this.opcBase64;
        TokenProviderEntity tokenProviderEntity = this.tokenProvider;
        UserAddressEntity userAddressEntity = this.userAddress;
        return "PushTokenizeEntity(cardNetwork=" + cardNetworkEntity + ", lastDigits=" + str + ", opcBase64=" + str2 + ", tokenProvider=" + tokenProviderEntity + ", userAddress=" + userAddressEntity + ")";
    }
}
