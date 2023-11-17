package bd0;

import ad0.C19227a;
import ef1.C40793d0;
import ef1.C40867u0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C41556a;

/* renamed from: bd0.a */
public interface C19370a {

    /* renamed from: bd0.a$a */
    public static final class C19371a {
        /* renamed from: a */
        public static /* synthetic */ Object m64842a(C19370a aVar, boolean z, C40793d0 d0Var, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    d0Var = C40867u0.m118468b();
                }
                return aVar.mo47580a(z, d0Var, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initDictionary");
        }
    }

    /* renamed from: a */
    Object mo47580a(boolean z, C40793d0 d0Var, Continuation continuation);

    /* renamed from: b */
    C19227a mo47581b(String str);

    /* renamed from: c */
    C19227a mo47582c(String str);

    /* renamed from: d */
    C41556a mo47583d();

    /* renamed from: e */
    Object mo47584e(boolean z, Continuation continuation);
}
