package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30574e;
import a81.C30588f;
import android.content.DialogInterface;
import android.os.Bundle;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p366bk.C10320i;
import p380ck.C10464h;

/* renamed from: ge.bog.mobilebank.ui.activities.c */
public final class C35367c {

    /* renamed from: a */
    public static final C35367c f85648a = new C35367c();

    /* renamed from: ge.bog.mobilebank.ui.activities.c$a */
    public static final class C35368a extends C13310d {

        /* renamed from: L */
        private final C35369b f85649L;

        public C35368a(C35369b bVar) {
            C41536l.m120489i(bVar, "dismissListener");
            this.f85649L = bVar;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C41536l.m120489i(dialogInterface, "dialog");
            super.onDismiss(dialogInterface);
            this.f85649L.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.activities.c$b */
    public interface C35369b {
        void invoke();
    }

    private C35367c() {
    }

    /* renamed from: c */
    public static final C13310d m105016c(C35369b bVar, C35369b bVar2) {
        C41536l.m120489i(bVar, "okButtonListener");
        C41536l.m120489i(bVar2, "onDismissListener");
        C35368a aVar = new C35368a(bVar2);
        aVar.mo35647a2(C13310d.C13312b.TITLE_ICON_TWO_BUTTON);
        aVar.mo35648c2(C32343x.m95388F("credit.offers.status.C.banner.main.text", new Object[0]));
        aVar.mo35639Q1(C32343x.m95388F("credit.offers.status.C.banner.info.text", new Object[0]));
        aVar.mo35646Z1(C32343x.m95388F("credit.offers.status.C.banner.button.continue", new Object[0]));
        aVar.mo35642U1(C32343x.m95388F("credit.offers.status.C.banner.button.close", new Object[0]));
        aVar.mo35645Y1(new C30574e(bVar, aVar));
        aVar.mo35641T1(new C30588f(aVar));
        aVar.mo35636N1(PageDescriptionView.C13421b.IMAGE);
        aVar.mo35635M1(new Image.Resource(C10320i.calculate_limits_illustration, (Boolean) null, 2, (DefaultConstructorMarker) null));
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m105017d(C35369b bVar, C35368a aVar, Button button) {
        C41536l.m120489i(bVar, "$okButtonListener");
        C41536l.m120489i(aVar, "$this_apply");
        C41536l.m120489i(button, "it");
        bVar.invoke();
        aVar.mo4577k1();
        C32343x.m95395I0(aVar, "c_state_popup_home", "", "click_continue_button", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m105018e(C35368a aVar, Button button) {
        C41536l.m120489i(aVar, "$this_apply");
        C41536l.m120489i(button, "it");
        aVar.mo4577k1();
        C32343x.m95395I0(aVar, "c_state_popup_home", "", "click_close_button", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 16, (Object) null);
    }
}
