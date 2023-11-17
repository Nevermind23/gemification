package p190o1;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.C1949a;
import androidx.work.C1954c;
import androidx.work.C1959e;
import androidx.work.C2075n;
import androidx.work.C2085q;
import androidx.work.C2093w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p190o1.C7399v;
import p267u0.C8438a0;
import p267u0.C8463e0;
import p267u0.C8477j;
import p267u0.C8478k;
import p267u0.C8503w;
import p293w0.C8721a;
import p293w0.C8722b;
import p318y0.C9008m;

/* renamed from: o1.x */
public final class C7403x implements C7402w {

    /* renamed from: a */
    private final C8503w f21652a;

    /* renamed from: b */
    private final C8478k f21653b;

    /* renamed from: c */
    private final C8477j f21654c;

    /* renamed from: d */
    private final C8463e0 f21655d;

    /* renamed from: e */
    private final C8463e0 f21656e;

    /* renamed from: f */
    private final C8463e0 f21657f;

    /* renamed from: g */
    private final C8463e0 f21658g;

    /* renamed from: h */
    private final C8463e0 f21659h;

    /* renamed from: i */
    private final C8463e0 f21660i;

    /* renamed from: j */
    private final C8463e0 f21661j;

    /* renamed from: k */
    private final C8463e0 f21662k;

    /* renamed from: l */
    private final C8463e0 f21663l;

    /* renamed from: m */
    private final C8463e0 f21664m;

    /* renamed from: n */
    private final C8463e0 f21665n;

