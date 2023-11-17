package xb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import rb0.C27986e;

/* renamed from: xb0.w */
public final class C29735w implements C6201a {

    /* renamed from: d */
    private final AppCompatTextView f75155d;

    /* renamed from: e */
    public final AppCompatTextView f75156e;

    private C29735w(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f75155d = appCompatTextView;
        this.f75156e = appCompatTextView2;
    }

    /* renamed from: a */
    public static C29735w m90305a(View view) {
        if (view != null) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) view;
            return new C29735w(appCompatTextView, appCompatTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C29735w m90306d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C27986e.item_deposit_operation_date_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m90305a(inflate);
    }

    /* renamed from: c */
    public AppCompatTextView mo3946b() {
        return this.f75155d;
    }
}
