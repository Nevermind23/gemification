package p624uc;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1644x;
import he1.C41224m;
import he1.C41238w;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe1.C41853d;
import p345ad.C9786e;
import p345ad.C9801k;
import ue1.C43075l;

/* renamed from: uc.s */
public final class C18093s extends C1613n0 {

    /* renamed from: i */
    public static final C18094a f51324i = new C18094a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9786e f51325d;

    /* renamed from: e */
    private final C1644x f51326e = new C1644x(new C41224m("", 0));

    /* renamed from: f */
    private final C1644x f51327f = new C1644x(0);

    /* renamed from: g */
    private final C1644x f51328g = new C1644x(0);

    /* renamed from: h */
    private final C1644x f51329h = new C1644x(Boolean.FALSE);

    /* renamed from: uc.s$a */
    public static final class C18094a {
        private C18094a() {
        }

        public /* synthetic */ C18094a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: uc.s$b */
    public /* synthetic */ class C18095b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f51330a;

        static {
            int[] iArr = new int[C9801k.values().length];
            iArr[C9801k.SUCCESS.ordinal()] = 1;
            iArr[C9801k.NO_CONNECTION.ordinal()] = 2;
            iArr[C9801k.SESSION_ENDED.ordinal()] = 3;
            iArr[C9801k.FAIL.ordinal()] = 4;
            f51330a = iArr;
        }
    }

    /* renamed from: uc.s$c */
    static final class C18096c extends C41853d {

        /* renamed from: g */
        /* synthetic */ Object f51331g;

        /* renamed from: h */
        final /* synthetic */ C18093s f51332h;

        /* renamed from: i */
        int f51333i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18096c(C18093s sVar, Continuation continuation) {
            super(continuation);
            this.f51332h = sVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f51331g = obj;
            this.f51333i |= Integer.MIN_VALUE;
            return this.f51332h.mo45775iw((Context) null, this);
        }
    }

    /* renamed from: uc.s$d */
    static final class C18097d extends C41853d {

        /* renamed from: g */
        Object f51334g;

        /* renamed from: h */
        Object f51335h;

        /* renamed from: i */
        /* synthetic */ Object f51336i;

        /* renamed from: j */
        final /* synthetic */ C18093s f51337j;

        /* renamed from: k */
        int f51338k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18097d(C18093s sVar, Continuation continuation) {
            super(continuation);
            this.f51337j = sVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f51336i = obj;
            this.f51338k |= Integer.MIN_VALUE;
            return this.f51337j.mo45778lw((Context) null, (Bitmap) null, this);
        }
    }

    /* renamed from: uc.s$e */
    static final class C18098e extends C41853d {

        /* renamed from: g */
        Object f51339g;

        /* renamed from: h */
        Object f51340h;

        /* renamed from: i */
        /* synthetic */ Object f51341i;

        /* renamed from: j */
        final /* synthetic */ C18093s f51342j;

        /* renamed from: k */
        int f51343k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18098e(C18093s sVar, Continuation continuation) {
            super(continuation);
            this.f51342j = sVar;
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            this.f51341i = obj;
            this.f51343k |= Integer.MIN_VALUE;
            return this.f51342j.mo45779mw((Context) null, (File) null, false, this);
        }
    }

    /* renamed from: uc.s$f */
    static final class C18099f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18093s f51344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18099f(C18093s sVar) {
            super(1);
            this.f51344d = sVar;
        }

