package p326y8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y8.c */
public final class C9104c {

    /* renamed from: a */
    private final String f25267a;

    /* renamed from: b */
    private final Set f25268b;

    /* renamed from: c */
    private final Set f25269c;

    /* renamed from: d */
    private final int f25270d;

    /* renamed from: e */
    private final int f25271e;

    /* renamed from: f */
    private final C9116h f25272f;

    /* renamed from: g */
    private final Set f25273g;

    /* renamed from: c */
    public static C9106b m33561c(Class cls) {
        return new C9106b(cls, new Class[0]);
    }

    /* renamed from: d */
    public static C9106b m33562d(Class cls, Class... clsArr) {
        return new C9106b(cls, clsArr);
    }

    /* renamed from: e */
    public static C9106b m33563e(C9102b0 b0Var) {
        return new C9106b(b0Var, new C9102b0[0]);
    }

    /* renamed from: f */
    public static C9106b m33564f(C9102b0 b0Var, C9102b0... b0VarArr) {
        return new C9106b(b0Var, b0VarArr);
    }

    /* renamed from: l */
    public static C9104c m33565l(Object obj, Class cls) {
        return m33566m(cls).mo24666f(new C9099a(obj)).mo24664d();
    }

    /* renamed from: m */
    public static C9106b m33566m(Class cls) {
        return m33561c(cls).m33580g();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Object m33567q(Object obj, C9110e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ Object m33568r(Object obj, C9110e eVar) {
        return obj;
    }

    /* renamed from: s */
    public static C9104c m33569s(Object obj, Class cls, Class... clsArr) {
        return m33562d(cls, clsArr).mo24666f(new C9101b(obj)).mo24664d();
    }

    /* renamed from: g */
    public Set mo24652g() {
        return this.f25269c;
    }

    /* renamed from: h */
    public C9116h mo24653h() {
        return this.f25272f;
    }

    /* renamed from: i */
    public String mo24654i() {
        return this.f25267a;
    }

    /* renamed from: j */
    public Set mo24655j() {
        return this.f25268b;
    }

    /* renamed from: k */
    public Set mo24656k() {
        return this.f25273g;
    }

    /* renamed from: n */
    public boolean mo24657n() {
        return this.f25270d == 1;
    }

    /* renamed from: o */
    public boolean mo24658o() {
        return this.f25270d == 2;
    }

    /* renamed from: p */
    public boolean mo24659p() {
        return this.f25271e == 0;
    }

    /* renamed from: t */
    public C9104c mo24660t(C9116h hVar) {
        return new C9104c(this.f25267a, this.f25268b, this.f25269c, this.f25270d, this.f25271e, hVar, this.f25273g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f25268b.toArray()) + ">{" + this.f25270d + ", type=" + this.f25271e + ", deps=" + Arrays.toString(this.f25269c.toArray()) + "}";
    }

    /* renamed from: y8.c$b */
    public static class C9106b {

        /* renamed from: a */
        private String f25274a;

        /* renamed from: b */
        private final Set f25275b;

        /* renamed from: c */
        private final Set f25276c;

        /* renamed from: d */
        private int f25277d;

        /* renamed from: e */
        private int f25278e;

        /* renamed from: f */
        private C9116h f25279f;

        /* renamed from: g */
        private final Set f25280g;

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C9106b m33580g() {
            this.f25278e = 1;
            return this;
        }

        /* renamed from: i */
        private C9106b m33581i(int i) {
            boolean z;
            if (this.f25277d == 0) {
                z = true;
            } else {
                z = false;
            }
            C9100a0.m33555d(z, "Instantiation type has already been set.");
            this.f25277d = i;
            return this;
        }

        /* renamed from: j */
        private void m33582j(C9102b0 b0Var) {
            C9100a0.m33552a(!this.f25275b.contains(b0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C9106b mo24662b(C9131r rVar) {
            C9100a0.m33554c(rVar, "Null dependency");
            m33582j(rVar.mo24697c());
            this.f25276c.add(rVar);
            return this;
        }

        /* renamed from: c */
        public C9106b mo24663c() {
            return m33581i(1);
        }

        /* renamed from: d */
        public C9104c mo24664d() {
            boolean z;
            if (this.f25279f != null) {
                z = true;
            } else {
                z = false;
            }
            C9100a0.m33555d(z, "Missing required property: factory.");
            return new C9104c(this.f25274a, new HashSet(this.f25275b), new HashSet(this.f25276c), this.f25277d, this.f25278e, this.f25279f, this.f25280g);
        }

        /* renamed from: e */
        public C9106b mo24665e() {
            return m33581i(2);
        }

        /* renamed from: f */
        public C9106b mo24666f(C9116h hVar) {
            this.f25279f = (C9116h) C9100a0.m33554c(hVar, "Null factory");
            return this;
        }

        /* renamed from: h */
        public C9106b mo24667h(String str) {
            this.f25274a = str;
            return this;
        }

        private C9106b(Class cls, Class... clsArr) {
            this.f25274a = null;
            HashSet hashSet = new HashSet();
            this.f25275b = hashSet;
            this.f25276c = new HashSet();
            this.f25277d = 0;
            this.f25278e = 0;
            this.f25280g = new HashSet();
            C9100a0.m33554c(cls, "Null interface");
            hashSet.add(C9102b0.m33558b(cls));
            for (Class cls2 : clsArr) {
                C9100a0.m33554c(cls2, "Null interface");
                this.f25275b.add(C9102b0.m33558b(cls2));
            }
        }

        private C9106b(C9102b0 b0Var, C9102b0... b0VarArr) {
            this.f25274a = null;
            HashSet hashSet = new HashSet();
            this.f25275b = hashSet;
            this.f25276c = new HashSet();
            this.f25277d = 0;
            this.f25278e = 0;
            this.f25280g = new HashSet();
            C9100a0.m33554c(b0Var, "Null interface");
            hashSet.add(b0Var);
            for (C9102b0 c : b0VarArr) {
                C9100a0.m33554c(c, "Null interface");
            }
            Collections.addAll(this.f25275b, b0VarArr);
        }
    }

    private C9104c(String str, Set set, Set set2, int i, int i2, C9116h hVar, Set set3) {
        this.f25267a = str;
        this.f25268b = Collections.unmodifiableSet(set);
        this.f25269c = Collections.unmodifiableSet(set2);
        this.f25270d = i;
        this.f25271e = i2;
        this.f25272f = hVar;
        this.f25273g = Collections.unmodifiableSet(set3);
    }
}
