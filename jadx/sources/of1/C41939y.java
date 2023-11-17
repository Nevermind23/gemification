package of1;

import dg1.C40677c;
import dg1.C40681e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41928u;
import of1.C41937x;
import pf1.C42197d;

/* renamed from: of1.y */
public final class C41939y extends C41872c0 {

    /* renamed from: g */
    public static final C41941b f98580g = new C41941b((DefaultConstructorMarker) null);

    /* renamed from: h */
    public static final C41937x f98581h;

    /* renamed from: i */
    public static final C41937x f98582i;

    /* renamed from: j */
    public static final C41937x f98583j;

    /* renamed from: k */
    public static final C41937x f98584k;

    /* renamed from: l */
    public static final C41937x f98585l;

    /* renamed from: m */
    private static final byte[] f98586m = {58, 32};

    /* renamed from: n */
    private static final byte[] f98587n = {13, 10};

    /* renamed from: o */
    private static final byte[] f98588o = {45, 45};

    /* renamed from: b */
    private final C40681e f98589b;

    /* renamed from: c */
    private final C41937x f98590c;

    /* renamed from: d */
    private final List f98591d;

    /* renamed from: e */
    private final C41937x f98592e;

    /* renamed from: f */
    private long f98593f = -1;

    /* renamed from: of1.y$a */
    public static final class C41940a {

        /* renamed from: a */
        private final C40681e f98594a;

        /* renamed from: b */
        private C41937x f98595b;

        /* renamed from: c */
        private final List f98596c;

        public C41940a() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final C41940a mo97022a(String str, String str2, C41872c0 c0Var) {
            C41536l.m120489i(str, "name");
            C41536l.m120489i(c0Var, "body");
            mo97024c(C41942c.f98597c.mo97031b(str, str2, c0Var));
            return this;
        }

        /* renamed from: b */
        public final C41940a mo97023b(C41928u uVar, C41872c0 c0Var) {
            C41536l.m120489i(c0Var, "body");
            mo97024c(C41942c.f98597c.mo97030a(uVar, c0Var));
            return this;
        }

        /* renamed from: c */
        public final C41940a mo97024c(C41942c cVar) {
            C41536l.m120489i(cVar, "part");
            this.f98596c.add(cVar);
            return this;
        }

