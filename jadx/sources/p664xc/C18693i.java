package p664xc;

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

/* renamed from: xc.i */
public final class C18693i extends C1613n0 {

    /* renamed from: h */
    public static final C18694a f52332h = new C18694a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9786e f52333d;

    /* renamed from: e */
    private final C1644x f52334e = new C1644x(Integer.valueOf(C16345c.f46180b));

    /* renamed from: f */
    private final C1644x f52335f = new C1644x(new C41224m("", 0));

    /* renamed from: g */
    private final C1644x f52336g = new C1644x(0);

    /* renamed from: xc.i$a */
    public static final class C18694a {
        private C18694a() {
        }

        public /* synthetic */ C18694a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: xc.i$b */
    public /* synthetic */ class C18695b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52337a;

        static {
            int[] iArr = new int[C9801k.values().length];
            iArr[C9801k.SUCCESS.ordinal()] = 1;
            iArr[C9801k.FAIL.ordinal()] = 2;
            iArr[C9801k.NO_CONNECTION.ordinal()] = 3;
            iArr[C9801k.SESSION_ENDED.ordinal()] = 4;
            f52337a = iArr;
        }
    }

    /* renamed from: xc.i$c */
    static final class C18696c extends C41853d {

        /* renamed from: g */
        Object f52338g;

        /* renamed from: h */
        Object f52339h;

        /* renamed from: i */
        /* synthetic */ Object f52340i;

        /* renamed from: j */
        final /* synthetic */ C18693i f52341j;

        /* renamed from: k */
        int f52342k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18696c(C18693i iVar, Continuation continuation) {
            super(continuation);
            this.f52341j = iVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f52340i = obj;
            this.f52342k |= Integer.MIN_VALUE;
            return this.f52341j.m63331kw((Context) null, (Bitmap) null, 0, 0, this);
        }
    }

    /* renamed from: xc.i$d */
    static final class C18697d extends C41853d {

        /* renamed from: g */
        Object f52343g;

        /* renamed from: h */
        Object f52344h;

        /* renamed from: i */
        Object f52345i;

        /* renamed from: j */
        Object f52346j;

        /* renamed from: k */
        int f52347k;

        /* renamed from: l */
        int f52348l;

        /* renamed from: m */
        /* synthetic */ Object f52349m;

        /* renamed from: n */
        final /* synthetic */ C18693i f52350n;

        /* renamed from: o */
        int f52351o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18697d(C18693i iVar, Continuation continuation) {
            super(continuation);
            this.f52350n = iVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f52349m = obj;
            this.f52351o |= Integer.MIN_VALUE;
            return this.f52350n.mo46509lw((Context) null, (Bitmap) null, 0, 0, this);
        }
    }

