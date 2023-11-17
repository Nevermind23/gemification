package p011aa;

import p011aa.C0089a;
import p011aa.C0093c;

/* renamed from: aa.d */
public abstract class C0095d {

    /* renamed from: a */
    public static C0095d f927a = m262a().mo141a();

    /* renamed from: aa.d$a */
    public static abstract class C0096a {
        /* renamed from: a */
        public abstract C0095d mo141a();

        /* renamed from: b */
        public abstract C0096a mo142b(String str);

        /* renamed from: c */
        public abstract C0096a mo143c(long j);

        /* renamed from: d */
        public abstract C0096a mo144d(String str);

        /* renamed from: e */
        public abstract C0096a mo145e(String str);

        /* renamed from: f */
        public abstract C0096a mo146f(String str);

        /* renamed from: g */
        public abstract C0096a mo147g(C0093c.C0094a aVar);

        /* renamed from: h */
        public abstract C0096a mo148h(long j);
    }

    /* renamed from: a */
    public static C0096a m262a() {
        return new C0089a.C0091b().mo148h(0).mo147g(C0093c.C0094a.ATTEMPT_MIGRATION).mo143c(0);
    }

    /* renamed from: b */
    public abstract String mo130b();

    /* renamed from: c */
    public abstract long mo131c();

    /* renamed from: d */
    public abstract String mo132d();

    /* renamed from: e */
    public abstract String mo133e();

    /* renamed from: f */
    public abstract String mo135f();

    /* renamed from: g */
    public abstract C0093c.C0094a mo136g();

    /* renamed from: h */
    public abstract long mo137h();

    /* renamed from: i */
    public boolean mo153i() {
        return mo136g() == C0093c.C0094a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean mo154j() {
        if (mo136g() == C0093c.C0094a.NOT_GENERATED || mo136g() == C0093c.C0094a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo155k() {
        return mo136g() == C0093c.C0094a.REGISTERED;
    }

    /* renamed from: l */
    public boolean mo156l() {
        return mo136g() == C0093c.C0094a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean mo157m() {
        return mo136g() == C0093c.C0094a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract C0096a mo139n();

    /* renamed from: o */
    public C0095d mo158o(String str, long j, long j2) {
        return mo139n().mo142b(str).mo143c(j).mo148h(j2).mo141a();
    }

    /* renamed from: p */
    public C0095d mo159p() {
        return mo139n().mo142b((String) null).mo141a();
    }

    /* renamed from: q */
    public C0095d mo160q(String str) {
        return mo139n().mo145e(str).mo147g(C0093c.C0094a.REGISTER_ERROR).mo141a();
    }

    /* renamed from: r */
    public C0095d mo161r() {
        return mo139n().mo147g(C0093c.C0094a.NOT_GENERATED).mo141a();
    }

    /* renamed from: s */
    public C0095d mo162s(String str, String str2, long j, String str3, long j2) {
        return mo139n().mo144d(str).mo147g(C0093c.C0094a.REGISTERED).mo142b(str3).mo146f(str2).mo143c(j2).mo148h(j).mo141a();
    }

    /* renamed from: t */
    public C0095d mo163t(String str) {
        return mo139n().mo144d(str).mo147g(C0093c.C0094a.UNREGISTERED).mo141a();
    }
}
