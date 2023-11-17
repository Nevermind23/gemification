package p352ak;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p601sg.C17782g;
import p601sg.C17783h;

/* renamed from: ak.b4 */
public final class C9880b4 implements C6201a {

    /* renamed from: d */
    private final View f26811d;

    /* renamed from: e */
    public final TextView f26812e;

    /* renamed from: f */
    public final TextView f26813f;

    /* renamed from: g */
    public final RecyclerView f26814g;

    private C9880b4(View view, TextView textView, TextView textView2, RecyclerView recyclerView) {
        this.f26811d = view;
        this.f26812e = textView;
        this.f26813f = textView2;
        this.f26814g = recyclerView;
    }

    /* renamed from: a */
    public static C9880b4 m36239a(View view) {
        int i = C17782g.end_date_title_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C17782g.end_date_value_text;
            TextView textView2 = (TextView) C6202b.m24689a(view, i);
            if (textView2 != null) {
                i = C17782g.f49754d7;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    return new C9880b4(view, textView, textView2, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C9880b4 m36240c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C17783h.view_month_carousel, viewGroup);
            return m36239a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    /* renamed from: b */
    public View mo3946b() {
        return this.f26811d;
    }
}
