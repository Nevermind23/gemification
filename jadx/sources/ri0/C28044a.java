package ri0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.giftcards.presentation.details_sheet.GiftCardDetailsActionSheetUiModel;
import p725cr.C19788a;
import th0.C28390b;

/* renamed from: ri0.a */
public final class C28044a extends C19788a {

    /* renamed from: I */
    public static final C28045a f71394I = new C28045a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C28390b f71395H;

    /* renamed from: ri0.a$a */
    public static final class C28045a {
        private C28045a() {
        }

        public /* synthetic */ C28045a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28044a mo67586a(GiftCardDetailsActionSheetUiModel giftCardDetailsActionSheetUiModel) {
            C41536l.m120489i(giftCardDetailsActionSheetUiModel, "model");
            C28044a aVar = new C28044a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARGS_DETAILS_MODEL", giftCardDetailsActionSheetUiModel)));
            return aVar;
        }
    }

    /* renamed from: e2 */
    private final C28390b m86449e2() {
        C28390b bVar = this.f71395H;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: f2 */
    private final void m86450f2(GiftCardDetailsActionSheetUiModel giftCardDetailsActionSheetUiModel) {
        C28390b e2 = m86449e2();
        e2.f71985i.setTitle(giftCardDetailsActionSheetUiModel.mo61851b());
        e2.f71985i.setText(giftCardDetailsActionSheetUiModel.mo61852d());
        e2.f71981e.setText(C32343x.m95408P(giftCardDetailsActionSheetUiModel.mo61850a(), "GEL"));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f71395H = C28390b.m87081d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f71395H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("giftcard.giver.see.gift.button.sheet.header", new Object[0]));
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        m86450f2((GiftCardDetailsActionSheetUiModel) C32343x.m95419U0(this, "ARGS_DETAILS_MODEL"));
    }
}
