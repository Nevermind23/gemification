package p341ge.bog.mobilebank.p975ui.widgets.atms;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import g91.C32296c1;
import g91.C32330r0;
import p183n7.C7310h;
import p341ge.bog.mobilebank.p975ui.activities.MapActivity;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10321j;
import p366bk.C10322k;
import p366bk.C10328q;
import x81.C39830a;

/* renamed from: ge.bog.mobilebank.ui.widgets.atms.ServicePointsWidgetProvider */
public class ServicePointsWidgetProvider extends AppWidgetProvider {

    /* renamed from: a */
    static Location f86534a;

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m106288b(Context context, int[] iArr, Location location) {
        if (location != null) {
            f86534a = location;
            mo87796d(context, iArr, false);
        }
    }

    /* renamed from: c */
    private void m106289c(Context context, int[] iArr, boolean z) {
        if ((z || f86534a == null) && C32330r0.m95338m(context, "android.permission.ACCESS_FINE_LOCATION")) {
            C7310h.m27978a(context).mo13979A().mo24864i(new C39830a(this, context, iArr));
        }
    }

    /* renamed from: d */
    public void mo87796d(Context context, int[] iArr, boolean z) {
        int i;
        int i2;
        Context context2 = context;
        AppWidgetManager instance = AppWidgetManager.getInstance(context);
        for (int i3 : iArr) {
            Bundle appWidgetOptions = instance.getAppWidgetOptions(i3);
            int k = C32296c1.m95151k(appWidgetOptions);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C32296c1.m95150j(k));
            int i4 = C10322k.f28736Gc;
            remoteViews.setTextViewText(i4, context2.getString(C10328q.common_text_empty_list));
            if (k == 1) {
                i = C10328q.app_widget_atms_label_short;
            } else {
                i = C10328q.main_activity_widget_atms;
            }
            int i5 = C10319h.service_centers_lbl_txt_size;
            int i6 = C10318g.dark_text_color_333;
            remoteViews.setImageViewBitmap(C10322k.service_centers_label, C32296c1.m95145e(context2, i, i5, i6, C10321j.f28706b));
            if (k != 1) {
                remoteViews.setImageViewBitmap(C10322k.address_lbl, C32296c1.m95145e(context2, C10328q.f28921B1, C10319h.service_centers_widget_addrss_lbl_txt_size, i6, C10321j.bog_headline_medium));
            }
            remoteViews.setImageViewBitmap(C10322k.distance_lbl, C32296c1.m95145e(context2, C10328q.widget_atm_distance_label, C10319h.service_centers_widget_addrss_lbl_txt_size, i6, C10321j.bog_headline_medium));
            int i7 = C10322k.f28753Ir;
            int i8 = 8;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            remoteViews.setViewVisibility(i7, i2);
            int i9 = C10322k.refresh_progress;
            if (z) {
                i8 = 0;
            }
            remoteViews.setViewVisibility(i9, i8);
            Intent intent = new Intent(context2, ServicePointsWidgetProvider.class);
            intent.setAction("ACTION_REFRESH_SERVICE_POINTS");
            intent.putExtra("appWidgetId", i3);
            remoteViews.setOnClickPendingIntent(i7, PendingIntent.getBroadcast(context2, i3, intent, 167772160));
            Intent intent2 = new Intent(context2, ServicePointsWidgetService.class);
            C32296c1.m95152l(intent2, appWidgetOptions);
            intent2.setAction("widgetId-" + i3 + "-widgetSize-" + k);
            intent2.putExtra("appWidgetId", i3);
            intent2.putExtra("widget_size", k);
            intent2.setData(Uri.parse(intent2.toUri(1)));
            int i12 = C10322k.service_centers_list;
            remoteViews.setRemoteAdapter(i12, intent2);
            remoteViews.setEmptyView(i12, i4);
            Intent intent3 = new Intent(context2, MapActivity.class);
            intent3.setAction("ACTION_OPEN_FROM_WIDGET");
            remoteViews.setPendingIntentTemplate(i12, PendingIntent.getActivity(context2, 0, intent3, 33554432));
            instance.updateAppWidget(i3, remoteViews);
            instance.notifyAppWidgetViewDataChanged(i3, i12);
        }
    }

    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        int[] iArr = {i};
        m106289c(context, iArr, false);
        mo87796d(context, iArr, false);
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        int[] appWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, ServicePointsWidgetProvider.class));
        if (intent.getExtras() != null && intent.getExtras().containsKey("appWidgetIds")) {
            appWidgetIds = intent.getExtras().getIntArray("appWidgetIds");
        }
        action.hashCode();
        char c = 65535;
        switch (action.hashCode()) {
            case -1633589809:
                if (action.equals("ge.bog.mobilebank.services.LOCATION_UPDATE")) {
                    c = 0;
                    break;
                }
                break;
            case -3736692:
                if (action.equals("ge.bog.mobilebank.ACTION_LOCALE_CHANGED")) {
                    c = 1;
                    break;
                }
                break;
            case 863702873:
                if (action.equals("ge.bog.mobilebank.model.map.ACTION_MAP_OBJECTS_LOADED")) {
                    c = 2;
                    break;
                }
                break;
            case 956550138:
                if (action.equals("ACTION_REFRESH_SERVICE_POINTS")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                f86534a = (Location) intent.getParcelableExtra("CURRENT_LOCATION");
                mo87796d(context, appWidgetIds, false);
                return;
            case 1:
            case 2:
                mo87796d(context, appWidgetIds, false);
                m106289c(context, appWidgetIds, false);
                return;
            case 3:
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    mo87796d(context, new int[]{extras.getInt("appWidgetId")}, true);
                }
                m106289c(context, appWidgetIds, true);
                return;
            default:
                return;
        }
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        m106289c(context, iArr, true);
        mo87796d(context, iArr, false);
    }
}
