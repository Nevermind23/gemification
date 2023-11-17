package p091g6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p182n6.C7264i;

/* renamed from: g6.b */
public class C6229b {

    /* renamed from: c */
    private static final Lock f19254c = new ReentrantLock();

    /* renamed from: d */
    private static C6229b f19255d;

    /* renamed from: a */
    private final Lock f19256a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f19257b;

    C6229b(Context context) {
        this.f19257b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C6229b m24768b(Context context) {
        C7264i.m27902k(context);
        Lock lock = f19254c;
        lock.lock();
        try {
            if (f19255d == null) {
                f19255d = new C6229b(context.getApplicationContext());
            }
            C6229b bVar = f19255d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f19254c.unlock();
            throw th;
        }
    }

    /* renamed from: i */
    private static final String m24769i(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo19838a() {
        this.f19256a.lock();
        try {
            this.f19257b.edit().clear().apply();
        } finally {
            this.f19256a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount mo19839c() {
        String g;
        String g2 = mo19843g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo19843g(m24769i("googleSignInAccount", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m14380G1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions mo19840d() {
        String g;
        String g2 = mo19843g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g2) || (g = mo19843g(m24769i("googleSignInOptions", g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m14392F1(g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String mo19841e() {
        return mo19843g("refreshToken");
    }

    /* renamed from: f */
    public void mo19842f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C7264i.m27902k(googleSignInAccount);
        C7264i.m27902k(googleSignInOptions);
        mo19844h("defaultGoogleSignInAccount", googleSignInAccount.mo11761H1());
        C7264i.m27902k(googleSignInAccount);
        C7264i.m27902k(googleSignInOptions);
        String H1 = googleSignInAccount.mo11761H1();
        mo19844h(m24769i("googleSignInAccount", H1), googleSignInAccount.mo11762I1());
        mo19844h(m24769i("googleSignInOptions", H1), googleSignInOptions.mo11775J1());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final String mo19843g(String str) {
        this.f19256a.lock();
        try {
            return this.f19257b.getString(str, (String) null);
        } finally {
            this.f19256a.unlock();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo19844h(String str, String str2) {
        this.f19256a.lock();
        try {
            this.f19257b.edit().putString(str, str2).apply();
        } finally {
            this.f19256a.unlock();
        }
    }
}
