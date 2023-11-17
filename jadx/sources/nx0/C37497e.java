package nx0;

import cx0.C31456c;
import ed1.C40749p;

/* renamed from: nx0.e */
public interface C37497e {

    /* renamed from: nx0.e$a */
    public static final class C37498a {
        /* renamed from: a */
        public static /* synthetic */ C40749p m110424a(C37497e eVar, String str, C31456c cVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    cVar = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                return eVar.mo90634a(str, cVar, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    /* renamed from: a */
    C40749p mo90634a(String str, C31456c cVar, boolean z);
}
