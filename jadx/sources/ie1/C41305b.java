package ie1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ve1.C43151a;

/* renamed from: ie1.b */
public abstract class C41305b implements Iterator, C43151a {

    /* renamed from: d */
    private C41304a1 f97359d = C41304a1.NotReady;

    /* renamed from: e */
    private Object f97360e;

    /* renamed from: ie1.b$a */
    public /* synthetic */ class C41306a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f97361a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                ie1.a1[] r0 = ie1.C41304a1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ie1.a1 r1 = ie1.C41304a1.Done     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ie1.a1 r1 = ie1.C41304a1.Ready     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f97361a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ie1.C41305b.C41306a.<clinit>():void");
        }
    }

    /* renamed from: f */
    private final boolean m119670f() {
        this.f97359d = C41304a1.Failed;
        mo95823b();
        if (this.f97359d == C41304a1.Ready) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo95823b();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo95824d() {
        this.f97359d = C41304a1.Done;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo95825e(Object obj) {
        this.f97360e = obj;
        this.f97359d = C41304a1.Ready;
    }

    public boolean hasNext() {
        boolean z;
        C41304a1 a1Var = this.f97359d;
        if (a1Var != C41304a1.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = C41306a.f97361a[a1Var.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return m119670f();
            }
            return true;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object next() {
        if (hasNext()) {
            this.f97359d = C41304a1.NotReady;
            return this.f97360e;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
