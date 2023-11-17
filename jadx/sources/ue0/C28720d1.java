package ue0;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ie0.C25187g;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: ue0.d1 */
public final class C28720d1 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f73168d;

    /* renamed from: e */
    public final Guideline f73169e;

    /* renamed from: f */
    public final Guideline f73170f;

    /* renamed from: g */
    public final AppCompatImageView f73171g;

    /* renamed from: h */
    public final TextView f73172h;

    /* renamed from: i */
    public final TextView f73173i;

    /* renamed from: j */
    public final AppCompatImageView f73174j;

    /* renamed from: k */
    public final TextView f73175k;

    /* renamed from: l */
    public final TextView f73176l;

    private C28720d1(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, AppCompatImageView appCompatImageView2, TextView textView3, TextView textView4) {
        this.f73168d = constraintLayout;
        this.f73169e = guideline;
        this.f73170f = guideline2;
        this.f73171g = appCompatImageView;
        this.f73172h = textView;
        this.f73173i = textView2;
        this.f73174j = appCompatImageView2;
        this.f73175k = textView3;
        this.f73176l = textView4;
    }

    /* renamed from: a */
    public static C28720d1 m87999a(View view) {
        int i = C25187g.f64666B1;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C25187g.guidelineVertical;
            Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
            if (guideline2 != null) {
                i = C25187g.leftItemInfoButton;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C25187g.leftItemTitle;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        i = C25187g.leftItemValue;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C25187g.rightItemInfoButton;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                            if (appCompatImageView2 != null) {
                                i = C25187g.rightItemTitle;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    i = C25187g.rightItemValue;
                                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                    if (textView4 != null) {
                                        return new C28720d1((ConstraintLayout) view, guideline, guideline2, appCompatImageView, textView, textView2, appCompatImageView2, textView3, textView4);
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

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f73168d;
    }
}
