package a90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g90.C20780b;
import g91.C32343x;
import h80.C24909p;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import ue1.C43075l;

/* renamed from: a90.e */
public final class C19205e extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f53412f;

    /* renamed from: a90.e$a */
    public final class C19206a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24909p f53413d;

        /* renamed from: e */
        final /* synthetic */ C19205e f53414e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19206a(C19205e eVar, C24909p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
            this.f53414e = eVar;
            this.f53413d = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64628j(C19205e eVar, C20780b bVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            C41536l.m120489i(bVar, "$data");
            eVar.f53412f.invoke(bVar.mo49330a());
        }

        /* renamed from: i */
        public final void mo47431i(C20780b bVar) {
            C41536l.m120489i(bVar, "data");
            C24909p pVar = this.f53413d;
            C19205e eVar = this.f53414e;
            pVar.f64044h.setText(bVar.mo49330a().mo55935a());
            pVar.f64042f.setText(bVar.mo49330a().mo55935a());
            pVar.f64042f.setTitle(C32343x.m95388F("CLA.page.II.add.income.country.selected", new Object[0]));
            ListItem listItem = pVar.f64043g;
            C41536l.m120488h(listItem, "selectedListItem");
            C32343x.m95483r1(listItem, bVar.mo49331b(), false, 2, (Object) null);
            ListItem listItem2 = pVar.f64045i;
            C41536l.m120488h(listItem2, "unselectedListItem");
            boolean z = true;
            C32343x.m95483r1(listItem2, !bVar.mo49331b(), false, 2, (Object) null);
            BigDividerView bigDividerView = pVar.f64041e;
            C41536l.m120488h(bigDividerView, "divider");
            if (getBindingAdapterPosition() == eVar.getItemCount()) {
                z = false;
            }
            C32343x.m95483r1(bigDividerView, z, false, 2, (Object) null);
            pVar.mo3946b().setOnClickListener(new C19204d(eVar, bVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19205e(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "itemClicked");
        this.f53412f = lVar;
    }

    /* renamed from: l */
    public void onBindViewHolder(C19206a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47431i((C20780b) g);
    }

    /* renamed from: m */
    public C19206a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24909p d = C24909p.m79622d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19206a(this, d);
    }
}
