package le0;

import if0.C25192a;
import kotlin.jvm.internal.C41536l;

/* renamed from: le0.b */
public abstract class C25952b {

    /* renamed from: le0.b$a */
    public /* synthetic */ class C25953a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f66035a;

        static {
            int[] iArr = new int[C25192a.values().length];
            try {
                iArr[C25192a.SELL_SHARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f66035a = iArr;
        }
    }

    /* renamed from: a */
    public static final C25951a m81596a(C25192a aVar) {
        C41536l.m120489i(aVar, "<this>");
        if (C25953a.f66035a[aVar.ordinal()] == 1) {
            return C25951a.SELL;
        }
        return C25951a.BUY;
    }
}
