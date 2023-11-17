package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.profileinstaller.C1694g;
import com.google.firebase.messaging.C5329g1;
import p337z7.Task;

/* renamed from: com.google.firebase.messaging.d1 */
class C5318d1 extends Binder {

    /* renamed from: b */
    private final C5319a f17036b;

    /* renamed from: com.google.firebase.messaging.d1$a */
    interface C5319a {
        /* renamed from: a */
        Task mo17572a(Intent intent);
    }

    C5318d1(C5319a aVar) {
        this.f17036b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17571c(C5329g1.C5330a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f17036b.mo17572a(aVar.f17058a).mo24857b(new C1694g(), new C5314c1(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
