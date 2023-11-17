package ef1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41598g;
import kotlinx.coroutines.internal.C41627z;
import me1.C41752f;
import ue1.C43075l;

/* renamed from: ef1.r0 */
public final class C40858r0 extends C41627z {

    /* renamed from: g */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f96569g = AtomicIntegerFieldUpdater.newUpdater(C40858r0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C40858r0(C41752f fVar, Continuation continuation) {
        super(fVar, continuation);
    }

    /* renamed from: P0 */
    private final boolean m118433P0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f96569g.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: Q0 */
    private final boolean m118434Q0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f96569g.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo95157G(Object obj) {
        mo95125K0(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo95125K0(Object obj) {
        if (!m118433P0()) {
            C41598g.m120674c(C41790c.m121154b(this.f97837f), C40782b0.m118252a(obj, this.f97837f), (C43075l) null, 2, (Object) null);
        }
    }

    /* renamed from: O0 */
    public final Object mo95223O0() {
        if (m118434Q0()) {
            return C41793d.m121157c();
        }
        Object h = C40877w1.m118569h(mo95236d0());
        if (!(h instanceof C40881y)) {
            return h;
        }
        throw ((C40881y) h).f96602a;
    }
}
