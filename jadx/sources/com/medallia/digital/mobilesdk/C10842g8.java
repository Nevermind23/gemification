package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C10785e0;
import com.medallia.digital.mobilesdk.C11089s6;

/* renamed from: com.medallia.digital.mobilesdk.g8 */
public class C10842g8 implements C10769c8 {

    /* renamed from: c */
    private static C10842g8 f31053c;

    /* renamed from: a */
    private String f31054a = null;

    /* renamed from: b */
    private boolean f31055b;

    /* renamed from: com.medallia.digital.mobilesdk.g8$a */
    class C10843a implements MDResultCallback {
        C10843a() {
        }

        public void onError(MDExternalError mDExternalError) {
            StringBuilder sb = new StringBuilder();
            sb.append("OCQValidationRules failed ");
            sb.append(mDExternalError != null ? mDExternalError.getMessage() : "");
            C10735b4.m39111c(sb.toString());
        }

        public void onSuccess() {
            C10735b4.m39109b("OCQValidationRules success after set user id");
        }
    }

    /* renamed from: a */
    private void m39563a() {
        C10876i1 a = C10876i1.m39698a();
        C10785e0.C10786a aVar = C10785e0.C10786a.QuarantineRule;
        if (a.mo28470c(aVar) > 0) {
            C10876i1.m39698a().mo28463a(aVar);
        }
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.C_UUID, (String) null);
        C11089s6.m40668b().mo28984b(C11089s6.C11090a.OCQ_UUID_URL, (String) null);
        CollectorsInfrastructure.getInstance().isOCQRulesValidCollector.mo28117a(Boolean.FALSE);
    }

    /* renamed from: b */
    protected static C10842g8 m39567b() {
        if (f31053c == null) {
            f31053c = new C10842g8();
        }
        return f31053c;
    }

    public void clearAndDisconnect() {
        f31053c = null;
        this.f31054a = null;
        this.f31055b = false;
    }

    /* renamed from: a */
    private void m39564a(String str) {
        C11016n4.m40375f().mo28831a(C11089s6.C11090a.OCQ_PREVIOUS_USER_ID, str);
        C11016n4.m40375f().mo28831a(C11089s6.C11090a.OCQ_USER_ID, this.f31054a);
        CollectorsInfrastructure.getInstance().isOCQUserSetCollector.mo28117a(Boolean.valueOf(!this.f31055b));
    }

    /* renamed from: a */
    private void m39565a(String str, boolean z) {
        this.f31054a = str;
        this.f31055b = z;
    }

    /* renamed from: a */
    public void mo28380a(String str, boolean z, boolean z2) {
        m39565a(str, z);
        mo28381a(z2, false);
    }

    /* renamed from: a */
    private void m39566a(boolean z) {
        if (!z) {
            C10809f5.m39420a().mo28302b(new C10843a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28381a(boolean z, boolean z2) {
        String str;
        if ((this.f31055b || ((str = this.f31054a) != null && !str.isEmpty())) && CollectorsInfrastructure.getInstance() != null && CollectorsInfrastructure.getInstance().isInitialized() && C11089s6.m40668b().mo28987d() && z) {
            String str2 = this.f31054a;
            String a = C11016n4.m40375f().mo28829a(C11089s6.C11090a.OCQ_USER_ID);
            String a2 = C11016n4.m40375f().mo28829a(C11089s6.C11090a.OCQ_PREVIOUS_USER_ID);
            if ((str2 == null || !str2.equals(a)) && ((str2 != null && !str2.isEmpty()) || a != null)) {
                if (str2 == null || str2.isEmpty()) {
                    C10735b4.m39109b("new user id is null or empty");
                    m39564a(a);
                } else {
                    if (a == null && str2.equals(a2)) {
                        C10735b4.m39109b("new user id is equal to previous");
                        m39564a((String) null);
                    } else if (!str2.equals(a)) {
                        C10735b4.m39109b("new user id is not equal to previous");
                        m39564a((String) null);
                        m39563a();
                    }
                    m39566a(z2);
                }
                this.f31055b = false;
                this.f31054a = null;
                return;
            }
            C10735b4.m39109b("new user id is equal to the one is storage");
        }
    }
}
