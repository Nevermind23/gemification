package z71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.thumbnailbadgecard.ThumbnailBadgeCardView;
import y71.C40031e;

/* renamed from: z71.v */
public final class C40195v implements C6201a {

    /* renamed from: d */
    private final ThumbnailBadgeCardView f95578d;

    /* renamed from: e */
    public final ThumbnailBadgeCardView f95579e;

    private C40195v(ThumbnailBadgeCardView thumbnailBadgeCardView, ThumbnailBadgeCardView thumbnailBadgeCardView2) {
        this.f95578d = thumbnailBadgeCardView;
        this.f95579e = thumbnailBadgeCardView2;
    }

    /* renamed from: a */
    public static C40195v m116487a(View view) {
        if (view != null) {
            ThumbnailBadgeCardView thumbnailBadgeCardView = (ThumbnailBadgeCardView) view;
            return new C40195v(thumbnailBadgeCardView, thumbnailBadgeCardView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C40195v m116488d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C40031e.item_travel_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m116487a(inflate);
    }

    /* renamed from: c */
    public ThumbnailBadgeCardView mo3946b() {
        return this.f95578d;
    }
}