        /* renamed from: a */
        public final void mo45780a(int i) {
            this.f51344d.mo45774hw().mo4823o(Integer.valueOf(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45780a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: uc.s$g */
    static final class C18100g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18093s f51345d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18100g(C18093s sVar) {
            super(1);
            this.f51345d = sVar;
        }

        /* renamed from: a */
        public final void mo45781a(int i) {
            this.f51345d.mo45774hw().mo4823o(Integer.valueOf(i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo45781a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    public C18093s(C9786e eVar) {
        C41536l.m120489i(eVar, "api");
        this.f51325d = eVar;
    }

    /* renamed from: dw */
    public final void mo45770dw(String str) {
        Integer num;
        C41536l.m120489i(str, "message");
        this.f51326e.mo4823o(new C41224m(str, 1));
        C1644x xVar = this.f51327f;
        Integer num2 = (Integer) xVar.mo4814f();
        if (num2 == null) {
            num = null;
        } else {
            num = Integer.valueOf(num2.intValue() + 1);
        }
        xVar.mo4823o(num);
    }

    /* renamed from: ew */
    public final C9786e mo45771ew() {
        return this.f51325d;
    }

    /* renamed from: fw */
    public final C1644x mo45772fw() {
        return this.f51326e;
    }

    /* renamed from: gw */
    public final C1644x mo45773gw() {
        return this.f51327f;
    }

    /* renamed from: hw */
    public final C1644x mo45774hw() {
        return this.f51328g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e A[SYNTHETIC, Splitter:B:27:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: iw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45775iw(android.content.Context r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p624uc.C18093s.C18096c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            uc.s$c r0 = (p624uc.C18093s.C18096c) r0
            int r1 = r0.f51333i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51333i = r1
            goto L_0x0018
        L_0x0013:
            uc.s$c r0 = new uc.s$c
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f51331g
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f51333i
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            he1.C41228o.m119483b(r11)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0031:
            he1.C41228o.m119483b(r11)
            ad.e r11 = r9.mo45771ew()
            r0.f51333i = r3
            java.lang.Object r11 = r11.mo26253n(r10, r0)
            if (r11 != r1) goto L_0x0041
            return r1
        L_0x0041:
            ad.j r11 = (p345ad.C9800j) r11
            ad.k r10 = r11.mo26295c()
            int[] r0 = p624uc.C18093s.C18095b.f51330a
            int r10 = r10.ordinal()
            r10 = r0[r10]
            r0 = 0
            if (r10 == r3) goto L_0x008e
            r11 = 2
            if (r10 == r11) goto L_0x007c
            r11 = 3
            if (r10 == r11) goto L_0x006a
            he1.m r10 = new he1.m
            ad.j r11 = new ad.j
            ad.k r2 = p345ad.C9801k.FAIL
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.<init>(r11, r0)
            return r10
        L_0x006a:
            he1.m r10 = new he1.m
            ad.j r11 = new ad.j
            ad.k r2 = p345ad.C9801k.SESSION_ENDED
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.<init>(r11, r0)
            return r10
        L_0x007c:
            he1.m r10 = new he1.m
            ad.j r11 = new ad.j
            ad.k r2 = p345ad.C9801k.NO_CONNECTION
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.<init>(r11, r0)
            return r10
        L_0x008e:
            org.json.JSONObject r10 = r11.mo26293a()     // Catch:{ Exception -> 0x00f7 }
            if (r10 != 0) goto L_0x0096
            r10 = r0
            goto L_0x00a0
        L_0x0096:
            java.lang.String r1 = "start"
            double r1 = r10.getDouble(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.Double r10 = oe1.C41851b.m121255b(r1)     // Catch:{ Exception -> 0x00f7 }
        L_0x00a0:
            org.json.JSONObject r11 = r11.mo26293a()     // Catch:{ Exception -> 0x00f7 }
            if (r11 != 0) goto L_0x00a8
            r11 = r0
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r1 = "end"
            double r1 = r11.getDouble(r1)     // Catch:{ Exception -> 0x00f7 }
            java.lang.Double r11 = oe1.C41851b.m121255b(r1)     // Catch:{ Exception -> 0x00f7 }
        L_0x00b2:
            if (r10 == 0) goto L_0x00e5
            if (r11 == 0) goto L_0x00e5
            double r1 = r10.doubleValue()     // Catch:{ Exception -> 0x00f7 }
            r10 = 1000(0x3e8, float:1.401E-42)
            double r3 = (double) r10     // Catch:{ Exception -> 0x00f7 }
            double r1 = r1 * r3
            int r10 = (int) r1     // Catch:{ Exception -> 0x00f7 }
            double r1 = r11.doubleValue()     // Catch:{ Exception -> 0x00f7 }
            double r1 = r1 * r3
            int r11 = (int) r1     // Catch:{ Exception -> 0x00f7 }
            int r11 = r11 - r10
            he1.m r1 = new he1.m     // Catch:{ Exception -> 0x00f7 }
            ad.j r8 = new ad.j     // Catch:{ Exception -> 0x00f7 }
            ad.k r3 = p345ad.C9801k.SUCCESS     // Catch:{ Exception -> 0x00f7 }
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00f7 }
            he1.m r2 = new he1.m     // Catch:{ Exception -> 0x00f7 }
            java.lang.Integer r10 = oe1.C41851b.m121256c(r10)     // Catch:{ Exception -> 0x00f7 }
            java.lang.Integer r11 = oe1.C41851b.m121256c(r11)     // Catch:{ Exception -> 0x00f7 }
            r2.<init>(r10, r11)     // Catch:{ Exception -> 0x00f7 }
            r1.<init>(r8, r2)     // Catch:{ Exception -> 0x00f7 }
            return r1
        L_0x00e5:
            he1.m r10 = new he1.m     // Catch:{ Exception -> 0x00f7 }
            ad.j r11 = new ad.j     // Catch:{ Exception -> 0x00f7 }
            ad.k r2 = p345ad.C9801k.FAIL     // Catch:{ Exception -> 0x00f7 }
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00f7 }
            r10.<init>(r11, r0)     // Catch:{ Exception -> 0x00f7 }
            return r10
        L_0x00f7:
            he1.m r10 = new he1.m
            ad.j r11 = new ad.j
            ad.k r2 = p345ad.C9801k.FAIL
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r10.<init>(r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p624uc.C18093s.mo45775iw(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: jw */
    public final C1644x mo45776jw() {
        return this.f51329h;
    }

    /* renamed from: kw */
    public final void mo45777kw() {
        this.f51327f.mo4823o(0);
        this.f51326e.mo4823o(new C41224m("", 0));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: lw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45778lw(android.content.Context r13, android.graphics.Bitmap r14, kotlin.coroutines.Continuation r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof p624uc.C18093s.C18097d
            if (r0 == 0) goto L_0x0013
            r0 = r15
            uc.s$d r0 = (p624uc.C18093s.C18097d) r0
            int r1 = r0.f51338k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51338k = r1
            goto L_0x0018
        L_0x0013:
            uc.s$d r0 = new uc.s$d
            r0.<init>(r12, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f51336i
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f51338k
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r13 = r0.f51335h
            java.io.File r13 = (java.io.File) r13
            java.lang.Object r14 = r0.f51334g
            uc.s r14 = (p624uc.C18093s) r14
            he1.C41228o.m119483b(r15)
            goto L_0x0079
        L_0x0033:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x003b:
            he1.C41228o.m119483b(r15)
            androidx.lifecycle.x r15 = r12.mo45772fw()
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
            ad.e r15 = r12.mo45771ew()
            r0.f51334g = r12
            r0.f51335h = r14
            r0.f51338k = r4
            java.lang.Object r15 = r15.mo26248B(r13, r14, r0)
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
            r2 = 0
            r5 = 2
            boolean r13 = cf1.C40440x.m117139M(r13, r0, r2, r5, r1)
            if (r13 == 0) goto L_0x00bb
            ad.j r13 = new ad.j
            ad.k r7 = p345ad.C9801k.SESSION_ENDED
            r8 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        L_0x00bb:
            ad.k r13 = r15.mo26295c()
            int[] r0 = p624uc.C18093s.C18095b.f51330a
            int r13 = r13.ordinal()
            r13 = r0[r13]
            if (r13 == r4) goto L_0x00ee
            if (r13 == r5) goto L_0x00e8
            r0 = 3
            if (r13 == r0) goto L_0x00da
            r0 = 4
            if (r13 == r0) goto L_0x00d2
            goto L_0x011e
        L_0x00d2:
            java.lang.String r13 = r15.mo26294b()
            r14.mo45770dw(r13)
            goto L_0x011e
        L_0x00da:
            ad.j r13 = new ad.j
            ad.k r1 = p345ad.C9801k.SESSION_ENDED
            java.lang.String r2 = ""
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        L_0x00e8:
            java.lang.String r13 = "no_connection"
            r14.mo45770dw(r13)
            goto L_0x011e
        L_0x00ee:
            java.lang.String r13 = r15.mo26294b()
            java.lang.String r0 = "true"
            boolean r13 = kotlin.jvm.internal.C41536l.m120484d(r13, r0)
            if (r13 == 0) goto L_0x0117
            androidx.lifecycle.x r13 = r14.mo45772fw()
            he1.m r14 = new he1.m
            java.lang.Integer r15 = oe1.C41851b.m121256c(r2)
            r14.<init>(r3, r15)
            r13.mo4823o(r14)
            ad.j r13 = new ad.j
            ad.k r5 = p345ad.C9801k.SUCCESS
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            return r13
        L_0x0117:
            java.lang.String r13 = r15.mo26294b()
            r14.mo45770dw(r13)
        L_0x011e:
            ad.j r13 = new ad.j
            ad.k r1 = p345ad.C9801k.FAIL
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p624uc.C18093s.mo45778lw(android.content.Context, android.graphics.Bitmap, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.io.File} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.io.File} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: mw */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45779mw(android.content.Context r6, java.io.File r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p624uc.C18093s.C18098e
            if (r0 == 0) goto L_0x0013
            r0 = r9
            uc.s$e r0 = (p624uc.C18093s.C18098e) r0
            int r1 = r0.f51343k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f51343k = r1
            goto L_0x0018
        L_0x0013:
            uc.s$e r0 = new uc.s$e
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f51341i
            java.lang.Object r1 = ne1.C41793d.m121157c()
            int r2 = r0.f51343k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r6 = r0.f51340h
            r7 = r6
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r6 = r0.f51339g
            uc.s r6 = (p624uc.C18093s) r6
            he1.C41228o.m119483b(r9)
            goto L_0x008b
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            java.lang.Object r6 = r0.f51340h
            r7 = r6
            java.io.File r7 = (java.io.File) r7
            java.lang.Object r6 = r0.f51339g
            uc.s r6 = (p624uc.C18093s) r6
            he1.C41228o.m119483b(r9)
            goto L_0x0071
        L_0x004a:
            he1.C41228o.m119483b(r9)
            androidx.lifecycle.x r9 = r5.mo45776jw()
            java.lang.Boolean r2 = oe1.C41851b.m121254a(r4)
            r9.mo4823o(r2)
            if (r8 == 0) goto L_0x0074
            ad.e r8 = r5.mo45771ew()
            uc.s$f r9 = new uc.s$f
            r9.<init>(r5)
            r0.f51339g = r5
            r0.f51340h = r7
            r0.f51343k = r4
            java.lang.Object r9 = r8.mo26254o(r6, r7, r9, r0)
            if (r9 != r1) goto L_0x0070
            return r1
        L_0x0070:
            r6 = r5
        L_0x0071:
            ad.j r9 = (p345ad.C9800j) r9
            goto L_0x008d
        L_0x0074:
            ad.e r8 = r5.mo45771ew()
            uc.s$g r9 = new uc.s$g
            r9.<init>(r5)
            r0.f51339g = r5
            r0.f51340h = r7
            r0.f51343k = r3
            java.lang.Object r9 = r8.mo26258t(r6, r7, r9, r0)
            if (r9 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r6 = r5
        L_0x008b:
            ad.j r9 = (p345ad.C9800j) r9
        L_0x008d:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            ad.k r0 = r9.mo26295c()
            r8.append(r0)
            r0 = 32
            r8.append(r0)
            java.lang.String r0 = r9.mo26294b()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.String r0 = "identomat_"
            android.util.Log.i(r0, r8)
            r7.delete()
            androidx.lifecycle.x r6 = r6.mo45776jw()
            r7 = 0
            java.lang.Boolean r7 = oe1.C41851b.m121254a(r7)
            r6.mo4823o(r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p624uc.C18093s.mo45779mw(android.content.Context, java.io.File, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
