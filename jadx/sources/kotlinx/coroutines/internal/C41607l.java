package kotlinx.coroutines.internal;

/* renamed from: kotlinx.coroutines.internal.l */
public abstract class C41607l {
    /* renamed from: a */
    public static final void m120708a(int i) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Expected positive parallelism level, but got " + i).toString());
        }
    }
}
