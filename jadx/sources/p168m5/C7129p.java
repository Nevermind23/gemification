package p168m5;

import android.util.Base64;
import p142k5.C6813d;
import p168m5.C7109d;

/* renamed from: m5.p */
public abstract class C7129p {

    /* renamed from: m5.p$a */
    public static abstract class C7130a {
        /* renamed from: a */
        public abstract C7129p mo21360a();

        /* renamed from: b */
        public abstract C7130a mo21361b(String str);

        /* renamed from: c */
        public abstract C7130a mo21362c(byte[] bArr);

        /* renamed from: d */
        public abstract C7130a mo21363d(C6813d dVar);
    }

    /* renamed from: a */
    public static C7130a m27484a() {
        return new C7109d.C7111b().mo21363d(C6813d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo21355b();

    /* renamed from: c */
    public abstract byte[] mo21356c();

    /* renamed from: d */
    public abstract C6813d mo21357d();

    /* renamed from: e */
    public boolean mo21386e() {
        return mo21356c() != null;
    }

    /* renamed from: f */
    public C7129p mo21387f(C6813d dVar) {
        return m27484a().mo21361b(mo21355b()).mo21363d(dVar).mo21362c(mo21356c()).mo21360a();
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = mo21355b();
        objArr[1] = mo21357d();
        if (mo21356c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(mo21356c(), 2);
        }
        objArr[2] = str;
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
