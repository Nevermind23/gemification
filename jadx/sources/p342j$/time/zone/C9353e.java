package p342j$.time.zone;

import java.security.PrivilegedAction;
import java.util.List;

/* renamed from: j$.time.zone.e */
final class C9353e implements PrivilegedAction {

    /* renamed from: a */
    final /* synthetic */ List f25917a;

    C9353e(List list) {
        this.f25917a = list;
    }

    public final Object run() {
        Class<C9355g> cls = C9355g.class;
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                C9355g cast = cls.cast(Class.forName(property, true, cls.getClassLoader()).newInstance());
                C9355g.m34560d(cast);
                this.f25917a.add(cast);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        } else {
            C9355g.m34560d(new C9354f());
            return null;
        }
    }
}
