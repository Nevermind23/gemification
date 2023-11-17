package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.h4 */
public final class C9928h4 implements C6201a {

    /* renamed from: d */
    private final View f27061d;

    /* renamed from: e */
    public final AppCompatImageButton f27062e;

    /* renamed from: f */
    public final AppCompatImageButton f27063f;

    /* renamed from: g */
    public final AppCompatButton f27064g;

    /* renamed from: h */
    public final Guideline f27065h;

    /* renamed from: i */
    public final AppCompatButton f27066i;

    /* renamed from: j */
    public final AppCompatButton f27067j;

    /* renamed from: k */
    public final AppCompatButton f27068k;

    /* renamed from: l */
    public final AppCompatButton f27069l;

    /* renamed from: m */
    public final Guideline f27070m;

    /* renamed from: n */
    public final AppCompatButton f27071n;

    /* renamed from: o */
    public final AppCompatButton f27072o;

    /* renamed from: p */
    public final AppCompatButton f27073p;

    /* renamed from: q */
    public final AppCompatButton f27074q;

    /* renamed from: r */
    public final AppCompatButton f27075r;

    private C9928h4(View view, AppCompatImageButton appCompatImageButton, AppCompatImageButton appCompatImageButton2, AppCompatButton appCompatButton, Guideline guideline, AppCompatButton appCompatButton2, AppCompatButton appCompatButton3, AppCompatButton appCompatButton4, AppCompatButton appCompatButton5, Guideline guideline2, AppCompatButton appCompatButton6, AppCompatButton appCompatButton7, AppCompatButton appCompatButton8, AppCompatButton appCompatButton9, AppCompatButton appCompatButton10) {
        this.f27061d = view;
        this.f27062e = appCompatImageButton;
        this.f27063f = appCompatImageButton2;
        this.f27064g = appCompatButton;
        this.f27065h = guideline;
        this.f27066i = appCompatButton2;
        this.f27067j = appCompatButton3;
        this.f27068k = appCompatButton4;
        this.f27069l = appCompatButton5;
        this.f27070m = guideline2;
        this.f27071n = appCompatButton6;
        this.f27072o = appCompatButton7;
        this.f27073p = appCompatButton8;
        this.f27074q = appCompatButton9;
        this.f27075r = appCompatButton10;
    }

    /* renamed from: a */
    public static C9928h4 m36417a(View view) {
        View view2 = view;
        int i = C17782g.additional_button;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C6202b.m24689a(view2, i);
        if (appCompatImageButton != null) {
            i = C17782g.f49802v2;
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) C6202b.m24689a(view2, i);
            if (appCompatImageButton2 != null) {
                i = C17782g.eight_button;
                AppCompatButton appCompatButton = (AppCompatButton) C6202b.m24689a(view2, i);
                if (appCompatButton != null) {
                    i = C17782g.first_guideline;
                    Guideline guideline = (Guideline) C6202b.m24689a(view2, i);
                    if (guideline != null) {
                        i = C17782g.five_button;
                        AppCompatButton appCompatButton2 = (AppCompatButton) C6202b.m24689a(view2, i);
                        if (appCompatButton2 != null) {
                            i = C17782g.four_button;
                            AppCompatButton appCompatButton3 = (AppCompatButton) C6202b.m24689a(view2, i);
                            if (appCompatButton3 != null) {
                                i = C17782g.nine_button;
                                AppCompatButton appCompatButton4 = (AppCompatButton) C6202b.m24689a(view2, i);
                                if (appCompatButton4 != null) {
                                    i = C17782g.one_button;
                                    AppCompatButton appCompatButton5 = (AppCompatButton) C6202b.m24689a(view2, i);
                                    if (appCompatButton5 != null) {
                                        i = C17782g.second_guideline;
                                        Guideline guideline2 = (Guideline) C6202b.m24689a(view2, i);
                                        if (guideline2 != null) {
                                            i = C17782g.seven_button;
                                            AppCompatButton appCompatButton6 = (AppCompatButton) C6202b.m24689a(view2, i);
                                            if (appCompatButton6 != null) {
                                                i = C17782g.six_button;
                                                AppCompatButton appCompatButton7 = (AppCompatButton) C6202b.m24689a(view2, i);
                                                if (appCompatButton7 != null) {
                                                    i = C17782g.three_button;
                                                    AppCompatButton appCompatButton8 = (AppCompatButton) C6202b.m24689a(view2, i);
                                                    if (appCompatButton8 != null) {
                                                        i = C17782g.two_button;
                                                        AppCompatButton appCompatButton9 = (AppCompatButton) C6202b.m24689a(view2, i);
                                                        if (appCompatButton9 != null) {
                                                            i = C17782g.zero_button;
                                                            AppCompatButton appCompatButton10 = (AppCompatButton) C6202b.m24689a(view2, i);
                                                            if (appCompatButton10 != null) {
                                                                return new C9928h4(view, appCompatImageButton, appCompatImageButton2, appCompatButton, guideline, appCompatButton2, appCompatButton3, appCompatButton4, appCompatButton5, guideline2, appCompatButton6, appCompatButton7, appCompatButton8, appCompatButton9, appCompatButton10);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    /* renamed from: c */
    public static C9928h4 m36418c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_numeric_keyboard, viewGroup);
            return m36417a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27061d;
    }
}
