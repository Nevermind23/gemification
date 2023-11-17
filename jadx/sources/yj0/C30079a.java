package yj0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import tj0.C28444b;

/* renamed from: yj0.a */
public final class C30079a implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f75903d;

    private C30079a(ConstraintLayout constraintLayout) {
        this.f75903d = constraintLayout;
    }

    /* renamed from: a */
    public static C30079a m91041a(View view) {
        if (view != null) {
            return new C30079a((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C30079a m91042d(LayoutInflater layoutInflater) {
        return m91043e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C30079a m91043e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28444b.activity_google_pay, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m91041a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f75903d;
    }
}
