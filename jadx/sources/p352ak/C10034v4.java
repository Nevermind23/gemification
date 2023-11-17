package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.v4 */
public final class C10034v4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27667d;

    /* renamed from: e */
    public final AppCompatTextView f27668e;

    /* renamed from: f */
    public final NotificationBadgeView f27669f;

    /* renamed from: g */
    public final AppCompatImageView f27670g;

    /* renamed from: h */
    public final AppCompatTextView f27671h;

    /* renamed from: i */
    public final LayerView f27672i;

    /* renamed from: j */
    public final AppCompatTextView f27673j;

    private C10034v4(ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView, NotificationBadgeView notificationBadgeView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, LayerView layerView, AppCompatTextView appCompatTextView3) {
        this.f27667d = constraintLayout;
        this.f27668e = appCompatTextView;
        this.f27669f = notificationBadgeView;
        this.f27670g = appCompatImageView;
        this.f27671h = appCompatTextView2;
        this.f27672i = layerView;
        this.f27673j = appCompatTextView3;
    }

    /* renamed from: a */
    public static C10034v4 m36803a(View view) {
        int i = C17782g.f49676C;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49742X;
            NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
            if (notificationBadgeView != null) {
                i = C17782g.f49787r4;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C17782g.infoText;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView2 != null) {
                        i = C17782g.infoWrapper;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            i = C17782g.f49745Y8;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                            if (appCompatTextView3 != null) {
                                return new C10034v4((ConstraintLayout) view, appCompatTextView, notificationBadgeView, appCompatImageView, appCompatTextView2, layerView, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C10034v4 m36804d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.view_product_group_wide, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36803a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27667d;
    }
}
