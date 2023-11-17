package pd1;

import ed1.C40741h;
import jd1.C41405l;
import ld1.C41692b;
import md1.C41732a;
import uh1.C43107b;
import wd1.C43187a;
import wd1.C43188b;

/* renamed from: pd1.n */
public final class C42170n extends C42144a {

    /* renamed from: f */
    final C41405l f99191f;

    /* renamed from: pd1.n$a */
    static final class C42171a extends C43187a {

        /* renamed from: i */
        final C41405l f99192i;

        C42171a(C41732a aVar, C41405l lVar) {
            super(aVar);
            this.f99192i = lVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            Object c = this.f100734f.mo96258c();
            if (c != null) {
                return C41692b.m120934e(this.f99192i.apply(c), "The mapper function returned a null value.");
            }
            return null;
        }

        /* renamed from: d */
        public boolean mo96525d(Object obj) {
            if (this.f100735g) {
                return false;
            }
            try {
                return this.f100732d.mo96525d(C41692b.m120934e(this.f99192i.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th) {
                mo101739h(th);
                return true;
            }
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo101740i(i);
        }

        public void onNext(Object obj) {
            if (!this.f100735g) {
                if (this.f100736h != 0) {
                    this.f100732d.onNext((Object) null);
                    return;
                }
                try {
                    this.f100732d.onNext(C41692b.m120934e(this.f99192i.apply(obj), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo101739h(th);
                }
            }
        }
    }

    /* renamed from: pd1.n$b */
    static final class C42172b extends C43188b {

        /* renamed from: i */
        final C41405l f99193i;

        C42172b(C43107b bVar, C41405l lVar) {
            super(bVar);
            this.f99193i = lVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            Object c = this.f100739f.mo96258c();
            if (c != null) {
                return C41692b.m120934e(this.f99193i.apply(c), "The mapper function returned a null value.");
            }
            return null;
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo101744i(i);
        }

        public void onNext(Object obj) {
            if (!this.f100740g) {
                if (this.f100741h != 0) {
                    this.f100737d.onNext((Object) null);
                    return;
                }
                try {
                    this.f100737d.onNext(C41692b.m120934e(this.f99193i.apply(obj), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    mo101743h(th);
                }
            }
        }
    }

    public C42170n(C40741h hVar, C41405l lVar) {
        super(hVar);
        this.f99191f = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        if (bVar instanceof C41732a) {
            this.f99110e.mo94922E(new C42171a((C41732a) bVar, this.f99191f));
        } else {
            this.f99110e.mo94922E(new C42172b(bVar, this.f99191f));
        }
    }
}
