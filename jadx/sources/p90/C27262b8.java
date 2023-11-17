package p90;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatButton;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;

/* renamed from: p90.b8 */
public final class C27262b8 implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f68405d;

    /* renamed from: e */
    public final RelativeLayout f68406e;

    /* renamed from: f */
    public final LinearLayout f68407f;

    /* renamed from: g */
    public final ImageView f68408g;

    /* renamed from: h */
    public final BogTextView f68409h;

    /* renamed from: i */
    public final BogTextView f68410i;

    /* renamed from: j */
    public final AppCompatButton f68411j;

    private C27262b8(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, LinearLayout linearLayout, ImageView imageView, BogTextView bogTextView, BogTextView bogTextView2, AppCompatButton appCompatButton) {
        this.f68405d = relativeLayout;
        this.f68406e = relativeLayout2;
        this.f68407f = linearLayout;
        this.f68408g = imageView;
        this.f68409h = bogTextView;
        this.f68410i = bogTextView2;
        this.f68411j = appCompatButton;
    }

    /* renamed from: a */
    public static C27262b8 m84346a(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view;
        int i = C10322k.header_arrow_container;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10322k.header_right_icon;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i);
            if (imageView != null) {
                i = C10322k.header_right_text;
                BogTextView bogTextView = (BogTextView) C6202b.m24689a(view, i);
                if (bogTextView != null) {
                    i = C10322k.f28741Hf;
                    BogTextView bogTextView2 = (BogTextView) C6202b.m24689a(view, i);
                    if (bogTextView2 != null) {
                        i = C10322k.settings_btn;
                        AppCompatButton appCompatButton = (AppCompatButton) C6202b.m24689a(view, i);
                        if (appCompatButton != null) {
                            return new C27262b8(relativeLayout, relativeLayout, linearLayout, imageView, bogTextView, bogTextView2, appCompatButton);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f68405d;
    }
}
