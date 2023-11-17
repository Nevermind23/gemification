package wf1;

import dg1.C40672b;
import dg1.C40677c;
import dg1.C40679d;
import dg1.C40681e;
import he1.C41238w;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41548x;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf1.C42197d;
import sf1.C42558a;
import sf1.C42560c;
import sf1.C42561d;
import sf1.C42562e;
import ue1.C43064a;
import wf1.C43223g;
import xf1.C43286k;

/* renamed from: wf1.e */
public final class C43202e implements Closeable {

    /* renamed from: F */
    public static final C43204b f100805F = new C43204b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public static final C43239l f100806G;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public long f100807A;

    /* renamed from: B */
    private final Socket f100808B;

    /* renamed from: C */
    private final C43232i f100809C;

    /* renamed from: D */
    private final C43208d f100810D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final Set f100811E;

    /* renamed from: d */
    private final boolean f100812d;

    /* renamed from: e */
    private final C43205c f100813e;

    /* renamed from: f */
    private final Map f100814f = new LinkedHashMap();

    /* renamed from: g */
    private final String f100815g;

    /* renamed from: h */
    private int f100816h;

    /* renamed from: i */
    private int f100817i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f100818j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C42562e f100819k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C42561d f100820l;

    /* renamed from: m */
    private final C42561d f100821m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C42561d f100822n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C43236k f100823o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f100824p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public long f100825q;

    /* renamed from: r */
    private long f100826r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public long f100827s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public long f100828t;

    /* renamed from: u */
    private long f100829u;

    /* renamed from: v */
    private final C43239l f100830v;

    /* renamed from: w */
    private C43239l f100831w;

    /* renamed from: x */
    private long f100832x;

    /* renamed from: y */
    private long f100833y;

    /* renamed from: z */
    private long f100834z;

    /* renamed from: wf1.e$a */
    public static final class C43203a {

        /* renamed from: a */
        private boolean f100835a;

        /* renamed from: b */
        private final C42562e f100836b;

        /* renamed from: c */
        public Socket f100837c;

        /* renamed from: d */
        public String f100838d;

        /* renamed from: e */
        public C40679d f100839e;

        /* renamed from: f */
        public C40677c f100840f;

        /* renamed from: g */
        private C43205c f100841g = C43205c.f100845b;

        /* renamed from: h */
        private C43236k f100842h = C43236k.f100970b;

        /* renamed from: i */
        private int f100843i;

        public C43203a(boolean z, C42562e eVar) {
            C41536l.m120489i(eVar, "taskRunner");
            this.f100835a = z;
            this.f100836b = eVar;
        }

        /* renamed from: a */
        public final C43202e mo101803a() {
            return new C43202e(this);
        }

        /* renamed from: b */
        public final boolean mo101804b() {
            return this.f100835a;
        }

        /* renamed from: c */
        public final String mo101805c() {
            String str = this.f100838d;
            if (str != null) {
                return str;
            }
            C41536l.m120506z("connectionName");
            return null;
        }

        /* renamed from: d */
        public final C43205c mo101806d() {
            return this.f100841g;
        }

        /* renamed from: e */
        public final int mo101807e() {
            return this.f100843i;
        }

        /* renamed from: f */
        public final C43236k mo101808f() {
            return this.f100842h;
        }

        /* renamed from: g */
        public final C40677c mo101809g() {
            C40677c cVar = this.f100840f;
            if (cVar != null) {
                return cVar;
            }
            C41536l.m120506z("sink");
            return null;
        }

        /* renamed from: h */
        public final Socket mo101810h() {
            Socket socket = this.f100837c;
            if (socket != null) {
                return socket;
            }
            C41536l.m120506z("socket");
            return null;
        }

        /* renamed from: i */
        public final C40679d mo101811i() {
            C40679d dVar = this.f100839e;
            if (dVar != null) {
                return dVar;
            }
            C41536l.m120506z("source");
            return null;
        }

        /* renamed from: j */
        public final C42562e mo101812j() {
            return this.f100836b;
        }

        /* renamed from: k */
        public final C43203a mo101813k(C43205c cVar) {
            C41536l.m120489i(cVar, "listener");
            mo101816n(cVar);
            return this;
        }

        /* renamed from: l */
        public final C43203a mo101814l(int i) {
            mo101817o(i);
            return this;
        }

        /* renamed from: m */
        public final void mo101815m(String str) {
            C41536l.m120489i(str, "<set-?>");
            this.f100838d = str;
        }

        /* renamed from: n */
        public final void mo101816n(C43205c cVar) {
            C41536l.m120489i(cVar, "<set-?>");
            this.f100841g = cVar;
        }

        /* renamed from: o */
        public final void mo101817o(int i) {
            this.f100843i = i;
        }

        /* renamed from: p */
        public final void mo101818p(C40677c cVar) {
            C41536l.m120489i(cVar, "<set-?>");
            this.f100840f = cVar;
        }

        /* renamed from: q */
        public final void mo101819q(Socket socket) {
            C41536l.m120489i(socket, "<set-?>");
            this.f100837c = socket;
        }

        /* renamed from: r */
        public final void mo101820r(C40679d dVar) {
            C41536l.m120489i(dVar, "<set-?>");
            this.f100839e = dVar;
        }

        /* renamed from: s */
        public final C43203a mo101821s(Socket socket, String str, C40679d dVar, C40677c cVar) {
            String str2;
            C41536l.m120489i(socket, "socket");
            C41536l.m120489i(str, "peerName");
            C41536l.m120489i(dVar, "source");
            C41536l.m120489i(cVar, "sink");
            mo101819q(socket);
            if (mo101804b()) {
                str2 = C42197d.f99272i + ' ' + str;
            } else {
                str2 = C41536l.m120497q("MockWebServer ", str);
            }
            mo101815m(str2);
            mo101820r(dVar);
            mo101818p(cVar);
            return this;
        }
    }

    /* renamed from: wf1.e$b */
    public static final class C43204b {
        private C43204b() {
        }

        public /* synthetic */ C43204b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43239l mo101822a() {
            return C43202e.f100806G;
        }
    }

    /* renamed from: wf1.e$c */
    public static abstract class C43205c {

        /* renamed from: a */
        public static final C43207b f100844a = new C43207b((DefaultConstructorMarker) null);

