package p514md;

import p500ld.C16546c;
import p500ld.C16550f;

/* renamed from: md.a */
public abstract class C16675a extends C16550f {
    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo26303m(C16546c cVar) {
        super.mo26303m(cVar);
        boolean q = mo43807q(cVar);
        if (!mo43806p(cVar) || q) {
            mo43702o(Integer.MAX_VALUE);
        } else {
            mo43808r(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo43806p(C16546c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract boolean mo43807q(C16546c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract void mo43808r(C16546c cVar);
}
