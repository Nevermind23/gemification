package pd1;

import ed1.C40741h;
import jd1.C41407n;
import md1.C41732a;
import md1.C41737f;
import uh1.C43107b;
import wd1.C43187a;
import wd1.C43188b;

/* renamed from: pd1.i */
public final class C42160i extends C42144a {

    /* renamed from: f */
    final C41407n f99167f;

    /* renamed from: pd1.i$a */
    static final class C42161a extends C43187a {

        /* renamed from: i */
        final C41407n f99168i;

        C42161a(C41732a aVar, C41407n nVar) {
            super(aVar);
            this.f99168i = nVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            C41737f fVar = this.f100734f;
            C41407n nVar = this.f99168i;
            while (true) {
                Object c = fVar.mo96258c();
                if (c == null) {
                    return null;
                }
                if (nVar.test(c)) {
                    return c;
                }
                if (this.f100736h == 2) {
                    fVar.mo94357l(1);
                }
            }
        }

        /* renamed from: d */
        public boolean mo96525d(Object obj) {
            if (this.f100735g) {
                return false;
            }
            if (this.f100736h != 0) {
                return this.f100732d.mo96525d((Object) null);
            }
            try {
                if (!this.f99168i.test(obj) || !this.f100732d.mo96525d(obj)) {
                    return false;
                }
                return true;
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
            if (!mo96525d(obj)) {
                this.f100733e.mo94357l(1);
            }
        }
    }

    /* renamed from: pd1.i$b */
    static final class C42162b extends C43188b implements C41732a {

        /* renamed from: i */
        final C41407n f99169i;

        C42162b(C43107b bVar, C41407n nVar) {
            super(bVar);
            this.f99169i = nVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            C41737f fVar = this.f100739f;
            C41407n nVar = this.f99169i;
            while (true) {
                Object c = fVar.mo96258c();
                if (c == null) {
                    return null;
                }
                if (nVar.test(c)) {
                    return c;
                }
                if (this.f100741h == 2) {
                    fVar.mo94357l(1);
                }
            }
        }

        /* renamed from: d */
        public boolean mo96525d(Object obj) {
            if (this.f100740g) {
                return false;
            }
            if (this.f100741h != 0) {
                this.f100737d.onNext((Object) null);
                return true;
            }
            try {
                boolean test = this.f99169i.test(obj);
                if (test) {
                    this.f100737d.onNext(obj);
                }
                return test;
            } catch (Throwable th) {
                mo101743h(th);
                return true;
            }
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo101744i(i);
        }

        public void onNext(Object obj) {
            if (!mo96525d(obj)) {
                this.f100738e.mo94357l(1);
            }
        }
    }

    public C42160i(C40741h hVar, C41407n nVar) {
        super(hVar);
        this.f99167f = nVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        if (bVar instanceof C41732a) {
            this.f99110e.mo94922E(new C42161a((C41732a) bVar, this.f99167f));
        } else {
            this.f99110e.mo94922E(new C42162b(bVar, this.f99167f));
        }
    }
}
