package bg1;

import bg1.C40382g;
import com.medallia.digital.mobilesdk.C10749b8;
import dg1.C40677c;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41238w;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41864a0;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41882e;
import of1.C41888f;
import of1.C41897h0;
import of1.C41901i0;
import of1.C41917r;
import of1.C41944z;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import pf1.C42197d;
import sf1.C42558a;
import sf1.C42561d;
import sf1.C42562e;
import tf1.C42998c;
import tf1.C43002e;
import ze1.C43420e;

/* renamed from: bg1.d */
public final class C40370d implements C41897h0, C40382g.C40383a {

    /* renamed from: A */
    private static final List f95882A = C41339p.m119900e(C41864a0.HTTP_1_1);

    /* renamed from: z */
    public static final C40372b f95883z = new C40372b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C41869b0 f95884a;

    /* renamed from: b */
    private final C41901i0 f95885b;

    /* renamed from: c */
    private final Random f95886c;

    /* renamed from: d */
    private final long f95887d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C40379e f95888e;

    /* renamed from: f */
    private long f95889f;

    /* renamed from: g */
    private final String f95890g;

    /* renamed from: h */
    private C41882e f95891h;

    /* renamed from: i */
    private C42558a f95892i;

    /* renamed from: j */
    private C40382g f95893j;

    /* renamed from: k */
    private C40384h f95894k;

    /* renamed from: l */
    private C42561d f95895l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f95896m;

    /* renamed from: n */
    private C40374d f95897n;

    /* renamed from: o */
    private final ArrayDeque f95898o = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ArrayDeque f95899p = new ArrayDeque();

    /* renamed from: q */
    private long f95900q;

    /* renamed from: r */
    private boolean f95901r;

    /* renamed from: s */
    private int f95902s = -1;

    /* renamed from: t */
    private String f95903t;

    /* renamed from: u */
    private boolean f95904u;

    /* renamed from: v */
    private int f95905v;

    /* renamed from: w */
    private int f95906w;

    /* renamed from: x */
    private int f95907x;

    /* renamed from: y */
    private boolean f95908y;

    /* renamed from: bg1.d$a */
    public static final class C40371a {

        /* renamed from: a */
        private final int f95909a;

        /* renamed from: b */
        private final C40681e f95910b;

        /* renamed from: c */
        private final long f95911c;

        public C40371a(int i, C40681e eVar, long j) {
            this.f95909a = i;
            this.f95910b = eVar;
            this.f95911c = j;
        }

        /* renamed from: a */
        public final long mo94422a() {
            return this.f95911c;
        }

        /* renamed from: b */
        public final int mo94423b() {
            return this.f95909a;
        }

        /* renamed from: c */
        public final C40681e mo94424c() {
            return this.f95910b;
        }
    }

    /* renamed from: bg1.d$b */
    public static final class C40372b {
        private C40372b() {
        }

        public /* synthetic */ C40372b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: bg1.d$c */
    public static final class C40373c {

        /* renamed from: a */
        private final int f95912a;

        /* renamed from: b */
        private final C40681e f95913b;

        public C40373c(int i, C40681e eVar) {
            C41536l.m120489i(eVar, "data");
            this.f95912a = i;
            this.f95913b = eVar;
        }

        /* renamed from: a */
        public final C40681e mo94425a() {
            return this.f95913b;
        }

        /* renamed from: b */
        public final int mo94426b() {
            return this.f95912a;
        }
    }

    /* renamed from: bg1.d$d */
    public static abstract class C40374d implements Closeable {

        /* renamed from: d */
        private final boolean f95914d;

        /* renamed from: e */
        private final C40679d f95915e;

        /* renamed from: f */
        private final C40677c f95916f;

        public C40374d(boolean z, C40679d dVar, C40677c cVar) {
            C41536l.m120489i(dVar, "source");
            C41536l.m120489i(cVar, "sink");
            this.f95914d = z;
            this.f95915e = dVar;
            this.f95916f = cVar;
        }

        /* renamed from: a */
        public final boolean mo94427a() {
            return this.f95914d;
        }

        /* renamed from: k */
        public final C40677c mo94428k() {
            return this.f95916f;
        }

        /* renamed from: n */
        public final C40679d mo94429n() {
            return this.f95915e;
        }
    }

