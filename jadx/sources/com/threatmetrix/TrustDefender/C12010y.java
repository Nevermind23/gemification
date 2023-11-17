package com.threatmetrix.TrustDefender;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.os.Looper;
import com.github.mikephil.charting.utils.Utils;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11927l1;
import com.threatmetrix.TrustDefender.C11969r1;
import com.threatmetrix.TrustDefender.peppep;
import p585re.C17584a;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.y */
public class C12010y implements peppep.C11956j {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f35361n = C11907h.m43615j(C12010y.class);

    /* renamed from: a */
    private int f35362a;

    /* renamed from: b */
    private long f35363b;

    /* renamed from: c */
    private long f35364c;

    /* renamed from: d */
    private boolean f35365d = false;

    /* renamed from: e */
    private boolean f35366e = false;

    /* renamed from: f */
    private boolean f35367f = false;

    /* renamed from: g */
    private Context f35368g;

    /* renamed from: h */
    private C11927l1.C11928a f35369h;

    /* renamed from: i */
    private LocationManager f35370i;

    /* renamed from: j */
    private C11919j1 f35371j;

    /* renamed from: k */
    private C11884c0 f35372k;

    /* renamed from: l */
    private C12013c f35373l = C12013c.NONE;

    /* renamed from: m */
    private final HandlerThread f35374m = new HandlerThread("THMLocationHandler");

