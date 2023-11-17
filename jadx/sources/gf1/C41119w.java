package gf1;

import kotlin.coroutines.Continuation;

/* renamed from: gf1.w */
public interface C41119w {

    /* renamed from: gf1.w$a */
    public static final class C41120a {
        /* renamed from: a */
        public static /* synthetic */ boolean m119215a(C41119w wVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return wVar.mo95527z(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: A */
    Object mo95514A(Object obj, Continuation continuation);

    /* renamed from: z */
    boolean mo95527z(Throwable th);
}
