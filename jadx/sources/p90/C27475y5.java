package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.y5 */
public final class C27475y5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70267d;

    /* renamed from: e */
    public final ImageView f70268e;

    /* renamed from: f */
    public final ImageView f70269f;

    /* renamed from: g */
    public final TextView f70270g;

    /* renamed from: h */
    public final TextView f70271h;

    private C27475y5(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f70267d = constraintLayout;
        this.f70268e = imageView;
        this.f70269f = imageView2;
        this.f70270g = textView;
        this.f70271h = textView2;
    }

    /* renamed from: a */
    public static C27475y5 m85208a(View view) {
        int i = C10322k.f28838h2;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.f28767Lg;
            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
            if (imageView2 != null) {
                i = C10322k.name_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.phone_number_text;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        return new C27475y5((ConstraintLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27475y5 m85209d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_receiver_horizontal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85208a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f70267d;
    }
}