        /* renamed from: b */
        public static final C43205c f100845b = new C43206a();

        /* renamed from: wf1.e$c$a */
        public static final class C43206a extends C43205c {
            C43206a() {
            }

            /* renamed from: c */
            public void mo101568c(C43227h hVar) {
                C41536l.m120489i(hVar, "stream");
                hVar.mo101858d(C43194a.REFUSED_STREAM, (IOException) null);
            }
        }

        /* renamed from: wf1.e$c$b */
        public static final class C43207b {
            private C43207b() {
            }

            public /* synthetic */ C43207b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: b */
        public void mo101567b(C43202e eVar, C43239l lVar) {
            C41536l.m120489i(eVar, "connection");
            C41536l.m120489i(lVar, "settings");
        }

        /* renamed from: c */
        public abstract void mo101568c(C43227h hVar);
    }

    /* renamed from: wf1.e$d */
    public final class C43208d implements C43223g.C43226c, C43064a {

        /* renamed from: d */
        private final C43223g f100846d;

        /* renamed from: e */
        final /* synthetic */ C43202e f100847e;

        /* renamed from: wf1.e$d$a */
        public static final class C43209a extends C42558a {

            /* renamed from: e */
            final /* synthetic */ String f100848e;

            /* renamed from: f */
            final /* synthetic */ boolean f100849f;

            /* renamed from: g */
            final /* synthetic */ C43202e f100850g;

            /* renamed from: h */
            final /* synthetic */ C41550z f100851h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43209a(String str, boolean z, C43202e eVar, C41550z zVar) {
                super(str, z);
                this.f100848e = str;
                this.f100849f = z;
                this.f100850g = eVar;
                this.f100851h = zVar;
            }

            /* renamed from: f */
            public long mo94430f() {
                this.f100850g.mo101790m0().mo101567b(this.f100850g, (C43239l) this.f100851h.f97717d);
                return -1;
            }
        }

        /* renamed from: wf1.e$d$b */
        public static final class C43210b extends C42558a {

            /* renamed from: e */
            final /* synthetic */ String f100852e;

            /* renamed from: f */
            final /* synthetic */ boolean f100853f;

            /* renamed from: g */
            final /* synthetic */ C43202e f100854g;

            /* renamed from: h */
            final /* synthetic */ C43227h f100855h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43210b(String str, boolean z, C43202e eVar, C43227h hVar) {
                super(str, z);
                this.f100852e = str;
                this.f100853f = z;
                this.f100854g = eVar;
                this.f100855h = hVar;
            }

            /* renamed from: f */
            public long mo94430f() {
                try {
                    this.f100854g.mo101790m0().mo101568c(this.f100855h);
                    return -1;
                } catch (IOException e) {
                    C43286k.f101052a.mo101988g().mo101984j(C41536l.m120497q("Http2Connection.Listener failure for ", this.f100854g.mo101784f0()), 4, e);
                    try {
                        this.f100855h.mo101858d(C43194a.PROTOCOL_ERROR, e);
                        return -1;
                    } catch (IOException unused) {
                        return -1;
                    }
                }
            }
        }

        /* renamed from: wf1.e$d$c */
        public static final class C43211c extends C42558a {

            /* renamed from: e */
            final /* synthetic */ String f100856e;

            /* renamed from: f */
            final /* synthetic */ boolean f100857f;

            /* renamed from: g */
            final /* synthetic */ C43202e f100858g;

            /* renamed from: h */
            final /* synthetic */ int f100859h;

            /* renamed from: i */
            final /* synthetic */ int f100860i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43211c(String str, boolean z, C43202e eVar, int i, int i2) {
                super(str, z);
                this.f100856e = str;
                this.f100857f = z;
                this.f100858g = eVar;
                this.f100859h = i;
                this.f100860i = i2;
            }

            /* renamed from: f */
            public long mo94430f() {
                this.f100858g.mo101770G1(true, this.f100859h, this.f100860i);
                return -1;
            }
        }

        /* renamed from: wf1.e$d$d */
        public static final class C43212d extends C42558a {

            /* renamed from: e */
            final /* synthetic */ String f100861e;

            /* renamed from: f */
            final /* synthetic */ boolean f100862f;

            /* renamed from: g */
            final /* synthetic */ C43208d f100863g;

            /* renamed from: h */
            final /* synthetic */ boolean f100864h;

            /* renamed from: i */
            final /* synthetic */ C43239l f100865i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43212d(String str, boolean z, C43208d dVar, boolean z2, C43239l lVar) {
                super(str, z);
                this.f100861e = str;
                this.f100862f = z;
                this.f100863g = dVar;
                this.f100864h = z2;
                this.f100865i = lVar;
            }

            /* renamed from: f */
            public long mo94430f() {
                this.f100863g.mo101833k(this.f100864h, this.f100865i);
                return -1;
            }
        }

        public C43208d(C43202e eVar, C43223g gVar) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(gVar, "reader");
            this.f100847e = eVar;
            this.f100846d = gVar;
        }

