package il0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import el0.C20264b;
import el0.C20265c;
import p086g1.C6201a;
import p086g1.C6202b;

/* renamed from: il0.h */
public final class C25231h implements C6201a {

    /* renamed from: d */
    private final LinearLayout f64812d;

    /* renamed from: e */
    public final ImageView f64813e;

    /* renamed from: f */
    public final TextView f64814f;

    /* renamed from: g */
    public final RecyclerView f64815g;

    private C25231h(LinearLayout linearLayout, ImageView imageView, TextView textView, RecyclerView recyclerView) {
        this.f64812d = linearLayout;
        this.f64813e = imageView;
        this.f64814f = textView;
        this.f64815g = recyclerView;
    }

    /* renamed from: a */
    public static C25231h m80321a(View view) {
        int i = C20264b.f55164e;
        ImageView imageView = (ImageView) C6202b.m24689a(view, i);
        if (imageView != null) {
            i = C20264b.policy_company_text;
            TextView textView = (TextView) C6202b.m24689a(view, i);
            if (textView != null) {
                i = C20264b.policy_inner_recycler;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    return new C25231h((LinearLayout) view, imageView, textView, recyclerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C25231h m80322d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C20265c.item_policy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m80321a(inflate);
    }

    /* renamed from: c */
    public LinearLayout mo3946b() {
        return this.f64812d;
    }
}
