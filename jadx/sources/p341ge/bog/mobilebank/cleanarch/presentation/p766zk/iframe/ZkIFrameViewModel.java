package p341ge.bog.mobilebank.cleanarch.presentation.p766zk.iframe;

import hd1.C41204a;
import he1.C41224m;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.model.Client;
import p748eu.C20292b;
import p758fu.C20557a;
import p794ix.C25265a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.zk.iframe.ZkIFrameViewModel */
public final class ZkIFrameViewModel extends C21481a {

    /* renamed from: d */
    private final C20292b f59488d;

    /* renamed from: e */
    private final Client f59489e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZkIFrameViewModel(C20292b bVar, Client client) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        C41536l.m120489i(client, "client");
        this.f59488d = bVar;
        this.f59489e = client;
    }

    /* renamed from: dw */
    public final Map mo55491dw() {
        String str;
        String d;
        C20557a b = this.f59488d.mo48775b("UMTS_ZK_IFRAME_HEADER_FIRSTNAME");
        String str2 = "";
        if (b == null || (str = b.mo49087d()) == null) {
            str = str2;
        }
        C20557a b2 = this.f59488d.mo48775b("UMTS_ZK_IFRAME_HEADER_LASTNAME");
        if (!(b2 == null || (d = b2.mo49087d()) == null)) {
            str2 = d;
        }
        return C41344r0.m119931m(new C41224m(str, this.f59489e.getUserInfo().getClient().firstNameInt), new C41224m(str2, this.f59489e.getUserInfo().getClient().lastNameInt));
    }

    /* renamed from: ew */
    public final String mo55492ew(C25265a aVar) {
        C41536l.m120489i(aVar, "card");
        String str = aVar.mo63857f() + "&cp=" + aVar.mo63851a();
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: fw */
    public final C41224m mo55493fw() {
        int i;
        int i2;
        Double c;
        Double c2;
        C20557a b = this.f59488d.mo48775b("UMTS_ZK_IFRAME_DISPLAY_RESOLUTION_MIN_WIDTH");
        if (b == null || (c2 = b.mo49086c()) == null) {
            i = 420;
        } else {
            i = (int) c2.doubleValue();
        }
        Integer valueOf = Integer.valueOf(i);
        C20557a b2 = this.f59488d.mo48775b("UMTS_ZK_IFRAME_DISPLAY_RESOLUTION_MAX_WIDTH");
        if (b2 == null || (c = b2.mo49086c()) == null) {
            i2 = 550;
        } else {
            i2 = (int) c.doubleValue();
        }
        return new C41224m(valueOf, Integer.valueOf(i2));
    }
}
