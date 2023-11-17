package p611tc;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1644x;
import he1.C41224m;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41853d;
import p345ad.C9786e;
import p345ad.C9801k;
import p485kc.C16345c;

/* renamed from: tc.j */
public final class C17923j extends C1613n0 {

    /* renamed from: h */
    public static final C17924a f51005h = new C17924a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9786e f51006d;

    /* renamed from: e */
    private final C1644x f51007e = new C1644x(Integer.valueOf(C16345c.f46180b));

    /* renamed from: f */
    private final C1644x f51008f = new C1644x(new C41224m("", 0));

    /* renamed from: g */
    private final C1644x f51009g = new C1644x(0);

    /* renamed from: tc.j$a */
    public static final class C17924a {
        private C17924a() {
        }

        public /* synthetic */ C17924a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: tc.j$b */
    public /* synthetic */ class C17925b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51010a;

        static {
            int[] iArr = new int[C9801k.values().length];
            iArr[C9801k.SUCCESS.ordinal()] = 1;
            iArr[C9801k.FAIL.ordinal()] = 2;
            iArr[C9801k.NO_CONNECTION.ordinal()] = 3;
            iArr[C9801k.SESSION_ENDED.ordinal()] = 4;
            f51010a = iArr;
        }
    }

    /* renamed from: tc.j$c */
    static final class C17926c extends C41853d {

        /* renamed from: g */
        Object f51011g;

        /* renamed from: h */
        Object f51012h;

        /* renamed from: i */
        /* synthetic */ Object f51013i;

        /* renamed from: j */
        final /* synthetic */ C17923j f51014j;

        /* renamed from: k */
        int f51015k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17926c(C17923j jVar, Continuation continuation) {
            super(continuation);
            this.f51014j = jVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f51013i = obj;
            this.f51015k |= Integer.MIN_VALUE;
            return this.f51014j.mo45589iw((Context) null, (Bitmap) null, this);
        }
    }

    public C17923j(C9786e eVar) {
        C41536l.m120489i(eVar, "api");
        this.f51006d = eVar;
    }

    /* renamed from: dw */
    public final C9786e mo45584dw() {
        return this.f51006d;
    }

    /* renamed from: ew */
    public final C1644x mo45585ew() {
        return this.f51007e;
    }

    /* renamed from: fw */
    public final C1644x mo45586fw() {
        return this.f51008f;
    }

    /* renamed from: gw */
    public final C1644x mo45587gw() {
        return this.f51009g;
    }

