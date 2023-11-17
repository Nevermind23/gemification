package p341ge.bog.mobilebank.p975ui.widgets.quicklinks;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import g91.C32296c1;
import p341ge.bog.mobilebank.cleanarch.qrscanner.presentation.QrScannerActivity;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.ProviderListActivity;
import p341ge.bog.mobilebank.payment.activities.PaymentFormActivity;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.widgets.quicklinks.QuickLinksWidgetProvider */
public class QuickLinksWidgetProvider extends AppWidgetProvider {
    /* renamed from: a */
    public void mo87812a(Context context, int[] iArr) {
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        for (int updateAppWidget : iArr) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C10324m.widget_quick_links);
            int i = C10328q.qr_pay;
            int i2 = C10319h.widget_quick_links_item_txt_size;
            int i3 = C10318g.dark_text_color_333;
            int i4 = C10321j.f28707e;
            remoteViews.setImageViewBitmap(C10322k.qr_pay_text, C32296c1.m95145e(context, i, i2, i3, i4));
            remoteViews.setImageViewBitmap(C10322k.mobile_topup_text, C32296c1.m95145e(context, C10328q.quick_links_mobile_topup, i2, i3, i4));
            remoteViews.setImageViewBitmap(C10322k.transfer_text, C32296c1.m95145e(context, C10328q.quick_links_transfer, i2, i3, i4));
            remoteViews.setImageViewBitmap(C10322k.utility_payment_text, C32296c1.m95145e(context, C10328q.quick_links_widget_utility_payments, i2, i3, i4));
            Intent intent = new Intent(context, QrScannerActivity.class);
            intent.setAction("ACTION_OPEN_FROM_WIDGET");
            intent.setFlags(268468224);
            remoteViews.setOnClickPendingIntent(C10322k.qr_pay_button, PendingIntent.getActivity(context, 0, intent, 301989888));
            Intent intent2 = new Intent(context, PaymentFormActivity.class);
            intent2.setAction("ACTION_OPEN_FROM_WIDGET");
            intent2.putExtra("PAYMENT_SERVICE_ID", "bog-comp-mobilepayments");
            intent2.setFlags(268468224);
            remoteViews.setOnClickPendingIntent(C10322k.mobile_topup_button, PendingIntent.getActivity(context, 0, intent2, 301989888));
            Intent intent3 = new Intent(context, ProviderListActivity.class);
            intent3.setAction("ACTION_OPEN_FROM_WIDGET");
            intent3.putExtra("CATEGORY_PROVIDER_SERVICE_ID", "category.utility.key");
            intent3.setFlags(268468224);
            remoteViews.setOnClickPendingIntent(C10322k.utility_payment_button, PendingIntent.getActivity(context, 0, intent3, 301989888));
            Intent intent4 = new Intent(context, MainActivity.class);
            intent4.setAction("ACTION_OPEN_FROM_WIDGET");
            intent4.putExtra("QUICK_LINKS_OPEN_TRANSFERS", true);
            intent4.setFlags(268468224);
            remoteViews.setOnClickPendingIntent(C10322k.f28882py, PendingIntent.getActivity(context, 0, intent4, 301989888));
            instance.updateAppWidget(updateAppWidget, remoteViews);
        }
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, QuickLinksWidgetProvider.class));
        if (intent.getExtras() != null && intent.getExtras().containsKey("appWidgetIds")) {
            appWidgetIds = intent.getExtras().getIntArray("appWidgetIds");
        }
        Log.d("QuickLinksWidget", ">> onReceiver: " + action);
        if ("ge.bog.mobilebank.ACTION_LOCALE_CHANGED".equals(action)) {
            mo87812a(context, appWidgetIds);
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        mo87812a(context, iArr);
    }
}
