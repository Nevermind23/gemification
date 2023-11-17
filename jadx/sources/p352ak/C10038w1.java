package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.w1 */
public final class C10038w1 implements C6201a {

    /* renamed from: d */
    private final AppCompatTextView f27688d;

    /* renamed from: e */
    public final AppCompatTextView f27689e;

    private C10038w1(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27688d = appCompatTextView;
        this.f27689e = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10038w1 m36817a(View view) {
        if (view != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            return new C10038w1(appCompatTextView, appCompatTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10038w1 m36818d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_small_junior, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36817a(inflate);
    }

    /* renamed from: c */
    public AppCompatTextView mo3946b() {
        return this.f27688d;
    }
}
