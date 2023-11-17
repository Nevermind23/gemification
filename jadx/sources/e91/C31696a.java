package e91;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.p975ui.wizard.model.offers.CardSelectorWizardCardUIModel;

/* renamed from: e91.a */
public abstract class C31696a {
    /* renamed from: a */
    public static final CardSelectorWizardCardUIModel m93838a(LoanOfferCard loanOfferCard) {
        C41536l.m120489i(loanOfferCard, "<this>");
        String lastFour = loanOfferCard.getLastFour();
        if (lastFour == null) {
            lastFour = "1234";
        }
        String subProductCode = loanOfferCard.getSubProductCode();
        C41536l.m120488h(subProductCode, "subProductCode");
        return new CardSelectorWizardCardUIModel(lastFour, subProductCode, loanOfferCard.getProductDictionaryKey(), loanOfferCard.getCardName(), new CardExternalFile("", false, loanOfferCard.getCardExternalFile().getFileUrl()));
    }
}
