package o31;

import android.content.Intent;
import androidx.core.p016os.C0908e;
import he1.C41224m;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.p */
public abstract class C37613p {
    /* renamed from: a */
    public static final Intent m110614a(Intent intent, C41224m... mVarArr) {
        C41536l.m120489i(intent, "<this>");
        C41536l.m120489i(mVarArr, "pairs");
        Intent putExtras = intent.putExtras(C0908e.m3336b((C41224m[]) Arrays.copyOf(mVarArr, mVarArr.length)));
        C41536l.m120488h(putExtras, "withExtras");
        return putExtras;
    }
}
