package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p366bk.C10324m;

/* renamed from: p90.m6 */
public final class C27368m6 implements C6201a {

    /* renamed from: d */
    private final RecyclerView f69307d;

    private C27368m6(RecyclerView recyclerView) {
        this.f69307d = recyclerView;
    }

    /* renamed from: a */
    public static C27368m6 m84781a(View view) {
        if (view != null) {
            return new C27368m6((RecyclerView) view);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: d */
    public static C27368m6 m84782d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_story_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84781a(inflate);
    }

    /* renamed from: c */
    public RecyclerView mo3946b() {
        return this.f69307d;
    }
}
