package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.t1 */
public final class C27426t1 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f69825d;

    /* renamed from: e */
    public final C27441u7 f69826e;

    /* renamed from: f */
    public final ImageView f69827f;

    /* renamed from: g */
    public final FrameLayout f69828g;

    private C27426t1(FrameLayout frameLayout, C27441u7 u7Var, ImageView imageView, FrameLayout frameLayout2) {
        this.f69825d = frameLayout;
        this.f69826e = u7Var;
        this.f69827f = imageView;
        this.f69828g = frameLayout2;
    }

    /* renamed from: a */
    public static C27426t1 m85012a(View view) {
        int i = C10322k.f28785Qn;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            C27441u7 a2 = C27441u7.m85073a(a);
            int i2 = C10322k.otp_wizard_close_button;
            ImageView imageView = (ImageView) C6202b.m24689a(view, i2);
            if (imageView != null) {
                i2 = C10322k.f28913yq;
                FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i2);
                if (frameLayout != null) {
                    return new C27426t1((FrameLayout) view, a2, imageView, frameLayout);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27426t1 m85013d(LayoutInflater layoutInflater) {
        return m85014e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C27426t1 m85014e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.activity_qr_pay_reversal, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85012a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f69825d;
    }
}
