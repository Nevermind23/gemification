package y00;

import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.C41536l;

/* renamed from: y00.b */
public abstract class C29884b extends FragmentStateAdapter {

    /* renamed from: l */
    private final SparseArray f75609l = new SparseArray();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29884b(FragmentManager fragmentManager, C1593j jVar) {
        super(fragmentManager, jVar);
        C41536l.m120489i(fragmentManager, "fragmentManager");
        C41536l.m120489i(jVar, "lifecycle");
    }

    /* renamed from: A */
    public abstract Fragment mo70155A(int i);

    /* renamed from: h */
    public Fragment mo6571h(int i) {
        boolean z;
        Fragment A = mo70155A(i);
        if (this.f75609l.indexOfKey(i) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f75609l.remove(i);
        }
        this.f75609l.put(i, A);
        return A;
    }

    /* renamed from: z */
    public final Fragment mo70156z(int i) {
        return (Fragment) this.f75609l.get(i);
    }
}
