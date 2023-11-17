package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import kotlin.jvm.internal.C41536l;
import o20.C26688a;
import p341ge.bog.designsystem.components.buttons.Button;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p725cr.C19788a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.a */
public final class C21810a extends C19788a {

    /* renamed from: H */
    private C21811a f58190H;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.a$a */
    public interface C21811a {
        /* renamed from: k0 */
        void mo53864k0();

        /* renamed from: l */
        void mo53865l();
    }

    /* access modifiers changed from: private */
    /* renamed from: f2 */
    public static final void m70675f2(C21810a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        C21811a aVar2 = aVar.f58190H;
        if (aVar2 != null) {
            aVar2.mo53864k0();
        }
        aVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        ((Button) layoutInflater.inflate(C10324m.dialog_add_phone_number_to_cotanct, viewGroup, true).findViewById(C10322k.f28902v0)).setOnClickListener(new C26688a(this));
        mo26370a2(getString(C10328q.add_phone_number_dialog_title));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() instanceof C21811a) {
            C1505h activity = getActivity();
            C41536l.m120487g(activity, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.activity.AddPhoneNumberBottomSheetDialog.Callback");
            this.f58190H = (C21811a) activity;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C21811a aVar = this.f58190H;
        if (aVar != null) {
            aVar.mo53865l();
        }
    }
}
