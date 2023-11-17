package gr0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import br0.C31176b;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loanoffers.presentation.model.securedloan.PropertyInfoTextData;
import p725cr.C19788a;
import ue1.C43064a;

/* renamed from: gr0.e */
public final class C36055e extends C19788a {

    /* renamed from: J */
    public static final C36056a f87177J = new C36056a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C31176b f87178H;

    /* renamed from: I */
    private final C41217g f87179I = C41219i.m119470b(new C36057b(this));

    /* renamed from: gr0.e$a */
    public static final class C36056a {
        private C36056a() {
        }

        public /* synthetic */ C36056a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36055e mo88778a(PropertyInfoTextData propertyInfoTextData) {
            C41536l.m120489i(propertyInfoTextData, "data");
            C36055e eVar = new C36055e();
            eVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_ACTION_SHEET_DATA", propertyInfoTextData)));
            return eVar;
        }
    }

    /* renamed from: gr0.e$b */
    static final class C36057b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36055e f87180d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36057b(C36055e eVar) {
            super(0);
            this.f87180d = eVar;
        }

        /* renamed from: b */
        public final PropertyInfoTextData invoke() {
            Bundle arguments = this.f87180d.getArguments();
            PropertyInfoTextData propertyInfoTextData = arguments != null ? (PropertyInfoTextData) arguments.getParcelable("PARAM_ACTION_SHEET_DATA") : null;
            return propertyInfoTextData == null ? new PropertyInfoTextData("loan.page.real.estate.block.title", "loan.page.real.estate.collateral.hint.ipo", "loan.page.button.add.real.estate") : propertyInfoTextData;
        }
    }

    /* renamed from: f2 */
    private final C31176b m107284f2() {
        C31176b bVar = this.f87178H;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: g2 */
    private final PropertyInfoTextData m107285g2() {
        return (PropertyInfoTextData) this.f87179I.getValue();
    }

    /* renamed from: h2 */
    private final void m107286h2() {
        PropertyInfoTextData g2 = m107285g2();
        mo26370a2(C32343x.m95388F(g2.mo73716d(), new Object[0]));
        m107284f2().f77444f.setText(C32343x.m95388F(g2.mo73715b(), new Object[0]));
        m107284f2().f77443e.setButtonText(C32343x.m95388F(g2.mo73714a(), new Object[0]));
        m107284f2().f77443e.setOnClickListener(new C36054d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m107287i2(C36055e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C1533o.m5445b(eVar, "REQUEST_KEY_ADD_REAL_ESTATE", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_ADD_REAL_ESTATE", Boolean.TRUE)));
        eVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f87178H = C31176b.m92710d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f87178H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m107286h2();
        super.onViewCreated(view, bundle);
    }
}
