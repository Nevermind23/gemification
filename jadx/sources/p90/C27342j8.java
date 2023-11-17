package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.j8 */
public final class C27342j8 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69092d;

    /* renamed from: e */
    public final TextView f69093e;

    /* renamed from: f */
    public final TextView f69094f;

    /* renamed from: g */
    public final TextView f69095g;

    /* renamed from: h */
    public final FrameLayout f69096h;

    /* renamed from: i */
    public final TextView f69097i;

    private C27342j8(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, TextView textView4) {
        this.f69092d = constraintLayout;
        this.f69093e = textView;
        this.f69094f = textView2;
        this.f69095g = textView3;
        this.f69096h = frameLayout;
        this.f69097i = textView4;
    }

    /* renamed from: a */
    public static C27342j8 m84676a(View view) {
        int i = C10322k.currency_name;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.rate;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C10322k.remittance_rate;
                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                if (textView3 != null) {
                    i = C10322k.remittance_rate_container;
                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
                    if (frameLayout != null) {
                        i = C10322k.f28795Tx;
                        TextView textView4 = (TextView) C6202b.m24689a(view, i);
                        if (textView4 != null) {
                            return new C27342j8((ConstraintLayout) view, textView, textView2, textView3, frameLayout, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27342j8 m84677d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.wizard_transfer_currency_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84676a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69092d;
    }
}
