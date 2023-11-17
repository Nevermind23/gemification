package p858pr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;
import p349ah.C9860d;
import p366bk.C10320i;
import p868qr.C27856b;
import p90.C27283e;
import ue1.C43064a;

/* renamed from: pr.d */
public final class C27608d extends C9860d {

    /* renamed from: E */
    public static final C27609a f70544E = new C27609a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C27283e f70545B;

    /* renamed from: C */
    private C27856b f70546C;

    /* renamed from: D */
    private final C41217g f70547D = C41219i.m119470b(new C27610b(this));

    /* renamed from: pr.d$a */
    public static final class C27609a {
        private C27609a() {
        }

        public /* synthetic */ C27609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C27608d mo66980a(List list) {
            C41536l.m120489i(list, "providers");
            C27608d dVar = new C27608d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("INSURANCE_PROVIDERS_LIST", new ArrayList(list))));
            return dVar;
        }
    }

    /* renamed from: pr.d$b */
    static final class C27610b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C27608d f70548d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27610b(C27608d dVar) {
            super(0);
            this.f70548d = dVar;
        }

        /* renamed from: b */
        public final C13364a invoke() {
            return new C13364a(C0767a.m2895e(this.f70548d.requireContext(), C10320i.f28693kb), true, false);
        }
    }

    /* renamed from: W1 */
    private final void m85444W1() {
        m85447f2().f68566e.setOnClickListener(new C27606b(this));
        m85447f2().f68573l.setOnClickListener(new C27607c(this));
    }

    /* renamed from: f2 */
    private final C27283e m85447f2() {
        C27283e eVar = this.f70545B;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* renamed from: g2 */
    private final C13364a m85448g2() {
        return (C13364a) this.f70547D.getValue();
    }

    /* renamed from: h2 */
    private final List m85449h2() {
        List list;
        Bundle arguments = getArguments();
        if (arguments != null) {
            list = arguments.getParcelableArrayList("INSURANCE_PROVIDERS_LIST");
        } else {
            list = null;
        }
        if (list == null) {
            list = C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((InsuranceProviderUiModel) next).mo49833h()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i2 */
    private final void m85450i2() {
        C32303f.m95184D(C32343x.m95388F("offers.loan.details.insurance.action.sheet.link", new Object[0]), requireContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public static final void m85451j2(C27608d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C27856b bVar = dVar.f70546C;
        if (bVar == null) {
            C41536l.m120506z("adapter");
            bVar = null;
        }
        InsuranceProviderUiModel h = bVar.mo67370h();
        if (h != null) {
            C1533o.m5445b(dVar, "InsuranceProviderActionSheet.CHOSEN_PROVIDER", C0908e.m3336b(C41233s.m119492a("InsuranceProviderActionSheet.CHOSEN_PROVIDER_RESULT", h)));
            dVar.mo4577k1();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m85452k2(C27608d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m85450i2();
    }

    /* renamed from: l2 */
    private final void m85453l2() {
        m85447f2().f68571j.setTitleText(C32343x.m95388F("offers.loan.details.insurance.action.sheet.info1", new Object[0]));
        m85447f2().f68573l.setButtonTextTint(m85447f2().f68573l.getButtonIconTint());
        m85447f2().f68573l.setButtonText(C32343x.m95388F("offers.loan.details.insurance.action.sheet.link.text", new Object[0]));
        m85447f2().f68566e.setButtonText(C32343x.m95388F("offers.loan.details.insurance.action.sheet.button", new Object[0]));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f70545B = C27283e.m84432d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("offers.loan.details.insurance.action.sheet.header", new Object[0]));
        m85453l2();
        this.f70546C = new C27856b(m85449h2());
        RecyclerView recyclerView = m85447f2().f68572k;
        C27856b bVar = this.f70546C;
        if (bVar == null) {
            C41536l.m120506z("adapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        m85447f2().f68572k.mo5351j(m85448g2());
        m85444W1();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f70545B = null;
    }
}
