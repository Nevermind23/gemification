package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import oh0.C27011f;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: th0.v */
public final class C28430v implements C6201a {

    /* renamed from: d */
    private final PageDescriptionView f72221d;

    /* renamed from: e */
    public final PageDescriptionView f72222e;

    private C28430v(PageDescriptionView pageDescriptionView, PageDescriptionView pageDescriptionView2) {
        this.f72221d = pageDescriptionView;
        this.f72222e = pageDescriptionView2;
    }

    /* renamed from: a */
    public static C28430v m87242a(View view) {
        if (view != null) {
            PageDescriptionView pageDescriptionView = (PageDescriptionView) view;
            return new C28430v(pageDescriptionView, pageDescriptionView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28430v m87243d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_data_not_found, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87242a(inflate);
    }

    /* renamed from: c */
    public PageDescriptionView mo3946b() {
        return this.f72221d;
    }
}
