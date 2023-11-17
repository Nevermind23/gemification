package p20;

import a30.C19159d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p90.C27475y5;
import ue1.C43075l;

/* renamed from: p20.j */
public final class C27156j extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f68155d = C41341q.m119907j();

    /* renamed from: e */
    private C43075l f68156e;

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m84138h(C27156j jVar, C19159d dVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(dVar, "$receiver");
        C43075l lVar = jVar.f68156e;
        if (lVar != null) {
            lVar.invoke(dVar);
        }
    }

    /* renamed from: g */
    public void onBindViewHolder(C27157k kVar, int i) {
        C41536l.m120489i(kVar, "holder");
        C19159d dVar = (C19159d) this.f68155d.get(i);
        kVar.mo66466h(dVar);
        kVar.itemView.setOnClickListener(new C27155i(this, dVar));
    }

    public int getItemCount() {
        return this.f68155d.size();
    }

    /* renamed from: i */
    public C27157k onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27475y5 d = C27475y5.m85209d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C27157k(d);
    }

    /* renamed from: j */
    public final void mo66464j(List list) {
        C41536l.m120489i(list, "newReceivers");
        C1796h.C1801e b = C1796h.m6928b(new C27159l(list, this.f68155d));
        C41536l.m120488h(b, "calculateDiff(diffCallback)");
        this.f68155d = list;
        b.mo5975c(this);
    }

    /* renamed from: k */
    public final void mo66465k(C43075l lVar) {
        C41536l.m120489i(lVar, "listener");
        this.f68156e = lVar;
    }
}
