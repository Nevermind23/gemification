package p801ju;

import kotlin.jvm.internal.C41536l;
import p405eg.C12445d;
import p748eu.C20292b;
import p758fu.C20557a;

/* renamed from: ju.c */
public final class C25487c implements C12445d {

    /* renamed from: a */
    private final C20292b f65151a;

    public C25487c(C20292b bVar) {
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f65151a = bVar;
    }

    public long getMaxSize() {
        Double c;
        C20557a b = this.f65151a.mo48775b("CHAT_MAX_FILE_SIZE");
        if (b == null || (c = b.mo49086c()) == null) {
            return 0;
        }
        return (long) c.doubleValue();
    }
}
