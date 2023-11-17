package ua1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ba1.C10216u;
import ba1.C10217v;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;

/* renamed from: ua1.g0 */
public final class C28643g0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f72735d;

    /* renamed from: e */
    public final CheckboxView f72736e;

    /* renamed from: f */
    public final Guideline f72737f;

    /* renamed from: g */
    public final TextView f72738g;

    /* renamed from: h */
    public final TextView f72739h;

    /* renamed from: i */
    public final Button f72740i;

    /* renamed from: j */
    public final TextView f72741j;

    /* renamed from: k */
    public final TextView f72742k;

    /* renamed from: l */
    public final Guideline f72743l;

    private C28643g0(ConstraintLayout constraintLayout, CheckboxView checkboxView, Guideline guideline, TextView textView, TextView textView2, Button button, TextView textView3, TextView textView4, Guideline guideline2) {
        this.f72735d = constraintLayout;
        this.f72736e = checkboxView;
        this.f72737f = guideline;
        this.f72738g = textView;
        this.f72739h = textView2;
        this.f72740i = button;
        this.f72741j = textView3;
        this.f72742k = textView4;
        this.f72743l = guideline2;
    }

    /* renamed from: a */
    public static C28643g0 m87675a(View view) {
        int i = C10216u.f28305T;
        CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
        if (checkboxView != null) {
            i = C10216u.f28292C0;
            Guideline guideline = (Guideline) C6202b.m24689a(view, i);
            if (guideline != null) {
                i = C10216u.first_terms_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10216u.first_title_text;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C10216u.f28342v1;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C10216u.second_terms_text;
                            TextView textView3 = (TextView) C6202b.m24689a(view, i);
                            if (textView3 != null) {
                                i = C10216u.second_title_text;
                                TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                if (textView4 != null) {
                                    i = C10216u.f28302Q2;
                                    Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                                    if (guideline2 != null) {
                                        return new C28643g0((ConstraintLayout) view, checkboxView, guideline, textView, textView2, button, textView3, textView4, guideline2);
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
    public static C28643g0 m87676d(LayoutInflater layoutInflater) {
        return m87677e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C28643g0 m87677e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10217v.fragment_onboarding_terms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87675a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f72735d;
    }
}