        /* renamed from: d */
        public final C41939y mo97025d() {
            if (!this.f98596c.isEmpty()) {
                return new C41939y(this.f98594a, this.f98595b, C42197d.m122527U(this.f98596c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        /* renamed from: e */
        public final C41940a mo97026e(C41937x xVar) {
            C41536l.m120489i(xVar, "type");
            if (C41536l.m120484d(xVar.mo97017i(), "multipart")) {
                this.f98595b = xVar;
                return this;
            }
            throw new IllegalArgumentException(C41536l.m120497q("multipart != ", xVar).toString());
        }

        public C41940a(String str) {
            C41536l.m120489i(str, "boundary");
            this.f98594a = C40681e.f96327g.mo94822c(str);
            this.f98595b = C41939y.f98581h;
            this.f98596c = new ArrayList();
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C41940a(java.lang.String r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L_0x0011
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            L_0x0011:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: of1.C41939y.C41940a.<init>(java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    /* renamed from: of1.y$b */
    public static final class C41941b {
        private C41941b() {
        }

        public /* synthetic */ C41941b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo97027a(StringBuilder sb, String str) {
            C41536l.m120489i(sb, "<this>");
            C41536l.m120489i(str, "key");
            sb.append('\"');
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == 10) {
                    sb.append("%0A");
                } else if (charAt == 13) {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
                i = i2;
            }
            sb.append('\"');
        }
    }

    /* renamed from: of1.y$c */
    public static final class C41942c {

        /* renamed from: c */
        public static final C41943a f98597c = new C41943a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private final C41928u f98598a;

        /* renamed from: b */
        private final C41872c0 f98599b;

        /* renamed from: of1.y$c$a */
        public static final class C41943a {
            private C41943a() {
            }

            public /* synthetic */ C41943a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C41942c mo97030a(C41928u uVar, C41872c0 c0Var) {
                String str;
                boolean z;
                String str2;
                C41536l.m120489i(c0Var, "body");
                if (uVar == null) {
                    str = null;
                } else {
                    str = uVar.mo96925b("Content-Type");
                }
                boolean z2 = true;
                if (str == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (uVar == null) {
                        str2 = null;
                    } else {
                        str2 = uVar.mo96925b("Content-Length");
                    }
                    if (str2 != null) {
                        z2 = false;
                    }
                    if (z2) {
                        return new C41942c(uVar, c0Var, (DefaultConstructorMarker) null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            /* renamed from: b */
            public final C41942c mo97031b(String str, String str2, C41872c0 c0Var) {
                C41536l.m120489i(str, "name");
                C41536l.m120489i(c0Var, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                C41941b bVar = C41939y.f98580g;
                bVar.mo97027a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    bVar.mo97027a(sb, str2);
                }
                String sb2 = sb.toString();
                C41536l.m120488h(sb2, "StringBuilder().apply(builderAction).toString()");
                return mo97030a(new C41928u.C41929a().mo96940e("Content-Disposition", sb2).mo96941f(), c0Var);
            }
        }

        public /* synthetic */ C41942c(C41928u uVar, C41872c0 c0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, c0Var);
        }

        /* renamed from: b */
        public static final C41942c m121727b(String str, String str2, C41872c0 c0Var) {
            return f98597c.mo97031b(str, str2, c0Var);
        }

        /* renamed from: a */
        public final C41872c0 mo97028a() {
            return this.f98599b;
        }

        /* renamed from: c */
        public final C41928u mo97029c() {
            return this.f98598a;
        }

        private C41942c(C41928u uVar, C41872c0 c0Var) {
            this.f98598a = uVar;
            this.f98599b = c0Var;
        }
    }

    static {
        C41937x.C41938a aVar = C41937x.f98573e;
        f98581h = aVar.mo97019a("multipart/mixed");
        f98582i = aVar.mo97019a("multipart/alternative");
        f98583j = aVar.mo97019a("multipart/digest");
        f98584k = aVar.mo97019a("multipart/parallel");
        f98585l = aVar.mo97019a("multipart/form-data");
    }

    public C41939y(C40681e eVar, C41937x xVar, List list) {
        C41536l.m120489i(eVar, "boundaryByteString");
        C41536l.m120489i(xVar, "type");
        C41536l.m120489i(list, "parts");
        this.f98589b = eVar;
        this.f98590c = xVar;
        this.f98591d = list;
        C41937x.C41938a aVar = C41937x.f98573e;
        this.f98592e = aVar.mo97019a(xVar + "; boundary=" + mo97021k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: dg1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: dg1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: dg1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: dg1.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: dg1.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m121716l(dg1.C40677c r14, boolean r15) {
        /*
            r13 = this;
            if (r15 == 0) goto L_0x0009
            dg1.b r14 = new dg1.b
            r14.<init>()
            r0 = r14
            goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            java.util.List r1 = r13.f98591d
            int r1 = r1.size()
            r2 = 0
            r3 = 0
            r5 = r2
        L_0x0014:
            if (r5 >= r1) goto L_0x00b0
            int r6 = r5 + 1
            java.util.List r7 = r13.f98591d
            java.lang.Object r5 = r7.get(r5)
            of1.y$c r5 = (of1.C41939y.C41942c) r5
            of1.u r7 = r5.mo97029c()
            of1.c0 r5 = r5.mo97028a()
            kotlin.jvm.internal.C41536l.m120486f(r14)
            byte[] r8 = f98588o
            r14.mo94770w0(r8)
            dg1.e r8 = r13.f98589b
            r14.mo94717T(r8)
            byte[] r8 = f98587n
            r14.mo94770w0(r8)
            if (r7 == 0) goto L_0x0062
            int r8 = r7.size()
            r9 = r2
        L_0x0041:
            if (r9 >= r8) goto L_0x0062
            int r10 = r9 + 1
            java.lang.String r11 = r7.mo96926c(r9)
            dg1.c r11 = r14.mo94728d0(r11)
            byte[] r12 = f98586m
            dg1.c r11 = r11.mo94770w0(r12)
            java.lang.String r9 = r7.mo96932n(r9)
            dg1.c r9 = r11.mo94728d0(r9)
            byte[] r11 = f98587n
            r9.mo94770w0(r11)
            r9 = r10
            goto L_0x0041
        L_0x0062:
            of1.x r7 = r5.mo21299b()
            if (r7 == 0) goto L_0x007b
            java.lang.String r8 = "Content-Type: "
            dg1.c r8 = r14.mo94728d0(r8)
            java.lang.String r7 = r7.toString()
            dg1.c r7 = r8.mo94728d0(r7)
            byte[] r8 = f98587n
            r7.mo94770w0(r8)
        L_0x007b:
            long r7 = r5.mo21298a()
            r9 = -1
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0095
            java.lang.String r9 = "Content-Length: "
            dg1.c r9 = r14.mo94728d0(r9)
            dg1.c r9 = r9.mo94693C0(r7)
            byte[] r10 = f98587n
            r9.mo94770w0(r10)
            goto L_0x009e
        L_0x0095:
            if (r15 == 0) goto L_0x009e
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r0.mo94724a()
            return r9
        L_0x009e:
            byte[] r9 = f98587n
            r14.mo94770w0(r9)
            if (r15 == 0) goto L_0x00a7
            long r3 = r3 + r7
            goto L_0x00aa
        L_0x00a7:
            r5.mo21300j(r14)
        L_0x00aa:
            r14.mo94770w0(r9)
            r5 = r6
            goto L_0x0014
        L_0x00b0:
            kotlin.jvm.internal.C41536l.m120486f(r14)
            byte[] r1 = f98588o
            r14.mo94770w0(r1)
            dg1.e r2 = r13.f98589b
            r14.mo94717T(r2)
            r14.mo94770w0(r1)
            byte[] r1 = f98587n
            r14.mo94770w0(r1)
            if (r15 == 0) goto L_0x00d2
            kotlin.jvm.internal.C41536l.m120486f(r0)
            long r14 = r0.mo94709M0()
            long r3 = r3 + r14
            r0.mo94724a()
        L_0x00d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: of1.C41939y.m121716l(dg1.c, boolean):long");
    }

    /* renamed from: a */
    public long mo21298a() {
        long j = this.f98593f;
        if (j != -1) {
            return j;
        }
        long l = m121716l((C40677c) null, true);
        this.f98593f = l;
        return l;
    }

    /* renamed from: b */
    public C41937x mo21299b() {
        return this.f98592e;
    }

    /* renamed from: j */
    public void mo21300j(C40677c cVar) {
        C41536l.m120489i(cVar, "sink");
        m121716l(cVar, false);
    }

    /* renamed from: k */
    public final String mo97021k() {
        return this.f98589b.mo94797F();
    }
}
