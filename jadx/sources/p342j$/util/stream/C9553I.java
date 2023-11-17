package p342j$.util.stream;

import p342j$.util.C9504k;
import p342j$.util.function.C9469l;
import p342j$.util.function.C9475o;

/* renamed from: j$.util.stream.I */
final class C9553I extends C9569M implements C9642d2 {
    C9553I() {
    }

    public final void accept(double d) {
        mo25895s((Object) Double.valueOf(d));
    }

    public final Object get() {
        if (this.f26243a) {
            return C9504k.m34865d(((Double) this.f26244b).doubleValue());
        }
        return null;
    }

    /* renamed from: l */
    public final C9475o mo25296l(C9475o oVar) {
        oVar.getClass();
        return new C9469l(this, oVar);
    }
}
