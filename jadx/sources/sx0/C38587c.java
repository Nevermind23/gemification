package sx0;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cx0.C31456c;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import iu0.C36546y;
import jx0.C36825i;
import jx0.C36827j;
import jx0.C36830l;
import jx0.C36832n;
import jx0.C36834p;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37833c;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import sx0.C38574b;
import tx0.C38829a;
import tx0.C38833c;
import tx0.C38837e;
import tx0.C38841g;
import tx0.C38845i;
import u61.C39033a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: sx0.c */
public abstract class C38587c extends RecyclerView.C1734f0 {

    /* renamed from: sx0.c$a */
    public static final class C38588a extends C38587c {

        /* renamed from: d */
        private final C36825i f92439d;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38588a(jx0.C36825i r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                ge.bog.designsystem.components.pagedescription.PageDescriptionView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f92439d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C38587c.C38588a.<init>(jx0.i):void");
        }

        /* renamed from: h */
        public final void mo92202h() {
            this.f92439d.f88867e.setText(C34646b.m101752f(C37833c.f90838a.mo91142d(), (Context) null, 1, (Object) null));
        }
    }

    /* renamed from: sx0.c$b */
    public static final class C38589b extends C38587c {

        /* renamed from: d */
        private final C36827j f92440d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43075l f92441e;

        /* renamed from: f */
        private final C41217g f92442f = C41219i.m119470b(new C38590a(this));

        /* renamed from: sx0.c$b$a */
        static final class C38590a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38589b f92443d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38590a(C38589b bVar) {
                super(0);
                this.f92443d = bVar;
            }

