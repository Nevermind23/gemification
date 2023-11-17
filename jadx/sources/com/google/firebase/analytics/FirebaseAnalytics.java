package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C4429u2;
import com.google.firebase.installations.C5283c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p182n6.C7264i;
import p248s7.C8268v;
import p337z7.C9231i;

public final class FirebaseAnalytics {

    /* renamed from: b */
    private static volatile FirebaseAnalytics f16787b;

    /* renamed from: a */
    private final C4429u2 f16788a;

    public FirebaseAnalytics(C4429u2 u2Var) {
        C7264i.m27902k(u2Var);
        this.f16788a = u2Var;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f16787b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f16787b == null) {
                    f16787b = new FirebaseAnalytics(C4429u2.m16797s(context, (String) null, (String) null, (String) null, (Bundle) null));
                }
            }
        }
        return f16787b;
    }

    @Keep
    public static C8268v getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C4429u2 s = C4429u2.m16797s(context, (String) null, (String) null, (String) null, bundle);
        if (s == null) {
            return null;
        }
        return new C5235a(s);
    }

    /* renamed from: a */
    public void mo17403a(String str, Bundle bundle) {
        this.f16788a.mo13660G(str, bundle);
    }

    /* renamed from: b */
    public void mo17404b(String str) {
        this.f16788a.mo13666e(str);
    }

    /* renamed from: c */
    public void mo17405c(String str, String str2) {
        this.f16788a.mo13667f((String) null, str, str2, false);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) C9231i.m34108b(C5283c.m20865q().mo17504a(), 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            throw new IllegalStateException(e.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Deprecated
    @Keep
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f16788a.mo13665d(activity, str, str2);
    }
}
