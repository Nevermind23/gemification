package androidx.work;

import android.content.Context;
import androidx.work.C1950b;
import java.util.Collections;
import java.util.List;
import p019b1.C2109a;

public final class WorkManagerInitializer implements C2109a {

    /* renamed from: a */
    private static final String f5862a = C2073m.m8073i("WrkMgrInitializer");

    /* renamed from: a */
    public List mo3965a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public C2094x mo3966b(Context context) {
        C2073m.m8071e().mo6959a(f5862a, "Initializing WorkManager with default configuration.");
        C2094x.m8111h(context, new C1950b.C1952b().mo6706a());
        return C2094x.m8110g(context);
    }
}
