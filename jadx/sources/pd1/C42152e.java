package pd1;

import ae1.C40293a;
import ed1.C40741h;
import id1.C41300a;
import jd1.C41394a;
import jd1.C41399f;
import md1.C41732a;
import p469io.reactivex.exceptions.CompositeException;
import uh1.C43107b;
import wd1.C43187a;
import wd1.C43188b;

/* renamed from: pd1.e */
public final class C42152e extends C42144a {

    /* renamed from: f */
    final C41399f f99137f;

    /* renamed from: g */
    final C41399f f99138g;

    /* renamed from: h */
    final C41394a f99139h;

    /* renamed from: i */
    final C41394a f99140i;

    /* renamed from: pd1.e$a */
    static final class C42153a extends C43187a {

        /* renamed from: i */
        final C41399f f99141i;

        /* renamed from: j */
        final C41399f f99142j;

        /* renamed from: k */
        final C41394a f99143k;

        /* renamed from: l */
        final C41394a f99144l;

        C42153a(C41732a aVar, C41399f fVar, C41399f fVar2, C41394a aVar2, C41394a aVar3) {
            super(aVar);
            this.f99141i = fVar;
            this.f99142j = fVar2;
            this.f99143k = aVar2;
            this.f99144l = aVar3;
        }

        /* renamed from: c */
        public Object mo96258c() {
            try {
                Object c = this.f100734f.mo96258c();
                if (c != null) {
                    try {
                        this.f99141i.accept(c);
                        this.f99144l.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f100736h == 1) {
                    this.f99143k.run();
                    this.f99144l.run();
                }
                return c;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        /* renamed from: d */
        public boolean mo96525d(Object obj) {
            if (this.f100735g) {
                return false;
            }
            try {
                this.f99141i.accept(obj);
                return this.f100732d.mo96525d(obj);
            } catch (Throwable th) {
                mo101739h(th);
                return false;
            }
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo101740i(i);
        }

        public void onComplete() {
            if (!this.f100735g) {
                try {
                    this.f99143k.run();
                    this.f100735g = true;
                    this.f100732d.onComplete();
                    try {
                        this.f99144l.run();
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        C40293a.m116722s(th);
                    }
                } catch (Throwable th2) {
                    mo101739h(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f100735g) {
                C40293a.m116722s(th);
                return;
            }
            boolean z = true;
            this.f100735g = true;
            try {
                this.f99142j.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f100732d.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f100732d.onError(th);
            }
            try {
                this.f99144l.run();
            } catch (Throwable th3) {
                C41300a.m119661b(th3);
                C40293a.m116722s(th3);
            }
        }

        public void onNext(Object obj) {
            if (!this.f100735g) {
                if (this.f100736h != 0) {
                    this.f100732d.onNext((Object) null);
                    return;
                }
                try {
                    this.f99141i.accept(obj);
                    this.f100732d.onNext(obj);
                } catch (Throwable th) {
                    mo101739h(th);
                }
            }
        }
    }

    /* renamed from: pd1.e$b */
    static final class C42154b extends C43188b {

        /* renamed from: i */
        final C41399f f99145i;

        /* renamed from: j */
        final C41399f f99146j;

        /* renamed from: k */
        final C41394a f99147k;

        /* renamed from: l */
        final C41394a f99148l;

        C42154b(C43107b bVar, C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2) {
            super(bVar);
            this.f99145i = fVar;
            this.f99146j = fVar2;
            this.f99147k = aVar;
            this.f99148l = aVar2;
        }

        /* renamed from: c */
        public Object mo96258c() {
            try {
                Object c = this.f100739f.mo96258c();
                if (c != null) {
                    try {
                        this.f99145i.accept(c);
                        this.f99148l.run();
                    } catch (Throwable th) {
                        throw new CompositeException(th, th);
                    }
                } else if (this.f100741h == 1) {
                    this.f99147k.run();
                    this.f99148l.run();
                }
                return c;
            } catch (Throwable th2) {
                throw new CompositeException(th, th2);
            }
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            return mo101744i(i);
        }

        public void onComplete() {
            if (!this.f100740g) {
                try {
                    this.f99147k.run();
                    this.f100740g = true;
                    this.f100737d.onComplete();
                    try {
                        this.f99148l.run();
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        C40293a.m116722s(th);
                    }
                } catch (Throwable th2) {
                    mo101743h(th2);
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f100740g) {
                C40293a.m116722s(th);
                return;
            }
            boolean z = true;
            this.f100740g = true;
            try {
                this.f99146j.accept(th);
            } catch (Throwable th2) {
                C41300a.m119661b(th2);
                this.f100737d.onError(new CompositeException(th, th2));
                z = false;
            }
            if (z) {
                this.f100737d.onError(th);
            }
            try {
                this.f99148l.run();
            } catch (Throwable th3) {
                C41300a.m119661b(th3);
                C40293a.m116722s(th3);
            }
        }

        public void onNext(Object obj) {
            if (!this.f100740g) {
                if (this.f100741h != 0) {
                    this.f100737d.onNext((Object) null);
                    return;
                }
                try {
                    this.f99145i.accept(obj);
                    this.f100737d.onNext(obj);
                } catch (Throwable th) {
                    mo101743h(th);
                }
            }
        }
    }

    public C42152e(C40741h hVar, C41399f fVar, C41399f fVar2, C41394a aVar, C41394a aVar2) {
        super(hVar);
        this.f99137f = fVar;
        this.f99138g = fVar2;
        this.f99139h = aVar;
        this.f99140i = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        if (bVar instanceof C41732a) {
            this.f99110e.mo94922E(new C42153a((C41732a) bVar, this.f99137f, this.f99138g, this.f99139h, this.f99140i));
            return;
        }
        this.f99110e.mo94922E(new C42154b(bVar, this.f99137f, this.f99138g, this.f99139h, this.f99140i));
    }
}
