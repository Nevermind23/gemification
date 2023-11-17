package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import p086g1.C6201a;
import p601sg.C17783h;

/* renamed from: ak.e */
public final class C9899e implements C6201a {

    /* renamed from: d */
    private final DotsIndicator f26921d;

    private C9899e(DotsIndicator dotsIndicator) {
        this.f26921d = dotsIndicator;
    }

    /* renamed from: a */
    public static C9899e m36309a(View view) {
        if (view != null) {
            return new C9899e((DotsIndicator) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C9899e m36310d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.fixed_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36309a(inflate);
    }

    /* renamed from: c */
    public DotsIndicator mo3946b() {
        return this.f26921d;
    }
}
