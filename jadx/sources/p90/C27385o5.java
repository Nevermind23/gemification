package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.o5 */
public final class C27385o5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69464d;

    /* renamed from: e */
    public final Barrier f69465e;

    /* renamed from: f */
    public final Group f69466f;

    /* renamed from: g */
    public final AppCompatTextView f69467g;

    /* renamed from: h */
    public final AppCompatTextView f69468h;

    /* renamed from: i */
    public final RadioButtonView f69469i;

    /* renamed from: j */
    public final Group f69470j;

    /* renamed from: k */
    public final AppCompatTextView f69471k;

    /* renamed from: l */
    public final AppCompatTextView f69472l;

    /* renamed from: m */
    public final AppCompatTextView f69473m;

    private C27385o5(ConstraintLayout constraintLayout, Barrier barrier, Group group, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, RadioButtonView radioButtonView, Group group2, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatTextView appCompatTextView5) {
        this.f69464d = constraintLayout;
        this.f69465e = barrier;
        this.f69466f = group;
        this.f69467g = appCompatTextView;
        this.f69468h = appCompatTextView2;
        this.f69469i = radioButtonView;
        this.f69470j = group2;
        this.f69471k = appCompatTextView3;
        this.f69472l = appCompatTextView4;
        this.f69473m = appCompatTextView5;
    }

    /* renamed from: a */
    public static C27385o5 m84844a(View view) {
        int i = C10322k.bottom_barrier;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C10322k.credit_insurance_group;
            Group group = (Group) C6202b.m24689a(view, i);
            if (group != null) {
                i = C10322k.credit_insurance_label;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView != null) {
                    i = C10322k.credit_insurance_value;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        i = C10322k.insurance_radio_icon;
                        RadioButtonView radioButtonView = (RadioButtonView) C6202b.m24689a(view, i);
                        if (radioButtonView != null) {
                            i = C10322k.life_insurance_group;
                            Group group2 = (Group) C6202b.m24689a(view, i);
                            if (group2 != null) {
                                i = C10322k.f28742Hj;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                                if (appCompatTextView3 != null) {
                                    i = C10322k.life_insurance_value;
                                    AppCompatTextView appCompatTextView4 = (AppCompatTextView) C6202b.m24689a(view, i);
                                    if (appCompatTextView4 != null) {
                                        i = C10322k.provider_title;
                                        AppCompatTextView appCompatTextView5 = (AppCompatTextView) C6202b.m24689a(view, i);
                                        if (appCompatTextView5 != null) {
                                            return new C27385o5((ConstraintLayout) view, barrier, group, appCompatTextView, appCompatTextView2, radioButtonView, group2, appCompatTextView3, appCompatTextView4, appCompatTextView5);
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
    public static C27385o5 m84845d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84844a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69464d;
    }
}
