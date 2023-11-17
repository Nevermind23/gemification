package b31;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import x11.C39772e;

/* renamed from: b31.e */
public final class C31116e implements C6201a {

    /* renamed from: d */
    private final PageDescriptionView f77330d;

    /* renamed from: e */
    public final PageDescriptionView f77331e;

    private C31116e(PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2) {
        this.f77330d = pageDescriptionView;
        this.f77331e = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C31116e m92582a(View view) {
        if (view != null) {
            PageDescriptionView pageDescriptionView = (PageDescriptionView) view;
            return new C31116e(pageDescriptionView, pageDescriptionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C31116e m92583d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39772e.action_sheet_nothing_found, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m92582a(inflate);
    }

    /* renamed from: c */
    public PageDescriptionView mo3946b() {
        return this.f77330d;
    }
}
