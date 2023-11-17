package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositBondDetailsApiModel */
public final class DepositBondDetailsApiModel {
    private final String agreeNo;
    private final long cdGroupId;
    private final long clientKey;

    public final String getAgreeNo() {
        return this.agreeNo;
    }

    public final long getCdGroupId() {
        return this.cdGroupId;
    }

    public final long getClientKey() {
        return this.clientKey;
    }
}
