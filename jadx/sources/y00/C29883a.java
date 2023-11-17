package y00;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.fragment.app.C1547z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.C41536l;

/* renamed from: y00.a */
public abstract class C29883a extends C1547z {

    /* renamed from: h */
    private final SparseArray f75608h = new SparseArray();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29883a(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
        C41536l.m120489i(fragmentManager, "fragmentManager");
    }

    /* renamed from: a */
    public void mo4594a(ViewGroup viewGroup, int i, Object obj) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(obj, "o");
        this.f75608h.remove(i);
        super.mo4594a(viewGroup, i, obj);
    }

    /* renamed from: h */
    public Object mo4596h(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "container");
        Object h = super.mo4596h(viewGroup, i);
        C41536l.m120487g(h, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        Fragment fragment = (Fragment) h;
        this.f75608h.put(i, fragment);
        return fragment;
    }

    /* renamed from: w */
    public final Fragment mo70154w(int i) {
        return (Fragment) this.f75608h.get(i);
    }
}
