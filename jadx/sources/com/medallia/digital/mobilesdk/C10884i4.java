package com.medallia.digital.mobilesdk;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;

/* renamed from: com.medallia.digital.mobilesdk.i4 */
class C10884i4 implements C10769c8 {

    /* renamed from: c */
    private static C10884i4 f31243c;

    /* renamed from: a */
    private Application f31244a;

    /* renamed from: b */
    private MutableContextWrapper f31245b;

    C10884i4() {
    }

    /* renamed from: c */
    protected static C10884i4 m39721c() {
        if (f31243c == null) {
            f31243c = new C10884i4();
        }
        return f31243c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Application mo28481a() {
        return this.f31244a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Context mo28483b() {
        Application application = this.f31244a;
        if (application != null) {
            return application.getApplicationContext();
        }
        return null;
    }

    public void clearAndDisconnect() {
        f31243c = null;
        this.f31245b = null;
        this.f31244a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public MutableContextWrapper mo28484d() {
        return this.f31245b;
    }

    /* renamed from: a */
    protected static void m39719a(Application application) {
        m39721c().m39720b(application);
    }

    /* renamed from: b */
    private void m39720b(Application application) {
        if (this.f31244a == null) {
            this.f31244a = application;
            this.f31245b = application == null ? null : new MutableContextWrapper(application.getApplicationContext());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28482a(Context context) {
        MutableContextWrapper mutableContextWrapper = this.f31245b;
        if (context == null) {
            Application application = this.f31244a;
            context = application != null ? application.getApplicationContext() : null;
        }
        mutableContextWrapper.setBaseContext(context);
    }
}
