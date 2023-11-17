package hh0;

import ed1.C40762x;
import ih0.C25208a;
import ih0.C25209b;
import ih0.C25212e;
import jh0.C25455a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: hh0.i */
public final class C25015i {

    /* renamed from: a */
    private final C25022n f64345a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25455a f64346b;

    /* renamed from: hh0.i$a */
    static final class C25016a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25015i f64347d;

        /* renamed from: e */
        final /* synthetic */ C25208a f64348e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25016a(C25015i iVar, C25208a aVar) {
            super(1);
            this.f64347d = iVar;
            this.f64348e = aVar;
        }

        /* renamed from: a */
        public final C25209b invoke(C25212e eVar) {
            C41536l.m120489i(eVar, "showShortcuts");
            if (this.f64347d.f64346b.mo48382d(this.f64348e)) {
                return C25209b.NONE;
            }
            if (eVar.mo63731b()) {
                return C25209b.ADULT;
            }
            if (eVar.mo63732c()) {
                return C25209b.CHILD;
            }
            return C25209b.NONE;
        }
    }

    public C25015i(C25022n nVar, C25455a aVar) {
        C41536l.m120489i(nVar, "shouldShowGamificationShortcuts");
        C41536l.m120489i(aVar, "preferencesManager");
        this.f64345a = nVar;
        this.f64346b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C25209b m79927d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25209b) lVar.invoke(obj);
    }

    /* renamed from: c */
    public final C40762x mo63418c(C25208a aVar) {
        C41536l.m120489i(aVar, "location");
        C40762x A = this.f64345a.invoke().mo95062A(new C25014h(new C25016a(this, aVar)));
        C41536l.m120488h(A, "operator fun invoke(loca…        }\n        }\n    }");
        return A;
    }
}
