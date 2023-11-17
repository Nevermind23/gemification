package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.v5 */
public final class C27448v5 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f70089d;

    /* renamed from: e */
    public final Barrier f70090e;

    /* renamed from: f */
    public final ImageView f70091f;

    /* renamed from: g */
    public final TextView f70092g;

    /* renamed from: h */
    public final ImageView f70093h;

    /* renamed from: i */
    public final ImageView f70094i;

    /* renamed from: j */
    public final ConstraintLayout f70095j;

    /* renamed from: k */
    public final TextView f70096k;

    /* renamed from: l */
    public final TextView f70097l;

    /* renamed from: m */
    public final TextView f70098m;

    private C27448v5(ConstraintLayout constraintLayout, Barrier barrier, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextView textView4) {
        this.f70089d = constraintLayout;
        this.f70090e = barrier;
        this.f70091f = imageView;
        this.f70092g = textView;
        this.f70093h = imageView2;
        this.f70094i = imageView3;
        this.f70095j = constraintLayout2;
        this.f70096k = textView2;
        this.f70097l = textView3;
        this.f70098m = textView4;
    }

    /* renamed from: a */
    public static C27448v5 m85101a(View view) {
        int i = C10322k.f28796U2;
        Barrier barrier = (Barrier) C6202b.m24689a(view, i);
        if (barrier != null) {
            i = C10322k.contact_icon_image;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.contact_name_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.hint_icon;
                    ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
                    if (imageView2 != null) {
                        i = C10322k.hint_top_arrow;
                        ImageView imageView3 = (ImageView) C6202b.m24689a(view, i);
                        if (imageView3 != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i = C10322k.nickname_text;
                            TextView textView2 = (TextView) C6202b.m24689a(view, i);
                            if (textView2 != null) {
                                i = C10322k.request_amount_text;
                                TextView textView3 = (TextView) C6202b.m24689a(view, i);
                                if (textView3 != null) {
                                    i = C10322k.transferred_amount_text;
                                    TextView textView4 = (TextView) C6202b.m24689a(view, i);
                                    if (textView4 != null) {
                                        return new C27448v5(constraintLayout, barrier, imageView, textView, imageView2, imageView3, constraintLayout, textView2, textView3, textView4);
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
    public ConstraintLayout mo3946b() {
        return this.f70089d;
    }
}
