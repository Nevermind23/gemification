package p244s3;

import java.util.Queue;
import p089g4.C6219h;
import p089g4.C6224l;

/* renamed from: s3.m */
public class C8185m {

    /* renamed from: a */
    private final C6219h f23343a;

    /* renamed from: s3.m$a */
    class C8186a extends C6219h {
        C8186a(long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo19819j(C8187b bVar, Object obj) {
            bVar.mo23384c();
        }
    }

    /* renamed from: s3.m$b */
    static final class C8187b {

        /* renamed from: d */
        private static final Queue f23345d = C6224l.m24737f(0);

        /* renamed from: a */
        private int f23346a;

        /* renamed from: b */
        private int f23347b;

        /* renamed from: c */
        private Object f23348c;

        private C8187b() {
        }

        /* renamed from: a */
        static C8187b m30891a(Object obj, int i, int i2) {
            C8187b bVar;
            Queue queue = f23345d;
            synchronized (queue) {
                bVar = (C8187b) queue.poll();
            }
            if (bVar == null) {
                bVar = new C8187b();
            }
            bVar.m30892b(obj, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m30892b(Object obj, int i, int i2) {
            this.f23348c = obj;
            this.f23347b = i;
            this.f23346a = i2;
        }

        /* renamed from: c */
        public void mo23384c() {
            Queue queue = f23345d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8187b)) {
                return false;
            }
            C8187b bVar = (C8187b) obj;
            if (this.f23347b == bVar.f23347b && this.f23346a == bVar.f23346a && this.f23348c.equals(bVar.f23348c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f23346a * 31) + this.f23347b) * 31) + this.f23348c.hashCode();
        }
    }

    public C8185m(long j) {
        this.f23343a = new C8186a(j);
    }

    /* renamed from: a */
    public Object mo23381a(Object obj, int i, int i2) {
        C8187b a = C8187b.m30891a(obj, i, i2);
        Object g = this.f23343a.mo19816g(a);
        a.mo23384c();
        return g;
    }

    /* renamed from: b */
    public void mo23382b(Object obj, int i, int i2, Object obj2) {
        this.f23343a.mo19820k(C8187b.m30891a(obj, i, i2), obj2);
    }
}
