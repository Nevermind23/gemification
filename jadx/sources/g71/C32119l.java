package g71;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c71.C31284d;
import c71.C31285e;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.EmptyView;
import p341ge.bog.designsystem.components.infobadge.InfoBadgeView;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.mediatext.MediaTextView;

/* renamed from: g71.l */
public final class C32119l implements C6201a {

    /* renamed from: d */
    private final LayerView f79043d;

    /* renamed from: e */
    public final LayerView f79044e;

    /* renamed from: f */
    public final MediaTextView f79045f;

    /* renamed from: g */
    public final Button f79046g;

    /* renamed from: h */
    public final EmptyView f79047h;

    /* renamed from: i */
    public final TwoLineTextItem f79048i;

    /* renamed from: j */
    public final InfoBadgeView f79049j;

    /* renamed from: k */
    public final InlineFeedback f79050k;

    /* renamed from: l */
    public final TextView f79051l;

    /* renamed from: m */
    public final LayerView f79052m;

    /* renamed from: n */
    public final LayerView f79053n;

    /* renamed from: o */
    public final LinearLayout f79054o;

    /* renamed from: p */
    public final ImageView f79055p;

    /* renamed from: q */
    public final MediaTextView f79056q;

    private C32119l(LayerView layerView, LayerView layerView2, MediaTextView mediaTextView, Button button, EmptyView emptyView, TwoLineTextItem twoLineTextItem, InfoBadgeView infoBadgeView, InlineFeedback inlineFeedback, TextView textView, LayerView layerView3, LayerView layerView4, LinearLayout linearLayout, ImageView imageView, MediaTextView mediaTextView2) {
        this.f79043d = layerView;
        this.f79044e = layerView2;
        this.f79045f = mediaTextView;
        this.f79046g = button;
        this.f79047h = emptyView;
        this.f79048i = twoLineTextItem;
        this.f79049j = infoBadgeView;
        this.f79050k = inlineFeedback;
        this.f79051l = textView;
        this.f79052m = layerView3;
        this.f79053n = layerView4;
        this.f79054o = linearLayout;
        this.f79055p = imageView;
        this.f79056q = mediaTextView2;
    }

    /* renamed from: a */
    public static C32119l m94609a(View view) {
        View view2 = view;
        int i = C31284d.add_pass_device;
        LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
        if (layerView != null) {
            i = C31284d.card_media_text;
            MediaTextView mediaTextView = (MediaTextView) C6202b.m24689a(view2, i);
            if (mediaTextView != null) {
                i = C31284d.change_pass_device_button;
                Button button = (Button) C6202b.m24689a(view2, i);
                if (button != null) {
                    i = C31284d.f77708t;
                    EmptyView emptyView = (EmptyView) C6202b.m24689a(view2, i);
                    if (emptyView != null) {
                        i = C31284d.f77713y;
                        TwoLineTextItem twoLineTextItem = (TwoLineTextItem) C6202b.m24689a(view2, i);
                        if (twoLineTextItem != null) {
                            i = C31284d.f77714z;
                            InfoBadgeView infoBadgeView = (InfoBadgeView) C6202b.m24689a(view2, i);
                            if (infoBadgeView != null) {
                                i = C31284d.f77695A;
                                InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view2, i);
                                if (inlineFeedback != null) {
                                    i = C31284d.no_card_text;
                                    TextView textView = (TextView) C6202b.m24689a(view2, i);
                                    if (textView != null) {
                                        i = C31284d.no_pass_device_layer;
                                        LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                                        if (layerView2 != null) {
                                            i = C31284d.pass_device_info_layer;
                                            LayerView layerView3 = (LayerView) C6202b.m24689a(view2, i);
                                            if (layerView3 != null) {
                                                i = C31284d.pass_periods_layout;
                                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                                                if (linearLayout != null) {
                                                    i = C31284d.thumbnail_icon;
                                                    ImageView imageView = (ImageView) C6202b.m24689a(view2, i);
                                                    if (imageView != null) {
                                                        i = C31284d.usage_method_media_text;
                                                        MediaTextView mediaTextView2 = (MediaTextView) C6202b.m24689a(view2, i);
                                                        if (mediaTextView2 != null) {
                                                            return new C32119l((LayerView) view2, layerView, mediaTextView, button, emptyView, twoLineTextItem, infoBadgeView, inlineFeedback, textView, layerView2, layerView3, linearLayout, imageView, mediaTextView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C32119l m94610d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C31285e.item_active_pass, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m94609a(inflate);
    }

    /* renamed from: c */
    public LayerView mo3946b() {
        return this.f79043d;
    }
}
