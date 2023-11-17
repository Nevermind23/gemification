package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;

/* renamed from: ua1.d0 */
public final class C28634d0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72698d;

    /* renamed from: e */
    public final Button f72699e;

    /* renamed from: f */
    public final LinearLayout f72700f;

    /* renamed from: g */
    public final PageDescriptionView f72701g;

    /* renamed from: h */
    public final FrameLayout f72702h;

    /* renamed from: i */
    public final ViewPager2 f72703i;

    private C28634d0(ConstraintLayout constraintLayout, Button button, LinearLayout linearLayout, PageDescriptionView pageDescriptionView, FrameLayout frameLayout, ViewPager2 viewPager2) {
        this.f72698d = constraintLayout;
        this.f72699e = button;
        this.f72700f = linearLayout;
        this.f72701g = pageDescriptionView;
        this.f72702h = frameLayout;
        this.f72703i = viewPager2;
    }

    /* renamed from: a */
    public static C28634d0 m87633a(View view) {
        int i = C10216u.f28315a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10216u.f28334l1;
            LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout != null) {
                i = C10216u.f28289A1;
                PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                if (pageDescriptionView != null) {
                    i = C10216u.f28300P2;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        i = C10216u.f28343v3;
                        ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
                        if (viewPager2 != null) {
                            return new C28634d0((ConstraintLayout) view, button, linearLayout, pageDescriptionView, frameLayout, viewPager2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C28634d0 m87634d(LayoutInflater layoutInflater) {
        return m87635e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28634d0 m87635e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_onboarding_info_cards, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87633a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72698d;
    }
}
