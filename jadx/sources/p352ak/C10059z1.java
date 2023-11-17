package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.z1 */
public final class C10059z1 implements C6201a {

    /* renamed from: d */
    private final View f27797d;

    /* renamed from: e */
    public final TextView f27798e;

    /* renamed from: f */
    public final AppCompatImageView f27799f;

    /* renamed from: g */
    public final LayerView f27800g;

    /* renamed from: h */
    public final TextView f27801h;

    /* renamed from: i */
    public final Button f27802i;

    /* renamed from: j */
    public final TextBadgeView f27803j;

    /* renamed from: k */
    public final AppCompatImageView f27804k;

    /* renamed from: l */
    public final InlineFeedback f27805l;

    /* renamed from: m */
    public final FrameLayout f27806m;

    /* renamed from: n */
    public final LayerView f27807n;

    /* renamed from: o */
    public final TextView f27808o;

    /* renamed from: p */
    public final TextView f27809p;

    private C10059z1(View view, TextView textView, AppCompatImageView appCompatImageView, LayerView layerView, TextView textView2, Button button, TextBadgeView textBadgeView, AppCompatImageView appCompatImageView2, InlineFeedback inlineFeedback, FrameLayout frameLayout, LayerView layerView2, TextView textView3, TextView textView4) {
        this.f27797d = view;
        this.f27798e = textView;
        this.f27799f = appCompatImageView;
        this.f27800g = layerView;
        this.f27801h = textView2;
        this.f27802i = button;
        this.f27803j = textBadgeView;
        this.f27804k = appCompatImageView2;
        this.f27805l = inlineFeedback;
        this.f27806m = frameLayout;
        this.f27807n = layerView2;
        this.f27808o = textView3;
        this.f27809p = textView4;
    }

    /* renamed from: a */
    public static C10059z1 m36897a(View view) {
        int i = C17782g.card_header_account_number;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.card_header_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.card_header_image_layout;
                LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                if (layerView != null) {
                    i = C17782g.card_header_title;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C17782g.card_info_button;
                        Button button = (Button) C6202b.m24689a(view, i);
                        if (button != null) {
                            i = C17782g.digital_text_badge;
                            TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
                            if (textBadgeView != null) {
                                i = C17782g.f49779p3;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) C6202b.m24689a(view, i);
                                if (appCompatImageView2 != null) {
                                    i = C17782g.inline_notification;
                                    InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                                    if (inlineFeedback != null) {
                                        i = C17782g.subtitle_layout;
                                        FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                                        if (frameLayout != null) {
                                            i = C17782g.subtitle_negative_layer;
                                            LayerView layerView2 = (LayerView) C6202b.m24689a(view, i);
                                            if (layerView2 != null) {
                                                i = C17782g.subtitle_negative_text;
                                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                                if (textView3 != null) {
                                                    i = C17782g.f49805v8;
                                                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                                    if (textView4 != null) {
                                                        return new C10059z1(view, textView, appCompatImageView, layerView, textView2, button, textBadgeView, appCompatImageView2, inlineFeedback, frameLayout, layerView2, textView3, textView4);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10059z1 m36898c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_card_header, viewGroup);
            return m36897a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27797d;
    }
}
