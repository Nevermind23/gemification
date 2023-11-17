package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Guideline;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.i5 */
public final class C27329i5 implements C6201a {

    /* renamed from: d */
    private final CardView f68984d;

    /* renamed from: e */
    public final Guideline f68985e;

    /* renamed from: f */
    public final Guideline f68986f;

    /* renamed from: g */
    public final Guideline f68987g;

    /* renamed from: h */
    public final Guideline f68988h;

    /* renamed from: i */
    public final TextView f68989i;

    /* renamed from: j */
    public final TextView f68990j;

    /* renamed from: k */
    public final TextView f68991k;

    private C27329i5(CardView cardView, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, TextView textView, TextView textView2, TextView textView3) {
        this.f68984d = cardView;
        this.f68985e = guideline;
        this.f68986f = guideline2;
        this.f68987g = guideline3;
        this.f68988h = guideline4;
        this.f68989i = textView;
        this.f68990j = textView2;
        this.f68991k = textView3;
    }

    /* renamed from: a */
    public static C27329i5 m84625a(View view) {
        int i = C10322k.gdBot;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C10322k.gdEnd;
            Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
            if (guideline2 != null) {
                i = C10322k.gdStart;
                Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                if (guideline3 != null) {
                    i = C10322k.gdTop;
                    Guideline guideline4 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline4 != null) {
                        i = C10322k.tv_commission_amount;
                        TextView textView = (TextView) C6202b.m24689a(view, i);
                        if (textView != null) {
                            i = C10322k.tv_commission_ccy;
                            TextView textView2 = (TextView) C6202b.m24689a(view, i);
                            if (textView2 != null) {
                                i = C10322k.tv_commission_name;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    return new C27329i5((CardView) view, guideline, guideline2, guideline3, guideline4, textView, textView2, textView3);
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
    public static C27329i5 m84626d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_commissions_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84625a(inflate);
    }

    /* renamed from: c */
    public CardView mo3946b() {
        return this.f68984d;
    }
}
