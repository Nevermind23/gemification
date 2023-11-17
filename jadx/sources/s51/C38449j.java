package s51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import he1.C41238w;
import iy0.C36643v1;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import o31.C37599g;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import q51.C38130a;
import ue1.C43075l;

/* renamed from: s51.j */
public final class C38449j extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f92100f;

    /* renamed from: s51.j$a */
    public static final class C38450a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36643v1 f92101d;

        /* renamed from: e */
        private final C43075l f92102e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38450a(C36643v1 v1Var, C43075l lVar) {
            super(v1Var.mo3946b());
            C41536l.m120489i(v1Var, "binding");
            this.f92101d = v1Var;
            this.f92102e = lVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m112882j(C38130a aVar, C38450a aVar2, View view) {
            C43075l lVar;
            C41536l.m120489i(aVar, "$data");
            C41536l.m120489i(aVar2, "this$0");
            if (!aVar.mo91657g() && (lVar = aVar2.f92102e) != null) {
                lVar.invoke(aVar);
            }
        }

        /* renamed from: i */
        public final void mo92009i(C38130a aVar, boolean z) {
            C41536l.m120489i(aVar, "data");
            TwoLineTextItem twoLineTextItem = this.f92101d.f88444e;
            String b = aVar.mo91651b();
            if (b == null) {
                b = aVar.mo91654e();
            }
            twoLineTextItem.setTitle(b);
            this.f92101d.f88444e.setText(C32343x.m95410Q(aVar.mo91652c(), aVar.mo91653d(), false, 2, (Object) null));
            if (aVar.mo91657g()) {
                this.f92101d.f88444e.setEnabled(false);
            }
            this.f92101d.mo3946b().setOnClickListener(new C38448i(aVar, this));
            View view = this.f92101d.f88445f;
            C41536l.m120488h(view, "binding.separator");
            C32343x.m95483r1(view, !z, false, 2, (Object) null);
        }
    }

    /* renamed from: s51.j$b */
    static final class C38451b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38449j f92103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38451b(C38449j jVar) {
            super(1);
            this.f92103d = jVar;
        }

        /* renamed from: a */
        public final void mo92010a(C38130a aVar) {
            C41536l.m120489i(aVar, "it");
            C43075l k = this.f92103d.f92100f;
            if (k != null) {
                k.invoke(aVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92010a((C38130a) obj);
            return C41238w.f97225a;
        }
    }

    public C38449j(C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        this.f92100f = lVar;
    }

    /* renamed from: l */
    public void onBindViewHolder(C38450a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        C38130a aVar2 = (C38130a) g;
        boolean z = true;
        if (i != mo6026f().size() - 1) {
            z = false;
        }
        aVar.mo92009i(aVar2, z);
    }

    /* renamed from: m */
    public C38450a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36643v1 d = C36643v1.m108708d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C38450a(d, new C38451b(this));
    }
}
