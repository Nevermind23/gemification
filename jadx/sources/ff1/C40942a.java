package ff1;

import android.os.Looper;
import ef1.C40883y1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41618r;

/* renamed from: ff1.a */
public final class C40942a implements C41618r {
    /* renamed from: a */
    public String mo95333a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* renamed from: b */
    public C40883y1 mo95334b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C40944c(C40948e.m118734a(mainLooper, true), (String) null, 2, (DefaultConstructorMarker) null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    /* renamed from: c */
    public int mo95335c() {
        return 1073741823;
    }
}
