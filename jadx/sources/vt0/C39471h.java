package vt0;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import rt0.C38341c;

/* renamed from: vt0.h */
public final class C39471h implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93908d;

    /* renamed from: e */
    public final AppCompatImageView f93909e;

    /* renamed from: f */
    public final RecyclerView f93910f;

    /* renamed from: g */
    public final AppCompatTextView f93911g;

    /* renamed from: h */
    public final FixedButtonView f93912h;

    /* renamed from: i */
    public final ToolbarView f93913i;

    private C39471h(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, RecyclerView recyclerView, AppCompatTextView appCompatTextView, FixedButtonView fixedButtonView, ToolbarView toolbarView) {
        this.f93908d = constraintLayout;
        this.f93909e = appCompatImageView;
        this.f93910f = recyclerView;
        this.f93911g = appCompatTextView;
        this.f93912h = fixedButtonView;
        this.f93913i = toolbarView;
    }

    /* renamed from: a */
    public static C39471h m114740a(View view) {
        int i = C38341c.all_statuses_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C38341c.news_recycler;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C38341c.news_title;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C38341c.f91928E;
                    FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
                    if (fixedButtonView != null) {
                        i = C38341c.f91930W;
                        ToolbarView toolbarView = (ToolbarView) C6202b.m24689a(view, i);
                        if (toolbarView != null) {
                            return new C39471h((ConstraintLayout) view, appCompatImageView, recyclerView, appCompatTextView, fixedButtonView, toolbarView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93908d;
    }
}
