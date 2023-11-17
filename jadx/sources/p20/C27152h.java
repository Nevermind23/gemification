package p20;

import a30.C19158c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import g91.C32343x;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;
import p90.C27403q5;
import ue1.C43079p;

/* renamed from: p20.h */
public final class C27152h extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f68146d = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f68147e = -1;

    /* renamed from: f */
    private C43079p f68148f;

    /* renamed from: p20.h$a */
    public final class C27153a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27403q5 f68149d;

        /* renamed from: e */
        final /* synthetic */ C27152h f68150e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C27153a(C27152h hVar, C27403q5 q5Var) {
            super(q5Var.mo3946b());
            C41536l.m120489i(q5Var, "contactBinding");
            this.f68150e = hVar;
            this.f68149d = q5Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m84131j(C43079p pVar, C19158c cVar, View view) {
            C41536l.m120489i(cVar, "$contactModel");
            if (pVar != null) {
                pVar.invoke(cVar, Boolean.valueOf(cVar.mo47374f()));
            }
        }

        /* renamed from: i */
        public final void mo66453i(C19158c cVar, C43079p pVar) {
            boolean z;
            C41536l.m120489i(cVar, "contactModel");
            C27403q5 q5Var = this.f68149d;
            C27152h hVar = this.f68150e;
            q5Var.f69610f.setText(cVar.mo47368a());
            q5Var.f69611g.setText(cVar.mo47370c());
            TextView textView = q5Var.f69611g;
            C41536l.m120488h(textView, "nicknameText");
            boolean z2 = true;
            if (cVar.mo47370c() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, z, false, 2, (Object) null);
            q5Var.f69609e.setImageDrawable((Drawable) null);
            C2379b.m9210t(q5Var.f69609e.getContext()).mo7742m(q5Var.f69609e);
            if (cVar.mo47372e() != null) {
                C32289b0.m95097i(q5Var.f69609e, cVar.mo47372e());
            } else {
                q5Var.f69609e.setImageResource(cVar.mo47369b());
            }
            q5Var.mo3946b().setOnClickListener(new C27151g(pVar, cVar));
            mo66454k(cVar.mo47374f());
            if (!cVar.mo47374f() && cVar.mo47371d() != hVar.f68147e) {
                z2 = false;
            }
            mo66455l(z2);
        }

        /* renamed from: k */
        public final void mo66454k(boolean z) {
            this.f68149d.f69612h.setChecked(z);
        }

        /* renamed from: l */
        public final void mo66455l(boolean z) {
            int i;
            Context context = this.itemView.getContext();
            View view = this.itemView;
            if (z) {
                i = C0767a.m2893c(context, C10318g.color_invert_background_popup);
            } else {
                i = C0767a.m2893c(context, C10318g.f28625J0);
            }
            view.setBackgroundColor(i);
        }
    }

    /* renamed from: g */
    private final void m84121g(long j, boolean z) {
        long j2;
        boolean z2;
        if (z) {
            j2 = -1;
        } else {
            j2 = j;
        }
        this.f68147e = j2;
        Iterator it = this.f68146d.iterator();
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((C19158c) it.next()).mo47371d() == j) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            z3 = true;
        }
        if (!z3) {
            valueOf = null;
        }
        if (valueOf != null) {
            notifyItemChanged(valueOf.intValue(), new C27154b((Boolean) null, Boolean.valueOf(!z), 1, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m84122h(C27152h hVar, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        hVar.m84121g(j, z);
    }

    public int getItemCount() {
        return this.f68146d.size();
    }

    /* renamed from: i */
    public final void mo66446i() {
        m84121g(this.f68147e, true);
    }

    /* renamed from: j */
    public final void mo66447j(long j) {
        m84122h(this, j, false, 2, (Object) null);
    }

    /* renamed from: k */
    public void onBindViewHolder(C27153a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo66453i((C19158c) this.f68146d.get(i), this.f68148f);
    }

    /* renamed from: l */
    public void onBindViewHolder(C27153a aVar, int i, List list) {
        boolean z;
        C41536l.m120489i(aVar, "holder");
        C41536l.m120489i(list, "payloads");
        if (list.isEmpty()) {
            onBindViewHolder(aVar, i);
            return;
        }
        boolean z2 = false;
        Object obj = list.get(0);
        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.moneyrequest.adapter.MoneyRequestContactAdapter.PartialUpdateData");
        C27154b bVar = (C27154b) obj;
        Boolean a = bVar.mo66456a();
        Boolean b = bVar.mo66457b();
        if (a != null) {
            boolean booleanValue = a.booleanValue();
            aVar.mo66454k(booleanValue);
            if (booleanValue || ((C19158c) this.f68146d.get(i)).mo47371d() == this.f68147e) {
                z = true;
            } else {
                z = false;
            }
            aVar.mo66455l(z);
        }
        if (b != null) {
            if (b.booleanValue() || ((C19158c) this.f68146d.get(i)).mo47374f()) {
                z2 = true;
            }
            aVar.mo66455l(z2);
        }
    }

    /* renamed from: m */
    public C27153a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27403q5 d = C27403q5.m84916d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C27153a(this, d);
    }

    /* renamed from: n */
    public final void mo66451n(C43079p pVar) {
        C41536l.m120489i(pVar, "selectionListener");
        this.f68148f = pVar;
    }

    /* renamed from: o */
    public final void mo66452o(List list) {
        C41536l.m120489i(list, "newContacts");
        C1796h.C1801e b = C1796h.m6928b(new C27150f(this.f68146d, list));
        C41536l.m120488h(b, "calculateDiff(diffCallback)");
        this.f68146d = list;
        b.mo5975c(this);
    }

    /* renamed from: p20.h$b */
    public static final class C27154b {

        /* renamed from: a */
        private final Boolean f68151a;

        /* renamed from: b */
        private final Boolean f68152b;

        public C27154b(Boolean bool, Boolean bool2) {
            this.f68151a = bool;
            this.f68152b = bool2;
        }

        /* renamed from: a */
        public final Boolean mo66456a() {
            return this.f68151a;
        }

        /* renamed from: b */
        public final Boolean mo66457b() {
            return this.f68152b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27154b)) {
                return false;
            }
            C27154b bVar = (C27154b) obj;
            return C41536l.m120484d(this.f68151a, bVar.f68151a) && C41536l.m120484d(this.f68152b, bVar.f68152b);
        }

        public int hashCode() {
            Boolean bool = this.f68151a;
            int i = 0;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.f68152b;
            if (bool2 != null) {
                i = bool2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            Boolean bool = this.f68151a;
            Boolean bool2 = this.f68152b;
            return "PartialUpdateData(isContactSelected=" + bool + ", highlightContactBackground=" + bool2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C27154b(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
        }
    }
}
