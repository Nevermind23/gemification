package w01;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import u01.C39000a;
import u01.C39001b;

/* renamed from: w01.a */
public final class C39499a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93941d;

    /* renamed from: e */
    public final FixedButtonView f93942e;

    /* renamed from: f */
    public final LayerView f93943f;

    /* renamed from: g */
    public final LinearLayout f93944g;

    /* renamed from: h */
    public final PageDescriptionView f93945h;

    /* renamed from: i */
    public final FrameLayout f93946i;

    /* renamed from: j */
    public final AppCompatTextView f93947j;

    /* renamed from: k */
    public final TextView f93948k;

    /* renamed from: l */
    public final ConstraintLayout f93949l;

    /* renamed from: m */
    public final ViewPager2 f93950m;

    private C39499a(ConstraintLayout constraintLayout, FixedButtonView fixedButtonView, LayerView layerView, LinearLayout linearLayout, PageDescriptionView pageDescriptionView, FrameLayout frameLayout, AppCompatTextView appCompatTextView, TextView textView, ConstraintLayout constraintLayout2, ViewPager2 viewPager2) {
        this.f93941d = constraintLayout;
        this.f93942e = fixedButtonView;
        this.f93943f = layerView;
        this.f93944g = linearLayout;
        this.f93945h = pageDescriptionView;
        this.f93946i = frameLayout;
        this.f93947j = appCompatTextView;
        this.f93948k = textView;
        this.f93949l = constraintLayout2;
        this.f93950m = viewPager2;
    }

    /* renamed from: a */
    public static C39499a m114819a(View view) {
        int i = C39000a.btn_next;
        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view, i);
        if (fixedButtonView != null) {
            i = C39000a.btn_skip;
            LayerView layerView = (LayerView) C6202b.m24689a(view, i);
            if (layerView != null) {
                i = C39000a.layout_description;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C39000a.f93119e;
                    PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
                    if (pageDescriptionView != null) {
                        i = C39000a.f93120f;
                        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                        if (frameLayout != null) {
                            i = C39000a.text_skip;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView != null) {
                                i = C39000a.f93121h;
                                TextView textView = (TextView) C6202b.m24689a(view, i);
                                if (textView != null) {
                                    i = C39000a.f93122i;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) C6202b.m24689a(view, i);
                                    if (constraintLayout != null) {
                                        i = C39000a.f93123j;
                                        ViewPager2 viewPager2 = (ViewPager2) C6202b.m24689a(view, i);
                                        if (viewPager2 != null) {
                                            return new C39499a((ConstraintLayout) view, fixedButtonView, layerView, linearLayout, pageDescriptionView, frameLayout, appCompatTextView, textView, constraintLayout, viewPager2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39499a m114820d(LayoutInflater layoutInflater) {
        return m114821e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C39499a m114821e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39001b.activity_release_notes, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114819a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93941d;
    }
}
