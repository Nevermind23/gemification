package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.n3 */
public final class C9975n3 implements C6201a {

    /* renamed from: d */
    private final View f27309d;

    /* renamed from: e */
    public final AppCompatTextView f27310e;

    /* renamed from: f */
    public final AppCompatImageView f27311f;

    /* renamed from: g */
    public final AppCompatTextView f27312g;

    /* renamed from: h */
    public final AppCompatTextView f27313h;

    private C9975n3(View view, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3) {
        this.f27309d = view;
        this.f27310e = appCompatTextView;
        this.f27311f = appCompatImageView;
        this.f27312g = appCompatTextView2;
        this.f27313h = appCompatTextView3;
    }

    /* renamed from: a */
    public static C9975n3 m36587a(View view) {
        int i = C17782g.card_base_text;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
        if (appCompatTextView != null) {
            i = C17782g.f49755e1;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.card_number_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C6202b.m24689a(view, i);
                if (appCompatTextView2 != null) {
                    i = C17782g.card_title_text;
                    AppCompatTextView appCompatTextView3 = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView3 != null) {
                        return new C9975n3(view, appCompatTextView, appCompatImageView, appCompatTextView2, appCompatTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9975n3 m36588c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_info_card, viewGroup);
            return m36587a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27309d;
    }
}
