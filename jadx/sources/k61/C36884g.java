package k61;

import e61.C31682l;
import ed1.C40749p;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20292b;
import p748eu.C20294d;
import p758fu.C20557a;
import ue1.C43075l;

/* renamed from: k61.g */
public final class C36884g implements C31682l {

    /* renamed from: c */
    public static final C36885a f88988c = new C36885a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C20292b f88989a;

    /* renamed from: b */
    private final C20294d f88990b;

    /* renamed from: k61.g$a */
    public static final class C36885a {
        private C36885a() {
        }

        public /* synthetic */ C36885a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k61.g$b */
    static final class C36886b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C36886b f88991d = new C36886b();

        C36886b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: k61.g$c */
    static final class C36887c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36884g f88992d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36887c(C36884g gVar) {
            super(1);
            this.f88992d = gVar;
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            C20557a b = this.f88992d.f88989a.mo48775b("SHOW_HOMEPAGE_STORIES");
            return Boolean.valueOf(C41536l.m120484d(b != null ? b.mo49087d() : null, "Y"));
        }
    }

    public C36884g(C20292b bVar, C20294d dVar) {
        C41536l.m120489i(bVar, "getAppSettingByName");
        C41536l.m120489i(dVar, "settingsLoaded");
        this.f88989a = bVar;
        this.f88990b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m109252d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Boolean m109253e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    public C40749p invoke() {
        C40749p k0 = this.f88990b.mo48777a().mo94990M(new C36882e(C36886b.f88991d)).mo95026k0(new C36883f(new C36887c(this)));
        C41536l.m120488h(k0, "override fun invoke(): O…= \"Y\"\n            }\n    }");
        return k0;
    }
}
