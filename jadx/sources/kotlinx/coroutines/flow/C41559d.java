package kotlinx.coroutines.flow;

import gf1.C41115s;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import oe1.C41853d;

/* renamed from: kotlinx.coroutines.flow.d */
abstract /* synthetic */ class C41559d {

    /* renamed from: kotlinx.coroutines.flow.d$a */
    static final class C41560a extends C41853d {

        /* renamed from: g */
        Object f97721g;

        /* renamed from: h */
        Object f97722h;

        /* renamed from: i */
        boolean f97723i;

        /* renamed from: j */
        /* synthetic */ Object f97724j;

        /* renamed from: k */
        int f97725k;

        C41560a(Continuation continuation) {
            super(continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f97724j = obj;
            this.f97725k |= Integer.MIN_VALUE;
            return C41559d.m120526c((C41557b) null, (C41115s) null, false, this);
        }
    }

    /* renamed from: b */
    public static final Object m120525b(C41557b bVar, C41115s sVar, Continuation continuation) {
        Object c = m120526c(bVar, sVar, true, continuation);
        return c == C41793d.m121157c() ? c : C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0084 A[SYNTHETIC, Splitter:B:35:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[Catch:{ all -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m120526c(kotlinx.coroutines.flow.C41557b r6, gf1.C41115s r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.C41559d.C41560a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            kotlinx.coroutines.flow.d$a r0 = (kotlinx.coroutines.flow.C41559d.C41560a) r0
            int r1 = r0.f97725k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f97725k = r1
            goto L_0x0018
        L_0x0013:
            kotlinx.coroutines.flow.d$a r0 = new kotlinx.coroutines.flow.d$a
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f97724j
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f97725k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0057
            if (r2 == r4) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            boolean r6 = r0.f97723i
            java.lang.Object r7 = r0.f97722h
            gf1.s r7 = (gf1.C41115s) r7
            java.lang.Object r8 = r0.f97721g
            kotlinx.coroutines.flow.b r8 = (kotlinx.coroutines.flow.C41557b) r8
            he1.C41228o.m119483b(r9)     // Catch:{ all -> 0x0055 }
        L_0x0035:
            r5 = r8
            r8 = r6
            r6 = r5
            goto L_0x005d
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            boolean r6 = r0.f97723i
            java.lang.Object r7 = r0.f97722h
            gf1.s r7 = (gf1.C41115s) r7
            java.lang.Object r8 = r0.f97721g
            kotlinx.coroutines.flow.b r8 = (kotlinx.coroutines.flow.C41557b) r8
            he1.C41228o.m119483b(r9)     // Catch:{ all -> 0x0055 }
            gf1.i r9 = (gf1.C41102i) r9     // Catch:{ all -> 0x0055 }
            java.lang.Object r9 = r9.mo95537i()     // Catch:{ all -> 0x0055 }
            goto L_0x006f
        L_0x0055:
            r8 = move-exception
            goto L_0x009c
        L_0x0057:
            he1.C41228o.m119483b(r9)
            kotlinx.coroutines.flow.C41558c.m120521h(r6)
        L_0x005d:
            r0.f97721g = r6     // Catch:{ all -> 0x0098 }
            r0.f97722h = r7     // Catch:{ all -> 0x0098 }
            r0.f97723i = r8     // Catch:{ all -> 0x0098 }
            r0.f97725k = r4     // Catch:{ all -> 0x0098 }
            java.lang.Object r9 = r7.mo95505j(r0)     // Catch:{ all -> 0x0098 }
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x006f:
            boolean r2 = gf1.C41102i.m119155g(r9)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0085
            java.lang.Throwable r8 = gf1.C41102i.m119152d(r9)     // Catch:{ all -> 0x0055 }
            if (r8 != 0) goto L_0x0084
            if (r6 == 0) goto L_0x0081
            r6 = 0
            gf1.C41106j.m119160a(r7, r6)
        L_0x0081:
            he1.w r6 = he1.C41238w.f97225a
            return r6
        L_0x0084:
            throw r8     // Catch:{ all -> 0x0055 }
        L_0x0085:
            java.lang.Object r9 = gf1.C41102i.m119153e(r9)     // Catch:{ all -> 0x0055 }
            r0.f97721g = r8     // Catch:{ all -> 0x0055 }
            r0.f97722h = r7     // Catch:{ all -> 0x0055 }
            r0.f97723i = r6     // Catch:{ all -> 0x0055 }
            r0.f97725k = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r9 = r8.mo95721b(r9, r0)     // Catch:{ all -> 0x0055 }
            if (r9 != r1) goto L_0x0035
            return r1
        L_0x0098:
            r6 = move-exception
            r5 = r8
            r8 = r6
            r6 = r5
        L_0x009c:
            throw r8     // Catch:{ all -> 0x009d }
        L_0x009d:
            r9 = move-exception
            if (r6 == 0) goto L_0x00a3
            gf1.C41106j.m119160a(r7, r8)
        L_0x00a3:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C41559d.m120526c(kotlinx.coroutines.flow.b, gf1.s, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
