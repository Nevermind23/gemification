package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.d0 */
public final class C16223d0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45788d;

    /* renamed from: e */
    public final AppCompatImageView f45789e;

    /* renamed from: f */
    public final AppCompatTextView f45790f;

    private C16223d0(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.f45788d = constraintLayout;
        this.f45789e = appCompatImageView;
        this.f45790f = appCompatTextView;
    }

    /* renamed from: a */
    public static C16223d0 m57820a(View view) {
        int i = C12488e.f37215o;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
        if (appCompatImageView != null) {
            i = C12488e.f37185M;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                return new C16223d0((ConstraintLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16223d0 m57821d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.layout_card_list_item_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57820a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45788d;
    }
}
