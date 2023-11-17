package td1;

import ed1.C40735b0;
import ed1.C40749p;
import ed1.C40756v;
import ed1.C40764z;
import hd1.C41205b;
import kd1.C41498c;
import nd1.C41783j;

/* renamed from: td1.y */
public final class C42988y extends C40749p {

    /* renamed from: d */
    final C40735b0 f100333d;

    /* renamed from: td1.y$a */
    static final class C42989a extends C41783j implements C40764z {
        private static final long serialVersionUID = 3786543492451018833L;

        /* renamed from: f */
        C41205b f100334f;

        C42989a(C40756v vVar) {
            super(vVar);
        }

        /* renamed from: a */
        public void mo95096a(Object obj) {
            mo96606d(obj);
        }

        public void dispose() {
            super.dispose();
            this.f100334f.dispose();
        }

        public void onError(Throwable th) {
            mo96607g(th);
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f100334f, bVar)) {
                this.f100334f = bVar;
                this.f98097d.onSubscribe(this);
            }
        }
    }

    public C42988y(C40735b0 b0Var) {
        this.f100333d = b0Var;
    }

    /* renamed from: f1 */
    public static C40764z m123339f1(C40756v vVar) {
        return new C42989a(vVar);
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f100333d.mo94907c(m123339f1(vVar));
    }
}
