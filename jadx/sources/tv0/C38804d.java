package tv0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ev0.C31818b0;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: tv0.d */
public final class C38804d extends RecyclerView.C1736h {

    /* renamed from: d */
    private final ArrayList f92867d;

    /* renamed from: e */
    private final C43075l f92868e;

    public C38804d(ArrayList arrayList, C43075l lVar) {
        C41536l.m120489i(arrayList, "data");
        this.f92867d = arrayList;
        this.f92868e = lVar;
    }

    /* renamed from: f */
    public void onBindViewHolder(C38803c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        Object obj = this.f92867d.get(i);
        C41536l.m120488h(obj, "data[position]");
        cVar.mo92524i((C38801a) obj);
    }

    /* renamed from: g */
    public C38803c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31818b0 d = C31818b0.m94058d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C38803c(d, this.f92868e);
    }

    public int getItemCount() {
        return this.f92867d.size();
    }
}
