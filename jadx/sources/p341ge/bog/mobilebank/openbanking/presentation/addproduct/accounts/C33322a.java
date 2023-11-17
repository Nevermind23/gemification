package p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31205e;
import bv0.C31207g;
import ev0.C31839t;
import ev0.C31840u;
import ev0.C31841v;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.C33326b;
import p630ui.C18168a;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.a */
public final class C33322a extends C1819o {

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.a$a */
    public final class C33323a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31839t f81444d;

        /* renamed from: e */
        private final C18168a f81445e;

        /* renamed from: f */
        private final C18168a f81446f;

        /* renamed from: g */
        private final C18168a f81447g;

        /* renamed from: h */
        final /* synthetic */ C33322a f81448h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33323a(C33322a aVar, C31839t tVar) {
            super(tVar.mo3946b());
            C41536l.m120489i(tVar, "binding");
            this.f81448h = aVar;
            this.f81444d = tVar;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f81445e = new C18168a(context, C31207g.LayerRadiusTop40Shadow20);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f81446f = new C18168a(context2, C31207g.LayerRadiusBottom40Shadow20);
            Context context3 = this.itemView.getContext();
            C41536l.m120488h(context3, "itemView.context");
            this.f81447g = new C18168a(context3, C31207g.f77549a);
        }

        /* renamed from: h */
        public final void mo79133h(C33326b.C33327a aVar, boolean z, boolean z2) {
            C41536l.m120489i(aVar, "account");
            this.f81444d.f78542f.setTitle(aVar.mo79136b());
            this.f81444d.f78542f.setText(aVar.mo79135a());
            View view = this.f81444d.f78541e;
            C41536l.m120488h(view, "binding.separator");
            C32343x.m95483r1(view, !z2, false, 2, (Object) null);
            if (!z && !z2) {
                C18168a aVar2 = this.f81447g;
                LayerView c = this.f81444d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                aVar2.mo45824a(c);
            } else if (z && !z2) {
                C18168a aVar3 = this.f81445e;
                LayerView c2 = this.f81444d.mo3946b();
                C41536l.m120488h(c2, "binding.root");
                aVar3.mo45824a(c2);
            } else if (!z && z2) {
                C18168a aVar4 = this.f81446f;
                LayerView c3 = this.f81444d.mo3946b();
                C41536l.m120488h(c3, "binding.root");
                aVar4.mo45824a(c3);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.a$b */
    public final class C33324b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31840u f81449d;

        /* renamed from: e */
        final /* synthetic */ C33322a f81450e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33324b(C33322a aVar, C31840u uVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            this.f81450e = aVar;
            this.f81449d = uVar;
        }

        /* renamed from: h */
        public final void mo79134h(C33326b.C33329c cVar) {
            C41536l.m120489i(cVar, "header");
            this.f81449d.f78544e.setText(C32343x.m95388F("open.bank.add.bank.result.page.desc", new Object[0]));
            this.f81449d.f78544e.setTitle(cVar.mo79140a());
            this.f81449d.f78544e.setDrawableSrc(Integer.valueOf(cVar.mo79141b()));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.addproduct.accounts.a$c */
    public static final class C33325c extends RecyclerView.C1734f0 {
        C33325c(LayerView layerView) {
            super(layerView);
        }
    }

    public C33322a() {
        super(C37599g.f90345a.mo90787d());
    }

    public int getItemViewType(int i) {
        C33326b bVar = (C33326b) mo6027g(i);
        if (bVar instanceof C33326b.C33329c) {
            return C31205e.item_open_bank_accounts_header;
        }
        if (bVar instanceof C33326b.C33327a) {
            return C31205e.item_open_bank_account;
        }
        if (bVar instanceof C33326b.C33328b) {
            return C31205e.item_open_bank_accounts_loading;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        boolean z;
        C41536l.m120489i(f0Var, "holder");
        C33326b bVar = (C33326b) mo6027g(i);
        if (bVar instanceof C33326b.C33329c) {
            ((C33324b) f0Var).mo79134h((C33326b.C33329c) bVar);
        } else if (bVar instanceof C33326b.C33327a) {
            C33323a aVar = (C33323a) f0Var;
            C33326b.C33327a aVar2 = (C33326b.C33327a) bVar;
            boolean z2 = false;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i == getItemCount() - 1) {
                z2 = true;
            }
            aVar.mo79133h(aVar2, z, z2);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C31205e.item_open_bank_accounts_header) {
            C31840u d = C31840u.m94150d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C33324b(this, d);
        } else if (i == C31205e.item_open_bank_account) {
            C31839t d2 = C31839t.m94146d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C33323a(this, d2);
        } else if (i == C31205e.item_open_bank_accounts_loading) {
            return new C33325c(C31841v.m94154d(from, viewGroup, false).mo3946b());
        } else {
            throw new UnsupportedOperationException("Unknown view type, viewType: " + i);
        }
    }
}
