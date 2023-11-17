package p802jv;

import ed1.C40749p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p812kv.C25779b;
import ue1.C43075l;

/* renamed from: jv.j */
public final class C25505j {

    /* renamed from: a */
    private final C25507k f65174a;

    /* renamed from: jv.j$a */
    static final class C25506a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C25506a f65175d = new C25506a();

        C25506a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(List list) {
            C41536l.m120489i(list, "it");
            int i = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ((!((C25779b) it.next()).mo64394l()) && (i = i + 1) < 0) {
                        C41341q.m119916s();
                    }
                }
            }
            return Integer.valueOf(i);
        }
    }

    public C25505j(C25507k kVar) {
        C41536l.m120489i(kVar, "getMoneyRequests");
        this.f65174a = kVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final Integer m80683c(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* renamed from: b */
    public final C40749p mo64055b() {
        C40749p k0 = this.f65174a.mo64057a().mo95026k0(new C25504i(C25506a.f65175d));
        C41536l.m120488h(k0, "getMoneyRequests().map {…tGoingRequest }\n        }");
        return k0;
    }
}
