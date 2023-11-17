package androidx.work;

import java.util.List;

/* renamed from: androidx.work.j */
public abstract class C2065j {

    /* renamed from: a */
    private static final String f6215a = C2073m.m8073i("InputMerger");

    /* renamed from: a */
    public static C2065j m8059a(String str) {
        try {
            return (C2065j) Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            C2073m e2 = C2073m.m8071e();
            String str2 = f6215a;
            e2.mo6962d(str2, "Trouble instantiating + " + str, e);
            return null;
        }
    }

    /* renamed from: b */
    public abstract C1959e mo6673b(List list);
}
