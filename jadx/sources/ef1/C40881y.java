package ef1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ef1.y */
public class C40881y {

    /* renamed from: b */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f96601b = AtomicIntegerFieldUpdater.newUpdater(C40881y.class, "_handled");
    private volatile /* synthetic */ int _handled;

    /* renamed from: a */
    public final Throwable f96602a;

    public C40881y(Throwable th, boolean z) {
        this.f96602a = th;
        this._handled = z ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* renamed from: a */
    public final boolean mo95265a() {
        return this._handled;
    }

    /* renamed from: b */
    public final boolean mo95266b() {
        return f96601b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C40832l0.m118329a(this) + '[' + this.f96602a + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C40881y(Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
