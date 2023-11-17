package p342j$.util.stream;

import java.util.Comparator;
import p342j$.util.C9371P;
import p342j$.util.C9381a;
import p342j$.util.function.C9494x0;

/* renamed from: j$.util.stream.X2 */
abstract class C9615X2 implements C9371P {

    /* renamed from: a */
    final boolean f26324a;

    /* renamed from: b */
    final C9735w0 f26325b;

    /* renamed from: c */
    private C9494x0 f26326c;

    /* renamed from: d */
    C9371P f26327d;

    /* renamed from: e */
    C9657g2 f26328e;

    /* renamed from: f */
    C9624a f26329f;

    /* renamed from: g */
    long f26330g;

    /* renamed from: h */
    C9644e f26331h;

    /* renamed from: i */
    boolean f26332i;

    C9615X2(C9735w0 w0Var, C9371P p, boolean z) {
        this.f26325b = w0Var;
        this.f26326c = null;
        this.f26327d = p;
        this.f26324a = z;
    }

    C9615X2(C9735w0 w0Var, C9624a aVar, boolean z) {
        this.f26325b = w0Var;
        this.f26326c = aVar;
        this.f26327d = null;
        this.f26324a = z;
    }

    /* renamed from: f */
    private boolean m35327f() {
        boolean z;
        while (this.f26331h.count() == 0) {
            if (!this.f26328e.mo25696r()) {
                C9624a aVar = this.f26329f;
                int i = aVar.f26340a;
                Object obj = aVar.f26341b;
                switch (i) {
                    case 4:
                        C9658g3 g3Var = (C9658g3) obj;
                        z = g3Var.f26327d.mo25179m(g3Var.f26328e);
                        break;
                    case 5:
                        C9668i3 i3Var = (C9668i3) obj;
                        z = i3Var.f26327d.mo25179m(i3Var.f26328e);
                        break;
                    case 6:
                        C9678k3 k3Var = (C9678k3) obj;
                        z = k3Var.f26327d.mo25179m(k3Var.f26328e);
                        break;
                    default:
                        C9527C3 c3 = (C9527C3) obj;
                        z = c3.f26327d.mo25179m(c3.f26328e);
                        break;
                }
                if (z) {
                    continue;
                }
            }
            if (this.f26332i) {
                return false;
            }
            this.f26328e.mo25694o();
            this.f26332i = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo26017b() {
        C9644e eVar = this.f26331h;
        boolean z = false;
        if (eVar != null) {
            long j = this.f26330g + 1;
            this.f26330g = j;
            if (j < eVar.count()) {
                z = true;
            }
            if (z) {
                return z;
            }
            this.f26330g = 0;
            this.f26331h.clear();
            return m35327f();
        } else if (this.f26332i) {
            return false;
        } else {
            mo26018i();
            mo25698k();
            this.f26330g = 0;
            this.f26328e.mo25695p(this.f26327d.getExactSizeIfKnown());
            return m35327f();
        }
    }

    public final int characteristics() {
        mo26018i();
        int j = C9607V2.m35306j(this.f26325b.mo26036g1()) & C9607V2.f26298f;
        return (j & 64) != 0 ? (j & -16449) | (this.f26327d.characteristics() & 16448) : j;
    }

    public final long estimateSize() {
        mo26018i();
        return this.f26327d.estimateSize();
    }

    public final Comparator getComparator() {
        if (C9381a.m34653l(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    public final long getExactSizeIfKnown() {
        mo26018i();
        if (C9607V2.SIZED.mo26013f(this.f26325b.mo26036g1())) {
            return this.f26327d.getExactSizeIfKnown();
        }
        return -1;
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C9381a.m34653l(this, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo26018i() {
        if (this.f26327d == null) {
            this.f26327d = (C9371P) this.f26326c.get();
            this.f26326c = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo25698k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public abstract C9615X2 mo25699l(C9371P p);

    public final String toString() {
        return String.format("%s[%s]", new Object[]{getClass().getName(), this.f26327d});
    }

    public C9371P trySplit() {
        if (!this.f26324a || this.f26332i) {
            return null;
        }
        mo26018i();
        C9371P trySplit = this.f26327d.trySplit();
        if (trySplit == null) {
            return null;
        }
        return mo25699l(trySplit);
    }
}
