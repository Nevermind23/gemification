package p218q3;

import androidx.core.util.C1005e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p089g4.C6219h;
import p089g4.C6223k;
import p089g4.C6224l;
import p102h4.C6427a;
import p102h4.C6436c;
import p166m3.C7083e;

/* renamed from: q3.j */
public class C7883j {

    /* renamed from: a */
    private final C6219h f22836a = new C6219h(1000);

    /* renamed from: b */
    private final C1005e f22837b = C6427a.m25514d(10, new C7884a());

    /* renamed from: q3.j$a */
    class C7884a implements C6427a.C6431d {
        C7884a() {
        }

        /* renamed from: a */
        public C7885b create() {
            try {
                return new C7885b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: q3.j$b */
    private static final class C7885b implements C6427a.C6433f {

        /* renamed from: d */
        final MessageDigest f22839d;

        /* renamed from: e */
        private final C6436c f22840e = C6436c.m25531a();

        C7885b(MessageDigest messageDigest) {
            this.f22839d = messageDigest;
        }

        /* renamed from: c */
        public C6436c mo7881c() {
            return this.f22840e;
        }
    }

    /* renamed from: a */
    private String m29846a(C7083e eVar) {
        C7885b bVar = (C7885b) C6223k.m24730d(this.f22837b.mo3440b());
        try {
            eVar.mo7845b(bVar.f22839d);
            return C6224l.m24755x(bVar.f22839d.digest());
        } finally {
            this.f22837b.mo3439a(bVar);
        }
    }

    /* renamed from: b */
    public String mo22854b(C7083e eVar) {
        String str;
        synchronized (this.f22836a) {
            str = (String) this.f22836a.mo19816g(eVar);
        }
        if (str == null) {
            str = m29846a(eVar);
        }
        synchronized (this.f22836a) {
            this.f22836a.mo19820k(eVar, str);
        }
        return str;
    }
}
