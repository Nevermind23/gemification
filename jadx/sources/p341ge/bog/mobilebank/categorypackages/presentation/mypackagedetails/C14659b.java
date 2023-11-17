package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.C1827s;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import g91.C32343x;
import he1.C41212c;
import he1.C41238w;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.packagecard.PackageCardView;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14705f;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14707g;
import p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.helper.HorizontalRatioLinearLayoutManager;
import p356ao.C10112d;
import p356ao.C10115g;
import p413eo.C12728a1;
import p413eo.C12731b1;
import p413eo.C12734c1;
import p413eo.C12737d1;
import p413eo.C12740e1;
import p413eo.C12773u0;
import p413eo.C12779x0;
import p413eo.C12783z0;
import p414ep.C12808a;
import p414ep.C12809b;
import p414ep.C12810c;
import p414ep.C12811d;
import p414ep.C12812e;
import p414ep.C12813f;
import p414ep.C12814g;
import p414ep.C12815h;
import p512lp.C16644b;
import p512lp.C16647c;
import p512lp.C16652e;
import p526mp.C16885b;
import p526mp.C16886c;
import p554op.C17313i;
import p610sp.C17913e;
import p642vh.C18338b0;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b */
public final class C14659b extends C1819o {

    /* renamed from: f */
    private final C14705f f42608f;

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$a */
    public static final class C14660a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12773u0 f42609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14660a(C12773u0 u0Var, C14705f fVar) {
            super(u0Var.mo3946b());
            C41536l.m120489i(u0Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42609d = u0Var;
            u0Var.f37873f.setOnClickListener(new C12808a(fVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m53999i(C14705f fVar, View view) {
            C41536l.m120489i(fVar, "$viewModelInput");
            fVar.mo41100Cr();
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo41049j(p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14707g.C14708a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                eo.u0 r0 = r6.f42609d
                ge.bog.designsystem.components.emptywidget.EmptyWidget r0 = r0.f37875h
                java.lang.String r1 = "bind$lambda$1"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                java.lang.String r1 = r7.mo41114d()
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0023
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x001e
                r1 = r2
                goto L_0x001f
            L_0x001e:
                r1 = r3
            L_0x001f:
                if (r1 != r2) goto L_0x0023
                r1 = r2
                goto L_0x0024
            L_0x0023:
                r1 = r3
            L_0x0024:
                r4 = 2
                r5 = 0
                g91.C32343x.m95483r1(r0, r1, r3, r4, r5)
                java.lang.String r1 = r7.mo41114d()
                r0.setTitle(r1)
                java.lang.String r1 = r7.mo41111a()
                r0.setText(r1)
                java.lang.String r1 = r7.mo41111a()
                if (r1 == 0) goto L_0x0046
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0044
                goto L_0x0046
            L_0x0044:
                r1 = r3
                goto L_0x0047
            L_0x0046:
                r1 = r2
            L_0x0047:
                r1 = r1 ^ r2
                r0.setEnableTwoLineText(r1)
                eo.u0 r0 = r6.f42609d
                ge.bog.designsystem.components.emptywidget.EmptyWidget r0 = r0.f37874g
                java.lang.String r1 = "bind$lambda$2"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                java.lang.String r1 = r7.mo41113c()
                if (r1 == 0) goto L_0x0067
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0062
                r1 = r2
                goto L_0x0063
            L_0x0062:
                r1 = r3
            L_0x0063:
                if (r1 != r2) goto L_0x0067
                r1 = r2
                goto L_0x0068
            L_0x0067:
                r1 = r3
            L_0x0068:
                g91.C32343x.m95483r1(r0, r1, r3, r4, r5)
                ge.bog.designsystem.components.common.Color$Resource r1 = new ge.bog.designsystem.components.common.Color$Resource
                int r4 = p356ao.C10110b.f27901j
                r1.<init>(r4)
                r0.setTitleTextColor(r1)
                java.lang.String r1 = r7.mo41113c()
                r0.setTitle(r1)
                java.lang.String r1 = r7.mo41112b()
                r0.setText(r1)
                java.lang.String r7 = r7.mo41112b()
                if (r7 == 0) goto L_0x008f
                int r7 = r7.length()
                if (r7 != 0) goto L_0x0090
            L_0x008f:
                r3 = r2
            L_0x0090:
                r7 = r3 ^ 1
                r0.setEnableTwoLineText(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.C14659b.C14660a.mo41049j(ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.g$a):void");
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$b */
    public static final class C14661b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12779x0 f42610d;

        /* renamed from: e */
        private final C16644b f42611e;

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$b$a */
        /* synthetic */ class C14662a implements C16652e, C41532h {

            /* renamed from: a */
            final /* synthetic */ C14705f f42612a;

            C14662a(C14705f fVar) {
                this.f42612a = fVar;
            }

            /* renamed from: a */
            public final void mo41051a(C16886c cVar) {
                C41536l.m120489i(cVar, "p0");
                this.f42612a.mo41099C8(cVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C16652e) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f42612a, C14705f.class, "onBenefitClick", "onBenefitClick(Lge/bog/mobilebank/categorypackages/presentation/mypackagedetails/model/PackageBenefitUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14661b(C12779x0 x0Var, C14705f fVar) {
            super(x0Var.mo3946b());
            C41536l.m120489i(x0Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42610d = x0Var;
            this.f42611e = new C16644b(new C14662a(fVar));
        }

        /* renamed from: h */
        public final void mo41050h(C14707g.C14709b bVar) {
            C41536l.m120489i(bVar, "data");
            this.f42610d.f37890e.setTitle(C32343x.m95388F("text.packages.my.package.benefits", new Object[0]));
            this.f42610d.f37891f.setAdapter(this.f42611e);
            this.f42611e.mo6029i(bVar.mo41115a());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$c */
    public static final class C14663c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12783z0 f42613d;

        /* renamed from: e */
        private final C16647c f42614e;

        /* renamed from: f */
        private final C1827s f42615f = new C1827s();

        /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$c$a */
        /* synthetic */ class C14664a implements C16647c.C16648a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C14705f f42616a;

            C14664a(C14705f fVar) {
                this.f42616a = fVar;
            }

            /* renamed from: a */
            public final void mo41055a(C16885b bVar) {
                C41536l.m120489i(bVar, "p0");
                this.f42616a.mo41103Qa(bVar);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C16647c.C16648a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f42616a, C14705f.class, "onCardBannerClick", "onCardBannerClick(Lge/bog/mobilebank/categorypackages/presentation/mypackagedetails/model/DebitCardUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14663c(C12783z0 z0Var, C14705f fVar) {
            super(z0Var.mo3946b());
            C41536l.m120489i(z0Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42613d = z0Var;
            this.f42614e = new C16647c(new C14664a(fVar));
        }

        /* renamed from: h */
        public final void mo41054h(C14707g.C14710c cVar) {
            boolean z;
            C41536l.m120489i(cVar, "data");
            EmptyWidget emptyWidget = this.f42613d.f37900e;
            emptyWidget.setTitle(C32343x.m95388F("my.package.page.cards.offer.header", new Object[0]));
            emptyWidget.setText(C32343x.m95388F("my.package.page.cards.offer.explanatory", new Object[0]));
            emptyWidget.setEnableTwoLineText(true);
            RecyclerView recyclerView = this.f42613d.f37901f;
            recyclerView.setAdapter(this.f42614e);
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            if (cVar.mo41116a().size() == 1) {
                z = true;
            } else {
                z = false;
            }
            recyclerView.setLayoutManager(new HorizontalRatioLinearLayoutManager(context, 0, z, 2, (DefaultConstructorMarker) null));
            this.f42615f.mo6073b(recyclerView);
            this.f42614e.mo6029i(cVar.mo41116a());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$d */
    public static final class C14665d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12728a1 f42617d;

        /* renamed from: e */
        private final C14705f f42618e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14665d(C12728a1 a1Var, C14705f fVar) {
            super(a1Var.mo3946b());
            C41536l.m120489i(a1Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42617d = a1Var;
            this.f42618e = fVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m54006j(C14665d dVar, View view) {
            C41536l.m120489i(dVar, "this$0");
            dVar.f42618e.mo41106c();
        }

        /* renamed from: i */
        public final void mo41058i() {
            this.f42617d.f37664e.setText(C32343x.m95388F("my.package.page.service.failure.explanatory.text", new Object[0]));
            Button button = this.f42617d.f37665f;
            button.setButtonText(C32343x.m95388F("my.package.page.service.failure.refresh.button.label", new Object[0]));
            button.setOnClickListener(new C12809b(this));
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$e */
    public static final class C14666e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12731b1 f42619d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14666e(C12731b1 b1Var, C14705f fVar) {
            super(b1Var.mo3946b());
            C41536l.m120489i(b1Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42619d = b1Var;
            b1Var.f37680f.setOnClickListener(new C12810c(fVar));
            b1Var.f37682h.setOnClickListener(new C12811d(fVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m54010j(C14705f fVar, View view) {
            C41536l.m120489i(fVar, "$viewModelInput");
            C14705f.C14706a.m54112a(fVar, false, 1, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m54011k(C14705f fVar, View view) {
            C41536l.m120489i(fVar, "$viewModelInput");
            C14705f.C14706a.m54112a(fVar, false, 1, (Object) null);
        }

        /* renamed from: l */
        public final void mo41059l(C14707g.C14712e eVar) {
            C41536l.m120489i(eVar, "data");
            C12731b1 b1Var = this.f42619d;
            b1Var.f37679e.setTitle(C32343x.m95388F("my.package.page.no.active.package.info.header", new Object[0]));
            b1Var.f37679e.setText(C32343x.m95388F("my.package.page.no.active.package.info.explanatory", new Object[0]));
            b1Var.f37680f.setButtonText(C32343x.m95388F("my.package.page.no.active.package.info.button.label", new Object[0]));
            b1Var.f37682h.setButtonText(C32343x.m95388F("my.package.page.no.active.package.info.button.label", new Object[0]));
            Button button = b1Var.f37680f;
            C41536l.m120488h(button, "primaryButton");
            C32343x.m95483r1(button, !eVar.mo41117a(), false, 2, (Object) null);
            Button button2 = b1Var.f37682h;
            C41536l.m120488h(button2, "secondaryButton");
            C32343x.m95483r1(button2, eVar.mo41117a(), false, 2, (Object) null);
            PackageCardView packageCardView = b1Var.f37681g;
            C41536l.m120488h(packageCardView, "recommendedCard");
            C32343x.m95483r1(packageCardView, false, false, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$f */
    public static final class C14667f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12734c1 f42620d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14667f(C12734c1 c1Var) {
            super(c1Var.mo3946b());
            C41536l.m120489i(c1Var, "binding");
            this.f42620d = c1Var;
        }

        /* renamed from: h */
        public final void mo41060h(C14707g.C14713f fVar) {
            C41536l.m120489i(fVar, "data");
            this.f42620d.f37690e.mo36729f(fVar.mo41118a());
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$g */
    public static final class C14668g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12737d1 f42621d;

        /* renamed from: e */
        private final C14705f f42622e;

        /* renamed from: f */
        private final C17313i f42623f = new C17313i(new C12813f(this));

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14668g(C12737d1 d1Var, C14705f fVar) {
            super(d1Var.mo3946b());
            C41536l.m120489i(d1Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42621d = d1Var;
            this.f42622e = fVar;
            ViewPager2 viewPager2 = d1Var.f37698f;
            C41536l.m120488h(viewPager2, "binding.pager");
            C17913e.m61725g(viewPager2);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m54016k(C14668g gVar, C14707g.C14714g gVar2) {
            C41536l.m120489i(gVar, "this$0");
            C41536l.m120489i(gVar2, "$data");
            gVar.f42623f.mo6029i(gVar2.mo41119a());
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m54017l(C14668g gVar) {
            C41536l.m120489i(gVar, "this$0");
            gVar.f42622e.mo41110xb(true);
        }

        /* renamed from: j */
        public final Object mo41061j(C14707g.C14714g gVar) {
            C41536l.m120489i(gVar, "data");
            C12737d1 d1Var = this.f42621d;
            EmptyWidget emptyWidget = d1Var.f37697e;
            C41536l.m120488h(emptyWidget, "bind$lambda$4$lambda$1");
            C32343x.m95483r1(emptyWidget, gVar.mo41120b(), false, 2, (Object) null);
            emptyWidget.setTitle(C32343x.m95388F("text.packages.benefits.page.show.packages", new Object[0]));
            d1Var.f37698f.setAdapter(this.f42623f);
            this.f42623f.mo6030j(C41341q.m119907j(), new C12812e(this, gVar));
            if (gVar.mo41119a().size() > 1) {
                this.f42621d.f37698f.setOffscreenPageLimit(gVar.mo41119a().size());
                C18338b0.C18341c cVar = new C18338b0.C18341c(0, false, 3, (DefaultConstructorMarker) null);
                ViewPager2 viewPager2 = d1Var.f37698f;
                C41536l.m120488h(viewPager2, "pager");
                FrameLayout frameLayout = d1Var.f37699g;
                C41536l.m120488h(frameLayout, "scrollingIndicator");
                return cVar.mo46116a(viewPager2, frameLayout);
            }
            FrameLayout frameLayout2 = this.f42621d.f37699g;
            C41536l.m120488h(frameLayout2, "binding.scrollingIndicator");
            C32343x.m95405N0(frameLayout2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.b$h */
    public static final class C14669h extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12740e1 f42624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14669h(C12740e1 e1Var, C14705f fVar) {
            super(e1Var.mo3946b());
            C41536l.m120489i(e1Var, "binding");
            C41536l.m120489i(fVar, "viewModelInput");
            this.f42624d = e1Var;
            e1Var.mo3946b().setOnClickListener(new C12814g(fVar));
            e1Var.f37708e.setOnButtonClickListener(new C12815h(fVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m54021j(C14705f fVar, View view) {
            C41536l.m120489i(fVar, "$viewModelInput");
            fVar.mo41107go();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m54022k(C14705f fVar, View view) {
            C41536l.m120489i(fVar, "$viewModelInput");
            fVar.mo41107go();
        }

        /* renamed from: l */
        public final void mo41062l(C14707g.C14715h hVar) {
            C41536l.m120489i(hVar, "data");
            ButtonListLargeView buttonListLargeView = this.f42624d.f37708e;
            buttonListLargeView.setButtonListType(ButtonListLargeView.C13185c.THUMBNAIL_SECONDARY_TEXT);
            buttonListLargeView.setChangeButtonVisible(false);
            buttonListLargeView.setBottomViewType(ButtonListLargeView.C13183a.TEXT_VIEW);
            buttonListLargeView.setLowerText(hVar.mo41123c());
            buttonListLargeView.setUpperText(hVar.mo41124d());
            buttonListLargeView.setBadgeOnButtonVisible(hVar.mo41121a());
            buttonListLargeView.setIconButtonVisible(true);
            buttonListLargeView.setIconButtonDrawable(C32343x.m95424X(C10112d.f27915h, buttonListLargeView.getContext()));
            String b = hVar.mo41122b();
            if (b == null) {
                b = "";
            }
            buttonListLargeView.setIcon(new Image.Url(b, (Image.Placeholder) null, new Image.Resource(C10112d.f27916i, (Boolean) null, 2, (DefaultConstructorMarker) null), (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 122, (DefaultConstructorMarker) null));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14659b(C14705f fVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(fVar, "viewModelInput");
        this.f42608f = fVar;
    }

    public int getItemViewType(int i) {
        C14707g gVar = (C14707g) mo6027g(i);
        if (gVar instanceof C14707g.C14715h) {
            return C10115g.list_item_user_section;
        }
        if (gVar instanceof C14707g.C14708a) {
            return C10115g.list_item_active_package_info;
        }
        if (gVar instanceof C14707g.C14710c) {
            return C10115g.list_item_card_banner_slider;
        }
        if (gVar instanceof C14707g.C14713f) {
            return C10115g.list_item_package_commission;
        }
        if (gVar instanceof C14707g.C14709b) {
            return C10115g.list_item_benefits_section;
        }
        if (gVar instanceof C14707g.C14711d) {
            return C10115g.list_item_error;
        }
        if (gVar instanceof C14707g.C14712e) {
            return C10115g.list_item_no_active_packages;
        }
        if (gVar instanceof C14707g.C14714g) {
            return C10115g.list_item_recommended_package_slider;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C14707g gVar = (C14707g) mo6027g(i);
        if (gVar instanceof C14707g.C14715h) {
            ((C14669h) f0Var).mo41062l((C14707g.C14715h) gVar);
        } else if (gVar instanceof C14707g.C14708a) {
            ((C14660a) f0Var).mo41049j((C14707g.C14708a) gVar);
        } else if (gVar instanceof C14707g.C14713f) {
            ((C14667f) f0Var).mo41060h((C14707g.C14713f) gVar);
        } else if (gVar instanceof C14707g.C14709b) {
            ((C14661b) f0Var).mo41050h((C14707g.C14709b) gVar);
        } else if (gVar instanceof C14707g.C14712e) {
            ((C14666e) f0Var).mo41059l((C14707g.C14712e) gVar);
        } else if (gVar instanceof C14707g.C14710c) {
            ((C14663c) f0Var).mo41054h((C14707g.C14710c) gVar);
        } else if (gVar instanceof C14707g.C14714g) {
            ((C14668g) f0Var).mo41061j((C14707g.C14714g) gVar);
        } else if (gVar instanceof C14707g.C14711d) {
            ((C14665d) f0Var).mo41058i();
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C10115g.list_item_user_section) {
            C12740e1 d = C12740e1.m48354d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(inflater, parent, false)");
            return new C14669h(d, this.f42608f);
        } else if (i == C10115g.list_item_active_package_info) {
            C12773u0 d2 = C12773u0.m48492d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C14660a(d2, this.f42608f);
        } else if (i == C10115g.list_item_card_banner_slider) {
            C12783z0 d3 = C12783z0.m48532d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(inflater, parent, false)");
            return new C14663c(d3, this.f42608f);
        } else if (i == C10115g.list_item_package_commission) {
            C12734c1 d4 = C12734c1.m48330d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C14667f(d4);
        } else if (i == C10115g.list_item_benefits_section) {
            C12779x0 d5 = C12779x0.m48516d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(inflater, parent, false)");
            return new C14661b(d5, this.f42608f);
        } else if (i == C10115g.list_item_error) {
            C12728a1 d6 = C12728a1.m48306d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(inflater, parent, false)");
            return new C14665d(d6, this.f42608f);
        } else if (i == C10115g.list_item_no_active_packages) {
            C12731b1 d7 = C12731b1.m48318d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(inflater, parent, false)");
            return new C14666e(d7, this.f42608f);
        } else if (i == C10115g.list_item_recommended_package_slider) {
            C12737d1 d8 = C12737d1.m48342d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(inflater, parent, false)");
            return new C14668g(d8, this.f42608f);
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }
}
