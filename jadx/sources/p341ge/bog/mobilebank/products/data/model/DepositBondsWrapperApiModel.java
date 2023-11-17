package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.DepositBondsWrapperApiModel */
public final class DepositBondsWrapperApiModel {
    private final List<DepositBondApiModel> bonds;
    private final DepositBondApiModel summary;

    public final List<DepositBondApiModel> getBonds() {
        return this.bonds;
    }

    public final DepositBondApiModel getSummary() {
        return this.summary;
    }
}
