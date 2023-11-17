package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.y1 */
public final class C10052y1 implements C6201a {

    /* renamed from: d */
    private final AppCompatTextView f27769d;

    /* renamed from: e */
    public final AppCompatTextView f27770e;

    private C10052y1(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27769d = appCompatTextView;
        this.f27770e = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10052y1 m36869a(View view) {
        if (view != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            return new C10052y1(appCompatTextView, appCompatTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C10052y1 m36870d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_button_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36869a(inflate);
    }

    /* renamed from: c */
    public AppCompatTextView mo3946b() {
        return this.f27769d;
    }
}
