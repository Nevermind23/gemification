package p493kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p451hk.C15526d;
import p451hk.C15527e;

/* renamed from: kk.a */
public final class C16447a implements C6201a {

    /* renamed from: d */
    private final LinearLayout f46448d;

    /* renamed from: e */
    public final LayerView f46449e;

    /* renamed from: f */
    public final LayerView f46450f;

    /* renamed from: g */
    public final NotificationBadgeView f46451g;

    /* renamed from: h */
    public final TextView f46452h;

    /* renamed from: i */
    public final ImageView f46453i;

    /* renamed from: j */
    public final ImageView f46454j;

    /* renamed from: k */
    public final TextView f46455k;

    /* renamed from: l */
    public final NotificationBadgeView f46456l;

    /* renamed from: m */
    public final TextView f46457m;

    /* renamed from: n */
    public final NotificationBadgeView f46458n;

    /* renamed from: o */
    public final TextView f46459o;

    private C16447a(LinearLayout linearLayout, LayerView layerView, LayerView layerView2, NotificationBadgeView notificationBadgeView, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, NotificationBadgeView notificationBadgeView2, TextView textView3, NotificationBadgeView notificationBadgeView3, TextView textView4) {
        this.f46448d = linearLayout;
        this.f46449e = layerView;
        this.f46450f = layerView2;
        this.f46451g = notificationBadgeView;
        this.f46452h = textView;
        this.f46453i = imageView;
        this.f46454j = imageView2;
        this.f46455k = textView2;
        this.f46456l = notificationBadgeView2;
        this.f46457m = textView3;
        this.f46458n = notificationBadgeView3;
        this.f46459o = textView4;
    }

    /* renamed from: a */
    public static C16447a m58591a(View view) {
        int i = C15526d.call_police_button;
        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
        if (layerView != null) {
            i = C15526d.call_provider_button;
            LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
            if (layerView2 != null) {
                i = C15526d.first_badge;
                NotificationBadgeView notificationBadgeView = (NotificationBadgeView) C6202b.m24689a(view, i);
                if (notificationBadgeView != null) {
                    i = C15526d.f44084t0;
                    TextView textView = (TextView) C6202b.m24689a(view, i);
                    if (textView != null) {
                        i = C15526d.police_icon_image;
                        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
                        if (imageView != null) {
                            i = C15526d.provider_icon_image;
                            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
                            if (imageView2 != null) {
                                i = C15526d.provider_title_text;
                                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                                if (textView2 != null) {
                                    i = C15526d.f44053H1;
                                    NotificationBadgeView notificationBadgeView2 = (NotificationBadgeView) C6202b.m24689a(view, i);
                                    if (notificationBadgeView2 != null) {
                                        i = C15526d.f44054I1;
                                        TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                        if (textView3 != null) {
                                            i = C15526d.f44060R1;
                                            NotificationBadgeView notificationBadgeView3 = (NotificationBadgeView) C6202b.m24689a(view, i);
                                            if (notificationBadgeView3 != null) {
                                                i = C15526d.third_text;
                                                TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                                if (textView4 != null) {
                                                    return new C16447a((LinearLayout) view, layerView, layerView2, notificationBadgeView, textView, imageView, imageView2, textView2, notificationBadgeView2, textView3, notificationBadgeView3, textView4);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C16447a m58592d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C15527e.action_sheet_accident_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m58591a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f46448d;
    }
}
