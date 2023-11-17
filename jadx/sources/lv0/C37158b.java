package lv0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import ev0.C31822d0;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;

/* renamed from: lv0.b */
public final class C37158b extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f89495d = C41341q.m119907j();

    /* renamed from: e */
    private C43075l f89496e;

    /* renamed from: lv0.b$a */
    public static final class C37159a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31822d0 f89497d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37159a(C31822d0 d0Var) {
            super(d0Var.mo3946b());
            C41536l.m120489i(d0Var, "binding");
            this.f89497d = d0Var;
        }

        /* renamed from: h */
        public final C31822d0 mo90153h() {
            return this.f89497d;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m109833h(C37158b bVar, C37167j jVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(jVar, "$item");
        C43075l lVar = bVar.f89496e;
        if (lVar != null) {
            lVar.invoke(jVar);
        }
    }

    /* renamed from: g */
    public void onBindViewHolder(C37159a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        C37167j jVar = (C37167j) this.f89495d.get(i);
        aVar.mo90153h().f78476e.setImageResource(jVar.mo90161c());
        aVar.mo90153h().f78477f.setText(jVar.mo90162d());
        aVar.mo90153h().mo3946b().setOnClickListener(new C37157a(this, jVar));
    }

    public int getItemCount() {
        return this.f89495d.size();
    }

    /* renamed from: i */
    public C37159a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C31822d0 d = C31822d0.m94076d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C37159a(d);
    }

    /* renamed from: j */
    public final void mo90151j(List list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f89495d = list;
        notifyDataSetChanged();
    }

    /* renamed from: k */
    public final void mo90152k(C43075l lVar) {
        this.f89496e = lVar;
    }
}
