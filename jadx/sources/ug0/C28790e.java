package ug0;

import android.content.DialogInterface;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p366bk.C10320i;
import ue1.C43064a;

/* renamed from: ug0.e */
public final class C28790e {

    /* renamed from: a */
    public static final C28790e f73604a = new C28790e();

    /* renamed from: ug0.e$a */
    public static final class C28791a extends C13310d {

        /* renamed from: L */
        private final C43064a f73605L;

        public C28791a(C43064a aVar, C43064a aVar2) {
            C41536l.m120489i(aVar, "onOkButtonClick");
            C41536l.m120489i(aVar2, "onDialogDismissed");
            this.f73605L = aVar2;
            mo35635M1(new Image.Resource(C10320i.gt_intro_image, (Boolean) null, 2, (DefaultConstructorMarker) null));
            mo35647a2(C13310d.C13312b.TITLE_ICON_SINGLE_BUTTON);
            mo35648c2(C32343x.m95388F("gt.kyc.popup.title", new Object[0]));
            mo35639Q1(C32343x.m95388F("gt.kyc.popup.message", new Object[0]));
            mo35644X1(C32343x.m95388F("gt.kyc.popup.button.upload", new Object[0]));
            mo35636N1(PageDescriptionView.C13421b.IMAGE);
            mo35643V1(new C28789d(aVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: g2 */
        public static final void m88257g2(C43064a aVar, C28791a aVar2, Button button) {
            C41536l.m120489i(aVar, "$onOkButtonClick");
            C41536l.m120489i(aVar2, "this$0");
            C41536l.m120489i(button, "it");
            aVar.invoke();
            aVar2.mo4577k1();
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C41536l.m120489i(dialogInterface, "dialog");
            super.onDismiss(dialogInterface);
            this.f73605L.invoke();
        }
    }

    private C28790e() {
    }

    /* renamed from: a */
    public static final C13310d m88255a(C43064a aVar, C43064a aVar2) {
        C41536l.m120489i(aVar, "onOkButtonClick");
        C41536l.m120489i(aVar2, "onDialogDismissed");
        return new C28791a(aVar, aVar2);
    }
}
