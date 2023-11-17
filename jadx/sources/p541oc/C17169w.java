package p541oc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p485kc.C16347e;
import p485kc.C16348f;

/* renamed from: oc.w */
public final class C17169w implements C6201a {

    /* renamed from: d */
    private final FrameLayout f48185d;

    /* renamed from: e */
    public final ImageView f48186e;

    /* renamed from: f */
    public final TextView f48187f;

    /* renamed from: g */
    public final TextView f48188g;

    /* renamed from: h */
    public final RecyclerView f48189h;

    private C17169w(FrameLayout frameLayout, ImageView imageView, TextView textView, TextView textView2, RecyclerView recyclerView) {
        this.f48185d = frameLayout;
        this.f48186e = imageView;
        this.f48187f = textView;
        this.f48188g = textView2;
        this.f48189h = recyclerView;
    }

    /* renamed from: a */
    public static C17169w m60333a(View view) {
        int i = C16347e.f46191l;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = C16347e.back_button_title_view;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = C16347e.title_text_view;
                TextView textView2 = (TextView) view.findViewById(i);
                if (textView2 != null) {
                    i = C16347e.upload_list_view;
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                    if (recyclerView != null) {
                        return new C17169w((FrameLayout) view, imageView, textView, textView2, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C17169w m60334d(LayoutInflater layoutInflater) {
        return m60335e(layoutInflater, (ViewGroup) null, false);
    }

    /* renamed from: e */
    public static C17169w m60335e(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C16348f.fragment_upload_types, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m60333a(inflate);
    }

    /* renamed from: c */
    public FrameLayout mo3946b() {
        return this.f48185d;
    }
}
