package com.threatmetrix.TrustDefender;

import com.salesforce.marketingcloud.C11398b;
import com.threatmetrix.TrustDefender.C11935m1;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.ArrayList;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.x0 */
public class C12008x0 extends C11935m1 {

    /* renamed from: g */
    public String f35358g;

    /* renamed from: h */
    public String f35359h;

    public C12008x0(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_EMULATOR;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        ArrayList arrayList = new ArrayList(2);
        String i = mo32098i();
        if (i != null) {
            arrayList.add("cpu_abi:" + i);
        }
        String x = C11996u0.m44036s().mo32090x();
        if (x != null && mo32099j(x)) {
            arrayList.add("arch:" + x);
        }
        if (!(t1Var.mo32051a() == null || t1Var.mo32060j() == null || t1Var.mo32060j().f35046z.isEmpty())) {
            arrayList.addAll(C11914j.m43660K(t1Var.mo32051a(), t1Var.mo32060j().f35046z));
        }
        if (!arrayList.isEmpty()) {
            this.f35358g = String.valueOf(arrayList.size());
            this.f35359h = C11921k0.m43743z(arrayList, ";", true);
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.EM_PATH_COUNT.mo45142a(), this.f35358g);
            map.put(C17590g.EM_PATH_STR.mo45142a(), C11921k0.m43716A(this.f35359h, C11398b.f33141t));
        }
    }

    /* renamed from: i */
    public String mo32098i() {
        String[] strArr;
        String str = C11969r1.C11983n.f35239o;
        if (mo32099j(str)) {
            return str;
        }
        String str2 = C11969r1.C11983n.f35240p;
        if (mo32099j(str2)) {
            return str2;
        }
        if (!(C11969r1.C11983n.C11984a.f35247c < C11969r1.C11983n.C11985b.f35262n || (strArr = C11969r1.C11983n.f35241q) == null || strArr.length == 0)) {
            for (String str3 : strArr) {
                if (mo32099j(str3)) {
                    return str3;
                }
            }
        }
        return null;
    }

    /* renamed from: j */
    public boolean mo32099j(String str) {
        return "x86_64".equals(str) || "x86".equals(str) || "i386".equals(str);
    }
}
