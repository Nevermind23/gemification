package lh0;

import ed1.C40762x;
import hh0.C25017j;
import ih0.C25211d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20291a;
import p748eu.C20292b;
import p758fu.C20557a;
import ue1.C43075l;

/* renamed from: lh0.e */
public final class C26016e implements C25017j {

    /* renamed from: c */
    public static final C26017a f66088c = new C26017a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C20292b f66089a;

    /* renamed from: b */
    private final C20291a f66090b;

    /* renamed from: lh0.e$a */
    public static final class C26017a {
        private C26017a() {
        }

        public /* synthetic */ C26017a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: lh0.e$b */
    static final class C26018b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C26018b f66091d = new C26018b();

        C26018b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: lh0.e$c */
    static final class C26019c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26016e f66092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26019c(C26016e eVar) {
            super(1);
            this.f66092d = eVar;
        }

        /* renamed from: a */
        public final C25211d invoke(Boolean bool) {
            String str;
            C41536l.m120489i(bool, "it");
            C20557a a = this.f66092d.f66089a.mo48774a("SHOW_GAMIFICATION_PRELOGIN");
            String str2 = null;
            if (a != null) {
                str = a.mo49087d();
            } else {
                str = null;
            }
            if (C41536l.m120484d(str, "Y")) {
                return C25211d.PRE_LOGIN_NORMAL;
            }
            C20557a a2 = this.f66092d.f66089a.mo48774a("SHOW_GAMIFICATION_PRELOGIN_FINAL");
            if (a2 != null) {
                str2 = a2.mo49087d();
            }
            if (C41536l.m120484d(str2, "Y")) {
                return C25211d.PRE_LOGIN_FINAL;
            }
            return C25211d.NONE;
        }
    }

    public C26016e(C20292b bVar, C20291a aVar) {
        C41536l.m120489i(bVar, "getAppSettingByName");
        C41536l.m120489i(aVar, "settingsLoaded");
        this.f66089a = bVar;
        this.f66090b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m81636d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C25211d m81637e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C25211d) lVar.invoke(obj);
    }

    public C40762x invoke() {
        C40762x A = this.f66090b.mo48773a().mo94990M(new C26014c(C26018b.f66091d)).mo94996P().mo95062A(new C26015d(new C26019c(this)));
        C41536l.m120488h(A, "override fun invoke(): S…          }\n            }");
        return A;
    }
}
