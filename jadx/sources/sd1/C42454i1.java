package sd1;

import ae1.C40293a;
import ed1.C40754t;
import ed1.C40756v;
import hd1.C41205b;
import id1.C41300a;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import jd1.C41405l;
import kd1.C41498c;
import kd1.C41499d;
import ld1.C41692b;
import yd1.C43357b;
import yd1.C43366j;

/* renamed from: sd1.i1 */
public final class C42454i1 extends C42399a {

    /* renamed from: e */
    final C40754t[] f99859e;

    /* renamed from: f */
    final Iterable f99860f = null;

    /* renamed from: g */
    final C41405l f99861g;

    /* renamed from: sd1.i1$a */
    final class C42455a implements C41405l {
        C42455a() {
        }

        public Object apply(Object obj) {
            return C41692b.m120934e(C42454i1.this.f99861g.apply(new Object[]{obj}), "The combiner returned a null value");
        }
    }

    /* renamed from: sd1.i1$b */
    static final class C42456b extends AtomicInteger implements C40756v, C41205b {
        private static final long serialVersionUID = 1577321883966341961L;

        /* renamed from: d */
        final C40756v f99863d;

        /* renamed from: e */
        final C41405l f99864e;

        /* renamed from: f */
        final C42457c[] f99865f;

        /* renamed from: g */
        final AtomicReferenceArray f99866g;

        /* renamed from: h */
        final AtomicReference f99867h;

        /* renamed from: i */
        final C43357b f99868i;

        /* renamed from: j */
        volatile boolean f99869j;

        C42456b(C40756v vVar, C41405l lVar, int i) {
            this.f99863d = vVar;
            this.f99864e = lVar;
            C42457c[] cVarArr = new C42457c[i];
            for (int i2 = 0; i2 < i; i2++) {
                cVarArr[i2] = new C42457c(this, i2);
            }
            this.f99865f = cVarArr;
            this.f99866g = new AtomicReferenceArray(i);
            this.f99867h = new AtomicReference();
            this.f99868i = new C43357b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97901a(int i) {
            C42457c[] cVarArr = this.f99865f;
            for (int i2 = 0; i2 < cVarArr.length; i2++) {
                if (i2 != i) {
                    cVarArr[i2].mo97906a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo97902b(int i, boolean z) {
            if (!z) {
                this.f99869j = true;
                mo97901a(i);
                C43366j.m124413a(this.f99863d, this, this.f99868i);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo97903c(int i, Throwable th) {
            this.f99869j = true;
            C41498c.m120371a(this.f99867h);
            mo97901a(i);
            C43366j.m124415c(this.f99863d, th, this, this.f99868i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo97904d(int i, Object obj) {
            this.f99866g.set(i, obj);
        }

        public void dispose() {
            C41498c.m120371a(this.f99867h);
            for (C42457c a : this.f99865f) {
                a.mo97906a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo97905e(C40754t[] tVarArr, int i) {
            C42457c[] cVarArr = this.f99865f;
            AtomicReference atomicReference = this.f99867h;
            for (int i2 = 0; i2 < i && !C41498c.m120372b((C41205b) atomicReference.get()) && !this.f99869j; i2++) {
                tVarArr[i2].mo95016c(cVarArr[i2]);
            }
        }

        public boolean isDisposed() {
            return C41498c.m120372b((C41205b) this.f99867h.get());
        }

        public void onComplete() {
            if (!this.f99869j) {
                this.f99869j = true;
                mo97901a(-1);
                C43366j.m124413a(this.f99863d, this, this.f99868i);
            }
        }

        public void onError(Throwable th) {
            if (this.f99869j) {
                C40293a.m116722s(th);
                return;
            }
            this.f99869j = true;
            mo97901a(-1);
            C43366j.m124415c(this.f99863d, th, this, this.f99868i);
        }

        public void onNext(Object obj) {
            if (!this.f99869j) {
                AtomicReferenceArray atomicReferenceArray = this.f99866g;
                int length = atomicReferenceArray.length();
                Object[] objArr = new Object[(length + 1)];
                int i = 0;
                objArr[0] = obj;
                while (i < length) {
                    Object obj2 = atomicReferenceArray.get(i);
                    if (obj2 != null) {
                        i++;
                        objArr[i] = obj2;
                    } else {
                        return;
                    }
                }
                try {
                    C43366j.m124417e(this.f99863d, C41692b.m120934e(this.f99864e.apply(objArr), "combiner returned a null value"), this, this.f99868i);
                } catch (Throwable th) {
                    C41300a.m119661b(th);
                    dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this.f99867h, bVar);
        }
    }

    /* renamed from: sd1.i1$c */
    static final class C42457c extends AtomicReference implements C40756v {
        private static final long serialVersionUID = 3256684027868224024L;

        /* renamed from: d */
        final C42456b f99870d;

        /* renamed from: e */
        final int f99871e;

        /* renamed from: f */
        boolean f99872f;

        C42457c(C42456b bVar, int i) {
            this.f99870d = bVar;
            this.f99871e = i;
        }

        /* renamed from: a */
        public void mo97906a() {
            C41498c.m120371a(this);
        }

        public void onComplete() {
            this.f99870d.mo97902b(this.f99871e, this.f99872f);
        }

        public void onError(Throwable th) {
            this.f99870d.mo97903c(this.f99871e, th);
        }

        public void onNext(Object obj) {
            if (!this.f99872f) {
                this.f99872f = true;
            }
            this.f99870d.mo97904d(this.f99871e, obj);
        }

        public void onSubscribe(C41205b bVar) {
            C41498c.m120376g(this, bVar);
        }
    }

    public C42454i1(C40754t tVar, C40754t[] tVarArr, C41405l lVar) {
        super(tVar);
        this.f99859e = tVarArr;
        this.f99861g = lVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        int i;
        C40754t[] tVarArr = this.f99859e;
        if (tVarArr == null) {
            tVarArr = new C40754t[8];
            try {
                i = 0;
                for (C40754t tVar : this.f99860f) {
                    if (i == tVarArr.length) {
                        tVarArr = (C40754t[]) Arrays.copyOf(tVarArr, (i >> 1) + i);
                    }
                    int i2 = i + 1;
                    tVarArr[i] = tVar;
                    i = i2;
                }
            } catch (Throwable th) {
                C41300a.m119661b(th);
                C41499d.m120384n(th, vVar);
                return;
            }
        } else {
            i = tVarArr.length;
        }
        if (i == 0) {
            new C42469k0(this.f99678d, new C42455a()).mo94344I0(vVar);
            return;
        }
        C42456b bVar = new C42456b(vVar, this.f99861g, i);
        vVar.onSubscribe(bVar);
        bVar.mo97905e(tVarArr, i);
        this.f99678d.mo95016c(bVar);
    }
}
