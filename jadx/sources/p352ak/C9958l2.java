package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.l2 */
public final class C9958l2 implements C6201a {

    /* renamed from: d */
    private final View f27234d;

    /* renamed from: e */
    public final ImageView f27235e;

    /* renamed from: f */
    public final AppCompatTextView f27236f;

    /* renamed from: g */
    public final AppCompatTextView f27237g;

    private C9958l2(View view, ImageView imageView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f27234d = view;
        this.f27235e = imageView;
        this.f27236f = appCompatTextView;
        this.f27237g = appCompatTextView2;
    }

    /* renamed from: a */
    public static C9958l2 m36523a(View view) {
        int i = C17782g.f49766j4;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C17782g.f49788r5;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
            if (appCompatTextView != null) {
                i = C17782g.f49773m7;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    return new C9958l2(view, imageView, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9958l2 m36524c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_chips_badge, viewGroup);
            return m36523a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27234d;
    }
}
