package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import ed1.C40757w;
import hd1.C41205b;
import id1.C41300a;
import kd1.C41498c;
import md1.C41735d;
import md1.C41740i;
import nd1.C41775b;
import ud1.C43063b;
import vd1.C43146n;

/* renamed from: sd1.l0 */
public final class C42473l0 extends C42399a {

    /* renamed from: e */
    final C40757w f99919e;

    /* renamed from: f */
    final boolean f99920f;

    /* renamed from: g */
    final int f99921g;

    /* renamed from: sd1.l0$a */
    static final class C42474a extends C41775b implements C40756v, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* renamed from: d */
        final C40756v f99922d;

        /* renamed from: e */
        final C40757w.C40760c f99923e;

        /* renamed from: f */
        final boolean f99924f;

        /* renamed from: g */
        final int f99925g;

        /* renamed from: h */
        C41740i f99926h;

        /* renamed from: i */
        C41205b f99927i;

        /* renamed from: j */
        Throwable f99928j;

        /* renamed from: k */
        volatile boolean f99929k;

        /* renamed from: l */
        volatile boolean f99930l;

        /* renamed from: m */
        int f99931m;

        /* renamed from: n */
        boolean f99932n;

        C42474a(C40756v vVar, C40757w.C40760c cVar, boolean z, int i) {
            this.f99922d = vVar;
            this.f99923e = cVar;
            this.f99924f = z;
            this.f99925g = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo97918b(boolean z, boolean z2, C40756v vVar) {
            if (this.f99930l) {
                this.f99926h.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f99928j;
                if (this.f99924f) {
                    if (!z2) {
                        return false;
                    }
                    this.f99930l = true;
                    if (th != null) {
                        vVar.onError(th);
                    } else {
                        vVar.onComplete();
                    }
                    this.f99923e.dispose();
                    return true;
                } else if (th != null) {
                    this.f99930l = true;
                    this.f99926h.clear();
                    vVar.onError(th);
                    this.f99923e.dispose();
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    this.f99930l = true;
                    vVar.onComplete();
                    this.f99923e.dispose();
                    return true;
                }
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            return this.f99926h.mo96258c();
        }

        public void clear() {
            this.f99926h.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo97919d() {
            int i = 1;
            while (!this.f99930l) {
                boolean z = this.f99929k;
                Throwable th = this.f99928j;
                if (this.f99924f || !z || th == null) {
                    this.f99922d.onNext((Object) null);
                    if (z) {
                        this.f99930l = true;
                        Throwable th2 = this.f99928j;
                        if (th2 != null) {
                            this.f99922d.onError(th2);
                        } else {
                            this.f99922d.onComplete();
                        }
                        this.f99923e.dispose();
                        return;
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    this.f99930l = true;
                    this.f99922d.onError(this.f99928j);
                    this.f99923e.dispose();
                    return;
                }
            }
        }

        public void dispose() {
            if (!this.f99930l) {
                this.f99930l = true;
                this.f99927i.dispose();
                this.f99923e.dispose();
                if (!this.f99932n && getAndIncrement() == 0) {
                    this.f99926h.clear();
                }
            }
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f99932n = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo97920g() {
            boolean z;
            C41740i iVar = this.f99926h;
            C40756v vVar = this.f99922d;
            int i = 1;
            while (!mo97918b(this.f99929k, iVar.isEmpty(), vVar)) {
                while (true) {
                    boolean z2 = this.f99929k;
                    try {
                        Object c = iVar.mo96258c();
                        if (c == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo97918b(z2, z, vVar)) {
                            if (z) {
                                i = addAndGet(-i);
                                if (i == 0) {
                                    return;
                                }
                            } else {
                                vVar.onNext(c);
                            }
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        C41300a.m119661b(th);
                        this.f99930l = true;
                        this.f99927i.dispose();
                        iVar.clear();
                        vVar.onError(th);
                        this.f99923e.dispose();
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo97921h() {
            if (getAndIncrement() == 0) {
                this.f99923e.mo95058b(this);
            }
        }

        public boolean isDisposed() {
            return this.f99930l;
        }

        public boolean isEmpty() {
            return this.f99926h.isEmpty();
        }

        public void onComplete() {
            if (!this.f99929k) {
                this.f99929k = true;
                mo97921h();
            }
        }

        public void onError(Throwable th) {
            if (this.f99929k) {
                C40293a.m116722s(th);
                return;
            }
            this.f99928j = th;
            this.f99929k = true;
            mo97921h();
        }

        public void onNext(Object obj) {
            if (!this.f99929k) {
                if (this.f99931m != 2) {
                    this.f99926h.mo96261f(obj);
                }
                mo97921h();
            }
        }

        public void onSubscribe(C41205b bVar) {
            if (C41498c.m120378l(this.f99927i, bVar)) {
                this.f99927i = bVar;
                if (bVar instanceof C41735d) {
                    C41735d dVar = (C41735d) bVar;
                    int e = dVar.mo96260e(7);
                    if (e == 1) {
                        this.f99931m = e;
                        this.f99926h = dVar;
                        this.f99929k = true;
                        this.f99922d.onSubscribe(this);
                        mo97921h();
                        return;
                    } else if (e == 2) {
                        this.f99931m = e;
                        this.f99926h = dVar;
                        this.f99922d.onSubscribe(this);
                        return;
                    }
                }
                this.f99926h = new C43063b(this.f99925g);
                this.f99922d.onSubscribe(this);
            }
        }

        public void run() {
            if (this.f99932n) {
                mo97919d();
            } else {
                mo97920g();
            }
        }
    }

    public C42473l0(C40754t tVar, C40757w wVar, boolean z, int i) {
        super(tVar);
        this.f99919e = wVar;
        this.f99920f = z;
        this.f99921g = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C40757w wVar = this.f99919e;
        if (wVar instanceof C43146n) {
            this.f99678d.mo95016c(vVar);
            return;
        }
        this.f99678d.mo95016c(new C42474a(vVar, wVar.mo95051b(), this.f99920f, this.f99921g));
    }
}
