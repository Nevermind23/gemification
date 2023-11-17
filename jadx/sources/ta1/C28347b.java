package ta1;

import android.database.Cursor;
import android.os.CancellationSignal;
import ed1.C40762x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import p267u0.C8438a0;
import p267u0.C8441b0;
import p267u0.C8463e0;
import p267u0.C8478k;
import p267u0.C8503w;
import p293w0.C8721a;
import p293w0.C8722b;
import p318y0.C9008m;

/* renamed from: ta1.b */
public final class C28347b extends C28346a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8503w f71857a;

    /* renamed from: b */
    private final C8478k f71858b;

    /* renamed from: c */
    private final C8463e0 f71859c;

    /* renamed from: ta1.b$a */
    class C28348a extends C8478k {
        C28348a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR REPLACE INTO `app_settings` (`property_key`,`property_value`) VALUES (?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C28351c cVar) {
            if (cVar.mo67987a() == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, cVar.mo67987a());
            }
            if (cVar.mo67988b() == null) {
                mVar.mo23624j1(2);
            } else {
                mVar.mo23623j(2, cVar.mo67988b());
            }
        }
    }

    /* renamed from: ta1.b$b */
    class C28349b extends C8463e0 {
        C28349b(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM app_settings";
        }
    }

    /* renamed from: ta1.b$c */
    class C28350c implements Callable {

        /* renamed from: d */
        final /* synthetic */ C8438a0 f71862d;

        C28350c(C8438a0 a0Var) {
            this.f71862d = a0Var;
        }

        /* renamed from: a */
        public List call() {
            String str;
            String str2;
            Cursor c = C8722b.m32486c(C28347b.this.f71857a, this.f71862d, false, (CancellationSignal) null);
            try {
                int e = C8721a.m32483e(c, "property_key");
                int e2 = C8721a.m32483e(c, "property_value");
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    if (c.isNull(e2)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e2);
                    }
                    arrayList.add(new C28351c(str, str2));
                }
                return arrayList;
            } finally {
                c.close();
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            this.f71862d.mo23627n();
        }
    }

    public C28347b(C8503w wVar) {
        this.f71857a = wVar;
        this.f71858b = new C28348a(wVar);
        this.f71859c = new C28349b(wVar);
    }

    /* renamed from: g */
    public static List m86986g() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo67979a() {
        this.f71857a.mo23806d();
        C9008m b = this.f71859c.mo23725b();
        this.f71857a.mo23807e();
        try {
            b.mo23676O();
            this.f71857a.mo23804F();
        } finally {
            this.f71857a.mo23809i();
            this.f71859c.mo23727h(b);
        }
    }

    /* renamed from: b */
    public C40762x mo67980b() {
        return C8441b0.m31664a(new C28350c(C8438a0.m31651d("SELECT * FROM app_settings", 0)));
    }

    /* renamed from: c */
    public void mo67981c(List list) {
        this.f71857a.mo23806d();
        this.f71857a.mo23807e();
        try {
            this.f71858b.mo23747j(list);
            this.f71857a.mo23804F();
        } finally {
            this.f71857a.mo23809i();
        }
    }

    /* renamed from: d */
    public void mo67982d(List list) {
        this.f71857a.mo23807e();
        try {
            super.mo67982d(list);
            this.f71857a.mo23804F();
        } finally {
            this.f71857a.mo23809i();
        }
    }
}
