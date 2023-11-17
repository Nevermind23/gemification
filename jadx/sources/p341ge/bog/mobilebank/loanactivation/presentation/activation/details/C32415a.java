package p341ge.bog.mobilebank.loanactivation.presentation.activation.details;

/* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.a */
public interface C32415a {

    /* renamed from: ge.bog.mobilebank.loanactivation.presentation.activation.details.a$a */
    public static final class C32416a {
        /* renamed from: a */
        public static /* synthetic */ void m95714a(C32415a aVar, String str, String str2, String str3, int i, Object obj) {
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
                aVar.mo71225y4(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerLoan");
        }
    }

    /* renamed from: s0 */
    void mo71222s0();

    /* renamed from: y4 */
    void mo71225y4(String str, String str2, String str3);
}
