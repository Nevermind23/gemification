package p371bp;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p386cp.C12019a;
import ue1.C43075l;

/* renamed from: bp.l */
public final class C10371l extends C21481a implements C10366g, C10367h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C20217b f29546d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C12019a f29547e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final String f29548f;

    /* renamed from: g */
    private final C10366g f29549g = this;

    /* renamed from: h */
    private final C10367h f29550h = this;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C1644x f29551i = new C1644x();

    /* renamed from: j */
    private final C1644x f29552j = new C1644x();

    /* renamed from: bp.l$a */
    static final class C10372a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C10371l f29553d;

        /* renamed from: bp.l$a$a */
        static final class C10373a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C10371l f29554d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10373a(C10371l lVar) {
                super(1);
                this.f29554d = lVar;
            }

            public final List invoke(List list) {
                C41536l.m120489i(list, "it");
                return this.f29554d.f29547e.mo32114a(list);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10372a(C10371l lVar) {
            super(1);
            this.f29553d = lVar;
        }

        /* access modifiers changed from: private */
        public static final List invoke$lambda$0(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            return (List) lVar.invoke(obj);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "it");
            C20217b hw = this.f29553d.f29546d;
            String jw = this.f29553d.f29548f;
            return hw.mo48650b("TERMS_FOR_SOLO_USAGE_" + jw).mo95075O().mo95026k0(new C10370k(new C10373a(this.f29553d)));
        }
    }

    /* renamed from: bp.l$b */
    static final class C10374b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C10371l f29555d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10374b(C10371l lVar) {
            super(1);
            this.f29555d = lVar;
        }

        /* renamed from: a */
        public final void mo26999a(C31128a aVar) {
            this.f29555d.f29551i.mo4823o(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo26999a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: bp.l$c */
    public interface C10375c {
        /* renamed from: a */
        C10371l mo27000a(String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10371l(C20217b bVar, C12019a aVar, String str) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getSoloTerms");
        C41536l.m120489i(aVar, "mapper");
        C41536l.m120489i(str, "packageName");
        this.f29546d = bVar;
        this.f29547e = aVar;
        this.f29548f = str;
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C10368i(new C10372a(this)));
        C41536l.m120488h(L0, "merge(\n                o…sform(it) }\n            }");
        C41205b F0 = C32343x.m95413R0(C31270e.m92879h(L0, 1)).mo94981F0(new C10369j(new C10374b(this)));
        C41536l.m120488h(F0, "merge(\n                o…lue(result)\n            }");
        bindToLifecycle(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: fw */
    public static final C40754t m37685fw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final void m37686gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: S0 */
    public void mo26992S0() {
        C37224b.m109962a(this.f29552j);
        C32343x.m95501z0(this, "solo_packages", this.f29548f, "approve_income");
    }

    /* renamed from: ln */
    public LiveData mo26993ln() {
        return this.f29551i;
    }

    /* renamed from: lw */
    public final C10366g mo26995lw() {
        return this.f29549g;
    }

    /* renamed from: mw */
    public final C10367h mo26996mw() {
        return this.f29550h;
    }

    /* renamed from: qa */
    public LiveData mo26994qa() {
        return this.f29552j;
    }
}
