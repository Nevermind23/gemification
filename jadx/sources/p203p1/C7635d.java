package p203p1;

import android.text.TextUtils;
import androidx.work.C2073m;
import androidx.work.C2079p;
import androidx.work.impl.C2007e0;
import androidx.work.impl.C2039o;
import androidx.work.impl.C2046u;
import androidx.work.impl.C2062x;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.List;

/* renamed from: p1.d */
public class C7635d implements Runnable {

    /* renamed from: f */
    private static final String f22243f = C2073m.m8073i("EnqueueRunnable");

    /* renamed from: d */
    private final C2062x f22244d;

    /* renamed from: e */
    private final C2039o f22245e;

    public C7635d(C2062x xVar) {
        this(xVar, new C2039o());
    }

    /* renamed from: b */
    private static boolean m29062b(C2062x xVar) {
        boolean c = m29063c(xVar.mo6924g(), xVar.mo6923f(), (String[]) C2062x.m8046l(xVar).toArray(new String[0]), xVar.mo6921d(), xVar.mo6919b());
        xVar.mo6927k();
        return c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x015f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m29063c(androidx.work.impl.C2007e0 r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, androidx.work.C1962g r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r5 = r18.mo6828s()
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L_0x0017
            int r8 = r0.length
            if (r8 <= 0) goto L_0x0017
            r8 = r6
            goto L_0x0018
        L_0x0017:
            r8 = r7
        L_0x0018:
            if (r8 == 0) goto L_0x0065
            int r9 = r0.length
            r11 = r6
            r10 = r7
            r12 = r10
            r13 = r12
        L_0x001f:
            if (r10 >= r9) goto L_0x0068
            r14 = r0[r10]
            o1.w r15 = r5.mo6751N()
            o1.v r15 = r15.mo21808i(r14)
            if (r15 != 0) goto L_0x004d
            androidx.work.m r0 = androidx.work.C2073m.m8071e()
            java.lang.String r1 = f22243f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.mo6961c(r1, r2)
            return r7
        L_0x004d:
            androidx.work.w r14 = r15.f21631b
            androidx.work.w r15 = androidx.work.C2093w.SUCCEEDED
            if (r14 != r15) goto L_0x0055
            r15 = r6
            goto L_0x0056
        L_0x0055:
            r15 = r7
        L_0x0056:
            r11 = r11 & r15
            androidx.work.w r15 = androidx.work.C2093w.FAILED
            if (r14 != r15) goto L_0x005d
            r13 = r6
            goto L_0x0062
        L_0x005d:
            androidx.work.w r15 = androidx.work.C2093w.CANCELLED
            if (r14 != r15) goto L_0x0062
            r12 = r6
        L_0x0062:
            int r10 = r10 + 1
            goto L_0x001f
        L_0x0065:
            r11 = r6
            r12 = r7
            r13 = r12
        L_0x0068:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            r9 = r9 ^ r6
            if (r9 == 0) goto L_0x0073
            if (r8 != 0) goto L_0x0073
            r10 = r6
            goto L_0x0074
        L_0x0073:
            r10 = r7
        L_0x0074:
            if (r10 == 0) goto L_0x0152
            o1.w r10 = r5.mo6751N()
            java.util.List r10 = r10.mo21815p(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0152
            androidx.work.g r14 = androidx.work.C1962g.APPEND
            if (r2 == r14) goto L_0x00cf
            androidx.work.g r14 = androidx.work.C1962g.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x008d
            goto L_0x00cf
        L_0x008d:
            androidx.work.g r14 = androidx.work.C1962g.KEEP
            if (r2 != r14) goto L_0x00ac
            java.util.Iterator r2 = r10.iterator()
        L_0x0095:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00ac
            java.lang.Object r14 = r2.next()
            o1.v$b r14 = (p190o1.C7399v.C7401b) r14
            androidx.work.w r14 = r14.f21651b
            androidx.work.w r15 = androidx.work.C2093w.ENQUEUED
            if (r14 == r15) goto L_0x00ab
            androidx.work.w r15 = androidx.work.C2093w.RUNNING
            if (r14 != r15) goto L_0x0095
        L_0x00ab:
            return r7
        L_0x00ac:
            r14 = r18
            p1.c r2 = p203p1.C7629c.m29051c(r1, r14, r7)
            r2.run()
            o1.w r2 = r5.mo6751N()
            java.util.Iterator r10 = r10.iterator()
        L_0x00bd:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x0155
            java.lang.Object r15 = r10.next()
            o1.v$b r15 = (p190o1.C7399v.C7401b) r15
            java.lang.String r15 = r15.f21650a
            r2.mo21800a(r15)
            goto L_0x00bd
        L_0x00cf:
            r14 = r18
            o1.b r8 = r5.mo6746I()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00de:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0119
            java.lang.Object r16 = r10.next()
            r6 = r16
            o1.v$b r6 = (p190o1.C7399v.C7401b) r6
            java.lang.String r7 = r6.f21650a
            boolean r7 = r8.mo21744d(r7)
            if (r7 != 0) goto L_0x0112
            androidx.work.w r7 = r6.f21651b
            r17 = r8
            androidx.work.w r8 = androidx.work.C2093w.SUCCEEDED
            if (r7 != r8) goto L_0x00fe
            r8 = 1
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            r8 = r8 & r11
            androidx.work.w r11 = androidx.work.C2093w.FAILED
            if (r7 != r11) goto L_0x0106
            r13 = 1
            goto L_0x010b
        L_0x0106:
            androidx.work.w r11 = androidx.work.C2093w.CANCELLED
            if (r7 != r11) goto L_0x010b
            r12 = 1
        L_0x010b:
            java.lang.String r6 = r6.f21650a
            r15.add(r6)
            r11 = r8
            goto L_0x0114
        L_0x0112:
            r17 = r8
        L_0x0114:
            r8 = r17
            r6 = 1
            r7 = 0
            goto L_0x00de
        L_0x0119:
            androidx.work.g r6 = androidx.work.C1962g.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0145
            if (r12 != 0) goto L_0x0121
            if (r13 == 0) goto L_0x0145
        L_0x0121:
            o1.w r2 = r5.mo6751N()
            java.util.List r6 = r2.mo21815p(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x012d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013f
            java.lang.Object r7 = r6.next()
            o1.v$b r7 = (p190o1.C7399v.C7401b) r7
            java.lang.String r7 = r7.f21650a
            r2.mo21800a(r7)
            goto L_0x012d
        L_0x013f:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0145:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x0150
            r8 = 1
            goto L_0x0154
        L_0x0150:
            r8 = 0
            goto L_0x0154
        L_0x0152:
            r14 = r18
        L_0x0154:
            r6 = 0
        L_0x0155:
            java.util.Iterator r2 = r19.iterator()
        L_0x0159:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e6
            java.lang.Object r7 = r2.next()
            androidx.work.y r7 = (androidx.work.C2096y) r7
            o1.v r10 = r7.mo6985d()
            if (r8 == 0) goto L_0x0180
            if (r11 != 0) goto L_0x0180
            if (r13 == 0) goto L_0x0174
            androidx.work.w r15 = androidx.work.C2093w.FAILED
            r10.f21631b = r15
            goto L_0x0182
        L_0x0174:
            if (r12 == 0) goto L_0x017b
            androidx.work.w r15 = androidx.work.C2093w.CANCELLED
            r10.f21631b = r15
            goto L_0x0182
        L_0x017b:
            androidx.work.w r15 = androidx.work.C2093w.BLOCKED
            r10.f21631b = r15
            goto L_0x0182
        L_0x0180:
            r10.f21643n = r3
        L_0x0182:
            androidx.work.w r15 = r10.f21631b
            r19 = r2
            androidx.work.w r2 = androidx.work.C2093w.ENQUEUED
            if (r15 != r2) goto L_0x018b
            r6 = 1
        L_0x018b:
            o1.w r2 = r5.mo6751N()
            java.util.List r15 = r18.mo6826q()
            o1.v r10 = p203p1.C7638e.m29070b(r15, r10)
            r2.mo21805f(r10)
            if (r8 == 0) goto L_0x01bd
            int r2 = r0.length
            r10 = 0
        L_0x019e:
            if (r10 >= r2) goto L_0x01bd
            r15 = r0[r10]
            r17 = r0
            o1.a r0 = new o1.a
            r20 = r2
            java.lang.String r2 = r7.mo6983b()
            r0.<init>(r2, r15)
            o1.b r2 = r5.mo6746I()
            r2.mo21743c(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x019e
        L_0x01bd:
            r17 = r0
            o1.a0 r0 = r5.mo6752O()
            java.lang.String r2 = r7.mo6983b()
            java.util.Set r10 = r7.mo6984c()
            r0.mo21740d(r2, r10)
            if (r9 == 0) goto L_0x01e0
            o1.o r0 = r5.mo6749L()
            o1.n r2 = new o1.n
            java.lang.String r7 = r7.mo6983b()
            r2.<init>(r1, r7)
            r0.mo21776a(r2)
        L_0x01e0:
            r2 = r19
            r0 = r17
            goto L_0x0159
        L_0x01e6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p203p1.C7635d.m29063c(androidx.work.impl.e0, java.util.List, java.lang.String[], java.lang.String, androidx.work.g):boolean");
    }

    /* renamed from: e */
    private static boolean m29064e(C2062x xVar) {
        List<C2062x> e = xVar.mo6922e();
        boolean z = false;
        if (e != null) {
            for (C2062x xVar2 : e) {
                if (!xVar2.mo6926j()) {
                    z |= m29064e(xVar2);
                } else {
                    C2073m e2 = C2073m.m8071e();
                    String str = f22243f;
                    e2.mo6966k(str, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.mo6920c()) + ")");
                }
            }
        }
        return m29062b(xVar) | z;
    }

    /* renamed from: a */
    public boolean mo22342a() {
        WorkDatabase s = this.f22244d.mo6924g().mo6828s();
        s.mo23807e();
        try {
            boolean e = m29064e(this.f22244d);
            s.mo23804F();
            return e;
        } finally {
            s.mo23809i();
        }
    }

    /* renamed from: d */
    public C2079p mo22343d() {
        return this.f22245e;
    }

    /* renamed from: f */
    public void mo22344f() {
        C2007e0 g = this.f22244d.mo6924g();
        C2046u.m7981b(g.mo6823l(), g.mo6828s(), g.mo6826q());
    }

    public void run() {
        try {
            if (!this.f22244d.mo6925h()) {
                if (mo22342a()) {
                    C7654r.m29095a(this.f22244d.mo6924g().mo6822k(), RescheduleReceiver.class, true);
                    mo22344f();
                }
                this.f22245e.mo6866a(C2079p.f6230a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f22244d + ")");
        } catch (Throwable th) {
            this.f22245e.mo6866a(new C2079p.C2081b.C2082a(th));
        }
    }

    public C7635d(C2062x xVar, C2039o oVar) {
        this.f22244d = xVar;
        this.f22245e = oVar;
    }
}
