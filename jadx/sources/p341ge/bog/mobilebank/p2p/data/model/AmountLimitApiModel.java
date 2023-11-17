package p341ge.bog.mobilebank.p2p.data.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.p2p.data.model.AmountLimitApiModel */
public final class AmountLimitApiModel {
    private final int p2pOneTimeLimit;

    public AmountLimitApiModel(int i) {
        this.p2pOneTimeLimit = i;
    }

    public static /* synthetic */ AmountLimitApiModel copy$default(AmountLimitApiModel amountLimitApiModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = amountLimitApiModel.p2pOneTimeLimit;
        }
        return amountLimitApiModel.copy(i);
    }

    public final int component1() {
        return this.p2pOneTimeLimit;
    }

    public final AmountLimitApiModel copy(int i) {
        return new AmountLimitApiModel(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AmountLimitApiModel) && this.p2pOneTimeLimit == ((AmountLimitApiModel) obj).p2pOneTimeLimit;
    }

    public final int getP2pOneTimeLimit() {
        return this.p2pOneTimeLimit;
    }

    public int hashCode() {
        return this.p2pOneTimeLimit;
    }

    public String toString() {
        int i = this.p2pOneTimeLimit;
        return "AmountLimitApiModel(p2pOneTimeLimit=" + i + ")";
    }
}
