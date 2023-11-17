package ln0;

import an0.C10107c;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.C1819o;
import en0.C12720f;
import en0.C12721g;
import g91.C32343x;
import ie1.C41324h0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import o31.C37626z;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.input.Input;
import p615tg.C17963d;
import ue1.C43075l;

/* renamed from: ln0.q */
public final class C16618q extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f46801f;

    /* renamed from: g */
    private final C43075l f46802g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C43075l f46803h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f46804i = "";
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Set f46805j = new LinkedHashSet();

    /* renamed from: k */
    private int f46806k = -1;

    /* renamed from: l */
    private int f46807l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C16623c f46808m = new C16623c(this);

    /* renamed from: ln0.q$a */
    public final class C16619a extends C37626z {

        /* renamed from: e */
        private final C16620a f46809e;

        /* renamed from: f */
        final /* synthetic */ C16618q f46810f;

        /* renamed from: ln0.q$a$a */
        public static final class C16620a implements CheckboxView.C13222b {

            /* renamed from: a */
            private C16625s f46811a;

            /* renamed from: b */
            final /* synthetic */ C16618q f46812b;

            /* renamed from: c */
            final /* synthetic */ C12721g f46813c;

            /* renamed from: d */
            final /* synthetic */ C16619a f46814d;

            C16620a(C16618q qVar, C12721g gVar, C16619a aVar) {
                this.f46812b = qVar;
                this.f46813c = gVar;
                this.f46814d = aVar;
            }

            /* renamed from: a */
            public void mo27107a(CompoundButton compoundButton, boolean z, boolean z2) {
                C41536l.m120489i(compoundButton, "button");
                C16625s sVar = this.f46811a;
                if (sVar != null) {
                    C16618q qVar = this.f46812b;
                    C12721g gVar = this.f46813c;
                    C16619a aVar = this.f46814d;
                    qVar.m58927w(sVar);
                    Input input = gVar.f37644h;
                    C41536l.m120488h(input, "binding.noteInput");
                    C32343x.m95483r1(input, z, false, 2, (Object) null);
                    if (z) {
                        qVar.f46803h.invoke(Integer.valueOf(aVar.getAbsoluteAdapterPosition()));
                    }
                }
            }

            /* renamed from: b */
            public final void mo43763b(C16625s sVar) {
                this.f46811a = sVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16619a(C16618q qVar, C12721g gVar) {
            super(gVar);
            C41536l.m120489i(gVar, "binding");
            this.f46810f = qVar;
            C16620a aVar = new C16620a(qVar, gVar, this);
            this.f46809e = aVar;
            gVar.f37641e.setOnCheckedStateChangeListener(aVar);
            gVar.f37643g.setOnClickListener(new C16617p(gVar));
            gVar.f37644h.getTextInput().addTextChangedListener(qVar.f46808m);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58932j(C12721g gVar, View view) {
            C41536l.m120489i(gVar, "$binding");
            gVar.f37641e.toggle();
        }

        /* renamed from: k */
        public final void mo43762k(C16625s sVar) {
            C41536l.m120489i(sVar, "item");
            boolean contains = this.f46810f.f46805j.contains(Integer.valueOf(sVar.mo43771a()));
            this.f46809e.mo43763b((C16625s) null);
            this.f46810f.f46808m.mo43766a((C16625s) null);
            ((C12721g) mo90806h()).f37641e.setChecked(contains);
            ((C12721g) mo90806h()).f37642f.setText(sVar.mo43773c());
            ((C12721g) mo90806h()).f37644h.setInputText(this.f46810f.f46804i);
            Input input = ((C12721g) mo90806h()).f37644h;
            C41536l.m120488h(input, "binding.noteInput");
            C32343x.m95483r1(input, contains, false, 2, (Object) null);
            this.f46810f.f46808m.mo43766a(sVar);
            this.f46809e.mo43763b(sVar);
        }
    }

    /* renamed from: ln0.q$b */
    public final class C16621b extends C37626z {

        /* renamed from: e */
        private final C16622a f46815e;

        /* renamed from: f */
        final /* synthetic */ C16618q f46816f;

        /* renamed from: ln0.q$b$a */
        public static final class C16622a implements CheckboxView.C13222b {

            /* renamed from: a */
            private C16625s f46817a;

            /* renamed from: b */
            final /* synthetic */ C16618q f46818b;

            C16622a(C16618q qVar) {
                this.f46818b = qVar;
            }

            /* renamed from: a */
            public void mo27107a(CompoundButton compoundButton, boolean z, boolean z2) {
                C41536l.m120489i(compoundButton, "button");
                C16625s sVar = this.f46817a;
                if (sVar != null) {
                    this.f46818b.m58927w(sVar);
                }
            }

            /* renamed from: b */
            public final void mo43765b(C16625s sVar) {
                this.f46817a = sVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16621b(C16618q qVar, C12720f fVar) {
            super(fVar);
            C41536l.m120489i(fVar, "binding");
            this.f46816f = qVar;
            C16622a aVar = new C16622a(qVar);
            this.f46815e = aVar;
            fVar.f37638e.setOnCheckedStateChangeListener(aVar);
            fVar.mo3946b().setOnClickListener(new C16624r(fVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58937j(C12720f fVar, View view) {
            C41536l.m120489i(fVar, "$binding");
            fVar.f37638e.toggle();
        }

        /* renamed from: k */
        public final void mo43764k(C16625s sVar) {
            C41536l.m120489i(sVar, "item");
            this.f46815e.mo43765b((C16625s) null);
            ((C12720f) mo90806h()).f37638e.setChecked(this.f46816f.f46805j.contains(Integer.valueOf(sVar.mo43771a())));
            ((C12720f) mo90806h()).f37639f.setText(sVar.mo43773c());
            this.f46815e.mo43765b(sVar);
        }
    }

    /* renamed from: ln0.q$c */
    public static final class C16623c implements TextWatcher {

        /* renamed from: d */
        private C16625s f46819d;

        /* renamed from: e */
        final /* synthetic */ C16618q f46820e;

        C16623c(C16618q qVar) {
            this.f46820e = qVar;
        }

        /* renamed from: a */
        public final void mo43766a(C16625s sVar) {
            this.f46819d = sVar;
        }

        public void afterTextChanged(Editable editable) {
            if (this.f46819d != null) {
                C16618q qVar = this.f46820e;
                qVar.f46804i = String.valueOf(editable);
                qVar.f46801f.invoke(qVar.f46804i);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16618q(C43075l lVar, C43075l lVar2, C43075l lVar3) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "onNoteEntered");
        C41536l.m120489i(lVar2, "onCheckedItemsChange");
        C41536l.m120489i(lVar3, "scrollToPosition");
        this.f46801f = lVar;
        this.f46802g = lVar2;
        this.f46803h = lVar3;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m58926v(C16618q qVar, String str, List list, Set set) {
        C41536l.m120489i(qVar, "this$0");
        C41536l.m120489i(str, "$note");
        C41536l.m120489i(list, "$items");
        C41536l.m120489i(set, "$selectedIds");
        if (!C41536l.m120484d(qVar.f46804i, str)) {
            qVar.f46804i = str;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (((C16625s) it.next()).mo43774d()) {
                    break;
                } else {
                    i++;
                }
            }
            qVar.notifyItemChanged(i);
        }
        if (qVar.f46805j.size() != set.size() || !qVar.f46805j.containsAll(set)) {
            qVar.f46805j.clear();
            qVar.f46805j.addAll(set);
            qVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m58927w(C16625s sVar) {
        boolean z;
        boolean z2 = !this.f46805j.contains(Integer.valueOf(sVar.mo43771a()));
        boolean contains = this.f46805j.contains(Integer.valueOf(this.f46807l));
        if (z2) {
            if (sVar.mo43772b()) {
                Iterator it = this.f46805j.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    it.remove();
                    List f = mo6026f();
                    C41536l.m120488h(f, "currentList");
                    Iterator it2 = f.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((C16625s) it2.next()).mo43771a() == intValue) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        i++;
                    }
                    notifyItemChanged(i);
                }
            } else if (contains) {
                this.f46805j.remove(Integer.valueOf(this.f46807l));
                notifyItemChanged(this.f46806k);
            }
            this.f46805j.add(Integer.valueOf(sVar.mo43771a()));
        } else {
            this.f46805j.remove(Integer.valueOf(sVar.mo43771a()));
        }
        this.f46802g.invoke(this.f46805j);
    }

    public int getItemViewType(int i) {
        if (((C16625s) mo6027g(i)).mo43774d()) {
            return C10107c.item_income_source_with_note;
        }
        return C10107c.item_income_source;
    }

    /* renamed from: s */
    public void onBindViewHolder(C37626z zVar, int i) {
        C41536l.m120489i(zVar, "holder");
        if (zVar instanceof C16621b) {
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            ((C16621b) zVar).mo43764k((C16625s) g);
        } else if (zVar instanceof C16619a) {
            Object g2 = mo6027g(i);
            C41536l.m120488h(g2, "getItem(position)");
            ((C16619a) zVar).mo43762k((C16625s) g2);
        }
    }

    /* renamed from: t */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C10107c.item_income_source) {
            C12720f d = C12720f.m48274d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C16621b(this, d);
        } else if (i == C10107c.item_income_source_with_note) {
            C12721g d2 = C12721g.m48278d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C16619a(this, d2);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }

    /* renamed from: u */
    public final void mo43761u(List list, Set set, String str) {
        Object obj;
        C41536l.m120489i(list, "items");
        C41536l.m120489i(set, "selectedIds");
        C41536l.m120489i(str, "note");
        Iterator it = C41358y.m119995F0(list).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C16625s) ((C41324h0) obj).mo95946d()).mo43772b()) {
                break;
            }
        }
        C41324h0 h0Var = (C41324h0) obj;
        if (h0Var != null) {
            this.f46806k = h0Var.mo95943a();
            this.f46807l = ((C16625s) h0Var.mo95944b()).mo43771a();
        }
        mo6030j(list, new C16616o(this, str, list, set));
    }
}
