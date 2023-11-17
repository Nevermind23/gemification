package p344ac;

import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: ac.d */
final class C9765d extends C9769h {
    C9765d(C7507a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo26218d() {
        if (mo26223c().mo21961l() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo26219f(sb, 8);
            int f = mo26222b().mo26246f(48, 2);
            sb.append("(393");
            sb.append(f);
            sb.append(')');
            int f2 = mo26222b().mo26246f(50, 10);
            if (f2 / 100 == 0) {
                sb.append('0');
            }
            if (f2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f2);
            sb.append(mo26222b().mo26245c(60, (String) null).mo26236b());
            return sb.toString();
        }
        throw NotFoundException.m23155a();
    }
}
