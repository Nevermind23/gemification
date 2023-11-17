package p458id;

import android.util.Log;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: id.b */
public final class C15600b {

    /* renamed from: b */
    static String f44301b;

    /* renamed from: c */
    static String f44302c;

    /* renamed from: d */
    private static int f44303d;

    /* renamed from: e */
    private static Set f44304e = new CopyOnWriteArraySet();

    /* renamed from: f */
    static C15602b f44305f = new C15601a();

    /* renamed from: a */
    private String f44306a;

    /* renamed from: id.b$a */
    class C15601a implements C15602b {
        C15601a() {
        }

        /* renamed from: a */
        public void mo42881a(int i, String str, String str2, Throwable th) {
            if (i == 0) {
                Log.v(str, str2, th);
            } else if (i == 1) {
                Log.i(str, str2, th);
            } else if (i == 2) {
                Log.w(str, str2, th);
            } else if (i == 3) {
                Log.e(str, str2, th);
            }
        }
    }

    /* renamed from: id.b$b */
    public interface C15602b {
        /* renamed from: a */
        void mo42881a(int i, String str, String str2, Throwable th);
    }

    static {
        m56351e(3);
        f44304e.add(f44305f);
    }

    private C15600b(String str) {
        this.f44306a = str;
    }

    /* renamed from: a */
    public static C15600b m56349a(String str) {
        return new C15600b(str);
    }

    /* renamed from: d */
    private String m56350d(int i, Object... objArr) {
        Throwable th = null;
        if (!m56352f(i)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Throwable th2 : objArr) {
            if (th2 instanceof Throwable) {
                th = th2;
            }
            sb.append(String.valueOf(th2));
            sb.append(" ");
        }
        String trim = sb.toString().trim();
        for (C15602b a : f44304e) {
            a.mo42881a(i, this.f44306a, trim, th);
        }
        f44301b = trim;
        f44302c = this.f44306a;
        return trim;
    }

    /* renamed from: e */
    public static void m56351e(int i) {
        f44303d = i;
    }

    /* renamed from: f */
    private boolean m56352f(int i) {
        return f44303d <= i && f44304e.size() > 0;
    }

    /* renamed from: b */
    public String mo42877b(Object... objArr) {
        return m56350d(3, objArr);
    }

    /* renamed from: c */
    public String mo42878c(Object... objArr) {
        return m56350d(1, objArr);
    }

    /* renamed from: g */
    public String mo42879g(Object... objArr) {
        return m56350d(0, objArr);
    }

    /* renamed from: h */
    public String mo42880h(Object... objArr) {
        return m56350d(2, objArr);
    }
}
