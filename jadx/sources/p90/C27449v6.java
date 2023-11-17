package p90;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.view.SearchView;
import p366bk.C10322k;

/* renamed from: p90.v6 */
public final class C27449v6 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f70099d;

    /* renamed from: e */
    public final ImageButton f70100e;

    /* renamed from: f */
    public final SearchView f70101f;

    private C27449v6(LinearLayout linearLayout, ImageButton imageButton, SearchView searchView) {
        this.f70099d = linearLayout;
        this.f70100e = imageButton;
        this.f70101f = searchView;
    }

    /* renamed from: a */
    public static C27449v6 m85104a(View view) {
        int i = C10322k.clear_search_button;
        ImageButton imageButton = (ImageButton) C6202b.m24689a(view, i);
        if (imageButton != null) {
            i = C10322k.search_input;
            SearchView searchView = (SearchView) C6202b.m24689a(view, i);
            if (searchView != null) {
                return new C27449v6((LinearLayout) view, imageButton, searchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f70099d;
    }
}
