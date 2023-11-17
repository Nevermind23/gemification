package p341ge.bog.mobilebank.p975ui.widgets.rates;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import g91.C32296c1;
import g91.C32359z0;
import p341ge.bog.mobilebank.model.CcyRatesWrapper;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.widgets.rates.CurrencyRatesWidgetProvider */
public class CurrencyRatesWidgetProvider extends C35833d {

    /* renamed from: e */
    public static String f86543e = "ACTION_REFRESH";

    /* renamed from: c */
    RootBankApiManager f86544c;

    /* renamed from: d */
    PreferencesApiManager f86545d;

    /* renamed from: b */
    public void mo87815b(Context context, int[] iArr, boolean z) {
        int i;
        int i2;
        Context context2 = context;
        int[] iArr2 = iArr;
        if (iArr2 != null) {
            AppWidgetManager instance = AppWidgetManager.getInstance(context);
            for (int i3 : iArr2) {
                Bundle appWidgetOptions = instance.getAppWidgetOptions(i3);
                int k = C32296c1.m95151k(appWidgetOptions);
                Log.d("CurrencyRatesProvider", ">> updateWidgets. widgetSize: " + k);
                RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C32296c1.m95143c(k));
                CcyRatesWrapper ccyRates = this.f86545d.getCcyRates();
                if (ccyRates != null) {
                    long currentDate = ccyRates.getCurrentDate();
                    if (currentDate != -1) {
                        remoteViews.setTextViewText(C10322k.update_date, C32359z0.m95546Q(currentDate, "dd.MM.yyyy hh:mm"));
                    } else {
                        remoteViews.setTextViewText(C10322k.update_date, "");
                    }
                }
                int i4 = C10322k.f28736Gc;
                remoteViews.setTextViewText(i4, context2.getString(C10328q.common_text_empty_list));
                int i5 = C10328q.common_text_ccy_rates;
                int i6 = C10319h.rates_lbl_text_size;
                int i7 = C10318g.dark_text_color_333;
                remoteViews.setImageViewBitmap(C10322k.rates_lbl, C32296c1.m95145e(context2, i5, i6, i7, C10321j.f28706b));
                int i8 = C10328q.ccy_official_rate_short;
                int i9 = C10319h.official_rate_lbl_text_size;
                int i12 = C10321j.bog_headline_medium;
                remoteViews.setImageViewBitmap(C10322k.official_rate_lbl, C32296c1.m95145e(context2, i8, i9, i7, i12));
                if (k != 1) {
                    if (k == 2) {
                        i2 = C10328q.widget_mobile_bank_rate_medium;
                    } else {
                        i2 = C10328q.widget_mobile_bank_rate;
                    }
                    remoteViews.setImageViewBitmap(C10322k.mobile_bank_rate, C32296c1.m95145e(context2, i2, i9, i7, i12));
                    int i13 = C10328q.ccy_buy;
                    int i14 = C10318g.default_gray_color;
                    int i15 = C10321j.f28707e;
                    remoteViews.setImageViewBitmap(C10322k.buy_lbl, C32296c1.m95145e(context2, i13, i6, i14, i15));
                    remoteViews.setImageViewBitmap(C10322k.sell_lbl, C32296c1.m95145e(context2, C10328q.ccy_sell, i6, i14, i15));
                }
                int i16 = C10322k.f28753Ir;
                int i17 = 8;
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                remoteViews.setViewVisibility(i16, i);
                int i18 = C10322k.refresh_progress;
                if (z) {
                    i17 = 0;
                }
                remoteViews.setViewVisibility(i18, i17);
                Intent intent = new Intent(context2, CurrencyRatesWidgetProvider.class);
                intent.setAction(f86543e);
                intent.putExtra("appWidgetId", i3);
                remoteViews.setOnClickPendingIntent(i16, PendingIntent.getBroadcast(context2, i3, intent, 167772160));
                Intent intent2 = new Intent(context2, CurrencyRatesWidgetService.class);
                C32296c1.m95152l(intent2, appWidgetOptions);
                intent2.setAction("widgetId-" + i3 + "-widgetSize-" + k);
                intent2.putExtra("appWidgetId", i3);
                intent2.putExtra("widget_size", k);
                intent2.setData(Uri.parse(intent2.toUri(1)));
                int i19 = C10322k.currency_list;
                remoteViews.setRemoteAdapter(i19, intent2);
                remoteViews.setEmptyView(i19, i4);
                Intent intent3 = new Intent(context2, ExchangeActivity.class);
                intent3.setAction("ACTION_OPEN_FROM_WIDGET");
                remoteViews.setPendingIntentTemplate(i19, PendingIntent.getActivity(context2, 0, intent3, 33554432));
                instance.updateAppWidget(i3, remoteViews);
                instance.notifyAppWidgetViewDataChanged(i3, i19);
            }
        }
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        mo87815b(context, new int[]{i}, false);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.d("CurrencyRatesProvider", ">> onReceiver: " + action);
        super.onReceive(context, intent);
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, CurrencyRatesWidgetProvider.class));
        if (intent.getExtras() != null) {
            appWidgetIds = intent.getExtras().getIntArray("appWidgetIds");
        }
        if (f86543e.equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                mo87815b(context, new int[]{extras.getInt("appWidgetId")}, true);
            }
            this.f86544c.getCcyRates(false);
        } else if ("ge.bog.mobilebank.ACTION_CURRENCY_RATES_UPDATED".equals(action) || "ge.bog.mobilebank.ACTION_LOCALE_CHANGED".equals(action)) {
            mo87815b(context, appWidgetIds, false);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        Log.d("CurrencyRatesProvider", ">> onUpdate ");
        this.f86544c.getCcyRates(false);
    }
}
