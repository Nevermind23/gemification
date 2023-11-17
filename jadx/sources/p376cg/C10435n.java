package p376cg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p653wf.C18588q;
import p653wf.C18589r;

/* renamed from: cg.n */
public final class C10435n implements C6201a {

    /* renamed from: d */
    private final LinearLayout f29721d;

    /* renamed from: e */
    public final AppCompatTextView f29722e;

    /* renamed from: f */
    public final AppCompatTextView f29723f;

    private C10435n(LinearLayout linearLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f29721d = linearLayout;
        this.f29722e = appCompatTextView;
        this.f29723f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C10435n m37903a(View view) {
        int i = C18588q.key_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C18588q.value_text;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C10435n((LinearLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10435n m37904d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C18589r.view_product_details_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m37903a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f29721d;
    }
}
