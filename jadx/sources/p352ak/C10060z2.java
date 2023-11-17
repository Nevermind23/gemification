package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.z2 */
public final class C10060z2 implements C6201a {

    /* renamed from: d */
    private final View f27810d;

    /* renamed from: e */
    public final RecyclerView f27811e;

    private C10060z2(View view, RecyclerView recyclerView) {
        this.f27810d = view;
        this.f27811e = recyclerView;
    }

    /* renamed from: a */
    public static C10060z2 m36900a(View view) {
        int i = C17782g.f49754d7;
        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
        if (recyclerView != null) {
            return new C10060z2(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C10060z2 m36901c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_day_carousel, viewGroup);
            return m36900a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f27810d;
    }
}