        /* renamed from: a */
        public void mo101823a(int i, C43194a aVar, C40681e eVar) {
            int i2;
            Object[] array;
            C41536l.m120489i(aVar, "errorCode");
            C41536l.m120489i(eVar, "debugData");
            eVar.mo94793B();
            C43202e eVar2 = this.f100847e;
            synchronized (eVar2) {
                i2 = 0;
                array = eVar2.mo101801x0().values().toArray(new C43227h[0]);
                if (array != null) {
                    eVar2.f100818j = true;
                    C41238w wVar = C41238w.f97225a;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
            }
            C43227h[] hVarArr = (C43227h[]) array;
            int length = hVarArr.length;
            while (i2 < length) {
                C43227h hVar = hVarArr[i2];
                i2++;
                if (hVar.mo101863j() > i && hVar.mo101873t()) {
                    hVar.mo101878y(C43194a.REFUSED_STREAM);
                    this.f100847e.mo101788i1(hVar.mo101863j());
                }
            }
        }

        /* renamed from: b */
        public void mo101824b(boolean z, int i, int i2, List list) {
            C41536l.m120489i(list, "headerBlock");
            if (this.f100847e.mo101785f1(i)) {
                this.f100847e.mo101779W0(i, list, z);
                return;
            }
            C43202e eVar = this.f100847e;
            synchronized (eVar) {
                C43227h s0 = eVar.mo101798s0(i);
                if (s0 != null) {
                    C41238w wVar = C41238w.f97225a;
                    s0.mo101877x(C42197d.m122522P(list), z);
                } else if (!eVar.f100818j) {
                    if (i > eVar.mo101787h0()) {
                        if (i % 2 != eVar.mo101791n0() % 2) {
                            C43227h hVar = new C43227h(i, eVar, false, z, C42197d.m122522P(list));
                            eVar.mo101794p1(i);
                            eVar.mo101801x0().put(Integer.valueOf(i), hVar);
                            C42561d i3 = eVar.f100819k.mo98014i();
                            i3.mo98003i(new C43210b(eVar.mo101784f0() + '[' + i + "] onStream", true, eVar, hVar), 0);
                        }
                    }
                }
            }
        }

        /* renamed from: c */
        public void mo101825c(int i, long j) {
            if (i == 0) {
                C43202e eVar = this.f100847e;
                synchronized (eVar) {
                    eVar.f100807A = eVar.mo101767F0() + j;
                    eVar.notifyAll();
                    C41238w wVar = C41238w.f97225a;
                }
                return;
            }
            C43227h s0 = this.f100847e.mo101798s0(i);
            if (s0 != null) {
                synchronized (s0) {
                    s0.mo101855a(j);
                    C41238w wVar2 = C41238w.f97225a;
                }
            }
        }

        /* renamed from: d */
        public void mo101826d(int i, C43194a aVar) {
            C41536l.m120489i(aVar, "errorCode");
            if (this.f100847e.mo101785f1(i)) {
                this.f100847e.mo101781a1(i, aVar);
                return;
            }
            C43227h i1 = this.f100847e.mo101788i1(i);
            if (i1 != null) {
                i1.mo101878y(aVar);
            }
        }

        /* renamed from: e */
        public void mo101827e(int i, int i2, List list) {
            C41536l.m120489i(list, "requestHeaders");
            this.f100847e.mo101780Y0(i2, list);
        }

        /* renamed from: f */
        public void mo101828f() {
        }

        /* renamed from: g */
        public void mo101829g(boolean z, int i, C40679d dVar, int i2) {
            C41536l.m120489i(dVar, "source");
            if (this.f100847e.mo101785f1(i)) {
                this.f100847e.mo101778V0(i, dVar, i2, z);
                return;
            }
            C43227h s0 = this.f100847e.mo101798s0(i);
            if (s0 == null) {
                this.f100847e.mo101773I1(i, C43194a.PROTOCOL_ERROR);
                long j = (long) i2;
                this.f100847e.mo101802z1(j);
                dVar.skip(j);
                return;
            }
            s0.mo101876w(dVar, i2);
            if (z) {
                s0.mo101877x(C42197d.f99265b, true);
            }
        }

        /* renamed from: h */
        public void mo101830h(boolean z, int i, int i2) {
            if (z) {
                C43202e eVar = this.f100847e;
                synchronized (eVar) {
                    if (i == 1) {
                        eVar.f100825q = eVar.f100825q + 1;
                    } else if (i != 2) {
                        if (i == 3) {
                            eVar.f100828t = eVar.f100828t + 1;
                            eVar.notifyAll();
                        }
                        C41238w wVar = C41238w.f97225a;
                    } else {
                        eVar.f100827s = eVar.f100827s + 1;
                    }
                }
                return;
            }
            this.f100847e.f100820l.mo98003i(new C43211c(C41536l.m120497q(this.f100847e.mo101784f0(), " ping"), true, this.f100847e, i, i2), 0);
        }

        /* renamed from: i */
        public void mo101831i(int i, int i2, int i3, boolean z) {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo101834l();
            return C41238w.f97225a;
        }

        /* renamed from: j */
        public void mo101832j(boolean z, C43239l lVar) {
            C41536l.m120489i(lVar, "settings");
            this.f100847e.f100820l.mo98003i(new C43212d(C41536l.m120497q(this.f100847e.mo101784f0(), " applyAndAckSettings"), true, this, z, lVar), 0);
        }

        /* renamed from: k */
        public final void mo101833k(boolean z, C43239l lVar) {
            long c;
            int i;
            C43227h[] hVarArr;
            C41536l.m120489i(lVar, "settings");
            C41550z zVar = new C41550z();
            C43232i H0 = this.f100847e.mo101771H0();
            C43202e eVar = this.f100847e;
            synchronized (H0) {
                synchronized (eVar) {
                    C43239l p0 = eVar.mo101793p0();
                    if (!z) {
                        C43239l lVar2 = new C43239l();
                        lVar2.mo101923g(p0);
                        lVar2.mo101923g(lVar);
                        lVar = lVar2;
                    }
                    zVar.f97717d = lVar;
                    c = ((long) lVar.mo101919c()) - ((long) p0.mo101919c());
                    i = 0;
                    if (c != 0) {
                        if (!eVar.mo101801x0().isEmpty()) {
                            Object[] array = eVar.mo101801x0().values().toArray(new C43227h[0]);
                            if (array != null) {
                                hVarArr = (C43227h[]) array;
                                eVar.mo101797r1((C43239l) zVar.f97717d);
                                eVar.f100822n.mo98003i(new C43209a(C41536l.m120497q(eVar.mo101784f0(), " onSettings"), true, eVar, zVar), 0);
                                C41238w wVar = C41238w.f97225a;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                        }
                    }
                    hVarArr = null;
                    eVar.mo101797r1((C43239l) zVar.f97717d);
                    eVar.f100822n.mo98003i(new C43209a(C41536l.m120497q(eVar.mo101784f0(), " onSettings"), true, eVar, zVar), 0);
                    C41238w wVar2 = C41238w.f97225a;
                }
                try {
                    eVar.mo101771H0().mo101892a((C43239l) zVar.f97717d);
                } catch (IOException e) {
                    eVar.m123935a0(e);
                }
                C41238w wVar3 = C41238w.f97225a;
            }
            if (hVarArr != null) {
                int length = hVarArr.length;
                while (i < length) {
                    C43227h hVar = hVarArr[i];
                    i++;
                    synchronized (hVar) {
                        hVar.mo101855a(c);
                        C41238w wVar4 = C41238w.f97225a;
                    }
                }
            }
        }

        /* renamed from: l */
        public void mo101834l() {
            C43194a aVar;
            C43194a aVar2 = C43194a.INTERNAL_ERROR;
            e = null;
            try {
                this.f100846d.mo101839d(this);
                while (this.f100846d.mo101837c(false, this)) {
                }
                aVar = C43194a.NO_ERROR;
                try {
                    this.f100847e.mo101777U(aVar, C43194a.CANCEL, (IOException) null);
                } catch (IOException e) {
                    e = e;
                    try {
                        C43194a aVar3 = C43194a.PROTOCOL_ERROR;
                        this.f100847e.mo101777U(aVar3, aVar3, e);
                        C42197d.m122547m(this.f100846d);
                    } catch (Throwable th) {
                        th = th;
                        this.f100847e.mo101777U(aVar, aVar2, e);
                        C42197d.m122547m(this.f100846d);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                aVar = aVar2;
                C43194a aVar32 = C43194a.PROTOCOL_ERROR;
                this.f100847e.mo101777U(aVar32, aVar32, e);
                C42197d.m122547m(this.f100846d);
            } catch (Throwable th2) {
                th = th2;
                aVar = aVar2;
                this.f100847e.mo101777U(aVar, aVar2, e);
                C42197d.m122547m(this.f100846d);
                throw th;
            }
            C42197d.m122547m(this.f100846d);
        }
    }

    /* renamed from: wf1.e$e */
    public static final class C43213e extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100866e;

        /* renamed from: f */
        final /* synthetic */ boolean f100867f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100868g;

        /* renamed from: h */
        final /* synthetic */ int f100869h;

        /* renamed from: i */
        final /* synthetic */ C40672b f100870i;

        /* renamed from: j */
        final /* synthetic */ int f100871j;

        /* renamed from: k */
        final /* synthetic */ boolean f100872k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43213e(String str, boolean z, C43202e eVar, int i, C40672b bVar, int i2, boolean z2) {
            super(str, z);
            this.f100866e = str;
            this.f100867f = z;
            this.f100868g = eVar;
            this.f100869h = i;
            this.f100870i = bVar;
            this.f100871j = i2;
            this.f100872k = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo94430f() {
            /*
                r5 = this;
                wf1.e r0 = r5.f100868g     // Catch:{ IOException -> 0x003e }
                wf1.k r0 = r0.f100823o     // Catch:{ IOException -> 0x003e }
                int r1 = r5.f100869h     // Catch:{ IOException -> 0x003e }
                dg1.b r2 = r5.f100870i     // Catch:{ IOException -> 0x003e }
                int r3 = r5.f100871j     // Catch:{ IOException -> 0x003e }
                boolean r4 = r5.f100872k     // Catch:{ IOException -> 0x003e }
                boolean r0 = r0.mo101916d(r1, r2, r3, r4)     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x0021
                wf1.e r1 = r5.f100868g     // Catch:{ IOException -> 0x003e }
                wf1.i r1 = r1.mo101771H0()     // Catch:{ IOException -> 0x003e }
                int r2 = r5.f100869h     // Catch:{ IOException -> 0x003e }
                wf1.a r3 = wf1.C43194a.CANCEL     // Catch:{ IOException -> 0x003e }
                r1.mo101904v(r2, r3)     // Catch:{ IOException -> 0x003e }
            L_0x0021:
                if (r0 != 0) goto L_0x0027
                boolean r0 = r5.f100872k     // Catch:{ IOException -> 0x003e }
                if (r0 == 0) goto L_0x003e
            L_0x0027:
                wf1.e r0 = r5.f100868g     // Catch:{ IOException -> 0x003e }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003e }
                wf1.e r1 = r5.f100868g     // Catch:{ all -> 0x003b }
                java.util.Set r1 = r1.f100811E     // Catch:{ all -> 0x003b }
                int r2 = r5.f100869h     // Catch:{ all -> 0x003b }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x003b }
                r1.remove(r2)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                goto L_0x003e
            L_0x003b:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003e }
                throw r1     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.C43213e.mo94430f():long");
        }
    }

    /* renamed from: wf1.e$f */
    public static final class C43214f extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100873e;

        /* renamed from: f */
        final /* synthetic */ boolean f100874f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100875g;

        /* renamed from: h */
        final /* synthetic */ int f100876h;

        /* renamed from: i */
        final /* synthetic */ List f100877i;

        /* renamed from: j */
        final /* synthetic */ boolean f100878j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43214f(String str, boolean z, C43202e eVar, int i, List list, boolean z2) {
            super(str, z);
            this.f100873e = str;
            this.f100874f = z;
            this.f100875g = eVar;
            this.f100876h = i;
            this.f100877i = list;
            this.f100878j = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo94430f() {
            /*
                r4 = this;
                wf1.e r0 = r4.f100875g
                wf1.k r0 = r0.f100823o
                int r1 = r4.f100876h
                java.util.List r2 = r4.f100877i
                boolean r3 = r4.f100878j
                boolean r0 = r0.mo101915c(r1, r2, r3)
                if (r0 == 0) goto L_0x001f
                wf1.e r1 = r4.f100875g     // Catch:{ IOException -> 0x003c }
                wf1.i r1 = r1.mo101771H0()     // Catch:{ IOException -> 0x003c }
                int r2 = r4.f100876h     // Catch:{ IOException -> 0x003c }
                wf1.a r3 = wf1.C43194a.CANCEL     // Catch:{ IOException -> 0x003c }
                r1.mo101904v(r2, r3)     // Catch:{ IOException -> 0x003c }
            L_0x001f:
                if (r0 != 0) goto L_0x0025
                boolean r0 = r4.f100878j     // Catch:{ IOException -> 0x003c }
                if (r0 == 0) goto L_0x003c
            L_0x0025:
                wf1.e r0 = r4.f100875g     // Catch:{ IOException -> 0x003c }
                monitor-enter(r0)     // Catch:{ IOException -> 0x003c }
                wf1.e r1 = r4.f100875g     // Catch:{ all -> 0x0039 }
                java.util.Set r1 = r1.f100811E     // Catch:{ all -> 0x0039 }
                int r2 = r4.f100876h     // Catch:{ all -> 0x0039 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0039 }
                r1.remove(r2)     // Catch:{ all -> 0x0039 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                goto L_0x003c
            L_0x0039:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x003c }
                throw r1     // Catch:{ IOException -> 0x003c }
            L_0x003c:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.C43214f.mo94430f():long");
        }
    }

    /* renamed from: wf1.e$g */
    public static final class C43215g extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100879e;

        /* renamed from: f */
        final /* synthetic */ boolean f100880f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100881g;

        /* renamed from: h */
        final /* synthetic */ int f100882h;

        /* renamed from: i */
        final /* synthetic */ List f100883i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43215g(String str, boolean z, C43202e eVar, int i, List list) {
            super(str, z);
            this.f100879e = str;
            this.f100880f = z;
            this.f100881g = eVar;
            this.f100882h = i;
            this.f100883i = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return -1;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo94430f() {
            /*
                r3 = this;
                wf1.e r0 = r3.f100881g
                wf1.k r0 = r0.f100823o
                int r1 = r3.f100882h
                java.util.List r2 = r3.f100883i
                boolean r0 = r0.mo101914b(r1, r2)
                if (r0 == 0) goto L_0x0034
                wf1.e r0 = r3.f100881g     // Catch:{ IOException -> 0x0034 }
                wf1.i r0 = r0.mo101771H0()     // Catch:{ IOException -> 0x0034 }
                int r1 = r3.f100882h     // Catch:{ IOException -> 0x0034 }
                wf1.a r2 = wf1.C43194a.CANCEL     // Catch:{ IOException -> 0x0034 }
                r0.mo101904v(r1, r2)     // Catch:{ IOException -> 0x0034 }
                wf1.e r0 = r3.f100881g     // Catch:{ IOException -> 0x0034 }
                monitor-enter(r0)     // Catch:{ IOException -> 0x0034 }
                wf1.e r1 = r3.f100881g     // Catch:{ all -> 0x0031 }
                java.util.Set r1 = r1.f100811E     // Catch:{ all -> 0x0031 }
                int r2 = r3.f100882h     // Catch:{ all -> 0x0031 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0031 }
                r1.remove(r2)     // Catch:{ all -> 0x0031 }
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                goto L_0x0034
            L_0x0031:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ IOException -> 0x0034 }
                throw r1     // Catch:{ IOException -> 0x0034 }
            L_0x0034:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.C43215g.mo94430f():long");
        }
    }

    /* renamed from: wf1.e$h */
    public static final class C43216h extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100884e;

        /* renamed from: f */
        final /* synthetic */ boolean f100885f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100886g;

        /* renamed from: h */
        final /* synthetic */ int f100887h;

        /* renamed from: i */
        final /* synthetic */ C43194a f100888i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43216h(String str, boolean z, C43202e eVar, int i, C43194a aVar) {
            super(str, z);
            this.f100884e = str;
            this.f100885f = z;
            this.f100886g = eVar;
            this.f100887h = i;
            this.f100888i = aVar;
        }

        /* renamed from: f */
        public long mo94430f() {
            this.f100886g.f100823o.mo101913a(this.f100887h, this.f100888i);
            synchronized (this.f100886g) {
                this.f100886g.f100811E.remove(Integer.valueOf(this.f100887h));
                C41238w wVar = C41238w.f97225a;
            }
            return -1;
        }
    }

    /* renamed from: wf1.e$i */
    public static final class C43217i extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100889e;

        /* renamed from: f */
        final /* synthetic */ boolean f100890f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100891g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43217i(String str, boolean z, C43202e eVar) {
            super(str, z);
            this.f100889e = str;
            this.f100890f = z;
            this.f100891g = eVar;
        }

        /* renamed from: f */
        public long mo94430f() {
            this.f100891g.mo101770G1(false, 2, 0);
            return -1;
        }
    }

    /* renamed from: wf1.e$j */
    public static final class C43218j extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100892e;

        /* renamed from: f */
        final /* synthetic */ C43202e f100893f;

        /* renamed from: g */
        final /* synthetic */ long f100894g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43218j(String str, C43202e eVar, long j) {
            super(str, false, 2, (DefaultConstructorMarker) null);
            this.f100892e = str;
            this.f100893f = eVar;
            this.f100894g = j;
        }

        /* renamed from: f */
        public long mo94430f() {
            boolean z;
            synchronized (this.f100893f) {
                if (this.f100893f.f100825q < this.f100893f.f100824p) {
                    z = true;
                } else {
                    this.f100893f.f100824p = this.f100893f.f100824p + 1;
                    z = false;
                }
            }
            if (z) {
                this.f100893f.m123935a0((IOException) null);
                return -1;
            }
            this.f100893f.mo101770G1(false, 1, 0);
            return this.f100894g;
        }
    }

    /* renamed from: wf1.e$k */
    public static final class C43219k extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100895e;

        /* renamed from: f */
        final /* synthetic */ boolean f100896f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100897g;

        /* renamed from: h */
        final /* synthetic */ int f100898h;

        /* renamed from: i */
        final /* synthetic */ C43194a f100899i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43219k(String str, boolean z, C43202e eVar, int i, C43194a aVar) {
            super(str, z);
            this.f100895e = str;
            this.f100896f = z;
            this.f100897g = eVar;
            this.f100898h = i;
            this.f100899i = aVar;
        }

        /* renamed from: f */
        public long mo94430f() {
            try {
                this.f100897g.mo101772H1(this.f100898h, this.f100899i);
                return -1;
            } catch (IOException e) {
                this.f100897g.m123935a0(e);
                return -1;
            }
        }
    }

    /* renamed from: wf1.e$l */
    public static final class C43220l extends C42558a {

        /* renamed from: e */
        final /* synthetic */ String f100900e;

        /* renamed from: f */
        final /* synthetic */ boolean f100901f;

        /* renamed from: g */
        final /* synthetic */ C43202e f100902g;

        /* renamed from: h */
        final /* synthetic */ int f100903h;

        /* renamed from: i */
        final /* synthetic */ long f100904i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43220l(String str, boolean z, C43202e eVar, int i, long j) {
            super(str, z);
            this.f100900e = str;
            this.f100901f = z;
            this.f100902g = eVar;
            this.f100903h = i;
            this.f100904i = j;
        }

        /* renamed from: f */
        public long mo94430f() {
            try {
                this.f100902g.mo101771H0().mo101906x(this.f100903h, this.f100904i);
                return -1;
            } catch (IOException e) {
                this.f100902g.m123935a0(e);
                return -1;
            }
        }
    }

    static {
        C43239l lVar = new C43239l();
        lVar.mo101924h(7, 65535);
        lVar.mo101924h(5, 16384);
        f100806G = lVar;
    }

    public C43202e(C43203a aVar) {
        int i;
        C41536l.m120489i(aVar, "builder");
        boolean b = aVar.mo101804b();
        this.f100812d = b;
        this.f100813e = aVar.mo101806d();
        String c = aVar.mo101805c();
        this.f100815g = c;
        if (aVar.mo101804b()) {
            i = 3;
        } else {
            i = 2;
        }
        this.f100817i = i;
        C42562e j = aVar.mo101812j();
        this.f100819k = j;
        C42561d i2 = j.mo98014i();
        this.f100820l = i2;
        this.f100821m = j.mo98014i();
        this.f100822n = j.mo98014i();
        this.f100823o = aVar.mo101808f();
        C43239l lVar = new C43239l();
        if (aVar.mo101804b()) {
            lVar.mo101924h(7, 16777216);
        }
        this.f100830v = lVar;
        C43239l lVar2 = f100806G;
        this.f100831w = lVar2;
        this.f100807A = (long) lVar2.mo101919c();
        this.f100808B = aVar.mo101810h();
        this.f100809C = new C43232i(aVar.mo101809g(), b);
        this.f100810D = new C43208d(this, new C43223g(aVar.mo101811i(), b));
        this.f100811E = new LinkedHashSet();
        if (aVar.mo101807e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) aVar.mo101807e());
            i2.mo98003i(new C43218j(C41536l.m120497q(c, " ping"), this, nanos), nanos);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final wf1.C43227h m123931M0(int r11, java.util.List r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            wf1.i r7 = r10.f100809C
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0099 }
            int r0 = r10.mo101791n0()     // Catch:{ all -> 0x0096 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0015
            wf1.a r0 = wf1.C43194a.REFUSED_STREAM     // Catch:{ all -> 0x0096 }
            r10.mo101799s1(r0)     // Catch:{ all -> 0x0096 }
        L_0x0015:
            boolean r0 = r10.f100818j     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0090
            int r8 = r10.mo101791n0()     // Catch:{ all -> 0x0096 }
            int r0 = r10.mo101791n0()     // Catch:{ all -> 0x0096 }
            int r0 = r0 + 2
            r10.mo101796q1(r0)     // Catch:{ all -> 0x0096 }
            wf1.h r9 = new wf1.h     // Catch:{ all -> 0x0096 }
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0096 }
            r0 = 1
            if (r13 == 0) goto L_0x004e
            long r1 = r10.mo101769G0()     // Catch:{ all -> 0x0096 }
            long r3 = r10.mo101767F0()     // Catch:{ all -> 0x0096 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 >= 0) goto L_0x004e
            long r1 = r9.mo101871r()     // Catch:{ all -> 0x0096 }
            long r3 = r9.mo101870q()     // Catch:{ all -> 0x0096 }
            int r13 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r13 < 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            r13 = 0
            goto L_0x004f
        L_0x004e:
            r13 = r0
        L_0x004f:
            boolean r1 = r9.mo101874u()     // Catch:{ all -> 0x0096 }
            if (r1 == 0) goto L_0x0060
            java.util.Map r1 = r10.mo101801x0()     // Catch:{ all -> 0x0096 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0096 }
            r1.put(r2, r9)     // Catch:{ all -> 0x0096 }
        L_0x0060:
            he1.w r1 = he1.C41238w.f97225a     // Catch:{ all -> 0x0096 }
            monitor-exit(r10)     // Catch:{ all -> 0x0099 }
            if (r11 != 0) goto L_0x006d
            wf1.i r11 = r10.mo101771H0()     // Catch:{ all -> 0x0099 }
            r11.mo101900q(r6, r8, r12)     // Catch:{ all -> 0x0099 }
            goto L_0x007b
        L_0x006d:
            boolean r1 = r10.mo101783e0()     // Catch:{ all -> 0x0099 }
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x0084
            wf1.i r0 = r10.mo101771H0()     // Catch:{ all -> 0x0099 }
            r0.mo101903u(r11, r8, r12)     // Catch:{ all -> 0x0099 }
        L_0x007b:
            monitor-exit(r7)
            if (r13 == 0) goto L_0x0083
            wf1.i r11 = r10.f100809C
            r11.flush()
        L_0x0083:
            return r9
        L_0x0084:
            java.lang.String r11 = "client streams shouldn't have associated stream IDs"
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0099 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0099 }
            r12.<init>(r11)     // Catch:{ all -> 0x0099 }
            throw r12     // Catch:{ all -> 0x0099 }
        L_0x0090:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0096 }
            r11.<init>()     // Catch:{ all -> 0x0096 }
            throw r11     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0099 }
            throw r11     // Catch:{ all -> 0x0099 }
        L_0x0099:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.m123931M0(int, java.util.List, boolean):wf1.h");
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public final void m123935a0(IOException iOException) {
        C43194a aVar = C43194a.PROTOCOL_ERROR;
        mo101777U(aVar, aVar, iOException);
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m123951y1(C43202e eVar, boolean z, C42562e eVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            eVar2 = C42562e.f100169i;
        }
        eVar.mo101800t1(z, eVar2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, mo101767F0() - mo101769G0()), mo101771H0().mo101901s());
        r6 = (long) r2;
        r8.f100834z = mo101769G0() + r6;
        r4 = he1.C41238w.f97225a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006f */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101766B1(int r9, boolean r10, dg1.C40672b r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            wf1.i r12 = r8.f100809C
            r12.mo101896m(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x007e
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.mo101769G0()     // Catch:{ InterruptedException -> 0x006f }
            long r6 = r8.mo101767F0()     // Catch:{ InterruptedException -> 0x006f }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0038
            java.util.Map r2 = r8.mo101801x0()     // Catch:{ InterruptedException -> 0x006f }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x006f }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x006f }
            if (r2 == 0) goto L_0x0030
            r8.wait()     // Catch:{ InterruptedException -> 0x006f }
            goto L_0x0012
        L_0x0030:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x006f }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x006f }
            throw r9     // Catch:{ InterruptedException -> 0x006f }
        L_0x0038:
            long r4 = r8.mo101767F0()     // Catch:{ all -> 0x006d }
            long r6 = r8.mo101769G0()     // Catch:{ all -> 0x006d }
            long r4 = r4 - r6
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x006d }
            int r2 = (int) r4     // Catch:{ all -> 0x006d }
            wf1.i r4 = r8.mo101771H0()     // Catch:{ all -> 0x006d }
            int r4 = r4.mo101901s()     // Catch:{ all -> 0x006d }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x006d }
            long r4 = r8.mo101769G0()     // Catch:{ all -> 0x006d }
            long r6 = (long) r2     // Catch:{ all -> 0x006d }
            long r4 = r4 + r6
            r8.f100834z = r4     // Catch:{ all -> 0x006d }
            he1.w r4 = he1.C41238w.f97225a     // Catch:{ all -> 0x006d }
            monitor-exit(r8)
            long r12 = r12 - r6
            wf1.i r4 = r8.f100809C
            if (r10 == 0) goto L_0x0068
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = r3
        L_0x0069:
            r4.mo101896m(r5, r9, r11, r2)
            goto L_0x000d
        L_0x006d:
            r9 = move-exception
            goto L_0x007c
        L_0x006f:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x006d }
            r9.interrupt()     // Catch:{ all -> 0x006d }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x006d }
            r9.<init>()     // Catch:{ all -> 0x006d }
            throw r9     // Catch:{ all -> 0x006d }
        L_0x007c:
            monitor-exit(r8)
            throw r9
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.mo101766B1(int, boolean, dg1.b, long):void");
    }

    /* renamed from: F0 */
    public final long mo101767F0() {
        return this.f100807A;
    }

    /* renamed from: F1 */
    public final void mo101768F1(int i, boolean z, List list) {
        C41536l.m120489i(list, "alternating");
        this.f100809C.mo101900q(z, i, list);
    }

    /* renamed from: G0 */
    public final long mo101769G0() {
        return this.f100834z;
    }

    /* renamed from: G1 */
    public final void mo101770G1(boolean z, int i, int i2) {
        try {
            this.f100809C.mo101902t(z, i, i2);
        } catch (IOException e) {
            m123935a0(e);
        }
    }

    /* renamed from: H0 */
    public final C43232i mo101771H0() {
        return this.f100809C;
    }

    /* renamed from: H1 */
    public final void mo101772H1(int i, C43194a aVar) {
        C41536l.m120489i(aVar, "statusCode");
        this.f100809C.mo101904v(i, aVar);
    }

    /* renamed from: I1 */
    public final void mo101773I1(int i, C43194a aVar) {
        C41536l.m120489i(aVar, "errorCode");
        C42561d dVar = this.f100820l;
        dVar.mo98003i(new C43219k(this.f100815g + '[' + i + "] writeSynReset", true, this, i, aVar), 0);
    }

    /* renamed from: J1 */
    public final void mo101774J1(int i, long j) {
        C42561d dVar = this.f100820l;
        dVar.mo98003i(new C43220l(this.f100815g + '[' + i + "] windowUpdate", true, this, i, j), 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        return true;
     */
    /* renamed from: K0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo101775K0(long r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f100818j     // Catch:{ all -> 0x001b }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r6)
            return r1
        L_0x0008:
            long r2 = r6.f100827s     // Catch:{ all -> 0x001b }
            long r4 = r6.f100826r     // Catch:{ all -> 0x001b }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0018
            long r2 = r6.f100829u     // Catch:{ all -> 0x001b }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x0018
            monitor-exit(r6)
            return r1
        L_0x0018:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x001b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.mo101775K0(long):boolean");
    }

    /* renamed from: O0 */
    public final C43227h mo101776O0(List list, boolean z) {
        C41536l.m120489i(list, "requestHeaders");
        return m123931M0(0, list, z);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0088 */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101777U(wf1.C43194a r4, wf1.C43194a r5, java.io.IOException r6) {
        /*
            r3 = this;
            java.lang.String r0 = "connectionCode"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "streamCode"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            boolean r0 = pf1.C42197d.f99271h
            if (r0 == 0) goto L_0x003c
            boolean r0 = java.lang.Thread.holdsLock(r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x003c
        L_0x0015:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Thread "
            r5.append(r6)
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r6 = " MUST NOT hold lock on "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x003c:
            r3.mo101799s1(r4)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            monitor-enter(r3)
            java.util.Map r4 = r3.mo101801x0()     // Catch:{ all -> 0x009f }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x009f }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x006d
            java.util.Map r4 = r3.mo101801x0()     // Catch:{ all -> 0x009f }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x009f }
            wf1.h[] r1 = new wf1.C43227h[r0]     // Catch:{ all -> 0x009f }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x009f }
            if (r4 == 0) goto L_0x0065
            java.util.Map r1 = r3.mo101801x0()     // Catch:{ all -> 0x009f }
            r1.clear()     // Catch:{ all -> 0x009f }
            goto L_0x006e
        L_0x0065:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x009f }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r4.<init>(r5)     // Catch:{ all -> 0x009f }
            throw r4     // Catch:{ all -> 0x009f }
        L_0x006d:
            r4 = 0
        L_0x006e:
            he1.w r1 = he1.C41238w.f97225a     // Catch:{ all -> 0x009f }
            monitor-exit(r3)
            wf1.h[] r4 = (wf1.C43227h[]) r4
            if (r4 != 0) goto L_0x0076
            goto L_0x0081
        L_0x0076:
            int r1 = r4.length
        L_0x0077:
            if (r0 >= r1) goto L_0x0081
            r2 = r4[r0]
            r2.mo101858d(r5, r6)     // Catch:{ IOException -> 0x007e }
        L_0x007e:
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0081:
            wf1.i r4 = r3.mo101771H0()     // Catch:{ IOException -> 0x0088 }
            r4.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            java.net.Socket r4 = r3.mo101795q0()     // Catch:{ IOException -> 0x008f }
            r4.close()     // Catch:{ IOException -> 0x008f }
        L_0x008f:
            sf1.d r4 = r3.f100820l
            r4.mo98008o()
            sf1.d r4 = r3.f100821m
            r4.mo98008o()
            sf1.d r4 = r3.f100822n
            r4.mo98008o()
            return
        L_0x009f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wf1.C43202e.mo101777U(wf1.a, wf1.a, java.io.IOException):void");
    }

    /* renamed from: V0 */
    public final void mo101778V0(int i, C40679d dVar, int i2, boolean z) {
        C41536l.m120489i(dVar, "source");
        C40672b bVar = new C40672b();
        long j = (long) i2;
        dVar.mo94691B0(j);
        dVar.mo21305g(bVar, j);
        C42561d dVar2 = this.f100821m;
        dVar2.mo98003i(new C43213e(this.f100815g + '[' + i + "] onData", true, this, i, bVar, i2, z), 0);
    }

    /* renamed from: W0 */
    public final void mo101779W0(int i, List list, boolean z) {
        C41536l.m120489i(list, "requestHeaders");
        C42561d dVar = this.f100821m;
        dVar.mo98003i(new C43214f(this.f100815g + '[' + i + "] onHeaders", true, this, i, list, z), 0);
    }

    /* renamed from: Y0 */
    public final void mo101780Y0(int i, List list) {
        C41536l.m120489i(list, "requestHeaders");
        synchronized (this) {
            if (this.f100811E.contains(Integer.valueOf(i))) {
                mo101773I1(i, C43194a.PROTOCOL_ERROR);
                return;
            }
            this.f100811E.add(Integer.valueOf(i));
            C42561d dVar = this.f100821m;
            dVar.mo98003i(new C43215g(this.f100815g + '[' + i + "] onRequest", true, this, i, list), 0);
        }
    }

    /* renamed from: a1 */
    public final void mo101781a1(int i, C43194a aVar) {
        C41536l.m120489i(aVar, "errorCode");
        C42561d dVar = this.f100821m;
        dVar.mo98003i(new C43216h(this.f100815g + '[' + i + "] onReset", true, this, i, aVar), 0);
    }

    public void close() {
        mo101777U(C43194a.NO_ERROR, C43194a.CANCEL, (IOException) null);
    }

    /* renamed from: e0 */
    public final boolean mo101783e0() {
        return this.f100812d;
    }

    /* renamed from: f0 */
    public final String mo101784f0() {
        return this.f100815g;
    }

    /* renamed from: f1 */
    public final boolean mo101785f1(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final void flush() {
        this.f100809C.flush();
    }

    /* renamed from: h0 */
    public final int mo101787h0() {
        return this.f100816h;
    }

    /* renamed from: i1 */
    public final synchronized C43227h mo101788i1(int i) {
        C43227h hVar;
        hVar = (C43227h) this.f100814f.remove(Integer.valueOf(i));
        notifyAll();
        return hVar;
    }

    /* renamed from: k1 */
    public final void mo101789k1() {
        synchronized (this) {
            long j = this.f100827s;
            long j2 = this.f100826r;
            if (j >= j2) {
                this.f100826r = j2 + 1;
                this.f100829u = System.nanoTime() + ((long) 1000000000);
                C41238w wVar = C41238w.f97225a;
                this.f100820l.mo98003i(new C43217i(C41536l.m120497q(this.f100815g, " ping"), true, this), 0);
            }
        }
    }

    /* renamed from: m0 */
    public final C43205c mo101790m0() {
        return this.f100813e;
    }

    /* renamed from: n0 */
    public final int mo101791n0() {
        return this.f100817i;
    }

    /* renamed from: o0 */
    public final C43239l mo101792o0() {
        return this.f100830v;
    }

    /* renamed from: p0 */
    public final C43239l mo101793p0() {
        return this.f100831w;
    }

    /* renamed from: p1 */
    public final void mo101794p1(int i) {
        this.f100816h = i;
    }

    /* renamed from: q0 */
    public final Socket mo101795q0() {
        return this.f100808B;
    }

    /* renamed from: q1 */
    public final void mo101796q1(int i) {
        this.f100817i = i;
    }

    /* renamed from: r1 */
    public final void mo101797r1(C43239l lVar) {
        C41536l.m120489i(lVar, "<set-?>");
        this.f100831w = lVar;
    }

    /* renamed from: s0 */
    public final synchronized C43227h mo101798s0(int i) {
        return (C43227h) this.f100814f.get(Integer.valueOf(i));
    }

    /* renamed from: s1 */
    public final void mo101799s1(C43194a aVar) {
        C41536l.m120489i(aVar, "statusCode");
        synchronized (this.f100809C) {
            C41548x xVar = new C41548x();
            synchronized (this) {
                if (!this.f100818j) {
                    this.f100818j = true;
                    xVar.f97715d = mo101787h0();
                    C41238w wVar = C41238w.f97225a;
                    mo101771H0().mo101899p(xVar.f97715d, aVar, C42197d.f99264a);
                }
            }
        }
    }

    /* renamed from: t1 */
    public final void mo101800t1(boolean z, C42562e eVar) {
        C41536l.m120489i(eVar, "taskRunner");
        if (z) {
            this.f100809C.mo101895k();
            this.f100809C.mo101905w(this.f100830v);
            int c = this.f100830v.mo101919c();
            if (c != 65535) {
                this.f100809C.mo101906x(0, (long) (c - 65535));
            }
        }
        eVar.mo98014i().mo98003i(new C42560c(this.f100815g, true, this.f100810D), 0);
    }

    /* renamed from: x0 */
    public final Map mo101801x0() {
        return this.f100814f;
    }

    /* renamed from: z1 */
    public final synchronized void mo101802z1(long j) {
        long j2 = this.f100832x + j;
        this.f100832x = j2;
        long j3 = j2 - this.f100833y;
        if (j3 >= ((long) (this.f100830v.mo101919c() / 2))) {
            mo101774J1(0, j3);
            this.f100833y += j3;
        }
    }
}
