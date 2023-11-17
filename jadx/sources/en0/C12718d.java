package en0;

import an0.C10106b;
import an0.C10107c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;

/* renamed from: en0.d */
public final class C12718d implements C6201a {

    /* renamed from: d */
    private final StateView f37627d;

    /* renamed from: e */
    public final LinearLayout f37628e;

    /* renamed from: f */
    public final FixedButtonView f37629f;

    /* renamed from: g */
    public final FrameLayout f37630g;

    /* renamed from: h */
    public final PageDescriptionView f37631h;

    /* renamed from: i */
    public final RecyclerView f37632i;

    private C12718d(StateView stateView, LinearLayout linearLayout, FixedButtonView fixedButtonView, FrameLayout frameLayout, PageDescriptionView pageDescriptionView, RecyclerView recyclerView) {
        this.f37627d = stateView;
        this.f37628e = linearLayout;
        this.f37629f = fixedButtonView;
        this.f37630g = frameLayout;
        this.f37631h = pageDescriptionView;
        this.f37632i = recyclerView;
    }

    /* renamed from: a */
    public static C12718d m48265a(View view) {
        int i = C10106b.f27885p;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10106b.f27889w;
            FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
            if (fixedButtonView != null) {
                i = C10106b.f27872D;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout != null) {
                    i = C10106b.f27874G;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        i = C10106b.f27877K;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                        if (recyclerView != null) {
                            return new C12718d((StateView) view, linearLayout, fixedButtonView, frameLayout, pageDescriptionView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12718d m48266d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10107c.fragment_income_source_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48265a(inflate);
    }

    /* renamed from: c */
    public StateView mo3946b() {
        return this.f37627d;
    }
}
