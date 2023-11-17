package zn0;

import bo0.C10344a;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: zn0.o */
public final class C19103o {

    /* renamed from: a */
    private final C10344a f53276a;

    /* renamed from: b */
    private final C20292b f53277b;

    public C19103o(C10344a aVar, C20292b bVar) {
        C41536l.m120489i(aVar, "repository");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f53276a = aVar;
        this.f53277b = bVar;
    }

    /* renamed from: a */
    public final C40762x mo47304a(boolean z) {
        boolean z2;
        Boolean a;
        C20557a b = this.f53277b.mo48775b("BNPL_FEATURES_ENABLE");
        if (b == null || (a = b.mo49084a()) == null) {
            z2 = false;
        } else {
            z2 = a.booleanValue();
        }
        return this.f53276a.mo26970W3(z, z2);
    }
}
