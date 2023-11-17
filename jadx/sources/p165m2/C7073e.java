package p165m2;

import dg1.C40672b;
import dg1.C40677c;
import dg1.C40685g;
import dg1.C40691m;
import dg1.C40705x;
import of1.C41872c0;
import of1.C41937x;
import p152l2.C6873f;
import p178n2.C7218c;

/* renamed from: m2.e */
public class C7073e extends C41872c0 {

    /* renamed from: b */
    private final C41872c0 f21016b;

    /* renamed from: c */
    private C40677c f21017c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7078h f21018d;

    /* renamed from: m2.e$a */
    class C7074a extends C40685g {

        /* renamed from: e */
        long f21019e = 0;

        /* renamed from: f */
        long f21020f = 0;

        C7074a(C40705x xVar) {
            super(xVar);
        }

        /* renamed from: x1 */
        public void mo21301x1(C40672b bVar, long j) {
            super.mo21301x1(bVar, j);
            if (this.f21020f == 0) {
                this.f21020f = C7073e.this.mo21298a();
            }
            this.f21019e += j;
            if (C7073e.this.f21018d != null) {
                C7073e.this.f21018d.obtainMessage(1, new C7218c(this.f21019e, this.f21020f)).sendToTarget();
            }
        }
    }

    public C7073e(C41872c0 c0Var, C6873f fVar) {
        this.f21016b = c0Var;
        if (fVar != null) {
            this.f21018d = new C7078h(fVar);
        }
    }

    /* renamed from: l */
    private C40705x m27341l(C40705x xVar) {
        return new C7074a(xVar);
    }

    /* renamed from: a */
    public long mo21298a() {
        return this.f21016b.mo21298a();
    }

    /* renamed from: b */
    public C41937x mo21299b() {
        return this.f21016b.mo21299b();
    }

    /* renamed from: j */
    public void mo21300j(C40677c cVar) {
        if (this.f21017c == null) {
            this.f21017c = C40691m.m117769a(m27341l(cVar));
        }
        this.f21016b.mo21300j(this.f21017c);
        this.f21017c.flush();
    }
}
