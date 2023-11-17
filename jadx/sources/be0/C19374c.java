package be0;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.C0214c;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1533o;
import ce0.C19734a;
import g91.C32303f;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.endyearcampaign2022.presentation.model.EndYearPopUpDataUiModel;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import vd0.C29037a;
import yd0.C30003b;

/* renamed from: be0.c */
public final class C19374c extends C1483c {

    /* renamed from: u */
    public static final C19375a f53604u = new C19375a((DefaultConstructorMarker) null);

    /* renamed from: t */
    private C29037a f53605t;

    /* renamed from: be0.c$a */
    public static final class C19375a {
        private C19375a() {
        }

        public /* synthetic */ C19375a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19374c mo47587a(C30003b bVar) {
            C41536l.m120489i(bVar, "data");
            C19374c cVar = new C19374c();
            cVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_DATA", C19734a.f54090a.mo47939a(bVar))));
            return cVar;
        }
    }

    /* renamed from: D1 */
    private final C29037a m64845D1() {
        C29037a aVar = this.f53605t;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: E1 */
    private final void m64846E1() {
        m64845D1().f74023f.setOnClickListener(new C19372a(this));
        m64845D1().f74023f.setButtonText(C32343x.m95388F("end.year.campaign.popup.button.ok", new Object[0]));
        m64845D1().f74025h.setOnClickListener(new C19373b(this));
        m64845D1().f74025h.setButtonText(C32343x.m95388F("end.year.campaign.popup.button.see.more", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m64847F1(C19374c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m64848G1(C19374c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C32303f.m95184D(C32343x.m95388F("end.year.campaign.popup.button.see.more.url", new Object[0]), cVar.requireContext());
        cVar.mo4577k1();
    }

    /* renamed from: H1 */
    private final void m64849H1(EndYearPopUpDataUiModel endYearPopUpDataUiModel) {
        m64845D1().f74022e.setAnimation(endYearPopUpDataUiModel.mo58318a());
        m64845D1().f74024g.setTitle(C34646b.m101752f(endYearPopUpDataUiModel.mo58320d(), (Context) null, 1, (Object) null));
        m64845D1().f74024g.setText(C34646b.m101752f(endYearPopUpDataUiModel.mo58319b(), (Context) null, 1, (Object) null));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        C41536l.m120489i(layoutInflater, "inflater");
        Dialog n1 = mo4579n1();
        if (!(n1 == null || (window = n1.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        LayerView c = m64845D1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53605t = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", Boolean.TRUE)));
    }

    public void onViewCreated(View view, Bundle bundle) {
        EndYearPopUpDataUiModel endYearPopUpDataUiModel;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m64846E1();
        Bundle arguments = getArguments();
        if (arguments != null) {
            endYearPopUpDataUiModel = (EndYearPopUpDataUiModel) arguments.getParcelable("PARAM_DATA");
        } else {
            endYearPopUpDataUiModel = null;
        }
        if (endYearPopUpDataUiModel == null) {
            mo4577k1();
        } else {
            m64849H1(endYearPopUpDataUiModel);
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C0214c.C0215a aVar = new C0214c.C0215a(requireContext());
        this.f53605t = C29037a.m88861d(LayoutInflater.from(requireContext()));
        aVar.setView((View) m64845D1().mo3946b());
        C0214c create = aVar.create();
        C41536l.m120488h(create, "builder.create()");
        return create;
    }
}
