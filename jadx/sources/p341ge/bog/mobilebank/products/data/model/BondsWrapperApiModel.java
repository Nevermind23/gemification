package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.BondsWrapperApiModel */
public final class BondsWrapperApiModel {
    @C8664c("agreements")
    private final List<BondApiModel> bonds;
    private final List<CashAgreementApiModel> cashAgreements;
    private final AgreementClientInfoApiModel clientInfo;

    public BondsWrapperApiModel(AgreementClientInfoApiModel agreementClientInfoApiModel, List<BondApiModel> list, List<CashAgreementApiModel> list2) {
        C41536l.m120489i(agreementClientInfoApiModel, "clientInfo");
        C41536l.m120489i(list, "bonds");
        this.clientInfo = agreementClientInfoApiModel;
        this.bonds = list;
        this.cashAgreements = list2;
    }

    public static /* synthetic */ BondsWrapperApiModel copy$default(BondsWrapperApiModel bondsWrapperApiModel, AgreementClientInfoApiModel agreementClientInfoApiModel, List<BondApiModel> list, List<CashAgreementApiModel> list2, int i, Object obj) {
        if ((i & 1) != 0) {
            agreementClientInfoApiModel = bondsWrapperApiModel.clientInfo;
        }
        if ((i & 2) != 0) {
            list = bondsWrapperApiModel.bonds;
        }
        if ((i & 4) != 0) {
            list2 = bondsWrapperApiModel.cashAgreements;
        }
        return bondsWrapperApiModel.copy(agreementClientInfoApiModel, list, list2);
    }

    public final AgreementClientInfoApiModel component1() {
        return this.clientInfo;
    }

    public final List<BondApiModel> component2() {
        return this.bonds;
    }

    public final List<CashAgreementApiModel> component3() {
        return this.cashAgreements;
    }

    public final BondsWrapperApiModel copy(AgreementClientInfoApiModel agreementClientInfoApiModel, List<BondApiModel> list, List<CashAgreementApiModel> list2) {
        C41536l.m120489i(agreementClientInfoApiModel, "clientInfo");
        C41536l.m120489i(list, "bonds");
        return new BondsWrapperApiModel(agreementClientInfoApiModel, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BondsWrapperApiModel)) {
            return false;
        }
        BondsWrapperApiModel bondsWrapperApiModel = (BondsWrapperApiModel) obj;
        return C41536l.m120484d(this.clientInfo, bondsWrapperApiModel.clientInfo) && C41536l.m120484d(this.bonds, bondsWrapperApiModel.bonds) && C41536l.m120484d(this.cashAgreements, bondsWrapperApiModel.cashAgreements);
    }

    public final List<BondApiModel> getBonds() {
        return this.bonds;
    }

    public final List<CashAgreementApiModel> getCashAgreements() {
        return this.cashAgreements;
    }

    public final AgreementClientInfoApiModel getClientInfo() {
        return this.clientInfo;
    }

    public int hashCode() {
        int hashCode = ((this.clientInfo.hashCode() * 31) + this.bonds.hashCode()) * 31;
        List<CashAgreementApiModel> list = this.cashAgreements;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        AgreementClientInfoApiModel agreementClientInfoApiModel = this.clientInfo;
        List<BondApiModel> list = this.bonds;
        List<CashAgreementApiModel> list2 = this.cashAgreements;
        return "BondsWrapperApiModel(clientInfo=" + agreementClientInfoApiModel + ", bonds=" + list + ", cashAgreements=" + list2 + ")";
    }
}
