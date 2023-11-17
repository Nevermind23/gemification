package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.core.content.C0767a;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.o */
public final class C4731o extends C4726n5 {

    /* renamed from: c */
    private long f14681c;

    /* renamed from: d */
    private String f14682d;

    /* renamed from: e */
    private AccountManager f14683e;

    /* renamed from: f */
    private Boolean f14684f;

    /* renamed from: g */
    private long f14685g;

    C4731o(C4791t4 t4Var) {
        super(t4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo14329j() {
        Calendar instance = Calendar.getInstance();
        this.f14681c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f14682d = lowerCase + "-" + lowerCase2;
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final long mo14647o() {
        mo14554h();
        return this.f14685g;
    }

    /* renamed from: p */
    public final long mo14648p() {
        mo14640k();
        return this.f14681c;
    }

    /* renamed from: q */
    public final String mo14649q() {
        mo14640k();
        return this.f14682d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo14650r() {
        mo14554h();
        this.f14684f = null;
        this.f14685g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo14651s() {
        mo14554h();
        long a = this.f14613a.mo14548a().mo23594a();
        if (a - this.f14685g > 86400000) {
            this.f14684f = null;
        }
        Boolean bool = this.f14684f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0767a.m2891a(this.f14613a.mo14550c(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f14613a.mo14551d().mo14682y().mo14615a("Permission error checking for dasher/unicorn accounts");
            this.f14685g = a;
            this.f14684f = Boolean.FALSE;
            return false;
        }
        if (this.f14683e == null) {
            this.f14683e = AccountManager.get(this.f14613a.mo14550c());
        }
        try {
            Account[] result = this.f14683e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f14683e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f14684f = Boolean.TRUE;
                    this.f14685g = a;
                    return true;
                }
                this.f14685g = a;
                this.f14684f = Boolean.FALSE;
                return false;
            }
            this.f14684f = Boolean.TRUE;
            this.f14685g = a;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f14613a.mo14551d().mo14677t().mo14616b("Exception checking account types", e);
        }
    }
}
