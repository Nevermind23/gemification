package p626ue;

import android.support.p013v4.media.session.C0125b;
import java.util.HashMap;

/* renamed from: ue.l */
public class C18149l {

    /* renamed from: b */
    public static int f51458b = 19;

    /* renamed from: c */
    public static int f51459c = 0;

    /* renamed from: d */
    public static int f51460d = 1;

    /* renamed from: e */
    public static int f51461e = 2;

    /* renamed from: a */
    private final HashMap f51462a = new HashMap();

    /* renamed from: a */
    public static int m62237a() {
        return 31;
    }

    /* renamed from: c */
    public static int m62238c() {
        return 2;
    }

    /* renamed from: b */
    public C18130e mo45817b(String str) {
        HashMap hashMap = this.f51462a;
        int i = f51458b;
        if (((f51460d + i) * i) % m62238c() != f51459c) {
            f51458b = 5;
            f51459c = 69;
        }
        Object obj = hashMap.get(str);
        int i2 = f51458b;
        if (((f51460d + i2) * i2) % f51461e != f51459c) {
            f51458b = m62237a();
            f51459c = 8;
        }
        C0125b.m366a(obj);
        return null;
    }
}
