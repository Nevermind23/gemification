package p190o1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.Collections;
import java.util.List;
import p267u0.C8438a0;
import p267u0.C8478k;
import p267u0.C8503w;
import p293w0.C8722b;
import p318y0.C9008m;

/* renamed from: o1.f */
public final class C7374f implements C7373e {

    /* renamed from: a */
    private final C8503w f21598a;

    /* renamed from: b */
    private final C8478k f21599b;

    /* renamed from: o1.f$a */
    class C7375a extends C8478k {
        C7375a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7372d dVar) {
            if (dVar.mo21749a() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, dVar.mo21749a());
            }
            if (dVar.mo21750b() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23628r(2, dVar.mo21750b().longValue());
            }
        }
    }

    public C7374f(C8503w wVar) {
        this.f21598a = wVar;
        this.f21599b = new C7375a(wVar);
    }

    /* renamed from: c */
    public static List m28091c() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo21754a(C7372d dVar) {
        this.f21598a.mo23806d();
        this.f21598a.mo23807e();
        try {
            this.f21599b.mo23748k(dVar);
            this.f21598a.mo23804F();
        } finally {
            this.f21598a.mo23809i();
        }
    }

    /* renamed from: b */
    public Long mo21755b(String str) {
        C8438a0 d = C8438a0.m31651d("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21598a.mo23806d();
        Long l = null;
        Cursor c = C8722b.m32486c(this.f21598a, d, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (!c.isNull(0)) {
                    l = Long.valueOf(c.getLong(0));
                }
            }
            return l;
        } finally {
            c.close();
            d.mo23627n();
        }
    }
}
