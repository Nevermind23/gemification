package ef1;

import if1.C41365a;
import if1.C41366b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me1.C41751e;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ef1.j0 */
public enum C40822j0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: ef1.j0$a */
    public /* synthetic */ class C40823a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96541a = null;

        static {
            int[] iArr = new int[C40822j0.values().length];
            iArr[C40822j0.DEFAULT.ordinal()] = 1;
            iArr[C40822j0.ATOMIC.ordinal()] = 2;
            iArr[C40822j0.UNDISPATCHED.ordinal()] = 3;
            iArr[C40822j0.LAZY.ordinal()] = 4;
            f96541a = iArr;
        }
    }

    /* renamed from: b */
    public final void mo95171b(C43079p pVar, Object obj, Continuation continuation) {
        int i = C40823a.f96541a[ordinal()];
        if (i == 1) {
            C41365a.m120052d(pVar, obj, continuation, (C43075l) null, 4, (Object) null);
        } else if (i == 2) {
            C41751e.m121032a(pVar, obj, continuation);
        } else if (i == 3) {
            C41366b.m120053a(pVar, obj, continuation);
        } else if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: c */
    public final boolean mo95172c() {
        return this == LAZY;
    }
}
