package p341ge.bog.mobilebank.gamification.presentation.activity;

import android.view.View;
import android.view.ViewTreeObserver;
import p341ge.bog.mobilebank.gamification.presentation.activity.GamificationActivity;

/* renamed from: ge.bog.mobilebank.gamification.presentation.activity.a */
public final /* synthetic */ class C24044a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ GamificationActivity.C24030a f62372d;

    /* renamed from: e */
    public final /* synthetic */ View f62373e;

    /* renamed from: f */
    public final /* synthetic */ GamificationActivity f62374f;

    public /* synthetic */ C24044a(GamificationActivity.C24030a aVar, View view, GamificationActivity gamificationActivity) {
        this.f62372d = aVar;
        this.f62373e = view;
        this.f62374f = gamificationActivity;
    }

    public final void onGlobalLayout() {
        GamificationActivity.C24030a.m77531d(this.f62372d, this.f62373e, this.f62374f);
    }
}
