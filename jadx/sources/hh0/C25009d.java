package hh0;

import ed1.C40762x;
import ih0.C25210c;
import ih0.C25211d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43079p;

/* renamed from: hh0.d */
public final class C25009d {

    /* renamed from: a */
    private final C25017j f64338a;

    /* renamed from: b */
    private final C25011e f64339b;

    /* renamed from: hh0.d$a */
    static final class C25010a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C25010a f64340d = new C25010a();

        C25010a() {
            super(2);
        }

        /* renamed from: a */
        public final C25210c invoke(C25211d dVar, String str) {
            C41536l.m120489i(dVar, "shouldShow");
            C41536l.m120489i(str, "token");
            if (!(!C40439w.m117118v(str))) {
                str = null;
            }
            return new C25210c(dVar, str);
        }
    }

    public C25009d(C25017j jVar, C25011e eVar) {
        C41536l.m120489i(jVar, "showGamificationDialogAtPreLogin");
        C41536l.m120489i(eVar, "getStoredGamificationToken");
        this.f64338a = jVar;
        this.f64339b = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final C25210c m79919c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C25210c) pVar.invoke(obj, obj2);
    }

    /* renamed from: b */
    public final C40762x mo63413b() {
        C40762x T = C40762x.m118154T(this.f64338a.invoke(), this.f64339b.mo63415a(), new C25008c(C25010a.f64340d));
        C41536l.m120488h(T, "zip(\n            showGam…isNotBlank() })\n        }");
        return T;
    }
}
