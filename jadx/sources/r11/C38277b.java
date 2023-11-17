package r11;

import ee1.C40765a;
import g11.C32041b;
import hd1.C41205b;
import he1.C41238w;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p872qv.C27866a;
import q11.C38100a;
import ue1.C43075l;

/* renamed from: r11.b */
public final class C38277b {

    /* renamed from: a */
    private final C38100a f91782a;

    /* renamed from: b */
    private final C27866a f91783b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C40765a f91784c;

    /* renamed from: d */
    private final CopyOnWriteArrayList f91785d;

    /* renamed from: r11.b$a */
    static final class C38278a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38277b f91786d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38278a(C38277b bVar) {
            super(1);
            this.f91786d = bVar;
        }

        /* renamed from: a */
        public final void mo91832a(String str) {
            C38277b bVar = this.f91786d;
            C41536l.m120488h(str, "gtStatus");
            bVar.m112536k(str, this.f91786d.m112534g());
            this.f91786d.f91784c.onNext(C41238w.f97225a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91832a((String) obj);
            return C41238w.f97225a;
        }
    }

    public C38277b(C38100a aVar, C27866a aVar2) {
        C41536l.m120489i(aVar, "getDarkModeSettingsItem");
        C41536l.m120489i(aVar2, "getGTStatus");
        this.f91782a = aVar;
        this.f91783b = aVar2;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create()");
        this.f91784c = h1;
        this.f91785d = new CopyOnWriteArrayList(C41341q.m119910m(aVar.mo91527b(), C32041b.C32042a.C32049g.f78887f, C32041b.C32042a.C32043a.f78881f, C32041b.C32042a.C32046d.f78884f, new C32041b.C32042a.C32047e(true), C32041b.C32042a.C32048f.f78886f, new C32041b.C32042a.C32044b((Color) null, 1, (DefaultConstructorMarker) null)));
    }

    /* renamed from: e */
    private final C41205b m112532e() {
        return this.f91783b.mo67399a().mo95075O().mo94981F0(new C38276a(new C38278a(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m112533f(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final C32041b.C32042a.C32047e m112534g() {
        Object obj;
        Iterator it = this.f91785d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C32041b.C32042a) obj) instanceof C32041b.C32042a.C32047e) {
                break;
            }
        }
        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.settings.data.SettingsItem.ManagementSettings.InvestmentAccount");
        return (C32041b.C32042a.C32047e) obj;
    }

    /* renamed from: j */
    private final void m112535j() {
        Object obj;
        Iterator it = this.f91785d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C32041b.C32042a) obj) instanceof C32041b.C32042a.C32045c) {
                break;
            }
        }
        C41536l.m120487g(obj, "null cannot be cast to non-null type ge.bog.mobilebank.settings.data.SettingsItem.ManagementSettings.DarkMode");
        this.f91785d.set(this.f91785d.indexOf((C32041b.C32042a.C32045c) obj), this.f91782a.mo91527b());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m112536k(String str, C32041b.C32042a.C32047e eVar) {
        int indexOf = this.f91785d.indexOf(eVar);
        if (C41536l.m120484d(str, ProductType.PRODUCT_STATUS_APPROVED)) {
            this.f91785d.set(indexOf, eVar.mo72545g(false));
            return;
        }
        this.f91785d.remove(indexOf);
    }

    /* renamed from: l */
    private final void m112537l() {
        m112532e();
    }

    /* renamed from: h */
    public final List mo91830h() {
        m112537l();
        m112535j();
        return C41358y.m120036z0(this.f91785d);
    }

    /* renamed from: i */
    public final C40765a mo91831i() {
        return this.f91784c;
    }
}
