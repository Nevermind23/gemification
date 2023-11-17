package de1;

import ae1.C40293a;
import ed1.C40757w;
import java.util.concurrent.Callable;
import vd1.C43124b;
import vd1.C43129d;
import vd1.C43133e;
import vd1.C43144m;
import vd1.C43146n;

/* renamed from: de1.a */
public abstract class C40640a {

    /* renamed from: a */
    static final C40757w f96268a = C40293a.m116711h(new C40648h());

    /* renamed from: b */
    static final C40757w f96269b = C40293a.m116708e(new C40642b());

    /* renamed from: c */
    static final C40757w f96270c = C40293a.m116709f(new C40643c());

    /* renamed from: d */
    static final C40757w f96271d = C43146n.m123765f();

    /* renamed from: e */
    static final C40757w f96272e = C40293a.m116710g(new C40646f());

    /* renamed from: de1.a$a */
    static final class C40641a {

        /* renamed from: a */
        static final C40757w f96273a = new C43124b();
    }

    /* renamed from: de1.a$b */
    static final class C40642b implements Callable {
        C40642b() {
        }

        /* renamed from: a */
        public C40757w call() {
            return C40641a.f96273a;
        }
    }

    /* renamed from: de1.a$c */
    static final class C40643c implements Callable {
        C40643c() {
        }

        /* renamed from: a */
        public C40757w call() {
            return C40644d.f96274a;
        }
    }

    /* renamed from: de1.a$d */
    static final class C40644d {

        /* renamed from: a */
        static final C40757w f96274a = new C43129d();
    }

    /* renamed from: de1.a$e */
    static final class C40645e {

        /* renamed from: a */
        static final C40757w f96275a = new C43133e();
    }

    /* renamed from: de1.a$f */
    static final class C40646f implements Callable {
        C40646f() {
        }

        /* renamed from: a */
        public C40757w call() {
            return C40645e.f96275a;
        }
    }

    /* renamed from: de1.a$g */
    static final class C40647g {

        /* renamed from: a */
        static final C40757w f96276a = new C43144m();
    }

    /* renamed from: de1.a$h */
    static final class C40648h implements Callable {
        C40648h() {
        }

        /* renamed from: a */
        public C40757w call() {
            return C40647g.f96276a;
        }
    }

    /* renamed from: a */
    public static C40757w m117457a() {
        return C40293a.m116721r(f96269b);
    }

    /* renamed from: b */
    public static C40757w m117458b() {
        return C40293a.m116723t(f96270c);
    }

    /* renamed from: c */
    public static C40757w m117459c() {
        return f96271d;
    }
}
