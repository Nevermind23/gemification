package com.medallia.digital.mobilesdk;

import androidx.work.C1959e;
import androidx.work.C2076o;
import androidx.work.C2094x;

/* renamed from: com.medallia.digital.mobilesdk.j4 */
class C10916j4 {

    /* renamed from: a */
    protected static final String f31357a = "mediaData";

    /* renamed from: b */
    protected static final String f31358b = "mediaCaptureConfig";

    /* renamed from: c */
    protected static final String f31359c = "isPreviewsApp";

    /* renamed from: d */
    private static C10916j4 f31360d;

    C10916j4() {
    }

    /* renamed from: b */
    protected static C10916j4 m39856b() {
        if (f31360d == null) {
            f31360d = new C10916j4();
        }
        return f31360d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28545a() {
        C10735b4.m39113e("executeRetryMechanism worker");
        C2094x.m8110g(C10884i4.m39721c().mo28483b()).mo6981d((C2076o) new C2076o.C2077a(RetryMechanismWorker.class).mo6987b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28546a(C11173w4 w4Var, C11099t4 t4Var, Boolean bool) {
        C10735b4.m39113e("executeSubmitMediaFeedback worker");
        C1959e.C1960a aVar = new C1959e.C1960a();
        if (w4Var != null) {
            aVar.mo6738f(f31357a, w4Var.toJsonString());
        }
        if (t4Var != null) {
            aVar.mo6738f(f31358b, t4Var.mo29012i());
        }
        aVar.mo6737e(f31359c, bool.booleanValue());
        C1959e a = aVar.mo6733a();
        C2094x.m8110g(C10884i4.m39721c().mo28483b()).mo6981d((C2076o) ((C2076o.C2077a) new C2076o.C2077a(SubmitMediaFeedbackWorker.class).mo6994k(a)).mo6987b());
    }
}
