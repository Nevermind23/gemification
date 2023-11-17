package p90;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;

/* renamed from: p90.h7 */
public final class C27321h7 implements C6201a {

    /* renamed from: d */
    private final FrameLayout f68893d;

    /* renamed from: e */
    public final LinearLayout f68894e;

    /* renamed from: f */
    public final RecyclerView f68895f;

    private C27321h7(FrameLayout frameLayout, LinearLayout linearLayout, RecyclerView recyclerView) {
        this.f68893d = frameLayout;
        this.f68894e = linearLayout;
        this.f68895f = recyclerView;
    }

    /* renamed from: a */
    public static C27321h7 m84591a(View view) {
        int i = C10322k.add_new_contact_layout;
        LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
        if (linearLayout != null) {
            i = C10322k.money_request_receiver_list;
            RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
            if (recyclerView != null) {
                return new C27321h7((FrameLayout) view, linearLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f68893d;
    }
}
