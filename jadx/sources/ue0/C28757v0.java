package ue0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ie0.C25188h;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.thumbnailgrouptext.ThumbnailGroupTextView;

/* renamed from: ue0.v0 */
public final class C28757v0 implements C6201a {

    /* renamed from: d */
    private final ThumbnailGroupTextView f73492d;

    /* renamed from: e */
    public final ThumbnailGroupTextView f73493e;

    private C28757v0(ThumbnailGroupTextView thumbnailGroupTextView, ThumbnailGroupTextView thumbnailGroupTextView2) {
        this.f73492d = thumbnailGroupTextView;
        this.f73493e = thumbnailGroupTextView2;
    }

    /* renamed from: a */
    public static C28757v0 m88159a(View view) {
        if (view != null) {
            ThumbnailGroupTextView thumbnailGroupTextView = (ThumbnailGroupTextView) view;
            return new C28757v0(thumbnailGroupTextView, thumbnailGroupTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C28757v0 m88160d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C25188h.item_my_investment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m88159a(inflate);
    }

    /* renamed from: c */
    public ThumbnailGroupTextView mo3946b() {
        return this.f73492d;
    }
}
