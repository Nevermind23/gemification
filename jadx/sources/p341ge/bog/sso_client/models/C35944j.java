package p341ge.bog.sso_client.models;

import sso.type.RecoveryProcessFlow;

/* renamed from: ge.bog.sso_client.models.j */
public abstract class C35944j {

    /* renamed from: ge.bog.sso_client.models.j$a */
    public /* synthetic */ class C35945a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86973a;

        static {
            int[] iArr = new int[RecoveryProcessFlow.values().length];
            iArr[RecoveryProcessFlow.TRANSACTIONS.ordinal()] = 1;
            iArr[RecoveryProcessFlow.CONTACTS.ordinal()] = 2;
            iArr[RecoveryProcessFlow.ONBOARDING.ordinal()] = 3;
            iArr[RecoveryProcessFlow.OLD_FLOW.ordinal()] = 4;
            f86973a = iArr;
        }
    }

    /* renamed from: a */
    public static final C35942i m106976a(RecoveryProcessFlow recoveryProcessFlow) {
        int i;
        if (recoveryProcessFlow == null) {
            i = -1;
        } else {
            i = C35945a.f86973a[recoveryProcessFlow.ordinal()];
        }
        if (i == 1) {
            return C35942i.TRANSACTIONS;
        }
        if (i == 2) {
            return C35942i.CONTACTS;
        }
        if (i == 3) {
            return C35942i.ONBOARDING;
        }
        if (i != 4) {
            return C35942i.UNKNOWN;
        }
        return C35942i.OLD_FLOW;
    }
}
