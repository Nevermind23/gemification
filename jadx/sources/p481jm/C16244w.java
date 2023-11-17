package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p411em.C12488e;
import p411em.C12489f;

/* renamed from: jm.w */
public final class C16244w implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f45999d;

    /* renamed from: e */
    public final AppCompatTextView f46000e;

    /* renamed from: f */
    public final AppCompatTextView f46001f;

    private C16244w(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f45999d = constraintLayout;
        this.f46000e = appCompatTextView;
        this.f46001f = appCompatTextView2;
    }

    /* renamed from: a */
    public static C16244w m57911a(View view) {
        int i = C12488e.fee_amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C12488e.fee_title;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView2 != null) {
                return new C16244w((ConstraintLayout) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16244w m57912d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_debit_card_fee, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57911a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f45999d;
    }
}
