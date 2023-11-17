package com.threatmetrix.TrustDefender;

import android.content.Context;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.TelephonyManager;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11914j;
import com.threatmetrix.TrustDefender.C11969r1;
import java.util.List;
import java.util.Map;

/* renamed from: com.threatmetrix.TrustDefender.v1 */
public abstract class C12001v1 {

    /* renamed from: a */
    private static final String f35340a = C11907h.m43615j(C12001v1.class);

    /* renamed from: com.threatmetrix.TrustDefender.v1$a */
    public static /* synthetic */ class C12002a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35341a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.threatmetrix.TrustDefender.j$b[] r0 = com.threatmetrix.TrustDefender.C11914j.C11916b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35341a = r0
                com.threatmetrix.TrustDefender.j$b r1 = com.threatmetrix.TrustDefender.C11914j.C11916b.WCDMA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35341a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.threatmetrix.TrustDefender.j$b r1 = com.threatmetrix.TrustDefender.C11914j.C11916b.GSM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35341a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.threatmetrix.TrustDefender.j$b r1 = com.threatmetrix.TrustDefender.C11914j.C11916b.LTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35341a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.threatmetrix.TrustDefender.j$b r1 = com.threatmetrix.TrustDefender.C11914j.C11916b.CDMA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C12001v1.C12002a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static void m44090a(CellSignalStrength cellSignalStrength, String str, Map map) {
        if (cellSignalStrength.getAsuLevel() != 99) {
            map.put("sl_ASU", String.valueOf(cellSignalStrength.getAsuLevel()));
        }
        map.put("ss_dBm", String.valueOf(cellSignalStrength.getDbm()));
        map.put("sl_int", String.valueOf(cellSignalStrength.getLevel()));
        map.put("cii", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0015 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map m44091b(android.content.Context r5) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.List r5 = m44094e(r5)
            if (r5 == 0) goto L_0x0086
            int r1 = r5.size()
            if (r1 <= 0) goto L_0x0086
            java.util.Iterator r5 = r5.iterator()
        L_0x0015:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0086
            java.lang.Object r1 = r5.next()
            android.telephony.CellInfo r1 = (android.telephony.CellInfo) r1
            boolean r2 = r1.isRegistered()
            if (r2 == 0) goto L_0x0015
            int[] r2 = com.threatmetrix.TrustDefender.C12001v1.C12002a.f35341a
            com.threatmetrix.TrustDefender.j$b r3 = m44096g(r1)
            int r3 = r3.ordinal()
            r2 = r2[r3]
            r3 = 1
            r4 = 3
            if (r2 == r3) goto L_0x006d
            r3 = 2
            if (r2 == r3) goto L_0x005e
            if (r2 == r4) goto L_0x004f
            r3 = 4
            if (r2 == r3) goto L_0x0040
            goto L_0x007e
        L_0x0040:
            android.telephony.CellInfoCdma r1 = (android.telephony.CellInfoCdma) r1
            android.telephony.CellSignalStrengthCdma r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityCdma r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
            goto L_0x007b
        L_0x004f:
            android.telephony.CellInfoLte r1 = (android.telephony.CellInfoLte) r1
            android.telephony.CellSignalStrengthLte r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityLte r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
            goto L_0x007b
        L_0x005e:
            android.telephony.CellInfoGsm r1 = (android.telephony.CellInfoGsm) r1
            android.telephony.CellSignalStrengthGsm r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityGsm r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
            goto L_0x007b
        L_0x006d:
            android.telephony.CellInfoWcdma r1 = (android.telephony.CellInfoWcdma) r1
            android.telephony.CellSignalStrengthWcdma r2 = r1.getCellSignalStrength()
            android.telephony.CellIdentityWcdma r1 = r1.getCellIdentity()
            java.lang.String r1 = r1.toString()
        L_0x007b:
            m44090a(r2, r1, r0)
        L_0x007e:
            int r1 = r0.size()
            if (r1 >= r4) goto L_0x0015
            r5 = 0
            return r5
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C12001v1.m44091b(android.content.Context):java.util.Map");
    }

    /* renamed from: c */
    public static String m44092c(Context context) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        StringBuilder sb = new StringBuilder();
        List<CellInfo> e = m44094e(context);
        C11914j.C11916b bVar = C11914j.C11916b.LTE;
        if (e != null && e.size() > 0) {
            boolean z2 = true;
            for (CellInfo cellInfo : e) {
                if (cellInfo.isRegistered()) {
                    C11914j.C11916b g = m44096g(cellInfo);
                    if (z2) {
                        z = false;
                    } else if (bVar.mo31956a() > g.mo31956a()) {
                        z = z2;
                    }
                    int i5 = C12002a.f35341a[g.ordinal()];
                    if (i5 == 1) {
                        CellIdentityWcdma cellIdentity = ((CellInfoWcdma) cellInfo).getCellIdentity();
                        i4 = cellIdentity.getCid();
                        i2 = cellIdentity.getMcc();
                        i3 = cellIdentity.getMnc();
                        i = cellIdentity.getLac();
                    } else if (i5 == 2) {
                        CellIdentityGsm cellIdentity2 = ((CellInfoGsm) cellInfo).getCellIdentity();
                        i4 = cellIdentity2.getCid();
                        i2 = cellIdentity2.getMcc();
                        i3 = cellIdentity2.getMnc();
                        i = cellIdentity2.getLac();
                    } else if (i5 != 3) {
                        if (i5 == 4) {
                            CellIdentityCdma cellIdentity3 = ((CellInfoCdma) cellInfo).getCellIdentity();
                            i4 = cellIdentity3.getBasestationId();
                            i3 = cellIdentity3.getSystemId();
                            i = cellIdentity3.getNetworkId();
                            i2 = -1;
                        }
                        bVar = g;
                        z2 = z;
                    } else {
                        CellIdentityLte cellIdentity4 = ((CellInfoLte) cellInfo).getCellIdentity();
                        i4 = cellIdentity4.getCi();
                        i2 = cellIdentity4.getMcc();
                        i3 = cellIdentity4.getMnc();
                        i = cellIdentity4.getTac();
                    }
                    m44093d(g, i4, i3, i2, i, sb);
                    bVar = g;
                    z2 = z;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static void m44093d(C11914j.C11916b bVar, int i, int i2, int i3, int i4, StringBuilder sb) {
        if (m44095f(i, i2, i3, i4)) {
            sb.append(bVar);
            sb.append(":");
            if (i != -1) {
                sb.append(i);
                sb.append(":");
            }
            if (i3 != -1) {
                sb.append(i3);
                sb.append(":");
            }
            if (i2 != -1) {
                sb.append(i2);
                sb.append(":");
            }
            if (i4 != -1) {
                sb.append(i4);
            }
        }
    }

    /* renamed from: e */
    private static List m44094e(Context context) {
        if (!C11969r1.C11970a.m43943i()) {
            return null;
        }
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                return null;
            }
            return ((TelephonyManager) systemService).getAllCellInfo();
        } catch (SecurityException e) {
            C11907h.C11908a.m43628f(f35340a, "User refuse granting permission {}", e.toString());
            C12014y0.m44139c(e);
            return null;
        } catch (Exception e2) {
            C11907h.m43607b(f35340a, e2.toString());
            return null;
        }
    }

    /* renamed from: f */
    private static boolean m44095f(int i, int i2, int i3, int i4) {
        return (i == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE || i4 == Integer.MAX_VALUE) ? false : true;
    }

    /* renamed from: g */
    private static C11914j.C11916b m44096g(CellInfo cellInfo) {
        return (!C11969r1.C11970a.m43937c() || !(cellInfo instanceof CellInfoWcdma)) ? (!C11969r1.C11970a.m43939e() || !(cellInfo instanceof CellInfoGsm)) ? (!C11969r1.C11970a.m43942h() || !(cellInfo instanceof CellInfoLte)) ? (!C11969r1.C11970a.m43945k() || !(cellInfo instanceof CellInfoCdma)) ? C11914j.C11916b.UNKOWN : C11914j.C11916b.CDMA : C11914j.C11916b.LTE : C11914j.C11916b.GSM : C11914j.C11916b.WCDMA;
    }
}
