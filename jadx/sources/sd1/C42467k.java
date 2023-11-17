package sd1;

import ed1.C40754t;
import ed1.C40756v;
import jd1.C41397d;
import jd1.C41405l;
import nd1.C41774a;

/* renamed from: sd1.k */
public final class C42467k extends C42399a {

    /* renamed from: e */
    final C41405l f99905e;

    /* renamed from: f */
    final C41397d f99906f;

    /* renamed from: sd1.k$a */
    static final class C42468a extends C41774a {

        /* renamed from: i */
        final C41405l f99907i;

        /* renamed from: j */
        final C41397d f99908j;

        /* renamed from: k */
        Object f99909k;

        /* renamed from: l */
        boolean f99910l;

        C42468a(C40756v vVar, C41405l lVar, C41397d dVar) {
            super(vVar);
            this.f99907i = lVar;
            this.f99908j = dVar;
        }

        /* renamed from: c */
        public Object mo96258c() {
            while (true) {
                Object c = this.f98081f.mo96258c();
                if (c == null) {
                    return null;
                }
                Object apply = this.f99907i.apply(c);
                if (!this.f99910l) {
                    this.f99910l = true;
                    this.f99909k = apply;
                    return c;
                } else if (!this.f99908j.mo27080a(this.f99909k, apply)) {
                    this.f99909k = apply;
                    return c;
                } else {
                    this.f99909k = apply;
                }
            }
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo96600g(i);
        }

        public void onNext(Object obj) {
            if (!this.f98082g) {
                if (this.f98083h != 0) {
                    this.f98079d.onNext(obj);
                    return;
                }
                try {
                    Object apply = this.f99907i.apply(obj);
                    if (this.f99910l) {
                        boolean a = this.f99908j.mo27080a(this.f99909k, apply);
                        this.f99909k = apply;
                        if (a) {
                            return;
                        }
                    } else {
                        this.f99910l = true;
                        this.f99909k = apply;
                    }
                    this.f98079d.onNext(obj);
                } catch (Throwable th) {
                    mo96599d(th);
                }
            }
        }
    }

    public C42467k(C40754t tVar, C41405l lVar, C41397d dVar) {
        super(tVar);
        this.f99905e = lVar;
        this.f99906f = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        this.f99678d.mo95016c(new C42468a(vVar, this.f99905e, this.f99906f));
    }
}
