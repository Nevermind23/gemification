package sd1;

import ed1.C40754t;
import ed1.C40756v;
import jd1.C41407n;
import nd1.C41774a;

/* renamed from: sd1.t */
public final class C42504t extends C42399a {

    /* renamed from: e */
    final C41407n f100026e;

    /* renamed from: sd1.t$a */
    static final class C42505a extends C41774a {

        /* renamed from: i */
        final C41407n f100027i;

        C42505a(C40756v vVar, C41407n nVar) {
            super(vVar);
            this.f100027i = nVar;
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        public java.lang.Object mo96258c() {
            /*
                r2 = this;
            L_0x0000:
                md1.d r0 = r2.f98081f
                java.lang.Object r0 = r0.mo96258c()
                if (r0 == 0) goto L_0x0010
                jd1.n r1 = r2.f100027i
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L_0x0000
            L_0x0010:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sd1.C42504t.C42505a.mo96258c():java.lang.Object");
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo96600g(i);
        }

        public void onNext(Object obj) {
            if (this.f98083h == 0) {
                try {
                    if (this.f100027i.test(obj)) {
                        this.f98079d.onNext(obj);
                    }
                } catch (Throwable th) {
                    mo96599d(th);
                }
            } else {
                this.f98079d.onNext((Object) null);
            }
        }
    }

    public C42504t(C40754t tVar, C41407n nVar) {
        super(tVar);
        this.f100026e = nVar;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42505a(vVar, this.f100026e));
    }
}
