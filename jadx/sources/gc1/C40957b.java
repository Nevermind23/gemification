package gc1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10221z;
import he1.C41238w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc1.C41772a;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p615tg.C17963d;
import ua1.C28650i1;
import ua1.C28653j1;
import ue1.C43079p;

/* renamed from: gc1.b */
public final class C40957b extends C1819o {

    /* renamed from: j */
    public static final C40958a f96734j = new C40958a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C40960c f96735f;

    /* renamed from: g */
    private int f96736g;

    /* renamed from: h */
    private List f96737h = C41341q.m119907j();

    /* renamed from: i */
    private int f96738i;

    /* renamed from: gc1.b$a */
    public static final class C40958a {
        private C40958a() {
        }

        public /* synthetic */ C40958a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final String m118761c(String str) {
            if (C40440x.m117125C0(str, '-', false, 2, (Object) null)) {
                return C40445z.m117188S0(str, 1);
            }
            return '-' + str;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final String m118762d(long j) {
            String format = new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault()).format(Long.valueOf(j));
            C41536l.m120488h(format, "sdf.format(this)");
            return format;
        }
    }

    /* renamed from: gc1.b$b */
    private static final class C40959b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28650i1 f96739d;

        /* renamed from: e */
        private final C43079p f96740e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40959b(C28650i1 i1Var, C43079p pVar) {
            super(i1Var.mo3946b());
            C41536l.m120489i(i1Var, "binding");
            C41536l.m120489i(pVar, "checkedHandler");
            this.f96739d = i1Var;
            this.f96740e = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m118764j(C40959b bVar, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            bVar.f96740e.invoke(Integer.valueOf(bVar.getAdapterPosition()), Boolean.valueOf(z));
        }

        /* renamed from: i */
        public final void mo95361i(C40956a aVar) {
            C41536l.m120489i(aVar, "item");
            C28650i1 i1Var = this.f96739d;
            i1Var.f72770e.setText(aVar.mo95354f());
            i1Var.f72770e.setOnCheckedStateChangeListener(new C40964c(this));
            i1Var.f72770e.setEnabled(!aVar.mo95380c());
            i1Var.f72770e.setChecked(aVar.mo95379b());
        }
    }

    /* renamed from: gc1.b$c */
    public interface C40960c {
        /* renamed from: m0 */
        void mo95362m0(boolean z);
    }

    /* renamed from: gc1.b$d */
    private static final class C40961d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28653j1 f96741d;

