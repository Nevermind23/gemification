package kg1;

import android.os.Looper;
import jg1.C41438c;
import jg1.C41443e;
import jg1.C41447g;
import jg1.C41451k;

/* renamed from: kg1.d */
public class C41515d implements C41447g {
    /* renamed from: a */
    public C41451k mo96195a(C41438c cVar) {
        return new C41443e(cVar, Looper.getMainLooper(), 10);
    }

    /* renamed from: b */
    public boolean mo96196b() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
