package p341ge.bog.mobilebank.broadcastreceiver;

import android.content.Context;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.LiveData;
import ba1.C10205l;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.broadcastreceiver.a */
public final class C13931a extends C10205l {

    /* renamed from: ge.bog.mobilebank.broadcastreceiver.a$a */
    public static final class C13932a implements C10205l.C10206a {

        /* renamed from: a */
        final /* synthetic */ LiveData f41300a;

        /* renamed from: b */
        final /* synthetic */ OTPCodeRetriever f41301b;

        C13932a(LiveData liveData, OTPCodeRetriever oTPCodeRetriever) {
            this.f41300a = liveData;
            this.f41301b = oTPCodeRetriever;
        }

        /* renamed from: a */
        public void mo26774a() {
            this.f41301b.mo38347i();
        }

        /* renamed from: b */
        public LiveData mo26775b() {
            return this.f41300a;
        }
    }

    /* renamed from: a */
    public C10205l.C10206a mo26771a(Context context, C1619q qVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(qVar, "lifecycleOwner");
        OTPCodeRetriever a = OTPCodeRetriever.f41292h.mo38350a(context, qVar);
        return new C13932a(a.mo38346h(), a);
    }
}
