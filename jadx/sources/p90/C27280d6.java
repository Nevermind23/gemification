package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.payments2.view.MoneyRequestGroupIconView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.d6 */
public final class C27280d6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68550d;

    /* renamed from: e */
    public final ImageView f68551e;

    /* renamed from: f */
    public final TextView f68552f;

    /* renamed from: g */
    public final ImageView f68553g;

    /* renamed from: h */
    public final Barrier f68554h;

    /* renamed from: i */
    public final TextView f68555i;

    /* renamed from: j */
    public final MoneyRequestGroupIconView f68556j;

    /* renamed from: k */
    public final TextView f68557k;

    /* renamed from: l */
    public final TextView f68558l;

    private C27280d6(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ImageView imageView2, Barrier barrier, TextView textView2, MoneyRequestGroupIconView moneyRequestGroupIconView, TextView textView3, TextView textView4) {
        this.f68550d = constraintLayout;
        this.f68551e = imageView;
        this.f68552f = textView;
        this.f68553g = imageView2;
        this.f68554h = barrier;
        this.f68555i = textView2;
        this.f68556j = moneyRequestGroupIconView;
        this.f68557k = textView3;
        this.f68558l = textView4;
    }

    /* renamed from: a */
    public static C27280d6 m84421a(View view) {
        int i = C10322k.alert_badge_image;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28871n1;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C10322k.f28755J1;
                ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
                if (imageView2 != null) {
                    i = C10322k.f28796U2;
                    Barrier barrier = (Barrier) C6202b.m24689a(view, i);
                    if (barrier != null) {
                        i = C10322k.f28833fb;
                        TextView textView2 = (TextView) C6202b.m24689a(view, i);
                        if (textView2 != null) {
                            i = C10322k.icon_progress_view;
                            MoneyRequestGroupIconView moneyRequestGroupIconView = (MoneyRequestGroupIconView) C6202b.m24689a(view, i);
                            if (moneyRequestGroupIconView != null) {
                                i = C10322k.name_text;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    i = C10322k.requests_label_text;
                                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                    if (textView4 != null) {
                                        return new C27280d6((ConstraintLayout) view, imageView, textView, imageView2, barrier, textView2, moneyRequestGroupIconView, textView3, textView4);
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
    public static C27280d6 m84422d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_vertical, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84421a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68550d;
    }
}
