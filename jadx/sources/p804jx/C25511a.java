package p804jx;

import android.content.Context;
import android.view.View;
import p341ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner;

/* renamed from: jx.a */
public final /* synthetic */ class C25511a implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GamificationBanner f65180d;

    /* renamed from: e */
    public final /* synthetic */ Context f65181e;

    public /* synthetic */ C25511a(GamificationBanner gamificationBanner, Context context) {
        this.f65180d = gamificationBanner;
        this.f65181e = context;
    }

    public final void onClick(View view) {
        GamificationBanner.m68125c(this.f65180d, this.f65181e, view);
    }
}
