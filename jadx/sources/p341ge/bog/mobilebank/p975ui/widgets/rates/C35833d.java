package p341ge.bog.mobilebank.p975ui.widgets.rates;

import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import dagger.hilt.android.internal.managers.C12064e;
import p627uf.C18157e;
import y81.C40035a;

/* renamed from: ge.bog.mobilebank.ui.widgets.rates.d */
abstract class C35833d extends AppWidgetProvider {

    /* renamed from: a */
    private volatile boolean f86550a = false;

    /* renamed from: b */
    private final Object f86551b = new Object();

    C35833d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo87829a(Context context) {
        if (!this.f86550a) {
            synchronized (this.f86551b) {
                if (!this.f86550a) {
                    ((C40035a) C12064e.m44264a(context)).mo32870i((CurrencyRatesWidgetProvider) C18157e.m62250a(this));
                    this.f86550a = true;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        mo87829a(context);
        super.onReceive(context, intent);
    }
}
