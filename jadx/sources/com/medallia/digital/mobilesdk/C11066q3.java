package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.C11089s6;

/* renamed from: com.medallia.digital.mobilesdk.q3 */
class C11066q3 implements C11075r3 {
    C11066q3() {
    }

    /* renamed from: a */
    public boolean mo28937a() {
        boolean a = C11089s6.m40668b().mo28980a(C11089s6.C11090a.IS_SDK_KILLED, false);
        boolean a2 = C11089s6.m40668b().mo28980a(C11089s6.C11090a.SHOULD_CHECK_OS, false);
        long a3 = C11089s6.m40668b().mo28974a(C11089s6.C11090a.SDK_RECOVER_TIMESTAMP, 0);
        if (a) {
            return C10918j6.m39861b() || (a2 && C10918j6.m39860a()) || (a3 != -1 && mo28941c() >= a3);
        }
        return false;
    }

    /* renamed from: b */
    public void mo28939b(KillStatus killStatus) {
        long j;
        C11089s6.C11090a aVar;
        C11089s6 s6Var;
        if (killStatus != null && killStatus.isKilled().booleanValue()) {
            C11089s6.m40668b().mo28983b(C11089s6.C11090a.SDK_KILL_TIMESTAMP, System.currentTimeMillis());
            if (killStatus.getShouldCheckRestoreOnOsChange() != null) {
                C11089s6.m40668b().mo28985b(C11089s6.C11090a.SHOULD_CHECK_OS, killStatus.getShouldCheckRestoreOnOsChange().booleanValue());
            }
            if (killStatus.getRestorePollingInterval() != null) {
                if (killStatus.getRestorePollingInterval().longValue() == -1) {
                    s6Var = C11089s6.m40668b();
                    aVar = C11089s6.C11090a.SDK_RECOVER_TIMESTAMP;
                    j = killStatus.getRestorePollingInterval().longValue();
                } else {
                    s6Var = C11089s6.m40668b();
                    aVar = C11089s6.C11090a.SDK_RECOVER_TIMESTAMP;
                    j = System.currentTimeMillis() + killStatus.getRestorePollingInterval().longValue();
                }
                s6Var.mo28983b(aVar, j);
            }
            if (killStatus.isKilled() != null) {
                C11089s6.m40668b().mo28985b(C11089s6.C11090a.IS_SDK_KILLED, killStatus.isKilled().booleanValue());
            }
        }
    }

    /* renamed from: c */
    public long mo28941c() {
        return System.currentTimeMillis();
    }

    public void clear() {
        C11089s6.m40668b().mo28985b(C11089s6.C11090a.IS_SDK_KILLED, false);
        C11089s6.m40668b().mo28983b(C11089s6.C11090a.SDK_RECOVER_TIMESTAMP, 0);
        C11089s6.m40668b().mo28983b(C11089s6.C11090a.SDK_KILL_TIMESTAMP, 0);
    }

    /* renamed from: a */
    public boolean mo28938a(KillStatus killStatus) {
        return (killStatus == null || killStatus.isKilled() == null || !killStatus.isKilled().booleanValue()) ? false : true;
    }

    /* renamed from: b */
    public boolean mo28940b() {
        return C11089s6.m40668b().mo28980a(C11089s6.C11090a.IS_SDK_KILLED, false);
    }

    /* renamed from: c */
    public boolean mo28942c(KillStatus killStatus) {
        return !mo28938a(killStatus) && mo28940b();
    }
}