    /* renamed from: bg1.d$e */
    private final class C40375e extends C42558a {

        /* renamed from: e */
        final /* synthetic */ C40370d f95917e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40375e(C40370d dVar) {
            super(C41536l.m120497q(dVar.f95896m, " writer"), false, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(dVar, "this$0");
            this.f95917e = dVar;
        }

        /* renamed from: f */
        public long mo94430f() {
            try {
                if (this.f95917e.mo94420w()) {
                    return 0;
                }
                return -1;
            } catch (IOException e) {
                this.f95917e.mo94416p(e, (C41880d0) null);
                return -1;
            }
        }
    }

    /* renamed from: bg1.d$f */
    public static final class C40376f implements C41888f {

        /* renamed from: a */
        final /* synthetic */ C40370d f95918a;

        /* renamed from: b */
        final /* synthetic */ C41869b0 f95919b;

        C40376f(C40370d dVar, C41869b0 b0Var) {
            this.f95918a = dVar;
            this.f95919b = b0Var;
        }

        /* renamed from: a */
        public void mo7189a(C41882e eVar, IOException iOException) {
            C41536l.m120489i(eVar, "call");
            C41536l.m120489i(iOException, "e");
            this.f95918a.mo94416p(iOException, (C41880d0) null);
        }

        /* renamed from: b */
        public void mo7190b(C41882e eVar, C41880d0 d0Var) {
            C41536l.m120489i(eVar, "call");
            C41536l.m120489i(d0Var, "response");
            C42998c s = d0Var.mo96748s();
            try {
                this.f95918a.mo94413m(d0Var, s);
                C41536l.m120486f(s);
                C40374d m = s.mo101519m();
                C40379e a = C40379e.f95926g.mo94435a(d0Var.mo96753w());
                this.f95918a.f95888e = a;
                if (!this.f95918a.m116894s(a)) {
                    C40370d dVar = this.f95918a;
                    synchronized (dVar) {
                        dVar.f95899p.clear();
                        dVar.mo42935f(1010, "unexpected Sec-WebSocket-Extensions in response header");
                    }
                }
                try {
                    this.f95918a.mo94418r(C42197d.f99272i + " WebSocket " + this.f95919b.mo96681j().mo96962r(), m);
                    this.f95918a.mo94417q().mo42928f(this.f95918a, d0Var);
                    this.f95918a.mo94419t();
                } catch (Exception e) {
                    this.f95918a.mo94416p(e, (C41880d0) null);
                }
            } catch (IOException e2) {
                if (s != null) {
                    s.mo101526u();
                }
                this.f95918a.mo94416p(e2, d0Var);
                C42197d.m122547m(d0Var);
            }
        }
    }

    /* renamed from: bg1.d$g */
    public static final class C40377g extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f95920e;

        /* renamed from: f */
        final /* synthetic */ C40370d f95921f;

        /* renamed from: g */
        final /* synthetic */ long f95922g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40377g(String str, C40370d dVar, long j) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f95920e = str;
            this.f95921f = dVar;
            this.f95922g = j;
        }

        /* renamed from: f */
        public long mo94430f() {
            this.f95921f.mo94421x();
            return this.f95922g;
        }
    }

    /* renamed from: bg1.d$h */
    public static final class C40378h extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f95923e;

        /* renamed from: f */
        final /* synthetic */ boolean f95924f;

        /* renamed from: g */
        final /* synthetic */ C40370d f95925g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40378h(String str, boolean z, C40370d dVar) {
            super(str, z);
            this.f95923e = str;
            this.f95924f = z;
            this.f95925g = dVar;
        }

