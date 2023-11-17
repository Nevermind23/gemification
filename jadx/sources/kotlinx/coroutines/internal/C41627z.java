package kotlinx.coroutines.internal;

import ef1.C40777a;
import ef1.C40782b0;
import kotlin.coroutines.Continuation;
import me1.C41752f;
import oe1.C41854e;
import ue1.C43075l;

/* renamed from: kotlinx.coroutines.internal.z */
public class C41627z extends C40777a implements C41854e {

    /* renamed from: f */
    public final Continuation f97837f;

    public C41627z(C41752f fVar, Continuation continuation) {
        super(fVar, true, true);
        this.f97837f = continuation;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo95157G(Object obj) {
        C41598g.m120674c(C41790c.m121154b(this.f97837f), C40782b0.m118252a(obj, this.f97837f), (C43075l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo95125K0(Object obj) {
        Continuation continuation = this.f97837f;
        continuation.mo94382h(C40782b0.m118252a(obj, continuation));
    }

    /* renamed from: g */
    public final C41854e mo95202g() {
        Continuation continuation = this.f97837f;
        if (continuation instanceof C41854e) {
            return (C41854e) continuation;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final boolean mo95159j0() {
        return true;
    }
}
