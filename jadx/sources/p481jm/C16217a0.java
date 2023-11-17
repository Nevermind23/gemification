package p481jm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;
import p411em.C12489f;

/* renamed from: jm.a0 */
public final class C16217a0 implements C6201a {

    /* renamed from: d */
    private final CreditCardView f45769d;

    private C16217a0(CreditCardView creditCardView) {
        this.f45769d = creditCardView;
    }

    /* renamed from: a */
    public static C16217a0 m57796a(View view) {
        if (view != null) {
            return new C16217a0((CreditCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16217a0 m57797d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12489f.item_renewal_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57796a(inflate);
    }

    /* renamed from: c */
    public CreditCardView mo3946b() {
        return this.f45769d;
    }
}
