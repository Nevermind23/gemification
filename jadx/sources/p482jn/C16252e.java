package p482jn;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.cardheader.CardHeaderView;
import p426fn.C12929c;
import p426fn.C12930d;

/* renamed from: jn.e */
public final class C16252e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f46051d;

    /* renamed from: e */
    public final CardHeaderView f46052e;

    private C16252e(ConstraintLayout constraintLayout, CardHeaderView cardHeaderView) {
        this.f46051d = constraintLayout;
        this.f46052e = cardHeaderView;
    }

    /* renamed from: a */
    public static C16252e m57943a(View view) {
        int i = C12929c.f38182m;
        CardHeaderView cardHeaderView = (CardHeaderView) C6202b.m24689a(view, i);
        if (cardHeaderView != null) {
            return new C16252e((ConstraintLayout) view, cardHeaderView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16252e m57944d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C12930d.item_card_detail_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57943a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f46051d;
    }
}
