package l61;

import android.view.View;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.C1917a;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.stories.presentation.fragment.StoryGroupFragment;
import p341ge.bog.mobilebank.stories.presentation.model.StoryGroupUiModel;

/* renamed from: l61.g */
public final class C37087g extends FragmentStateAdapter {

    /* renamed from: l */
    private final List f89263l = new ArrayList();

    /* renamed from: m */
    private boolean f89264m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37087g(C1505h hVar) {
        super(hVar);
        C41536l.m120489i(hVar, "activity");
    }

    /* renamed from: A */
    public final void mo90021A(List list, boolean z) {
        C41536l.m120489i(list, "list");
        this.f89264m = z;
        C32343x.m95475p(this.f89263l, list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f89263l.size();
    }

    /* renamed from: h */
    public Fragment mo6571h(int i) {
        return StoryGroupFragment.f84063l.mo85027a((StoryGroupUiModel) this.f89263l.get(i), this.f89264m);
    }

    /* renamed from: z */
    public void onBindViewHolder(C1917a aVar, int i, List list) {
        C41536l.m120489i(aVar, "holder");
        C41536l.m120489i(list, "payloads");
        super.onBindViewHolder(aVar, i, list);
        View view = aVar.itemView;
    }
}
