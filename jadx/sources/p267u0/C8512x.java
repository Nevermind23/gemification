package p267u0;

import ef1.C40814h0;
import ef1.C40839n;
import ef1.C40843o;
import ef1.C40845o1;
import ef1.C40875w;
import he1.C41225n;
import he1.C41228o;
import he1.C41238w;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import me1.C41748d;
import me1.C41752f;
import oe1.C41853d;
import oe1.C41857h;
import oe1.C41862l;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: u0.x */
public abstract class C8512x {

    /* renamed from: u0.x$a */
    static final class C8513a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40845o1 f24198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8513a(C40845o1 o1Var) {
            super(1);
            this.f24198d = o1Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C40845o1.C40846a.m118414a(this.f24198d, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: u0.x$b */
    static final class C8514b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C40839n f24199d;

        /* renamed from: e */
        final /* synthetic */ C40845o1 f24200e;

        /* renamed from: u0.x$b$a */
        static final class C8515a extends C41862l implements C43079p {

            /* renamed from: h */
            int f24201h;

            /* renamed from: i */
            private /* synthetic */ Object f24202i;

            /* renamed from: j */
            final /* synthetic */ C40839n f24203j;

            /* renamed from: k */
            final /* synthetic */ C40845o1 f24204k;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C8515a(C40839n nVar, C40845o1 o1Var, Continuation continuation) {
                super(2, continuation);
                this.f24203j = nVar;
                this.f24204k = o1Var;
            }

            /* renamed from: a */
            public final Continuation mo3708a(Object obj, Continuation continuation) {
                C8515a aVar = new C8515a(this.f24203j, this.f24204k, continuation);
                aVar.f24202i = obj;
                return aVar;
            }

            /* renamed from: f */
            public final Object mo3709f(Object obj) {
                Object c = C41793d.m121157c();
                int i = this.f24201h;
                if (i == 0) {
                    C41228o.m119483b(obj);
                    C40839n nVar = this.f24203j;
                    C41225n.C41226a aVar = C41225n.f97210d;
                    C41752f.C41755b c2 = ((C40814h0) this.f24202i).mo4808Q().mo23736c(C41748d.f98026f3);
                    C41536l.m120486f(c2);
                    nVar.mo94382h(C41225n.m119478a(c2));
                    C40845o1 o1Var = this.f24204k;
                    this.f24201h = 1;
                    if (o1Var.mo95217v(this) == c) {
                        return c;
                    }
                } else if (i == 1) {
                    C41228o.m119483b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C41238w.f97225a;
            }

            /* renamed from: n */
            public final Object invoke(C40814h0 h0Var, Continuation continuation) {
                return ((C8515a) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
            }
        }

        C8514b(C40839n nVar, C40845o1 o1Var) {
            this.f24199d = nVar;
            this.f24200e = o1Var;
        }

        public final void run() {
            Object unused = C40817i.m118308b((C41752f) null, new C8515a(this.f24199d, this.f24200e, (Continuation) null), 1, (Object) null);
        }
    }

    /* renamed from: u0.x$c */
    static final class C8516c extends C41853d {

        /* renamed from: g */
        Object f24205g;

        /* renamed from: h */
        Object f24206h;

        /* renamed from: i */
        /* synthetic */ Object f24207i;

        /* renamed from: j */
        int f24208j;

        C8516c(Continuation continuation) {
            super(continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f24207i = obj;
            this.f24208j |= Integer.MIN_VALUE;
            return C8512x.m31890c((C8503w) null, this);
        }
    }

    /* renamed from: u0.x$d */
    static final class C8517d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40875w f24209d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8517d(C40875w wVar) {
            super(1);
            this.f24209d = wVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C40845o1.C40846a.m118414a(this.f24209d, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: u0.x$e */
    static final class C8518e extends C41853d {

        /* renamed from: g */
        Object f24210g;

        /* renamed from: h */
        Object f24211h;

        /* renamed from: i */
        /* synthetic */ Object f24212i;

        /* renamed from: j */
        int f24213j;

        C8518e(Continuation continuation) {
            super(continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f24212i = obj;
            this.f24213j |= Integer.MIN_VALUE;
            return C8512x.m31891d((C8503w) null, (C43075l) null, this);
        }
    }

    /* renamed from: u0.x$f */
    static final class C8519f extends C41862l implements C43079p {

        /* renamed from: h */
        int f24214h;

        /* renamed from: i */
        private /* synthetic */ Object f24215i;

        /* renamed from: j */
        final /* synthetic */ C8503w f24216j;

        /* renamed from: k */
        final /* synthetic */ C43075l f24217k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8519f(C8503w wVar, C43075l lVar, Continuation continuation) {
            super(2, continuation);
            this.f24216j = wVar;
            this.f24217k = lVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C8519f fVar = new C8519f(this.f24216j, this.f24217k, continuation);
            fVar.f24215i = obj;
            return fVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            C8470f0 f0Var;
            Throwable th;
            Object c = C41793d.m121157c();
            int i = this.f24214h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41752f.C41755b c2 = ((C40814h0) this.f24215i).mo4808Q().mo23736c(C8470f0.f24068g);
                C41536l.m120486f(c2);
                C8470f0 f0Var2 = (C8470f0) c2;
                f0Var2.mo23735b();
                try {
                    this.f24216j.mo23807e();
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    f0Var = f0Var2;
                    th = th3;
                    f0Var.mo23738g();
                    throw th;
                }
                try {
                    C43075l lVar = this.f24217k;
                    this.f24215i = f0Var2;
                    this.f24214h = 1;
                    Object invoke = lVar.invoke(this);
                    if (invoke == c) {
                        return c;
                    }
                    f0Var = f0Var2;
                    obj = invoke;
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    f0Var = f0Var2;
                    th = th5;
                    this.f24216j.mo23809i();
                    throw th;
                }
            } else if (i == 1) {
                f0Var = (C8470f0) this.f24215i;
                try {
                    C41228o.m119483b(obj);
                } catch (Throwable th6) {
                    th = th6;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f24216j.mo23804F();
            try {
                this.f24216j.mo23809i();
                f0Var.mo23738g();
                return obj;
            } catch (Throwable th7) {
                th = th7;
                f0Var.mo23738g();
                throw th;
            }
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C8519f) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: b */
    private static final Object m31889b(Executor executor, C40845o1 o1Var, Continuation continuation) {
        C40843o oVar = new C40843o(C41790c.m121154b(continuation), 1);
        oVar.mo95193C();
        oVar.mo95186i(new C8513a(o1Var));
        try {
            executor.execute(new C8514b(oVar, o1Var));
        } catch (RejectedExecutionException e) {
            oVar.mo95188r(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        Object x = oVar.mo95209x();
        if (x == C41793d.m121157c()) {
            C41857h.m121275c(continuation);
        }
        return x;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m31890c(p267u0.C8503w r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof p267u0.C8512x.C8516c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            u0.x$c r0 = (p267u0.C8512x.C8516c) r0
            int r1 = r0.f24208j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24208j = r1
            goto L_0x0018
        L_0x0013:
            u0.x$c r0 = new u0.x$c
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f24207i
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f24208j
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r6 = r0.f24206h
            ef1.w r6 = (ef1.C40875w) r6
            java.lang.Object r0 = r0.f24205g
            u0.w r0 = (p267u0.C8503w) r0
            he1.C41228o.m119483b(r7)
            goto L_0x006c
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            he1.C41228o.m119483b(r7)
            r7 = 0
            ef1.w r7 = ef1.C40865t1.m118460b(r7, r3, r7)
            me1.f r2 = r0.mo94380b()
            ef1.o1$b r4 = ef1.C40845o1.f96561d3
            me1.f$b r2 = r2.mo23736c(r4)
            ef1.o1 r2 = (ef1.C40845o1) r2
            if (r2 == 0) goto L_0x0057
            u0.x$d r4 = new u0.x$d
            r4.<init>(r7)
            r2.mo95215s(r4)
        L_0x0057:
            java.util.concurrent.Executor r2 = r6.mo23816s()
            r0.f24205g = r6
            r0.f24206h = r7
            r0.f24208j = r3
            java.lang.Object r0 = m31889b(r2, r7, r0)
            if (r0 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L_0x006c:
            me1.d r7 = (me1.C41748d) r7
            u0.f0 r1 = new u0.f0
            r1.<init>(r6, r7)
            java.lang.ThreadLocal r0 = r0.mo23815r()
            int r6 = java.lang.System.identityHashCode(r6)
            java.lang.Integer r6 = oe1.C41851b.m121256c(r6)
            ef1.j2 r6 = ef1.C40830k2.m118328a(r0, r6)
            me1.f r7 = r7.mo23741u(r1)
            me1.f r6 = r7.mo23741u(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p267u0.C8512x.m31890c(u0.w, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: ue1.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b A[PHI: r7 
      PHI: (r7v2 java.lang.Object) = (r7v4 java.lang.Object), (r7v1 java.lang.Object) binds: [B:23:0x0078, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m31891d(p267u0.C8503w r5, ue1.C43075l r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof p267u0.C8512x.C8518e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            u0.x$e r0 = (p267u0.C8512x.C8518e) r0
            int r1 = r0.f24213j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f24213j = r1
            goto L_0x0018
        L_0x0013:
            u0.x$e r0 = new u0.x$e
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f24212i
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f24213j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            he1.C41228o.m119483b(r7)
            goto L_0x007b
        L_0x002c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0034:
            java.lang.Object r5 = r0.f24211h
            r6 = r5
            ue1.l r6 = (ue1.C43075l) r6
            java.lang.Object r5 = r0.f24210g
            u0.w r5 = (p267u0.C8503w) r5
            he1.C41228o.m119483b(r7)
            goto L_0x0066
        L_0x0041:
            he1.C41228o.m119483b(r7)
            me1.f r7 = r0.mo94380b()
            u0.f0$a r2 = p267u0.C8470f0.f24068g
            me1.f$b r7 = r7.mo23736c(r2)
            u0.f0 r7 = (p267u0.C8470f0) r7
            if (r7 == 0) goto L_0x0059
            me1.d r7 = r7.mo23737e()
            if (r7 == 0) goto L_0x0059
            goto L_0x0068
        L_0x0059:
            r0.f24210g = r5
            r0.f24211h = r6
            r0.f24213j = r4
            java.lang.Object r7 = m31890c(r5, r0)
            if (r7 != r1) goto L_0x0066
            return r1
        L_0x0066:
            me1.f r7 = (me1.C41752f) r7
        L_0x0068:
            u0.x$f r2 = new u0.x$f
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.f24210g = r4
            r0.f24211h = r4
            r0.f24213j = r3
            java.lang.Object r7 = ef1.C40813h.m118303e(r7, r2, r0)
            if (r7 != r1) goto L_0x007b
            return r1
        L_0x007b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p267u0.C8512x.m31891d(u0.w, ue1.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
