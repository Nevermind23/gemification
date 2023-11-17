package k81;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: k81.k0 */
public final class C36911k0 extends C36917q {
    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m109319f(Context context, View view) {
        if (context != null) {
            context.startActivity(new Intent(context, MoneyTransferProviderListActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m109320g(C36911k0 k0Var, View view) {
        C41536l.m120489i(k0Var, "this$0");
        PreferencesApiManager.getInstance().hideOffer("TRANSFERS_BANNER_HIDDEN", C36546y.m108285N().mo89315M());
        k0Var.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_transfers, viewGroup, false);
        inflate.setOnClickListener(new C36907i0(context));
        inflate.findViewById(C10322k.dismiss_banner_image).setOnClickListener(new C36909j0(this));
        C41536l.m120488h(inflate, "mainView");
        return inflate;
    }
}
