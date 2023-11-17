package n30;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p90.C27466x5;
import r30.C27899f;
import ue1.C43075l;
import v30.C28986c;

/* renamed from: n30.c */
public final class C26363c extends RecyclerView.C1736h {

    /* renamed from: d */
    private final C43075l f66780d;

    /* renamed from: e */
    private List f66781e = C41341q.m119907j();

    public C26363c(C43075l lVar) {
        this.f66780d = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m82400h(C26363c cVar, C27899f fVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(fVar, "$request");
        C43075l lVar = cVar.f66780d;
        if (lVar != null) {
            lVar.invoke(fVar);
        }
    }

    /* renamed from: g */
    public void onBindViewHolder(C28986c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        C27899f fVar = (C27899f) this.f66781e.get(i);
        cVar.mo68826h(fVar);
        cVar.itemView.setOnClickListener(new C26362b(this, fVar));
    }

    public int getItemCount() {
        return this.f66781e.size();
    }

    /* renamed from: i */
    public C28986c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27466x5 d = C27466x5.m85173d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C28986c(d);
    }

    /* renamed from: j */
    public final void mo65561j(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f66781e = list;
        notifyDataSetChanged();
    }
}
