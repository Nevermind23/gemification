package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.f4 */
public final class C27298f4 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68721d;

    /* renamed from: e */
    public final C27251a7 f68722e;

    /* renamed from: f */
    public final FrameLayout f68723f;

    /* renamed from: g */
    public final FrameLayout f68724g;

    /* renamed from: h */
    public final BogInputLayout f68725h;

    /* renamed from: i */
    public final FrameLayout f68726i;

    /* renamed from: j */
    public final RecyclerView f68727j;

    /* renamed from: k */
    public final LinearLayout f68728k;

    private C27298f4(FrameLayout frameLayout, C27251a7 a7Var, FrameLayout frameLayout2, FrameLayout frameLayout3, BogInputLayout bogInputLayout, FrameLayout frameLayout4, RecyclerView recyclerView, LinearLayout linearLayout) {
        this.f68721d = frameLayout;
        this.f68722e = a7Var;
        this.f68723f = frameLayout2;
        this.f68724g = frameLayout3;
        this.f68725h = bogInputLayout;
        this.f68726i = frameLayout4;
        this.f68727j = recyclerView;
        this.f68728k = linearLayout;
    }

    /* renamed from: a */
    public static C27298f4 m84497a(View view) {
        int i = C10322k.horizontal_error_retry_button;
        View a = C6202b.m24689a(view, i);
        if (a != null) {
            C27251a7 a2 = C27251a7.m84303a(a);
            i = C10322k.f28913yq;
            FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view, i);
            if (frameLayout != null) {
                i = C10322k.retryLayout;
                FrameLayout frameLayout2 = (FrameLayout) C6202b.m24689a(view, i);
                if (frameLayout2 != null) {
                    i = C10322k.search_input_layout;
                    BogInputLayout bogInputLayout = (BogInputLayout) C6202b.m24689a(view, i);
                    if (bogInputLayout != null) {
                        i = C10322k.wizard_input_container;
                        FrameLayout frameLayout3 = (FrameLayout) C6202b.m24689a(view, i);
                        if (frameLayout3 != null) {
                            i = C10322k.wizard_selector_recycler;
                            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                            if (recyclerView != null) {
                                i = C10322k.wizard_selector_recycler_layout;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                                if (linearLayout != null) {
                                    return new C27298f4((FrameLayout) view, a2, frameLayout, frameLayout2, bogInputLayout, frameLayout3, recyclerView, linearLayout);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27298f4 m84498d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.fragment_recipient_country_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84497a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68721d;
    }
}
