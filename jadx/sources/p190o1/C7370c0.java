package p190o1;

import android.os.Build;
import androidx.work.C1949a;
import androidx.work.C2075n;
import androidx.work.C2085q;
import androidx.work.C2093w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;

/* renamed from: o1.c0 */
public final class C7370c0 {

    /* renamed from: a */
    public static final C7370c0 f21591a = new C7370c0();

    /* renamed from: o1.c0$a */
    public /* synthetic */ class C7371a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21592a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f21593b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f21594c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f21595d;

        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|41|42|(2:43|44)|45|47) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|(2:19|20)|21|23|24|25|26|27|29|30|31|32|33|34|35|36|37|38|39|41|42|43|44|45|47) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0098 */
        static {
            /*
                androidx.work.w[] r0 = androidx.work.C2093w.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.work.w r2 = androidx.work.C2093w.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.work.w r3 = androidx.work.C2093w.RUNNING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                androidx.work.w r4 = androidx.work.C2093w.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                androidx.work.w r5 = androidx.work.C2093w.FAILED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                androidx.work.w r6 = androidx.work.C2093w.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.work.w r6 = androidx.work.C2093w.CANCELLED     // Catch:{ NoSuchFieldError -> 0x003d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r7 = 6
                r0[r6] = r7     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f21592a = r0
                androidx.work.a[] r0 = androidx.work.C1949a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.a r6 = androidx.work.C1949a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                androidx.work.a r6 = androidx.work.C1949a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f21593b = r0
                androidx.work.n[] r0 = androidx.work.C2075n.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.n r6 = androidx.work.C2075n.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                androidx.work.n r6 = androidx.work.C2075n.CONNECTED     // Catch:{ NoSuchFieldError -> 0x006f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r6] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                androidx.work.n r6 = androidx.work.C2075n.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                androidx.work.n r3 = androidx.work.C2075n.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                androidx.work.n r3 = androidx.work.C2075n.METERED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r3] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                f21594c = r0
                androidx.work.q[] r0 = androidx.work.C2085q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.work.q r3 = androidx.work.C2085q.RUN_AS_NON_EXPEDITED_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                androidx.work.q r1 = androidx.work.C2085q.DROP_WORK_REQUEST     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                f21595d = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p190o1.C7370c0.C7371a.<clinit>():void");
        }
    }

    private C7370c0() {
    }

    /* renamed from: a */
    public static final int m28077a(C1949a aVar) {
        C41536l.m120489i(aVar, "backoffPolicy");
        int i = C7371a.f21593b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        se1.C42550b.m123187a(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005c, code lost:
        se1.C42550b.m123187a(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set m28078b(byte[] r9) {
        /*
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            if (r1 != 0) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            if (r1 == 0) goto L_0x0014
            return r0
        L_0x0014:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r9)
            r9 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0050 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0050 }
            int r4 = r3.readInt()     // Catch:{ all -> 0x0047 }
        L_0x0023:
            if (r2 >= r4) goto L_0x0041
            java.lang.String r5 = r3.readUTF()     // Catch:{ all -> 0x0047 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0047 }
            boolean r6 = r3.readBoolean()     // Catch:{ all -> 0x0047 }
            androidx.work.c$c r7 = new androidx.work.c$c     // Catch:{ all -> 0x0047 }
            java.lang.String r8 = "uri"
            kotlin.jvm.internal.C41536l.m120488h(r5, r8)     // Catch:{ all -> 0x0047 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0047 }
            r0.add(r7)     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0041:
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x0047 }
            se1.C42550b.m123187a(r3, r9)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0054
        L_0x0047:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            se1.C42550b.m123187a(r3, r2)     // Catch:{ IOException -> 0x0050 }
            throw r4     // Catch:{ IOException -> 0x0050 }
        L_0x004e:
            r9 = move-exception
            goto L_0x005a
        L_0x0050:
            r2 = move-exception
            r2.printStackTrace()     // Catch:{ all -> 0x004e }
        L_0x0054:
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x004e }
            se1.C42550b.m123187a(r1, r9)
            return r0
        L_0x005a:
            throw r9     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            se1.C42550b.m123187a(r1, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C7370c0.m28078b(byte[]):java.util.Set");
    }

    /* renamed from: c */
    public static final C1949a m28079c(int i) {
        if (i == 0) {
            return C1949a.EXPONENTIAL;
        }
        if (i == 1) {
            return C1949a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    /* renamed from: d */
    public static final C2075n m28080d(int i) {
        if (i == 0) {
            return C2075n.NOT_REQUIRED;
        }
        if (i == 1) {
            return C2075n.CONNECTED;
        }
        if (i == 2) {
            return C2075n.UNMETERED;
        }
        if (i == 3) {
            return C2075n.NOT_ROAMING;
        }
        if (i == 4) {
            return C2075n.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return C2075n.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    /* renamed from: e */
    public static final C2085q m28081e(int i) {
        if (i == 0) {
            return C2085q.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return C2085q.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to OutOfQuotaPolicy");
    }

    /* renamed from: f */
    public static final C2093w m28082f(int i) {
        if (i == 0) {
            return C2093w.ENQUEUED;
        }
        if (i == 1) {
            return C2093w.RUNNING;
        }
        if (i == 2) {
            return C2093w.SUCCEEDED;
        }
        if (i == 3) {
            return C2093w.FAILED;
        }
        if (i == 4) {
            return C2093w.BLOCKED;
        }
        if (i == 5) {
            return C2093w.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    /* renamed from: g */
    public static final int m28083g(C2075n nVar) {
        C41536l.m120489i(nVar, "networkType");
        int i = C7371a.f21594c[nVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                if (Build.VERSION.SDK_INT >= 30 && nVar == C2075n.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + nVar + " to int");
            }
        }
        return i2;
    }

    /* renamed from: h */
    public static final int m28084h(C2085q qVar) {
        C41536l.m120489i(qVar, "policy");
        int i = C7371a.f21595d[qVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        se1.C42550b.m123187a(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0060, code lost:
        se1.C42550b.m123187a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        throw r1;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m28085i(java.util.Set r4) {
        /*
            java.lang.String r0 = "triggers"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000f
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000f:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x005d }
            r1.<init>(r0)     // Catch:{ all -> 0x005d }
            int r2 = r4.size()     // Catch:{ all -> 0x0056 }
            r1.writeInt(r2)     // Catch:{ all -> 0x0056 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0056 }
        L_0x0024:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0056 }
            if (r2 == 0) goto L_0x0043
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0056 }
            androidx.work.c$c r2 = (androidx.work.C1954c.C1957c) r2     // Catch:{ all -> 0x0056 }
            android.net.Uri r3 = r2.mo6722a()     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0056 }
            r1.writeUTF(r3)     // Catch:{ all -> 0x0056 }
            boolean r2 = r2.mo6723b()     // Catch:{ all -> 0x0056 }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x0056 }
            goto L_0x0024
        L_0x0043:
            he1.w r4 = he1.C41238w.f97225a     // Catch:{ all -> 0x0056 }
            r4 = 0
            se1.C42550b.m123187a(r1, r4)     // Catch:{ all -> 0x005d }
            se1.C42550b.m123187a(r0, r4)
            byte[] r4 = r0.toByteArray()
            java.lang.String r0 = "outputStream.toByteArray()"
            kotlin.jvm.internal.C41536l.m120488h(r4, r0)
            return r4
        L_0x0056:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r2 = move-exception
            se1.C42550b.m123187a(r1, r4)     // Catch:{ all -> 0x005d }
            throw r2     // Catch:{ all -> 0x005d }
        L_0x005d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r1 = move-exception
            se1.C42550b.m123187a(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p190o1.C7370c0.m28085i(java.util.Set):byte[]");
    }

    /* renamed from: j */
    public static final int m28086j(C2093w wVar) {
        C41536l.m120489i(wVar, "state");
        switch (C7371a.f21592a[wVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
