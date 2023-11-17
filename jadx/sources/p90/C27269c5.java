package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.c5 */
public final class C27269c5 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f68478d;

    /* renamed from: e */
    public final TextView f68479e;

    /* renamed from: f */
    public final ImageView f68480f;

    /* renamed from: g */
    public final BogTextView f68481g;

    /* renamed from: h */
    public final BogTextView f68482h;

    /* renamed from: i */
    public final CardView f68483i;

    private C27269c5(LinearLayout linearLayout, TextView textView, ImageView imageView, BogTextView bogTextView, BogTextView bogTextView2, CardView cardView) {
        this.f68478d = linearLayout;
        this.f68479e = textView;
        this.f68480f = imageView;
        this.f68481g = bogTextView;
        this.f68482h = bogTextView2;
        this.f68483i = cardView;
    }

    /* renamed from: a */
    public static C27269c5 m84376a(View view) {
        int i = C10322k.f28871n1;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.operationImage;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.operationSubtitle;
                BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView != null) {
                    i = C10322k.operationTitle;
                    BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView2 != null) {
                        i = C10322k.removeOperationBtn;
                        CardView cardView = (CardView) C6202b.m24689a(view, i);
                        if (cardView != null) {
                            return new C27269c5((LinearLayout) view, textView, imageView, bogTextView, bogTextView2, cardView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27269c5 m84377d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_operation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84376a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f68478d;
    }
}
