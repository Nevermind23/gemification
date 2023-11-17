package p341ge.bog.mobilebank.statements.presentation.statementsfilter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import g91.C32307h;
import g91.C32343x;
import java.util.HashSet;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n51.C37355a;
import o51.C37657n;
import o51.C37658o;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import q51.C38131b;
import q51.C38132c;
import v51.C39217i;
import v51.C39218j;
import v51.C39219k;
import v51.C39220l;

/* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d */
public final class C34771d extends C1819o {

    /* renamed from: h */
    public static final C34775d f84018h = new C34775d((DefaultConstructorMarker) null);

    /* renamed from: i */
    private static final C34774c f84019i = new C34774c();

    /* renamed from: f */
    private final HashSet f84020f;

    /* renamed from: g */
    private final HashSet f84021g;

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$a */
    public final class C34772a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37657n f84022d;

        /* renamed from: e */
        final /* synthetic */ C34771d f84023e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34772a(C34771d dVar, C37657n nVar) {
            super(nVar.mo3946b());
            C41536l.m120489i(nVar, "binding");
            this.f84023e = dVar;
            this.f84022d = nVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m102177k(C34771d dVar, C38131b bVar, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(bVar, "$acc");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            if (z) {
                dVar.mo84911l().add(Long.valueOf(bVar.mo91660a()));
            } else {
                dVar.mo84911l().remove(Long.valueOf(bVar.mo91660a()));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m102178l(C37657n nVar, View view) {
            C41536l.m120489i(nVar, "$this_with");
            CheckboxView checkboxView = nVar.f90510g;
            checkboxView.setChecked(!checkboxView.isChecked());
        }

        /* renamed from: j */
        public final void mo84913j(C38131b bVar) {
            C41536l.m120489i(bVar, "acc");
            C37657n nVar = this.f84022d;
            C34771d dVar = this.f84023e;
            nVar.f90509f.setText(C32343x.m95408P(bVar.mo91662c(), bVar.mo91663d()));
            nVar.f90508e.setTitle(bVar.mo91664e());
            nVar.f90508e.setText(bVar.mo91661b());
            nVar.f90510g.setChecked(dVar.mo84911l().contains(Long.valueOf(bVar.mo91660a())));
            nVar.f90510g.setOnCheckedStateChangeListener(new C39217i(dVar, bVar));
            this.f84022d.mo3946b().setOnClickListener(new C39218j(nVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$b */
    public final class C34773b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37658o f84024d;

        /* renamed from: e */
        final /* synthetic */ C34771d f84025e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34773b(C34771d dVar, C37658o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f84025e = dVar;
            this.f84024d = oVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m102182k(C34771d dVar, C38132c cVar, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(cVar, "$card");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            if (z) {
                dVar.mo84912m().add(Long.valueOf(cVar.mo91669b()));
            } else {
                dVar.mo84912m().remove(Long.valueOf(cVar.mo91669b()));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m102183l(C37658o oVar, View view) {
            C41536l.m120489i(oVar, "$this_with");
            CheckboxView checkboxView = oVar.f90514g;
            checkboxView.setChecked(!checkboxView.isChecked());
        }

        /* renamed from: j */
        public final void mo84914j(C38132c cVar) {
            C41536l.m120489i(cVar, "card");
            C37658o oVar = this.f84024d;
            C34771d dVar = this.f84025e;
            oVar.f90512e.setImageResource(C37355a.f89808a);
            C2379b.m9210t(this.f84024d.f90512e.getContext()).mo7757y(C32289b0.m95091c(cVar.mo91670c())).mo7718L0(this.f84024d.f90512e);
            oVar.f90513f.setTitle(cVar.mo91668a());
            oVar.f90513f.setText(C32307h.m95232i(cVar.mo91671d()));
            oVar.f90514g.setChecked(dVar.mo84912m().contains(Long.valueOf(cVar.mo91669b())));
            oVar.f90514g.setOnCheckedStateChangeListener(new C39219k(dVar, cVar));
            this.f84024d.mo3946b().setOnClickListener(new C39220l(oVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$c */
    public static final class C34774c extends C1796h.C1802f {
        C34774c() {
        }

        /* renamed from: d */
        public boolean mo5976a(C34776e eVar, C34776e eVar2) {
            C41536l.m120489i(eVar, "oldItem");
            C41536l.m120489i(eVar2, "newItem");
            return C41536l.m120484d(eVar, eVar2);
        }

        /* renamed from: e */
        public boolean mo5977b(C34776e eVar, C34776e eVar2) {
            C41536l.m120489i(eVar, "oldItem");
            C41536l.m120489i(eVar2, "newItem");
            return C41536l.m120484d(eVar, eVar2);
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$d */
    public static final class C34775d {
        private C34775d() {
        }

        public /* synthetic */ C34775d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$e */
    public static abstract class C34776e {

        /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$e$a */
        public static final class C34777a extends C34776e {

            /* renamed from: a */
            private final C38131b f84026a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34777a(C38131b bVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(bVar, "acc");
                this.f84026a = bVar;
            }

            /* renamed from: a */
            public final C38131b mo84917a() {
                return this.f84026a;
            }
        }

        /* renamed from: ge.bog.mobilebank.statements.presentation.statementsfilter.d$e$b */
        public static final class C34778b extends C34776e {

            /* renamed from: a */
            private final C38132c f84027a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C34778b(C38132c cVar) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(cVar, "cardItem");
                this.f84027a = cVar;
            }

            /* renamed from: a */
            public final C38132c mo84918a() {
                return this.f84027a;
            }
        }

        private C34776e() {
        }

        public /* synthetic */ C34776e(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34771d(HashSet hashSet, HashSet hashSet2) {
        super(f84019i);
        C41536l.m120489i(hashSet, "selectedAccs");
        C41536l.m120489i(hashSet2, "selectedCards");
        this.f84020f = hashSet;
        this.f84021g = hashSet2;
    }

    public int getItemViewType(int i) {
        C34776e eVar = (C34776e) mo6027g(i);
        if (eVar instanceof C34776e.C34777a) {
            return 1;
        }
        if (eVar instanceof C34776e.C34778b) {
            return 2;
        }
        throw new IllegalStateException("Unknown item at position: " + i);
    }

    /* renamed from: k */
    public final void mo84910k() {
        this.f84021g.clear();
        this.f84020f.clear();
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final HashSet mo84911l() {
        return this.f84020f;
    }

    /* renamed from: m */
    public final HashSet mo84912m() {
        return this.f84021g;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C34776e eVar = (C34776e) mo6027g(i);
        if (eVar instanceof C34776e.C34777a) {
            ((C34772a) f0Var).mo84913j(((C34776e.C34777a) eVar).mo84917a());
        } else if (eVar instanceof C34776e.C34778b) {
            ((C34773b) f0Var).mo84914j(((C34776e.C34778b) eVar).mo84918a());
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            C37657n d = C37657n.m110720d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C34772a(this, d);
        } else if (i == 2) {
            C37658o d2 = C37658o.m110724d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C34773b(this, d2);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}
