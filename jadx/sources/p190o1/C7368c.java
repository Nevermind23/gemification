package p190o1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p267u0.C8438a0;
import p267u0.C8478k;
import p267u0.C8503w;
import p293w0.C8722b;
import p318y0.C9008m;

/* renamed from: o1.c */
public final class C7368c implements C7364b {

    /* renamed from: a */
    private final C8503w f21588a;

    /* renamed from: b */
    private final C8478k f21589b;

    /* renamed from: o1.c$a */
    class C7369a extends C8478k {
        C7369a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7361a aVar) {
            if (aVar.mo21736b() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, aVar.mo21736b());
            }
            if (aVar.mo21735a() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23623j(2, aVar.mo21735a());
            }
        }
    }

    public C7368c(C8503w wVar) {
        this.f21588a = wVar;
        this.f21589b = new C7369a(wVar);
    }

    /* renamed from: e */
    public static List m28069e() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public List mo21741a(String str) {
        String str2;
        C8438a0 d = C8438a0.m31651d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21588a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21588a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                if (c.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = c.getString(0);
                }
                arrayList.add(str2);
            }
            return arrayList;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: b */
    public boolean mo21742b(String str) {
        boolean z = true;
        C8438a0 d = C8438a0.m31651d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21588a.mo23806d();
        boolean z2 = false;
        Cursor c = C8722b.m32486c(this.f21588a, d, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: c */
    public void mo21743c(C7361a aVar) {
        this.f21588a.mo23806d();
        this.f21588a.mo23807e();
        try {
            this.f21589b.mo23748k(aVar);
            this.f21588a.mo23804F();
        } finally {
            this.f21588a.mo23809i();
        }
    }

    /* renamed from: d */
    public boolean mo21744d(String str) {
        boolean z = true;
        C8438a0 d = C8438a0.m31651d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21588a.mo23806d();
        boolean z2 = false;
        Cursor c = C8722b.m32486c(this.f21588a, d, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            c.close();
            d.mo23627n();
        }
    }
}
