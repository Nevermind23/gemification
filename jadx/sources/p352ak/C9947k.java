package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.k */
public final class C9947k implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f27177d;

    /* renamed from: e */
    public final ConstraintLayout f27178e;

    /* renamed from: f */
    public final LinearLayout f27179f;

    /* renamed from: g */
    public final ImageView f27180g;

    /* renamed from: h */
    public final TextView f27181h;

    /* renamed from: i */
    public final TextView f27182i;

    /* renamed from: j */
    public final TextBadgeView f27183j;

    private C9947k(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextBadgeView textBadgeView) {
        this.f27177d = constraintLayout;
        this.f27178e = constraintLayout2;
        this.f27179f = linearLayout;
        this.f27180g = imageView;
        this.f27181h = textView;
        this.f27182i = textView2;
        this.f27183j = textBadgeView;
    }

    /* renamed from: a */
    public static C9947k m36482a(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = C17782g.deposit_features_layout;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C17782g.deposit_header_image;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C17782g.deposit_title_text;
                TextView textView = (TextView) C6202b.m24689a(view, i);
                if (textView != null) {
                    i = C17782g.deposit_type_text;
                    TextView textView2 = (TextView) C6202b.m24689a(view, i);
                    if (textView2 != null) {
                        i = C17782g.recommended_badge;
                        TextBadgeView textBadgeView = (TextBadgeView) C6202b.m24689a(view, i);
                        if (textBadgeView != null) {
                            return new C9947k(constraintLayout, constraintLayout, linearLayout, imageView, textView, textView2, textBadgeView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C9947k m36483d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C17783h.item_deposit_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m36482a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f27177d;
    }
}
