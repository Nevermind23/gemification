package k81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import iu0.C36546y;
import k30.C25628b;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;
import q31.C38122f;
import q31.C38125h;

/* renamed from: k81.l */
public final class C36912l extends C36917q {

    /* renamed from: b */
    private final C25628b f89026b;

    public C36912l(C25628b bVar) {
        C41536l.m120489i(bVar, "offerProduct");
        this.f89026b = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m109324f(Context context, View view) {
        C38122f c;
        C36546y.m108282F().mo27152s("applications", "", "open_deposit_banner_from_home");
        if (context != null && (c = C38125h.m112238c(context)) != null) {
            C38122f.C38123a.m112225u(c, context, (String) null, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m109325g(C36912l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        C36546y.m108282F().mo27152s("applications", "", "close_deposit_banner_from_home");
        PreferencesApiManager.getInstance().hideOffer(lVar.f89026b, C36546y.m108285N().mo89315M());
        lVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_deposit, viewGroup, false);
        inflate.setOnClickListener(new C36908j(context));
        inflate.findViewById(C10322k.dismiss_banner_image).setOnClickListener(new C36910k(this));
        C41536l.m120488h(inflate, "view");
        return inflate;
    }
}
