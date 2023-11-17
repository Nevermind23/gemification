package hh0;

import ed1.C40762x;
import ih0.C25212e;
import jh0.C25455a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: hh0.m */
public final class C25020m {

    /* renamed from: a */
    private final C25022n f64350a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C25013g f64351b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C25455a f64352c;

    /* renamed from: hh0.m$a */
    static final class C25021a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C25020m f64353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C25021a(C25020m mVar) {
            super(1);
            this.f64353d = mVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C25212e eVar) {
            boolean z;
            C41536l.m120489i(eVar, "data");
            if (this.f64353d.f64352c.mo48384f() != null || !eVar.mo63731b() || this.f64353d.f64351b.mo63417a()) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public C25020m(C25022n nVar, C25013g gVar, C25455a aVar) {
        C41536l.m120489i(nVar, "shouldShowGamificationShortcuts");
        C41536l.m120489i(gVar, "isGamificationPopupDismissed");
        C41536l.m120489i(aVar, "preferencesManager");
        this.f64350a = nVar;
        this.f64351b = gVar;
        this.f64352c = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Boolean m79934f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final Boolean m79935g(Throwable th) {
        C41536l.m120489i(th, "it");
        return Boolean.FALSE;
    }

    /* renamed from: e */
    public final C40762x mo63421e() {
        C40762x D = this.f64350a.invoke().mo95062A(new C25018k(new C25021a(this))).mo95065D(new C25019l());
        C41536l.m120488h(D, "operator fun invoke(): S…}.onErrorReturn { false }");
        return D;
    }
}
