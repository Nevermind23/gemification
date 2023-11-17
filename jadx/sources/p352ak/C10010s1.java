package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.s1 */
public final class C10010s1 implements C6201a {

    /* renamed from: d */
    private final AppCompatTextView f27493d;

    /* renamed from: e */
    public final AppCompatTextView f27494e;

    private C10010s1(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27493d = appCompatTextView;
        this.f27494e = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10010s1 m36715a(View view) {
        if (view != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            return new C10010s1(appCompatTextView, appCompatTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10010s1 m36716d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_small, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36715a(inflate);
    }

    /* renamed from: c */
    public AppCompatTextView mo3946b() {
        return this.f27493d;
    }
}
