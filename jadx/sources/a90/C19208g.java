package a90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g90.C20785g;
import g91.C32343x;
import h80.C24891a0;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p615tg.C17963d;
import ue1.C43075l;

/* renamed from: a90.g */
public final class C19208g extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f53417f;

    /* renamed from: a90.g$a */
    public final class C19209a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24891a0 f53418d;

        /* renamed from: e */
        final /* synthetic */ C19208g f53419e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19209a(C19208g gVar, C24891a0 a0Var) {
            super(a0Var.mo3946b());
            C41536l.m120489i(a0Var, "binding");
            this.f53419e = gVar;
            this.f53418d = a0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64634j(C19208g gVar, C20785g gVar2, View view) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(gVar2, "$data");
            gVar.f53417f.invoke(gVar2.mo49358a());
        }

        /* renamed from: i */
        public final void mo47435i(C20785g gVar) {
            C41536l.m120489i(gVar, "data");
            C24891a0 a0Var = this.f53418d;
            C19208g gVar2 = this.f53419e;
            a0Var.f63882h.setText(C32343x.m95388F(gVar.mo49358a().mo52391a(), new Object[0]));
            a0Var.f63880f.setText(C32343x.m95388F(gVar.mo49358a().mo52391a(), new Object[0]));
            a0Var.f63880f.setTitle(C32343x.m95388F("CLA.page.II.add.income.position.selected", new Object[0]));
            ListItem listItem = a0Var.f63881g;
            C41536l.m120488h(listItem, "selectedListItem");
            C32343x.m95483r1(listItem, gVar.mo49359b(), false, 2, (Object) null);
            ListItem listItem2 = a0Var.f63883i;
            C41536l.m120488h(listItem2, "unselectedListItem");
            boolean z = true;
            C32343x.m95483r1(listItem2, !gVar.mo49359b(), false, 2, (Object) null);
            BigDividerView bigDividerView = a0Var.f63879e;
            C41536l.m120488h(bigDividerView, "divider");
            if (getBindingAdapterPosition() == gVar2.getItemCount()) {
                z = false;
            }
            C32343x.m95483r1(bigDividerView, z, false, 2, (Object) null);
            a0Var.mo3946b().setOnClickListener(new C19207f(gVar2, gVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19208g(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "itemClicked");
        this.f53417f = lVar;
    }

    /* renamed from: l */
    public void onBindViewHolder(C19209a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47435i((C20785g) g);
    }

    /* renamed from: m */
    public C19209a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24891a0 d = C24891a0.m79546d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19209a(this, d);
    }
}
