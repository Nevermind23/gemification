package p90;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p366bk.C10322k;

/* renamed from: p90.d8 */
public final class C27282d8 implements C6201a {

    /* renamed from: d */
    private final AppBarLayout f68563d;

    /* renamed from: e */
    public final ToolbarView f68564e;

    private C27282d8(AppBarLayout appBarLayout, ToolbarView toolbarView) {
        this.f68563d = appBarLayout;
        this.f68564e = toolbarView;
    }

    /* renamed from: a */
    public static C27282d8 m84428a(View view) {
        int i = C10322k.f28748Hx;
        ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
        if (toolbarView != null) {
            return new C27282d8((AppBarLayout) view, toolbarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public AppBarLayout mo3946b() {
        return this.f68563d;
    }
}
