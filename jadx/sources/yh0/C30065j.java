package yh0;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: yh0.j */
public final class C30065j extends FragmentStateAdapter {

    /* renamed from: l */
    private final List f75892l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30065j(List list, FragmentManager fragmentManager, C1593j jVar) {
        super(fragmentManager, jVar);
        C41536l.m120489i(list, "fragments");
        C41536l.m120489i(fragmentManager, "fragmentManager");
        C41536l.m120489i(jVar, "lifecycle");
        this.f75892l = list;
    }

    public int getItemCount() {
        return this.f75892l.size();
    }

    /* renamed from: h */
    public Fragment mo6571h(int i) {
        return (Fragment) this.f75892l.get(i);
    }
}
