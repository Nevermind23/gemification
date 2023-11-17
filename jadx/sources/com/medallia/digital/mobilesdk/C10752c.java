package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C10901j2;
import com.medallia.digital.mobilesdk.C11089s6;
import com.medallia.digital.mobilesdk.MDExternalError;
import java.util.ArrayList;

/* renamed from: com.medallia.digital.mobilesdk.c */
class C10752c {

    /* renamed from: com.medallia.digital.mobilesdk.c$a */
    static class C10753a implements C10796e6<C11235z0> {

        /* renamed from: a */
        final /* synthetic */ String f30746a;

        /* renamed from: b */
        final /* synthetic */ C11009n f30747b;

        /* renamed from: c */
        final /* synthetic */ C11009n f30748c;

        /* renamed from: d */
        final /* synthetic */ MDResultCallback f30749d;

        C10753a(String str, C11009n nVar, C11009n nVar2, MDResultCallback mDResultCallback) {
            this.f30746a = str;
            this.f30747b = nVar;
            this.f30748c = nVar2;
            this.f30749d = mDResultCallback;
        }

        /* renamed from: a */
        public void mo27796a(C10859h4 h4Var) {
        }

        /* renamed from: a */
        public void mo27797a(C11235z0 z0Var) {
            C10998m4.m40266h().mo28735a(z0Var.mo29240a());
            C10752c.m39177c(this.f30746a, this.f30747b, this.f30748c, this.f30749d);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.c$b */
    static class C10754b implements C10901j2.C10903b {

        /* renamed from: a */
        final /* synthetic */ String f30750a;

        /* renamed from: b */
        final /* synthetic */ C11009n f30751b;

        /* renamed from: c */
        final /* synthetic */ C11009n f30752c;

        /* renamed from: d */
        final /* synthetic */ MDResultCallback f30753d;

        C10754b(String str, C11009n nVar, C11009n nVar2, MDResultCallback mDResultCallback) {
            this.f30750a = str;
            this.f30751b = nVar;
            this.f30752c = nVar2;
            this.f30753d = mDResultCallback;
        }

        /* renamed from: a */
        public void mo28149a() {
        }

        public void onSuccess() {
            C10735b4.m39113e("Migration Stored feedbacks have been submitted successfully");
            C10752c.m39174a(this.f30750a, this.f30751b, this.f30752c, this.f30753d);
        }
    }

    C10752c() {
    }

    /* renamed from: a */
    protected static void m39173a(String str, MDResultCallback mDResultCallback) {
        C11009n createApiToken = ModelFactory.getInstance().createApiToken(C11016n4.m40375f().mo28829a(C11089s6.C11090a.API_TOKEN));
        C11009n createApiToken2 = ModelFactory.getInstance().createApiToken(str);
        if (createApiToken != null && createApiToken2 != null) {
            C10735b4.m39113e("Migration between accounts has started from propertyId " + createApiToken.mo28777c() + " to propertyId " + createApiToken2.mo28777c());
            C10718a3.m39038c().mo28072a(createApiToken);
            m39176b(str, createApiToken, createApiToken2, mDResultCallback);
        }
    }

    /* renamed from: b */
    private static void m39176b(String str, C11009n nVar, C11009n nVar2, MDResultCallback mDResultCallback) {
        ArrayList<? extends C10785e0> c = C10876i1.m39698a().mo28471c(C10785e0.C10786a.Feedback, new Object[0]);
        if (c == null || c.isEmpty()) {
            m39174a(str, nVar, nVar2, mDResultCallback);
        } else if (C10988l8.m40232b()) {
            C10998m4.m40266h().mo28741a("2.0.0", (C10796e6<C11235z0>) new C10753a(str, nVar, nVar2, mDResultCallback));
        } else {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.NO_INTERNET_CONNECTION_AVAILABLE_12));
        }
    }

    /* renamed from: c */
    protected static void m39177c(String str, C11009n nVar, C11009n nVar2, MDResultCallback mDResultCallback) {
        MedalliaDigital.getMedalliaDigitalBrain().mo28678c().mo28521a((C10901j2.C10903b) new C10754b(str, nVar, nVar2, mDResultCallback));
    }

    /* renamed from: a */
    protected static void m39174a(String str, C11009n nVar, C11009n nVar2, MDResultCallback mDResultCallback) {
        C10735b4.m39113e("Migration between accounts has ended from propertyId " + nVar.mo28777c() + " to propertyId " + nVar2.mo28777c());
        MedalliaDigital.getMedalliaDigitalBrain().clearAndDisconnect();
        MedalliaDigital.updateBrainOnMigration();
        MedalliaDigital.getMedalliaDigitalBrain().mo28677b(str, mDResultCallback);
    }

    /* renamed from: a */
    protected static boolean m39175a(String str) {
        C11009n createApiToken = ModelFactory.getInstance().createApiToken(C11016n4.m40375f().mo28829a(C11089s6.C11090a.API_TOKEN));
        return createApiToken != null && !TextUtils.isEmpty(createApiToken.mo28827a()) && str != null && !str.isEmpty() && !createApiToken.mo28827a().equals(str) && createApiToken.mo28777c() != new C11009n(str).mo28777c();
    }
}
