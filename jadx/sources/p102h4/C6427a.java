package p102h4;

import android.util.Log;
import androidx.core.util.C1005e;
import androidx.core.util.C1007g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: h4.a */
public abstract class C6427a {

    /* renamed from: a */
    private static final C6434g f19701a = new C6428a();

    /* renamed from: h4.a$a */
    class C6428a implements C6434g {
        C6428a() {
        }

        /* renamed from: a */
        public void mo20306a(Object obj) {
        }
    }

    /* renamed from: h4.a$b */
    class C6429b implements C6431d {
        C6429b() {
        }

        /* renamed from: a */
        public List create() {
            return new ArrayList();
        }
    }

    /* renamed from: h4.a$c */
    class C6430c implements C6434g {
        C6430c() {
        }

        /* renamed from: b */
        public void mo20306a(List list) {
            list.clear();
        }
    }

    /* renamed from: h4.a$d */
    public interface C6431d {
        Object create();
    }

    /* renamed from: h4.a$e */
    private static final class C6432e implements C1005e {

        /* renamed from: a */
        private final C6431d f19702a;

        /* renamed from: b */
        private final C6434g f19703b;

        /* renamed from: c */
        private final C1005e f19704c;

        C6432e(C1005e eVar, C6431d dVar, C6434g gVar) {
            this.f19704c = eVar;
            this.f19702a = dVar;
            this.f19703b = gVar;
        }

        /* renamed from: a */
        public boolean mo3439a(Object obj) {
            if (obj instanceof C6433f) {
                ((C6433f) obj).mo7881c().mo20309b(true);
            }
            this.f19703b.mo20306a(obj);
            return this.f19704c.mo3439a(obj);
        }

        /* renamed from: b */
        public Object mo3440b() {
            Object b = this.f19704c.mo3440b();
            if (b == null) {
                b = this.f19702a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b.getClass());
                }
            }
            if (b instanceof C6433f) {
                ((C6433f) b).mo7881c().mo20309b(false);
            }
            return b;
        }
    }

    /* renamed from: h4.a$f */
    public interface C6433f {
        /* renamed from: c */
        C6436c mo7881c();
    }

    /* renamed from: h4.a$g */
    public interface C6434g {
        /* renamed from: a */
        void mo20306a(Object obj);
    }

    /* renamed from: a */
    private static C1005e m25511a(C1005e eVar, C6431d dVar) {
        return m25512b(eVar, dVar, m25513c());
    }

    /* renamed from: b */
    private static C1005e m25512b(C1005e eVar, C6431d dVar, C6434g gVar) {
        return new C6432e(eVar, dVar, gVar);
    }

    /* renamed from: c */
    private static C6434g m25513c() {
        return f19701a;
    }

    /* renamed from: d */
    public static C1005e m25514d(int i, C6431d dVar) {
        return m25511a(new C1007g(i), dVar);
    }

    /* renamed from: e */
    public static C1005e m25515e() {
        return m25516f(20);
    }

    /* renamed from: f */
    public static C1005e m25516f(int i) {
        return m25512b(new C1007g(i), new C6429b(), new C6430c());
    }
}
