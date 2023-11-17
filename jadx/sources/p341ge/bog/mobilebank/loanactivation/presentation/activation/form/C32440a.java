package p341ge.bog.mobilebank.loanactivation.presentation.activation.form;

import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;
import sq0.C38508a;
import yp0.C40044a;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.a */
public interface C32440a {

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.form.a$a */
    public static final class C32441a {
        /* renamed from: a */
        public static /* synthetic */ void m95802a(C32440a aVar, C40044a aVar2, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                aVar.mo73219o5(aVar2, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }

        /* renamed from: b */
        public static /* synthetic */ void m95803b(C32440a aVar, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = false;
                }
                aVar.mo73214Zs(str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAmountInput");
        }
    }

    /* renamed from: G2 */
    void mo73207G2(C38508a.C38511c cVar);

    /* renamed from: Kd */
    void mo73208Kd(InsuranceProviderData insuranceProviderData);

    /* renamed from: N2 */
    void mo73209N2();

    /* renamed from: Nm */
    void mo73210Nm();

    /* renamed from: O0 */
    void mo73211O0(boolean z);

    /* renamed from: Q2 */
    void mo73212Q2(boolean z);

    /* renamed from: T */
    void mo73213T();

    /* renamed from: Zs */
    void mo73214Zs(String str, boolean z);

    /* renamed from: a7 */
    void mo73215a7(int i);

    /* renamed from: e3 */
    void mo73216e3();

    /* renamed from: g0 */
    void mo73217g0();

    /* renamed from: k2 */
    void mo73218k2(LoanAccountListItem loanAccountListItem);

    /* renamed from: o5 */
    void mo73219o5(C40044a aVar, String str);

    /* renamed from: rl */
    void mo73220rl();

    /* renamed from: wq */
    void mo73221wq(int i);
}