    public C18693i(C9786e eVar) {
        C41536l.m120489i(eVar, "api");
        this.f52333d = eVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r1 == null) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* renamed from: kw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object m63331kw(android.content.Context r17, android.graphics.Bitmap r18, int r19, int r20, kotlin.coroutines.Continuation r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof p664xc.C18693i.C18696c
            if (r2 == 0) goto L_0x0017
            r2 = r1
            xc.i$c r2 = (p664xc.C18693i.C18696c) r2
            int r3 = r2.f52342k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f52342k = r3
            goto L_0x001c
        L_0x0017:
            xc.i$c r2 = new xc.i$c
            r2.<init>(r0, r1)
        L_0x001c:
            r11 = r2
            java.lang.Object r1 = r11.f52340i
            java.lang.Object r2 = ne1.C41793d.m121157c()
            int r3 = r11.f52342k
            r12 = 32
            java.lang.String r13 = "identomat_"
            r14 = 1
            if (r3 == 0) goto L_0x0043
            if (r3 != r14) goto L_0x003b
            java.lang.Object r2 = r11.f52339h
            java.io.File r2 = (java.io.File) r2
            java.lang.Object r3 = r11.f52338g
            xc.i r3 = (p664xc.C18693i) r3
            he1.C41228o.m119483b(r1)
            goto L_0x00cb
        L_0x003b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0043:
            he1.C41228o.m119483b(r1)
            int r1 = r18.getWidth()
            r3 = 1500(0x5dc, float:2.102E-42)
            if (r1 <= r3) goto L_0x0059
            dd.b r1 = p388dd.C12074b.f35484a
            r4 = r18
            android.graphics.Bitmap r1 = r1.mo32223e(r4, r3)
            if (r1 != 0) goto L_0x005c
            goto L_0x005b
        L_0x0059:
            r4 = r18
        L_0x005b:
            r1 = r4
        L_0x005c:
            dd.b r3 = p388dd.C12074b.f35484a
            r4 = 100
            r5 = r17
            java.io.File r15 = r3.mo32220b(r5, r1, r4)
            if (r15 != 0) goto L_0x0076
            ad.j r1 = new ad.j
            ad.k r4 = p345ad.C9801k.FAIL
            java.lang.String r5 = ""
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x0076:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "sendImage: file size: "
            r3.append(r4)
            long r6 = r15.length()
            r4 = 1024(0x400, float:1.435E-42)
            long r8 = (long) r4
            long r6 = r6 / r8
            r3.append(r6)
            java.lang.String r4 = " size :  "
            r3.append(r4)
            int r4 = r1.getWidth()
            r3.append(r4)
            r3.append(r12)
            int r4 = r1.getHeight()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.i(r13, r3)
            ad.e r3 = r16.mo46504fw()
            int r6 = r1.getWidth()
            int r7 = r1.getHeight()
            r10 = 0
            r11.f52338g = r0
            r11.f52339h = r15
            r11.f52342k = r14
            r4 = r17
            r5 = r15
            r8 = r19
            r9 = r20
            java.lang.Object r1 = r3.mo26260w(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 != r2) goto L_0x00c9
            return r2
        L_0x00c9:
            r3 = r0
            r2 = r15
        L_0x00cb:
            ad.j r1 = (p345ad.C9800j) r1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "sendImage: "
            r4.append(r5)
            ad.k r5 = r1.mo26295c()
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = r1.mo26294b()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r13, r4)
            r2.delete()
            java.lang.String r2 = r1.mo26294b()
            r4 = 0
            r5 = 0
            java.lang.String r6 = "SESSION_ENDED"
            r7 = 2
            boolean r2 = cf1.C40440x.m117139M(r2, r6, r4, r7, r5)
            if (r2 == 0) goto L_0x010f
            ad.j r1 = new ad.j
            ad.k r9 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r10 = ""
            r11 = 0
            r12 = 4
            r13 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            return r1
        L_0x010f:
            ad.k r2 = r1.mo26295c()
            int[] r4 = p664xc.C18693i.C18695b.f52337a
            int r2 = r2.ordinal()
            r2 = r4[r2]
            if (r2 == r14) goto L_0x0142
            if (r2 == r7) goto L_0x013a
            r4 = 3
            if (r2 == r4) goto L_0x0134
            r3 = 4
            if (r2 == r3) goto L_0x0126
            goto L_0x0154
        L_0x0126:
            ad.j r1 = new ad.j
            ad.k r5 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r6 = ""
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        L_0x0134:
            java.lang.String r2 = "no_connection"
            r3.mo46503ew(r2)
            goto L_0x0154
        L_0x013a:
            java.lang.String r2 = r1.mo26294b()
            r3.mo46503ew(r2)
            goto L_0x0154
        L_0x0142:
            androidx.lifecycle.x r2 = r3.mo46506hw()
            he1.m r3 = new he1.m
            java.lang.String r4 = ""
            java.lang.Integer r5 = oe1.C41851b.m121256c(r7)
            r3.<init>(r4, r5)
            r2.mo4823o(r3)
        L_0x0154:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p664xc.C18693i.m63331kw(android.content.Context, android.graphics.Bitmap, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: ew */
    public final void mo46503ew(String str) {
        Integer num;
        C41536l.m120489i(str, "message");
        this.f52334e.mo4823o(Integer.valueOf(C16345c.f46180b));
        this.f52335f.mo4823o(new C41224m(str, 1));
        C1644x xVar = this.f52336g;
        Integer num2 = (Integer) xVar.mo4814f();
        if (num2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(num2.intValue() + 1);
        }
        xVar.mo4823o(num);
    }

    /* renamed from: fw */
    public final C9786e mo46504fw() {
        return this.f52333d;
    }

    /* renamed from: gw */
    public final C1644x mo46505gw() {
        return this.f52334e;
    }

    /* renamed from: hw */
    public final C1644x mo46506hw() {
        return this.f52335f;
    }

    /* renamed from: iw */
    public final C1644x mo46507iw() {
        return this.f52336g;
    }

    /* renamed from: jw */
    public final void mo46508jw() {
        this.f52336g.mo4823o(0);
        this.f52334e.mo4823o(Integer.valueOf(C16345c.f46180b));
        this.f52335f.mo4823o(new C41224m("", 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* renamed from: lw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo46509lw(android.content.Context r23, android.graphics.Bitmap r24, int r25, int r26, kotlin.coroutines.Continuation r27) {
        /*
            r22 = this;
            r0 = r22
            r7 = r23
            r8 = r24
            r1 = r27
            boolean r2 = r1 instanceof p664xc.C18693i.C18697d
            if (r2 == 0) goto L_0x001b
            r2 = r1
            xc.i$d r2 = (p664xc.C18693i.C18697d) r2
            int r3 = r2.f52351o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f52351o = r3
            goto L_0x0020
        L_0x001b:
            xc.i$d r2 = new xc.i$d
            r2.<init>(r0, r1)
        L_0x0020:
            r9 = r2
            java.lang.Object r1 = r9.f52349m
            java.lang.Object r10 = ne1.C41793d.m121157c()
            int r2 = r9.f52351o
            r11 = 32
            java.lang.String r12 = "identomat_"
            r13 = 2
            r14 = 1
            if (r2 == 0) goto L_0x0061
            if (r2 == r14) goto L_0x0042
            if (r2 != r13) goto L_0x003a
            he1.C41228o.m119483b(r1)
            goto L_0x01a8
        L_0x003a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0042:
            int r2 = r9.f52348l
            int r3 = r9.f52347k
            java.lang.Object r4 = r9.f52346j
            java.io.File r4 = (java.io.File) r4
            java.lang.Object r5 = r9.f52345i
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.Object r6 = r9.f52344h
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r7 = r9.f52343g
            xc.i r7 = (p664xc.C18693i) r7
            he1.C41228o.m119483b(r1)
            r21 = r7
            r7 = r2
            r2 = r3
            r3 = r21
            goto L_0x00f5
        L_0x0061:
            he1.C41228o.m119483b(r1)
            dd.b r1 = p388dd.C12074b.f35484a
            r2 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r2 = r1.mo32223e(r8, r2)
            if (r2 != 0) goto L_0x007c
            ad.j r1 = new ad.j
            ad.k r4 = p345ad.C9801k.FAIL
            java.lang.String r5 = ""
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            return r1
        L_0x007c:
            r3 = 100
            java.io.File r15 = r1.mo32220b(r7, r2, r3)
            if (r15 != 0) goto L_0x0092
            ad.j r7 = new ad.j
            ad.k r2 = p345ad.C9801k.FAIL
            java.lang.String r3 = ""
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "sendImage: file size: "
            r1.append(r2)
            long r2 = r15.length()
            r4 = 1024(0x400, float:1.435E-42)
            long r4 = (long) r4
            long r2 = r2 / r4
            r1.append(r2)
            java.lang.String r2 = " size :  "
            r1.append(r2)
            int r2 = r24.getWidth()
            r1.append(r2)
            r1.append(r11)
            int r2 = r24.getHeight()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r12, r1)
            ad.e r1 = r22.mo46504fw()
            int r4 = r24.getWidth()
            int r5 = r24.getHeight()
            r9.f52343g = r0
            r9.f52344h = r7
            r9.f52345i = r8
            r9.f52346j = r15
            r6 = r25
            r9.f52347k = r6
            r3 = r26
            r9.f52348l = r3
            r9.f52351o = r14
            r2 = r23
            r3 = r15
            r6 = r9
            java.lang.Object r1 = r1.mo26261y(r2, r3, r4, r5, r6)
            if (r1 != r10) goto L_0x00ed
            return r10
        L_0x00ed:
            r2 = r25
            r3 = r0
            r6 = r7
            r5 = r8
            r4 = r15
            r7 = r26
        L_0x00f5:
            ad.j r1 = (p345ad.C9800j) r1
            r4.delete()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            ad.k r8 = r1.mo26295c()
            r4.append(r8)
            r4.append(r11)
            java.lang.String r8 = r1.mo26294b()
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.i(r12, r4)
            java.lang.String r4 = r1.mo26294b()
            java.lang.String r8 = "SESSION_ENDED"
            r11 = 0
            r12 = 0
            boolean r4 = cf1.C40440x.m117139M(r4, r8, r11, r13, r12)
            if (r4 == 0) goto L_0x0136
            ad.j r1 = new ad.j
            ad.k r16 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r17 = ""
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            return r1
        L_0x0136:
            ad.k r4 = r1.mo26295c()
            int[] r8 = p664xc.C18693i.C18695b.f52337a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r14) goto L_0x0169
            if (r4 == r13) goto L_0x0161
            r1 = 3
            if (r4 == r1) goto L_0x015b
            r1 = 4
            if (r4 == r1) goto L_0x014d
            goto L_0x01b0
        L_0x014d:
            ad.j r1 = new ad.j
            ad.k r6 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r7 = ""
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r1
        L_0x015b:
            java.lang.String r1 = "no_connection"
            r3.mo46503ew(r1)
            goto L_0x01b0
        L_0x0161:
            java.lang.String r1 = r1.mo26294b()
            r3.mo46503ew(r1)
            goto L_0x01b0
        L_0x0169:
            java.lang.String r4 = r1.mo26294b()
            java.lang.String r8 = "true"
            boolean r4 = kotlin.jvm.internal.C41536l.m120484d(r4, r8)
            if (r4 == 0) goto L_0x01a9
            androidx.lifecycle.x r1 = r3.mo46506hw()
            he1.m r4 = new he1.m
            java.lang.String r8 = ""
            java.lang.Integer r11 = oe1.C41851b.m121256c(r14)
            r4.<init>(r8, r11)
            r1.mo4823o(r4)
            androidx.lifecycle.x r1 = r3.mo46505gw()
            int r4 = p485kc.C16345c.green_color
            java.lang.Integer r4 = oe1.C41851b.m121256c(r4)
            r1.mo4823o(r4)
            r9.f52343g = r12
            r9.f52344h = r12
            r9.f52345i = r12
            r9.f52346j = r12
            r9.f52351o = r13
            r4 = r6
            r6 = r2
            r8 = r9
            java.lang.Object r1 = r3.m63331kw(r4, r5, r6, r7, r8)
            if (r1 != r10) goto L_0x01a8
            return r10
        L_0x01a8:
            return r1
        L_0x01a9:
            java.lang.String r1 = r1.mo26294b()
            r3.mo46503ew(r1)
        L_0x01b0:
            ad.j r1 = new ad.j
            ad.k r5 = p345ad.C9801k.FAIL
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p664xc.C18693i.mo46509lw(android.content.Context, android.graphics.Bitmap, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
