package r01;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r01.b */
public enum C38273b {
    POPUP(C41339p.m119900e("GC_ATM_TIMEOUT")),
    ERROR_SCREEN(C41341q.m119907j()),
    RESULT_PAGE(C41341q.m119910m("INVALID_CCY", "INVALID_AMOUNT")),
    BANNER(C41341q.m119907j());
    

    /* renamed from: e */
    public static final C38274a f91772e = null;

    /* renamed from: d */
    private final List f91778d;

    /* renamed from: r01.b$a */
    public static final class C38274a {
        private C38274a() {
        }

        public /* synthetic */ C38274a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38273b mo91824a(String str) {
            boolean z;
            if (str != null) {
                for (C38273b bVar : C38273b.values()) {
                    List b = bVar.mo91823b();
                    if (!(b instanceof Collection) || !b.isEmpty()) {
                        Iterator it = b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            z = true;
                            if (C40440x.m117135K(str, (String) it.next(), true)) {
                                break;
                            }
                        }
                    }
                    z = false;
                    if (z) {
                        return bVar;
                    }
                }
            }
            return C38273b.BANNER;
        }
    }

    static {
        f91772e = new C38274a((DefaultConstructorMarker) null);
    }

    private C38273b(List list) {
        this.f91778d = list;
    }

    /* renamed from: b */
    public final List mo91823b() {
        return this.f91778d;
    }
}
