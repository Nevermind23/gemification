package xi0;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26237a;
import o31.C37599g;
import o31.C37608o;
import o31.C37621w;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p631uj.C18174a;
import p642vh.C18368l;
import th0.C28424s;
import th0.C28426t;
import ue1.C43075l;
import wi0.C29435f;
import wi0.C29440h;

/* renamed from: xi0.c */
public final class C29803c extends C26237a {

    /* renamed from: m */
    public static final C29806b f75466m = new C29806b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C28424s f75467d;

    /* renamed from: e */
    private final RecyclerView.C1757v f75468e;

    /* renamed from: f */
    private final Map f75469f;

    /* renamed from: g */
    private final C29435f.C29438c f75470g;

    /* renamed from: h */
    private final C29804a f75471h;

    /* renamed from: i */
    private final int f75472i;

    /* renamed from: j */
    private final C37621w f75473j;

    /* renamed from: k */
    private final C37608o f75474k;

    /* renamed from: l */
    private final LinearLayoutManager f75475l;

    /* renamed from: xi0.c$a */
    private static final class C29804a extends C1819o {

        /* renamed from: f */
        private final C29435f.C29438c f75476f;

        /* renamed from: xi0.c$a$a */
        private static final class C29805a extends RecyclerView.C1734f0 {

            /* renamed from: d */
            private final C28426t f75477d;

            /* renamed from: e */
            private final C29435f.C29438c f75478e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C29805a(C28426t tVar, C29435f.C29438c cVar) {
                super(tVar.mo3946b());
                C41536l.m120489i(tVar, "binding");
                C41536l.m120489i(cVar, "listener");
                this.f75477d = tVar;
                this.f75478e = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public static final void m90551j(C29805a aVar, C25740a aVar2, View view) {
                C41536l.m120489i(aVar, "this$0");
                C41536l.m120489i(aVar2, "$item");
                aVar.f75478e.mo69265k(aVar2);
            }

            /* renamed from: i */
            public final void mo70060i(C25740a aVar) {
                C41536l.m120489i(aVar, "item");
                TextImageCardView c = this.f75477d.mo3946b();
                c.setDescription(aVar.mo64315c());
                c.setImage(aVar.mo64314b());
                c.mo36861d(C18174a.INVISIBLE, "");
                c.setOnClickListener(new C29802b(this, aVar));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29804a(C29435f.C29438c cVar) {
            super(C37599g.f90345a.mo90787d());
            C41536l.m120489i(cVar, "listener");
            this.f75476f = cVar;
        }

        /* renamed from: k */
        public void onBindViewHolder(C29805a aVar, int i) {
            C41536l.m120489i(aVar, "holder");
            Object g = mo6027g(i);
            C41536l.m120488h(g, "getItem(position)");
            aVar.mo70060i((C25740a) g);
        }

        /* renamed from: l */
        public C29805a onCreateViewHolder(ViewGroup viewGroup, int i) {
            C41536l.m120489i(viewGroup, "parent");
            C28426t d = C28426t.m87226d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …      false\n            )");
            return new C29805a(d, this.f75476f);
        }
    }

    /* renamed from: xi0.c$b */
    public static final class C29806b {
        private C29806b() {
        }

        public /* synthetic */ C29806b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29803c(th0.C28424s r19, androidx.recyclerview.widget.RecyclerView.C1757v r20, java.util.Map r21, wi0.C29435f.C29438c r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            java.lang.String r5 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r1, r5)
            java.lang.String r5 = "recyclerViewPool"
            kotlin.jvm.internal.C41536l.m120489i(r2, r5)
            java.lang.String r5 = "scrollStates"
            kotlin.jvm.internal.C41536l.m120489i(r3, r5)
            java.lang.String r5 = "listener"
            kotlin.jvm.internal.C41536l.m120489i(r4, r5)
            android.widget.LinearLayout r5 = r19.mo3946b()
            java.lang.String r6 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r0.<init>(r5)
            r0.f75467d = r1
            r0.f75468e = r2
            r0.f75469f = r3
            r0.f75470g = r4
            xi0.c$a r3 = new xi0.c$a
            r3.<init>(r4)
            r0.f75471h = r3
            android.widget.LinearLayout r4 = r19.mo3946b()
            android.content.Context r4 = r4.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r5 = oh0.C27008c.f67784a
            int r7 = r4.getDimensionPixelOffset(r5)
            r0.f75472i = r7
            o31.w r4 = new o31.w
            r8 = 0
            r9 = 0
            r10 = 2
            r11 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f75473j = r4
            o31.o r5 = new o31.o
            r13 = 8388611(0x800003, float:1.1754948E-38)
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            r12 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r0.f75474k = r5
            androidx.recyclerview.widget.RecyclerView r6 = r1.f72205j
            androidx.recyclerview.widget.RecyclerView$p r6 = r6.getLayoutManager()
            boolean r7 = r6 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r8 = 0
            if (r7 == 0) goto L_0x0078
            androidx.recyclerview.widget.LinearLayoutManager r6 = (androidx.recyclerview.widget.LinearLayoutManager) r6
            goto L_0x0079
        L_0x0078:
            r6 = r8
        L_0x0079:
            r0.f75475l = r6
            if (r6 != 0) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            r7 = 5
            r6.mo5202Q2(r7)
        L_0x0082:
            androidx.recyclerview.widget.RecyclerView r6 = r1.f72205j
            r6.setRecycledViewPool(r2)
            r2 = 1
            r6.setHasFixedSize(r2)
            r6.mo5351j(r4)
            r6.setItemAnimator(r8)
            r6.setAdapter(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r1.f72205j
            r5.mo6073b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xi0.C29803c.<init>(th0.s, androidx.recyclerview.widget.RecyclerView$v, java.util.Map, wi0.f$c):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m90543l(C29803c cVar, C29440h.C29442b bVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(bVar, "$categoriesSectionItem");
        cVar.f75470g.mo69264f0(bVar.mo69281d());
    }

    /* renamed from: k */
    public void mo65239h(C29440h hVar) {
        C41536l.m120489i(hVar, "item");
        C28424s sVar = this.f75467d;
        C29440h.C29442b bVar = (C29440h.C29442b) hVar;
        sVar.f72203h.setButtonText(C34646b.m101752f(bVar.mo69279b(), (Context) null, 1, (Object) null));
        sVar.f72202g.setTitle(bVar.mo69284f());
        AppCompatImageView appCompatImageView = sVar.f72201f;
        C41536l.m120488h(appCompatImageView, "categoriesSectionLogo");
        C18368l.m62746A(appCompatImageView, bVar.mo69282e(), (C43075l) null, 2, (Object) null);
        this.f75471h.mo6029i(bVar.mo69280c());
        Parcelable parcelable = (Parcelable) this.f75469f.get(Long.valueOf(bVar.mo69281d()));
        if (parcelable != null) {
            RecyclerView.C1747p layoutManager = sVar.f72205j.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5218n1(parcelable);
            }
        } else {
            RecyclerView.C1747p layoutManager2 = sVar.f72205j.getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.mo5197J1(0);
            }
        }
        sVar.f72203h.setOnClickListener(new C29801a(this, bVar));
    }

    /* renamed from: m */
    public void mo65240i(C29440h hVar) {
        Parcelable parcelable;
        C41536l.m120489i(hVar, "item");
        Map map = this.f75469f;
        Long valueOf = Long.valueOf(((C29440h.C29442b) hVar).mo69281d());
        RecyclerView.C1747p layoutManager = this.f75467d.f72205j.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.mo5220o1();
        } else {
            parcelable = null;
        }
        map.put(valueOf, parcelable);
    }
}
