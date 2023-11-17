package wr0;

import a41.C30484c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b31.C31123l;
import fs0.C32000a;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37127b;
import lr0.C37129d;
import lr0.C37130e;
import lr0.C37131f;
import o31.C37599g;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator;
import p341ge.bog.mobilebank.loans.presentation.details.C32587a;
import p341ge.bog.mobilebank.loans.presentation.details.C32608g;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p422fj.C12920b;
import p671xj.C18774d;
import pr0.C37947c0;
import pr0.C37956h;
import pr0.C37958i;
import pr0.C37959j;
import pr0.C37960k;
import pr0.C37961l;
import pr0.C37967r;
import pr0.C37973x;
import ue1.C43064a;
import ue1.C43075l;
import xr0.C39837a;
import xr0.C39841d;

/* renamed from: wr0.d */
public final class C39644d extends C1819o {

    /* renamed from: g */
    public static final C39646b f94256g = new C39646b((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C39670n f94257f;

    /* renamed from: wr0.d$a */
    private static final class C39645a extends C39641a {

        /* renamed from: d */
        private final C37960k f94258d;

        /* renamed from: e */
        private final C39670n f94259e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39645a(pr0.C37960k r3, wr0.C39670n r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94258d = r3
                r2.f94259e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39645a.<init>(pr0.k, wr0.n):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m115212l(C39645a aVar, List list, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(list, "$buttons");
            aVar.f94259e.mo74071r((C32587a) C41358y.m120007W(list));
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m115213m(C39645a aVar, C32587a aVar2, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(aVar2, "$button");
            aVar.f94259e.mo74071r(aVar2);
        }

        /* renamed from: k */
        public void mo93392h(C32608g gVar) {
            C41238w wVar;
            C41536l.m120489i(gVar, "item");
            C37960k kVar = this.f94258d;
            C32608g.C32609a aVar = (C32608g.C32609a) gVar;
            List<C32587a> a = aVar.mo74120a();
            C32000a b = aVar.mo74121b();
            if (b != null) {
                InlineFeedback2 inlineFeedback2 = kVar.f91224f;
                C41536l.m120488h(inlineFeedback2, "feedback");
                C32343x.m95447f1(inlineFeedback2);
                kVar.f91224f.setStatus(b.mo72493b());
                if (b.mo72493b() == InlineFeedback2.C13350a.PENDING) {
                    kVar.f91224f.setTitle((CharSequence) null);
                    kVar.f91224f.setDescription(C32343x.m95388F("text.loans.payment.day.info.text", C32343x.m95400L(b.mo72492a())));
                } else {
                    kVar.f91224f.setTitle(C32343x.m95388F("text.loans.overdue.info", new Object[0]));
                    kVar.f91224f.setDescription(C32343x.m95388F("text.loans.overdue.info.text", C32343x.m95400L(b.mo72492a())));
                }
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                InlineFeedback2 inlineFeedback22 = kVar.f91224f;
                C41536l.m120488h(inlineFeedback22, "feedback");
                C32343x.m95455i0(inlineFeedback22);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            kVar.f91223e.removeAllViews();
            kVar.f91223e.setWeightSum((float) a.size());
            if (a.size() == 1) {
                View inflate = LayoutInflater.from(kVar.mo3946b().getContext()).inflate(C37131f.item_loan_action_button_single, (ViewGroup) null, false);
                C41536l.m120487g(inflate, "null cannot be cast to non-null type ge.bog.designsystem.components.buttons.Button");
                Button button = (Button) inflate;
                button.setButtonText(C32343x.m95388F(((C32587a) C41358y.m120007W(a)).mo74082b(), new Object[0]));
                button.setButtonIcon(kVar.mo3946b().getContext().getDrawable(((C32587a) C41358y.m120007W(a)).mo74081a()));
                kVar.f91223e.addView(button, layoutParams);
                button.setOnClickListener(new C39642b(this, a));
                return;
            }
            for (C32587a aVar2 : a) {
                View inflate2 = LayoutInflater.from(kVar.mo3946b().getContext()).inflate(C37131f.item_loan_action_button_multiple, (ViewGroup) null, false);
                Button button2 = (Button) inflate2.findViewById(C37130e.f89440p);
                button2.setButtonText(C32343x.m95388F(aVar2.mo74082b(), new Object[0]));
                button2.setButtonIcon(kVar.mo3946b().getContext().getDrawable(aVar2.mo74081a()));
                kVar.f91223e.addView(inflate2, layoutParams);
                button2.setOnClickListener(new C39643c(this, aVar2));
            }
        }
    }

    /* renamed from: wr0.d$b */
    public static final class C39646b {
        private C39646b() {
        }

        public /* synthetic */ C39646b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wr0.d$c */
    private static final class C39647c extends C39641a {

        /* renamed from: d */
        private final C37956h f94260d;

        /* renamed from: e */
        private final C39670n f94261e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39647c(pr0.C37956h r3, wr0.C39670n r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94260d = r3
                r2.f94261e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39647c.<init>(pr0.h, wr0.n):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m115218l(C32608g.C32610b bVar, C39647c cVar, View view) {
            String f;
            C41536l.m120489i(bVar, "$data");
            C41536l.m120489i(cVar, "this$0");
            StringSource h = bVar.mo74133h();
            if (h != null && (f = C34646b.m101752f(h, (Context) null, 1, (Object) null)) != null) {
                cVar.f94261e.mo74072t(f);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static final void m115219m(C39647c cVar, View view) {
            C41536l.m120489i(cVar, "this$0");
            cVar.f94261e.mo74070X();
        }

        /* renamed from: k */
        public void mo93392h(C32608g gVar) {
            String str;
            String str2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            C41536l.m120489i(gVar, "item");
            C37956h hVar = this.f94260d;
            C32608g.C32610b bVar = (C32608g.C32610b) gVar;
            hVar.f91175F.setTitle(C32343x.m95388F("text.loans.details", new Object[0]));
            hVar.f91198v.setTitle(C32343x.m95388F("text.loans.details.name", new Object[0]));
            hVar.f91179J.setTitle(C32343x.m95388F("text.loans.details.loan.type", new Object[0]));
            hVar.f91189m.setTitle(C32343x.m95388F("text.loans.details.start.and.maturity.date", new Object[0]));
            hVar.f91181e.setTitle(C32343x.m95388F("text.loans.details.loan.linked.account", new Object[0]));
            hVar.f91185i.setText(C32343x.m95388F("text.loans.details.loan.remaining.principal", new Object[0]));
            hVar.f91191o.setText(C32343x.m95388F("text.loans.details.loan.initial.principal", new Object[0]));
            hVar.f91173D.setText(C32343x.m95388F("text.loans.details.loan.remaining.interest", new Object[0]));
            hVar.f91201y.setText(C32343x.m95388F("text.loans.details.loan.current.percent", new Object[0]));
            hVar.f91171B.setText(C32343x.m95388F("text.loans.details.loan.current.penalty", new Object[0]));
            hVar.f91196t.setText(C32343x.m95388F("text.loans.details.loan.annual.percentage", new Object[0]));
            hVar.f91178I.setText(C32343x.m95388F("text.loan.details.total.offset.amount", new Object[0]));
            hVar.f91194r.setText(C32343x.m95388F("text.loans.details.insurance.amnt", new Object[0]));
            hVar.f91188l.setText(C32343x.m95388F("text.loans.details.agreement.link", new Object[0]));
            TwoLineTextItem twoLineTextItem = hVar.f91198v;
            StringSource h = bVar.mo74133h();
            if (h != null) {
                str = C34646b.m101752f(h, (Context) null, 1, (Object) null);
            } else {
                str = null;
            }
            twoLineTextItem.setText(str);
            TwoLineTextItem twoLineTextItem2 = hVar.f91179J;
            StringSource m = bVar.mo74139m();
            if (m != null) {
                str2 = C34646b.m101752f(m, (Context) null, 1, (Object) null);
            } else {
                str2 = null;
            }
            twoLineTextItem2.setText(str2);
            hVar.f91189m.setText(bVar.mo74128d());
            hVar.f91181e.setText(bVar.mo74125a());
            hVar.f91184h.setText(bVar.mo74126b());
            hVar.f91190n.setText(bVar.mo74129e());
            hVar.f91172C.setText(bVar.mo74137k());
            hVar.f91199w.setText(bVar.mo74135i());
            hVar.f91202z.setText(bVar.mo74136j());
            hVar.f91195s.setText(bVar.mo74132g());
            hVar.f91176G.setText(bVar.mo74138l());
            hVar.f91192p.setText(bVar.mo74131f());
            ConstraintLayout constraintLayout = hVar.f91197u;
            C41536l.m120488h(constraintLayout, "lndRemainingInterestLayout");
            String k = bVar.mo74137k();
            if (k == null || k.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(constraintLayout, !z, false, 2, (Object) null);
            ConstraintLayout constraintLayout2 = hVar.f91200x;
            C41536l.m120488h(constraintLayout2, "plnIntAmountLayout");
            String i = bVar.mo74135i();
            if (i == null || i.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(constraintLayout2, !z2, false, 2, (Object) null);
            ConstraintLayout constraintLayout3 = hVar.f91170A;
            C41536l.m120488h(constraintLayout3, "plnPenaltyLayout");
            String j = bVar.mo74136j();
            if (j == null || j.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C32343x.m95483r1(constraintLayout3, !z3, false, 2, (Object) null);
            ConstraintLayout constraintLayout4 = hVar.f91177H;
            C41536l.m120488h(constraintLayout4, "totalOffsetAmountLayout");
            String l = bVar.mo74138l();
            if (l == null || l.length() == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            C32343x.m95483r1(constraintLayout4, !z4, false, 2, (Object) null);
            ConstraintLayout constraintLayout5 = hVar.f91193q;
            C41536l.m120488h(constraintLayout5, "insAmountLayout");
            String f = bVar.mo74131f();
            if (f == null || f.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            C32343x.m95483r1(constraintLayout5, !z5, false, 2, (Object) null);
            FrameLayout frameLayout = hVar.f91187k;
            C41536l.m120488h(frameLayout, "contractDownloadLayout");
            C32343x.m95483r1(frameLayout, bVar.mo74127c(), false, 2, (Object) null);
            ListItem listItem = hVar.f91183g;
            C41536l.m120488h(listItem, "acctNoLayout");
            String a = bVar.mo74125a();
            if (a == null || a.length() == 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            C32343x.m95483r1(listItem, !z6, false, 2, (Object) null);
            View view = hVar.f91182f;
            C41536l.m120488h(view, "acctNoDivider");
            String a2 = bVar.mo74125a();
            if (a2 == null || a2.length() == 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            C32343x.m95483r1(view, !z7, false, 2, (Object) null);
            hVar.f91174E.setOnClickListener(new C39660e(bVar, this));
            hVar.f91186j.setOnClickListener(new C39661f(this));
        }
    }

    /* renamed from: wr0.d$d */
    private static final class C39648d extends C39641a {

        /* renamed from: d */
        private final C37967r f94262d;

        /* renamed from: e */
        private final C39670n f94263e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39648d(pr0.C37967r r3, wr0.C39670n r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                android.widget.LinearLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94262d = r3
                r2.f94263e = r4
                android.widget.LinearLayout r4 = r3.f91250f
                java.lang.String r0 = "binding.errorViewLayout"
                kotlin.jvm.internal.C41536l.m120488h(r4, r0)
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                if (r0 == 0) goto L_0x003d
                android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
                android.widget.LinearLayout r3 = r3.mo3946b()
                android.content.res.Resources r3 = r3.getResources()
                int r1 = lr0.C37128c.error_layout_top_margin
                int r3 = r3.getDimensionPixelSize(r1)
                r0.topMargin = r3
                r4.setLayoutParams(r0)
                return
            L_0x003d:
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
                r3.<init>(r4)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39648d.<init>(pr0.r, wr0.n):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m115223k(C39648d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            dVar.f94263e.mo74074w1();
        }

        /* renamed from: j */
        public void mo93392h(C32608g gVar) {
            C41536l.m120489i(gVar, "item");
            this.f94262d.f91251g.setOnClickListener(new C39662g(this));
        }
    }

    /* renamed from: wr0.d$e */
    private static final class C39649e extends C39641a {

        /* renamed from: d */
        private final C37958i f94264d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39649e(pr0.C37958i r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94264d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39649e.<init>(pr0.i):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m115227k(C39649e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            LayerView layerView = eVar.f94264d.f91215h;
            C41536l.m120488h(layerView, "binding.iconContainer");
            C18774d dVar = new C18774d(layerView, (C18774d.C18775a) null, 0, 0, (String) null, (C43064a) null, false, false, false, 510, (DefaultConstructorMarker) null);
            dVar.mo46562n(C18774d.C18775a.Top);
            dVar.mo46568t(C32343x.m95388F("loan.details.page.ratedetails.block.infobutton", new Object[0]));
            dVar.mo46569u(C0767a.m2893c(eVar.f94264d.mo3946b().getContext(), C37127b.f89402a));
            dVar.mo46563o(C37127b.f89403b);
            dVar.mo46564p(true);
            dVar.mo46565q(true);
            dVar.mo46566r(true);
            C18774d.m63531w(dVar, 0, 1, (Object) null);
        }

        /* renamed from: j */
        public void mo93392h(C32608g gVar) {
            C41536l.m120489i(gVar, "item");
            C37958i iVar = this.f94264d;
            C32608g.C32612d dVar = (C32608g.C32612d) gVar;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            iVar.f91213f.setText(C32343x.m95388F("loan.details.page.ratedetails.changedate", new Object[0]));
            iVar.f91212e.setText(simpleDateFormat.format(dVar.mo74142b()));
            iVar.f91218k.setText(C32343x.m95388F("loan.details.page.ratedetails.rate", new Object[0]));
            iVar.f91217j.setText(C32343x.m95388F(dVar.mo74141a(), String.valueOf(dVar.mo74144d()), String.valueOf(dVar.mo74143c())));
            iVar.f91214g.setTitle(C32343x.m95388F("loan.details.page.ratedetails.block.header", new Object[0]));
            iVar.f91215h.setOnClickListener(new C39663h(this));
        }
    }

    /* renamed from: wr0.d$f */
    private static final class C39650f extends C39641a {

        /* renamed from: d */
        private final C37959j f94265d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39650f(pr0.C37959j r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94265d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39650f.<init>(pr0.j):void");
        }

        /* renamed from: i */
        public void mo93392h(C32608g gVar) {
            C41536l.m120489i(gVar, "item");
            C37959j jVar = this.f94265d;
            C32608g.C32613e eVar = (C32608g.C32613e) gVar;
            jVar.f91221f.setTitle(C32343x.m95388F("online.inst.product.progress.bar.title", new Object[0]));
            TextProgressBarView textProgressBarView = jVar.f91220e;
            float floatValue = eVar.mo74150c().floatValue();
            float floatValue2 = eVar.mo74148a().floatValue();
            String h = C32303f.m95197h(eVar.mo74149b());
            C41536l.m120488h(h, "getCcyLogo(data.curr)");
            textProgressBarView.setBudget(new TextProgressBarView.ProgressModel.Progress(floatValue, floatValue2, h, C32343x.m95388F("online.inst.product.progress.bar.text.left", new Object[0]), C32343x.m95388F("online.inst.product.progress.bar.text.right", new Object[0]), false, (C12920b) null, (C12920b) null, 224, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: wr0.d$g */
    private static final class C39651g extends C39641a {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39651g(pr0.C37961l r2) {
            /*
                r1 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                ge.bog.designsystem.components.loading.LoadingView r2 = r2.mo3946b()
                java.lang.String r0 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r2, r0)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39651g.<init>(pr0.l):void");
        }

        /* renamed from: i */
        public void mo93392h(C32608g gVar) {
            C41536l.m120489i(gVar, "item");
        }
    }

    /* renamed from: wr0.d$h */
    private static final class C39652h extends C39641a {

        /* renamed from: d */
        private final C37973x f94266d;

        /* renamed from: e */
        private final C39670n f94267e;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39652h(pr0.C37973x r3, wr0.C39670n r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94266d = r3
                r2.f94267e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39652h.<init>(pr0.x, wr0.n):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m115235k(C39652h hVar, View view) {
            C41536l.m120489i(hVar, "this$0");
            hVar.f94267e.mo74073w0();
        }

        /* renamed from: j */
        public void mo93392h(C32608g gVar) {
            String str;
            String P;
            C41536l.m120489i(gVar, "item");
            C37973x xVar = this.f94266d;
            C32608g.C32615g gVar2 = (C32608g.C32615g) gVar;
            xVar.f91278j.setTitle(C32343x.m95388F("text.loan.repayments.history.page.header", new Object[0]));
            xVar.f91275g.setButtonText(C32343x.m95388F("text.loans.history.button", new Object[0]));
            xVar.f91276h.setTitle(C32343x.m95388F("text.loan.repayments.history.page.last.payment", new Object[0]));
            xVar.f91276h.setText(gVar2.mo74155b());
            TextView textView = xVar.f91273e;
            String c = gVar2.mo74156c();
            String str2 = "";
            if (c == null || (str = C32343x.m95388F(c, new Object[0])) == null) {
                str = str2;
            }
            textView.setText(str);
            TextView textView2 = xVar.f91274f;
            BigDecimal d = gVar2.mo74157d();
            if (!(d == null || (P = C32343x.m95408P(d, gVar2.mo74154a())) == null)) {
                str2 = P;
            }
            textView2.setText(str2);
            xVar.f91275g.setOnClickListener(new C39664i(this));
        }
    }

    /* renamed from: wr0.d$i */
    private static final class C39653i extends C39641a {

        /* renamed from: d */
        private final C31123l f94268d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C39670n f94269e;

        /* renamed from: f */
        private final C41217g f94270f = C41219i.m119470b(C39654a.f94272d);

        /* renamed from: g */
        private final C39655b f94271g = new C39655b(this);

        /* renamed from: wr0.d$i$a */
        static final class C39654a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C39654a f94272d = new C39654a();

            C39654a() {
                super(0);
            }

            /* renamed from: b */
            public final C30484c invoke() {
                return new C30484c((C43075l) null, 1, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: wr0.d$i$b */
        public static final class C39655b extends ViewPager2.C1928i {

            /* renamed from: a */
            final /* synthetic */ C39653i f94273a;

            C39655b(C39653i iVar) {
                this.f94273a = iVar;
            }

            public void onPageSelected(int i) {
                super.onPageSelected(i);
                this.f94273a.f94269e.mo74069Q0(this.f94273a.m115244p().getItemId(i), i);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39653i(b31.C31123l r3, wr0.C39670n r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94268d = r3
                r2.f94269e = r4
                wr0.d$i$a r4 = wr0.C39644d.C39653i.C39654a.f94272d
                he1.g r4 = he1.C41219i.m119470b(r4)
                r2.f94270f = r4
                wr0.d$i$b r4 = new wr0.d$i$b
                r4.<init>(r2)
                r2.f94271g = r4
                androidx.viewpager2.widget.ViewPager2 r4 = r3.f77351e
                a41.c r0 = r2.m115244p()
                r4.setAdapter(r0)
                androidx.viewpager2.widget.ViewPager2 r4 = r3.f77351e
                r0 = 0
                r4.setOrientation(r0)
                ge.bog.mobilebank.cleanarch.presentation.common.compoundview.ScrollingPagerIndicator r4 = r3.f77352f
                androidx.viewpager2.widget.ViewPager2 r3 = r3.f77351e
                java.lang.String r0 = "binding.headersViewPager"
                kotlin.jvm.internal.C41536l.m120488h(r3, r0)
                r4.mo53672c(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39653i.<init>(b31.l, wr0.n):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static final void m115242n(C39653i iVar, C32608g.C32616h hVar) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(hVar, "$headersItem");
            iVar.f94268d.f77351e.post(new C39666k(iVar, hVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public static final void m115243o(C39653i iVar, C32608g.C32616h hVar) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(hVar, "$headersItem");
            iVar.f94268d.f77351e.mo6606l(hVar.mo74162b(), false);
            iVar.m115245q();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final C30484c m115244p() {
            return (C30484c) this.f94270f.getValue();
        }

        /* renamed from: q */
        private final void m115245q() {
            this.f94268d.f77351e.mo6603h(this.f94271g);
        }

        /* renamed from: r */
        private final void m115246r() {
            this.f94268d.f77351e.mo6614p(this.f94271g);
        }

        /* renamed from: m */
        public void mo93392h(C32608g gVar) {
            C41536l.m120489i(gVar, "item");
            C32608g.C32616h hVar = (C32608g.C32616h) gVar;
            m115246r();
            m115244p().mo6030j(hVar.mo74161a(), new C39665j(this, hVar));
            ScrollingPagerIndicator scrollingPagerIndicator = this.f94268d.f77352f;
            C41536l.m120488h(scrollingPagerIndicator, "binding.swiperIndicator");
            int i = 0;
            boolean z = true;
            if (hVar.mo74161a().size() <= 1) {
                z = false;
            }
            if (!z) {
                i = 8;
            }
            scrollingPagerIndicator.setVisibility(i);
        }
    }

    /* renamed from: wr0.d$j */
    private static final class C39656j extends C39641a {

        /* renamed from: d */
        private final C37947c0 f94274d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C39670n f94275e;

        /* renamed from: wr0.d$j$a */
        static final class C39657a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C39656j f94276d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39657a(C39656j jVar) {
                super(0);
                this.f94276d = jVar;
            }

            public final void invoke() {
                this.f94276d.f94275e.mo74068I();
            }
        }

        /* renamed from: wr0.d$j$b */
        static final class C39658b extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C39656j f94277d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39658b(C39656j jVar) {
                super(0);
                this.f94277d = jVar;
            }

            public final void invoke() {
                this.f94277d.f94275e.mo74073w0();
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C39656j(pr0.C37947c0 r3, wr0.C39670n r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "eventListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r2.<init>(r0)
                r2.f94274d = r3
                r2.f94275e = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39656j.<init>(pr0.c0, wr0.n):void");
        }

        /* renamed from: j */
        public void mo93392h(C32608g gVar) {
            String str;
            List list;
            boolean z;
            List list2;
            boolean z2;
            C41536l.m120489i(gVar, "item");
            C37947c0 c0Var = this.f94274d;
            C32608g.C32617i iVar = (C32608g.C32617i) gVar;
            EmptyWidget emptyWidget = c0Var.f91102j;
            if (iVar.mo74167a() != null && iVar.mo74168b() != null) {
                str = C32343x.m95388F("text.loans.schedule.and.history.title", new Object[0]);
            } else if (iVar.mo74168b() != null) {
                str = C32343x.m95388F("text.loan.schedule.page.header", new Object[0]);
            } else if (iVar.mo74167a() != null) {
                str = C32343x.m95388F("text.loan.repayments.history.page.header", new Object[0]);
            } else {
                str = "";
            }
            emptyWidget.setTitle(str);
            c0Var.f91098f.setTopText(C32343x.m95388F("text.loan.schedule.page.next.payment", new Object[0]));
            c0Var.f91098f.setImage((Image) new Image.Resource(C37129d.icons_24_loan_express, (Boolean) null, 2, (DefaultConstructorMarker) null));
            c0Var.f91098f.setButtonText(C32343x.m95388F("text.loans.schedule.button", new Object[0]));
            RecyclerView recyclerView = c0Var.f91099g;
            C39668m mVar = new C39668m();
            C39841d b = iVar.mo74168b();
            if (b != null) {
                list = b.mo93550b();
            } else {
                list = null;
            }
            if (list == null) {
                list = C41341q.m119907j();
            }
            mVar.mo6029i(list);
            recyclerView.setAdapter(mVar);
            ButtonListView buttonListView = c0Var.f91098f;
            C41536l.m120488h(buttonListView, "nextPayment");
            boolean z3 = true;
            if (iVar.mo74168b() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(buttonListView, z, false, 2, (Object) null);
            c0Var.f91098f.setOnButtonClicked(new C39657a(this));
            c0Var.f91101i.setTopText(C32343x.m95388F("text.loan.repayments.history.page.last.payment", new Object[0]));
            c0Var.f91101i.setImage((Image) new Image.Resource(C37129d.icons_24_statement_bank_statement, (Boolean) null, 2, (DefaultConstructorMarker) null));
            c0Var.f91101i.setButtonText(C32343x.m95388F("text.loans.history.button", new Object[0]));
            RecyclerView recyclerView2 = c0Var.f91100h;
            C39668m mVar2 = new C39668m();
            C39837a a = iVar.mo74167a();
            if (a != null) {
                list2 = a.mo93536b();
            } else {
                list2 = null;
            }
            if (list2 == null) {
                list2 = C41341q.m119907j();
            }
            mVar2.mo6029i(list2);
            recyclerView2.setAdapter(mVar2);
            ButtonListView buttonListView2 = c0Var.f91101i;
            C41536l.m120488h(buttonListView2, "previousPayment");
            if (iVar.mo74167a() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(buttonListView2, z2, false, 2, (Object) null);
            c0Var.f91101i.setOnButtonClicked(new C39658b(this));
            View view = c0Var.f91097e;
            C41536l.m120488h(view, "divider");
            if (iVar.mo74168b() == null || iVar.mo74167a() == null) {
                z3 = false;
            }
            C32343x.m95483r1(view, z3, false, 2, (Object) null);
            C39841d b2 = iVar.mo74168b();
            if (b2 != null) {
                c0Var.f91098f.setBottomText(C32343x.m95408P(b2.mo93551c(), b2.mo93549a()));
            }
            C39837a a2 = iVar.mo74167a();
            if (a2 != null) {
                c0Var.f91101i.setBottomText(C32343x.m95408P(a2.mo93537c(), a2.mo93535a()));
            }
        }
    }

    /* renamed from: wr0.d$k */
    public /* synthetic */ class C39659k {

        /* renamed from: a */
        public static final /* synthetic */ int[] f94278a;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(2:17|18)|19|21) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|21) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                wr0.o[] r0 = wr0.C39671o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wr0.o r1 = wr0.C39671o.PRODUCT_HEADERS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wr0.o r1 = wr0.C39671o.ACTION_BUTTONS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wr0.o r1 = wr0.C39671o.INSTALLMENT_PROGRESS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                wr0.o r1 = wr0.C39671o.SCHEDULE_AND_HISTORY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                wr0.o r1 = wr0.C39671o.PLN_HISTORY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                wr0.o r1 = wr0.C39671o.INFOBOX     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                wr0.o r1 = wr0.C39671o.DETAILS     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                wr0.o r1 = wr0.C39671o.LOADING     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                wr0.o r1 = wr0.C39671o.ERROR     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                f94278a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wr0.C39644d.C39659k.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39644d(C39670n nVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(nVar, "eventListener");
        this.f94257f = nVar;
    }

    public int getItemViewType(int i) {
        C39671o oVar;
        C32608g gVar = (C32608g) mo6027g(i);
        if (gVar instanceof C32608g.C32616h) {
            oVar = C39671o.PRODUCT_HEADERS;
        } else if (gVar instanceof C32608g.C32609a) {
            oVar = C39671o.ACTION_BUTTONS;
        } else if (gVar instanceof C32608g.C32613e) {
            oVar = C39671o.INSTALLMENT_PROGRESS;
        } else if (gVar instanceof C32608g.C32617i) {
            oVar = C39671o.SCHEDULE_AND_HISTORY;
        } else if (gVar instanceof C32608g.C32615g) {
            oVar = C39671o.PLN_HISTORY;
        } else if (gVar instanceof C32608g.C32612d) {
            oVar = C39671o.INFOBOX;
        } else if (gVar instanceof C32608g.C32610b) {
            oVar = C39671o.DETAILS;
        } else if (gVar instanceof C32608g.C32614f) {
            oVar = C39671o.LOADING;
        } else if (gVar instanceof C32608g.C32611c) {
            oVar = C39671o.ERROR;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return oVar.ordinal();
    }

    /* renamed from: k */
    public void onBindViewHolder(C39641a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo93392h(obj);
    }

    /* renamed from: l */
    public C39641a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C41536l.m120489i(viewGroup, "parent");
        C39671o a = C39671o.f94290d.mo93417a(i);
        if (a == null) {
            i2 = -1;
        } else {
            i2 = C39659k.f94278a[a.ordinal()];
        }
        switch (i2) {
            case 1:
                C31123l d = C31123l.m92612d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …      false\n            )");
                return new C39653i(d, this.f94257f);
            case 2:
                C37960k d2 = C37960k.m111586d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d2, "inflate(\n               …      false\n            )");
                return new C39645a(d2, this.f94257f);
            case 3:
                C37959j d3 = C37959j.m111582d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d3, "inflate(\n               …      false\n            )");
                return new C39650f(d3);
            case 4:
                C37947c0 d4 = C37947c0.m111532d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d4, "inflate(\n               …      false\n            )");
                return new C39656j(d4, this.f94257f);
            case 5:
                C37973x d5 = C37973x.m111638d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d5, "inflate(\n               …      false\n            )");
                return new C39652h(d5, this.f94257f);
            case 6:
                C37958i d6 = C37958i.m111578d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d6, "inflate(\n               …      false\n            )");
                return new C39649e(d6);
            case 7:
                C37956h d7 = C37956h.m111570d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d7, "inflate(\n               …      false\n            )");
                return new C39647c(d7, this.f94257f);
            case 8:
                C37961l d8 = C37961l.m111590d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d8, "inflate(\n               …      false\n            )");
                return new C39651g(d8);
            case 9:
                C37967r d9 = C37967r.m111614d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d9, "inflate(\n               …      false\n            )");
                return new C39648d(d9, this.f94257f);
            default:
                throw new IllegalStateException("unsupported viewType".toString());
        }
    }
}
