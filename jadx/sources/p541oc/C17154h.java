package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.h */
public final class C17154h implements C6201a {

    /* renamed from: d */
    private final RelativeLayout f48030d;

    /* renamed from: e */
    public final ImageView f48031e;

    /* renamed from: f */
    public final TextView f48032f;

    /* renamed from: g */
    public final RecyclerView f48033g;

    /* renamed from: h */
    public final TextView f48034h;

    private C17154h(RelativeLayout relativeLayout, ImageView imageView, TextView textView, RecyclerView recyclerView, TextView textView2) {
        this.f48030d = relativeLayout;
        this.f48031e = imageView;
        this.f48032f = textView;
        this.f48033g = recyclerView;
        this.f48034h = textView2;
    }

    /* renamed from: a */
    public static C17154h m60258a(View view) {
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.documents_list_view;
                RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                if (recyclerView != null) {
                    i = C16347e.title_text_view;
                    TextView textView2 = (TextView) view.findViewById(i);
                    if (textView2 != null) {
                        return new C17154h((RelativeLayout) view, imageView, textView, recyclerView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17154h m60259d(LayoutInflater layoutInflater) {
        return m60260e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17154h m60260e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_document_types, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60258a(inflate);
    }

    /* renamed from: c */
    public RelativeLayout mo3946b() {
        return this.f48030d;
    }
}
