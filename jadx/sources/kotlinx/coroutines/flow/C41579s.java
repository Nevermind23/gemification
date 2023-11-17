package kotlinx.coroutines.flow;

import gf1.C41097e;
import he1.C41238w;
import hf1.C41240a;
import hf1.C41255i;
import hf1.C41258k;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C41584a0;
import me1.C41752f;
import oe1.C41853d;

/* renamed from: kotlinx.coroutines.flow.s */
final class C41579s extends C41240a implements C41568k, C41556a, C41255i {
    private volatile /* synthetic */ Object _state;

    /* renamed from: d */
    private int f97758d;

    /* renamed from: kotlinx.coroutines.flow.s$a */
    static final class C41580a extends C41853d {

        /* renamed from: g */
        Object f97759g;

        /* renamed from: h */
        Object f97760h;

        /* renamed from: i */
        Object f97761i;

        /* renamed from: j */
        Object f97762j;

        /* renamed from: k */
        Object f97763k;

        /* renamed from: l */
        /* synthetic */ Object f97764l;

        /* renamed from: m */
        final /* synthetic */ C41579s f97765m;

        /* renamed from: n */
        int f97766n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41580a(C41579s sVar, Continuation continuation) {
            super(continuation);
            this.f97765m = sVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f97764l = obj;
            this.f97766n |= Integer.MIN_VALUE;
            return this.f97765m.mo95707a((C41557b) null, this);
        }
    }

