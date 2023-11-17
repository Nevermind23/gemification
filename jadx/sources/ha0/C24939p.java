package ha0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import da0.C19952f;
import p086g1.C6201a;

/* renamed from: ha0.p */
public final class C24939p implements C6201a {

    /* renamed from: d */
    private final AppCompatTextView f64232d;

    private C24939p(AppCompatTextView appCompatTextView) {
        this.f64232d = appCompatTextView;
    }

    /* renamed from: a */
    public static C24939p m79740a(View view) {
        if (view != null) {
            return new C24939p((AppCompatTextView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C24939p m79741d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C19952f.f54545p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m79740a(inflate);
    }

    /* renamed from: c */
    public AppCompatTextView mo3946b() {
        return this.f64232d;
    }
}
