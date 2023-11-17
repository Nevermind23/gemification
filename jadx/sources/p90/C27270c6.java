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

/* renamed from: p90.c6 */
public final class C27270c6 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68484d;

    /* renamed from: e */
    public final ImageView f68485e;

    /* renamed from: f */
    public final ImageView f68486f;

    /* renamed from: g */
    public final TextView f68487g;

    /* renamed from: h */
    public final TextView f68488h;

    private C27270c6(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f68484d = constraintLayout;
        this.f68485e = imageView;
        this.f68486f = imageView2;
        this.f68487g = textView;
        this.f68488h = textView2;
    }

    /* renamed from: a */
    public static C27270c6 m84380a(View view) {
        int i = C10322k.money_request_remove_icon;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C10322k.transferee_avatar;
            ImageView imageView2 = (ImageView) C6202b.m24689a(view, i);
            if (imageView2 != null) {
                i = C10322k.transferee_name;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C10322k.transferee_nickname;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        return new C27270c6((ConstraintLayout) view, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27270c6 m84381d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_money_request_transferee, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84380a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68484d;
    }
}
