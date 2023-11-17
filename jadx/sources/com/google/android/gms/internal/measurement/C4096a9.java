package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.a9 */
public abstract class C4096a9 extends C4231i8 {

    /* renamed from: b */
    private static final Logger f13139b = Logger.getLogger(C4096a9.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f13140c = C4387rb.m16571C();

    /* renamed from: d */
    public static final /* synthetic */ int f13141d = 0;

    /* renamed from: a */
    C4113b9 f13142a;

    /* synthetic */ C4096a9(C4517z8 z8Var) {
    }

    /* renamed from: A */
    public static C4096a9 m15478A(byte[] bArr, int i, int i2) {
        return new C4501y8(bArr, 0, i2);
    }

    /* renamed from: u */
    static int m15480u(int i, C4386ra raVar, C4132cb cbVar) {
        int e = ((C4146d8) raVar).mo13040e(cbVar);
        int y = m15484y(i << 3);
        return y + y + e;
    }

    /* renamed from: v */
    public static int m15481v(int i) {
        if (i >= 0) {
            return m15484y(i);
        }
        return 10;
    }

    /* renamed from: w */
    static int m15482w(C4386ra raVar, C4132cb cbVar) {
        int e = ((C4146d8) raVar).mo13040e(cbVar);
        return m15484y(e) + e;
    }

    /* renamed from: x */
    public static int m15483x(String str) {
        int i;
        try {
            i = C4472wb.m17101c(str);
        } catch (C4455vb unused) {
            i = str.getBytes(C4470w9.f13782b).length;
        }
        return m15484y(i) + i;
    }

    /* renamed from: y */
    public static int m15484y(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: z */
    public static int m15485z(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            j >>>= 14;
            i += 2;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    /* renamed from: a */
    public final void mo12845a() {
        if (mo12847d() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12846b(String str, C4455vb vbVar) {
        f13139b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", vbVar);
        byte[] bytes = str.getBytes(C4470w9.f13782b);
        try {
            int length = bytes.length;
            mo12861r(length);
            mo12857n(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzkg(e);
        }
    }

    /* renamed from: d */
    public abstract int mo12847d();

    /* renamed from: e */
    public abstract void mo12848e(byte b);

    /* renamed from: f */
    public abstract void mo12849f(int i, boolean z);

    /* renamed from: g */
    public abstract void mo12850g(int i, C4418t8 t8Var);

    /* renamed from: h */
    public abstract void mo12851h(int i, int i2);

    /* renamed from: i */
    public abstract void mo12852i(int i);

    /* renamed from: j */
    public abstract void mo12853j(int i, long j);

    /* renamed from: k */
    public abstract void mo12854k(long j);

    /* renamed from: l */
    public abstract void mo12855l(int i, int i2);

    /* renamed from: m */
    public abstract void mo12856m(int i);

    /* renamed from: n */
    public abstract void mo12857n(byte[] bArr, int i, int i2);

    /* renamed from: o */
    public abstract void mo12858o(int i, String str);

    /* renamed from: p */
    public abstract void mo12859p(int i, int i2);

    /* renamed from: q */
    public abstract void mo12860q(int i, int i2);

    /* renamed from: r */
    public abstract void mo12861r(int i);

    /* renamed from: s */
    public abstract void mo12862s(int i, long j);

    /* renamed from: t */
    public abstract void mo12863t(long j);
}
