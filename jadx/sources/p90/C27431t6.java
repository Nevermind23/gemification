package p90;

import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.view.SearchView;
import p366bk.C10322k;

/* renamed from: p90.t6 */
public final class C27431t6 implements C6201a {

    /* renamed from: d */
    private final LinearLayout f69850d;

    /* renamed from: e */
    public final ImageButton f69851e;

    /* renamed from: f */
    public final SearchView f69852f;

    private C27431t6(LinearLayout linearLayout, ImageButton imageButton, SearchView searchView) {
        this.f69850d = linearLayout;
        this.f69851e = imageButton;
        this.f69852f = searchView;
    }

    /* renamed from: a */
    public static C27431t6 m85033a(View view) {
        int i = C10322k.clear_search_button;
        ImageButton imageButton = (ImageButton) C6202b.m24689a(view, i);
        if (imageButton != null) {
            i = C10322k.search_input;
            SearchView searchView = (SearchView) C6202b.m24689a(view, i);
            if (searchView != null) {
                return new C27431t6((LinearLayout) view, imageButton, searchView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f69850d;
    }
}
