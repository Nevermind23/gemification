package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.w2 */
public final class C27454w2 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70156d;

    /* renamed from: e */
    public final LinearLayout f70157e;

    /* renamed from: f */
    public final LinearLayout f70158f;

    /* renamed from: g */
    public final LinearLayout f70159g;

    /* renamed from: h */
    public final LinearLayout f70160h;

    private C27454w2(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5) {
        this.f70156d = linearLayout;
        this.f70157e = linearLayout2;
        this.f70158f = linearLayout3;
        this.f70159g = linearLayout4;
        this.f70160h = linearLayout5;
    }

    /* renamed from: a */
    public static C27454w2 m85123a(View view) {
        int i = C10322k.deleteBtn;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10322k.editBtn;
            LinearLayout linearLayout2 = (LinearLayout) C6202b.m24689a(view, i);
            if (linearLayout2 != null) {
                i = C10322k.removeVerificationButton;
                LinearLayout linearLayout3 = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout3 != null) {
                    i = C10322k.verifyBtn;
                    LinearLayout linearLayout4 = (LinearLayout) C6202b.m24689a(view, i);
                    if (linearLayout4 != null) {
                        return new C27454w2((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27454w2 m85124d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.dialog_contact_detail_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85123a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70156d;
    }
}
