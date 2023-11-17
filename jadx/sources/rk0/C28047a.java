package rk0;

import android.app.Application;
import g11.C32041b;
import he1.C41217g;
import he1.C41233s;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import pk0.C27551a;
import pk0.C27594e;
import ue1.C43064a;

/* renamed from: rk0.a */
public final class C28047a {

    /* renamed from: a */
    private final Application f71397a;

    /* renamed from: b */
    private final C41217g f71398b = C41219i.m119470b(C28048a.f71399d);

    /* renamed from: rk0.a$a */
    static final class C28048a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C28048a f71399d = new C28048a();

        C28048a() {
            super(0);
        }

        /* renamed from: b */
        public final Map invoke() {
            return C41344r0.m119933o(C41233s.m119492a(C27551a.C27552a.class.getCanonicalName(), C34646b.m101748b("text.hub.item.banking.products", new Object[0])), C41233s.m119492a(C27551a.C27564c.class.getCanonicalName(), C34646b.m101748b("text.hub.item.nonbanking.products", new Object[0])), C41233s.m119492a(C27551a.C27578f.class.getCanonicalName(), C34646b.m101748b("text.hub.item.transactions", new Object[0])), C41233s.m119492a(C27551a.C27570d.class.getCanonicalName(), C34646b.m101748b("text.hub.item.other", new Object[0])), C41233s.m119492a(C27551a.C27573e.class.getCanonicalName(), C34646b.m101748b("text.hub.item.our.apps", new Object[0])), C41233s.m119492a(C32041b.C32050b.class.getCanonicalName(), C34646b.m101748b("text.settings.security.and.login", new Object[0])), C41233s.m119492a(C32041b.C32042a.class.getCanonicalName(), C34646b.m101748b("text.settings.preference.management", new Object[0])), C41233s.m119492a(C27594e.C27597b.class.getCanonicalName(), C34646b.m101748b("text.hub.item.setting", new Object[0])));
        }
    }

    public C28047a(Application application) {
        C41536l.m120489i(application, "context");
        this.f71397a = application;
    }

    /* renamed from: c */
    private final Map m86454c() {
        return (Map) this.f71398b.getValue();
    }

    /* renamed from: a */
    public final StringSource mo67591a(Class cls) {
        C41536l.m120489i(cls, "clazz");
        return (StringSource) m86454c().get(cls.getCanonicalName());
    }

    /* renamed from: b */
    public final Map mo67592b(String str) {
        C41536l.m120489i(str, "searchWord");
        Map c = m86454c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : c.entrySet()) {
            if (C40440x.m117135K(C34646b.m101751e((StringSource) entry.getValue(), this.f71397a), str, true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
