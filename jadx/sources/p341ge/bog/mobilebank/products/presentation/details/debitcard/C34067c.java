package p341ge.bog.mobilebank.products.presentation.details.debitcard;

import a41.C30489f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31123l;
import g20.C20626o;
import g91.C32312j;
import g91.C32343x;
import he1.C41238w;
import hy0.C36270d;
import hy0.C36272f;
import hy0.C36274h;
import hy0.C36275i;
import iy0.C36580a1;
import iy0.C36586c1;
import iy0.C36591e0;
import iy0.C36594f0;
import iy0.C36603i0;
import iy0.C36606j0;
import iy0.C36609k0;
import iy0.C36612l0;
import iy0.C36615m0;
import iy0.C36618n0;
import iy0.C36621o0;
import iy0.C36624p0;
import iy0.C36627q0;
import iy0.C36630r0;
import iy0.C36633s0;
import iy0.C36634s1;
import iy0.C36636t0;
import iy0.C36639u0;
import iy0.C36642v0;
import iy0.C36645w0;
import iy0.C36648x0;
import iy0.C36651y0;
import iy0.C36654z0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nz0.C37512a0;
import nz0.C37531j;
import nz0.C37533k;
import nz0.C37535l;
import nz0.C37537m;
import nz0.C37539n;
import nz0.C37541o;
import nz0.C37543p;
import nz0.C37545q;
import nz0.C37547r;
import nz0.C37549s;
import nz0.C37551t;
import nz0.C37553u;
import nz0.C37555v;
import nz0.C37557w;
import nz0.C37559x;
import nz0.C37561y;
import nz0.C37563z;
import o31.C37599g;
import p341ge.bog.designsystem.components.bannercard.BannerCard;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.C34093e;
import p341ge.bog.mobilebank.products.presentation.details.view.AccordionView;
import p630ui.C18168a;
import p90.C27393p4;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import wz0.C39751b;
import wz0.C39758e;
import wz0.C39759f;
import wz0.C39761h;
import wz0.C39763j;
import wz0.C39764k;

/* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c */
public final class C34067c extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C34092d f82782f;

    /* renamed from: g */
    private final boolean f82783g;

    /* renamed from: h */
    private final C43075l f82784h;

    /* renamed from: i */
    private C43075l f82785i;

    /* renamed from: j */
    private C43075l f82786j;

    /* renamed from: k */
    private C43075l f82787k;

    /* renamed from: l */
    private C43079p f82788l;

    /* renamed from: m */
    private C43075l f82789m;

    /* renamed from: n */
    private C43064a f82790n = C34090w.f82819d;

    /* renamed from: o */
    private C43064a f82791o = C34091x.f82820d;

    /* renamed from: p */
    private C43075l f82792p = C34074g.f82814d;

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$a */
    public final class C34068a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36624p0 f82793d;

        /* renamed from: e */
        final /* synthetic */ C34067c f82794e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34068a(C34067c cVar, C36624p0 p0Var) {
            super(p0Var.mo3946b());
            C41536l.m120489i(p0Var, "binding");
            this.f82794e = cVar;
            this.f82793d = p0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m100188k(C34067c cVar, C34093e.C34095b bVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(bVar, "$data");
            C43075l r = cVar.mo82343r();
            if (r != null) {
                r.invoke(bVar.mo82382a());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m100189l(C34067c cVar, C34093e.C34095b bVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(bVar, "$data");
            C43075l q = cVar.mo82342q();
            if (q != null) {
                q.invoke(bVar.mo82382a());
            }
        }

        /* renamed from: j */
        public final void mo82350j(C34093e.C34095b bVar) {
            C41536l.m120489i(bVar, "data");
            this.f82793d.f88373e.setTitle(this.itemView.getContext().getString(C36274h.product_details_label_account_number));
            this.f82793d.f88373e.setText(bVar.mo82382a());
            this.f82793d.f88374f.setOnClickListener(new C37535l(this.f82794e, bVar));
            this.f82793d.f88373e.setOnClickListener(new C37537m(this.f82794e, bVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$b */
    public final class C34069b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36606j0 f82795d;

        /* renamed from: e */
        private final C18168a f82796e;

        /* renamed from: f */
        private final C18168a f82797f;

        /* renamed from: g */
        final /* synthetic */ C34067c f82798g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34069b(C34067c cVar, C36606j0 j0Var) {
            super(j0Var.mo3946b());
            C41536l.m120489i(j0Var, "binding");
            this.f82798g = cVar;
            this.f82795d = j0Var;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f82796e = new C18168a(context, C36275i.f87586d);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f82797f = new C18168a(context2, C36275i.f87584b);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m100192j(C34067c cVar, C34093e.C34101h hVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(hVar, "$data");
            cVar.f82782f.mo38217Bb(hVar.mo82387d(), 4, hVar.mo82386c());
        }

        /* renamed from: i */
        public final void mo82351i(C34093e.C34101h hVar, boolean z) {
            C41536l.m120489i(hVar, "data");
            this.f82795d.f88286g.setText(hVar.mo82385b());
            this.f82795d.f88285f.setText(hVar.mo82384a());
            if (z) {
                C18168a aVar = this.f82796e;
                ConstraintLayout c = this.f82795d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                aVar.mo45824a(c);
            } else {
                C18168a aVar2 = this.f82797f;
                ConstraintLayout c2 = this.f82795d.mo3946b();
                C41536l.m120488h(c2, "binding.root");
                aVar2.mo45824a(c2);
            }
            this.f82795d.mo3946b().setOnClickListener(new C37539n(this.f82798g, hVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$c */
    public final class C34070c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36618n0 f82799d;

        /* renamed from: e */
        private final C18168a f82800e;

        /* renamed from: f */
        private final C18168a f82801f;

        /* renamed from: g */
        final /* synthetic */ C34067c f82802g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34070c(C34067c cVar, C36618n0 n0Var) {
            super(n0Var.mo3946b());
            C41536l.m120489i(n0Var, "binding");
            this.f82802g = cVar;
            this.f82799d = n0Var;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f82800e = new C18168a(context, C36275i.f87586d);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f82801f = new C18168a(context2, C36275i.f87584b);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m100195j(C34067c cVar, C34093e.C34105l lVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(lVar, "$data");
            cVar.f82782f.mo82380wl(lVar);
        }

        /* renamed from: i */
        public final void mo82352i(C34093e.C34105l lVar, boolean z) {
            C41536l.m120489i(lVar, "data");
            this.f82799d.mo3946b().setOnClickListener(new C37541o(this.f82802g, lVar));
            this.f82799d.f88338g.setText(lVar.mo82393b());
            this.f82799d.f88336e.setText(lVar.mo82392a());
            if (z) {
                C18168a aVar = this.f82800e;
                ConstraintLayout c = this.f82799d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                aVar.mo45824a(c);
                return;
            }
            C18168a aVar2 = this.f82801f;
            ConstraintLayout c2 = this.f82799d.mo3946b();
            C41536l.m120488h(c2, "binding.root");
            aVar2.mo45824a(c2);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$d */
    public final class C34071d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36634s1 f82803d;

        /* renamed from: e */
        final /* synthetic */ C34067c f82804e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34071d(C34067c cVar, C36634s1 s1Var) {
            super(s1Var.mo3946b());
            C41536l.m120489i(s1Var, "binding");
            this.f82804e = cVar;
            this.f82803d = s1Var;
            s1Var.f88422j.setOnClickListener(new C37543p(cVar));
            s1Var.f88421i.setOnClickListener(new C37545q(cVar));
            s1Var.f88417e.setButtonText(C32343x.m95388F("text.account.cancellation.button", new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static final void m100204p(C34067c cVar, C34093e.C34108o oVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(oVar, "$data");
            cVar.f82782f.mo82379tl(oVar.mo82404a());
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static final void m100205q(C34067c cVar, C34093e.C34108o oVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(oVar, "$data");
            cVar.f82782f.mo82361D9(oVar.mo82404a());
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public static final void m100206r(C34067c cVar, C34093e.C34108o oVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(oVar, "$data");
            cVar.f82782f.mo82365Jm(oVar.mo82404a());
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static final void m100207s(C34067c cVar, C34093e.C34108o oVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(oVar, "$data");
            cVar.mo82341p().invoke(Long.valueOf(oVar.mo82404a()));
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public static final void m100208t(C34067c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82782f.mo82373m0();
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public static final void m100209u(C34067c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82782f.mo82368Um();
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public static final void m100210v(C34067c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82782f.mo38232P9();
        }

        /* renamed from: o */
        public final void mo82353o(C34093e.C34108o oVar) {
            C41536l.m120489i(oVar, "data");
            C36634s1 s1Var = this.f82803d;
            C34067c cVar = this.f82804e;
            s1Var.f88423k.setEnabled(oVar.mo82412h());
            s1Var.f88424l.setEnabled(oVar.mo82412h());
            s1Var.f88423k.setVisibility(oVar.mo82406c());
            s1Var.f88424l.setVisibility(oVar.mo82414i());
            s1Var.f88422j.setVisibility(oVar.mo82411g());
            s1Var.f88421i.setVisibility(oVar.mo82410f());
            s1Var.f88420h.setVisibility(oVar.mo82408e());
            s1Var.f88418f.setVisibility(oVar.mo82407d());
            s1Var.f88418f.setButtonText(C32343x.m95388F(C32312j.f79740j, new Object[0]));
            s1Var.f88419g.setVisibility(oVar.mo82407d());
            s1Var.f88417e.setVisibility(oVar.mo82405b());
            s1Var.f88423k.setOnClickListener(new C37547r(cVar, oVar));
            s1Var.f88424l.setOnClickListener(new C37549s(cVar, oVar));
            s1Var.f88420h.setOnClickListener(new C37551t(cVar, oVar));
            s1Var.f88417e.setOnClickListener(new C37553u(cVar, oVar));
            s1Var.f88418f.setOnClickListener(new C37555v(cVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$e */
    public final class C34072e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36645w0 f82805d;

        /* renamed from: e */
        private final C18168a f82806e;

        /* renamed from: f */
        private final C18168a f82807f;

        /* renamed from: g */
        private final C36586c1 f82808g;

        /* renamed from: h */
        final /* synthetic */ C34067c f82809h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34072e(C34067c cVar, C36645w0 w0Var) {
            super(w0Var.mo3946b());
            C41536l.m120489i(w0Var, "binding");
            this.f82809h = cVar;
            this.f82805d = w0Var;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f82806e = new C18168a(context, C36275i.f87586d);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f82807f = new C18168a(context2, C36275i.f87584b);
            C36586c1 d = C36586c1.m108470d(LayoutInflater.from(w0Var.mo3946b().getContext()));
            C41536l.m120488h(d, "inflate(LayoutInflater.from(binding.root.context))");
            this.f82808g = d;
            d.f88164f.setText(C32343x.m95388F("accounts.overdraft.agreement", new Object[0]));
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m100215l(C34067c cVar, C34093e.C34114u uVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(uVar, "$item");
            cVar.f82782f.mo82378tc(uVar.mo82417a(), uVar.mo82422f());
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m100216m(C34093e.C34114u uVar, C34067c cVar, View view) {
            C41536l.m120489i(uVar, "$item");
            C41536l.m120489i(cVar, "this$0");
            String c = uVar.mo82419c();
            if (c != null) {
                cVar.f82782f.mo82375ol(c, String.valueOf(uVar.mo82418b()));
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m100217n(C34067c cVar, C34072e eVar, boolean z) {
            C43075l s;
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(eVar, "this$1");
            if (z && (s = cVar.mo82344s()) != null) {
                s.invoke(Integer.valueOf(eVar.getAbsoluteAdapterPosition()));
            }
        }

        /* renamed from: k */
        public final void mo82354k(C34093e.C34114u uVar, boolean z) {
            boolean z2;
            C41536l.m120489i(uVar, "item");
            AccordionView accordionView = this.f82805d.f88449e;
            ConstraintLayout c = this.f82808g.mo3946b();
            C41536l.m120488h(c, "attachmentBinding.root");
            accordionView.setItemBelowContainer(c);
            AccordionView accordionView2 = this.f82805d.f88449e;
            if (uVar.mo82419c() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            accordionView2.mo82646h(z2);
            AccordionView accordionView3 = this.f82805d.f88449e;
            accordionView3.setTitle(accordionView3.getContext().getString(C36274h.product_details_label_overdraft_limit));
            this.f82805d.f88449e.setTitleValue(uVar.mo82421e());
            this.f82805d.f88449e.setItems(uVar.mo82420d());
            if (z) {
                C18168a aVar = this.f82806e;
                AccordionView c2 = this.f82805d.mo3946b();
                C41536l.m120488h(c2, "binding.root");
                aVar.mo45824a(c2);
            } else {
                C18168a aVar2 = this.f82807f;
                AccordionView c3 = this.f82805d.mo3946b();
                C41536l.m120488h(c3, "binding.root");
                aVar2.mo45824a(c3);
            }
            this.f82805d.f88449e.setButtonVisible(true);
            AccordionView accordionView4 = this.f82805d.f88449e;
            accordionView4.setButtonText(accordionView4.getContext().getString(C36274h.product_details_label_overdraft_top_up));
            this.f82805d.f88449e.setButtonClickListener(new C37557w(this.f82809h, uVar));
            this.f82808g.mo3946b().setOnClickListener(new C37559x(uVar, this.f82809h));
            this.f82805d.f88449e.setOnToggleListener(new C37561y(this.f82809h, this));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$f */
    public final class C34073f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36651y0 f82810d;

        /* renamed from: e */
        private final C18168a f82811e;

        /* renamed from: f */
        private final C18168a f82812f;

        /* renamed from: g */
        final /* synthetic */ C34067c f82813g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34073f(C34067c cVar, C36651y0 y0Var) {
            super(y0Var.mo3946b());
            C41536l.m120489i(y0Var, "binding");
            this.f82813g = cVar;
            this.f82810d = y0Var;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f82811e = new C18168a(context, C36275i.f87586d);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f82812f = new C18168a(context2, C36275i.f87584b);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m100220j(C34067c cVar, C34073f fVar, boolean z) {
            C43075l s;
            C41536l.m120489i(cVar, "this$0");
            C41536l.m120489i(fVar, "this$1");
            if (z && (s = cVar.mo82344s()) != null) {
                s.invoke(Integer.valueOf(fVar.getAbsoluteAdapterPosition()));
            }
        }

        /* renamed from: i */
        public final void mo82355i(C34093e.C34116w wVar, boolean z) {
            C41536l.m120489i(wVar, "item");
            this.f82810d.f88464e.setTitle(wVar.mo82427b());
            this.f82810d.f88464e.setItems(wVar.mo82426a());
            if (z) {
                C18168a aVar = this.f82811e;
                AccordionView c = this.f82810d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                aVar.mo45824a(c);
            } else {
                C18168a aVar2 = this.f82812f;
                AccordionView c2 = this.f82810d.mo3946b();
                C41536l.m120488h(c2, "binding.root");
                aVar2.mo45824a(c2);
            }
            this.f82810d.f88464e.setOnToggleListener(new C37563z(this.f82813g, this));
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$g */
    static final class C34074g extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C34074g f82814d = new C34074g();

        C34074g() {
            super(1);
        }

        /* renamed from: a */
        public final void mo82356a(long j) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82356a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$h */
    static final class C34075h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C34067c f82815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34075h(C34067c cVar) {
            super(1);
            this.f82815d = cVar;
        }

        /* renamed from: a */
        public final void mo82357a(long j) {
            C43075l n = this.f82815d.mo82339n();
            if (n != null) {
                n.invoke(Long.valueOf(j));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo82357a(((Number) obj).longValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$i */
    static final class C34076i extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C34067c f82816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34076i(C34067c cVar) {
            super(2);
            this.f82816d = cVar;
        }

        /* renamed from: a */
        public final void mo82358a(long j, boolean z) {
            C43079p o = this.f82816d.mo82340o();
            if (o != null) {
                o.invoke(Long.valueOf(j), Boolean.valueOf(z));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo82358a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$j */
    public static final class C34077j extends RecyclerView.C1734f0 {
        C34077j(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$k */
    public static final class C34078k extends RecyclerView.C1734f0 {
        C34078k(ConstraintLayout constraintLayout) {
            super(constraintLayout);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$l */
    public static final class C34079l extends RecyclerView.C1734f0 {
        C34079l(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$m */
    public static final class C34080m extends RecyclerView.C1734f0 {
        C34080m(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$n */
    public static final class C34081n extends RecyclerView.C1734f0 {
        C34081n(C36580a1 a1Var, C34067c cVar, BannerCard bannerCard) {
            super(bannerCard);
            a1Var.mo3946b().setShowMoreText(C32343x.m95388F("texts.child.mbank.banner.learn.more", new Object[0]));
            a1Var.mo3946b().setInfoText(C32343x.m95388F("texts.child.mbank.banner.main.text", new Object[0]));
            a1Var.mo3946b().setBannerImage(new Image.Resource(C36270d.f87473f, (Boolean) null, 2, (DefaultConstructorMarker) null));
            a1Var.mo3946b().setOnClickListener(new C37512a0(cVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m100226i(C34067c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f82782f.mo82377qk();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$o */
    static final class C34082o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C34067c f82817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34082o(C34067c cVar) {
            super(0);
            this.f82817d = cVar;
        }

        public final void invoke() {
            this.f82817d.f82782f.mo82363G0();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$p */
    static final class C34083p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C34067c f82818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34083p(C34067c cVar) {
            super(0);
            this.f82818d = cVar;
        }

        public final void invoke() {
            this.f82818d.f82782f.mo82366M7();
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$q */
    public static final class C34084q extends RecyclerView.C1734f0 {
        C34084q(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$r */
    public static final class C34085r extends RecyclerView.C1734f0 {
        C34085r(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$s */
    public static final class C34086s extends RecyclerView.C1734f0 {
        C34086s(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$t */
    public static final class C34087t extends RecyclerView.C1734f0 {
        C34087t(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$u */
    public static final class C34088u extends RecyclerView.C1734f0 {
        C34088u(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$v */
    public static final class C34089v extends RecyclerView.C1734f0 {
        C34089v(LayerView layerView) {
            super(layerView);
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$w */
    static final class C34090w extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C34090w f82819d = new C34090w();

        C34090w() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* renamed from: ge.bog.mobilebank.products.presentation.details.debitcard.c$x */
    static final class C34091x extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C34091x f82820d = new C34091x();

        C34091x() {
            super(0);
        }

        public final void invoke() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34067c(C34092d dVar, boolean z, C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(dVar, "viewModel");
        C41536l.m120489i(lVar, "onHeaderLoadFailed");
        this.f82782f = dVar;
        this.f82783g = z;
        this.f82784h = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m100170t(C34067c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f82782f.mo70819Tl();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m100171u(C34067c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f82782f.mo70818Ss();
    }

    /* renamed from: A */
    public final void mo82336A(C43075l lVar) {
        this.f82786j = lVar;
    }

    /* renamed from: B */
    public final void mo82337B(C43075l lVar) {
        this.f82785i = lVar;
    }

    /* renamed from: C */
    public final void mo82338C(C43075l lVar) {
        this.f82789m = lVar;
    }

    public int getItemViewType(int i) {
        C34093e eVar = (C34093e) mo6027g(i);
        if (eVar instanceof C34093e.C34115v) {
            return C36272f.f87559w0;
        }
        if (eVar instanceof C34093e.C34095b) {
            return C36272f.f87557Q;
        }
        if (eVar instanceof C34093e.C34108o) {
            return C36272f.item_operations_buttons;
        }
        if (eVar instanceof C34093e.C34094a) {
            return C36272f.item_account_cards_swiper;
        }
        if (eVar instanceof C34093e.C34104k) {
            return C36272f.item_account_linked_loans_header;
        }
        if (eVar instanceof C34093e.C34103j) {
            return C36272f.item_account_linked_loan;
        }
        if (eVar instanceof C34093e.C34106m) {
            return C36272f.item_account_linked_money_boxes_header;
        }
        if (eVar instanceof C34093e.C34105l) {
            return C36272f.item_account_linked_money_box;
        }
        if (eVar instanceof C34093e.C34101h) {
            return C36272f.item_account_linked_deposit;
        }
        if (eVar instanceof C34093e.C34102i) {
            return C36272f.item_account_linked_deposits_header;
        }
        if (eVar instanceof C34093e.C34113t) {
            return C36272f.item_account_overdraft_header;
        }
        if (eVar instanceof C34093e.C34114u) {
            return C36272f.item_account_overdraft;
        }
        if (eVar instanceof C34093e.C34117x) {
            return C36272f.item_account_stud_dep_info_header;
        }
        if (eVar instanceof C34093e.C34116w) {
            return C36272f.item_account_stud_dep_info;
        }
        if (eVar instanceof C34093e.C34097d) {
            return C36272f.item_account_card_insurance_offer;
        }
        if (eVar instanceof C34093e.C34096c) {
            return C36272f.item_account_all_operations_button;
        }
        if (eVar instanceof C34093e.C34099f) {
            return C36272f.item_account_operations_empty;
        }
        if (eVar instanceof C34093e.C34107n) {
            return C36272f.item_account_operation_item;
        }
        if (eVar instanceof C34093e.C34109p) {
            return C36272f.item_account_operations_date;
        }
        if (eVar instanceof C34093e.C34110q) {
            return C36272f.item_account_operations_header;
        }
        if (eVar instanceof C34093e.C34111r) {
            return C36272f.item_account_operations_loading;
        }
        if (eVar instanceof C34093e.C34112s) {
            return C36272f.item_account_operations_loading_error;
        }
        if (eVar instanceof C34093e.C34098e) {
            return C36272f.item_activate_child_mbank_offer;
        }
        if (eVar instanceof C34093e.C34100g) {
            return C36272f.f87556E;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: n */
    public final C43075l mo82339n() {
        return this.f82787k;
    }

    /* renamed from: o */
    public final C43079p mo82340o() {
        return this.f82788l;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        boolean z;
        RecyclerView.C1734f0 f0Var2 = f0Var;
        int i2 = i;
        C41536l.m120489i(f0Var2, "holder");
        C34093e eVar = (C34093e) mo6027g(i2);
        if (eVar instanceof C34093e.C34095b) {
            ((C34068a) f0Var2).mo82350j((C34093e.C34095b) eVar);
        } else if (eVar instanceof C34093e.C34115v) {
            C34093e.C34115v vVar = (C34093e.C34115v) eVar;
            ((C30489f) f0Var2).mo70837m(vVar.mo82423a(), vVar.mo82424b());
        } else if (eVar instanceof C34093e.C34108o) {
            ((C34071d) f0Var2).mo82353o((C34093e.C34108o) eVar);
        } else if (eVar instanceof C34093e.C34094a) {
            ((C39751b) f0Var2).mo93489i(((C34093e.C34094a) eVar).mo82381a());
        } else {
            boolean z2 = false;
            if (eVar instanceof C34093e.C34103j) {
                if (i2 == getItemCount() - 1 || !(mo6027g(i2 + 1) instanceof C34093e.C34103j)) {
                    z = true;
                } else {
                    z = false;
                }
                C34093e.C34103j jVar = (C34093e.C34103j) eVar;
                ((C39761h) f0Var2).mo93502i(jVar.mo82391d(), jVar.mo82390c(), jVar.mo82388a(), jVar.mo82389b(), z);
            } else if (eVar instanceof C34093e.C34101h) {
                if (i2 == getItemCount() - 1 || !(mo6027g(i2 + 1) instanceof C34093e.C34101h)) {
                    z2 = true;
                }
                ((C34069b) f0Var2).mo82351i((C34093e.C34101h) eVar, z2);
            } else if (eVar instanceof C34093e.C34116w) {
                if (i2 == getItemCount() - 1 || !(mo6027g(i2 + 1) instanceof C34093e.C34116w)) {
                    z2 = true;
                }
                ((C34073f) f0Var2).mo82355i((C34093e.C34116w) eVar, z2);
            } else if (eVar instanceof C34093e.C34114u) {
                if (i2 == getItemCount() - 1 || !(mo6027g(i2 + 1) instanceof C34093e.C34114u)) {
                    z2 = true;
                }
                ((C34072e) f0Var2).mo82354k((C34093e.C34114u) eVar, z2);
            } else if (eVar instanceof C34093e.C34105l) {
                if (i2 == getItemCount() - 1 || !(mo6027g(i2 + 1) instanceof C34093e.C34105l)) {
                    z2 = true;
                }
                ((C34070c) f0Var2).mo82352i((C34093e.C34105l) eVar, z2);
            } else if (eVar instanceof C34093e.C34109p) {
                ((C39764k) f0Var2).mo93505h(((C34093e.C34109p) eVar).mo82416a());
            } else if (eVar instanceof C34093e.C34107n) {
                C34093e.C34107n nVar = (C34093e.C34107n) eVar;
                ((C39763j) f0Var2).mo93504i(nVar.mo82396a(), nVar.mo82401f(), nVar.mo82402g(), nVar.mo82397b(), nVar.mo82399d(), nVar.mo82398c(), nVar.mo82400e(), nVar.mo82403h());
            } else if (eVar instanceof C34093e.C34100g) {
                ((C20626o) f0Var2).mo49175k(true);
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C36272f.f87559w0) {
            C31123l d = C31123l.m92612d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C30489f(d, this.f82782f, (Integer) null, this.f82784h, 4, (DefaultConstructorMarker) null);
        } else if (i == C36272f.f87557Q) {
            C36624p0 d2 = C36624p0.m108632d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C34068a(this, d2);
        } else if (i == C36272f.item_operations_buttons) {
            C36634s1 d3 = C36634s1.m108672d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C34071d(this, d3);
        } else if (i == C36272f.item_account_cards_swiper) {
            C36603i0 d4 = C36603i0.m108542d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            C39751b bVar = new C39751b(d4);
            bVar.mo93492n(new C34075h(this));
            bVar.mo93493o(new C34076i(this));
            return bVar;
        } else if (i == C36272f.item_account_card_insurance_offer) {
            C36594f0 d5 = C36594f0.m108503d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …  false\n                )");
            C39758e eVar = new C39758e(d5, this.f82783g);
            eVar.mo93499l(new C34082o(this));
            eVar.mo93500m(new C34083p(this));
            return eVar;
        } else if (i == C36272f.item_account_linked_loans_header) {
            C36615m0 d6 = C36615m0.m108594d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …  false\n                )");
            return new C39759f(d6);
        } else if (i == C36272f.item_account_linked_loan) {
            C36612l0 d7 = C36612l0.m108581d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(\n               …  false\n                )");
            return new C39761h(d7, this.f82782f);
        } else if (i == C36272f.item_account_linked_money_boxes_header) {
            C36621o0 d8 = C36621o0.m108619d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(\n               …  false\n                )");
            return new C34084q(d8.mo3946b());
        } else if (i == C36272f.item_account_linked_money_box) {
            C36618n0 d9 = C36618n0.m108607d(from, viewGroup, false);
            C41536l.m120488h(d9, "inflate(\n               …  false\n                )");
            return new C34070c(this, d9);
        } else if (i == C36272f.item_account_linked_deposits_header) {
            C36609k0 d12 = C36609k0.m108568d(from, viewGroup, false);
            C41536l.m120488h(d12, "inflate(\n               …  false\n                )");
            return new C34085r(d12.mo3946b());
        } else if (i == C36272f.item_account_linked_deposit) {
            C36606j0 d13 = C36606j0.m108555d(from, viewGroup, false);
            C41536l.m120488h(d13, "inflate(\n               …  false\n                )");
            return new C34069b(this, d13);
        } else if (i == C36272f.item_account_stud_dep_info_header) {
            C36654z0 d14 = C36654z0.m108751d(from, viewGroup, false);
            C41536l.m120488h(d14, "inflate(\n               …  false\n                )");
            return new C34086s(d14.mo3946b());
        } else if (i == C36272f.item_account_stud_dep_info) {
            C36651y0 d15 = C36651y0.m108740d(from, viewGroup, false);
            C41536l.m120488h(d15, "inflate(\n               …  false\n                )");
            return new C34073f(this, d15);
        } else if (i == C36272f.item_account_overdraft_header) {
            C36648x0 d16 = C36648x0.m108728d(from, viewGroup, false);
            C41536l.m120488h(d16, "inflate(\n               …  false\n                )");
            return new C34087t(d16.mo3946b());
        } else {
            int i2 = C36272f.f87556E;
            if (i == i2) {
                C27393p4 d17 = C27393p4.m84877d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d17, "inflate(\n               …  false\n                )");
                return new C20626o(d17, this.f82790n, this.f82791o);
            } else if (i == C36272f.item_account_overdraft) {
                C36645w0 d18 = C36645w0.m108716d(from, viewGroup, false);
                C41536l.m120488h(d18, "inflate(\n               …  false\n                )");
                return new C34072e(this, d18);
            } else if (i == C36272f.item_account_operations_header) {
                C36636t0 d19 = C36636t0.m108680d(from, viewGroup, false);
                C41536l.m120488h(d19, "inflate(\n               …  false\n                )");
                return new C34088u(d19.mo3946b());
            } else if (i == C36272f.item_account_operations_date) {
                C36630r0 d22 = C36630r0.m108656d(from, viewGroup, false);
                C41536l.m120488h(d22, "inflate(\n               …  false\n                )");
                return new C39764k(d22);
            } else if (i == C36272f.item_account_operation_item) {
                C36627q0 d23 = C36627q0.m108644d(from, viewGroup, false);
                C41536l.m120488h(d23, "inflate(\n               …  false\n                )");
                return new C39763j(d23, this.f82782f);
            } else if (i == C36272f.item_account_operations_loading_error) {
                C36642v0 d24 = C36642v0.m108704d(from, viewGroup, false);
                C41536l.m120488h(d24, "inflate(\n               …  false\n                )");
                d24.f88442e.setOnClickListener(new C37531j(this));
                return new C34089v(d24.mo3946b());
            } else if (i == C36272f.item_account_operations_empty) {
                C36633s0 d25 = C36633s0.m108668d(from, viewGroup, false);
                C41536l.m120488h(d25, "inflate(\n               …  false\n                )");
                return new C34077j(d25.mo3946b());
            } else if (i == C36272f.item_account_all_operations_button) {
                C36591e0 d26 = C36591e0.m108491d(from, viewGroup, false);
                C41536l.m120488h(d26, "inflate(\n               …  false\n                )");
                d26.mo3946b().setOnClickListener(new C37533k(this));
                return new C34078k(d26.mo3946b());
            } else if (i == i2) {
                C36639u0 d27 = C36639u0.m108692d(from, viewGroup, false);
                C41536l.m120488h(d27, "inflate(\n               …  false\n                )");
                return new C34079l(d27.mo3946b());
            } else if (i == C36272f.item_account_operations_loading) {
                C36639u0 d28 = C36639u0.m108692d(from, viewGroup, false);
                C41536l.m120488h(d28, "inflate(\n               …  false\n                )");
                return new C34080m(d28.mo3946b());
            } else if (i == C36272f.item_activate_child_mbank_offer) {
                C36580a1 d29 = C36580a1.m108446d(from, viewGroup, false);
                C41536l.m120488h(d29, "inflate(\n               …  false\n                )");
                return new C34081n(d29, this, d29.mo3946b());
            } else {
                throw new UnsupportedOperationException("Unknown view type");
            }
        }
    }

    /* renamed from: p */
    public final C43075l mo82341p() {
        return this.f82792p;
    }

    /* renamed from: q */
    public final C43075l mo82342q() {
        return this.f82786j;
    }

    /* renamed from: r */
    public final C43075l mo82343r() {
        return this.f82785i;
    }

    /* renamed from: s */
    public final C43075l mo82344s() {
        return this.f82789m;
    }

    /* renamed from: v */
    public final void mo82345v(C43075l lVar) {
        this.f82787k = lVar;
    }

    /* renamed from: w */
    public final void mo82346w(C43079p pVar) {
        this.f82788l = pVar;
    }

    /* renamed from: x */
    public final void mo82347x(C43075l lVar) {
        C41536l.m120489i(lVar, "<set-?>");
        this.f82792p = lVar;
    }

    /* renamed from: y */
    public final void mo82348y(C43064a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f82790n = aVar;
    }

    /* renamed from: z */
    public final void mo82349z(C43064a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f82791o = aVar;
    }
}