    /* renamed from: com.threatmetrix.TrustDefender.y$a */
    public class C12011a extends BroadcastReceiver {
        public C12011a() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_LOW".equals(intent.getAction())) {
                C12010y.this.mo32015c();
            } else {
                C12010y.this.mo32103p();
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.y$b */
    public class C12012b extends BroadcastReceiver {
        public C12012b() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) && C11969r1.C11971b.m43950e()) {
                try {
                    Object systemService = context.getSystemService("connectivity");
                    if (systemService instanceof ConnectivityManager) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                        if (!(activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting())) {
                            C12010y.this.mo32015c();
                        } else {
                            C12010y.this.mo32103p();
                        }
                    }
                } catch (SecurityException e) {
                    C12014y0.m44141e(e, C12010y.f35361n);
                } catch (Exception e2) {
                    C11907h.m43607b(C12010y.f35361n, e2.toString());
                }
            }
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.y$c */
    public private enum C12013c {
        NONE,
        FINE,
        COARSE
    }

    /* renamed from: f */
    private Location m44121f() {
        String str = f35361n;
        C11907h.m43607b(str, "gll");
        C11907h.C11908a.m43624b(str, "Attempting to find an existing location to prime things");
        LocationManager locationManager = this.f35370i;
        Location location = null;
        if (locationManager == null) {
            return null;
        }
        try {
            long j = 0;
            float f = Float.MAX_VALUE;
            for (String next : locationManager.getAllProviders()) {
                if (next == null) {
                    C11907h.C11908a.m43623a(f35361n, "null provider (wut?)");
                } else {
                    String str2 = f35361n;
                    C11907h.C11908a.m43624b(str2, "getLastLocation() : " + next);
                    if (this.f35373l != C12013c.COARSE || next.equals("network")) {
                        Location lastKnownLocation = locationManager.getLastKnownLocation(next);
                        if (lastKnownLocation != null) {
                            C11907h.m43607b(str2, "gllnn");
                            C11907h.C11908a.m43624b(str2, "getLastLocation() : " + lastKnownLocation.getProvider() + ":" + lastKnownLocation.getLatitude() + ":" + lastKnownLocation.getLongitude() + ":" + lastKnownLocation.getAccuracy());
                            float accuracy = lastKnownLocation.getAccuracy();
                            long time = lastKnownLocation.getTime();
                            long j2 = this.f35363b;
                            if (time > j2 && accuracy < f) {
                                location = lastKnownLocation;
                                f = accuracy;
                            } else if (time < j2 && f == Float.MAX_VALUE && time > j) {
                                location = lastKnownLocation;
                            }
                            j = time;
                        }
                    }
                }
            }
        } catch (SecurityException e) {
            C11907h.C11908a.m43628f(f35361n, "User refuse granting permission {}", e.toString());
            C12014y0.m44139c(e);
        } catch (Exception e2) {
            C11907h.m43607b(f35361n, e2.toString());
        }
        return location;
    }

    /* renamed from: g */
    private void m44122g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.f35368g.registerReceiver(new C12012b(), intentFilter);
        if (this.f35366e) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("android.intent.action.BATTERY_LOW");
            intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
            intentFilter2.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            this.f35368g.registerReceiver(new C12011a(), intentFilter2);
        }
    }

    /* renamed from: h */
    private void m44123h(Context context, long j, long j2, int i) {
        Context context2 = context;
        if (!C11969r1.C11982m.m44000b()) {
            this.f35367f = false;
        }
        if (this.f35367f) {
            this.f35374m.start();
            this.f35368g = context2;
            this.f35363b = j;
            this.f35364c = j2;
            this.f35362a = i;
            this.f35371j = new C11919j1();
            C11969r1.C11975f fVar = new C11969r1.C11975f(context);
            if (fVar.mo32041c("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName())) {
                this.f35373l = C12013c.COARSE;
            }
            if (fVar.mo32041c("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
                this.f35373l = C12013c.FINE;
            }
            try {
                C11884c0 c0Var = new C11884c0();
                this.f35372k = c0Var;
                boolean k = c0Var.mo31931k(this.f35368g, this.f35364c, this.f35363b, this.f35362a, this.f35371j, this, this.f35374m);
                m44127n();
                if (k || m44125j()) {
                    m44122g();
                }
            } catch (SecurityException e) {
                C12014y0.m44141e(e, f35361n);
                this.f35367f = false;
            } catch (Exception e2) {
                C11907h.m43607b(f35361n, e2.toString());
                this.f35367f = false;
            }
        }
    }

    /* renamed from: j */
    private boolean m44125j() {
        return (this.f35370i == null || this.f35371j == null) ? false : true;
    }

    /* renamed from: l */
    private boolean m44126l(LocationManager locationManager, String str, long j, Criteria criteria, Looper looper) {
        if (looper == null) {
            return false;
        }
        if (str != null) {
            try {
                locationManager.requestLocationUpdates(str, this.f35364c, (float) j, this.f35371j, looper);
            } catch (IllegalArgumentException e) {
                String str2 = f35361n;
                C11907h.m43610e(str2, "Failed to register locationServices: " + e.toString());
                return false;
            } catch (SecurityException e2) {
                String str3 = f35361n;
                C11907h.m43610e(str3, "Failed to register locationServices: " + e2.toString());
                C12014y0.m44139c(e2);
                return false;
            }
        } else {
            locationManager.requestLocationUpdates(this.f35364c, (float) j, criteria, this.f35371j, looper);
        }
        String str4 = f35361n;
        C11907h.m43607b(str4, "rlu");
        C11907h.C11908a.m43624b(str4, "GenericLocationManager created: " + locationManager.getBestProvider(criteria, true));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0114, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0115, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        com.threatmetrix.TrustDefender.C11907h.m43607b(f35361n, r0.toString());
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012c, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011f A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x0044] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m44127n() {
        /*
            r16 = this;
            r8 = r16
            boolean r0 = r8.f35367f
            if (r0 == 0) goto L_0x0134
            com.threatmetrix.TrustDefender.j1 r0 = r8.f35371j
            if (r0 == 0) goto L_0x0134
            boolean r0 = r16.m44128o()
            if (r0 == 0) goto L_0x0012
            goto L_0x0134
        L_0x0012:
            java.lang.String r0 = f35361n
            java.lang.String r1 = "rls"
            com.threatmetrix.TrustDefender.C11907h.m43607b(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "registerLocationServices: low power "
            r1.append(r2)
            long r2 = r8.f35363b
            r1.append(r2)
            java.lang.String r2 = " high power "
            r1.append(r2)
            long r2 = r8.f35364c
            r1.append(r2)
            java.lang.String r2 = " with accuracy "
            r1.append(r2)
            int r2 = r8.f35362a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43631i(r0, r1)
            r9 = 0
            android.content.Context r1 = r8.f35368g     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r2 = "location"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            boolean r2 = r1 instanceof android.location.LocationManager     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            if (r2 != 0) goto L_0x0056
            java.lang.String r1 = "Location Manager is not available"
            com.threatmetrix.TrustDefender.C11907h.m43609d(r0, r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            return
        L_0x0056:
            r10 = r1
            android.location.LocationManager r10 = (android.location.LocationManager) r10     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r8.f35370i = r10     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            com.threatmetrix.TrustDefender.j1 r1 = r8.f35371j     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r10.removeUpdates(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r11 = 0
            android.location.Criteria r13 = new android.location.Criteria     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.<init>()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            int r1 = r8.f35362a     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.setAccuracy(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r1 = 0
            r13.setAltitudeRequired(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.setBearingAccuracy(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.setCostAllowed(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.setSpeedAccuracy(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.setSpeedRequired(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r13.setVerticalAccuracy(r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            android.location.Criteria r6 = new android.location.Criteria     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r6.<init>()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r2 = 1
            r6.setPowerRequirement(r2)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r3 = 2
            r6.setAccuracy(r3)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r14 = r10.getBestProvider(r13, r2)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            if (r14 == 0) goto L_0x00a6
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r3.<init>()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r4 = "fine provider: "
            r3.append(r4)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r3.append(r14)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r3 = r3.toString()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r0, r3)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
        L_0x00a6:
            java.lang.String r3 = r10.getBestProvider(r6, r2)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            if (r3 == 0) goto L_0x00c0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r2.<init>()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r4 = "course provider: "
            r2.append(r4)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r2.append(r3)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r2 = r2.toString()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r0, r2)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
        L_0x00c0:
            if (r14 != 0) goto L_0x00cc
            if (r3 != 0) goto L_0x00cc
            r8.f35370i = r9     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            java.lang.String r1 = "Unable to find location provider, possibly incorrect permissions. Check that android.permission.ACCESS_COARSE_LOCATION or android.permission.ACCESS_FINE_LOCATION is set"
            com.threatmetrix.TrustDefender.C11907h.m43609d(r0, r1)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            return
        L_0x00cc:
            android.location.Location r0 = r16.m44121f()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            if (r14 == 0) goto L_0x00da
            if (r3 == 0) goto L_0x00da
            boolean r2 = r14.equals(r3)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r15 = r2
            goto L_0x00db
        L_0x00da:
            r15 = r1
        L_0x00db:
            if (r0 == 0) goto L_0x00e2
            com.threatmetrix.TrustDefender.j1 r2 = r8.f35371j     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r2.onLocationChanged(r0)     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
        L_0x00e2:
            com.threatmetrix.TrustDefender.y$c r0 = r8.f35373l     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            com.threatmetrix.TrustDefender.y$c r7 = com.threatmetrix.TrustDefender.C12010y.C12013c.NONE     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            if (r0 == r7) goto L_0x00fa
            android.os.HandlerThread r0 = r8.f35374m     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ SecurityException -> 0x012b, Exception -> 0x011f }
            r4 = 0
            r1 = r16
            r2 = r10
            r9 = r7
            r7 = r0
            boolean r1 = r1.m44126l(r2, r3, r4, r6, r7)     // Catch:{ SecurityException -> 0x0114, Exception -> 0x011f }
            goto L_0x00fb
        L_0x00fa:
            r9 = r7
        L_0x00fb:
            if (r15 != 0) goto L_0x0117
            if (r1 != 0) goto L_0x0117
            com.threatmetrix.TrustDefender.y$c r0 = r8.f35373l     // Catch:{ SecurityException -> 0x0114, Exception -> 0x011f }
            if (r0 == r9) goto L_0x0117
            android.os.HandlerThread r0 = r8.f35374m     // Catch:{ SecurityException -> 0x0114, Exception -> 0x011f }
            android.os.Looper r7 = r0.getLooper()     // Catch:{ SecurityException -> 0x0114, Exception -> 0x011f }
            r1 = r16
            r2 = r10
            r3 = r14
            r4 = r11
            r6 = r13
            boolean r1 = r1.m44126l(r2, r3, r4, r6, r7)     // Catch:{ SecurityException -> 0x0114, Exception -> 0x011f }
            goto L_0x0117
        L_0x0114:
            r0 = move-exception
            r1 = 0
            goto L_0x012d
        L_0x0117:
            if (r1 != 0) goto L_0x0134
            r1 = 0
            r8.f35370i = r1     // Catch:{ SecurityException -> 0x011d, Exception -> 0x011f }
            goto L_0x0134
        L_0x011d:
            r0 = move-exception
            goto L_0x012d
        L_0x011f:
            r0 = move-exception
            java.lang.String r1 = f35361n
            java.lang.String r0 = r0.toString()
            com.threatmetrix.TrustDefender.C11907h.m43607b(r1, r0)
            r1 = 0
            goto L_0x0132
        L_0x012b:
            r0 = move-exception
            r1 = r9
        L_0x012d:
            java.lang.String r2 = f35361n
            com.threatmetrix.TrustDefender.C12014y0.m44141e(r0, r2)
        L_0x0132:
            r8.f35370i = r1
        L_0x0134:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C12010y.m44127n():void");
    }

    /* renamed from: o */
    private boolean m44128o() {
        C11884c0 c0Var = this.f35372k;
        return c0Var != null && c0Var.mo31930f();
    }

    /* renamed from: a */
    public void mo32013a(C17584a aVar) {
        Context context;
        mo32101k(aVar.mo45119d());
        mo32100e(aVar.mo45126k());
        long n = aVar.mo45129n();
        long h = aVar.mo45123h();
        int c = aVar.mo45118c();
        C17603t o = aVar.mo45130o();
        if (o != null && (context = o.f49314a) != null) {
            m44123h(context, n, h, c);
        }
    }

    /* renamed from: b */
    public void mo32014b(C11927l1.C11928a aVar) {
        if (aVar == null) {
            aVar = null;
        }
        this.f35369h = aVar;
    }

    /* renamed from: c */
    public void mo32015c() {
        String str;
        String str2;
        if (this.f35367f && !this.f35365d) {
            if (m44128o()) {
                this.f35372k.mo31929d(true);
                str2 = f35361n;
                str = "paused FUSED location services";
            } else {
                mo32102m();
                str2 = f35361n;
                str = "paused NON-FUSED location services";
            }
            C11907h.m43607b(str2, str);
            this.f35365d = true;
        }
    }

    /* renamed from: d */
    public C11927l1.C11928a mo32016d() {
        Location b;
        C11927l1.C11928a aVar = this.f35369h;
        if (aVar != null) {
            return aVar;
        }
        C11919j1 j1Var = this.f35371j;
        if (j1Var == null || !this.f35367f || (b = j1Var.mo31960b()) == null || (b.getLatitude() == Utils.DOUBLE_EPSILON && b.getLongitude() == Utils.DOUBLE_EPSILON)) {
            return null;
        }
        return C11914j.m43685l(b, false);
    }

    /* renamed from: e */
    public void mo32100e(boolean z) {
        this.f35366e = z;
    }

    /* renamed from: k */
    public void mo32101k(boolean z) {
        if (!C11969r1.C11982m.m43999a() || !C11969r1.C11982m.m44000b()) {
            this.f35367f = false;
        }
        this.f35367f = z;
    }

    /* renamed from: m */
    public void mo32102m() {
        LocationManager locationManager = this.f35370i;
        if (m44125j() && locationManager != null) {
            try {
                locationManager.removeUpdates(this.f35371j);
            } catch (SecurityException e) {
                C11907h.C11908a.m43628f(f35361n, "User refuse granting permission {}", e.toString());
                C12014y0.m44139c(e);
            } catch (Exception e2) {
                C11907h.m43607b(f35361n, e2.toString());
            }
        }
    }

    /* renamed from: p */
    public void mo32103p() {
        if (this.f35367f && this.f35365d) {
            if (m44128o()) {
                C11907h.m43607b(f35361n, "resuming FUSED location services");
                this.f35372k.mo31929d(false);
            } else {
                C11907h.m43607b(f35361n, "resuming NON-FUSED location services");
                m44127n();
            }
            this.f35365d = false;
        }
    }
}
