package ef1;

/* renamed from: ef1.y1 */
public abstract class C40883y1 extends C40793d0 {
    /* renamed from: Q */
    public abstract C40883y1 mo95277Q();

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public final String mo95278e0() {
        C40883y1 y1Var;
        C40883y1 c = C40867u0.m118469c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            y1Var = c.mo95277Q();
        } catch (UnsupportedOperationException unused) {
            y1Var = null;
        }
        if (this == y1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
