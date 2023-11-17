package ro0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ao0.C10119a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37599g;
import so0.C17906b;
import so0.C17907c;
import uo0.C18273e;
import xn0.C18861s;

/* renamed from: ro0.a */
public final class C17697a extends C1819o {

    /* renamed from: i */
    public static final C17698a f49417i = new C17698a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C17906b f49418f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C17907c f49419g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f49420h = -1;

    /* renamed from: ro0.a$a */
    public static final class C17698a {
        private C17698a() {
        }

        public /* synthetic */ C17698a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ro0.a$b */
    public final class C17699b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18861s f49421d;

        /* renamed from: e */
        final /* synthetic */ C17697a f49422e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17699b(C17697a aVar, C18861s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f49422e = aVar;
            this.f49421d = sVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m61371k(C17697a aVar, C18273e eVar, View view) {
            boolean z;
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(eVar, "$data");
            C17906b l = aVar.f49418f;
            if (l != null) {
                long k = eVar.mo45962k();
                String d = eVar.mo45953d();
                if (eVar.mo45952c() == C10119a.BNPL) {
                    z = true;
                } else {
                    z = false;
                }
                l.mo32992a(k, d, z);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m61372l(C17697a aVar, C18273e eVar) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(eVar, "$data");
            C17907c m = aVar.f49419g;
            if (m != null) {
                m.mo33005a(eVar.mo45962k(), Integer.valueOf(aVar.f49420h));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: ge.bog.designsystem.components.common.Image$Url} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo45257j(uo0.C18273e r15) {
            /*
                r14 = this;
                java.lang.String r0 = "data"
                kotlin.jvm.internal.C41536l.m120489i(r15, r0)
                ge.bog.designsystem.components.chipsbadge.ChipsBadgeView$a r0 = r15.mo45950a()
                java.util.List r0 = ie1.C41341q.m119911n(r0)
                xn0.s r1 = r14.f49421d
                ge.bog.designsystem.components.textimagecard.TextImageCardView r1 = r1.f52776e
                ro0.a r2 = r14.f49422e
                java.lang.String r4 = r15.mo45960i()
                if (r4 == 0) goto L_0x0029
                ge.bog.designsystem.components.common.Image$Url r13 = new ge.bog.designsystem.components.common.Image$Url
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 126(0x7e, float:1.77E-43)
                r12 = 0
                r3 = r13
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                goto L_0x0032
            L_0x0029:
                ge.bog.designsystem.components.common.Image$Resource r13 = new ge.bog.designsystem.components.common.Image$Resource
                int r3 = sn0.C17900d.f50943s
                r4 = 2
                r5 = 0
                r13.<init>(r3, r5, r4, r5)
            L_0x0032:
                r1.setImage(r13)
                java.lang.String r3 = r15.mo45963l()
                r1.setDescription(r3)
                boolean r3 = r15.mo45958h()
                r1.setDismissButtonVisible(r3)
                uj.a r3 = r15.mo45965n()
                java.lang.String r4 = r15.mo45966o()
                r1.mo36861d(r3, r4)
                boolean r3 = r0.isEmpty()
                r3 = r3 ^ 1
                if (r3 == 0) goto L_0x0059
                r1.mo36859a(r0)
            L_0x0059:
                ro0.b r0 = new ro0.b
                r0.<init>(r2, r15)
                r1.setOnClickListener(r0)
                ro0.c r0 = new ro0.c
                r0.<init>(r2, r15)
                r1.setOnDismissCardListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ro0.C17697a.C17699b.mo45257j(uo0.e):void");
        }
    }

    public C17697a() {
        super(C37599g.f90345a.mo90787d());
    }

    public int getItemViewType(int i) {
        return 0;
    }

    /* renamed from: n */
    public void onBindViewHolder(C17699b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo45257j((C18273e) g);
    }

    /* renamed from: o */
    public C17699b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18861s d = C18861s.m63815d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C17699b(this, d);
    }

    /* renamed from: p */
    public final void mo45254p(C17906b bVar) {
        this.f49418f = bVar;
    }

    /* renamed from: q */
    public final void mo45255q(C17907c cVar) {
        this.f49419g = cVar;
    }

    /* renamed from: r */
    public final void mo45256r(List list, int i) {
        C41536l.m120489i(list, "list");
        this.f49420h = i;
        mo6029i(list);
    }
}
