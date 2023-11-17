package nc0;

import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;

/* renamed from: nc0.b */
public interface C26406b {

    /* renamed from: nc0.b$a */
    public static final class C26407a {
        /* renamed from: a */
        public static /* synthetic */ void m82517a(C26406b bVar, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    str2 = null;
                }
                if ((i & 4) != 0) {
                    str3 = null;
                }
                bVar.mo65647pf(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestDepositBreakValidation");
        }
    }

    /* renamed from: Bk */
    void mo65643Bk(CardAccountSelectorUiModel cardAccountSelectorUiModel);

    /* renamed from: En */
    void mo65644En(boolean z);

    /* renamed from: H0 */
    void mo65645H0();

    /* renamed from: Vs */
    void mo65646Vs();

    /* renamed from: pf */
    void mo65647pf(String str, String str2, String str3);
}
