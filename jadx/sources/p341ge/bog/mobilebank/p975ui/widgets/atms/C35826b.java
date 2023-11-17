package p341ge.bog.mobilebank.p975ui.widgets.atms;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.map.MapObject;
import p341ge.bog.mobilebank.model.map.MapObjectWrapper;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p530nf.C16919b;

/* renamed from: ge.bog.mobilebank.ui.widgets.atms.b */
public class C35826b implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a */
    private List f86535a;

    /* renamed from: b */
    private PreferencesApiManager f86536b;

    /* renamed from: c */
    private Client f86537c;

    /* renamed from: d */
    private int f86538d;

    /* renamed from: e */
    private int f86539e;

    /* renamed from: f */
    private Context f86540f;

    /* renamed from: ge.bog.mobilebank.ui.widgets.atms.b$a */
    class C35827a implements Comparator {

        /* renamed from: d */
        final /* synthetic */ Location f86541d;

        C35827a(Location location) {
            this.f86541d = location;
        }

        /* renamed from: a */
        public int compare(MapObject mapObject, MapObject mapObject2) {
            Location location = new Location("");
            Location location2 = new Location("");
            location.setLongitude(mapObject.getLongitude());
            location.setLatitude(mapObject.getLatitude());
            location2.setLongitude(mapObject2.getLongitude());
            location2.setLatitude(mapObject2.getLatitude());
            return Float.compare(location.distanceTo(this.f86541d), location2.distanceTo(this.f86541d));
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.widgets.atms.b$b */
    interface C35828b {
        /* renamed from: a */
        PreferencesApiManager mo32851a();

        /* renamed from: c */
        Client mo32853c();
    }

    public C35826b(Context context, Intent intent) {
        this.f86540f = context;
        this.f86538d = intent.getIntExtra("widget_size", 3);
        this.f86539e = intent.getIntExtra("WIDGET_WIDTH", 0);
    }

    public int getCount() {
        return this.f86535a.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.widget.RemoteViews getViewAt(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.List r0 = r11.f86535a     // Catch:{ all -> 0x0144 }
            int r0 = r0.size()     // Catch:{ all -> 0x0144 }
            if (r0 <= 0) goto L_0x0141
            java.util.List r0 = r11.f86535a     // Catch:{ all -> 0x0144 }
            java.lang.Object r12 = r0.get(r12)     // Catch:{ all -> 0x0144 }
            ge.bog.mobilebank.model.map.MapObject r12 = (p341ge.bog.mobilebank.model.map.MapObject) r12     // Catch:{ all -> 0x0144 }
            android.widget.RemoteViews r0 = new android.widget.RemoteViews     // Catch:{ all -> 0x0144 }
            android.content.Context r1 = r11.f86540f     // Catch:{ all -> 0x0144 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0144 }
            int r2 = r11.f86538d     // Catch:{ all -> 0x0144 }
            int r2 = g91.C32296c1.m95149i(r2)     // Catch:{ all -> 0x0144 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0144 }
            int r1 = p366bk.C10322k.rounded_container     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "setBackgroundResource"
            int r3 = p366bk.C10320i.widget_service_points_icon_background     // Catch:{ all -> 0x0144 }
            r0.setInt(r1, r2, r3)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = r12.getObjectType()     // Catch:{ all -> 0x0144 }
            r3 = 1
            if (r2 == 0) goto L_0x00e6
            java.lang.String r2 = r12.getObjectType()     // Catch:{ all -> 0x0144 }
            int r4 = r2.hashCode()     // Catch:{ all -> 0x0144 }
            r5 = 2640(0xa50, float:3.7E-42)
            r6 = 0
            r7 = -1
            r8 = 2
            if (r4 == r5) goto L_0x0060
            r5 = 65146(0xfe7a, float:9.1289E-41)
            if (r4 == r5) goto L_0x0056
            r5 = 79014(0x134a6, float:1.10722E-40)
            if (r4 == r5) goto L_0x004c
            goto L_0x006a
        L_0x004c:
            java.lang.String r4 = "PBX"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x006a
            r2 = r8
            goto L_0x006b
        L_0x0056:
            java.lang.String r4 = "ATM"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x006a
            r2 = r3
            goto L_0x006b
        L_0x0060:
            java.lang.String r4 = "SC"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x006a
            r2 = r6
            goto L_0x006b
        L_0x006a:
            r2 = r7
        L_0x006b:
            if (r2 == 0) goto L_0x0085
            if (r2 == r3) goto L_0x007c
            if (r2 == r8) goto L_0x0073
            goto L_0x00e6
        L_0x0073:
            int r1 = p366bk.C10322k.service_point_icon     // Catch:{ all -> 0x0144 }
            int r2 = p366bk.C10320i.ic_paybox     // Catch:{ all -> 0x0144 }
            r0.setImageViewResource(r1, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x00e6
        L_0x007c:
            int r1 = p366bk.C10322k.service_point_icon     // Catch:{ all -> 0x0144 }
            int r2 = p366bk.C10320i.ic_atm     // Catch:{ all -> 0x0144 }
            r0.setImageViewResource(r1, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x00e6
        L_0x0085:
            java.lang.String r2 = r12.getObjectSubType()     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x00e6
            java.lang.String r2 = r12.getObjectSubType()     // Catch:{ all -> 0x0144 }
            int r4 = r2.hashCode()     // Catch:{ all -> 0x0144 }
            r5 = 65946(0x1019a, float:9.241E-41)
            if (r4 == r5) goto L_0x00b6
            r5 = 69117(0x10dfd, float:9.6854E-41)
            if (r4 == r5) goto L_0x00ac
            r5 = 82288(0x14170, float:1.1531E-40)
            if (r4 == r5) goto L_0x00a3
            goto L_0x00c0
        L_0x00a3:
            java.lang.String r4 = "SOL"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r4 = "EXP"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x00c0
            r6 = r8
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r4 = "BOG"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x00c0
            r6 = r3
            goto L_0x00c1
        L_0x00c0:
            r6 = r7
        L_0x00c1:
            if (r6 == 0) goto L_0x00d8
            if (r6 == r3) goto L_0x00d0
            if (r6 == r8) goto L_0x00c8
            goto L_0x00e6
        L_0x00c8:
            int r1 = p366bk.C10322k.service_point_icon     // Catch:{ all -> 0x0144 }
            int r2 = p366bk.C10320i.ic_express     // Catch:{ all -> 0x0144 }
            r0.setImageViewResource(r1, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x00e6
        L_0x00d0:
            int r1 = p366bk.C10322k.service_point_icon     // Catch:{ all -> 0x0144 }
            int r2 = p366bk.C10320i.ic_sc     // Catch:{ all -> 0x0144 }
            r0.setImageViewResource(r1, r2)     // Catch:{ all -> 0x0144 }
            goto L_0x00e6
        L_0x00d8:
            int r2 = p366bk.C10322k.service_point_icon     // Catch:{ all -> 0x0144 }
            int r4 = p366bk.C10320i.ic_solo     // Catch:{ all -> 0x0144 }
            r0.setImageViewResource(r2, r4)     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "setBackgroundResource"
            int r4 = p366bk.C10320i.widget_service_points_icon_solo_background     // Catch:{ all -> 0x0144 }
            r0.setInt(r1, r2, r4)     // Catch:{ all -> 0x0144 }
        L_0x00e6:
            java.lang.String r1 = ""
            android.location.Location r2 = p341ge.bog.mobilebank.p975ui.widgets.atms.ServicePointsWidgetProvider.f86534a     // Catch:{ all -> 0x0144 }
            if (r2 == 0) goto L_0x010a
            android.location.Location r1 = new android.location.Location     // Catch:{ all -> 0x0144 }
            java.lang.String r4 = ""
            r1.<init>(r4)     // Catch:{ all -> 0x0144 }
            double r4 = r12.getLongitude()     // Catch:{ all -> 0x0144 }
            r1.setLongitude(r4)     // Catch:{ all -> 0x0144 }
            double r4 = r12.getLatitude()     // Catch:{ all -> 0x0144 }
            r1.setLatitude(r4)     // Catch:{ all -> 0x0144 }
            float r1 = r2.distanceTo(r1)     // Catch:{ all -> 0x0144 }
            int r1 = (int) r1     // Catch:{ all -> 0x0144 }
            java.lang.String r1 = g91.C32359z0.m95551V(r1)     // Catch:{ all -> 0x0144 }
        L_0x010a:
            int r2 = p366bk.C10322k.distance     // Catch:{ all -> 0x0144 }
            r0.setTextViewText(r2, r1)     // Catch:{ all -> 0x0144 }
            int r1 = r11.f86538d     // Catch:{ all -> 0x0144 }
            if (r1 == r3) goto L_0x012c
            android.content.Context r4 = r11.f86540f     // Catch:{ all -> 0x0144 }
            java.lang.String r5 = r12.getAddress()     // Catch:{ all -> 0x0144 }
            int r6 = p366bk.C10319h.service_center_address_txt_size     // Catch:{ all -> 0x0144 }
            int r7 = p366bk.C10318g.dark_text_color_333     // Catch:{ all -> 0x0144 }
            int r8 = p366bk.C10321j.f28707e     // Catch:{ all -> 0x0144 }
            int r9 = r11.f86538d     // Catch:{ all -> 0x0144 }
            int r10 = r11.f86539e     // Catch:{ all -> 0x0144 }
            android.graphics.Bitmap r1 = g91.C32296c1.m95148h(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0144 }
            int r2 = p366bk.C10322k.address     // Catch:{ all -> 0x0144 }
            r0.setImageViewBitmap(r2, r1)     // Catch:{ all -> 0x0144 }
        L_0x012c:
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0144 }
            r1.<init>()     // Catch:{ all -> 0x0144 }
            java.lang.String r2 = "MAP_OBJECT_KEY"
            java.lang.String r12 = r12.getObjectKey()     // Catch:{ all -> 0x0144 }
            r1.putExtra(r2, r12)     // Catch:{ all -> 0x0144 }
            int r12 = p366bk.C10322k.service_point_item     // Catch:{ all -> 0x0144 }
            r0.setOnClickFillInIntent(r12, r1)     // Catch:{ all -> 0x0144 }
            monitor-exit(r11)
            return r0
        L_0x0141:
            monitor-exit(r11)
            r12 = 0
            return r12
        L_0x0144:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.widgets.atms.C35826b.getViewAt(int):android.widget.RemoteViews");
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void onCreate() {
        Log.d("SrvcPntViewsFactory", "###>>> onCreate");
        C35828b bVar = (C35828b) C16919b.m59518a(this.f86540f, C35828b.class);
        this.f86537c = bVar.mo32853c();
        this.f86536b = bVar.mo32851a();
        this.f86535a = new ArrayList();
    }

    public synchronized void onDataSetChanged() {
        Log.d("SrvcPntViewsFactory", ">>> onDataSetChanged");
        this.f86535a.clear();
        MapObjectWrapper mapObjects = this.f86536b.getMapObjects();
        if (mapObjects != null) {
            ArrayList<MapObject> mapObjectsByType = mapObjects.getMapObjectsByType("SC");
            ArrayList<MapObject> mapObjectsByType2 = mapObjects.getMapObjectsByType("ATM");
            ArrayList<MapObject> mapObjectsByType3 = mapObjects.getMapObjectsByType("PBX");
            Location location = ServicePointsWidgetProvider.f86534a;
            if (location != null) {
                C35827a aVar = new C35827a(location);
                Collections.sort(mapObjectsByType, aVar);
                Collections.sort(mapObjectsByType2, aVar);
                Collections.sort(mapObjectsByType3, aVar);
            }
            this.f86535a.add(mapObjectsByType.get(0));
            this.f86535a.add(mapObjectsByType2.get(0));
            this.f86535a.add(mapObjectsByType3.get(0));
        } else {
            this.f86537c.requestMapObjects(false);
        }
    }

    public void onDestroy() {
    }
}
