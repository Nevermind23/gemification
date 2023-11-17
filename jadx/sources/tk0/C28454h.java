package tk0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.model.Client;
import pk0.C27587c;

/* renamed from: tk0.h */
public final class C28454h {

    /* renamed from: a */
    private final Client f72256a;

    public C28454h(Client client) {
        C41536l.m120489i(client, "client");
        this.f72256a = client;
    }

    /* renamed from: a */
    public final C27587c mo68081a() {
        return new C27587c(PackageType.Companion.getPackageTypeByBadge(this.f72256a.getUserInfo().getPackageBadge()), this.f72256a.getUserInfo().getActivePackageName());
    }
}
