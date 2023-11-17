package sd1;

import ed1.C40749p;
import ed1.C40756v;
import ld1.C41692b;
import nd1.C41776c;

/* renamed from: sd1.y */
public final class C42541y extends C40749p {

    /* renamed from: d */
    final Object[] f100138d;

    /* renamed from: sd1.y$a */
    static final class C42542a extends C41776c {

        /* renamed from: d */
        final C40756v f100139d;

        /* renamed from: e */
        final Object[] f100140e;

        /* renamed from: f */
        int f100141f;

        /* renamed from: g */
        boolean f100142g;

        /* renamed from: h */
        volatile boolean f100143h;

        C42542a(C40756v vVar, Object[] objArr) {
            this.f100139d = vVar;
            this.f100140e = objArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo97983a() {
            Object[] objArr = this.f100140e;
            int length = objArr.length;
            for (int i = 0; i < length && !isDisposed(); i++) {
                Object obj = objArr[i];
                if (obj == null) {
                    C40756v vVar = this.f100139d;
                    vVar.onError(new NullPointerException("The element at index " + i + " is null"));
                    return;
                }
                this.f100139d.onNext(obj);
            }
            if (!isDisposed()) {
                this.f100139d.onComplete();
            }
        }

        /* renamed from: c */
        public Object mo96258c() {
            int i = this.f100141f;
            Object[] objArr = this.f100140e;
            if (i == objArr.length) {
                return null;
            }
            this.f100141f = i + 1;
            return C41692b.m120934e(objArr[i], "The array element is null");
        }

        public void clear() {
            this.f100141f = this.f100140e.length;
        }

        public void dispose() {
            this.f100143h = true;
        }

        /* renamed from: e */
        public int mo96260e(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f100142g = true;
            return 1;
        }

        public boolean isDisposed() {
            return this.f100143h;
        }

        public boolean isEmpty() {
            return this.f100141f == this.f100140e.length;
        }
    }

    public C42541y(Object[] objArr) {
        this.f100138d = objArr;
    }

    /* renamed from: I0 */
    public void mo94344I0(C40756v vVar) {
        C42542a aVar = new C42542a(vVar, this.f100138d);
        vVar.onSubscribe(aVar);
        if (!aVar.f100142g) {
            aVar.mo97983a();
        }
    }
}