            /* renamed from: b */
            public final C38829a invoke() {
                return new C38829a(new C38599g(this.f92443d.f92441e));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38589b(jx0.C36827j r3, ue1.C43075l r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "onNodeClickedListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f92440d = r3
                r2.f92441e = r4
                sx0.c$b$a r4 = new sx0.c$b$a
                r4.<init>(r2)
                he1.g r4 = he1.C41219i.m119470b(r4)
                r2.f92442f = r4
                androidx.recyclerview.widget.RecyclerView r4 = r3.f88872f
                r4.setItemAnimator(r1)
                androidx.recyclerview.widget.RecyclerView r3 = r3.f88872f
                tx0.a r4 = r2.m113182l()
                r3.setAdapter(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C38587c.C38589b.<init>(jx0.j, ue1.l):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m113181k(C38574b.C38576b bVar, C38589b bVar2, View view) {
            C41536l.m120489i(bVar, "$item");
            C41536l.m120489i(bVar2, "this$0");
            C36546y.m108282F().mo27156w("payment_tree", "see_all", "click", C32343x.m95386E(bVar.mo92174c().mo71852c().mo71837t(), true, new Object[0]));
            bVar2.f92441e.invoke(bVar.mo92174c());
        }

        /* renamed from: l */
        private final C38829a m113182l() {
            return (C38829a) this.f92442f.getValue();
        }

        /* renamed from: j */
        public final void mo92203j(C38574b.C38576b bVar) {
            boolean z;
            C41536l.m120489i(bVar, "item");
            C36827j jVar = this.f92440d;
            Button button = jVar.f88871e;
            C41536l.m120488h(button, "button");
            if (bVar.mo92175d().size() > bVar.mo92176e()) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(button, z, false, 2, (Object) null);
            jVar.f88871e.setButtonText(C34646b.m101752f(C37833c.f90838a.mo91141c(), (Context) null, 1, (Object) null));
            jVar.f88871e.setOnClickListener(new C38604d(bVar, this));
            jVar.f88873g.setTitle(C34646b.m101752f(bVar.mo92178f(), (Context) null, 1, (Object) null));
            m113182l().mo6029i(C41358y.m120032v0(bVar.mo92175d(), bVar.mo92176e()));
        }
    }

    /* renamed from: sx0.c$c */
    public static final class C38591c extends C38587c {

        /* renamed from: d */
        private final C36830l f92444d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43075l f92445e;

        /* renamed from: f */
        private final C41217g f92446f = C41219i.m119470b(new C38592a(this));

        /* renamed from: sx0.c$c$a */
        static final class C38592a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38591c f92447d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38592a(C38591c cVar) {
                super(0);
                this.f92447d = cVar;
            }

            /* renamed from: b */
            public final C38833c invoke() {
                return new C38833c(new C38600h(this.f92447d.f92445e));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38591c(jx0.C36830l r4, ue1.C43075l r5) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                java.lang.String r0 = "onNodeClickedListener"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r4.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r3.<init>(r0, r1)
                r3.f92444d = r4
                r3.f92445e = r5
                sx0.c$c$a r5 = new sx0.c$c$a
                r5.<init>(r3)
                he1.g r5 = he1.C41219i.m119470b(r5)
                r3.f92446f = r5
                androidx.recyclerview.widget.RecyclerView r5 = r4.f88880e
                r5.setItemAnimator(r1)
                androidx.recyclerview.widget.RecyclerView r5 = r4.f88880e
                tx0.c r0 = r3.m113186j()
                r5.setAdapter(r0)
                androidx.recyclerview.widget.RecyclerView r4 = r4.f88880e
                ge.bog.designsystem.components.list.a r5 = new ge.bog.designsystem.components.list.a
                android.view.View r0 = r3.itemView
                android.content.Context r0 = r0.getContext()
                int r1 = fx0.C32023c.f78828a
                android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r0, r1)
                r1 = 1
                r2 = 0
                r5.<init>(r0, r1, r2)
                r4.mo5351j(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C38587c.C38591c.<init>(jx0.l, ue1.l):void");
        }

        /* renamed from: j */
        private final C38833c m113186j() {
            return (C38833c) this.f92446f.getValue();
        }

        /* renamed from: i */
        public final void mo92205i(C38574b.C38578c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f92444d.f88881f.setTitle(C34646b.m101752f(cVar.mo92182d(), (Context) null, 1, (Object) null));
            m113186j().mo6029i(cVar.mo92181c());
        }
    }

    /* renamed from: sx0.c$d */
    public static final class C38593d extends C38587c {

        /* renamed from: d */
        private final C36832n f92448d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43075l f92449e;

        /* renamed from: f */
        private final C41217g f92450f = C41219i.m119470b(new C38594a(this));

        /* renamed from: sx0.c$d$a */
        static final class C38594a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38593d f92451d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38594a(C38593d dVar) {
                super(0);
                this.f92451d = dVar;
            }

            /* renamed from: b */
            public final C38837e invoke() {
                return new C38837e(new C38601i(this.f92451d.f92449e));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38593d(jx0.C36832n r3, ue1.C43075l r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                java.lang.String r0 = "onNodeClickedListener"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r3.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r2.<init>(r0, r1)
                r2.f92448d = r3
                r2.f92449e = r4
                sx0.c$d$a r4 = new sx0.c$d$a
                r4.<init>(r2)
                he1.g r4 = he1.C41219i.m119470b(r4)
                r2.f92450f = r4
                androidx.recyclerview.widget.RecyclerView r4 = r3.f88887e
                r4.setItemAnimator(r1)
                androidx.recyclerview.widget.RecyclerView r3 = r3.f88887e
                tx0.e r4 = r2.m113190j()
                r3.setAdapter(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C38587c.C38593d.<init>(jx0.n, ue1.l):void");
        }

        /* renamed from: j */
        private final C38837e m113190j() {
            return (C38837e) this.f92450f.getValue();
        }

        /* renamed from: i */
        public final void mo92207i(C38574b.C38580d dVar) {
            C41536l.m120489i(dVar, "item");
            this.f92448d.f88888f.setTitle(C34646b.m101752f(dVar.mo92187d(), (Context) null, 1, (Object) null));
            m113190j().mo6029i(dVar.mo92186c());
        }
    }

    /* renamed from: sx0.c$e */
    public static final class C38595e extends C38587c {

        /* renamed from: d */
        private final C36834p f92452d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43075l f92453e;

        /* renamed from: f */
        private final C41217g f92454f = C41219i.m119470b(new C38596a(this));

        /* renamed from: sx0.c$e$a */
        static final class C38596a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38595e f92455d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38596a(C38595e eVar) {
                super(0);
                this.f92455d = eVar;
            }

            /* renamed from: b */
            public final C38841g invoke() {
                return new C38841g(new C38602j(this.f92455d.f92453e));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38595e(jx0.C36834p r4, ue1.C43075l r5) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                java.lang.String r0 = "onNodeClickedListener"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r4.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r3.<init>(r0, r1)
                r3.f92452d = r4
                r3.f92453e = r5
                sx0.c$e$a r5 = new sx0.c$e$a
                r5.<init>(r3)
                he1.g r5 = he1.C41219i.m119470b(r5)
                r3.f92454f = r5
                androidx.recyclerview.widget.RecyclerView r5 = r4.f88892e
                r5.setItemAnimator(r1)
                androidx.recyclerview.widget.RecyclerView r5 = r4.f88892e
                tx0.g r0 = r3.m113194j()
                r5.setAdapter(r0)
                androidx.recyclerview.widget.RecyclerView r4 = r4.f88892e
                ge.bog.designsystem.components.list.a r5 = new ge.bog.designsystem.components.list.a
                android.view.View r0 = r3.itemView
                android.content.Context r0 = r0.getContext()
                int r1 = fx0.C32023c.f78828a
                android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r0, r1)
                r1 = 1
                r2 = 0
                r5.<init>(r0, r1, r2)
                r4.mo5351j(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C38587c.C38595e.<init>(jx0.p, ue1.l):void");
        }

        /* renamed from: j */
        private final C38841g m113194j() {
            return (C38841g) this.f92454f.getValue();
        }

        /* renamed from: i */
        public final void mo92209i(C38574b.C38582e eVar, boolean z) {
            C41536l.m120489i(eVar, "item");
            m113194j().mo92552m(z);
            this.f92452d.f88893f.setTitle(C34646b.m101752f(eVar.mo92192d(), (Context) null, 1, (Object) null));
            m113194j().mo6029i(eVar.mo92191c());
        }
    }

    /* renamed from: sx0.c$f */
    public static final class C38597f extends C38587c {

        /* renamed from: d */
        private final C36834p f92456d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final C43075l f92457e;

        /* renamed from: f */
        private final C41217g f92458f = C41219i.m119470b(new C38598a(this));

        /* renamed from: sx0.c$f$a */
        static final class C38598a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38597f f92459d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38598a(C38597f fVar) {
                super(0);
                this.f92459d = fVar;
            }

            /* renamed from: b */
            public final C38845i invoke() {
                return new C38845i(new C38603k(this.f92459d.f92457e));
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C38597f(jx0.C36834p r4, ue1.C43075l r5) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r4, r0)
                java.lang.String r0 = "onTemplateClickedListener"
                kotlin.jvm.internal.C41536l.m120489i(r5, r0)
                ge.bog.designsystem.components.layersandshadows.LayerView r0 = r4.mo3946b()
                java.lang.String r1 = "binding.root"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r1 = 0
                r3.<init>(r0, r1)
                r3.f92456d = r4
                r3.f92457e = r5
                sx0.c$f$a r5 = new sx0.c$f$a
                r5.<init>(r3)
                he1.g r5 = he1.C41219i.m119470b(r5)
                r3.f92458f = r5
                androidx.recyclerview.widget.RecyclerView r5 = r4.f88892e
                r5.setItemAnimator(r1)
                androidx.recyclerview.widget.RecyclerView r5 = r4.f88892e
                tx0.i r0 = r3.m113198j()
                r5.setAdapter(r0)
                androidx.recyclerview.widget.RecyclerView r4 = r4.f88892e
                ge.bog.designsystem.components.list.a r5 = new ge.bog.designsystem.components.list.a
                android.view.View r0 = r3.itemView
                android.content.Context r0 = r0.getContext()
                int r1 = fx0.C32023c.f78828a
                android.graphics.drawable.Drawable r0 = androidx.core.content.C0767a.m2895e(r0, r1)
                r1 = 1
                r2 = 0
                r5.<init>(r0, r1, r2)
                r4.mo5351j(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sx0.C38587c.C38597f.<init>(jx0.p, ue1.l):void");
        }

        /* renamed from: j */
        private final C38845i m113198j() {
            return (C38845i) this.f92458f.getValue();
        }

        /* renamed from: i */
        public final void mo92211i(C38574b.C38584f fVar) {
            C41536l.m120489i(fVar, "item");
            this.f92456d.f88893f.setTitle(C34646b.m101752f(fVar.mo92197d(), (Context) null, 1, (Object) null));
            m113198j().mo6029i(fVar.mo92196c());
        }
    }

    /* renamed from: sx0.c$g */
    static final class C38599g implements C38829a.C38830a, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92460a;

        C38599g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92460a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92213a(C31456c cVar) {
            this.f92460a.invoke(cVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C38829a.C38830a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92460a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: sx0.c$h */
    static final class C38600h implements C38833c.C38834a, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92461a;

        C38600h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92461a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92216a(C31456c cVar) {
            this.f92461a.invoke(cVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C38833c.C38834a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92461a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: sx0.c$i */
    static final class C38601i implements C38837e.C38838a, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92462a;

        C38601i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92462a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92219a(C31456c cVar) {
            this.f92462a.invoke(cVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C38837e.C38838a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92462a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: sx0.c$j */
    static final class C38602j implements C38841g.C38842a, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92463a;

        C38602j(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92463a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92222a(C31456c cVar) {
            this.f92463a.invoke(cVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C38841g.C38842a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92463a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: sx0.c$k */
    static final class C38603k implements C38845i.C38846a, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92464a;

        C38603k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92464a = lVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo92225a(C39033a aVar) {
            this.f92464a.invoke(aVar);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C38845i.C38846a) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92464a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public /* synthetic */ C38587c(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    private C38587c(View view) {
        super(view);
    }
}
