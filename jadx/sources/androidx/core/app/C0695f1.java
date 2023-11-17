package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: androidx.core.app.f1 */
public abstract class C0695f1 {

    /* renamed from: androidx.core.app.f1$a */
    static class C0696a {
        /* renamed from: a */
        static void m2709a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        /* renamed from: b */
        public static RemoteInput m2710b(C0695f1 f1Var) {
            throw null;
        }

        /* renamed from: c */
        static Bundle m2711c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    /* renamed from: a */
    static RemoteInput m2707a(C0695f1 f1Var) {
        return C0696a.m2710b(f1Var);
    }

    /* renamed from: b */
    static RemoteInput[] m2708b(C0695f1[] f1VarArr) {
        if (f1VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[f1VarArr.length];
        for (int i = 0; i < f1VarArr.length; i++) {
            C0695f1 f1Var = f1VarArr[i];
            remoteInputArr[i] = m2707a((C0695f1) null);
        }
        return remoteInputArr;
    }
}
