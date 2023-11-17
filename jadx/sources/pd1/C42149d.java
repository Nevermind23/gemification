package pd1;

import ed1.C40741h;
import jd1.C41397d;
import jd1.C41405l;
import md1.C41732a;
import uh1.C43107b;
import wd1.C43187a;
import wd1.C43188b;

/* renamed from: pd1.d */
public final class C42149d extends C42144a {

    /* renamed from: f */
    final C41405l f99127f;

    /* renamed from: g */
    final C41397d f99128g;

    /* renamed from: pd1.d$a */
    static final class C42150a extends C43187a {

        /* renamed from: i */
        final C41405l f99129i;

        /* renamed from: j */
        final C41397d f99130j;

        /* renamed from: k */
        Object f99131k;

        /* renamed from: l */
        boolean f99132l;

        C42150a(C41732a aVar, C41405l lVar, C41397d dVar) {
            super(aVar);
            this.f99129i = lVar;
            this.f99130j = dVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            while (true) {
                Object c = this.f100734f.mo96258c();
                if (c == null) {
                    return null;
                }
                Object apply = this.f99129i.apply(c);
                if (!this.f99132l) {
                    this.f99132l = true;
                    this.f99131k = apply;
                    return c;
                } else if (!this.f99130j.mo27080a(this.f99131k, apply)) {
                    this.f99131k = apply;
                    return c;
                } else {
                    this.f99131k = apply;
                    if (this.f100736h != 1) {
                        this.f100733e.mo94357l(1);
                    }
                }
            }
        }

        /* renamed from: d */
        public boolean mo96525d(Object obj) {
            if (this.f100735g) {
                return false;
            }
            if (this.f100736h != 0) {
                return this.f100732d.mo96525d(obj);
            }
            try {
                Object apply = this.f99129i.apply(obj);
                if (this.f99132l) {
                    boolean a = this.f99130j.mo27080a(this.f99131k, apply);
                    this.f99131k = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f99132l = true;
                    this.f99131k = apply;
                }
                this.f100732d.onNext(obj);
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

    /* renamed from: pd1.d$b */
    static final class C42151b extends C43188b implements C41732a {

        /* renamed from: i */
        final C41405l f99133i;

        /* renamed from: j */
        final C41397d f99134j;

        /* renamed from: k */
        Object f99135k;

        /* renamed from: l */
        boolean f99136l;

        C42151b(C43107b bVar, C41405l lVar, C41397d dVar) {
            super(bVar);
            this.f99133i = lVar;
            this.f99134j = dVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            while (true) {
                Object c = this.f100739f.mo96258c();
                if (c == null) {
                    return null;
                }
                Object apply = this.f99133i.apply(c);
                if (!this.f99136l) {
                    this.f99136l = true;
                    this.f99135k = apply;
                    return c;
                } else if (!this.f99134j.mo27080a(this.f99135k, apply)) {
                    this.f99135k = apply;
                    return c;
                } else {
                    this.f99135k = apply;
                    if (this.f100741h != 1) {
                        this.f100738e.mo94357l(1);
                    }
                }
            }
        }

        /* renamed from: d */
        public boolean mo96525d(Object obj) {
            if (this.f100740g) {
                return false;
            }
            if (this.f100741h != 0) {
                this.f100737d.onNext(obj);
                return true;
            }
            try {
                Object apply = this.f99133i.apply(obj);
                if (this.f99136l) {
                    boolean a = this.f99134j.mo27080a(this.f99135k, apply);
                    this.f99135k = apply;
                    if (a) {
                        return false;
                    }
                } else {
                    this.f99136l = true;
                    this.f99135k = apply;
                }
                this.f100737d.onNext(obj);
                return true;
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

    public C42149d(C40741h hVar, C41405l lVar, C41397d dVar) {
        super(hVar);
        this.f99127f = lVar;
        this.f99128g = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        if (bVar instanceof C41732a) {
            this.f99110e.mo94922E(new C42150a((C41732a) bVar, this.f99127f, this.f99128g));
        } else {
            this.f99110e.mo94922E(new C42151b(bVar, this.f99127f, this.f99128g));
        }
    }
}
