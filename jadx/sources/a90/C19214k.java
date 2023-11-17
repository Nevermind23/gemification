package a90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g90.C20786h;
import g91.C32343x;
import h80.C24893b0;
import kotlin.jvm.internal.C41536l;
import n41.C37353c;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p615tg.C17963d;
import ue1.C43075l;

/* renamed from: a90.k */
public final class C19214k extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f53427f;

    /* renamed from: a90.k$a */
    public final class C19215a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24893b0 f53428d;

        /* renamed from: e */
        final /* synthetic */ C19214k f53429e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19215a(C19214k kVar, C24893b0 b0Var) {
            super(b0Var.mo3946b());
            C41536l.m120489i(b0Var, "binding");
            this.f53429e = kVar;
            this.f53428d = b0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64646j(C19214k kVar, C20786h hVar, View view) {
            C41536l.m120489i(kVar, "this$0");
            C41536l.m120489i(hVar, "$data");
            kVar.f53427f.invoke(hVar.mo49364b());
        }

        /* renamed from: i */
        public final void mo47444i(C20786h hVar) {
            String str;
            C41536l.m120489i(hVar, "data");
            C24893b0 b0Var = this.f53428d;
            C19214k kVar = this.f53429e;
            if (hVar.mo49363a() == C37353c.EN) {
                str = hVar.mo49364b().mo56161e();
            } else {
                str = hVar.mo49364b().mo56159d();
            }
            b0Var.f63894h.setText(str);
            b0Var.f63892f.setText(str);
            b0Var.f63892f.setTitle(C32343x.m95388F("CLA.page.II.add.income.organization.selected", new Object[0]));
            ListItem listItem = b0Var.f63893g;
            C41536l.m120488h(listItem, "selectedListItem");
            C32343x.m95483r1(listItem, hVar.mo49365c(), false, 2, (Object) null);
            ListItem listItem2 = b0Var.f63895i;
            C41536l.m120488h(listItem2, "unselectedListItem");
            boolean z = true;
            C32343x.m95483r1(listItem2, !hVar.mo49365c(), false, 2, (Object) null);
            BigDividerView bigDividerView = b0Var.f63891e;
            C41536l.m120488h(bigDividerView, "divider");
            if (getBindingAdapterPosition() == kVar.getItemCount()) {
                z = false;
            }
            C32343x.m95483r1(bigDividerView, z, false, 2, (Object) null);
            b0Var.mo3946b().setOnClickListener(new C19213j(kVar, hVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19214k(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "itemClicked");
        this.f53427f = lVar;
    }

    /* renamed from: l */
    public void onBindViewHolder(C19215a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47444i((C20786h) g);
    }

    /* renamed from: m */
    public C19215a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24893b0 d = C24893b0.m79554d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19215a(this, d);
    }
}
