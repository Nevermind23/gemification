package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: en0.e */
public final class C12719e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f37633d;

    /* renamed from: e */
    public final FixedButtonView f37634e;

    /* renamed from: f */
    public final PageDescriptionView f37635f;

    /* renamed from: g */
    public final RecyclerView f37636g;

    private C12719e(LinearLayout linearLayout, FixedButtonView fixedButtonView, PageDescriptionView pageDescriptionView, RecyclerView recyclerView) {
        this.f37633d = linearLayout;
        this.f37634e = fixedButtonView;
        this.f37635f = pageDescriptionView;
        this.f37636g = recyclerView;
    }

    /* renamed from: a */
    public static C12719e m48269a(View view) {
        int i = C10106b.f27889w;
        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
        if (fixedButtonView != null) {
            i = C10106b.f27874G;
            PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
            if (pageDescriptionView != null) {
                i = C10106b.f27877K;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    return new C12719e((LinearLayout) view, fixedButtonView, pageDescriptionView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12719e m48270d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.fragment_occupation_input, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48269a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f37633d;
    }
}
