package p649vo;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import c41.C31270e;
import ed0.C20217b;
import ed1.C40749p;
import ed1.C40754t;
import g91.C32343x;
import hd1.C41204a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoLookupUiModel;
import p341ge.bog.mobilebank.categorypackages.presentation.application.secondstage.model.FinancialInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import ue1.C43075l;

/* renamed from: vo.l */
public final class C18484l extends C21481a implements C18481i, C18482j {

    /* renamed from: k */
    public static final C18486b f51949k = new C18486b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final FinancialInfoLookupUiModel f51950d;

    /* renamed from: e */
    private final C18481i f51951e = this;

    /* renamed from: f */
    private final C18482j f51952f = this;

    /* renamed from: g */
    private final C18488m f51953g = new C18488m((String) null, (String) null, 3, (DefaultConstructorMarker) null);

    /* renamed from: h */
    private final C1644x f51954h;

    /* renamed from: i */
    private final C1644x f51955i;

    /* renamed from: j */
    private final C1644x f51956j;

    /* renamed from: vo.l$a */
    static final class C18485a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20217b f51957d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18485a(C20217b bVar) {
            super(1);
            this.f51957d = bVar;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92880i(this.f51957d.mo48650b("PACKAGE_APP_FINANCIAL_INFO_CCY"), num.intValue());
        }
    }

    /* renamed from: vo.l$b */
    public static final class C18486b {
        private C18486b() {
        }

        public /* synthetic */ C18486b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: vo.l$c */
    public interface C18487c {
        /* renamed from: a */
        C18484l mo32827a(FinancialInfoLookupUiModel financialInfoLookupUiModel);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18484l(FinancialInfoLookupUiModel financialInfoLookupUiModel, C20217b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(financialInfoLookupUiModel, "infoLookup");
        C41536l.m120489i(bVar, "getLookup");
        this.f51950d = financialInfoLookupUiModel;
        C1644x xVar = new C1644x();
        this.f51954h = xVar;
        this.f51955i = new C1644x();
        this.f51956j = new C1644x();
        C40749p L0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C18483k(new C18485a(bVar)));
        C41536l.m120488h(L0, "merge(onInit(), onRefres…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(C32343x.m95413R0(L0), xVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: ew */
    public static final C40754t m62945ew(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: hw */
    private final void m62946hw() {
        boolean z;
        boolean z2 = false;
        if (this.f51953g.mo46271b() != null) {
            String a = this.f51953g.mo46270a();
            if (a == null || a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = true;
            }
        }
        this.f51956j.mo4823o(Boolean.valueOf(z2));
    }

    /* renamed from: Hv */
    public void mo46261Hv() {
        C1644x xVar = this.f51955i;
        String F = C32343x.m95388F(this.f51950d.mo40836a(), new Object[0]);
        String b = this.f51950d.mo40837b();
        String a = this.f51953g.mo46270a();
        C41536l.m120486f(a);
        String b2 = this.f51953g.mo46271b();
        C41536l.m120486f(b2);
        xVar.mo4826r(C32343x.m95466m(new FinancialInfoUiModel(F, b, a, b2)));
    }

    /* renamed from: Qh */
    public void mo46262Qh(String str) {
        C41536l.m120489i(str, "ccy");
        this.f51953g.mo46273d(str);
        m62946hw();
    }

    /* renamed from: Qm */
    public LiveData mo46264Qm() {
        return this.f51954h;
    }

    /* renamed from: d */
    public void mo46263d(String str) {
        C41536l.m120489i(str, "input");
        this.f51953g.mo46272c(str);
        m62946hw();
    }

    /* renamed from: fw */
    public final C18481i mo46267fw() {
        return this.f51951e;
    }

    /* renamed from: gw */
    public final C18482j mo46268gw() {
        return this.f51952f;
    }

    /* renamed from: m */
    public LiveData mo46265m() {
        return this.f51956j;
    }

    /* renamed from: ue */
    public LiveData mo46266ue() {
        return this.f51955i;
    }
}
