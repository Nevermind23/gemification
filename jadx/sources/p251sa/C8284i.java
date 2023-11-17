package p251sa;

import com.google.firebase.remoteconfig.internal.C5455m;

/* renamed from: sa.i */
public class C8284i {

    /* renamed from: a */
    private final long f23479a;

    /* renamed from: b */
    private final long f23480b;

    /* renamed from: sa.i$b */
    public static class C8286b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f23481a = 60;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f23482b = C5455m.f17413j;

        /* renamed from: c */
        public C8284i mo23447c() {
            return new C8284i(this);
        }

        /* renamed from: d */
        public C8286b mo23448d(long j) {
            if (j >= 0) {
                this.f23481a = j;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", new Object[]{Long.valueOf(j)}));
        }

        /* renamed from: e */
        public C8286b mo23449e(long j) {
            if (j >= 0) {
                this.f23482b = j;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument");
        }
    }

    private C8284i(C8286b bVar) {
        this.f23479a = bVar.f23481a;
        this.f23480b = bVar.f23482b;
    }
}
