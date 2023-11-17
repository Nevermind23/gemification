package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.x5 */
public final class C27466x5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70229d;

    /* renamed from: e */
    public final ImageView f70230e;

    /* renamed from: f */
    public final TextView f70231f;

    /* renamed from: g */
    public final MoneyRequestGroupIconView f70232g;

    /* renamed from: h */
    public final TextView f70233h;

    /* renamed from: i */
    public final LayerView f70234i;

    private C27466x5(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, MoneyRequestGroupIconView moneyRequestGroupIconView, TextView textView2, LayerView layerView) {
        this.f70229d = constraintLayout;
        this.f70230e = imageView;
        this.f70231f = textView;
        this.f70232g = moneyRequestGroupIconView;
        this.f70233h = textView2;
        this.f70234i = layerView;
    }

    /* renamed from: a */
    public static C27466x5 m85172a(View view) {
        int i = C10322k.alert_badge_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28871n1;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.icon_progress_view;
                MoneyRequestGroupIconView moneyRequestGroupIconView = (MoneyRequestGroupIconView) C6202b.m24689a(view, i);
                if (moneyRequestGroupIconView != null) {
                    i = C10322k.name_text;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C10322k.f28744Hq;
                        LayerView layerView = (LayerView) C6202b.m24689a(view, i);
                        if (layerView != null) {
                            return new C27466x5((ConstraintLayout) view, imageView, textView, moneyRequestGroupIconView, textView2, layerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27466x5 m85173d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85172a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70229d;
    }
}
