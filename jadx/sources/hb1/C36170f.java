package hb1;

import ba1.C10140b;
import ba1.C10146d0;
import ba1.C10199i;
import gb1.C32393w;
import kotlin.jvm.internal.C41536l;
import of1.C41869b0;
import of1.C41880d0;
import of1.C41935w;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import qa1.C27700a1;

/* renamed from: hb1.f */
public final class C36170f implements C41935w {

    /* renamed from: a */
    private final C27700a1 f87357a;

    /* renamed from: b */
    private final C10199i f87358b;

    /* renamed from: c */
    private final C10140b f87359c;

    public C36170f(C27700a1 a1Var, C10199i iVar, C10140b bVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(iVar, "localeManager");
        C41536l.m120489i(bVar, "deviceInfo");
        this.f87357a = a1Var;
        this.f87358b = iVar;
        this.f87359c = bVar;
    }

    /* renamed from: b */
    private final String m107576b(String str, String str2) {
        if (C40439w.m117109H(str2, str, false, 2, (Object) null)) {
            return C32393w.m95661b(str2);
        }
        return C32393w.m95661b(str) + ' ' + str2;
    }

    /* renamed from: a */
    public C41880d0 mo21294a(C41935w.C41936a aVar) {
        String str;
        Long l;
        C41536l.m120489i(aVar, "chain");
        C41869b0 w = aVar.mo97011w();
        String d = w.mo96675d("Accept-Language");
        if (d == null) {
            d = this.f87358b.mo26767a().mo88523b();
        }
        C41869b0.C41870a i = w.mo96679h().mo96691i("Accept-Language", d);
        C41869b0.C41870a i2 = i.mo96691i("Authorization", "Bearer " + C10146d0.C10159c.m37143b().getSsoToken$sso_client_release());
        DeviceIdentifier c = this.f87357a.mo67242c();
        String str2 = "";
        if (c == null || (str = c.getExtCustomerId()) == null) {
            str = str2;
        }
        C41869b0.C41870a i3 = i2.mo96691i("extCustomerId", str);
        DeviceIdentifier c2 = this.f87357a.mo67242c();
        if (c2 != null) {
            l = c2.getDeviceId();
        } else {
            l = null;
        }
        C41869b0.C41870a i4 = i3.mo96691i("ExtDeviceId", String.valueOf(l));
        C41869b0.C41870a i5 = i4.mo96691i("X-User-Agent", "SSOLib(" + this.f87359c.mo26661a() + " - " + this.f87359c.mo26662b() + ")|ANDROID(" + this.f87359c.mo26666f() + ")|" + m107576b(this.f87359c.mo26664d(), this.f87359c.mo26665e()));
        String token = C10146d0.C10159c.m37143b().getToken();
        if (token != null) {
            str2 = token;
        }
        return aVar.mo97008a(i5.mo96691i("X_Auth_Token", str2).mo96684b());
    }
}