        /* renamed from: f */
        public long mo94430f() {
            this.f95925g.cancel();
            return -1;
        }
    }

    public C40370d(C42562e eVar, C41869b0 b0Var, C41901i0 i0Var, Random random, long j, C40379e eVar2, long j2) {
        C41536l.m120489i(eVar, "taskRunner");
        C41536l.m120489i(b0Var, "originalRequest");
        C41536l.m120489i(i0Var, "listener");
        C41536l.m120489i(random, "random");
        this.f95884a = b0Var;
        this.f95885b = i0Var;
        this.f95886c = random;
        this.f95887d = j;
        this.f95888e = eVar2;
        this.f95889f = j2;
        this.f95895l = eVar.mo98014i();
        if (C41536l.m120484d("GET", b0Var.mo96678g())) {
            C40681e.C40682a aVar = C40681e.f96327g;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            C41238w wVar = C41238w.f97225a;
            this.f95890g = C40681e.C40682a.m117722e(aVar, bArr, 0, 0, 3, (Object) null).mo94799a();
            return;
        }
        throw new IllegalArgumentException(C41536l.m120497q("Request must be GET: ", b0Var.mo96678g()).toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public final boolean m116894s(C40379e eVar) {
        if (eVar.f95932f || eVar.f95928b != null) {
            return false;
        }
        if (eVar.f95930d == null || new C43420e(8, 15).mo102116v(eVar.f95930d.intValue())) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private final void m116895u() {
        if (!C42197d.f99271h || Thread.holdsLock(this)) {
            C42558a aVar = this.f95892i;
            if (aVar != null) {
                C42561d.m123212j(this.f95895l, aVar, 0, 2, (Object) null);
                return;
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return false;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m116896v(dg1.C40681e r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f95904u     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f95901r     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f95900q     // Catch:{ all -> 0x003e }
            int r0 = r7.mo94793B()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.mo42935f(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f95900q     // Catch:{ all -> 0x003e }
            int r2 = r7.mo94793B()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f95900q = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque r0 = r6.f95899p     // Catch:{ all -> 0x003e }
            bg1.d$c r1 = new bg1.d$c     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.m116895u()     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.m116896v(dg1.e, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo94408a(dg1.C40681e r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)     // Catch:{ all -> 0x0029 }
            boolean r0 = r1.f95904u     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x0027
            boolean r0 = r1.f95901r     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            java.util.ArrayDeque r0 = r1.f95899p     // Catch:{ all -> 0x0029 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0017
            goto L_0x0027
        L_0x0017:
            java.util.ArrayDeque r0 = r1.f95898o     // Catch:{ all -> 0x0029 }
            r0.add(r2)     // Catch:{ all -> 0x0029 }
            r1.m116895u()     // Catch:{ all -> 0x0029 }
            int r2 = r1.f95906w     // Catch:{ all -> 0x0029 }
            int r2 = r2 + 1
            r1.f95906w = r2     // Catch:{ all -> 0x0029 }
            monitor-exit(r1)
            return
        L_0x0027:
            monitor-exit(r1)
            return
        L_0x0029:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.mo94408a(dg1.e):void");
    }

    /* renamed from: b */
    public boolean mo42932b(String str) {
        C41536l.m120489i(str, "text");
        return m116896v(C40681e.f96327g.mo94822c(str), 1);
    }

    /* renamed from: c */
    public void mo94409c(C40681e eVar) {
        C41536l.m120489i(eVar, "bytes");
        this.f95885b.mo42926d(this, eVar);
    }

    public void cancel() {
        C41882e eVar = this.f95891h;
        C41536l.m120486f(eVar);
        eVar.cancel();
    }

    /* renamed from: d */
    public void mo94410d(String str) {
        C41536l.m120489i(str, "text");
        this.f95885b.mo42927e(this, str);
    }

    /* renamed from: e */
    public synchronized void mo94411e(C40681e eVar) {
        C41536l.m120489i(eVar, "payload");
        this.f95907x++;
        this.f95908y = false;
    }

    /* renamed from: f */
    public boolean mo42935f(int i, String str) {
        return mo94414n(i, str, C10749b8.C10751b.f30743b);
    }

    /* renamed from: g */
    public boolean mo42936g(C40681e eVar) {
        C41536l.m120489i(eVar, "bytes");
        return m116896v(eVar, 2);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [bg1.g, bg1.h, bg1.d$d] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo94412h(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            r0 = 1
            r1 = 0
            r2 = -1
            if (r5 == r2) goto L_0x000c
            r3 = r0
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 == 0) goto L_0x0083
            monitor-enter(r4)
            int r3 = r4.f95902s     // Catch:{ all -> 0x0080 }
            if (r3 != r2) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0074
            r4.f95902s = r5     // Catch:{ all -> 0x0080 }
            r4.f95903t = r6     // Catch:{ all -> 0x0080 }
            boolean r0 = r4.f95901r     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 == 0) goto L_0x003c
            java.util.ArrayDeque r0 = r4.f95899p     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0080 }
            if (r0 == 0) goto L_0x003c
            bg1.d$d r0 = r4.f95897n     // Catch:{ all -> 0x0080 }
            r4.f95897n = r1     // Catch:{ all -> 0x0080 }
            bg1.g r2 = r4.f95893j     // Catch:{ all -> 0x0080 }
            r4.f95893j = r1     // Catch:{ all -> 0x0080 }
            bg1.h r3 = r4.f95894k     // Catch:{ all -> 0x0080 }
            r4.f95894k = r1     // Catch:{ all -> 0x0080 }
            sf1.d r1 = r4.f95895l     // Catch:{ all -> 0x0080 }
            r1.mo98008o()     // Catch:{ all -> 0x0080 }
            r1 = r0
            goto L_0x003e
        L_0x003c:
            r2 = r1
            r3 = r2
        L_0x003e:
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ all -> 0x0080 }
            monitor-exit(r4)
            of1.i0 r0 = r4.f95885b     // Catch:{ all -> 0x0060 }
            r0.mo42924b(r4, r5, r6)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x004d
            of1.i0 r0 = r4.f95885b     // Catch:{ all -> 0x0060 }
            r0.mo42923a(r4, r5, r6)     // Catch:{ all -> 0x0060 }
        L_0x004d:
            if (r1 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            pf1.C42197d.m122547m(r1)
        L_0x0053:
            if (r2 != 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            pf1.C42197d.m122547m(r2)
        L_0x0059:
            if (r3 != 0) goto L_0x005c
            goto L_0x005f
        L_0x005c:
            pf1.C42197d.m122547m(r3)
        L_0x005f:
            return
        L_0x0060:
            r5 = move-exception
            if (r1 != 0) goto L_0x0064
            goto L_0x0067
        L_0x0064:
            pf1.C42197d.m122547m(r1)
        L_0x0067:
            if (r2 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            pf1.C42197d.m122547m(r2)
        L_0x006d:
            if (r3 != 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            pf1.C42197d.m122547m(r3)
        L_0x0073:
            throw r5
        L_0x0074:
            java.lang.String r5 = "already closed"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0080 }
            r6.<init>(r5)     // Catch:{ all -> 0x0080 }
            throw r6     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0083:
            java.lang.String r5 = "Failed requirement."
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.mo94412h(int, java.lang.String):void");
    }

    /* renamed from: m */
    public final void mo94413m(C41880d0 d0Var, C42998c cVar) {
        C41536l.m120489i(d0Var, "response");
        if (d0Var.mo96747q() == 101) {
            String v = C41880d0.m121379v(d0Var, "Connection", (String) null, 2, (Object) null);
            if (C40439w.m117115s("Upgrade", v, true)) {
                String v2 = C41880d0.m121379v(d0Var, "Upgrade", (String) null, 2, (Object) null);
                if (C40439w.m117115s("websocket", v2, true)) {
                    String v3 = C41880d0.m121379v(d0Var, "Sec-WebSocket-Accept", (String) null, 2, (Object) null);
                    String a = C40681e.f96327g.mo94822c(C41536l.m120497q(this.f95890g, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).mo94819y().mo94799a();
                    if (!C41536l.m120484d(a, v3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + a + "' but was '" + v3 + '\'');
                    } else if (cVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + v2 + '\'');
                }
            } else {
                throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + v + '\'');
            }
        } else {
            throw new ProtocolException("Expected HTTP 101 response but was '" + d0Var.mo96747q() + ' ' + d0Var.mo96754x() + '\'');
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004d, code lost:
        return false;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo94414n(int r8, java.lang.String r9, long r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            bg1.f r0 = bg1.C40381f.f95933a     // Catch:{ all -> 0x004e }
            r0.mo94438c(r8)     // Catch:{ all -> 0x004e }
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x0031
            dg1.e$a r2 = dg1.C40681e.f96327g     // Catch:{ all -> 0x004e }
            dg1.e r2 = r2.mo94822c(r9)     // Catch:{ all -> 0x004e }
            int r3 = r2.mo94793B()     // Catch:{ all -> 0x004e }
            long r3 = (long) r3     // Catch:{ all -> 0x004e }
            r5 = 123(0x7b, double:6.1E-322)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x001d
            r3 = r1
            goto L_0x001e
        L_0x001d:
            r3 = r0
        L_0x001e:
            if (r3 == 0) goto L_0x0021
            goto L_0x0032
        L_0x0021:
            java.lang.String r8 = "reason.size() > 123: "
            java.lang.String r8 = kotlin.jvm.internal.C41536l.m120497q(r8, r9)     // Catch:{ all -> 0x004e }
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x004e }
            r9.<init>(r8)     // Catch:{ all -> 0x004e }
            throw r9     // Catch:{ all -> 0x004e }
        L_0x0031:
            r2 = 0
        L_0x0032:
            boolean r9 = r7.f95904u     // Catch:{ all -> 0x004e }
            if (r9 != 0) goto L_0x004c
            boolean r9 = r7.f95901r     // Catch:{ all -> 0x004e }
            if (r9 == 0) goto L_0x003b
            goto L_0x004c
        L_0x003b:
            r7.f95901r = r1     // Catch:{ all -> 0x004e }
            java.util.ArrayDeque r9 = r7.f95899p     // Catch:{ all -> 0x004e }
            bg1.d$a r0 = new bg1.d$a     // Catch:{ all -> 0x004e }
            r0.<init>(r8, r2, r10)     // Catch:{ all -> 0x004e }
            r9.add(r0)     // Catch:{ all -> 0x004e }
            r7.m116895u()     // Catch:{ all -> 0x004e }
            monitor-exit(r7)
            return r1
        L_0x004c:
            monitor-exit(r7)
            return r0
        L_0x004e:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.mo94414n(int, java.lang.String, long):boolean");
    }

    /* renamed from: o */
    public final void mo94415o(C41944z zVar) {
        C41536l.m120489i(zVar, "client");
        if (this.f95884a.mo96675d("Sec-WebSocket-Extensions") != null) {
            mo94416p(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), (C41880d0) null);
            return;
        }
        C41944z d = zVar.mo97033B().mo97104h(C41917r.f98534b).mo97078N(f95882A).mo97097d();
        C41869b0 b = this.f95884a.mo96679h().mo96691i("Upgrade", "websocket").mo96691i("Connection", "Upgrade").mo96691i("Sec-WebSocket-Key", this.f95890g).mo96691i("Sec-WebSocket-Version", BankApiResponse.INVALID_SESSION_CODE).mo96691i("Sec-WebSocket-Extensions", "permessage-deflate").mo96684b();
        C43002e eVar = new C43002e(d, b, true);
        this.f95891h = eVar;
        C41536l.m120486f(eVar);
        eVar.mo96787f0(new C40376f(this, b));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.f95885b.mo42925c(r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r0 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        pf1.C42197d.m122547m(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        pf1.C42197d.m122547m(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        if (r3 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
        pf1.C42197d.m122547m(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94416p(java.lang.Exception r5, of1.C41880d0 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "e"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            monitor-enter(r4)
            boolean r0 = r4.f95904u     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return
        L_0x000c:
            r0 = 1
            r4.f95904u = r0     // Catch:{ all -> 0x0050 }
            bg1.d$d r0 = r4.f95897n     // Catch:{ all -> 0x0050 }
            r1 = 0
            r4.f95897n = r1     // Catch:{ all -> 0x0050 }
            bg1.g r2 = r4.f95893j     // Catch:{ all -> 0x0050 }
            r4.f95893j = r1     // Catch:{ all -> 0x0050 }
            bg1.h r3 = r4.f95894k     // Catch:{ all -> 0x0050 }
            r4.f95894k = r1     // Catch:{ all -> 0x0050 }
            sf1.d r1 = r4.f95895l     // Catch:{ all -> 0x0050 }
            r1.mo98008o()     // Catch:{ all -> 0x0050 }
            he1.w r1 = he1.C41238w.f97225a     // Catch:{ all -> 0x0050 }
            monitor-exit(r4)
            of1.i0 r1 = r4.f95885b     // Catch:{ all -> 0x003c }
            r1.mo42925c(r4, r5, r6)     // Catch:{ all -> 0x003c }
            if (r0 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            pf1.C42197d.m122547m(r0)
        L_0x002f:
            if (r2 != 0) goto L_0x0032
            goto L_0x0035
        L_0x0032:
            pf1.C42197d.m122547m(r2)
        L_0x0035:
            if (r3 != 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            pf1.C42197d.m122547m(r3)
        L_0x003b:
            return
        L_0x003c:
            r5 = move-exception
            if (r0 != 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            pf1.C42197d.m122547m(r0)
        L_0x0043:
            if (r2 != 0) goto L_0x0046
            goto L_0x0049
        L_0x0046:
            pf1.C42197d.m122547m(r2)
        L_0x0049:
            if (r3 != 0) goto L_0x004c
            goto L_0x004f
        L_0x004c:
            pf1.C42197d.m122547m(r3)
        L_0x004f:
            throw r5
        L_0x0050:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.mo94416p(java.lang.Exception, of1.d0):void");
    }

    /* renamed from: q */
    public final C41901i0 mo94417q() {
        return this.f95885b;
    }

    /* renamed from: r */
    public final void mo94418r(String str, C40374d dVar) {
        C41536l.m120489i(str, "name");
        C41536l.m120489i(dVar, "streams");
        C40379e eVar = this.f95888e;
        C41536l.m120486f(eVar);
        synchronized (this) {
            this.f95896m = str;
            this.f95897n = dVar;
            this.f95894k = new C40384h(dVar.mo94427a(), dVar.mo94428k(), this.f95886c, eVar.f95927a, eVar.mo94431a(dVar.mo94427a()), this.f95889f);
            this.f95892i = new C40375e(this);
            long j = this.f95887d;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.f95895l.mo98003i(new C40377g(C41536l.m120497q(str, " ping"), this, nanos), nanos);
            }
            if (!this.f95899p.isEmpty()) {
                m116895u();
            }
            C41238w wVar = C41238w.f97225a;
        }
        this.f95893j = new C40382g(dVar.mo94427a(), dVar.mo94429n(), this, eVar.f95927a, eVar.mo94431a(!dVar.mo94427a()));
    }

    /* renamed from: t */
    public final void mo94419t() {
        while (this.f95902s == -1) {
            C40382g gVar = this.f95893j;
            C41536l.m120486f(gVar);
            gVar.mo94439a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r2 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        kotlin.jvm.internal.C41536l.m120486f(r0);
        r0.mo94445f((dg1.C40681e) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if ((r4 instanceof bg1.C40370d.C40373c) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
        r4 = (bg1.C40370d.C40373c) r4;
        kotlin.jvm.internal.C41536l.m120486f(r0);
        r0.mo94443d(r4.mo94426b(), r4.mo94425a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008c, code lost:
        monitor-enter(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r12.f95900q -= (long) r4.mo94425a().mo94793B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if ((r4 instanceof bg1.C40370d.C40371a) == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r4 = (bg1.C40370d.C40371a) r4;
        kotlin.jvm.internal.C41536l.m120486f(r0);
        r0.mo94441a(r4.mo94423b(), r4.mo94424c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r5 == null) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        r0 = r12.f95885b;
        kotlin.jvm.internal.C41536l.m120486f(r7);
        r0.mo42923a(r12, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00be, code lost:
        if (r5 != null) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c1, code lost:
        pf1.C42197d.m122547m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c4, code lost:
        if (r8 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c7, code lost:
        pf1.C42197d.m122547m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ca, code lost:
        if (r9 != null) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00cd, code lost:
        pf1.C42197d.m122547m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d8, code lost:
        if (r5 != null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00db, code lost:
        pf1.C42197d.m122547m(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00de, code lost:
        if (r8 != null) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        pf1.C42197d.m122547m(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e4, code lost:
        if (r9 != null) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e7, code lost:
        pf1.C42197d.m122547m(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00ea, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo94420w() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f95904u     // Catch:{ all -> 0x00eb }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r12)
            return r1
        L_0x0008:
            bg1.h r0 = r12.f95894k     // Catch:{ all -> 0x00eb }
            java.util.ArrayDeque r2 = r12.f95898o     // Catch:{ all -> 0x00eb }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00eb }
            r3 = 1
            r4 = 0
            r5 = -1
            if (r2 != 0) goto L_0x0065
            java.util.ArrayDeque r6 = r12.f95899p     // Catch:{ all -> 0x00eb }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x00eb }
            boolean r7 = r6 instanceof bg1.C40370d.C40371a     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x005a
            int r1 = r12.f95902s     // Catch:{ all -> 0x00eb }
            java.lang.String r7 = r12.f95903t     // Catch:{ all -> 0x00eb }
            if (r1 == r5) goto L_0x0037
            bg1.d$d r5 = r12.f95897n     // Catch:{ all -> 0x00eb }
            r12.f95897n = r4     // Catch:{ all -> 0x00eb }
            bg1.g r8 = r12.f95893j     // Catch:{ all -> 0x00eb }
            r12.f95893j = r4     // Catch:{ all -> 0x00eb }
            bg1.h r9 = r12.f95894k     // Catch:{ all -> 0x00eb }
            r12.f95894k = r4     // Catch:{ all -> 0x00eb }
            sf1.d r4 = r12.f95895l     // Catch:{ all -> 0x00eb }
            r4.mo98008o()     // Catch:{ all -> 0x00eb }
            goto L_0x0063
        L_0x0037:
            r5 = r6
            bg1.d$a r5 = (bg1.C40370d.C40371a) r5     // Catch:{ all -> 0x00eb }
            long r8 = r5.mo94422a()     // Catch:{ all -> 0x00eb }
            sf1.d r5 = r12.f95895l     // Catch:{ all -> 0x00eb }
            java.lang.String r10 = r12.f95896m     // Catch:{ all -> 0x00eb }
            java.lang.String r11 = " cancel"
            java.lang.String r10 = kotlin.jvm.internal.C41536l.m120497q(r10, r11)     // Catch:{ all -> 0x00eb }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00eb }
            long r8 = r11.toNanos(r8)     // Catch:{ all -> 0x00eb }
            bg1.d$h r11 = new bg1.d$h     // Catch:{ all -> 0x00eb }
            r11.<init>(r10, r3, r12)     // Catch:{ all -> 0x00eb }
            r5.mo98003i(r11, r8)     // Catch:{ all -> 0x00eb }
            r5 = r4
            r8 = r5
            r9 = r8
            goto L_0x0063
        L_0x005a:
            if (r6 != 0) goto L_0x005e
            monitor-exit(r12)
            return r1
        L_0x005e:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L_0x0063:
            r4 = r6
            goto L_0x006a
        L_0x0065:
            r7 = r4
            r8 = r7
            r9 = r8
            r1 = r5
            r5 = r9
        L_0x006a:
            he1.w r6 = he1.C41238w.f97225a     // Catch:{ all -> 0x00eb }
            monitor-exit(r12)
            if (r2 == 0) goto L_0x0078
            kotlin.jvm.internal.C41536l.m120486f(r0)     // Catch:{ all -> 0x00d7 }
            dg1.e r2 = (dg1.C40681e) r2     // Catch:{ all -> 0x00d7 }
            r0.mo94445f(r2)     // Catch:{ all -> 0x00d7 }
            goto L_0x00be
        L_0x0078:
            boolean r2 = r4 instanceof bg1.C40370d.C40373c     // Catch:{ all -> 0x00d7 }
            if (r2 == 0) goto L_0x00a0
            bg1.d$c r4 = (bg1.C40370d.C40373c) r4     // Catch:{ all -> 0x00d7 }
            kotlin.jvm.internal.C41536l.m120486f(r0)     // Catch:{ all -> 0x00d7 }
            int r1 = r4.mo94426b()     // Catch:{ all -> 0x00d7 }
            dg1.e r2 = r4.mo94425a()     // Catch:{ all -> 0x00d7 }
            r0.mo94443d(r1, r2)     // Catch:{ all -> 0x00d7 }
            monitor-enter(r12)     // Catch:{ all -> 0x00d7 }
            long r0 = r12.f95900q     // Catch:{ all -> 0x009d }
            dg1.e r2 = r4.mo94425a()     // Catch:{ all -> 0x009d }
            int r2 = r2.mo94793B()     // Catch:{ all -> 0x009d }
            long r6 = (long) r2     // Catch:{ all -> 0x009d }
            long r0 = r0 - r6
            r12.f95900q = r0     // Catch:{ all -> 0x009d }
            monitor-exit(r12)     // Catch:{ all -> 0x00d7 }
            goto L_0x00be
        L_0x009d:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00a0:
            boolean r2 = r4 instanceof bg1.C40370d.C40371a     // Catch:{ all -> 0x00d7 }
            if (r2 == 0) goto L_0x00d1
            bg1.d$a r4 = (bg1.C40370d.C40371a) r4     // Catch:{ all -> 0x00d7 }
            kotlin.jvm.internal.C41536l.m120486f(r0)     // Catch:{ all -> 0x00d7 }
            int r2 = r4.mo94423b()     // Catch:{ all -> 0x00d7 }
            dg1.e r4 = r4.mo94424c()     // Catch:{ all -> 0x00d7 }
            r0.mo94441a(r2, r4)     // Catch:{ all -> 0x00d7 }
            if (r5 == 0) goto L_0x00be
            of1.i0 r0 = r12.f95885b     // Catch:{ all -> 0x00d7 }
            kotlin.jvm.internal.C41536l.m120486f(r7)     // Catch:{ all -> 0x00d7 }
            r0.mo42923a(r12, r1, r7)     // Catch:{ all -> 0x00d7 }
        L_0x00be:
            if (r5 != 0) goto L_0x00c1
            goto L_0x00c4
        L_0x00c1:
            pf1.C42197d.m122547m(r5)
        L_0x00c4:
            if (r8 != 0) goto L_0x00c7
            goto L_0x00ca
        L_0x00c7:
            pf1.C42197d.m122547m(r8)
        L_0x00ca:
            if (r9 != 0) goto L_0x00cd
            goto L_0x00d0
        L_0x00cd:
            pf1.C42197d.m122547m(r9)
        L_0x00d0:
            return r3
        L_0x00d1:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00d7 }
            r0.<init>()     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            if (r5 != 0) goto L_0x00db
            goto L_0x00de
        L_0x00db:
            pf1.C42197d.m122547m(r5)
        L_0x00de:
            if (r8 != 0) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            pf1.C42197d.m122547m(r8)
        L_0x00e4:
            if (r9 != 0) goto L_0x00e7
            goto L_0x00ea
        L_0x00e7:
            pf1.C42197d.m122547m(r9)
        L_0x00ea:
            throw r0
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.mo94420w():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0022, code lost:
        if (r1 == -1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0024, code lost:
        mo94416p(new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r7.f95887d + "ms (after " + (r1 - 1) + " successful ping/pongs)"), (of1.C41880d0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.mo94444e(dg1.C40681e.f96328h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        mo94416p(r0, (of1.C41880d0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo94421x() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f95904u     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)
            return
        L_0x0007:
            bg1.h r0 = r7.f95894k     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x000d
            monitor-exit(r7)
            return
        L_0x000d:
            boolean r1 = r7.f95908y     // Catch:{ all -> 0x0059 }
            r2 = -1
            if (r1 == 0) goto L_0x0015
            int r1 = r7.f95905v     // Catch:{ all -> 0x0059 }
            goto L_0x0016
        L_0x0015:
            r1 = r2
        L_0x0016:
            int r3 = r7.f95905v     // Catch:{ all -> 0x0059 }
            r4 = 1
            int r3 = r3 + r4
            r7.f95905v = r3     // Catch:{ all -> 0x0059 }
            r7.f95908y = r4     // Catch:{ all -> 0x0059 }
            he1.w r3 = he1.C41238w.f97225a     // Catch:{ all -> 0x0059 }
            monitor-exit(r7)
            r3 = 0
            if (r1 == r2) goto L_0x004e
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f95887d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.mo94416p(r0, r3)
            return
        L_0x004e:
            dg1.e r1 = dg1.C40681e.f96328h     // Catch:{ IOException -> 0x0054 }
            r0.mo94444e(r1)     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r0 = move-exception
            r7.mo94416p(r0, r3)
        L_0x0058:
            return
        L_0x0059:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bg1.C40370d.mo94421x():void");
    }
}
