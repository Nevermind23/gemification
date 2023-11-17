package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import hy0.C36272f;
import p086g1.C6201a;

/* renamed from: iy0.r0 */
public final class C36630r0 implements C6201a {

    /* renamed from: d */
    private final TextView f88406d;

    /* renamed from: e */
    public final TextView f88407e;

    private C36630r0(TextView textView, TextView textView2) {
        this.f88406d = textView;
        this.f88407e = textView2;
    }

    /* renamed from: a */
    public static C36630r0 m108655a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C36630r0(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C36630r0 m108656d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_operations_date, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108655a(inflate);
    }

    /* renamed from: c */
    public TextView mo3946b() {
        return this.f88406d;
    }
}
