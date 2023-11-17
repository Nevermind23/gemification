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

/* renamed from: o1.p */
public final class C7389p implements C7388o {

    /* renamed from: a */
    private final C8503w f21615a;

    /* renamed from: b */
    private final C8478k f21616b;

    /* renamed from: o1.p$a */
    class C7390a extends C8478k {
        C7390a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7387n nVar) {
            if (nVar.mo21774a() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, nVar.mo21774a());
            }
            if (nVar.mo21775b() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23623j(2, nVar.mo21775b());
            }
        }
    }

    public C7389p(C8503w wVar) {
        this.f21615a = wVar;
        this.f21616b = new C7390a(wVar);
    }

    /* renamed from: c */
    public static List m28128c() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo21776a(C7387n nVar) {
        this.f21615a.mo23806d();
        this.f21615a.mo23807e();
        try {
            this.f21616b.mo23748k(nVar);
            this.f21615a.mo23804F();
        } finally {
            this.f21615a.mo23809i();
        }
    }

    /* renamed from: b */
    public List mo21777b(String str) {
        String str2;
        C8438a0 d = C8438a0.m31651d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21615a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21615a, d, false, (CancellationSignal) null);
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
}
