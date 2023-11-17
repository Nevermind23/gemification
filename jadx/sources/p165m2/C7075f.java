package p165m2;

import dg1.C40672b;
import dg1.C40679d;
import dg1.C40686h;
import dg1.C40691m;
import dg1.C40707z;
import of1.C41884e0;
import of1.C41937x;
import p152l2.C6868b;
import p178n2.C7218c;

/* renamed from: m2.f */
public class C7075f extends C41884e0 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C41884e0 f21022f;

    /* renamed from: g */
    private C40679d f21023g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7067b f21024h;

    /* renamed from: m2.f$a */
    class C7076a extends C40686h {

        /* renamed from: e */
        long f21025e;

        C7076a(C40707z zVar) {
            super(zVar);
        }

        /* renamed from: g */
        public long mo21305g(C40672b bVar, long j) {
            long j2;
            long g = super.mo21305g(bVar, j);
            long j3 = this.f21025e;
            if (g != -1) {
                j2 = g;
            } else {
                j2 = 0;
            }
            this.f21025e = j3 + j2;
            if (C7075f.this.f21024h != null) {
                C7075f.this.f21024h.obtainMessage(1, new C7218c(this.f21025e, C7075f.this.f21022f.mo21302o())).sendToTarget();
            }
            return g;
        }
    }

    public C7075f(C41884e0 e0Var, C6868b bVar) {
        this.f21022f = e0Var;
        if (bVar != null) {
            this.f21024h = new C7067b(bVar);
        }
    }

    /* renamed from: w */
    private C40707z m27348w(C40707z zVar) {
        return new C7076a(zVar);
    }

    /* renamed from: o */
    public long mo21302o() {
        return this.f21022f.mo21302o();
    }

    /* renamed from: q */
    public C41937x mo21303q() {
        return this.f21022f.mo21303q();
    }

    /* renamed from: t */
    public C40679d mo21304t() {
        if (this.f21023g == null) {
            this.f21023g = C40691m.m117770b(m27348w(this.f21022f.mo21304t()));
        }
        return this.f21023g;
    }
}
