package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.textselectorcard.TextSelectorCardView;
import p451hk.C15527e;

/* renamed from: kk.r */
public final class C16464r implements C6201a {

    /* renamed from: d */
    private final TextSelectorCardView f46606d;

    private C16464r(TextSelectorCardView textSelectorCardView) {
        this.f46606d = textSelectorCardView;
    }

    /* renamed from: a */
    public static C16464r m58661a(View view) {
        if (view != null) {
            return new C16464r((TextSelectorCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16464r m58662d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.item_insurance_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58661a(inflate);
    }

    /* renamed from: c */
    public TextSelectorCardView mo3946b() {
        return this.f46606d;
    }
}
