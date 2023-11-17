package v30;

import android.view.View;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o30.C26710a;
import p341ge.bog.mobilebank.p975ui.views.widgets.CarNumberView;
import p366bk.C10322k;
import s30.C28139a;

/* renamed from: v30.a */
public final class C28984a extends C26710a {

    /* renamed from: k */
    private final CarNumberView f73924k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28984a(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        View findViewById = view.findViewById(C10322k.car_number_view);
        C41536l.m120488h(findViewById, "itemView.findViewById(R.id.car_number_view)");
        this.f73924k = (CarNumberView) findViewById;
    }

    /* renamed from: l */
    public void mo65920j(C28139a aVar) {
        boolean z;
        C41536l.m120489i(aVar, "item");
        super.mo65920j(aVar);
        CarNumberView carNumberView = this.f73924k;
        if (aVar.mo65927f() == null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(carNumberView, z, false, 2, (Object) null);
        this.f73924k.setCardNumber(aVar.mo67669m());
    }
}
