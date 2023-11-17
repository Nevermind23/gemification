package vi0;

import android.content.Context;
import com.google.android.material.tabs.TabLayout;
import g91.C32343x;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import mj0.C26237a;
import p341ge.bog.designsystem.components.tabgroup.TabsGroupView;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a;
import p341ge.bog.mobilebank.giftcards.presentation.filtered.C24254d;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import th0.C28436y;
import ue1.C43075l;
import ui0.C28798a;

/* renamed from: vi0.a */
public final class C29080a extends C26237a {

    /* renamed from: d */
    private final C28436y f74089d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C24246a.C24249c f74090e;

    /* renamed from: vi0.a$a */
    static final class C29081a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29080a f74091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29081a(C29080a aVar) {
            super(1);
            this.f74091d = aVar;
        }

        /* renamed from: a */
        public final void mo68960a(TabLayout.C5153g gVar) {
            C24246a.C24249c j = this.f74091d.f74090e;
            Object i = gVar != null ? gVar.mo16960i() : null;
            C41536l.m120487g(i, "null cannot be cast to non-null type kotlin.Long");
            j.mo61883I0(((Long) i).longValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo68960a((TabLayout.C5153g) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29080a(th0.C28436y r3, p341ge.bog.mobilebank.giftcards.presentation.filtered.C24246a.C24249c r4) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "uiEventListener"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            ge.bog.designsystem.components.tabgroup.TabsGroupView r0 = r3.mo3946b()
            java.lang.String r1 = "binding.root"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r2.<init>(r0)
            r2.f74089d = r3
            r2.f74090e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi0.C29080a.<init>(th0.y, ge.bog.mobilebank.giftcards.presentation.filtered.a$c):void");
    }

    /* renamed from: k */
    public void mo65239h(C24254d dVar) {
        C41536l.m120489i(dVar, "item");
        TabsGroupView tabsGroupView = this.f74089d.f72235e;
        tabsGroupView.removeAllTabs();
        for (C28798a aVar : ((C24254d.C24256b) dVar).mo61913e()) {
            TabLayout.C5153g newTab = tabsGroupView.newTab();
            boolean z = true;
            newTab.mo16972u(C34646b.m101752f(aVar.mo68522c(), (Context) null, 1, (Object) null));
            newTab.mo16970s(Long.valueOf(aVar.mo68520a()));
            long a = aVar.mo68520a();
            Long b = aVar.mo68521b();
            if (b == null || a != b.longValue()) {
                z = false;
            }
            tabsGroupView.addTab(newTab, z);
        }
        C41536l.m120488h(tabsGroupView, "bind$lambda$2");
        C32343x.m95417T0(tabsGroupView, new C29081a(this));
    }
}
