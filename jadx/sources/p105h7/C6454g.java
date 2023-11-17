package p105h7;

import java.util.Arrays;

/* renamed from: h7.g */
public final class C6454g {

    /* renamed from: a */
    private final String f19737a;

    /* renamed from: b */
    private final C6450e f19738b;

    /* renamed from: c */
    private C6450e f19739c;

    /* synthetic */ C6454g(String str, C6452f fVar) {
        C6450e eVar = new C6450e((C6448d) null);
        this.f19738b = eVar;
        this.f19739c = eVar;
        str.getClass();
        this.f19737a = str;
    }

    /* renamed from: a */
    public final C6454g mo20319a(String str, int i) {
        String valueOf = String.valueOf(i);
        C6446c cVar = new C6446c((C6444b) null);
        this.f19739c.f19736c = cVar;
        this.f19739c = cVar;
        cVar.f19735b = valueOf;
        cVar.f19734a = "errorCode";
        return this;
    }

    /* renamed from: b */
    public final C6454g mo20320b(String str, Object obj) {
        C6450e eVar = new C6450e((C6448d) null);
        this.f19739c.f19736c = eVar;
        this.f19739c = eVar;
        eVar.f19735b = obj;
        eVar.f19734a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f19737a);
        sb.append('{');
        C6450e eVar = this.f19738b.f19736c;
        String str = "";
        while (eVar != null) {
            Object obj = eVar.f19735b;
            boolean z = eVar instanceof C6446c;
            sb.append(str);
            String str2 = eVar.f19734a;
            if (str2 != null) {
                sb.append(str2);
                sb.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            eVar = eVar.f19736c;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
