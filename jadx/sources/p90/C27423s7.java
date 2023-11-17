package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.s7 */
public final class C27423s7 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69800d;

    /* renamed from: e */
    public final BogTextView f69801e;

    /* renamed from: f */
    public final BogTextView f69802f;

    /* renamed from: g */
    public final ImageView f69803g;

    private C27423s7(ConstraintLayout constraintLayout, BogTextView bogTextView, BogTextView bogTextView2, ImageView imageView) {
        this.f69800d = constraintLayout;
        this.f69801e = bogTextView;
        this.f69802f = bogTextView2;
        this.f69803g = imageView;
    }

    /* renamed from: a */
    public static C27423s7 m85002a(View view) {
        int i = C10322k.applications_redirect_text;
        BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
        if (bogTextView != null) {
            i = C10322k.f28833fb;
            BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
            if (bogTextView2 != null) {
                i = C10322k.f28767Lg;
                ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                if (imageView != null) {
                    return new C27423s7((ConstraintLayout) view, bogTextView, bogTextView2, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27423s7 m85003d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.new_loan_allowed_action_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85002a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69800d;
    }
}
