package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogEditText;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.a5 */
public final class C27249a5 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68315d;

    /* renamed from: e */
    public final MaterialCheckBox f68316e;

    /* renamed from: f */
    public final ImageView f68317f;

    /* renamed from: g */
    public final TextView f68318g;

    /* renamed from: h */
    public final TextView f68319h;

    /* renamed from: i */
    public final LinearLayout f68320i;

    /* renamed from: j */
    public final BogEditText f68321j;

    /* renamed from: k */
    public final CardView f68322k;

    private C27249a5(FrameLayout frameLayout, MaterialCheckBox materialCheckBox, ImageView imageView, TextView textView, TextView textView2, LinearLayout linearLayout, BogEditText bogEditText, CardView cardView) {
        this.f68315d = frameLayout;
        this.f68316e = materialCheckBox;
        this.f68317f = imageView;
        this.f68318g = textView;
        this.f68319h = textView2;
        this.f68320i = linearLayout;
        this.f68321j = bogEditText;
        this.f68322k = cardView;
    }

    /* renamed from: a */
    public static C27249a5 m84295a(View view) {
        int i = C10322k.checkBox;
        MaterialCheckBox materialCheckBox = (MaterialCheckBox) C6202b.m24689a(view, i);
        if (materialCheckBox != null) {
            i = C10322k.contactImage;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.contactName;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.contactSubtitle;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C10322k.itemContainer;
                        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout != null) {
                            i = C10322k.moneyAmountInput;
                            BogEditText bogEditText = (BogEditText) C6202b.m24689a(view, i);
                            if (bogEditText != null) {
                                i = C10322k.removeContactButton;
                                CardView cardView = (CardView) C6202b.m24689a(view, i);
                                if (cardView != null) {
                                    return new C27249a5((FrameLayout) view, materialCheckBox, imageView, textView, textView2, linearLayout, bogEditText, cardView);
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
    public static C27249a5 m84296d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_summary_contact, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84295a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68315d;
    }
}
