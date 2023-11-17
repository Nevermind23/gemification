package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dynamicthumbnailcard.NoUIScrollRecyclerView;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.e3 */
public final class C9903e3 implements C6201a {

    /* renamed from: d */
    private final View f26932d;

    /* renamed from: e */
    public final Button f26933e;

    /* renamed from: f */
    public final AppCompatImageView f26934f;

    /* renamed from: g */
    public final NoUIScrollRecyclerView f26935g;

    /* renamed from: h */
    public final NoUIScrollRecyclerView f26936h;

    /* renamed from: i */
    public final LinearLayout f26937i;

    /* renamed from: j */
    public final TextView f26938j;

    /* renamed from: k */
    public final TextView f26939k;

    private C9903e3(View view, Button button, AppCompatImageView appCompatImageView, NoUIScrollRecyclerView noUIScrollRecyclerView, NoUIScrollRecyclerView noUIScrollRecyclerView2, LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f26932d = view;
        this.f26933e = button;
        this.f26934f = appCompatImageView;
        this.f26935g = noUIScrollRecyclerView;
        this.f26936h = noUIScrollRecyclerView2;
        this.f26937i = linearLayout;
        this.f26938j = textView;
        this.f26939k = textView2;
    }

    /* renamed from: a */
    public static C9903e3 m36324a(View view) {
        int i = C17782g.buttonBottom;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C17782g.imageMain;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
            if (appCompatImageView != null) {
                i = C17782g.imagesBottom;
                NoUIScrollRecyclerView noUIScrollRecyclerView = (NoUIScrollRecyclerView) C6202b.m24689a(view, i);
                if (noUIScrollRecyclerView != null) {
                    i = C17782g.imagesTop;
                    NoUIScrollRecyclerView noUIScrollRecyclerView2 = (NoUIScrollRecyclerView) C6202b.m24689a(view, i);
                    if (noUIScrollRecyclerView2 != null) {
                        i = C17782g.interactiveLayer;
                        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                        if (linearLayout != null) {
                            i = C17782g.textDescription;
                            TextView textView = (TextView) C6202b.m24689a(view, i);
                            if (textView != null) {
                                i = C17782g.textTitle;
                                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                                if (textView2 != null) {
                                    return new C9903e3(view, button, appCompatImageView, noUIScrollRecyclerView, noUIScrollRecyclerView2, linearLayout, textView, textView2);
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
    public static C9903e3 m36325c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_dynamic_thumbnail_card, viewGroup);
            return m36324a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26932d;
    }
}
