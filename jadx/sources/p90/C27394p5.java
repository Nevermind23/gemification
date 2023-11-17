package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.p5 */
public final class C27394p5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69534d;

    /* renamed from: e */
    public final AppCompatTextView f69535e;

    /* renamed from: f */
    public final AppCompatTextView f69536f;

    /* renamed from: g */
    public final ToggleView f69537g;

    private C27394p5(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ToggleView toggleView) {
        this.f69534d = constraintLayout;
        this.f69535e = appCompatTextView;
        this.f69536f = appCompatTextView2;
        this.f69537g = toggleView;
    }

    /* renamed from: a */
    public static C27394p5 m84880a(View view) {
        int i = C10322k.merchant_description;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C10322k.merchant_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                i = C10322k.merchant_toggle;
                ToggleView toggleView = (ToggleView) C6202b.m24689a(view, i);
                if (toggleView != null) {
                    return new C27394p5((ConstraintLayout) view, appCompatTextView, appCompatTextView2, toggleView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27394p5 m84881d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_mcc_state, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84880a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69534d;
    }
}
