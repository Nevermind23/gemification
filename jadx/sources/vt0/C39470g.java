package vt0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import rt0.C38341c;
import rt0.C38342d;

/* renamed from: vt0.g */
public final class C39470g implements C6201a {

    /* renamed from: d */
    private final LinearLayout f93906d;

    /* renamed from: e */
    public final AppCompatTextView f93907e;

    private C39470g(LinearLayout linearLayout, AppCompatTextView appCompatTextView) {
        this.f93906d = linearLayout;
        this.f93907e = appCompatTextView;
    }

    /* renamed from: a */
    public static C39470g m114736a(View view) {
        int i = C38341c.news_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            return new C39470g((LinearLayout) view, appCompatTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39470g m114737d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38342d.item_welcome_news_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114736a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f93906d;
    }
}
