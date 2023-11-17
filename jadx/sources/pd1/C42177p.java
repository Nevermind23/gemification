package pd1;

import ed1.C40741h;
import ed1.C40742i;
import id1.C41300a;
import java.util.concurrent.atomic.AtomicLong;
import jd1.C41394a;
import md1.C41739h;
import p469io.reactivex.exceptions.MissingBackpressureException;
import ud1.C43062a;
import ud1.C43063b;
import uh1.C43107b;
import uh1.C43108c;
import xd1.C43256a;
import xd1.C43259d;
import yd1.C43358c;

/* renamed from: pd1.p */
public final class C42177p extends C42144a {

    /* renamed from: f */
    final int f99213f;

    /* renamed from: g */
    final boolean f99214g;

    /* renamed from: h */
    final boolean f99215h;

    /* renamed from: i */
    final C41394a f99216i;

    /* renamed from: pd1.p$a */
    static final class C42178a extends C43256a implements C40742i {
        private static final long serialVersionUID = -2514538129242366402L;

        /* renamed from: d */
        final C43107b f99217d;

        /* renamed from: e */
        final C41739h f99218e;

        /* renamed from: f */
        final boolean f99219f;

        /* renamed from: g */
        final C41394a f99220g;

        /* renamed from: h */
        C43108c f99221h;

        /* renamed from: i */
        volatile boolean f99222i;

        /* renamed from: j */
        volatile boolean f99223j;

        /* renamed from: k */
        Throwable f99224k;

        /* renamed from: l */
        final AtomicLong f99225l = new AtomicLong();

        /* renamed from: m */
        boolean f99226m;

        C42178a(C43107b bVar, int i, boolean z, boolean z2, C41394a aVar) {
            C41739h hVar;
            this.f99217d = bVar;
            this.f99220g = aVar;
            this.f99219f = z2;
            if (z) {
                hVar = new C43063b(i);
            } else {
                hVar = new C43062a(i);
            }
            this.f99218e = hVar;
        }

        /* renamed from: b */
        public void mo27070b(C43108c cVar) {
            if (C43259d.m124224h(this.f99221h, cVar)) {
                this.f99221h = cVar;
                this.f99217d.mo27070b(this);
                cVar.mo94357l(Long.MAX_VALUE);
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            return this.f99218e.mo96258c();
        }

        public void cancel() {
            if (!this.f99222i) {
                this.f99222i = true;
                this.f99221h.cancel();
                if (!this.f99226m && getAndIncrement() == 0) {
                    this.f99218e.clear();
                }
            }
        }

        public void clear() {
            this.f99218e.clear();
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f99226m = true;
            return 2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo97658g(boolean z, boolean z2, C43107b bVar) {
            if (this.f99222i) {
                this.f99218e.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f99219f) {
                    Throwable th = this.f99224k;
                    if (th != null) {
                        this.f99218e.clear();
                        bVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        bVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f99224k;
                    if (th2 != null) {
                        bVar.onError(th2);
                    } else {
                        bVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo97659h() {
            int i;
            boolean z;
            if (getAndIncrement() == 0) {
                C41739h hVar = this.f99218e;
                C43107b bVar = this.f99217d;
                int i2 = 1;
                while (!mo97658g(this.f99223j, hVar.isEmpty(), bVar)) {
                    long j = this.f99225l.get();
                    long j2 = 0;
                    while (true) {
                        i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
                        if (i == 0) {
                            break;
                        }
                        boolean z2 = this.f99223j;
                        Object c = hVar.mo96258c();
                        if (c == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!mo97658g(z2, z, bVar)) {
                            if (z) {
                                break;
                            }
                            bVar.onNext(c);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (i != 0 || !mo97658g(this.f99223j, hVar.isEmpty(), bVar)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f99225l.addAndGet(-j2);
                        }
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public boolean isEmpty() {
            return this.f99218e.isEmpty();
        }

        /* renamed from: l */
        public void mo94357l(long j) {
            if (!this.f99226m && C43259d.m124223g(j)) {
                C43358c.m124395a(this.f99225l, j);
                mo97659h();
            }
        }

        public void onComplete() {
            this.f99223j = true;
            if (this.f99226m) {
                this.f99217d.onComplete();
            } else {
                mo97659h();
            }
        }

        public void onError(Throwable th) {
            this.f99224k = th;
            this.f99223j = true;
            if (this.f99226m) {
                this.f99217d.onError(th);
            } else {
                mo97659h();
            }
        }

        public void onNext(Object obj) {
            if (!this.f99218e.mo96261f(obj)) {
                this.f99221h.cancel();
                MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
                try {
                    this.f99220g.run();
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    missingBackpressureException.initCause(th);
                }
                onError(missingBackpressureException);
            } else if (this.f99226m) {
                this.f99217d.onNext((Object) null);
            } else {
                mo97659h();
            }
        }
    }

    public C42177p(C40741h hVar, int i, boolean z, boolean z2, C41394a aVar) {
        super(hVar);
        this.f99213f = i;
        this.f99214g = z;
        this.f99215h = z2;
        this.f99216i = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo94348F(C43107b bVar) {
        this.f99110e.mo94922E(new C42178a(bVar, this.f99213f, this.f99214g, this.f99215h, this.f99216i));
    }
}