    public C41579s(Object obj) {
        this._state = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r8 = (kotlinx.coroutines.flow.C41582u[]) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        if (r8 == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        r2 = r8.length;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r3 >= r2) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r4 = r8[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0036, code lost:
        if (r4 == null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
        r4.mo96349f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r8 = r6.f97758d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0041, code lost:
        if (r8 != r7) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0043, code lost:
        r6.f97758d = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0046, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0047, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7 = mo95704l();
        r2 = he1.C41238w.f97225a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004e, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004f, code lost:
        r5 = r8;
        r8 = r7;
        r7 = r5;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m120600o(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            r6.mo95704l()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch:{ all -> 0x005c }
            r1 = 0
            if (r7 == 0) goto L_0x0011
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r0, r7)     // Catch:{ all -> 0x005c }
            if (r7 != 0) goto L_0x0011
            monitor-exit(r6)
            return r1
        L_0x0011:
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r0, r8)     // Catch:{ all -> 0x005c }
            r0 = 1
            if (r7 == 0) goto L_0x001a
            monitor-exit(r6)
            return r0
        L_0x001a:
            r6._state = r8     // Catch:{ all -> 0x005c }
            int r7 = r6.f97758d     // Catch:{ all -> 0x005c }
            r8 = r7 & 1
            if (r8 != 0) goto L_0x0056
            int r7 = r7 + r0
            r6.f97758d = r7     // Catch:{ all -> 0x005c }
            hf1.c[] r8 = r6.mo95704l()     // Catch:{ all -> 0x005c }
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x005c }
            monitor-exit(r6)
        L_0x002c:
            kotlinx.coroutines.flow.u[] r8 = (kotlinx.coroutines.flow.C41582u[]) r8
            if (r8 == 0) goto L_0x003e
            int r2 = r8.length
            r3 = r1
        L_0x0032:
            if (r3 >= r2) goto L_0x003e
            r4 = r8[r3]
            if (r4 == 0) goto L_0x003b
            r4.mo96349f()
        L_0x003b:
            int r3 = r3 + 1
            goto L_0x0032
        L_0x003e:
            monitor-enter(r6)
            int r8 = r6.f97758d     // Catch:{ all -> 0x0053 }
            if (r8 != r7) goto L_0x0048
            int r7 = r7 + r0
            r6.f97758d = r7     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)
            return r0
        L_0x0048:
            hf1.c[] r7 = r6.mo95704l()     // Catch:{ all -> 0x0053 }
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x0053 }
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x002c
        L_0x0053:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0056:
            int r7 = r7 + 2
            r6.f97758d = r7     // Catch:{ all -> 0x005c }
            monitor-exit(r6)
            return r0
        L_0x005c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C41579s.m120600o(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlinx.coroutines.flow.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlinx.coroutines.flow.s} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a3 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b6 A[Catch:{ all -> 0x0072 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b7 A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00be A[Catch:{ all -> 0x0072 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo95707a(kotlinx.coroutines.flow.C41557b r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.C41579s.C41580a
            if (r0 == 0) goto L_0x0013
            r0 = r12
            kotlinx.coroutines.flow.s$a r0 = (kotlinx.coroutines.flow.C41579s.C41580a) r0
            int r1 = r0.f97766n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f97766n = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.s$a r0 = new kotlinx.coroutines.flow.s$a
            r0.<init>(r10, r12)
        L_0x0018:
            java.lang.Object r12 = r0.f97764l
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f97766n
            r3 = 0
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0074
            r11 = 1
            if (r2 == r11) goto L_0x0060
            if (r2 == r5) goto L_0x004a
            if (r2 != r4) goto L_0x0042
            java.lang.Object r11 = r0.f97763k
            java.lang.Object r2 = r0.f97762j
            ef1.o1 r2 = (ef1.C40845o1) r2
            java.lang.Object r6 = r0.f97761i
            kotlinx.coroutines.flow.u r6 = (kotlinx.coroutines.flow.C41582u) r6
            java.lang.Object r7 = r0.f97760h
            kotlinx.coroutines.flow.b r7 = (kotlinx.coroutines.flow.C41557b) r7
            java.lang.Object r8 = r0.f97759g
            kotlinx.coroutines.flow.s r8 = (kotlinx.coroutines.flow.C41579s) r8
            he1.C41228o.m119483b(r12)     // Catch:{ all -> 0x0072 }
            goto L_0x008e
        L_0x0042:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x004a:
            java.lang.Object r11 = r0.f97763k
            java.lang.Object r2 = r0.f97762j
            ef1.o1 r2 = (ef1.C40845o1) r2
            java.lang.Object r6 = r0.f97761i
            kotlinx.coroutines.flow.u r6 = (kotlinx.coroutines.flow.C41582u) r6
            java.lang.Object r7 = r0.f97760h
            kotlinx.coroutines.flow.b r7 = (kotlinx.coroutines.flow.C41557b) r7
            java.lang.Object r8 = r0.f97759g
            kotlinx.coroutines.flow.s r8 = (kotlinx.coroutines.flow.C41579s) r8
            he1.C41228o.m119483b(r12)     // Catch:{ all -> 0x0072 }
            goto L_0x00b8
        L_0x0060:
            java.lang.Object r11 = r0.f97761i
            r6 = r11
            kotlinx.coroutines.flow.u r6 = (kotlinx.coroutines.flow.C41582u) r6
            java.lang.Object r11 = r0.f97760h
            kotlinx.coroutines.flow.b r11 = (kotlinx.coroutines.flow.C41557b) r11
            java.lang.Object r2 = r0.f97759g
            r8 = r2
            kotlinx.coroutines.flow.s r8 = (kotlinx.coroutines.flow.C41579s) r8
            he1.C41228o.m119483b(r12)     // Catch:{ all -> 0x0072 }
            goto L_0x007f
        L_0x0072:
            r11 = move-exception
            goto L_0x00d1
        L_0x0074:
            he1.C41228o.m119483b(r12)
            hf1.c r12 = r10.mo95699g()
            kotlinx.coroutines.flow.u r12 = (kotlinx.coroutines.flow.C41582u) r12
            r8 = r10
            r6 = r12
        L_0x007f:
            me1.f r12 = r0.mo94380b()     // Catch:{ all -> 0x0072 }
            ef1.o1$b r2 = ef1.C40845o1.f96561d3     // Catch:{ all -> 0x0072 }
            me1.f$b r12 = r12.mo23736c(r2)     // Catch:{ all -> 0x0072 }
            ef1.o1 r12 = (ef1.C40845o1) r12     // Catch:{ all -> 0x0072 }
            r7 = r11
            r2 = r12
            r11 = r3
        L_0x008e:
            java.lang.Object r12 = r8._state     // Catch:{ all -> 0x0072 }
            if (r2 == 0) goto L_0x0095
            ef1.C40859r1.m118443f(r2)     // Catch:{ all -> 0x0072 }
        L_0x0095:
            if (r11 == 0) goto L_0x009d
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r11, r12)     // Catch:{ all -> 0x0072 }
            if (r9 != 0) goto L_0x00b8
        L_0x009d:
            kotlinx.coroutines.internal.a0 r11 = hf1.C41258k.f97266a     // Catch:{ all -> 0x0072 }
            if (r12 != r11) goto L_0x00a3
            r11 = r3
            goto L_0x00a4
        L_0x00a3:
            r11 = r12
        L_0x00a4:
            r0.f97759g = r8     // Catch:{ all -> 0x0072 }
            r0.f97760h = r7     // Catch:{ all -> 0x0072 }
            r0.f97761i = r6     // Catch:{ all -> 0x0072 }
            r0.f97762j = r2     // Catch:{ all -> 0x0072 }
            r0.f97763k = r12     // Catch:{ all -> 0x0072 }
            r0.f97766n = r5     // Catch:{ all -> 0x0072 }
            java.lang.Object r11 = r7.mo95721b(r11, r0)     // Catch:{ all -> 0x0072 }
            if (r11 != r1) goto L_0x00b7
            return r1
        L_0x00b7:
            r11 = r12
        L_0x00b8:
            boolean r12 = r6.mo96350g()     // Catch:{ all -> 0x0072 }
            if (r12 != 0) goto L_0x008e
            r0.f97759g = r8     // Catch:{ all -> 0x0072 }
            r0.f97760h = r7     // Catch:{ all -> 0x0072 }
            r0.f97761i = r6     // Catch:{ all -> 0x0072 }
            r0.f97762j = r2     // Catch:{ all -> 0x0072 }
            r0.f97763k = r11     // Catch:{ all -> 0x0072 }
            r0.f97766n = r4     // Catch:{ all -> 0x0072 }
            java.lang.Object r12 = r6.mo96347d(r0)     // Catch:{ all -> 0x0072 }
            if (r12 != r1) goto L_0x008e
            return r1
        L_0x00d1:
            r8.mo95702j(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C41579s.mo95707a(kotlinx.coroutines.flow.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public Object mo95721b(Object obj, Continuation continuation) {
        setValue(obj);
        return C41238w.f97225a;
    }

    /* renamed from: c */
    public boolean mo96335c(Object obj) {
        setValue(obj);
        return true;
    }

    /* renamed from: d */
    public C41556a mo95708d(C41752f fVar, int i, C41097e eVar) {
        return C41581t.m120613d(this, fVar, i, eVar);
    }

    public Object getValue() {
        C41584a0 a0Var = C41258k.f97266a;
        Object obj = this._state;
        if (obj == a0Var) {
            return null;
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C41582u mo95700h() {
        return new C41582u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public C41582u[] mo95701i(int i) {
        return new C41582u[i];
    }

    public void setValue(Object obj) {
        if (obj == null) {
            obj = C41258k.f97266a;
        }
        m120600o((Object) null, obj);
    }
}
