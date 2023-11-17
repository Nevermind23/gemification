package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.e */
public final class C16451e implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46468d;

    /* renamed from: e */
    public final FixedButtonView f46469e;

    /* renamed from: f */
    public final RecyclerView f46470f;

    /* renamed from: g */
    public final PageDescriptionView f46471g;

    private C16451e(LinearLayout linearLayout, FixedButtonView fixedButtonView, RecyclerView recyclerView, PageDescriptionView pageDescriptionView) {
        this.f46468d = linearLayout;
        this.f46469e = fixedButtonView;
        this.f46470f = recyclerView;
        this.f46471g = pageDescriptionView;
    }

    /* renamed from: a */
    public static C16451e m58607a(View view) {
        int i = C15526d.f44063Z;
        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
        if (fixedButtonView != null) {
            i = C15526d.f44076m1;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                i = C15526d.provider_description;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    return new C16451e((LinearLayout) view, fixedButtonView, recyclerView, pageDescriptionView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16451e m58608d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.action_sheet_select_insurance_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58607a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46468d;
    }
}
