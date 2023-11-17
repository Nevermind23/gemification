package sd1;

import ed1.C40749p;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jd1.C41405l;
import kd1.C41498c;
import kd1.C41499d;
import ld1.C41692b;
import ud1.C43063b;

/* renamed from: sd1.j1 */
public final class C42464j1 extends C40749p {

    /* renamed from: d */
    final C40754t[] f99889d;

    /* renamed from: e */
    final Iterable f99890e;

    /* renamed from: f */
    final C41405l f99891f;

    /* renamed from: g */
    final int f99892g;

    /* renamed from: h */
    final boolean f99893h;

    /* renamed from: sd1.j1$a */
    static final class C42465a extends AtomicInteger implements C41205b {
        private static final long serialVersionUID = 2983708048395377667L;

        /* renamed from: d */
        final C40756v f99894d;

        /* renamed from: e */
        final C41405l f99895e;

        /* renamed from: f */
        final C42466b[] f99896f;

        /* renamed from: g */
        final Object[] f99897g;

        /* renamed from: h */
        final boolean f99898h;

        /* renamed from: i */
        volatile boolean f99899i;

        C42465a(C40756v vVar, C41405l lVar, int i, boolean z) {
            this.f99894d = vVar;
            this.f99895e = lVar;
            this.f99896f = new C42466b[i];
            this.f99897g = new Object[i];
            this.f99898h = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97910a() {
            mo97913d();
            mo97911b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97911b() {
            for (C42466b a : this.f99896f) {
                a.mo97916a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo97912c(boolean z, boolean z2, C40756v vVar, boolean z3, C42466b bVar) {
            if (this.f99899i) {
                mo97910a();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = bVar.f99903g;
                    if (th != null) {
                        this.f99899i = true;
                        mo97910a();
                        vVar.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        this.f99899i = true;
                        mo97910a();
                        vVar.onComplete();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = bVar.f99903g;
                    this.f99899i = true;
                    mo97910a();
                    if (th2 != null) {
                        vVar.onError(th2);
                    } else {
                        vVar.onComplete();
                    }
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo97913d() {
            for (C42466b bVar : this.f99896f) {
                bVar.f99901e.clear();
            }
        }

        public void dispose() {
            if (!this.f99899i) {
                this.f99899i = true;
                mo97911b();
                if (getAndIncrement() == 0) {
                    mo97913d();
                }
            }
        }

        /* renamed from: e */
        public void mo97914e() {
            Throwable th;
            boolean z;
            if (getAndIncrement() == 0) {
                C42466b[] bVarArr = this.f99896f;
                C40756v vVar = this.f99894d;
                Object[] objArr = this.f99897g;
                boolean z2 = this.f99898h;
                int i = 1;
                while (true) {
                    int i2 = 0;
                    int i3 = 0;
                    for (C42466b bVar : bVarArr) {
                        if (objArr[i3] == null) {
                            boolean z3 = bVar.f99902f;
                            Object c = bVar.f99901e.mo96258c();
                            if (c == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!mo97912c(z3, z, vVar, z2, bVar)) {
                                if (!z) {
                                    objArr[i3] = c;
                                } else {
                                    i2++;
                                }
                            } else {
                                return;
                            }
                        } else if (bVar.f99902f && !z2 && (th = bVar.f99903g) != null) {
                            this.f99899i = true;
                            mo97910a();
                            vVar.onError(th);
                            return;
                        }
                        i3++;
                    }
                    if (i2 != 0) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        try {
                            vVar.onNext(C41692b.m120934e(this.f99895e.apply(objArr.clone()), "The zipper returned a null value"));
                            Arrays.fill(objArr, (Object) null);
                        } catch (Throwable th2) {
                            C41300a.m119661b(th2);
                            mo97910a();
                            vVar.onError(th2);
                            return;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public void mo97915f(C40754t[] tVarArr, int i) {
            C42466b[] bVarArr = this.f99896f;
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bVarArr[i2] = new C42466b(this, i);
            }
            lazySet(0);
            this.f99894d.onSubscribe(this);
            for (int i3 = 0; i3 < length && !this.f99899i; i3++) {
                tVarArr[i3].mo95016c(bVarArr[i3]);
            }
        }

        public boolean isDisposed() {
            return this.f99899i;
        }
    }

    /* renamed from: sd1.j1$b */
    static final class C42466b implements C40756v {

        /* renamed from: d */
        final C42465a f99900d;

        /* renamed from: e */
        final C43063b f99901e;

        /* renamed from: f */
        volatile boolean f99902f;

        /* renamed from: g */
        Throwable f99903g;

        /* renamed from: h */
        final AtomicReference f99904h = new AtomicReference();

        C42466b(C42465a aVar, int i) {
            this.f99900d = aVar;
            this.f99901e = new C43063b(i);
        }

        /* renamed from: a */
        public void mo97916a() {
            C41498c.m120371a(this.f99904h);
        }

        public void onComplete() {
            this.f99902f = true;
            this.f99900d.mo97914e();
        }

        public void onError(Throwable th) {
            this.f99903g = th;
            this.f99902f = true;
            this.f99900d.mo97914e();
        }

        public void onNext(Object obj) {
            this.f99901e.mo96261f(obj);
            this.f99900d.mo97914e();
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f99904h, bVar);
        }
    }

    public C42464j1(C40754t[] tVarArr, Iterable iterable, C41405l lVar, int i, boolean z) {
        this.f99889d = tVarArr;
        this.f99890e = iterable;
        this.f99891f = lVar;
        this.f99892g = i;
        this.f99893h = z;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        int i;
        C40754t[] tVarArr = this.f99889d;
        if (tVarArr == null) {
            tVarArr = new C40754t[8];
            i = 0;
            for (C40754t tVar : this.f99890e) {
                if (i == tVarArr.length) {
                    C40754t[] tVarArr2 = new C40754t[((i >> 2) + i)];
                    System.arraycopy(tVarArr, 0, tVarArr2, 0, i);
                    tVarArr = tVarArr2;
                }
                tVarArr[i] = tVar;
                i++;
            }
        } else {
            i = tVarArr.length;
        }
        if (i == 0) {
            C41499d.m120381g(vVar);
        } else {
            new C42465a(vVar, this.f99891f, i, this.f99893h).mo97915f(tVarArr, this.f99892g);
        }
    }
}
