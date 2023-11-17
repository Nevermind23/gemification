package i01;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import e01.C31638b;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.countdowntimer.CountDownTimerView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;

/* renamed from: i01.f */
public final class C36338f implements C6201a {

    /* renamed from: d */
    private final AppBarLayout f87701d;

    /* renamed from: e */
    public final CountDownTimerView f87702e;

    /* renamed from: f */
    public final ToolbarView f87703f;

    private C36338f(AppBarLayout appBarLayout, CountDownTimerView countDownTimerView, ToolbarView toolbarView) {
        this.f87701d = appBarLayout;
        this.f87702e = countDownTimerView;
        this.f87703f = toolbarView;
    }

    /* renamed from: a */
    public static C36338f m107843a(View view) {
        int i = C31638b.f78227z;
        CountDownTimerView countDownTimerView = (CountDownTimerView) C6202b.m24689a(view, i);
        if (countDownTimerView != null) {
            i = C31638b.f78210B;
            ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
            if (toolbarView != null) {
                return new C36338f((AppBarLayout) view, countDownTimerView, toolbarView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public AppBarLayout mo3946b() {
        return this.f87701d;
    }
}
