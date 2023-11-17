package gr0;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import br0.C31177c;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.loanoffers.presentation.model.securedloan.PropertyInfoTextData;
import p725cr.C19788a;
import ue1.C43064a;

/* renamed from: gr0.g */
public final class C36059g extends C19788a {

    /* renamed from: J */
    public static final C36060a f87182J = new C36060a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C31177c f87183H;

    /* renamed from: I */
    private final C41217g f87184I = C41219i.m119470b(new C36061b(this));

    /* renamed from: gr0.g$a */
    public static final class C36060a {
        private C36060a() {
        }

        public /* synthetic */ C36060a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36059g mo88781a(PropertyInfoTextData propertyInfoTextData) {
            C41536l.m120489i(propertyInfoTextData, "data");
            C36059g gVar = new C36059g();
            gVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_ACTION_SHEET_DATA", propertyInfoTextData)));
            return gVar;
        }
    }

    /* renamed from: gr0.g$b */
    static final class C36061b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36059g f87185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36061b(C36059g gVar) {
            super(0);
            this.f87185d = gVar;
        }

        /* renamed from: b */
        public final PropertyInfoTextData invoke() {
            Bundle arguments = this.f87185d.getArguments();
            PropertyInfoTextData propertyInfoTextData = arguments != null ? (PropertyInfoTextData) arguments.getParcelable("PARAM_ACTION_SHEET_DATA") : null;
            return propertyInfoTextData == null ? new PropertyInfoTextData("loan.page.real.estate.block.title", "loan.page.real.estate.collateral.hint.ipo", "loan.page.button.add.real.estate") : propertyInfoTextData;
        }
    }

    /* renamed from: f2 */
    private final C31177c m107292f2() {
        C31177c cVar = this.f87183H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: g2 */
    private final PropertyInfoTextData m107293g2() {
        return (PropertyInfoTextData) this.f87184I.getValue();
    }

    /* renamed from: h2 */
    private final void m107294h2() {
        PropertyInfoTextData g2 = m107293g2();
        mo26370a2(C32343x.m95388F(g2.mo73716d(), new Object[0]));
        m107292f2().f77447f.setTitleText(C32343x.m95388F(g2.mo73715b(), new Object[0]));
        m107292f2().f77446e.setButtonText(C32343x.m95388F(g2.mo73714a(), new Object[0]));
        m107292f2().f77446e.setOnClickListener(new C36058f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m107295i2(C36059g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        gVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f87183H = C31177c.m92714d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f87183H = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        C1533o.m5445b(this, "REQUEST_KEY_SECURED_LOAN_SUCCESS", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SECURED_LOAN_SUCCESS", Boolean.TRUE)));
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m107294h2();
    }
}