    /* renamed from: hw */
    public final void mo45588hw() {
        this.f51009g.mo4823o(0);
        this.f51007e.mo4823o(Integer.valueOf(C16345c.f46180b));
        this.f51008f.mo4823o(new C41224m("", 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: iw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45589iw(android.content.Context r13, android.graphics.Bitmap r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p611tc.C17923j.C17926c
            if (r0 == 0) goto L_0x0013
            r0 = r15
            tc.j$c r0 = (p611tc.C17923j.C17926c) r0
            int r1 = r0.f51015k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51015k = r1
            goto L_0x0018
        L_0x0013:
            tc.j$c r0 = new tc.j$c
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f51013i
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f51015k
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r13 = r0.f51012h
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r14 = r0.f51011g
            tc.j r14 = (p611tc.C17923j) r14
            he1.C41228o.m119483b(r15)
            goto L_0x0079
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003b:
            he1.C41228o.m119483b(r15)
            androidx.lifecycle.x r15 = r12.mo45586fw()
            he1.m r2 = new he1.m
            java.lang.Integer r5 = oe1.C41851b.m121256c(r4)
            r2.<init>(r3, r5)
            r15.mo4823o(r2)
            dd.b r15 = p388dd.C12074b.f35484a
            r2 = 100
            java.io.File r14 = r15.mo32220b(r13, r14, r2)
            if (r14 != 0) goto L_0x0066
            ad.j r13 = new ad.j
            ad.k r6 = p345ad.C9801k.FAIL
            java.lang.String r7 = ""
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            return r13
        L_0x0066:
            ad.e r15 = r12.mo45584dw()
            r0.f51011g = r12
            r0.f51012h = r14
            r0.f51015k = r4
            java.lang.Object r15 = r15.mo26247A(r13, r14, r0)
            if (r15 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r13 = r14
            r14 = r12
        L_0x0079:
            ad.j r15 = (p345ad.C9800j) r15
            r13.delete()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "sendImage: "
            r13.append(r0)
            ad.k r0 = r15.mo26295c()
            r13.append(r0)
            r0 = 32
            r13.append(r0)
            java.lang.String r0 = r15.mo26294b()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "identomat_"
            android.util.Log.i(r0, r13)
            java.lang.String r13 = r15.mo26294b()
            java.lang.String r0 = "SESSION_ENDED"
            r1 = 0
            r2 = 2
            r5 = 0
            boolean r13 = cf1.C40440x.m117139M(r13, r0, r1, r2, r5)
            if (r13 == 0) goto L_0x00c1
            ad.j r13 = new ad.j
            ad.k r7 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r8 = ""
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        L_0x00c1:
            ad.k r13 = r15.mo26295c()
            int[] r0 = p611tc.C17923j.C17925b.f51010a
            int r13 = r13.ordinal()
            r13 = r0[r13]
            if (r13 == r4) goto L_0x0128
            if (r13 == r2) goto L_0x0106
            r0 = 3
            if (r13 == r0) goto L_0x00e6
            r14 = 4
            if (r13 == r14) goto L_0x00d8
            goto L_0x0127
        L_0x00d8:
            ad.j r13 = new ad.j
            ad.k r1 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        L_0x00e6:
            androidx.lifecycle.x r13 = r14.mo45585ew()
            int r0 = p485kc.C16345c.f46180b
            java.lang.Integer r0 = oe1.C41851b.m121256c(r0)
            r13.mo4823o(r0)
            androidx.lifecycle.x r13 = r14.mo45586fw()
            he1.m r14 = new he1.m
            java.lang.String r0 = "no_connection"
            java.lang.Integer r1 = oe1.C41851b.m121256c(r4)
            r14.<init>(r0, r1)
            r13.mo4823o(r14)
            goto L_0x0127
        L_0x0106:
            androidx.lifecycle.x r13 = r14.mo45585ew()
            int r0 = p485kc.C16345c.f46180b
            java.lang.Integer r0 = oe1.C41851b.m121256c(r0)
            r13.mo4823o(r0)
            androidx.lifecycle.x r13 = r14.mo45586fw()
            he1.m r14 = new he1.m
            java.lang.String r0 = r15.mo26294b()
            java.lang.Integer r1 = oe1.C41851b.m121256c(r4)
            r14.<init>(r0, r1)
            r13.mo4823o(r14)
        L_0x0127:
            return r15
        L_0x0128:
            java.lang.String r13 = r15.mo26294b()
            java.lang.String r0 = "true"
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r13, r0)
            if (r13 == 0) goto L_0x0152
            androidx.lifecycle.x r13 = r14.mo45586fw()
            he1.m r14 = new he1.m
            java.lang.Integer r15 = oe1.C41851b.m121256c(r2)
            r14.<init>(r3, r15)
            r13.mo4823o(r14)
            ad.j r13 = new ad.j
            ad.k r5 = p345ad.C9801k.SUCCESS
            java.lang.String r6 = ""
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x019d
        L_0x0152:
            androidx.lifecycle.x r13 = r14.mo45585ew()
            int r0 = p485kc.C16345c.f46180b
            java.lang.Integer r0 = oe1.C41851b.m121256c(r0)
            r13.mo4823o(r0)
            androidx.lifecycle.x r13 = r14.mo45586fw()
            he1.m r0 = new he1.m
            java.lang.String r15 = r15.mo26294b()
            java.lang.Integer r1 = oe1.C41851b.m121256c(r4)
            r0.<init>(r15, r1)
            r13.mo4823o(r0)
            androidx.lifecycle.x r13 = r14.mo45587gw()
            androidx.lifecycle.x r14 = r14.mo45587gw()
            java.lang.Object r14 = r14.mo4814f()
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 != 0) goto L_0x0184
            goto L_0x018d
        L_0x0184:
            int r14 = r14.intValue()
            int r14 = r14 + r4
            java.lang.Integer r5 = oe1.C41851b.m121256c(r14)
        L_0x018d:
            r13.mo4823o(r5)
            ad.j r13 = new ad.j
            ad.k r7 = p345ad.C9801k.FAIL
            java.lang.String r8 = ""
            r9 = 0
            r10 = 4
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
        L_0x019d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p611tc.C17923j.mo45589iw(android.content.Context, android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
