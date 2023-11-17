package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.h0 */
public class C11909h0 extends C11935m1 {

    /* renamed from: g */
    private C11965r f34838g;

    public C11909h0(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_NETWORK;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f34838g = C11914j.m43684k(t1Var.mo32051a());
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null && this.f34838g != null) {
            String str = "";
            map.put(C17590g.NETWORK_INFO_BSSID.mo45142a(), this.f34838g.mo32031i() == null ? str : this.f34838g.mo32031i());
            map.put(C17590g.NETWORK_INFO_SSID_HASH.mo45142a(), this.f34838g.mo32035n() == null ? str : C11921k0.m43723f(this.f34838g.mo32035n().getBytes()));
            map.put(C17590g.NETWORK_INFO_SSID.mo45142a(), this.f34838g.mo32035n() == null ? str : this.f34838g.mo32035n());
            map.put(C17590g.NETWORK_INFO_RSSI.mo45142a(), this.f34838g.mo32034l() == null ? str : this.f34838g.mo32034l());
            map.put(C17590g.NETWORK_INFO_TYPE.mo45142a(), this.f34838g.mo32028f() == null ? str : this.f34838g.mo32028f());
            map.put(C17590g.NETWORK_INFO_IPV4.mo45142a(), this.f34838g.mo32024a() == null ? str : this.f34838g.mo32024a());
            map.put(C17590g.NETWORK_INFO_IPV6.mo45142a(), this.f34838g.mo32037p() == null ? str : this.f34838g.mo32037p());
            map.put(C17590g.NETWORK_INFO_MAC.mo45142a(), this.f34838g.mo32030h() == null ? str : this.f34838g.mo32030h());
            map.put(C17590g.NETWORK_INFO_WFS.mo45142a(), this.f34838g.mo32027e() == null ? str : this.f34838g.mo32027e());
            String a = C17590g.NETWORK_INFO_VPN.mo45142a();
            if (this.f34838g.mo32032j() != null) {
                str = this.f34838g.mo32032j();
            }
            map.put(a, str);
        }
    }
}
