package p412en;

import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeDetailsUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardRenewalListItem;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPayrollInfoUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.ScoolCardOwnerUiModel;

/* renamed from: en.h0 */
public interface C12536h0 {

    /* renamed from: en.h0$a */
    public static final class C12537a {
        /* renamed from: a */
        public static /* synthetic */ void m47635a(C12536h0 h0Var, CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                h0Var.mo33168s9(cardApplicationTypeDetailsUiModel, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCardAppTypeClick");
        }
    }

    /* renamed from: Jv */
    void mo33165Jv(ScoolCardOwnerUiModel scoolCardOwnerUiModel);

    /* renamed from: lj */
    void mo33166lj(DebitCardPayrollInfoUiModel debitCardPayrollInfoUiModel);

    /* renamed from: pd */
    void mo33167pd(CardRenewalListItem.CardRenewalCardItem cardRenewalCardItem);

    /* renamed from: s9 */
    void mo33168s9(CardApplicationTypeDetailsUiModel cardApplicationTypeDetailsUiModel, String str);
}
