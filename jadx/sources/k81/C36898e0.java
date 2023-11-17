package k81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import iu0.C36546y;
import k30.C25628b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: k81.e0 */
public final class C36898e0 extends C36917q {

    /* renamed from: b */
    private final C25628b f89006b;

    /* renamed from: c */
    private C43064a f89007c;

    public C36898e0(C25628b bVar) {
        C41536l.m120489i(bVar, "offerProduct");
        this.f89006b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m109284f(C36898e0 e0Var, View view) {
        C41536l.m120489i(e0Var, "this$0");
        C36546y.m108282F().mo27152s("applications_solo_card", "", "solo_card_banner_click");
        C43064a aVar = e0Var.f89007c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m109285g(C36898e0 e0Var, View view) {
        C41536l.m120489i(e0Var, "this$0");
        C36546y.m108282F().mo27152s("applications_solo_card", "", "solo_card_banner_close");
        PreferencesApiManager.getInstance().hideOffer(e0Var.f89006b, C36546y.m108285N().mo89315M());
        e0Var.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_solo_card, viewGroup, false);
        inflate.setOnClickListener(new C36894c0(this));
        ((ImageView) inflate.findViewById(C10322k.hideOfferBtn)).setOnClickListener(new C36896d0(this));
        C41536l.m120488h(inflate, "view");
        return inflate;
    }

    /* renamed from: h */
    public final void mo89834h(C43064a aVar) {
        this.f89007c = aVar;
    }
}
