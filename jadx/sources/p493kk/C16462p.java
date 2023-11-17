package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView;
import p451hk.C15527e;

/* renamed from: kk.p */
public final class C16462p implements C6201a {

    /* renamed from: d */
    private final ThumbnailBadgeCardView f46603d;

    private C16462p(ThumbnailBadgeCardView thumbnailBadgeCardView) {
        this.f46603d = thumbnailBadgeCardView;
    }

    /* renamed from: a */
    public static C16462p m58653a(View view) {
        if (view != null) {
            return new C16462p((ThumbnailBadgeCardView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C16462p m58654d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.item_car_liability_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58653a(inflate);
    }

    /* renamed from: c */
    public ThumbnailBadgeCardView mo3946b() {
        return this.f46603d;
    }
}
