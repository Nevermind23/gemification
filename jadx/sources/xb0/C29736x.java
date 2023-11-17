package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import rb0.C27986e;

/* renamed from: xb0.x */
public final class C29736x implements C6201a {

    /* renamed from: d */
    private final AppCompatTextView f75157d;

    private C29736x(AppCompatTextView appCompatTextView) {
        this.f75157d = appCompatTextView;
    }

    /* renamed from: a */
    public static C29736x m90309a(View view) {
        if (view != null) {
            return new C29736x((AppCompatTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C29736x m90310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.f71305v, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90309a(inflate);
    }

    /* renamed from: c */
    public AppCompatTextView mo3946b() {
        return this.f75157d;
    }
}
