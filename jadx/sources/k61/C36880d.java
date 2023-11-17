package k61;

import e61.C31681k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: k61.d */
public final class C36880d implements C31681k {

    /* renamed from: b */
    public static final C36881a f88984b = new C36881a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20292b f88985a;

    /* renamed from: k61.d$a */
    public static final class C36881a {
        private C36881a() {
        }

        public /* synthetic */ C36881a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C36880d(C20292b bVar) {
        C41536l.m120489i(bVar, "getAppSettingByName");
        this.f88985a = bVar;
    }

    public boolean invoke() {
        C20557a b = this.f88985a.mo48775b("SHOW_HOMEPAGE_BANNERS");
        return C41536l.m120484d(b != null ? b.mo49087d() : null, "Y");
    }
}
