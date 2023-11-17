package p413eo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p356ao.C10114f;
import p356ao.C10115g;

/* renamed from: eo.u0 */
public final class C12773u0 implements C6201a {

    /* renamed from: d */
    private final LayerView f37871d;

    /* renamed from: e */
    public final NotificationBadgeView f37872e;

    /* renamed from: f */
    public final Button f37873f;

    /* renamed from: g */
    public final EmptyWidget f37874g;

    /* renamed from: h */
    public final EmptyWidget f37875h;

    private C12773u0(LayerView layerView, NotificationBadgeView notificationBadgeView, Button button, EmptyWidget emptyWidget, EmptyWidget emptyWidget2) {
        this.f37871d = layerView;
        this.f37872e = notificationBadgeView;
        this.f37873f = button;
        this.f37874g = emptyWidget;
        this.f37875h = emptyWidget2;
    }

    /* renamed from: a */
    public static C12773u0 m48491a(View view) {
        int i = C10114f.f27975v0;
        NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
        if (notificationBadgeView != null) {
            i = C10114f.more_button;
            Button button = (Button) C6202b.m24689a(view, i);
            if (button != null) {
                i = C10114f.pending_widget;
                EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                if (emptyWidget != null) {
                    i = C10114f.widget;
                    EmptyWidget emptyWidget2 = (EmptyWidget) C6202b.m24689a(view, i);
                    if (emptyWidget2 != null) {
                        return new C12773u0((LayerView) view, notificationBadgeView, button, emptyWidget, emptyWidget2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C12773u0 m48492d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10115g.list_item_active_package_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m48491a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f37871d;
    }
}
