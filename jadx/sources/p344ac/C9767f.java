package p344ac;

import com.google.zxing.NotFoundException;
import p200ob.C7507a;

/* renamed from: ac.f */
abstract class C9767f extends C9770i {
    C9767f(C7507a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public String mo26218d() {
        if (mo26223c().mo21961l() == 60) {
            StringBuilder sb = new StringBuilder();
            mo26219f(sb, 5);
            mo26221j(sb, 45, 15);
            return sb.toString();
        }
        throw NotFoundException.m23155a();
    }
}
