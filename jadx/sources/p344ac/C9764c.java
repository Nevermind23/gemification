package p344ac;

import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: ac.c */
final class C9764c extends C9769h {
    C9764c(C7507a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo26218d() {
        if (mo26223c().mo21961l() >= 48) {
            StringBuilder sb = new StringBuilder();
            mo26219f(sb, 8);
            int f = mo26222b().mo26246f(48, 2);
            sb.append("(392");
            sb.append(f);
            sb.append(')');
            sb.append(mo26222b().mo26245c(50, (String) null).mo26236b());
            return sb.toString();
        }
        throw NotFoundException.m23155a();
    }
}