        /* renamed from: e */
        private final C43079p f96742e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40961d(C28653j1 j1Var, C43079p pVar) {
            super(j1Var.mo3946b());
            C41536l.m120489i(j1Var, "binding");
            C41536l.m120489i(pVar, "checkedHandler");
            this.f96741d = j1Var;
            this.f96742e = pVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m118769k(C40961d dVar, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(dVar, "this$0");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            dVar.f96742e.invoke(Integer.valueOf(dVar.getAdapterPosition()), Boolean.valueOf(z));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m118770l(C28653j1 j1Var, View view) {
            C41536l.m120489i(j1Var, "$this_with");
            if (j1Var.f72781f.isEnabled()) {
                j1Var.f72781f.performClick();
            }
        }

        /* renamed from: j */
        public final void mo95363j(C40991q qVar) {
            int i;
            C41536l.m120489i(qVar, "item");
            C28653j1 j1Var = this.f96741d;
            ThreeLineTextItem threeLineTextItem = j1Var.f72783h;
            C40958a aVar = C40957b.f96734j;
            threeLineTextItem.setTitle(aVar.m118762d(qVar.mo95386h()));
            j1Var.f72783h.setText(aVar.m118761c(qVar.mo95389j()));
            j1Var.f72783h.setSubtitle(qVar.mo95388i());
            if (C40439w.m117109H(qVar.mo95384f(), "-", false, 2, (Object) null)) {
                i = C10221z.TextSubtitle1Black400Left;
            } else {
                i = C10221z.TextSubtitle1Positive500Left;
            }
            j1Var.f72780e.setText(C41772a.f98076a.mo96594a(qVar.mo95384f(), qVar.mo95385g()));
            C1314o.m4575q(j1Var.f72780e, i);
            j1Var.f72781f.setOnCheckedStateChangeListener(new C40965d(this));
            j1Var.f72781f.setEnabled(!qVar.mo95380c());
            j1Var.f72781f.setChecked(qVar.mo95379b());
            this.f96741d.mo3946b().setSoundEffectsEnabled(false);
            this.f96741d.mo3946b().setOnClickListener(new C40966e(j1Var));
        }
    }

    /* renamed from: gc1.b$e */
    /* synthetic */ class C40962e extends C41535k implements C43079p {
        C40962e(Object obj) {
            super(2, obj, C40957b.class, "onItemChecked", "onItemChecked(IZ)V", 0);
        }

        /* renamed from: b */
        public final void mo95364b(int i, boolean z) {
            ((C40957b) this.receiver).m118754p(i, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo95364b(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: gc1.b$f */
    /* synthetic */ class C40963f extends C41535k implements C43079p {
        C40963f(Object obj) {
            super(2, obj, C40957b.class, "onItemChecked", "onItemChecked(IZ)V", 0);
        }

        /* renamed from: b */
        public final void mo95365b(int i, boolean z) {
            ((C40957b) this.receiver).m118754p(i, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo95365b(((Number) obj).intValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40957b(C40960c cVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(cVar, "maxSelectedListener");
        this.f96735f = cVar;
    }

    /* renamed from: l */
    private final void m118752l() {
        for (C40990p pVar : this.f96737h) {
            pVar.mo95382e(!pVar.mo95379b());
        }
        notifyDataSetChanged();
    }

    /* renamed from: m */
    private final void m118753m() {
        for (C40990p e : this.f96737h) {
            e.mo95382e(false);
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final void m118754p(int i, boolean z) {
        int i2;
        C40990p pVar = (C40990p) C41358y.m120010Z(this.f96737h, i);
        if (pVar != null && pVar.mo95379b() != z) {
            pVar.mo95381d(z);
            int i3 = this.f96738i;
            if (z) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            int i4 = i3 + i2;
            this.f96738i = i4;
            int i5 = this.f96736g;
            if (i4 == i5 && z) {
                this.f96735f.mo95362m0(true);
                m118752l();
            } else if (i4 == i5 - 1 && !z) {
                this.f96735f.mo95362m0(false);
                m118753m();
            }
        }
    }

    public int getItemCount() {
        return this.f96737h.size();
    }

    public int getItemViewType(int i) {
        C40990p pVar = (C40990p) C41358y.m120010Z(this.f96737h, i);
        if (pVar == null) {
            return -1;
        }
        if (pVar instanceof C40956a) {
            return 1;
        }
        if (pVar instanceof C40991q) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: n */
    public final List mo95357n() {
        List list = this.f96737h;
        ArrayList<C40990p> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C40990p) next).mo95379b()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C40990p a : arrayList) {
            arrayList2.add(a.mo95378a());
        }
        return arrayList2;
    }

    /* renamed from: o */
    public final boolean mo95358o() {
        return this.f96738i == this.f96736g;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C40990p pVar = (C40990p) C41358y.m120010Z(this.f96737h, i);
        if (pVar != null) {
            if (f0Var instanceof C40959b) {
                ((C40959b) f0Var).mo95361i((C40956a) pVar);
            } else if (f0Var instanceof C40961d) {
                ((C40961d) f0Var).mo95363j((C40991q) pVar);
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            C28650i1 d = C28650i1.m87706d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C40959b(d, new C40962e(this));
        } else if (i == 2) {
            C28653j1 d2 = C28653j1.m87719d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C40961d(d2, new C40963f(this));
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }

    /* renamed from: q */
    public final void mo95359q(List list) {
        C41536l.m120489i(list, "data");
        this.f96737h = list;
        this.f96738i = 0;
        this.f96735f.mo95362m0(false);
        notifyDataSetChanged();
    }

    /* renamed from: r */
    public final void mo95360r(int i) {
        this.f96736g = i;
    }
}
