package zh1;

import ci1.C40475w;
import he1.C41238w;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import of1.C41872c0;
import of1.C41884e0;
import zh1.C43455h;

/* renamed from: zh1.a */
final class C43432a extends C43455h.C43456a {

    /* renamed from: a */
    private boolean f101295a = true;

    /* renamed from: zh1.a$a */
    static final class C43433a implements C43455h {

        /* renamed from: a */
        static final C43433a f101296a = new C43433a();

        C43433a() {
        }

        /* renamed from: b */
        public C41884e0 mo94450a(C41884e0 e0Var) {
            try {
                return C43439a0.m124613a(e0Var);
            } finally {
                e0Var.close();
            }
        }
    }

    /* renamed from: zh1.a$b */
    static final class C43434b implements C43455h {

        /* renamed from: a */
        static final C43434b f101297a = new C43434b();

        C43434b() {
        }

        /* renamed from: b */
        public C41872c0 mo94450a(C41872c0 c0Var) {
            return c0Var;
        }
    }

    /* renamed from: zh1.a$c */
    static final class C43435c implements C43455h {

        /* renamed from: a */
        static final C43435c f101298a = new C43435c();

        C43435c() {
        }

        /* renamed from: b */
        public C41884e0 mo94450a(C41884e0 e0Var) {
            return e0Var;
        }
    }

    /* renamed from: zh1.a$d */
    static final class C43436d implements C43455h {

        /* renamed from: a */
        static final C43436d f101299a = new C43436d();

        C43436d() {
        }

        /* renamed from: b */
        public String mo94450a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: zh1.a$e */
    static final class C43437e implements C43455h {

        /* renamed from: a */
        static final C43437e f101300a = new C43437e();

        C43437e() {
        }

        /* renamed from: b */
        public C41238w mo94450a(C41884e0 e0Var) {
            e0Var.close();
            return C41238w.f97225a;
        }
    }

    /* renamed from: zh1.a$f */
    static final class C43438f implements C43455h {

        /* renamed from: a */
        static final C43438f f101301a = new C43438f();

        C43438f() {
        }

        /* renamed from: b */
        public Void mo94450a(C41884e0 e0Var) {
            e0Var.close();
            return null;
        }
    }

    C43432a() {
    }

    /* renamed from: c */
    public C43455h mo94448c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C43511w wVar) {
        if (C41872c0.class.isAssignableFrom(C43439a0.m124620h(type))) {
            return C43434b.f101297a;
        }
        return null;
    }

    /* renamed from: d */
    public C43455h mo94449d(Type type, Annotation[] annotationArr, C43511w wVar) {
        if (type == C41884e0.class) {
            if (C43439a0.m124624l(annotationArr, C40475w.class)) {
                return C43435c.f101298a;
            }
            return C43433a.f101296a;
        } else if (type == Void.class) {
            return C43438f.f101301a;
        } else {
            if (!this.f101295a || type != C41238w.class) {
                return null;
            }
            try {
                return C43437e.f101300a;
            } catch (NoClassDefFoundError unused) {
                this.f101295a = false;
                return null;
            }
        }
    }
}
