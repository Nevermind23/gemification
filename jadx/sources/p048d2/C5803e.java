package p048d2;

import android.util.Log;
import com.airbnb.lottie.C2311c;
import com.airbnb.lottie.C2324g0;
import java.util.HashSet;
import java.util.Set;

/* renamed from: d2.e */
public class C5803e implements C2324g0 {

    /* renamed from: a */
    private static final Set f18277a = new HashSet();

    /* renamed from: a */
    public void mo7538a(String str, Throwable th) {
        if (C2311c.f7186a) {
            Log.d("LOTTIE", str, th);
        }
    }

    /* renamed from: b */
    public void mo7539b(String str) {
        mo7541d(str, (Throwable) null);
    }

    /* renamed from: c */
    public void mo7540c(String str) {
        mo18980e(str, (Throwable) null);
    }

    /* renamed from: d */
    public void mo7541d(String str, Throwable th) {
        Set set = f18277a;
        if (!set.contains(str)) {
            Log.w("LOTTIE", str, th);
            set.add(str);
        }
    }

    /* renamed from: e */
    public void mo18980e(String str, Throwable th) {
        if (C2311c.f7186a) {
            Log.d("LOTTIE", str, th);
        }
    }
}
