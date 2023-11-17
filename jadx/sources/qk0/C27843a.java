package qk0;

import android.content.Context;
import ee1.C40765a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ok0.C27031g;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import pk0.C27594e;
import q11.C38105e;
import r11.C38277b;
import tk0.C28449d;
import tk0.C28450e;
import tk0.C28451f;
import tk0.C28453g;
import tk0.C28455i;
import tk0.C28456j;

/* renamed from: qk0.a */
public final class C27843a {

    /* renamed from: i */
    public static final C27844a f70968i = new C27844a((DefaultConstructorMarker) null);

    /* renamed from: j */
    private static final int f70969j = C27031g.f67896c;

    /* renamed from: a */
    private final C28449d f70970a;

    /* renamed from: b */
    private final C28455i f70971b;

    /* renamed from: c */
    private final C28450e f70972c;

    /* renamed from: d */
    private final C28451f f70973d;

    /* renamed from: e */
    private final C28453g f70974e;

    /* renamed from: f */
    private final C38105e f70975f;

    /* renamed from: g */
    private final C38277b f70976g;

    /* renamed from: h */
    private final C28456j f70977h;

    /* renamed from: qk0.a$a */
    public static final class C27844a {
        private C27844a() {
        }

        public /* synthetic */ C27844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C27843a(C28449d dVar, C28455i iVar, C28450e eVar, C28451f fVar, C28453g gVar, C38105e eVar2, C38277b bVar, C28456j jVar) {
        C41536l.m120489i(dVar, "getGroupingProductHubs");
        C41536l.m120489i(iVar, "getTransactionsHubs");
        C41536l.m120489i(eVar, "getNonBankingHubs");
        C41536l.m120489i(fVar, "getOtherProductHubs");
        C41536l.m120489i(gVar, "getOurAppsHubs");
        C41536l.m120489i(eVar2, "getSecurityItems");
        C41536l.m120489i(bVar, "managementItemsLocator");
        C41536l.m120489i(jVar, "hideBankingGroup");
        this.f70970a = dVar;
        this.f70971b = iVar;
        this.f70972c = eVar;
        this.f70973d = fVar;
        this.f70974e = gVar;
        this.f70975f = eVar2;
        this.f70976g = bVar;
        this.f70977h = jVar;
    }

    /* renamed from: a */
    public final List mo67359a(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (!this.f70977h.mo68083a()) {
            arrayList.addAll(this.f70970a.mo68077b());
        }
        arrayList.addAll(this.f70971b.mo68082a());
        arrayList.addAll(this.f70972c.mo68078a(z, z2));
        arrayList.addAll(this.f70973d.mo68079a());
        arrayList.addAll(this.f70974e.mo68080a());
        arrayList.addAll(mo67361c());
        arrayList.add(C27594e.C27595a.C27596a.f70528e);
        return C41358y.m120036z0(arrayList);
    }

    /* renamed from: b */
    public final C40765a mo67360b() {
        return this.f70976g.mo91831i();
    }

    /* renamed from: c */
    public final List mo67361c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C27594e.C27597b.C27598a.f70533e);
        arrayList.addAll(this.f70975f.mo91530a());
        arrayList.addAll(this.f70976g.mo91830h());
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo67362d(String str) {
        C41536l.m120489i(str, "searchWord");
        return C40440x.m117135K(C34646b.m101752f(C34646b.m101750d(f70969j, new Object[0]), (Context) null, 1, (Object) null), str, true);
    }
}
