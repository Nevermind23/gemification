package k61;

import e61.C31680j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: k61.c */
public final class C36878c implements C31680j {

    /* renamed from: b */
    public static final C36879a f88982b = new C36879a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C20292b f88983a;

    /* renamed from: k61.c$a */
    public static final class C36879a {
        private C36879a() {
        }

        public /* synthetic */ C36879a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C36878c(C20292b bVar) {
        C41536l.m120489i(bVar, "getAppSettingByName");
        this.f88983a = bVar;
    }

    public boolean invoke() {
        C20557a b = this.f88983a.mo48775b("HIDE_NBO_OFFERS");
        return C41536l.m120484d(b != null ? b.mo49087d() : null, "Y");
    }
}
