package p377ch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p352ak.C9987p;
import p392dh.C12128a;
import p392dh.C12129b;
import p615tg.C17963d;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ch.c */
public final class C10439c extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10440a f29729f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12129b f29730g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final boolean f29731h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List f29732i = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C10441b f29733j;

    /* renamed from: k */
    private C43075l f29734k;

    /* renamed from: ch.c$a */
    public enum C10440a {
        NONE,
        CHECK_ONE,
        CHECK_MULTIPLE
    }

    /* renamed from: ch.c$b */
    public interface C10441b {
        /* renamed from: a */
        void mo26879a(Object obj);
    }

    /* renamed from: ch.c$c */
    public final class C10442c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9987p f29739d;

        /* renamed from: e */
        final /* synthetic */ C10439c f29740e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10442c(C10439c cVar, C9987p pVar) {
            super(pVar.mo3946b());
            boolean z;
            C41536l.m120489i(pVar, "binding");
            this.f29740e = cVar;
            this.f29739d = pVar;
            CheckboxView checkboxView = pVar.f27377e;
            C41536l.m120488h(checkboxView, "binding.checkBox");
            int i = 1;
            if (cVar.f29729f != C10440a.NONE) {
                z = true;
            } else {
                z = false;
            }
            C18368l.m62751F(checkboxView, z, false, 2, (Object) null);
            pVar.f27378f.setMaxLines(cVar.f29731h ? Integer.MAX_VALUE : i);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m37935l(CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m37936m(C10442c cVar, C12128a aVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(aVar, "$item");
            cVar.m37938o(aVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m37937n(C10439c cVar, C10442c cVar2, C12128a aVar, CompoundButton compoundButton, boolean z, boolean z2) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(cVar2, "this$1");
            C41536l.m120489i(aVar, "$item");
            C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
            if (cVar.f29729f != C10440a.NONE) {
                cVar2.m37938o(aVar);
            }
        }

        /* renamed from: o */
        private final void m37938o(C12128a aVar) {
            boolean z;
            C10441b n = this.f29740e.f29733j;
            if (n != null) {
                n.mo26879a(aVar);
            }
            if (this.f29740e.f29729f == C10440a.CHECK_ONE) {
                int i = 0;
                for (Object next : this.f29740e.f29732i) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C41341q.m119917t();
                    }
                    C12128a aVar2 = (C12128a) next;
                    if (i == aVar.mo32320c()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar2.mo32324f(z);
                    i = i2;
                }
                this.f29740e.m37923w();
            } else if (this.f29740e.f29729f == C10440a.CHECK_MULTIPLE) {
                aVar.mo32324f(!aVar.mo32322e());
                this.f29740e.m37923w();
            }
        }

        /* renamed from: k */
        public final void mo27106k(C12128a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "item");
            this.f29739d.f27377e.setOnCheckedStateChangeListener(new C10443d());
            Object d = aVar.mo32321d();
            this.f29739d.f27378f.setText(this.f29740e.f29730g.mo26885a(d));
            String b = this.f29740e.f29730g.mo26886b(d);
            AppCompatTextView appCompatTextView = this.f29739d.f27379g;
            C41536l.m120488h(appCompatTextView, "binding.itemTextRight");
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
            C18368l.m62751F(appCompatTextView, z, false, 2, (Object) null);
            this.f29739d.f27379g.setText(b);
            this.f29739d.mo3946b().setOnClickListener(new C10444e(this, aVar));
            this.f29739d.f27377e.setChecked(aVar.mo32322e());
            this.f29739d.f27377e.setOnCheckedStateChangeListener(new C10445f(this.f29740e, this, aVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10439c(C10440a aVar, C12129b bVar, boolean z) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "checkingType");
        C41536l.m120489i(bVar, "textAdapter");
        this.f29729f = aVar;
        this.f29730g = bVar;
        this.f29731h = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m37923w() {
        C43075l lVar = this.f29734k;
        if (lVar != null) {
            C41536l.m120486f(lVar);
            mo27100q(lVar);
            return;
        }
        notifyDataSetChanged();
    }

    /* renamed from: q */
    public final void mo27100q(C43075l lVar) {
        C41536l.m120489i(lVar, "filter");
        List list = this.f29732i;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) lVar.invoke(((C12128a) next).mo32321d())).booleanValue()) {
                arrayList.add(next);
            }
        }
        mo6029i(arrayList);
        this.f29734k = lVar;
    }

    /* renamed from: r */
    public final List mo27101r() {
        List list = this.f29732i;
        ArrayList<C12128a> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C12128a) next).mo32322e()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C12128a d : arrayList) {
            arrayList2.add(d.mo32321d());
        }
        return arrayList2;
    }

    /* renamed from: s */
    public void onBindViewHolder(C10442c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        cVar.mo27106k((C12128a) g);
    }

    /* renamed from: t */
    public C10442c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9987p d = C9987p.m36629d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C10442c(this, d);
    }

    /* renamed from: u */
    public final void mo27104u(List list) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            arrayList.add(C12128a.m44483b((C12128a) next, (Object) null, false, i, 3, (Object) null));
            i = i2;
        }
        this.f29732i = arrayList;
        mo6029i(arrayList);
    }

    /* renamed from: v */
    public final void mo27105v(C10441b bVar) {
        C41536l.m120489i(bVar, "onItemClickedListener");
        this.f29733j = bVar;
    }
}
