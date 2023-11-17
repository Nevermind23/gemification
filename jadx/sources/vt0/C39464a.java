package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.a */
public final class C39464a implements C6201a {

    /* renamed from: d */
    private final FrameLayout f93857d;

    /* renamed from: e */
    public final PageDescriptionView f93858e;

    private C39464a(FrameLayout frameLayout, PageDescriptionView pageDescriptionView) {
        this.f93857d = frameLayout;
        this.f93858e = pageDescriptionView;
    }

    /* renamed from: a */
    public static C39464a m114711a(View view) {
        int i = C38341c.info_page_description;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            return new C39464a((FrameLayout) view, pageDescriptionView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39464a m114712d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.action_sheet_next_period_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114711a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f93857d;
    }
}