    /* renamed from: o1.x$a */
    class C7404a extends C8463e0 {
        C7404a(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: o1.x$b */
    class C7405b extends C8463e0 {
        C7405b(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: o1.x$c */
    class C7406c extends C8463e0 {
        C7406c(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* renamed from: o1.x$d */
    class C7407d extends C8463e0 {
        C7407d(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* renamed from: o1.x$e */
    class C7408e extends C8478k {
        C7408e(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* renamed from: l */
        public void mo21746i(C9008m mVar, C7399v vVar) {
            String str = vVar.f21630a;
            if (str == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, str);
            }
            C7370c0 c0Var = C7370c0.f21591a;
            mVar.mo23628r(2, (long) C7370c0.m28086j(vVar.f21631b));
            String str2 = vVar.f21632c;
            if (str2 == null) {
                mVar.mo23624j1(3);
            } else {
                mVar.mo23623j(3, str2);
            }
            String str3 = vVar.f21633d;
            if (str3 == null) {
                mVar.mo23624j1(4);
            } else {
                mVar.mo23623j(4, str3);
            }
            byte[] l = C1959e.m7701l(vVar.f21634e);
            if (l == null) {
                mVar.mo23624j1(5);
            } else {
                mVar.mo23618X0(5, l);
            }
            byte[] l2 = C1959e.m7701l(vVar.f21635f);
            if (l2 == null) {
                mVar.mo23624j1(6);
            } else {
                mVar.mo23618X0(6, l2);
            }
            mVar.mo23628r(7, vVar.f21636g);
            mVar.mo23628r(8, vVar.f21637h);
            mVar.mo23628r(9, vVar.f21638i);
            mVar.mo23628r(10, (long) vVar.f21640k);
            mVar.mo23628r(11, (long) C7370c0.m28077a(vVar.f21641l));
            mVar.mo23628r(12, vVar.f21642m);
            mVar.mo23628r(13, vVar.f21643n);
            mVar.mo23628r(14, vVar.f21644o);
            mVar.mo23628r(15, vVar.f21645p);
            mVar.mo23628r(16, vVar.f21646q ? 1 : 0);
            mVar.mo23628r(17, (long) C7370c0.m28084h(vVar.f21647r));
            mVar.mo23628r(18, (long) vVar.mo21789g());
            mVar.mo23628r(19, (long) vVar.mo21788f());
            C1954c cVar = vVar.f21639j;
            if (cVar != null) {
                mVar.mo23628r(20, (long) C7370c0.m28083g(cVar.mo6712d()));
                mVar.mo23628r(21, cVar.mo6716g() ? 1 : 0);
                mVar.mo23628r(22, cVar.mo6717h() ? 1 : 0);
                mVar.mo23628r(23, cVar.mo6715f() ? 1 : 0);
                mVar.mo23628r(24, cVar.mo6719i() ? 1 : 0);
                mVar.mo23628r(25, cVar.mo6710b());
                mVar.mo23628r(26, cVar.mo6709a());
                byte[] i = C7370c0.m28085i(cVar.mo6711c());
                if (i == null) {
                    mVar.mo23624j1(27);
                } else {
                    mVar.mo23618X0(27, i);
                }
            } else {
                mVar.mo23624j1(20);
                mVar.mo23624j1(21);
                mVar.mo23624j1(22);
                mVar.mo23624j1(23);
                mVar.mo23624j1(24);
                mVar.mo23624j1(25);
                mVar.mo23624j1(26);
                mVar.mo23624j1(27);
            }
        }
    }

    /* renamed from: o1.x$f */
    class C7409f extends C8477j {
        C7409f(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        /* renamed from: k */
        public void mo21824i(C9008m mVar, C7399v vVar) {
            String str = vVar.f21630a;
            if (str == null) {
                mVar.mo23624j1(1);
            } else {
                mVar.mo23623j(1, str);
            }
            C7370c0 c0Var = C7370c0.f21591a;
            mVar.mo23628r(2, (long) C7370c0.m28086j(vVar.f21631b));
            String str2 = vVar.f21632c;
            if (str2 == null) {
                mVar.mo23624j1(3);
            } else {
                mVar.mo23623j(3, str2);
            }
            String str3 = vVar.f21633d;
            if (str3 == null) {
                mVar.mo23624j1(4);
            } else {
                mVar.mo23623j(4, str3);
            }
            byte[] l = C1959e.m7701l(vVar.f21634e);
            if (l == null) {
                mVar.mo23624j1(5);
            } else {
                mVar.mo23618X0(5, l);
            }
            byte[] l2 = C1959e.m7701l(vVar.f21635f);
            if (l2 == null) {
                mVar.mo23624j1(6);
            } else {
                mVar.mo23618X0(6, l2);
            }
            mVar.mo23628r(7, vVar.f21636g);
            mVar.mo23628r(8, vVar.f21637h);
            mVar.mo23628r(9, vVar.f21638i);
            mVar.mo23628r(10, (long) vVar.f21640k);
            mVar.mo23628r(11, (long) C7370c0.m28077a(vVar.f21641l));
            mVar.mo23628r(12, vVar.f21642m);
            mVar.mo23628r(13, vVar.f21643n);
            mVar.mo23628r(14, vVar.f21644o);
            mVar.mo23628r(15, vVar.f21645p);
            mVar.mo23628r(16, vVar.f21646q ? 1 : 0);
            mVar.mo23628r(17, (long) C7370c0.m28084h(vVar.f21647r));
            mVar.mo23628r(18, (long) vVar.mo21789g());
            mVar.mo23628r(19, (long) vVar.mo21788f());
            C1954c cVar = vVar.f21639j;
            if (cVar != null) {
                mVar.mo23628r(20, (long) C7370c0.m28083g(cVar.mo6712d()));
                mVar.mo23628r(21, cVar.mo6716g() ? 1 : 0);
                mVar.mo23628r(22, cVar.mo6717h() ? 1 : 0);
                mVar.mo23628r(23, cVar.mo6715f() ? 1 : 0);
                mVar.mo23628r(24, cVar.mo6719i() ? 1 : 0);
                mVar.mo23628r(25, cVar.mo6710b());
                mVar.mo23628r(26, cVar.mo6709a());
                byte[] i = C7370c0.m28085i(cVar.mo6711c());
                if (i == null) {
                    mVar.mo23624j1(27);
                } else {
                    mVar.mo23618X0(27, i);
                }
            } else {
                mVar.mo23624j1(20);
                mVar.mo23624j1(21);
                mVar.mo23624j1(22);
                mVar.mo23624j1(23);
                mVar.mo23624j1(24);
                mVar.mo23624j1(25);
                mVar.mo23624j1(26);
                mVar.mo23624j1(27);
            }
            String str4 = vVar.f21630a;
            if (str4 == null) {
                mVar.mo23624j1(28);
            } else {
                mVar.mo23623j(28, str4);
            }
        }
    }

    /* renamed from: o1.x$g */
    class C7410g extends C8463e0 {
        C7410g(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: o1.x$h */
    class C7411h extends C8463e0 {
        C7411h(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* renamed from: o1.x$i */
    class C7412i extends C8463e0 {
        C7412i(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* renamed from: o1.x$j */
    class C7413j extends C8463e0 {
        C7413j(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: o1.x$k */
    class C7414k extends C8463e0 {
        C7414k(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* renamed from: o1.x$l */
    class C7415l extends C8463e0 {
        C7415l(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: o1.x$m */
    class C7416m extends C8463e0 {
        C7416m(C8503w wVar) {
            super(wVar);
        }

        /* renamed from: e */
        public String mo21745e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public C7403x(C8503w wVar) {
        this.f21652a = wVar;
        this.f21653b = new C7408e(wVar);
        this.f21654c = new C7409f(wVar);
        this.f21655d = new C7410g(wVar);
        this.f21656e = new C7411h(wVar);
        this.f21657f = new C7412i(wVar);
        this.f21658g = new C7413j(wVar);
        this.f21659h = new C7414k(wVar);
        this.f21660i = new C7415l(wVar);
        this.f21661j = new C7416m(wVar);
        this.f21662k = new C7404a(wVar);
        this.f21663l = new C7405b(wVar);
        this.f21664m = new C7406c(wVar);
        this.f21665n = new C7407d(wVar);
    }

    /* renamed from: x */
    public static List m28184x() {
        return Collections.emptyList();
    }

    /* renamed from: a */
    public void mo21800a(String str) {
        this.f21652a.mo23806d();
        C9008m b = this.f21655d.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21652a.mo23807e();
        try {
            b.mo23676O();
            this.f21652a.mo23804F();
        } finally {
            this.f21652a.mo23809i();
            this.f21655d.mo23727h(b);
        }
    }

    /* renamed from: b */
    public void mo21801b(String str) {
        this.f21652a.mo23806d();
        C9008m b = this.f21657f.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21652a.mo23807e();
        try {
            b.mo23676O();
            this.f21652a.mo23804F();
        } finally {
            this.f21652a.mo23809i();
            this.f21657f.mo23727h(b);
        }
    }

    /* renamed from: c */
    public List mo21802c(long j) {
        C8438a0 a0Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        C8438a0 d = C8438a0.m31651d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        d.mo23628r(1, j);
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            int e = C8721a.m32483e(c, "id");
            int e2 = C8721a.m32483e(c, "state");
            int e3 = C8721a.m32483e(c, "worker_class_name");
            int e4 = C8721a.m32483e(c, "input_merger_class_name");
            int e5 = C8721a.m32483e(c, "input");
            int e6 = C8721a.m32483e(c, "output");
            int e7 = C8721a.m32483e(c, "initial_delay");
            int e8 = C8721a.m32483e(c, "interval_duration");
            int e9 = C8721a.m32483e(c, "flex_duration");
            int e12 = C8721a.m32483e(c, "run_attempt_count");
            int e13 = C8721a.m32483e(c, "backoff_policy");
            int e14 = C8721a.m32483e(c, "backoff_delay_duration");
            int e15 = C8721a.m32483e(c, "last_enqueue_time");
            int e16 = C8721a.m32483e(c, "minimum_retention_duration");
            a0Var = d;
            try {
                int e17 = C8721a.m32483e(c, "schedule_requested_at");
                int e18 = C8721a.m32483e(c, "run_in_foreground");
                int e19 = C8721a.m32483e(c, "out_of_quota_policy");
                int e22 = C8721a.m32483e(c, "period_count");
                int e23 = C8721a.m32483e(c, "generation");
                int e24 = C8721a.m32483e(c, "required_network_type");
                int e25 = C8721a.m32483e(c, "requires_charging");
                int e26 = C8721a.m32483e(c, "requires_device_idle");
                int e27 = C8721a.m32483e(c, "requires_battery_not_low");
                int e28 = C8721a.m32483e(c, "requires_storage_not_low");
                int e29 = C8721a.m32483e(c, "trigger_content_update_delay");
                int e32 = C8721a.m32483e(c, "trigger_max_content_delay");
                int e33 = C8721a.m32483e(c, "content_uri_triggers");
                int i6 = e16;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    C2093w f = C7370c0.m28082f(c.getInt(e2));
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = c.getBlob(e5);
                    }
                    C1959e g = C1959e.m7700g(bArr);
                    if (c.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = c.getBlob(e6);
                    }
                    C1959e g2 = C1959e.m7700g(bArr2);
                    long j2 = c.getLong(e7);
                    long j3 = c.getLong(e8);
                    long j4 = c.getLong(e9);
                    int i7 = c.getInt(e12);
                    C1949a c2 = C7370c0.m28079c(c.getInt(e13));
                    long j5 = c.getLong(e14);
                    long j6 = c.getLong(e15);
                    int i8 = i6;
                    long j7 = c.getLong(i8);
                    int i9 = e;
                    int i12 = e17;
                    long j8 = c.getLong(i12);
                    e17 = i12;
                    int i13 = e18;
                    if (c.getInt(i13) != 0) {
                        e18 = i13;
                        i = e19;
                        z = true;
                    } else {
                        e18 = i13;
                        i = e19;
                        z = false;
                    }
                    C2085q e34 = C7370c0.m28081e(c.getInt(i));
                    e19 = i;
                    int i14 = e22;
                    int i15 = c.getInt(i14);
                    e22 = i14;
                    int i16 = e23;
                    int i17 = c.getInt(i16);
                    e23 = i16;
                    int i18 = e24;
                    C2075n d2 = C7370c0.m28080d(c.getInt(i18));
                    e24 = i18;
                    int i19 = e25;
                    if (c.getInt(i19) != 0) {
                        e25 = i19;
                        i2 = e26;
                        z2 = true;
                    } else {
                        e25 = i19;
                        i2 = e26;
                        z2 = false;
                    }
                    if (c.getInt(i2) != 0) {
                        e26 = i2;
                        i3 = e27;
                        z3 = true;
                    } else {
                        e26 = i2;
                        i3 = e27;
                        z3 = false;
                    }
                    if (c.getInt(i3) != 0) {
                        e27 = i3;
                        i4 = e28;
                        z4 = true;
                    } else {
                        e27 = i3;
                        i4 = e28;
                        z4 = false;
                    }
                    if (c.getInt(i4) != 0) {
                        e28 = i4;
                        i5 = e29;
                        z5 = true;
                    } else {
                        e28 = i4;
                        i5 = e29;
                        z5 = false;
                    }
                    long j9 = c.getLong(i5);
                    e29 = i5;
                    int i22 = e32;
                    long j12 = c.getLong(i22);
                    e32 = i22;
                    int i23 = e33;
                    if (c.isNull(i23)) {
                        bArr3 = null;
                    } else {
                        bArr3 = c.getBlob(i23);
                    }
                    e33 = i23;
                    arrayList.add(new C7399v(str, f, str2, str3, g, g2, j2, j3, j4, new C1954c(d2, z2, z3, z4, z5, j9, j12, C7370c0.m28078b(bArr3)), i7, c2, j5, j6, j7, j8, z, e34, i15, i17));
                    e = i9;
                    i6 = i8;
                }
                c.close();
                a0Var.mo23627n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                a0Var.mo23627n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = d;
            c.close();
            a0Var.mo23627n();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo21803d(C7399v vVar) {
        this.f21652a.mo23806d();
        this.f21652a.mo23807e();
        try {
            this.f21654c.mo23746j(vVar);
            this.f21652a.mo23804F();
        } finally {
            this.f21652a.mo23809i();
        }
    }

    /* renamed from: e */
    public List mo21804e() {
        C8438a0 a0Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        C8438a0 d = C8438a0.m31651d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            int e = C8721a.m32483e(c, "id");
            int e2 = C8721a.m32483e(c, "state");
            int e3 = C8721a.m32483e(c, "worker_class_name");
            int e4 = C8721a.m32483e(c, "input_merger_class_name");
            int e5 = C8721a.m32483e(c, "input");
            int e6 = C8721a.m32483e(c, "output");
            int e7 = C8721a.m32483e(c, "initial_delay");
            int e8 = C8721a.m32483e(c, "interval_duration");
            int e9 = C8721a.m32483e(c, "flex_duration");
            int e12 = C8721a.m32483e(c, "run_attempt_count");
            int e13 = C8721a.m32483e(c, "backoff_policy");
            int e14 = C8721a.m32483e(c, "backoff_delay_duration");
            int e15 = C8721a.m32483e(c, "last_enqueue_time");
            int e16 = C8721a.m32483e(c, "minimum_retention_duration");
            a0Var = d;
            try {
                int e17 = C8721a.m32483e(c, "schedule_requested_at");
                int e18 = C8721a.m32483e(c, "run_in_foreground");
                int e19 = C8721a.m32483e(c, "out_of_quota_policy");
                int e22 = C8721a.m32483e(c, "period_count");
                int e23 = C8721a.m32483e(c, "generation");
                int e24 = C8721a.m32483e(c, "required_network_type");
                int e25 = C8721a.m32483e(c, "requires_charging");
                int e26 = C8721a.m32483e(c, "requires_device_idle");
                int e27 = C8721a.m32483e(c, "requires_battery_not_low");
                int e28 = C8721a.m32483e(c, "requires_storage_not_low");
                int e29 = C8721a.m32483e(c, "trigger_content_update_delay");
                int e32 = C8721a.m32483e(c, "trigger_max_content_delay");
                int e33 = C8721a.m32483e(c, "content_uri_triggers");
                int i6 = e16;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    C2093w f = C7370c0.m28082f(c.getInt(e2));
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = c.getBlob(e5);
                    }
                    C1959e g = C1959e.m7700g(bArr);
                    if (c.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = c.getBlob(e6);
                    }
                    C1959e g2 = C1959e.m7700g(bArr2);
                    long j = c.getLong(e7);
                    long j2 = c.getLong(e8);
                    long j3 = c.getLong(e9);
                    int i7 = c.getInt(e12);
                    C1949a c2 = C7370c0.m28079c(c.getInt(e13));
                    long j4 = c.getLong(e14);
                    long j5 = c.getLong(e15);
                    int i8 = i6;
                    long j6 = c.getLong(i8);
                    int i9 = e;
                    int i12 = e17;
                    long j7 = c.getLong(i12);
                    e17 = i12;
                    int i13 = e18;
                    if (c.getInt(i13) != 0) {
                        e18 = i13;
                        i = e19;
                        z = true;
                    } else {
                        e18 = i13;
                        i = e19;
                        z = false;
                    }
                    C2085q e34 = C7370c0.m28081e(c.getInt(i));
                    e19 = i;
                    int i14 = e22;
                    int i15 = c.getInt(i14);
                    e22 = i14;
                    int i16 = e23;
                    int i17 = c.getInt(i16);
                    e23 = i16;
                    int i18 = e24;
                    C2075n d2 = C7370c0.m28080d(c.getInt(i18));
                    e24 = i18;
                    int i19 = e25;
                    if (c.getInt(i19) != 0) {
                        e25 = i19;
                        i2 = e26;
                        z2 = true;
                    } else {
                        e25 = i19;
                        i2 = e26;
                        z2 = false;
                    }
                    if (c.getInt(i2) != 0) {
                        e26 = i2;
                        i3 = e27;
                        z3 = true;
                    } else {
                        e26 = i2;
                        i3 = e27;
                        z3 = false;
                    }
                    if (c.getInt(i3) != 0) {
                        e27 = i3;
                        i4 = e28;
                        z4 = true;
                    } else {
                        e27 = i3;
                        i4 = e28;
                        z4 = false;
                    }
                    if (c.getInt(i4) != 0) {
                        e28 = i4;
                        i5 = e29;
                        z5 = true;
                    } else {
                        e28 = i4;
                        i5 = e29;
                        z5 = false;
                    }
                    long j8 = c.getLong(i5);
                    e29 = i5;
                    int i22 = e32;
                    long j9 = c.getLong(i22);
                    e32 = i22;
                    int i23 = e33;
                    if (c.isNull(i23)) {
                        bArr3 = null;
                    } else {
                        bArr3 = c.getBlob(i23);
                    }
                    e33 = i23;
                    arrayList.add(new C7399v(str, f, str2, str3, g, g2, j, j2, j3, new C1954c(d2, z2, z3, z4, z5, j8, j9, C7370c0.m28078b(bArr3)), i7, c2, j4, j5, j6, j7, z, e34, i15, i17));
                    e = i9;
                    i6 = i8;
                }
                c.close();
                a0Var.mo23627n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                a0Var.mo23627n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = d;
            c.close();
            a0Var.mo23627n();
            throw th;
        }
    }

    /* renamed from: f */
    public void mo21805f(C7399v vVar) {
        this.f21652a.mo23806d();
        this.f21652a.mo23807e();
        try {
            this.f21653b.mo23748k(vVar);
            this.f21652a.mo23804F();
        } finally {
            this.f21652a.mo23809i();
        }
    }

    /* renamed from: g */
    public List mo21806g(String str) {
        String str2;
        C8438a0 d = C8438a0.m31651d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
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

    /* renamed from: h */
    public C2093w mo21807h(String str) {
        Integer num;
        C8438a0 d = C8438a0.m31651d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21652a.mo23806d();
        C2093w wVar = null;
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst()) {
                if (c.isNull(0)) {
                    num = null;
                } else {
                    num = Integer.valueOf(c.getInt(0));
                }
                if (num != null) {
                    C7370c0 c0Var = C7370c0.f21591a;
                    wVar = C7370c0.m28082f(num.intValue());
                }
            }
            return wVar;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: i */
    public C7399v mo21808i(String str) {
        C8438a0 a0Var;
        C7399v vVar;
        String str2;
        String str3;
        String str4;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        String str5 = str;
        C8438a0 d = C8438a0.m31651d("SELECT * FROM workspec WHERE id=?", 1);
        if (str5 == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str5);
        }
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            int e = C8721a.m32483e(c, "id");
            int e2 = C8721a.m32483e(c, "state");
            int e3 = C8721a.m32483e(c, "worker_class_name");
            int e4 = C8721a.m32483e(c, "input_merger_class_name");
            int e5 = C8721a.m32483e(c, "input");
            int e6 = C8721a.m32483e(c, "output");
            int e7 = C8721a.m32483e(c, "initial_delay");
            int e8 = C8721a.m32483e(c, "interval_duration");
            int e9 = C8721a.m32483e(c, "flex_duration");
            int e12 = C8721a.m32483e(c, "run_attempt_count");
            int e13 = C8721a.m32483e(c, "backoff_policy");
            int e14 = C8721a.m32483e(c, "backoff_delay_duration");
            int e15 = C8721a.m32483e(c, "last_enqueue_time");
            int e16 = C8721a.m32483e(c, "minimum_retention_duration");
            a0Var = d;
            try {
                int e17 = C8721a.m32483e(c, "schedule_requested_at");
                int e18 = C8721a.m32483e(c, "run_in_foreground");
                int e19 = C8721a.m32483e(c, "out_of_quota_policy");
                int e22 = C8721a.m32483e(c, "period_count");
                int e23 = C8721a.m32483e(c, "generation");
                int e24 = C8721a.m32483e(c, "required_network_type");
                int e25 = C8721a.m32483e(c, "requires_charging");
                int e26 = C8721a.m32483e(c, "requires_device_idle");
                int e27 = C8721a.m32483e(c, "requires_battery_not_low");
                int e28 = C8721a.m32483e(c, "requires_storage_not_low");
                int e29 = C8721a.m32483e(c, "trigger_content_update_delay");
                int e32 = C8721a.m32483e(c, "trigger_max_content_delay");
                int e33 = C8721a.m32483e(c, "content_uri_triggers");
                if (c.moveToFirst()) {
                    if (c.isNull(e)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e);
                    }
                    C2093w f = C7370c0.m28082f(c.getInt(e2));
                    if (c.isNull(e3)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str4 = null;
                    } else {
                        str4 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = c.getBlob(e5);
                    }
                    C1959e g = C1959e.m7700g(bArr);
                    if (c.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = c.getBlob(e6);
                    }
                    C1959e g2 = C1959e.m7700g(bArr2);
                    long j = c.getLong(e7);
                    long j2 = c.getLong(e8);
                    long j3 = c.getLong(e9);
                    int i6 = c.getInt(e12);
                    C1949a c2 = C7370c0.m28079c(c.getInt(e13));
                    long j4 = c.getLong(e14);
                    long j5 = c.getLong(e15);
                    long j6 = c.getLong(e16);
                    long j7 = c.getLong(e17);
                    if (c.getInt(e18) != 0) {
                        i = e19;
                        z = true;
                    } else {
                        i = e19;
                        z = false;
                    }
                    C2085q e34 = C7370c0.m28081e(c.getInt(i));
                    int i7 = c.getInt(e22);
                    int i8 = c.getInt(e23);
                    C2075n d2 = C7370c0.m28080d(c.getInt(e24));
                    if (c.getInt(e25) != 0) {
                        i2 = e26;
                        z2 = true;
                    } else {
                        i2 = e26;
                        z2 = false;
                    }
                    if (c.getInt(i2) != 0) {
                        i3 = e27;
                        z3 = true;
                    } else {
                        i3 = e27;
                        z3 = false;
                    }
                    if (c.getInt(i3) != 0) {
                        i4 = e28;
                        z4 = true;
                    } else {
                        i4 = e28;
                        z4 = false;
                    }
                    if (c.getInt(i4) != 0) {
                        i5 = e29;
                        z5 = true;
                    } else {
                        i5 = e29;
                        z5 = false;
                    }
                    long j8 = c.getLong(i5);
                    long j9 = c.getLong(e32);
                    if (c.isNull(e33)) {
                        bArr3 = null;
                    } else {
                        bArr3 = c.getBlob(e33);
                    }
                    vVar = new C7399v(str2, f, str3, str4, g, g2, j, j2, j3, new C1954c(d2, z2, z3, z4, z5, j8, j9, C7370c0.m28078b(bArr3)), i6, c2, j4, j5, j6, j7, z, e34, i7, i8);
                } else {
                    vVar = null;
                }
                c.close();
                a0Var.mo23627n();
                return vVar;
            } catch (Throwable th) {
                th = th;
                c.close();
                a0Var.mo23627n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = d;
            c.close();
            a0Var.mo23627n();
            throw th;
        }
    }

    /* renamed from: j */
    public void mo21809j(String str, long j) {
        this.f21652a.mo23806d();
        C9008m b = this.f21659h.mo23725b();
        b.mo23628r(1, j);
        if (str == null) {
            b.mo23624j1(2);
        } else {
            b.mo23623j(2, str);
        }
        this.f21652a.mo23807e();
        try {
            b.mo23676O();
            this.f21652a.mo23804F();
        } finally {
            this.f21652a.mo23809i();
            this.f21659h.mo23727h(b);
        }
    }

    /* renamed from: k */
    public List mo21810k(String str) {
        String str2;
        C8438a0 d = C8438a0.m31651d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
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

    /* renamed from: l */
    public List mo21811l(String str) {
        byte[] bArr;
        C8438a0 d = C8438a0.m31651d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                if (c.isNull(0)) {
                    bArr = null;
                } else {
                    bArr = c.getBlob(0);
                }
                arrayList.add(C1959e.m7700g(bArr));
            }
            return arrayList;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: m */
    public List mo21812m(int i) {
        C8438a0 a0Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        C8438a0 d = C8438a0.m31651d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        d.mo23628r(1, (long) i);
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            int e = C8721a.m32483e(c, "id");
            int e2 = C8721a.m32483e(c, "state");
            int e3 = C8721a.m32483e(c, "worker_class_name");
            int e4 = C8721a.m32483e(c, "input_merger_class_name");
            int e5 = C8721a.m32483e(c, "input");
            int e6 = C8721a.m32483e(c, "output");
            int e7 = C8721a.m32483e(c, "initial_delay");
            int e8 = C8721a.m32483e(c, "interval_duration");
            int e9 = C8721a.m32483e(c, "flex_duration");
            int e12 = C8721a.m32483e(c, "run_attempt_count");
            int e13 = C8721a.m32483e(c, "backoff_policy");
            int e14 = C8721a.m32483e(c, "backoff_delay_duration");
            int e15 = C8721a.m32483e(c, "last_enqueue_time");
            int e16 = C8721a.m32483e(c, "minimum_retention_duration");
            a0Var = d;
            try {
                int e17 = C8721a.m32483e(c, "schedule_requested_at");
                int e18 = C8721a.m32483e(c, "run_in_foreground");
                int e19 = C8721a.m32483e(c, "out_of_quota_policy");
                int e22 = C8721a.m32483e(c, "period_count");
                int e23 = C8721a.m32483e(c, "generation");
                int e24 = C8721a.m32483e(c, "required_network_type");
                int e25 = C8721a.m32483e(c, "requires_charging");
                int e26 = C8721a.m32483e(c, "requires_device_idle");
                int e27 = C8721a.m32483e(c, "requires_battery_not_low");
                int e28 = C8721a.m32483e(c, "requires_storage_not_low");
                int e29 = C8721a.m32483e(c, "trigger_content_update_delay");
                int e32 = C8721a.m32483e(c, "trigger_max_content_delay");
                int e33 = C8721a.m32483e(c, "content_uri_triggers");
                int i7 = e16;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    C2093w f = C7370c0.m28082f(c.getInt(e2));
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = c.getBlob(e5);
                    }
                    C1959e g = C1959e.m7700g(bArr);
                    if (c.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = c.getBlob(e6);
                    }
                    C1959e g2 = C1959e.m7700g(bArr2);
                    long j = c.getLong(e7);
                    long j2 = c.getLong(e8);
                    long j3 = c.getLong(e9);
                    int i8 = c.getInt(e12);
                    C1949a c2 = C7370c0.m28079c(c.getInt(e13));
                    long j4 = c.getLong(e14);
                    long j5 = c.getLong(e15);
                    int i9 = i7;
                    long j6 = c.getLong(i9);
                    int i12 = e;
                    int i13 = e17;
                    long j7 = c.getLong(i13);
                    e17 = i13;
                    int i14 = e18;
                    if (c.getInt(i14) != 0) {
                        e18 = i14;
                        i2 = e19;
                        z = true;
                    } else {
                        e18 = i14;
                        i2 = e19;
                        z = false;
                    }
                    C2085q e34 = C7370c0.m28081e(c.getInt(i2));
                    e19 = i2;
                    int i15 = e22;
                    int i16 = c.getInt(i15);
                    e22 = i15;
                    int i17 = e23;
                    int i18 = c.getInt(i17);
                    e23 = i17;
                    int i19 = e24;
                    C2075n d2 = C7370c0.m28080d(c.getInt(i19));
                    e24 = i19;
                    int i22 = e25;
                    if (c.getInt(i22) != 0) {
                        e25 = i22;
                        i3 = e26;
                        z2 = true;
                    } else {
                        e25 = i22;
                        i3 = e26;
                        z2 = false;
                    }
                    if (c.getInt(i3) != 0) {
                        e26 = i3;
                        i4 = e27;
                        z3 = true;
                    } else {
                        e26 = i3;
                        i4 = e27;
                        z3 = false;
                    }
                    if (c.getInt(i4) != 0) {
                        e27 = i4;
                        i5 = e28;
                        z4 = true;
                    } else {
                        e27 = i4;
                        i5 = e28;
                        z4 = false;
                    }
                    if (c.getInt(i5) != 0) {
                        e28 = i5;
                        i6 = e29;
                        z5 = true;
                    } else {
                        e28 = i5;
                        i6 = e29;
                        z5 = false;
                    }
                    long j8 = c.getLong(i6);
                    e29 = i6;
                    int i23 = e32;
                    long j9 = c.getLong(i23);
                    e32 = i23;
                    int i24 = e33;
                    if (c.isNull(i24)) {
                        bArr3 = null;
                    } else {
                        bArr3 = c.getBlob(i24);
                    }
                    e33 = i24;
                    arrayList.add(new C7399v(str, f, str2, str3, g, g2, j, j2, j3, new C1954c(d2, z2, z3, z4, z5, j8, j9, C7370c0.m28078b(bArr3)), i8, c2, j4, j5, j6, j7, z, e34, i16, i18));
                    e = i12;
                    i7 = i9;
                }
                c.close();
                a0Var.mo23627n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                a0Var.mo23627n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = d;
            c.close();
            a0Var.mo23627n();
            throw th;
        }
    }

    /* renamed from: n */
    public int mo21813n() {
        this.f21652a.mo23806d();
        C9008m b = this.f21663l.mo23725b();
        this.f21652a.mo23807e();
        try {
            int O = b.mo23676O();
            this.f21652a.mo23804F();
            return O;
        } finally {
            this.f21652a.mo23809i();
            this.f21663l.mo23727h(b);
        }
    }

    /* renamed from: o */
    public int mo21814o(String str, long j) {
        this.f21652a.mo23806d();
        C9008m b = this.f21662k.mo23725b();
        b.mo23628r(1, j);
        if (str == null) {
            b.mo23624j1(2);
        } else {
            b.mo23623j(2, str);
        }
        this.f21652a.mo23807e();
        try {
            int O = b.mo23676O();
            this.f21652a.mo23804F();
            return O;
        } finally {
            this.f21652a.mo23809i();
            this.f21662k.mo23727h(b);
        }
    }

    /* renamed from: p */
    public List mo21815p(String str) {
        String str2;
        C8438a0 d = C8438a0.m31651d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            d.mo23624j1(1);
        } else {
            d.mo23623j(1, str);
        }
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(c.getCount());
            while (c.moveToNext()) {
                if (c.isNull(0)) {
                    str2 = null;
                } else {
                    str2 = c.getString(0);
                }
                arrayList.add(new C7399v.C7401b(str2, C7370c0.m28082f(c.getInt(1))));
            }
            return arrayList;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: q */
    public List mo21816q(int i) {
        C8438a0 a0Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        byte[] bArr3;
        C8438a0 d = C8438a0.m31651d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d.mo23628r(1, (long) i);
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            int e = C8721a.m32483e(c, "id");
            int e2 = C8721a.m32483e(c, "state");
            int e3 = C8721a.m32483e(c, "worker_class_name");
            int e4 = C8721a.m32483e(c, "input_merger_class_name");
            int e5 = C8721a.m32483e(c, "input");
            int e6 = C8721a.m32483e(c, "output");
            int e7 = C8721a.m32483e(c, "initial_delay");
            int e8 = C8721a.m32483e(c, "interval_duration");
            int e9 = C8721a.m32483e(c, "flex_duration");
            int e12 = C8721a.m32483e(c, "run_attempt_count");
            int e13 = C8721a.m32483e(c, "backoff_policy");
            int e14 = C8721a.m32483e(c, "backoff_delay_duration");
            int e15 = C8721a.m32483e(c, "last_enqueue_time");
            int e16 = C8721a.m32483e(c, "minimum_retention_duration");
            a0Var = d;
            try {
                int e17 = C8721a.m32483e(c, "schedule_requested_at");
                int e18 = C8721a.m32483e(c, "run_in_foreground");
                int e19 = C8721a.m32483e(c, "out_of_quota_policy");
                int e22 = C8721a.m32483e(c, "period_count");
                int e23 = C8721a.m32483e(c, "generation");
                int e24 = C8721a.m32483e(c, "required_network_type");
                int e25 = C8721a.m32483e(c, "requires_charging");
                int e26 = C8721a.m32483e(c, "requires_device_idle");
                int e27 = C8721a.m32483e(c, "requires_battery_not_low");
                int e28 = C8721a.m32483e(c, "requires_storage_not_low");
                int e29 = C8721a.m32483e(c, "trigger_content_update_delay");
                int e32 = C8721a.m32483e(c, "trigger_max_content_delay");
                int e33 = C8721a.m32483e(c, "content_uri_triggers");
                int i7 = e16;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    C2093w f = C7370c0.m28082f(c.getInt(e2));
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = c.getBlob(e5);
                    }
                    C1959e g = C1959e.m7700g(bArr);
                    if (c.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = c.getBlob(e6);
                    }
                    C1959e g2 = C1959e.m7700g(bArr2);
                    long j = c.getLong(e7);
                    long j2 = c.getLong(e8);
                    long j3 = c.getLong(e9);
                    int i8 = c.getInt(e12);
                    C1949a c2 = C7370c0.m28079c(c.getInt(e13));
                    long j4 = c.getLong(e14);
                    long j5 = c.getLong(e15);
                    int i9 = i7;
                    long j6 = c.getLong(i9);
                    int i12 = e;
                    int i13 = e17;
                    long j7 = c.getLong(i13);
                    e17 = i13;
                    int i14 = e18;
                    if (c.getInt(i14) != 0) {
                        e18 = i14;
                        i2 = e19;
                        z = true;
                    } else {
                        e18 = i14;
                        i2 = e19;
                        z = false;
                    }
                    C2085q e34 = C7370c0.m28081e(c.getInt(i2));
                    e19 = i2;
                    int i15 = e22;
                    int i16 = c.getInt(i15);
                    e22 = i15;
                    int i17 = e23;
                    int i18 = c.getInt(i17);
                    e23 = i17;
                    int i19 = e24;
                    C2075n d2 = C7370c0.m28080d(c.getInt(i19));
                    e24 = i19;
                    int i22 = e25;
                    if (c.getInt(i22) != 0) {
                        e25 = i22;
                        i3 = e26;
                        z2 = true;
                    } else {
                        e25 = i22;
                        i3 = e26;
                        z2 = false;
                    }
                    if (c.getInt(i3) != 0) {
                        e26 = i3;
                        i4 = e27;
                        z3 = true;
                    } else {
                        e26 = i3;
                        i4 = e27;
                        z3 = false;
                    }
                    if (c.getInt(i4) != 0) {
                        e27 = i4;
                        i5 = e28;
                        z4 = true;
                    } else {
                        e27 = i4;
                        i5 = e28;
                        z4 = false;
                    }
                    if (c.getInt(i5) != 0) {
                        e28 = i5;
                        i6 = e29;
                        z5 = true;
                    } else {
                        e28 = i5;
                        i6 = e29;
                        z5 = false;
                    }
                    long j8 = c.getLong(i6);
                    e29 = i6;
                    int i23 = e32;
                    long j9 = c.getLong(i23);
                    e32 = i23;
                    int i24 = e33;
                    if (c.isNull(i24)) {
                        bArr3 = null;
                    } else {
                        bArr3 = c.getBlob(i24);
                    }
                    e33 = i24;
                    arrayList.add(new C7399v(str, f, str2, str3, g, g2, j, j2, j3, new C1954c(d2, z2, z3, z4, z5, j8, j9, C7370c0.m28078b(bArr3)), i8, c2, j4, j5, j6, j7, z, e34, i16, i18));
                    e = i12;
                    i7 = i9;
                }
                c.close();
                a0Var.mo23627n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                a0Var.mo23627n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = d;
            c.close();
            a0Var.mo23627n();
            throw th;
        }
    }

    /* renamed from: r */
    public int mo21817r(C2093w wVar, String str) {
        this.f21652a.mo23806d();
        C9008m b = this.f21656e.mo23725b();
        b.mo23628r(1, (long) C7370c0.m28086j(wVar));
        if (str == null) {
            b.mo23624j1(2);
        } else {
            b.mo23623j(2, str);
        }
        this.f21652a.mo23807e();
        try {
            int O = b.mo23676O();
            this.f21652a.mo23804F();
            return O;
        } finally {
            this.f21652a.mo23809i();
            this.f21656e.mo23727h(b);
        }
    }

    /* renamed from: s */
    public void mo21818s(String str, C1959e eVar) {
        this.f21652a.mo23806d();
        C9008m b = this.f21658g.mo23725b();
        byte[] l = C1959e.m7701l(eVar);
        if (l == null) {
            b.mo23624j1(1);
        } else {
            b.mo23618X0(1, l);
        }
        if (str == null) {
            b.mo23624j1(2);
        } else {
            b.mo23623j(2, str);
        }
        this.f21652a.mo23807e();
        try {
            b.mo23676O();
            this.f21652a.mo23804F();
        } finally {
            this.f21652a.mo23809i();
            this.f21658g.mo23727h(b);
        }
    }

    /* renamed from: t */
    public List mo21819t() {
        C8438a0 a0Var;
        String str;
        String str2;
        String str3;
        byte[] bArr;
        byte[] bArr2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        byte[] bArr3;
        C8438a0 d = C8438a0.m31651d("SELECT * FROM workspec WHERE state=1", 0);
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            int e = C8721a.m32483e(c, "id");
            int e2 = C8721a.m32483e(c, "state");
            int e3 = C8721a.m32483e(c, "worker_class_name");
            int e4 = C8721a.m32483e(c, "input_merger_class_name");
            int e5 = C8721a.m32483e(c, "input");
            int e6 = C8721a.m32483e(c, "output");
            int e7 = C8721a.m32483e(c, "initial_delay");
            int e8 = C8721a.m32483e(c, "interval_duration");
            int e9 = C8721a.m32483e(c, "flex_duration");
            int e12 = C8721a.m32483e(c, "run_attempt_count");
            int e13 = C8721a.m32483e(c, "backoff_policy");
            int e14 = C8721a.m32483e(c, "backoff_delay_duration");
            int e15 = C8721a.m32483e(c, "last_enqueue_time");
            int e16 = C8721a.m32483e(c, "minimum_retention_duration");
            a0Var = d;
            try {
                int e17 = C8721a.m32483e(c, "schedule_requested_at");
                int e18 = C8721a.m32483e(c, "run_in_foreground");
                int e19 = C8721a.m32483e(c, "out_of_quota_policy");
                int e22 = C8721a.m32483e(c, "period_count");
                int e23 = C8721a.m32483e(c, "generation");
                int e24 = C8721a.m32483e(c, "required_network_type");
                int e25 = C8721a.m32483e(c, "requires_charging");
                int e26 = C8721a.m32483e(c, "requires_device_idle");
                int e27 = C8721a.m32483e(c, "requires_battery_not_low");
                int e28 = C8721a.m32483e(c, "requires_storage_not_low");
                int e29 = C8721a.m32483e(c, "trigger_content_update_delay");
                int e32 = C8721a.m32483e(c, "trigger_max_content_delay");
                int e33 = C8721a.m32483e(c, "content_uri_triggers");
                int i6 = e16;
                ArrayList arrayList = new ArrayList(c.getCount());
                while (c.moveToNext()) {
                    if (c.isNull(e)) {
                        str = null;
                    } else {
                        str = c.getString(e);
                    }
                    C2093w f = C7370c0.m28082f(c.getInt(e2));
                    if (c.isNull(e3)) {
                        str2 = null;
                    } else {
                        str2 = c.getString(e3);
                    }
                    if (c.isNull(e4)) {
                        str3 = null;
                    } else {
                        str3 = c.getString(e4);
                    }
                    if (c.isNull(e5)) {
                        bArr = null;
                    } else {
                        bArr = c.getBlob(e5);
                    }
                    C1959e g = C1959e.m7700g(bArr);
                    if (c.isNull(e6)) {
                        bArr2 = null;
                    } else {
                        bArr2 = c.getBlob(e6);
                    }
                    C1959e g2 = C1959e.m7700g(bArr2);
                    long j = c.getLong(e7);
                    long j2 = c.getLong(e8);
                    long j3 = c.getLong(e9);
                    int i7 = c.getInt(e12);
                    C1949a c2 = C7370c0.m28079c(c.getInt(e13));
                    long j4 = c.getLong(e14);
                    long j5 = c.getLong(e15);
                    int i8 = i6;
                    long j6 = c.getLong(i8);
                    int i9 = e;
                    int i12 = e17;
                    long j7 = c.getLong(i12);
                    e17 = i12;
                    int i13 = e18;
                    if (c.getInt(i13) != 0) {
                        e18 = i13;
                        i = e19;
                        z = true;
                    } else {
                        e18 = i13;
                        i = e19;
                        z = false;
                    }
                    C2085q e34 = C7370c0.m28081e(c.getInt(i));
                    e19 = i;
                    int i14 = e22;
                    int i15 = c.getInt(i14);
                    e22 = i14;
                    int i16 = e23;
                    int i17 = c.getInt(i16);
                    e23 = i16;
                    int i18 = e24;
                    C2075n d2 = C7370c0.m28080d(c.getInt(i18));
                    e24 = i18;
                    int i19 = e25;
                    if (c.getInt(i19) != 0) {
                        e25 = i19;
                        i2 = e26;
                        z2 = true;
                    } else {
                        e25 = i19;
                        i2 = e26;
                        z2 = false;
                    }
                    if (c.getInt(i2) != 0) {
                        e26 = i2;
                        i3 = e27;
                        z3 = true;
                    } else {
                        e26 = i2;
                        i3 = e27;
                        z3 = false;
                    }
                    if (c.getInt(i3) != 0) {
                        e27 = i3;
                        i4 = e28;
                        z4 = true;
                    } else {
                        e27 = i3;
                        i4 = e28;
                        z4 = false;
                    }
                    if (c.getInt(i4) != 0) {
                        e28 = i4;
                        i5 = e29;
                        z5 = true;
                    } else {
                        e28 = i4;
                        i5 = e29;
                        z5 = false;
                    }
                    long j8 = c.getLong(i5);
                    e29 = i5;
                    int i22 = e32;
                    long j9 = c.getLong(i22);
                    e32 = i22;
                    int i23 = e33;
                    if (c.isNull(i23)) {
                        bArr3 = null;
                    } else {
                        bArr3 = c.getBlob(i23);
                    }
                    e33 = i23;
                    arrayList.add(new C7399v(str, f, str2, str3, g, g2, j, j2, j3, new C1954c(d2, z2, z3, z4, z5, j8, j9, C7370c0.m28078b(bArr3)), i7, c2, j4, j5, j6, j7, z, e34, i15, i17));
                    e = i9;
                    i6 = i8;
                }
                c.close();
                a0Var.mo23627n();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                c.close();
                a0Var.mo23627n();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            a0Var = d;
            c.close();
            a0Var.mo23627n();
            throw th;
        }
    }

    /* renamed from: u */
    public boolean mo21820u() {
        boolean z = false;
        C8438a0 d = C8438a0.m31651d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f21652a.mo23806d();
        Cursor c = C8722b.m32486c(this.f21652a, d, false, (CancellationSignal) null);
        try {
            if (c.moveToFirst() && c.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            c.close();
            d.mo23627n();
        }
    }

    /* renamed from: v */
    public int mo21821v(String str) {
        this.f21652a.mo23806d();
        C9008m b = this.f21661j.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21652a.mo23807e();
        try {
            int O = b.mo23676O();
            this.f21652a.mo23804F();
            return O;
        } finally {
            this.f21652a.mo23809i();
            this.f21661j.mo23727h(b);
        }
    }

    /* renamed from: w */
    public int mo21822w(String str) {
        this.f21652a.mo23806d();
        C9008m b = this.f21660i.mo23725b();
        if (str == null) {
            b.mo23624j1(1);
        } else {
            b.mo23623j(1, str);
        }
        this.f21652a.mo23807e();
        try {
            int O = b.mo23676O();
            this.f21652a.mo23804F();
            return O;
        } finally {
            this.f21652a.mo23809i();
            this.f21660i.mo23727h(b);
        }
    }
}
