package p190o1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p190o1.C7362a0;
import p267u0.C8438a0;
import p267u0.C8463e0;
import p267u0.C8478k;
import p267u0.C8503w;
import p293w0.C8722b;
import p318y0.C9008m;

/* renamed from: o1.b0 */
public final class C7365b0 implements C7362a0 {

    /* renamed from: a */
    private final C8503w f21583a;

    /* renamed from: b */
    private final C8478k f21584b;

    /* renamed from: c */
    private final C8463e0 f21585c;

    /* renamed from: o1.b0$a */
    class C7366a extends C8478k {
        C7366a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7418z zVar) {
            if (zVar.mo21826a() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, zVar.mo21826a());
            }
            if (zVar.mo21827b() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23623j(2, zVar.mo21827b());
            }
        }
    }

    /* renamed from: o1.b0$b */
    class C7367b extends C8463e0 {
        C7367b(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C7365b0(C8503w wVar) {
        this.f21583a = wVar;
        this.f21584b = new C7366a(wVar);
        this.f21585c = new C7367b(wVar);
    }

    /* renamed from: e */
    public static List m28060e() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo21737a(C7418z zVar) {
        this.f21583a.mo23806d();
        this.f21583a.mo23807e();
        try {
            this.f21584b.mo23748k(zVar);
            this.f21583a.mo23804F();
        } finally {
            this.f21583a.mo23809i();
        }
    }

    /* renamed from: b */
    public List mo21738b(String str) {
        String str2;
        C8438a0 d = C8438a0.m31651d("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21583a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21583a, d, false, (CancellationSignal) null);
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

    /* renamed from: c */
    public void mo21739c(String str) {
        this.f21583a.mo23806d();
        C9008m b = this.f21585c.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21583a.mo23807e();
        try {
            b.mo23676O();
            this.f21583a.mo23804F();
        } finally {
            this.f21583a.mo23809i();
            this.f21585c.mo23727h(b);
        }
    }

    /* renamed from: d */
    public void mo21740d(String str, Set set) {
        C7362a0.C7363a.m28055a(this, str, set);
    }
}
