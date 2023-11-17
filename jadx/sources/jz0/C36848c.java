package jz0;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41238w;
import hy0.C36270d;
import hy0.C36274h;
import iy0.C36600h0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import o31.C37599g;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.creditcardwidget.CreditCardWidgetDoubleButtonView;
import p683yh.C18917a;
import sz0.C38608b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: jz0.c */
public final class C36848c extends C1819o {

    /* renamed from: f */
    private C43075l f88931f;

    /* renamed from: g */
    private C43079p f88932g;

    /* renamed from: jz0.c$a */
    public final class C36849a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36600h0 f88933d;

        /* renamed from: e */
        private C43075l f88934e;

        /* renamed from: f */
        private C43079p f88935f;

        /* renamed from: g */
        final /* synthetic */ C36848c f88936g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36849a(C36848c cVar, C36600h0 h0Var) {
            super(h0Var.mo3946b());
            C41536l.m120489i(h0Var, "binding");
            this.f88936g = cVar;
            this.f88933d = h0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m109204k(C36849a aVar, C38608b bVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(bVar, "$data");
            C43079p pVar = aVar.f88935f;
            if (pVar != null) {
                pVar.invoke(Long.valueOf(bVar.mo92235a().mo46921c()), Boolean.valueOf(!bVar.mo92235a().mo46932l()));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m109205l(C38608b bVar, C36849a aVar, View view) {
            C43075l lVar;
            C41536l.m120489i(bVar, "$data");
            C41536l.m120489i(aVar, "this$0");
            if (bVar.mo92235a().mo46932l() && (lVar = aVar.f88934e) != null) {
                lVar.invoke(Long.valueOf(bVar.mo92235a().mo46921c()));
            }
        }

        /* renamed from: j */
        public final void mo89773j(C38608b bVar) {
            boolean z;
            String str;
            C38608b bVar2 = bVar;
            C41536l.m120489i(bVar2, "data");
            CreditCardWidgetDoubleButtonView creditCardWidgetDoubleButtonView = this.f88933d.f88249e;
            C18917a a = bVar.mo92235a();
            if (!bVar.mo92235a().mo46932l() || C41536l.m120484d(bVar.mo92236b(), "E")) {
                z = false;
            } else {
                z = true;
            }
            creditCardWidgetDoubleButtonView.setInfoData(C18917a.m63970b(a, 0, (String) null, (Image) null, (String) null, false, (String) null, false, false, z, (String) null, (String) null, (Integer) null, 3839, (Object) null));
            creditCardWidgetDoubleButtonView.getSecondButton().setVisibility(8);
            Button firstButton = creditCardWidgetDoubleButtonView.getFirstButton();
            if (bVar.mo92235a().mo46932l()) {
                str = creditCardWidgetDoubleButtonView.getFirstButton().getContext().getString(C36274h.card_details_label);
            } else {
                str = creditCardWidgetDoubleButtonView.getFirstButton().getContext().getString(C36274h.activate_label);
            }
            firstButton.setButtonText(str);
            if (bVar.mo92235a().mo46932l()) {
                creditCardWidgetDoubleButtonView.getFirstButton().setEnabled(!bVar.mo92237c());
                creditCardWidgetDoubleButtonView.getFirstButton().setButtonIcon(C0767a.m2895e(creditCardWidgetDoubleButtonView.getFirstButton().getContext(), C36270d.f87474k));
            } else {
                creditCardWidgetDoubleButtonView.getFirstButton().setButtonIcon((Drawable) null);
            }
            creditCardWidgetDoubleButtonView.getFirstButton().setOnClickListener(new C36846a(this, bVar2));
            C36847b bVar3 = new C36847b(bVar2, this);
            this.f88933d.f88249e.setChevronClickListener(bVar3);
            creditCardWidgetDoubleButtonView.setOnClickListener(bVar3);
        }

        /* renamed from: m */
        public final void mo89774m(C43079p pVar) {
            this.f88935f = pVar;
        }

        /* renamed from: n */
        public final void mo89775n(C43075l lVar) {
            this.f88934e = lVar;
        }
    }

    /* renamed from: jz0.c$b */
    static final class C36850b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36848c f88937d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36850b(C36848c cVar) {
            super(1);
            this.f88937d = cVar;
        }

        /* renamed from: a */
        public final void mo89776a(long j) {
            C43075l k = this.f88937d.mo89767k();
            if (k != null) {
                k.invoke(Long.valueOf(j));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89776a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: jz0.c$c */
    static final class C36851c extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C36848c f88938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36851c(C36848c cVar) {
            super(2);
            this.f88938d = cVar;
        }

        /* renamed from: a */
        public final void mo89777a(long j, boolean z) {
            C43079p l = this.f88938d.mo89768l();
            if (l != null) {
                l.invoke(Long.valueOf(j), Boolean.valueOf(z));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo89777a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    public C36848c() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public final C43075l mo89767k() {
        return this.f88931f;
    }

    /* renamed from: l */
    public final C43079p mo89768l() {
        return this.f88932g;
    }

    /* renamed from: m */
    public void onBindViewHolder(C36849a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo89773j((C38608b) g);
    }

    /* renamed from: n */
    public C36849a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36600h0 d = C36600h0.m108529d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        C36849a aVar = new C36849a(this, d);
        aVar.mo89775n(new C36850b(this));
        aVar.mo89774m(new C36851c(this));
        return aVar;
    }

    /* renamed from: o */
    public final void mo89771o(C43075l lVar) {
        this.f88931f = lVar;
    }

    /* renamed from: p */
    public final void mo89772p(C43079p pVar) {
        this.f88932g = pVar;
    }
}
