package k81;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: k81.w */
public final class C36924w extends C36917q {

    /* renamed from: b */
    private final boolean f89041b;

    public C36924w(boolean z) {
        this.f89041b = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m109353f(Context context, View view) {
        C41536l.m120489i(context, "$context");
        C0767a.m2903m(context, new Intent(context, MoneyTransferProviderListActivity.class), (Bundle) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m109354g(C36924w wVar, View view) {
        C41536l.m120489i(wVar, "this$0");
        PreferencesApiManager.getInstance().hideOffer("REMITTANCE_BANNER_HIDDEN", C36546y.m108285N().mo89315M());
        wVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        C41536l.m120489i(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C10324m.remittance_banner_item, viewGroup, false);
        if (this.f89041b) {
            inflate.setOnClickListener(new C36922u(context));
        }
        inflate.findViewById(C10322k.hide_offer_btn).setOnClickListener(new C36923v(this));
        C41536l.m120488h(inflate, "view");
        return inflate;
    }
}
