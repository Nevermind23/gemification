package th0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import oh0.C27011f;
import p086g1.C6201a;

/* renamed from: th0.v0 */
public final class C28431v0 implements C6201a {

    /* renamed from: d */
    private final TextView f72223d;

    /* renamed from: e */
    public final TextView f72224e;

    private C28431v0(TextView textView, TextView textView2) {
        this.f72223d = textView;
        this.f72224e = textView2;
    }

    /* renamed from: a */
    public static C28431v0 m87246a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C28431v0(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28431v0 m87247d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27011f.item_store, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m87246a(inflate);
    }

    /* renamed from: c */
    public TextView mo3946b() {
        return this.f72223d;
    }
}
