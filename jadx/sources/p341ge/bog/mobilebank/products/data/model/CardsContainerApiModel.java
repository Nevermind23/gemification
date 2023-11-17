package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p277ua.C8664c;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CardsContainerApiModel */
public final class CardsContainerApiModel {
    @C8664c("accounts")
    private final List<CreditCardAccountApiModel> accounts;
    @C8664c("summary")
    private final CreditCardSummeryApiModel summary;

    public CardsContainerApiModel(CreditCardSummeryApiModel creditCardSummeryApiModel, List<CreditCardAccountApiModel> list) {
        C41536l.m120489i(creditCardSummeryApiModel, "summary");
        C41536l.m120489i(list, "accounts");
        this.summary = creditCardSummeryApiModel;
        this.accounts = list;
    }

    public static /* synthetic */ CardsContainerApiModel copy$default(CardsContainerApiModel cardsContainerApiModel, CreditCardSummeryApiModel creditCardSummeryApiModel, List<CreditCardAccountApiModel> list, int i, Object obj) {
        if ((i & 1) != 0) {
            creditCardSummeryApiModel = cardsContainerApiModel.summary;
        }
        if ((i & 2) != 0) {
            list = cardsContainerApiModel.accounts;
        }
        return cardsContainerApiModel.copy(creditCardSummeryApiModel, list);
    }

    public final CreditCardSummeryApiModel component1() {
        return this.summary;
    }

    public final List<CreditCardAccountApiModel> component2() {
        return this.accounts;
    }

    public final CardsContainerApiModel copy(CreditCardSummeryApiModel creditCardSummeryApiModel, List<CreditCardAccountApiModel> list) {
        C41536l.m120489i(creditCardSummeryApiModel, "summary");
        C41536l.m120489i(list, "accounts");
        return new CardsContainerApiModel(creditCardSummeryApiModel, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardsContainerApiModel)) {
            return false;
        }
        CardsContainerApiModel cardsContainerApiModel = (CardsContainerApiModel) obj;
        return C41536l.m120484d(this.summary, cardsContainerApiModel.summary) && C41536l.m120484d(this.accounts, cardsContainerApiModel.accounts);
    }

    public final List<CreditCardAccountApiModel> getAccounts() {
        return this.accounts;
    }

    public final CreditCardSummeryApiModel getSummary() {
        return this.summary;
    }

    public int hashCode() {
        return (this.summary.hashCode() * 31) + this.accounts.hashCode();
    }

    public String toString() {
        CreditCardSummeryApiModel creditCardSummeryApiModel = this.summary;
        List<CreditCardAccountApiModel> list = this.accounts;
        return "CardsContainerApiModel(summary=" + creditCardSummeryApiModel + ", accounts=" + list + ")";
    }
}
