package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.u3 */
public final class C10026u3 implements C6201a {

    /* renamed from: d */
    private final View f27618d;

    /* renamed from: e */
    public final AppCompatTextView f27619e;

    /* renamed from: f */
    public final AppCompatImageView f27620f;

    private C10026u3(View view, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView) {
        this.f27618d = view;
        this.f27619e = appCompatTextView;
        this.f27620f = appCompatImageView;
    }

    /* renamed from: a */
    public static C10026u3 m36773a(View view) {
        int i = C17782g.f49676C;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49796u1;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                return new C10026u3(view, appCompatTextView, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10026u3 m36774c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_interactive_amount, viewGroup);
            return m36773a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27618d;
    }
}
