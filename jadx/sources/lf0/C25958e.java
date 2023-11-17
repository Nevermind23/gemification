package lf0;

import if0.C25192a;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;

/* renamed from: lf0.e */
public interface C25958e {

    /* renamed from: lf0.e$a */
    public static final class C25959a {
        /* renamed from: a */
        public static /* synthetic */ void m81603a(C25958e eVar, C21503d dVar, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    str3 = null;
                }
                eVar.mo60201Ph(dVar, str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScaState");
        }
    }

    /* renamed from: Ph */
    void mo60201Ph(C21503d dVar, String str, String str2, String str3);

    /* renamed from: hp */
    void mo60203hp(TransferAccountItem transferAccountItem);

    /* renamed from: w0 */
    void mo60208w0(C25192a aVar);
}
