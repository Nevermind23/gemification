package p342j$.util.stream;

import p342j$.util.C9371P;
import p342j$.util.function.Consumer;

/* renamed from: j$.util.stream.C3 */
final class C9527C3 extends C9615X2 {
    C9527C3(C9735w0 w0Var, C9371P p, boolean z) {
        super(w0Var, p, z);
    }

    C9527C3(C9735w0 w0Var, C9624a aVar, boolean z) {
        super(w0Var, aVar, z);
    }

    /* renamed from: a */
    public final void mo25169a(Consumer consumer) {
        if (this.f26331h != null || this.f26332i) {
            do {
            } while (mo25179m(consumer));
            return;
        }
        consumer.getClass();
        mo26018i();
        C9522B3 b3 = new C9522B3(consumer, 1);
        this.f26325b.mo26037w1(this.f26327d, b3);
        this.f26332i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo25698k() {
        C9588Q2 q2 = new C9588Q2();
        this.f26331h = q2;
        this.f26328e = this.f26325b.mo26038x1(new C9522B3(q2, 0));
        this.f26329f = new C9624a(this, 7);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final C9615X2 mo25699l(C9371P p) {
        return new C9527C3(this.f26325b, p, this.f26324a);
    }

    /* renamed from: m */
    public final boolean mo25179m(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean b = mo26017b();
        if (b) {
            C9588Q2 q2 = (C9588Q2) this.f26331h;
            long j = this.f26330g;
            if (q2.f26367c == 0) {
                if (j < ((long) q2.f26366b)) {
                    obj = q2.f26270e[(int) j];
                } else {
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
            } else if (j < q2.count()) {
                int i = 0;
                while (i <= q2.f26367c) {
                    long j2 = q2.f26368d[i];
                    Object[] objArr = q2.f26271f[i];
                    if (j < ((long) objArr.length) + j2) {
                        obj = objArr[(int) (j - j2)];
                    } else {
                        i++;
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            consumer.accept(obj);
        }
        return b;
    }
}
