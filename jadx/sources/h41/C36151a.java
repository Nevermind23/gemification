package h41;

import android.os.SystemClock;
import android.view.View;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.jvm.internal.C41536l;
import ue1.C43064a;

/* renamed from: h41.a */
public abstract class C36151a {

    /* renamed from: h41.a$a */
    public static final class C36152a implements View.OnClickListener {

        /* renamed from: d */
        private long f87338d;

        /* renamed from: e */
        final /* synthetic */ long f87339e;

        /* renamed from: f */
        final /* synthetic */ C43064a f87340f;

        C36152a(long j, C43064a aVar) {
            this.f87339e = j;
            this.f87340f = aVar;
        }

        public void onClick(View view) {
            boolean z;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            if (valueOf.longValue() - this.f87338d > this.f87339e) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                valueOf = null;
            }
            if (valueOf != null) {
                C43064a aVar = this.f87340f;
                long longValue = valueOf.longValue();
                aVar.invoke();
                this.f87338d = longValue;
            }
        }
    }

    /* renamed from: a */
    public static final void m107540a(View view, long j, C43064a aVar) {
        C41536l.m120489i(view, "<this>");
        C41536l.m120489i(aVar, UrlHandler.ACTION);
        view.setOnClickListener(new C36152a(j, aVar));
    }

    /* renamed from: b */
    public static /* synthetic */ void m107541b(View view, long j, C43064a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 1000;
        }
        m107540a(view, j, aVar);
    }
}
