package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositBondsListWrapperApiModel */
public final class DepositBondsListWrapperApiModel {
    private final DepositBondsWrapperApiModel bonds;
    private final List<DepositBondDetailsApiModel> details;

    public final DepositBondsWrapperApiModel getBonds() {
        return this.bonds;
    }

    public final List<DepositBondDetailsApiModel> getDetails() {
        return this.details;
    }
}
