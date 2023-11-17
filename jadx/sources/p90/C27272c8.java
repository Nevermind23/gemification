package p90;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p366bk.C10322k;

/* renamed from: p90.c8 */
public final class C27272c8 implements C6201a {

    /* renamed from: d */
    private final AppBarLayout f68493d;

    /* renamed from: e */
    public final ToolbarView f68494e;

    private C27272c8(AppBarLayout appBarLayout, ToolbarView toolbarView) {
        this.f68493d = appBarLayout;
        this.f68494e = toolbarView;
    }

    /* renamed from: a */
    public static C27272c8 m84388a(View view) {
        int i = C10322k.f28748Hx;
        ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
        if (toolbarView != null) {
            return new C27272c8((AppBarLayout) view, toolbarView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public AppBarLayout mo3946b() {
        return this.f68493d;
    }
}
