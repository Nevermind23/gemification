package lh0;

import ed1.C40762x;
import he1.C41224m;
import he1.C41233s;
import hh0.C25022n;
import ih0.C25212e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.Client;
import p748eu.C20292b;
import p748eu.C20294d;
import p758fu.C20557a;
import ue1.C43075l;

/* renamed from: lh0.i */
public final class C26023i implements C25022n {

    /* renamed from: d */
    public static final C26024a f66096d = new C26024a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final long f66097e = TimeUnit.DAYS.toMillis(6570);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C20292b f66098a;

    /* renamed from: b */
    private final C20294d f66099b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Client f66100c;

    /* renamed from: lh0.i$a */
    public static final class C26024a {
        private C26024a() {
        }

        public /* synthetic */ C26024a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lh0.i$b */
    static final class C26025b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26025b f66101d = new C26025b();

        C26025b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: lh0.i$c */
    static final class C26026c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26023i f66102d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26026c(C26023i iVar) {
            super(1);
            this.f66102d = iVar;
        }

        /* renamed from: a */
        public final C41224m invoke(Boolean bool) {
            String str;
            C41536l.m120489i(bool, "it");
            C20557a b = this.f66102d.f66098a.mo48775b("SHOW_GAMIFICATION_ICON");
            String str2 = null;
            if (b != null) {
                str = b.mo49087d();
            } else {
                str = null;
            }
            Boolean valueOf = Boolean.valueOf(C41536l.m120484d(str, "Y"));
            C20557a b2 = this.f66102d.f66098a.mo48775b("SHOW_GAMIFICATION_OVER_HUB");
            if (b2 != null) {
                str2 = b2.mo49087d();
            }
            return C41233s.m119492a(valueOf, Boolean.valueOf(C41536l.m120484d(str2, "Y")));
        }
    }

    /* renamed from: lh0.i$d */
    static final class C26027d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26023i f66103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26027d(C26023i iVar) {
            super(1);
            this.f66103d = iVar;
        }

        /* renamed from: a */
        public final C25212e invoke(C41224m mVar) {
            boolean z;
            boolean z2;
            C41536l.m120489i(mVar, "<name for destructuring parameter 0>");
            boolean booleanValue = ((Boolean) mVar.mo95675a()).booleanValue();
            boolean booleanValue2 = ((Boolean) mVar.mo95676b()).booleanValue();
            boolean z3 = true;
            if (!booleanValue || !this.f66103d.f66100c.getUserInfo().getClient().isResident() || this.f66103d.f66100c.getUserRestrictions().contains("GAMIFICATION")) {
                z = false;
            } else {
                z = true;
            }
            if (!booleanValue2 || !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!booleanValue || (this.f66103d.f66100c.getUserInfo().getClient().birthDate.longValue() | 0) <= System.currentTimeMillis() - C26023i.f66097e) {
                z3 = false;
            }
            return new C25212e(z, z2, z3);
        }
    }

    public C26023i(C20292b bVar, C20294d dVar, Client client) {
        C41536l.m120489i(bVar, "getAppSettingByName");
        C41536l.m120489i(dVar, "settingsLoaded");
        C41536l.m120489i(client, "client");
        this.f66098a = bVar;
        this.f66099b = dVar;
        this.f66100c = client;
    }

    /* renamed from: g */
    private final C40762x m81645g() {
        C40762x A = this.f66099b.mo48777a().mo94990M(new C26021g(C26025b.f66101d)).mo94996P().mo95062A(new C26022h(new C26026c(this)));
        C41536l.m120488h(A, "private fun hasGamificat…lue == \"Y\")\n            }");
        return A;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m81646h(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final C41224m m81647i(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C41224m) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final C25212e m81648j(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25212e) lVar.invoke(obj);
    }

    public C40762x invoke() {
        C40762x A = m81645g().mo95062A(new C26020f(new C26027d(this)));
        C41536l.m120488h(A, "override fun invoke(): S…8\n            )\n        }");
        return A;
    }
}
