package p482jn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p426fn.C12929c;
import p426fn.C12930d;

/* renamed from: jn.f */
public final class C16253f implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46053d;

    /* renamed from: e */
    public final Button f46054e;

    /* renamed from: f */
    public final CheckboxView f46055f;

    /* renamed from: g */
    public final Guideline f46056g;

    /* renamed from: h */
    public final Guideline f46057h;

    /* renamed from: i */
    public final Guideline f46058i;

    /* renamed from: j */
    public final AppCompatTextView f46059j;

    /* renamed from: k */
    public final PageState f46060k;

    private C16253f(ConstraintLayout constraintLayout, Button button, CheckboxView checkboxView, Guideline guideline, Guideline guideline2, Guideline guideline3, AppCompatTextView appCompatTextView, PageState pageState) {
        this.f46053d = constraintLayout;
        this.f46054e = button;
        this.f46055f = checkboxView;
        this.f46056g = guideline;
        this.f46057h = guideline2;
        this.f46058i = guideline3;
        this.f46059j = appCompatTextView;
        this.f46060k = pageState;
    }

    /* renamed from: a */
    public static C16253f m57947a(View view) {
        int i = C12929c.f38181a;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C12929c.agree_check_box;
            CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view, i);
            if (checkboxView != null) {
                i = C12929c.f38184r;
                Guideline guideline = (Guideline) C6202b.m24689a(view, i);
                if (guideline != null) {
                    i = C12929c.f38185s;
                    Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline2 != null) {
                        i = C12929c.f38186t;
                        Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                        if (guideline3 != null) {
                            i = C12929c.f38173A;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView != null) {
                                i = C12929c.f38178J;
                                PageState pageState = (PageState) C6202b.m24689a(view, i);
                                if (pageState != null) {
                                    return new C16253f((ConstraintLayout) view, button, checkboxView, guideline, guideline2, guideline3, appCompatTextView, pageState);
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
    public static C16253f m57948d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12930d.layout_action_sheet_pin_reset, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57947a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46053d;
    }
}
