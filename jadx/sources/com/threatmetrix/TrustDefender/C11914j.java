package com.threatmetrix.TrustDefender;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.os.Environment;
import android.os.Looper;
import android.os.PowerManager;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.threatmetrix.TrustDefender.C11879b0;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.C11927l1;
import com.threatmetrix.TrustDefender.C11969r1;
import com.threatmetrix.TrustDefender.C12004w0;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p585re.C17596m;
import p585re.C17599p;
import p585re.C17603t;
import p626ue.C18114a;
import p626ue.C18132g;

/* renamed from: com.threatmetrix.TrustDefender.j */
public abstract class C11914j {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f34850a = C11907h.m43615j(C11914j.class);

    /* renamed from: b */
    private static final String f34851b = C18114a.m62170f("\u0002}\u0002", 231, '*', 3);

    /* renamed from: c */
    public static final String f34852c = C18114a.m62167c("\u0017\u001e\u001d'.\u001a), (,&", 'Z', 3);

    /* renamed from: d */
    private static final String f34853d = C18114a.m62170f("$7@2-?\u0017.<9/=\u00112$*,$\u0011\u0001\u0007\u001a\u000e", 4, 210, 0);

    /* renamed from: e */
    private static final String f34854e = C18114a.m62167c("bp|)zllzwh\"hr`lqeia\u0019h\\hb]feZ_]\u000e", 184, 4);

    /* renamed from: f */
    private static final Method f34855f = C11879b0.m43531c(C11879b0.m43537i(C11879b0.C11880a.SYSTEM_PROPERTIES), C18114a.m62167c("$#3", '<', 0), String.class);

    /* renamed from: com.threatmetrix.TrustDefender.j$a */
    public static class C11915a {

        /* renamed from: a */
        public int f34856a = 0;

        /* renamed from: b */
        public int f34857b = 0;
    }

    /* renamed from: com.threatmetrix.TrustDefender.j$b */
    public enum C11916b {
        CDMA("CDMA", 3),
        GSM("GSM", 1),
        LTE("LTE", 0),
        UNKOWN(TransferForm.TRANSFER_FORM_OTHER, 99),
        WCDMA("UMTS", 2);
        

        /* renamed from: d */
        private final String f34864d;

        /* renamed from: e */
        private final int f34865e;

        private C11916b(String str, int i) {
            this.f34864d = str;
            this.f34865e = i;
        }

        /* renamed from: a */
        public int mo31956a() {
            return this.f34865e;
        }
    }

    /* renamed from: com.threatmetrix.TrustDefender.j$c */
    public static class C11917c {
        /* renamed from: a */
        public static String m43701a(C12004w0.C12005a aVar) {
            if (aVar == null) {
                return C12004w0.f35343a;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("description", aVar.f35352d);
                if (aVar.f35353e) {
                    jSONObject.put("result", "Cloned");
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                String y = C11914j.f34850a;
                C11907h.C11908a.m43623a(y, "JSON creation failure " + e.toString());
                return C12004w0.f35344b;
            }
        }

        /* renamed from: b */
        public static C12004w0.C12005a m43702b(String str) {
            if (C11921k0.m43739v(str)) {
                return C12004w0.C12005a.COULD_NOT_CHECK;
            }
            try {
                return C12004w0.C12005a.valueOf(str.toUpperCase());
            } catch (IllegalArgumentException unused) {
                return C12004w0.C12005a.COULD_NOT_CHECK;
            }
        }

        /* renamed from: c */
        public static String m43703c(String str) {
            return m43701a(m43702b(str));
        }
    }

    /* renamed from: A */
    public static String m43650A(C17603t tVar) {
        if (!C11969r1.C11970a.m43940f() || !new C11969r1.C11975f(tVar.f49314a).mo32041c(C18114a.m62167c("=I>KG@:\u0003D8D>9BA6;9w\n\u000b\n\u000b\u0018\u0017\"\b\n\u000e\u0004\u001d\t\u000b}z\r\u0001\u0006\u0004", 145, 4), tVar.f49314a.getPackageName())) {
            return null;
        }
        String c = C12001v1.m44092c(tVar.f49314a);
        if (C11921k0.m43739v(c) && (C11969r1.C11970a.m43944j() || C11969r1.C11970a.m43938d())) {
            try {
                Object systemService = tVar.f49314a.getApplicationContext().getSystemService(C18114a.m62170f("OHPPH", 216, 5, 3));
                if (!(systemService instanceof TelephonyManager)) {
                    return null;
                }
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                CellLocation cellLocation = telephonyManager.getCellLocation();
                StringBuilder sb = new StringBuilder();
                Object obj = "";
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                    int cid = gsmCellLocation.getCid();
                    int lac = gsmCellLocation.getLac();
                    if (cid == -1 && lac == -1) {
                        return null;
                    }
                    sb.append(C18114a.m62170f("(3,\u0018", 'd', 196, 0));
                    sb.append(cid == -1 ? obj : Integer.valueOf(cid));
                    sb.append(C18114a.m62167c("qpo", 151, 2));
                    if (lac != -1) {
                        obj = Integer.valueOf(lac);
                    }
                    sb.append(obj);
                    return sb.toString();
                } else if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation();
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    int systemId = cdmaCellLocation.getSystemId();
                    int networkId = cdmaCellLocation.getNetworkId();
                    if (baseStationId == -1 && systemId == -1 && networkId == -1) {
                        return null;
                    }
                    sb.append(C18114a.m62167c("UWaVP", 9, 3));
                    sb.append(baseStationId == -1 ? obj : Integer.valueOf(baseStationId));
                    sb.append(C18114a.m62167c(";", 212, 1));
                    sb.append(systemId == -1 ? obj : Integer.valueOf(systemId));
                    sb.append(C18114a.m62170f("<", 197, '7', 1));
                    if (networkId != -1) {
                        obj = Integer.valueOf(networkId);
                    }
                    sb.append(obj);
                    return sb.toString();
                }
            } catch (SecurityException e) {
                String str = f34850a;
                C11907h.C11908a.m43624b(str, C18114a.m62170f("i\t{\n8\f\u0002\u0012\u0011\u0004?\b\u0014\u0004\u0012\u0019\u000f\u0015\u000fH\u001a\u0010\u001e\u001a\u0017\"#\u001a!!S", 'H', 179, 2) + e.getMessage());
                C12014y0.m44139c(e);
            } catch (Exception e2) {
                C11907h.C11908a.m43624b(f34850a, e2.toString());
            }
        }
        return c;
    }

    /* renamed from: B */
    public static String m43651B(long j, long j2) {
        String k = C11921k0.m43728k(j + C18114a.m62167c(AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_APPL_ID, 245, 5) + j2);
        String str = f34850a;
        C11907h.m43607b(str, C18114a.m62170f("plz", 231, 'q', 0));
        C11907h.C11908a.m43624b(str, C18114a.m62167c(" \u001f/\"4(#&\u00157%9+\u0001g", 188, 1) + k);
        return k;
    }

    /* renamed from: C */
    public static String m43652C(C17603t tVar) {
        return new C11969r1.C11977h(tVar).mo32044c();
    }

    /* renamed from: D */
    public static String m43653D(C17603t tVar) {
        return lrrlrr.m43777e(tVar.f49314a);
    }

    /* renamed from: E */
    public static List m43654E() {
        ArrayList arrayList = new ArrayList();
        File file = new File(C18114a.m62170f("%jqln`i,dnnuu2", 200, ',', 3));
        String c = C18114a.m62167c("1vuf", '|', 5);
        String[] list = file.list();
        if (list == null) {
            return arrayList;
        }
        for (String str : list) {
            if (str != null && str.endsWith(c)) {
                StringBuilder sb = new StringBuilder(str);
                arrayList.add(sb.substring(0, sb.length() - 4));
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public static long m43655F() {
        C11944p0 p0Var = new C11944p0(Environment.getDataDirectory().getPath());
        return p0Var.mo32004m() * p0Var.mo32002k();
    }

    /* renamed from: G */
    public static long m43656G(String str) {
        if (str == null) {
            C11907h.C11908a.m43624b(f34850a, C18114a.m62167c("l\u0016\u001cH\u000b\u001b\u001cL\"\u0018\u001d\u0016Q\u0019&$#V&.&'[-\u001f3(", '%', 0));
            return 0;
        }
        long o = C11996u0.m44036s().mo32082o(str);
        String str2 = f34850a;
        C11907h.C11908a.m43624b(str2, C18114a.m62170f("*SY\u0006HXY\n_UZS\u000fVca`\u0014CWkao_B]qfdrft#jtx'xj~sF", 'N', 147, 3) + str + C18114a.m62167c("\u001b\u000e", '0', 2) + o);
        return o;
    }

    /* renamed from: H */
    public static boolean m43657H(Context context) {
        if (C11969r1.C11983n.C11984a.f35247c >= C11969r1.C11983n.C11985b.f35264p) {
            return C11963q0.m43908b(context);
        }
        return false;
    }

    /* renamed from: I */
    private static void m43658I(Context context, TelephonyManager telephonyManager, Map map) {
        CdmaCellLocation cdmaCellLocation;
        String c;
        String valueOf;
        Map b = C12001v1.m44091b(context);
        if (b != null) {
            map.putAll(b);
        }
        if (C11969r1.C11970a.m43944j() || C11969r1.C11970a.m43938d()) {
            try {
                CellLocation cellLocation = telephonyManager.getCellLocation();
                if (cellLocation != null) {
                    if (cellLocation instanceof GsmCellLocation) {
                        GsmCellLocation gsmCellLocation = (GsmCellLocation) telephonyManager.getCellLocation();
                        if (gsmCellLocation != null) {
                            int lac = gsmCellLocation.getLac();
                            if (lac != -1) {
                                map.put(C18114a.m62170f(">23", 'T', 165, 0), String.valueOf(lac));
                            }
                            int cid = gsmCellLocation.getCid();
                            if (cid != -1) {
                                map.put(C18114a.m62167c("ejd", 253, 4), String.valueOf(cid));
                            }
                            int psc = gsmCellLocation.getPsc();
                            if (psc != -1) {
                                c = C18114a.m62170f("AE6", 211, 4, 2);
                                valueOf = String.valueOf(psc);
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if ((cellLocation instanceof CdmaCellLocation) && (cdmaCellLocation = (CdmaCellLocation) telephonyManager.getCellLocation()) != null) {
                        int systemId = cdmaCellLocation.getSystemId();
                        if (systemId != -1) {
                            map.put(C18114a.m62170f("g^Z", 'i', 10, 3), String.valueOf(systemId));
                        }
                        int baseStationId = cdmaCellLocation.getBaseStationId();
                        if (baseStationId != -1) {
                            map.put(C18114a.m62170f("\u0012$\u001b\u0017", ':', 11, 2), String.valueOf(baseStationId));
                        }
                        int baseStationLatitude = cdmaCellLocation.getBaseStationLatitude();
                        if (baseStationLatitude != Integer.MAX_VALUE) {
                            map.put(C18114a.m62170f("CS>J>P", 14, 237, 0), String.valueOf(baseStationLatitude));
                        }
                        int baseStationLongitude = cdmaCellLocation.getBaseStationLongitude();
                        if (baseStationLongitude != Integer.MAX_VALUE) {
                            c = C18114a.m62167c("%7$25/", '!', 3);
                            valueOf = String.valueOf(baseStationLongitude);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    map.put(c, valueOf);
                }
            } catch (SecurityException e) {
                String str = f34850a;
                C11907h.C11908a.m43624b(str, C18114a.m62170f("\b'\u001a(V*\u001e 0/\"]&2\"07-3-f8.<85@A8??q", '5', 130, 2) + e.toString());
                C12014y0.m44139c(e);
            } catch (Exception e2) {
                C11907h.C11908a.m43623a(f34850a, e2.toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m43659J(android.telephony.TelephonyManager r6, java.util.Map r7) {
        /*
            int r0 = com.threatmetrix.TrustDefender.C11969r1.C11983n.C11984a.f35247c
            int r1 = com.threatmetrix.TrustDefender.C11969r1.C11983n.C11985b.f35264p
            if (r0 >= r1) goto L_0x00d6
            boolean r0 = com.threatmetrix.TrustDefender.C11969r1.C11970a.m43935a()
            if (r0 != 0) goto L_0x000e
            goto L_0x00d6
        L_0x000e:
            r0 = 3
            java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
            java.lang.String r2 = "a`pKchgidrvntnKnvwU{t~"
            r3 = 120(0x78, float:1.68E-43)
            r4 = 1
            java.lang.String r2 = p626ue.C18114a.m62170f(r2, r3, r4, r0)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.reflect.Method r1 = com.threatmetrix.TrustDefender.C11879b0.m43531c(r1, r2, r4)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.Object r6 = com.threatmetrix.TrustDefender.C11879b0.m43529a(r6, r1, r2)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            boolean r1 = r6 instanceof java.util.List     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            if (r1 == 0) goto L_0x0030
            java.util.List r6 = (java.util.List) r6     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            if (r6 == 0) goto L_0x00d6
            int r1 = r6.size()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            if (r1 <= 0) goto L_0x00d6
            java.util.Iterator r6 = r6.iterator()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
        L_0x003d:
            boolean r1 = r6.hasNext()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            if (r1 == 0) goto L_0x00d6
            java.lang.Object r1 = r6.next()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            android.telephony.NeighboringCellInfo r1 = (android.telephony.NeighboringCellInfo) r1     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            int r2 = r1.getCid()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            r3 = -1
            if (r2 == r3) goto L_0x003d
            int r2 = r1.getRssi()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            r3 = 99
            if (r2 == r3) goto L_0x003d
            int r2 = r1.getCid()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r3 = "382"
            r4 = 48
            r5 = 5
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r4, r5)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.Object r3 = r7.get(r3)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            if (r2 != 0) goto L_0x0092
            int r2 = r1.getCid()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r3 = "\b\u0018\r\u0007"
            r4 = 45
            r5 = 4
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r4, r5)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.Object r3 = r7.get(r3)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            if (r2 == 0) goto L_0x003d
        L_0x0092:
            java.lang.String r2 = "\u0001xjK\\]"
            r3 = 165(0xa5, float:2.31E-43)
            r4 = 2
            java.lang.String r2 = p626ue.C18114a.m62167c(r2, r3, r4)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            int r1 = r1.getRssi()     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            r7.put(r2, r1)     // Catch:{ SecurityException -> 0x00b2, Exception -> 0x00a7 }
            goto L_0x003d
        L_0x00a7:
            r6 = move-exception
            java.lang.String r7 = f34850a
            java.lang.String r6 = r6.toString()
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43623a(r7, r6)
            goto L_0x00d6
        L_0x00b2:
            r6 = move-exception
            java.lang.String r7 = f34850a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "\u0010/\"0^2&(87*e.:*8?5;5n@6D@=HI@GGy"
            r3 = 156(0x9c, float:2.19E-43)
            java.lang.String r0 = p626ue.C18114a.m62167c(r2, r3, r0)
            r1.append(r0)
            java.lang.String r0 = r6.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r7, r0)
            com.threatmetrix.TrustDefender.C12014y0.m44139c(r6)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11914j.m43659J(android.telephony.TelephonyManager, java.util.Map):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011d, code lost:
        if (r3.equalsIgnoreCase(com.threatmetrix.TrustDefender.C11969r1.C11983n.C11984a.f35246b) != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013a, code lost:
        if (r3.equalsIgnoreCase(java.lang.String.valueOf(com.threatmetrix.TrustDefender.C11969r1.C11983n.f35225a)) != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        if (r3.equalsIgnoreCase(com.threatmetrix.TrustDefender.C11969r1.C11983n.f35226b) != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x018c, code lost:
        if (r3.equalsIgnoreCase(com.threatmetrix.TrustDefender.C11969r1.C11983n.f35228d) != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a4, code lost:
        if (r3.equalsIgnoreCase(com.threatmetrix.TrustDefender.C11969r1.C11983n.f35230f) != false) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01bc, code lost:
        if (r3.equalsIgnoreCase(com.threatmetrix.TrustDefender.C11969r1.C11983n.f35231g) != false) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01df  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List m43660K(p585re.C17603t r18, java.util.List r19) {
        /*
            r1 = r19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            if (r1 == 0) goto L_0x0335
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x0011
            goto L_0x0335
        L_0x0011:
            com.threatmetrix.TrustDefender.u0 r0 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r4 = r1.toArray(r4)
            java.lang.String[] r4 = (java.lang.String[]) r4
            java.lang.String[] r4 = r0.mo32088v(r4)
            java.lang.String r5 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35227c
            com.threatmetrix.TrustDefender.r1$f r6 = new com.threatmetrix.TrustDefender.r1$f
            com.threatmetrix.TrustDefender.r1 r0 = new com.threatmetrix.TrustDefender.r1
            r0.<init>()
            r7 = r18
            android.content.Context r7 = r7.f49314a
            r6.<init>(r7)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r8 = r3
            r9 = r8
        L_0x0039:
            int r0 = r19.size()
            r12 = 5
            r14 = 3
            r15 = 1
            if (r8 >= r0) goto L_0x01ee
            java.lang.Object r0 = r1.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Thread r16 = java.lang.Thread.currentThread()
            boolean r16 = r16.isInterrupted()
            if (r16 != 0) goto L_0x01e8
            r10 = 33
            r13 = 30
            java.lang.String r3 = "')+#vji"
            java.lang.String r3 = p626ue.C18114a.m62170f(r3, r10, r13, r15)
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x00a7
            java.net.URI r3 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0097 }
            r3.<init>(r0)     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r10 = r3.getScheme()     // Catch:{ URISyntaxException -> 0x0097 }
            if (r10 == 0) goto L_0x0079
            java.io.File r10 = new java.io.File     // Catch:{ URISyntaxException -> 0x0097 }
            r10.<init>(r3)     // Catch:{ URISyntaxException -> 0x0097 }
            boolean r3 = r10.exists()     // Catch:{ URISyntaxException -> 0x0097 }
        L_0x0076:
            r15 = r3
            goto L_0x01d7
        L_0x0079:
            java.lang.String r10 = f34850a     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ URISyntaxException -> 0x0097 }
            r13.<init>()     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r14 = "'AHJB@zNHw>;IsHD=oB1518/h.952}b"
            r11 = 158(0x9e, float:2.21E-43)
            java.lang.String r11 = p626ue.C18114a.m62167c(r14, r11, r12)     // Catch:{ URISyntaxException -> 0x0097 }
            r13.append(r11)     // Catch:{ URISyntaxException -> 0x0097 }
            r13.append(r3)     // Catch:{ URISyntaxException -> 0x0097 }
            java.lang.String r3 = r13.toString()     // Catch:{ URISyntaxException -> 0x0097 }
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r10, r3)     // Catch:{ URISyntaxException -> 0x0097 }
            goto L_0x01d6
        L_0x0097:
            r0 = move-exception
            java.lang.String r3 = f34850a
            java.lang.String r10 = "\u001e\u0013\u001f\u001a$($\u001d\u001dY\u001e$\"!*_64/"
            r11 = 16
            java.lang.String r10 = p626ue.C18114a.m62167c(r10, r11, r15)
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43629g(r3, r10, r0)
            goto L_0x01e3
        L_0x00a7:
            java.lang.String r3 = "\u001d\t\u000e\u0019^RQ"
            r10 = 87
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r10, r12)
            boolean r3 = r0.startsWith(r3)
            r10 = 7
            if (r3 == 0) goto L_0x00c7
            java.lang.String r3 = r0.substring(r10)
            if (r5 == 0) goto L_0x01d6
            boolean r10 = com.threatmetrix.TrustDefender.C11921k0.m43732o(r3)
            if (r10 == 0) goto L_0x01d6
            boolean r3 = r5.contains(r3)
            goto L_0x0076
        L_0x00c7:
            java.lang.String r3 = "\t\u0005\u0002UKL"
            r11 = 12
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r11, r14)
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x00e2
            r3 = 6
            java.lang.String r3 = r0.substring(r3)
            int r10 = com.threatmetrix.TrustDefender.C11969r1.C11979j.f35214c
            boolean r15 = r6.mo32039a(r3, r10)
            goto L_0x01d7
        L_0x00e2:
            java.lang.String r3 = "),*,vlm"
            r11 = 56
            r13 = 0
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r11, r13)
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L_0x01d6
            java.lang.String r3 = r0.substring(r10)
            java.lang.String r10 = "bF"
            java.lang.String r10 = p626ue.C18114a.m62167c(r10, r14, r14)
            r11 = 2
            java.lang.String[] r3 = r3.split(r10, r11)
            int r10 = r3.length
            if (r10 >= r11) goto L_0x0105
            goto L_0x01e3
        L_0x0105:
            r10 = r3[r13]
            r3 = r3[r15]
            java.lang.String r11 = "3/l 2%'\u001ef.\u001c((\u001d\" ^\u0013\u001e\u0012\u0012\u001a\f\u0017\u000e"
            r13 = 190(0xbe, float:2.66E-43)
            java.lang.String r11 = p626ue.C18114a.m62167c(r11, r13, r12)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0121
            java.lang.String r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.C11984a.f35246b
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
            goto L_0x01d7
        L_0x0121:
            java.lang.String r11 = "a]\u001bN`SUL\u0015JFXH\u0010VTB"
            r12 = 199(0xc7, float:2.79E-43)
            r13 = 4
            java.lang.String r11 = p626ue.C18114a.m62167c(r11, r12, r13)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x013e
            long r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35225a
            java.lang.String r10 = java.lang.String.valueOf(r10)
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
            goto L_0x01d7
        L_0x013e:
            r11 = 206(0xce, float:2.89E-43)
            r12 = 120(0x78, float:1.68E-43)
            java.lang.String r13 = "*&c\u0017)\u001c\u001e\u0015]#'\u001d\u0011"
            java.lang.String r11 = p626ue.C18114a.m62170f(r13, r11, r12, r15)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0158
            java.lang.String r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35226b
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
            goto L_0x01d7
        L_0x0158:
            r11 = 145(0x91, float:2.03E-43)
            r12 = 118(0x76, float:1.65E-43)
            java.lang.String r13 = "WS\u0011DVIKB\u000bP<AL"
            r15 = 0
            java.lang.String r11 = p626ue.C18114a.m62170f(r13, r11, r12, r15)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0175
            java.lang.String r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35227c
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
            r17 = r15
            r15 = 1
            goto L_0x01d9
        L_0x0175:
            r11 = 218(0xda, float:3.05E-43)
            r12 = 224(0xe0, float:3.14E-43)
            java.lang.String r13 = "lj*_shle0ksxz"
            r15 = 2
            java.lang.String r11 = p626ue.C18114a.m62170f(r13, r11, r12, r15)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x0190
            java.lang.String r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35228d
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
        L_0x018e:
            r15 = 1
            goto L_0x01d7
        L_0x0190:
            java.lang.String r11 = "\n\bG|\u0011\u0006\n\u0003M\u0016\u0015\b\u0016"
            r12 = 75
            java.lang.String r11 = p626ue.C18114a.m62167c(r11, r12, r14)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x01a7
            java.lang.String r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35230f
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
            goto L_0x018e
        L_0x01a7:
            java.lang.String r11 = "PL\n=OBD;\u0004>8"
            r12 = 96
            r13 = 2
            java.lang.String r11 = p626ue.C18114a.m62167c(r11, r12, r13)
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x01bf
            java.lang.String r10 = com.threatmetrix.TrustDefender.C11969r1.C11983n.f35231g
            boolean r3 = r3.equalsIgnoreCase(r10)
            if (r3 == 0) goto L_0x01d6
            goto L_0x018e
        L_0x01bf:
            java.lang.Object r11 = r7.get(r10)
            java.util.Map r11 = (java.util.Map) r11
            if (r11 != 0) goto L_0x01cf
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r7.put(r10, r11)
        L_0x01cf:
            r11.put(r3, r0)
            r15 = 0
            r17 = 1
            goto L_0x01d9
        L_0x01d6:
            r15 = 0
        L_0x01d7:
            r17 = 0
        L_0x01d9:
            if (r15 == 0) goto L_0x01df
            r2.add(r0)
            goto L_0x01e3
        L_0x01df:
            if (r17 != 0) goto L_0x01e3
            int r9 = r9 + 1
        L_0x01e3:
            int r8 = r8 + 1
            r3 = 0
            goto L_0x0039
        L_0x01e8:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x01ee:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x02a0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = com.threatmetrix.TrustDefender.C11969r1.C11983n.C11984a.f35247c
            int r5 = com.threatmetrix.TrustDefender.C11969r1.C11983n.C11985b.f35270v
            if (r3 >= r5) goto L_0x0234
            java.lang.String r3 = "\u001cRTVRg_h#figi"
            r5 = 54
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r5, r14)
            java.util.Set r5 = r7.keySet()
            java.lang.String r6 = ")"
            r8 = 117(0x75, float:1.64E-43)
            java.lang.String r6 = p626ue.C18114a.m62167c(r6, r8, r14)
            java.util.Map r3 = m43678e(r3, r5, r6)
            r0.putAll(r3)
            java.lang.String r3 = "9~\u0006\u0001\u0003t}@t\t}\u0002zE\t\f\n\f"
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r12, r14)
            java.util.Set r5 = r7.keySet()
            java.lang.String r6 = "t"
            r8 = 24
            r10 = 2
            java.lang.String r6 = p626ue.C18114a.m62167c(r6, r8, r10)
            java.util.Map r3 = m43678e(r3, r5, r6)
            r0.putAll(r3)
        L_0x0234:
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x023c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x02a0
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L_0x025e
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = m43661L(r6)
        L_0x025e:
            if (r6 == 0) goto L_0x0291
            java.lang.Object r7 = r5.getValue()
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0273
            r2.add(r6)
            r13 = 1
            goto L_0x0274
        L_0x0273:
            r13 = 0
        L_0x0274:
            java.lang.Object r6 = r5.getValue()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r7 = "QKM"
            r8 = 78
            r10 = 4
            java.lang.String r7 = p626ue.C18114a.m62167c(r7, r8, r10)
            java.lang.Object r6 = r6.get(r7)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0293
            int r13 = r13 + 1
            r2.add(r6)
            goto L_0x0293
        L_0x0291:
            r10 = 4
            r13 = 0
        L_0x0293:
            java.lang.Object r5 = r5.getValue()
            java.util.Map r5 = (java.util.Map) r5
            int r5 = r5.size()
            int r5 = r5 - r13
            int r9 = r9 + r5
            goto L_0x023c
        L_0x02a0:
            java.lang.String r0 = f34850a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r5 = 76
            r6 = 164(0xa4, float:2.3E-43)
            java.lang.String r7 = "_ThX^\\\\\u0019"
            java.lang.String r5 = p626ue.C18114a.m62170f(r7, r5, r6, r14)
            r3.append(r5)
            r3.append(r9)
            java.lang.String r5 = "@"
            r6 = 79
            r7 = 2
            java.lang.String r5 = p626ue.C18114a.m62167c(r5, r6, r7)
            r3.append(r5)
            int r1 = r19.size()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.threatmetrix.TrustDefender.C11907h.m43607b(r0, r1)
            if (r4 == 0) goto L_0x02fc
            int r0 = r4.length
            if (r0 <= 0) goto L_0x02fc
            int r0 = r4.length
            r3 = 0
        L_0x02d8:
            if (r3 >= r0) goto L_0x02fc
            r1 = r4[r3]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "<"
            r7 = 106(0x6a, float:1.49E-43)
            r8 = 16
            r9 = 2
            java.lang.String r6 = p626ue.C18114a.m62170f(r6, r7, r8, r9)
            r5.append(r6)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r2.add(r1)
            int r3 = r3 + 1
            goto L_0x02d8
        L_0x02fc:
            java.util.Collections.sort(r2)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0335
            boolean r0 = com.threatmetrix.TrustDefender.C11907h.m43616k()
            if (r0 == 0) goto L_0x0335
            java.lang.String r0 = f34850a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "ku|vm*"
            r4 = 193(0xc1, float:2.7E-43)
            java.lang.String r3 = p626ue.C18114a.m62167c(r3, r4, r14)
            r1.append(r3)
            r3 = 198(0xc6, float:2.77E-43)
            r4 = 251(0xfb, float:3.52E-43)
            java.lang.String r5 = ""
            java.lang.String r3 = p626ue.C18114a.m62170f(r5, r3, r4, r14)
            java.lang.String r3 = com.threatmetrix.TrustDefender.C11921k0.m43725h(r2, r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r0, r1)
        L_0x0335:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11914j.m43660K(re.t, java.util.List):java.util.List");
    }

    /* renamed from: L */
    public static String m43661L(String str) {
        String str2 = (String) C11879b0.m43529a((Object) null, f34855f, str);
        if (C11921k0.m43732o(str2)) {
            return str2;
        }
        return null;
    }

    /* renamed from: M */
    public static boolean m43662M() {
        return C11892d1.m43575b();
    }

    /* renamed from: N */
    public static long m43663N() {
        long currentTimeMillis = (System.currentTimeMillis() - C11969r1.C11986o.m44003c()) / 1000;
        String str = f34850a;
        C11907h.m43607b(str, C18114a.m62170f("f`q", 245, 10, 1));
        C11907h.C11908a.m43624b(str, C18114a.m62170f("J\u0011\u000e\u001ch\u0015\u0014\u0018v\u000b\u000e\u0005X=", 237, 'f', 1) + currentTimeMillis);
        return currentTimeMillis;
    }

    /* renamed from: O */
    public static int m43664O(C17603t tVar) {
        return C11969r1.C11974e.m43958a(tVar.f49314a);
    }

    /* renamed from: P */
    public static String m43665P() {
        return C18114a.m62170f("6d[jhc_", 'T', '_', 2);
    }

    /* renamed from: Q */
    public static String m43666Q(C17603t tVar) {
        C12004w0.C12005a aVar;
        C11969r1.C11977h hVar = new C11969r1.C11977h(tVar);
        String b = hVar.mo32043b();
        String d = C11996u0.m44036s().mo32071d(b);
        if (d != null) {
            return C11917c.m43703c(d);
        }
        String[] split = b.split(C18114a.m62170f("\u0016", 199, 30, 3));
        int length = split.length;
        int i = 0;
        while (true) {
            if (i < length) {
                String str = split[i];
                if (str.contains(C18114a.m62167c("\u0013", 'v', 1)) && !str.equalsIgnoreCase(tVar.f49314a.getPackageName())) {
                    aVar = C12004w0.C12005a.INCONSISTENT_PATH;
                    break;
                }
                i++;
            } else {
                String[] packagesForUid = tVar.f49314a.getPackageManager().getPackagesForUid(hVar.mo32046e());
                aVar = (packagesForUid == null || packagesForUid.length <= 1) ? C12004w0.C12005a.NOT_CLONED : C12004w0.C12005a.MULTIPLE_PID;
            }
        }
        return C11917c.m43701a(aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m43667R(p585re.C17603t r10) {
        /*
            android.content.Context r10 = r10.f49314a
            r0 = 70
            r1 = 4
            java.lang.String r2 = "GZcUPb:Q_\\R`4UGMOG4$*=1"
            java.lang.String r0 = p626ue.C18114a.m62167c(r2, r0, r1)
            r1 = 0
            android.content.SharedPreferences r10 = r10.getSharedPreferences(r0, r1)
            r2 = 0
            java.lang.String r0 = "Vird_qI`nkaoCdV\\^VC39L@"
            r4 = 180(0xb4, float:2.52E-43)
            r5 = 1
            r6 = 72
            java.lang.String r0 = p626ue.C18114a.m62170f(r0, r6, r4, r5)     // Catch:{ ClassCastException -> 0x002e }
            long r4 = com.threatmetrix.TrustDefender.C11969r1.C11980k.m43987b(r10, r0, r2)     // Catch:{ ClassCastException -> 0x002e }
            boolean r0 = java.lang.Thread.interrupted()     // Catch:{ ClassCastException -> 0x002f }
            if (r0 != 0) goto L_0x0028
            goto L_0x003f
        L_0x0028:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ ClassCastException -> 0x002f }
            r0.<init>()     // Catch:{ ClassCastException -> 0x002f }
            throw r0     // Catch:{ ClassCastException -> 0x002f }
        L_0x002e:
            r4 = r2
        L_0x002f:
            java.lang.String r0 = f34850a
            r6 = 132(0x84, float:1.85E-43)
            r7 = 2
            java.lang.String r8 = "Dj`mlpbvlfqk'|\u0003zp,s}\u00020Rbcsi_d]"
            r9 = 127(0x7f, float:1.78E-43)
            java.lang.String r6 = p626ue.C18114a.m62170f(r8, r9, r6, r7)
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r0, r6)
        L_0x003f:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = f34850a
            r2 = 78
            r3 = 5
            java.lang.String r4 = "w %\u001d\u0012L\u001a\u001a\u001e\u0011\u0011\u0015\rD\r\u0011A\u0014\b\u0010\u0002:\n\u000b||\t@3yv~t\u0001n\u0001txp(HVUcWKNE"
            java.lang.String r2 = p626ue.C18114a.m62167c(r4, r2, r3)
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r0, r2)
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r2 / r4
            android.content.SharedPreferences$Editor r10 = com.threatmetrix.TrustDefender.C11969r1.C11980k.m43995j(r10)
            if (r10 == 0) goto L_0x006f
            r0 = 22
            r2 = 117(0x75, float:1.64E-43)
            java.lang.String r3 = "4GPB=O'>LI?M!B4:<4!\u0011\u0017*\u001e"
            java.lang.String r0 = p626ue.C18114a.m62170f(r3, r0, r2, r1)
            com.threatmetrix.TrustDefender.C11969r1.C11980k.m43992g(r0, r4, r10)
            r10.apply()
        L_0x006f:
            java.lang.String r10 = f34850a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2 = 216(0xd8, float:3.03E-43)
            r3 = 153(0x99, float:2.14E-43)
            java.lang.String r6 = "\b/3]\u001e,+Y-!$\u001bT\u001a%!\u001eO\u0002\u0016\u000e\u001e\u0010\u000ex\u001a\f\f\n\u0016\b\u0010\u0004\u0005\u0012=\u0003\u000b\r9\u0004|\u0010Oh{\u0005vq\u0004[r\u0001}s\u0002UvhnphUEK^R)\u001c"
            java.lang.String r1 = p626ue.C18114a.m62170f(r6, r2, r3, r1)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r10, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11914j.m43667R(re.t):long");
    }

    /* renamed from: S */
    public static String m43668S(C17603t tVar) {
        String a;
        if (C11969r1.C11983n.C11984a.f35247c >= C11969r1.C11983n.C11985b.f35264p && (a = C11963q0.m43907a(tVar)) != null) {
            return a;
        }
        try {
            String property = System.getProperty(C18114a.m62167c("\u001d('\"^ !\u001d%%r\u0019\u001c\u001c", 202, 5), (String) null);
            String property2 = System.getProperty(C18114a.m62167c("w\u0005\u0006\u0003A\u0005\b\u0006\u0010\u0012i\n\u000e\u0011", 'G', 3), (String) null);
            if (C11921k0.m43732o(property) && C11921k0.m43732o(property2)) {
                String str = f34850a;
                C11907h.C11908a.m43624b(str, C18114a.m62170f("\u001b\u001c\u0018  E\u000e\u0012\t\u0011\u0013\r\u0012\u0006\u000b\t9", 235, 150, 0) + property + C18114a.m62167c("L", 'v', 4) + property2);
                if (!C18114a.m62170f("\u0015\u0018", 'O', 182, 0).equals(property2)) {
                    if (!C18114a.m62167c("gi\\Yc^dgg", 132, 5).equals(property.toLowerCase())) {
                        return property + C18114a.m62167c("p", 181, 0) + property2;
                    }
                }
                C11907h.C11908a.m43624b(str, C18114a.m62167c("<Y__aW[S\u000bSW^HRNH\u0003RSOWW", 216, 2));
                return null;
            }
        } catch (SecurityException unused) {
            C11907h.C11908a.m43623a(f34850a, C18114a.m62167c("2C@QMCMQ$7C;8Dp2;=07>i*+*+87b60_/0,, ,-!\u001c)", 138, 2));
        }
        return null;
    }

    /* renamed from: T */
    public static long m43669T(C17603t tVar) {
        long G = m43656G(tVar.f49314a.getApplicationInfo().sourceDir);
        return G != 0 ? G : m43667R(tVar);
    }

    /* renamed from: U */
    public static boolean m43670U(C17603t tVar) {
        Context context = tVar.f49314a;
        if (C11969r1.C11983n.C11984a.f35247c >= C11969r1.C11983n.C11985b.f35261m) {
            return C11904g0.m43602a(context);
        }
        if (!C11969r1.C11981l.m43997a()) {
            return true;
        }
        try {
            Object systemService = context.getSystemService(C18114a.m62167c("[[dSa", 233, 0));
            if (!(systemService instanceof PowerManager)) {
                return true;
            }
            return ((PowerManager) systemService).isScreenOn();
        } catch (SecurityException e) {
            String str = f34850a;
            C11907h.C11908a.m43624b(str, C18114a.m62170f("c\u0001q}*{mm{xi#isamrfjb\u001ai]ic^gf[`^\u000f", 'F', 'T', 0) + e.toString());
            C12014y0.m44139c(e);
            return true;
        } catch (Exception e2) {
            C11907h.C11908a.m43623a(f34850a, e2.toString());
            return true;
        }
    }

    /* renamed from: V */
    public static String m43671V() {
        return C18114a.m62170f("\".#0,%\u001f", 'E', 248, 1);
    }

    /* renamed from: W */
    public static String m43672W(C17603t tVar) {
        try {
            String string = Settings.System.getString(tVar.f49314a.getContentResolver(), C18114a.m62170f("oq\u0004wrup\u0001t\u0002z", 'x', 18, 3));
            if (string != null) {
                return string;
            }
        } catch (RuntimeException e) {
            C11907h.C11908a.m43628f(f34850a, C18114a.m62167c("@r\\]gj^ca\u0012Z^\u000fOPOP]\\QUM\u0005WHVUIMEP{AIKw;;K=67p>0;2kFG", 5, 5), e.toString());
        }
        try {
            String string2 = Settings.Secure.getString(tVar.f49314a.getContentResolver(), C18114a.m62167c("fq{l|xytl|p}v", 129, 3));
            if (string2 != null) {
                return string2;
            }
        } catch (RuntimeException e2) {
            C11907h.C11908a.m43628f(f34850a, C18114a.m62167c("\u001aL67AD8=;k48h)*)*76+/'^1\"0/#'\u001f*U\u001b#%Q\u0013\u001c$\u0013!\u001b\u001a\u001e\u0011G\u0015\u0007\u0012\tB\u001d\u001e", 170, 5), e2.toString());
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                return defaultAdapter.getName();
            }
            return null;
        } catch (Exception e3) {
            C11907h.C11908a.m43628f(f34850a, C18114a.m62167c("r'\u0013\u0016\"'\u001d$$V!'Y\u001c\u001f #23*0*c'2<-=9:@5m35G;69tQT", 142, 1), e3.toString());
            return null;
        }
    }

    /* renamed from: X */
    private static String m43673X(Map map) {
        if (map.size() >= 3) {
            return map.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m43674a() {
        HashSet hashSet = new HashSet();
        C18114a.m62167c("OfmSmq]g", 252, 5);
        Collections.addAll(hashSet, new String[]{C18114a.m62167c("\u001c5>&BH6B", '\'', 3)});
        Map e = m43678e(C18114a.m62170f("\u0012RSOB\rJAHCG>F", 131, 152, 1), hashSet, C18114a.m62167c("b", 29, 2));
        String str = f34850a;
        C11907h.m43607b(str, C18114a.m62170f("did", 242, 'p', 0));
        C11907h.C11908a.m43624b(str, C18114a.m62167c("\u000b\b\u0016m\u0005\ff\u000b\u0002\n9\u000b|\u000b\u000b\u0007\u0002wuJ/", 173, 4) + e);
        String str2 = (String) e.get(C18114a.m62170f("+BI/IM9C", 147, 240, 0));
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public static boolean m43675b(C17603t tVar) {
        String a = C11969r1.C11973d.m43956a(tVar.f49314a.getContentResolver(), C18114a.m62167c("\u001b\u001c\u000f\u0016\t\u0015\u0017\n\u0007\u0019\r\u0012\u0010", 'p', 2));
        return a != null && a.equals(C18114a.m62170f("\u001e", 183, 217, 1));
    }

    /* renamed from: c */
    public static String m43676c(C17603t tVar) {
        if (!C11969r1.C11970a.m43940f()) {
            return null;
        }
        try {
            Object systemService = tVar.f49314a.getApplicationContext().getSystemService(C18114a.m62167c("TMUUM", '!', 1));
            if (!(systemService instanceof TelephonyManager)) {
                return null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            HashMap hashMap = new HashMap();
            try {
                String networkOperator = telephonyManager.getNetworkOperator();
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (networkOperator != null) {
                    if (!"".equals(networkOperator.trim())) {
                        hashMap.put(C18114a.m62170f("/1", 193, '}', 3), networkOperator);
                    }
                }
                if (networkOperatorName != null && !"".equals(networkOperatorName.trim())) {
                    hashMap.put(C18114a.m62167c("\u0017\u0019\u0019", 'b', 1), networkOperatorName);
                }
                if (networkCountryIso != null && !"".equals(networkCountryIso.trim())) {
                    hashMap.put(C18114a.m62170f("2(%0;8", '8', 't', 2), networkCountryIso);
                }
            } catch (SecurityException e) {
                String str = f34850a;
                C11907h.C11908a.m43624b(str, C18114a.m62167c("a\u0001s\u00020\u0004wy\n\t{7\f{\n\u0011\u0007\r\u0007@\u0012\b\u0016\u0012\u000f\u001a\u001b\u0012\u0019\u0019K", 139, 0) + e.toString());
                C12014y0.m44139c(e);
            } catch (Exception e2) {
                C11907h.C11908a.m43623a(f34850a, e2.toString());
            }
            C11969r1.C11975f fVar = new C11969r1.C11975f(tVar.f49314a);
            boolean c = fVar.mo32041c(C18114a.m62167c("@LANJC=\u0006G;GA<ED9><z\r\u000e\r\u000e\u001b\u001a%\u000b\r\u0011\u0007 \f\u000e\u0001}\u0010\u0004\t\u0007", 11, 2), tVar.f49314a.getPackageName());
            boolean c2 = fVar.mo32041c(C18114a.m62170f("y\b~\u000e\f\u0007\u0003M\u0011\u0007\u0015\u0011\u000e\u0019\u001a\u0011\u0018\u0018Xlops\u0003\u0004\u0011u\u0003u\b\n|\u0018\u0006\n~}\u0012\b\u000f\u000f", 9, 15, 3), tVar.f49314a.getPackageName());
            if (!c && !c2) {
                return m43673X(hashMap);
            }
            if (c) {
                m43658I(tVar.f49314a, telephonyManager, hashMap);
            }
            m43659J(telephonyManager, hashMap);
            return m43673X(hashMap);
        } catch (SecurityException e3) {
            String str2 = f34850a;
            C11907h.C11908a.m43624b(str2, C18114a.m62170f("\u000e- .\\0$&65(c,8(6=393l>4B>;FG>EEw", 171, 242, 2) + e3.toString());
            C12014y0.m44139c(e3);
            return null;
        } catch (Exception e4) {
            C11907h.C11908a.m43623a(f34850a, e4.toString());
            return null;
        }
    }

    /* renamed from: d */
    public static String m43677d() {
        return C11892d1.m43574a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        throw r9;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map m43678e(java.lang.String r7, java.util.Set r8, java.lang.String r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r7 == 0) goto L_0x0084
            if (r8 != 0) goto L_0x000b
            goto L_0x0084
        L_0x000b:
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            boolean r7 = r1.exists()
            if (r7 == 0) goto L_0x0084
            r7 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0070 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ IOException -> 0x0070 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0070 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0070 }
        L_0x0021:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0064 }
            if (r1 == 0) goto L_0x0060
            java.lang.String r3 = ""
            java.util.List r1 = com.threatmetrix.TrustDefender.C11921k0.m43733p(r1, r9)     // Catch:{ all -> 0x0064 }
            boolean r4 = r1.isEmpty()     // Catch:{ all -> 0x0064 }
            if (r4 == 0) goto L_0x0034
            goto L_0x0021
        L_0x0034:
            java.lang.Object r4 = r1.get(r7)     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0064 }
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x0064 }
            int r5 = r4.length()     // Catch:{ all -> 0x0064 }
            if (r5 != 0) goto L_0x0045
            goto L_0x0021
        L_0x0045:
            boolean r5 = r8.contains(r4)     // Catch:{ all -> 0x0064 }
            if (r5 == 0) goto L_0x0021
            int r5 = r1.size()     // Catch:{ all -> 0x0064 }
            r6 = 1
            if (r5 <= r6) goto L_0x005c
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x0064 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = r1.trim()     // Catch:{ all -> 0x0064 }
        L_0x005c:
            r0.put(r4, r3)     // Catch:{ all -> 0x0064 }
            goto L_0x0021
        L_0x0060:
            r2.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0084
        L_0x0064:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r9 = move-exception
            r2.close()     // Catch:{ all -> 0x006b }
            goto L_0x006f
        L_0x006b:
            r1 = move-exception
            r8.addSuppressed(r1)     // Catch:{ IOException -> 0x0070 }
        L_0x006f:
            throw r9     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            r8 = move-exception
            java.lang.String r9 = f34850a
            r1 = 197(0xc5, float:2.76E-43)
            r2 = 184(0xb8, float:2.58E-43)
            java.lang.String r3 = "ZWe\u0010X\\S[\u000b'\t.(/1)'\u0002\\]"
            java.lang.String r7 = p626ue.C18114a.m62170f(r3, r1, r2, r7)
            java.lang.String r8 = r8.toString()
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43627e(r9, r7, r8)
        L_0x0084:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11914j.m43678e(java.lang.String, java.util.Set, java.lang.String):java.util.Map");
    }

    /* renamed from: f */
    public static long m43679f(C17603t tVar) {
        long G = m43656G(tVar.f49314a.getApplicationInfo().dataDir);
        return G != 0 ? G : m43667R(tVar);
    }

    /* renamed from: g */
    public static long m43680g() {
        C11944p0 p0Var = new C11944p0(Environment.getDataDirectory().getPath());
        long l = p0Var.mo32003l();
        long k = p0Var.mo32002k();
        long j = 0;
        if (!(l == 0 || k == 0)) {
            j = ((((l * k) >> 20) << 20) / 10) * 10;
        }
        String str = f34850a;
        C11907h.m43607b(str, C18114a.m62170f("XVb", '@', '1', 0));
        C11907h.C11908a.m43624b(str, C18114a.m62170f("&SGH\u0004XVHKN\nZZ\rbWU\u0011b[cc[\u0017", 211, 't', 2) + j);
        return j;
    }

    /* renamed from: h */
    public static String m43681h(C17603t tVar) {
        return String.valueOf((new C11969r1.C11977h(tVar).mo32045d() & 2) != 0);
    }

    /* renamed from: i */
    public static Map m43682i(C17603t tVar) {
        HashMap hashMap = new HashMap(2);
        Intent registerReceiver = tVar.f49314a.registerReceiver((BroadcastReceiver) null, new IntentFilter(C18114a.m62167c("\u000e\u001c\u0013\" \u001b\u0017a\u001e$+\u001d'.h\u001d 2(//o\u0005\u0005\u0019\u001a\f\u001a\")\u000e\u0014\u000e\u001c\u0016\u0015\u0015", '9', 1)));
        if (registerReceiver == null) {
            return hashMap;
        }
        int intExtra = registerReceiver.getIntExtra(C18114a.m62170f("\u001b\u001d\u000b\u001f! ", 192, 153, 2), -1);
        String c = intExtra != 2 ? (intExtra == 3 || intExtra == 4) ? C18114a.m62167c("f^_ZbSROM", 'G', 4) : intExtra != 5 ? C18114a.m62167c("[USWYbZ", 'r', 3) : C18114a.m62170f("HXPQ", 224, 254, 2) : C18114a.m62167c("bf^nbcg_", 255, 5);
        int intExtra2 = registerReceiver.getIntExtra(C18114a.m62167c("UOaQY", 179, 3), -1);
        int intExtra3 = registerReceiver.getIntExtra(C18114a.m62170f("(\u0019\u0018$\u001e", 'A', 241, 3), 100);
        if (intExtra3 <= 0) {
            hashMap.put(C18114a.m62170f("VN^LR", 'F', '0', 0), C18114a.m62170f("\u0011\t\u0005\u0007\u0007\u000e\u0004", 230, 251, 1));
        } else {
            hashMap.put(C18114a.m62167c("60B2:", 'm', 1), Float.valueOf(((float) intExtra2) / ((float) intExtra3)));
        }
        hashMap.put(C18114a.m62170f("pr`tvu", 5, 135, 2), c);
        return hashMap;
    }

    /* renamed from: j */
    public static String m43683j(C17603t tVar) {
        return C11969r1.C11973d.m43957b(tVar.f49314a.getContentResolver(), C18114a.m62167c("\u001b\u001b+\u0019\u001f!!\u001d\u0014\u001c!\u000b\u001e\u000f\u001d\u001c\u0010\u0014\f\u0017\u0002\u0007\u000f\u0001\u0001\n\u0002", 227, 4));
    }

    /* renamed from: k */
    public static C11965r m43684k(C17603t tVar) {
        return C11934m0.m43798i(tVar.f49314a);
    }

    /* renamed from: l */
    public static C11927l1.C11928a m43685l(Location location, boolean z) {
        Float f = null;
        if (location == null) {
            return null;
        }
        boolean k = C17599p.m61215k(location);
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        if (location.hasAccuracy()) {
            f = Float.valueOf(location.getAccuracy());
        }
        return new C11927l1.C11928a(latitude, longitude, f, k, z);
    }

    /* renamed from: m */
    public static String m43686m() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(C18114a.m62170f("c", 9, '?', 0));
                sb.append(country);
            }
        }
        return sb.toString();
    }

    /* renamed from: n */
    public static String m43687n() {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new String[]{C18114a.m62170f("EfbUVcb]_", 176, '&', 0), C18114a.m62167c("w\u0010 \u0011#\f\u001c\u000e", 207, 5), C18114a.m62167c("\b\u0019%\u001b\u0012\u001c", 228, 4)});
        Map e = m43678e(C18114a.m62170f("3uxvk8m{\u0002v|u", 192, 188, 2), new HashSet(arrayList), C18114a.m62170f("\r", 145, 191, 3));
        String str = f34850a;
        C11907h.m43607b(str, C18114a.m62167c("TQX", 181, 3));
        C11907h.C11908a.m43624b(str, C18114a.m62167c("JGU#/3&JAIxJ<JJFA75\nn", 156, 5) + e);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) e.get((String) it.next());
            if (str2 != null) {
                sb.append(str2);
                sb.append(C18114a.m62167c("\u0002", 'q', 1));
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.lastIndexOf(C18114a.m62167c("B", '\\', 1)));
        }
        return sb.toString().trim();
    }

    /* renamed from: o */
    public static String m43688o(C17603t tVar) {
        String str = f34850a;
        C11907h.C11908a.m43624b(str, C18114a.m62167c("\u001e\u001d-} 2&!$\u0006*0*)76917>rt", '6', 0));
        StringBuilder sb = new StringBuilder();
        if (Thread.currentThread().isInterrupted()) {
            return "";
        }
        try {
            Object systemService = tVar.f49314a.getApplicationContext().getSystemService(C18114a.m62167c("\n\u0001\u0007\u0005z", 161, 2));
            if (!(systemService instanceof TelephonyManager)) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) systemService;
            String f = C18114a.m62170f("\u000b#\u001f!!(\u001e", 'D', 6, 1);
            if (telephonyManager.getPhoneType() == 1) {
                f = telephonyManager.getNetworkOperatorName();
            }
            sb.append(f);
            sb.append(telephonyManager.getSimCountryIso());
            sb.append(((((float) m43655F()) / 1024.0f) / 1024.0f) / 1024.0f);
            C12015y1 y1Var = new C12015y1(tVar);
            int l = y1Var.mo32106l();
            int m = y1Var.mo32107m();
            if (l >= m) {
                sb.append(l);
                sb.append(C18114a.m62170f("j", 248, 147, 1));
                sb.append(m);
            } else {
                sb.append(m);
                sb.append(C18114a.m62167c(AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID, '9', 0));
                sb.append(l);
            }
            C11907h.C11908a.m43624b(str, C18114a.m62167c("Yx\u0005\u0006\u0004\n\u0004=\u0006\u0005\u0015drxm\u0014\r\u0017", 149, 0));
            sb.append(m43687n());
            C11907h.C11908a.m43624b(str, C18114a.m62167c("/NZ[Y_Y\u0013[ZjD]fCibl", 'N', 1));
            sb.append(m43674a());
            sb.append(C11969r1.C11983n.f35233i);
            sb.append(C18114a.m62170f("|", 186, '!', 3));
            sb.append(C11969r1.C11983n.f35234j);
            sb.append(C18114a.m62170f("|", 243, 230, 3));
            sb.append(C11969r1.C11983n.f35236l);
            sb.append(C18114a.m62167c("B", ']', 5));
            sb.append(C11969r1.C11983n.f35237m);
            sb.append(C18114a.m62167c("g", '=', 2));
            sb.append(C11969r1.C11983n.C11984a.f35245a);
            C11907h.C11908a.m43624b(str, C18114a.m62170f("-,<\r/A503\u00159?98FEH@FMyMAQSQNFF\u001d\u0004MGZP\u0011", 163, 160, 3) + sb.toString() + C18114a.m62167c("\u0001", 'W', 0));
            return C11921k0.m43728k(sb.toString());
        } catch (SecurityException e) {
            String str2 = f34850a;
            C11907h.C11908a.m43624b(str2, C18114a.m62170f("h\u0006v\u0003/\u0001rr\u0001}n(nxfrwkog\u001fnbnhclk`ec\u0014", 237, 252, 1) + e.toString());
            C12014y0.m44139c(e);
            return "";
        } catch (Exception e2) {
            C11907h.C11908a.m43623a(f34850a, e2.toString());
            return "";
        }
    }

    /* renamed from: p */
    public static C17596m m43689p() {
        C17596m C = C11996u0.m44036s().mo32063C();
        return C != null ? C : C11937n.m43811b();
    }

    /* renamed from: q */
    public static String m43690q(C17603t tVar) {
        return C11969r1.C11973d.m43957b(tVar.f49314a.getContentResolver(), C18114a.m62167c("^`]Y^fXXaYW", 128, 2));
    }

    /* renamed from: r */
    public static String m43691r(StringBuilder sb) {
        if (C11996u0.m44036s().mo32072e()) {
            List j = C11996u0.m44036s().mo32077j(C18114a.m62170f("\u0012W^Y[MV\u0019Q[[bb", 197, 155, 3));
            if (j == null || j.isEmpty() || j.size() != 2) {
                return null;
            }
            String str = (String) j.get(0);
            sb.append((String) j.get(1));
            return str;
        }
        List<String> E = m43654E();
        StringBuilder sb2 = new StringBuilder();
        for (String append : E) {
            sb2.append(append);
        }
        sb.append(E.size());
        return C11921k0.m43728k(sb2.toString());
    }

    /* renamed from: s */
    public static boolean m43692s(C11915a aVar) {
        if (aVar != null) {
            TimeZone timeZone = TimeZone.getDefault();
            if (timeZone != null) {
                aVar.f34856a = timeZone.getRawOffset() / 60000;
                aVar.f34857b = timeZone.getDSTSavings() / 60000;
                String str = f34850a;
                C11907h.m43607b(str, C18114a.m62167c("?MTD", 'W', 0));
                C11907h.C11908a.m43624b(str, C18114a.m62170f("iftSgjaUig]@d[c-\u0012Ucc2VRQ'", 233, 235, 0) + aVar.f34857b + C18114a.m62167c("(pwq[st\u0003u\u0006O", '-', 1) + aVar.f34856a);
                return true;
            }
            C11907h.C11908a.m43630h(f34850a, C18114a.m62170f("\u0012\u0011!\u0002\u0018\u001d\u0016\f\"\"\u001a~%\u001e(sZ\u0002}\u0007\u000b\u0005\u0005", 200, '`', 3));
            return false;
        }
        throw new IllegalArgumentException(C18114a.m62170f("\u000e\u0015d\u000b\u0004\u000e?\u0004\u0003\u0011\u0012\u0014\u001aF\n\u000eI\u0019!\u0019\u001a", 'p', '(', 3));
    }

    /* renamed from: t */
    public static String m43693t(C17603t tVar) {
        C18114a.m62167c("v", 227, 3);
        String f = new C11969r1.C11977h(tVar).mo32047f();
        C11969r1.C11978i iVar = new C11969r1.C11978i(tVar.f49314a, f, C11969r1.C11979j.f35215d);
        int a = iVar.mo32048a();
        String b = iVar.mo32049b();
        StringBuilder sb = new StringBuilder();
        sb.append(f);
        sb.append(C18114a.m62167c("G", 'r', 5));
        if (b == null) {
            b = C18114a.m62170f("\u0006", 21, 236, 0);
        }
        sb.append(b);
        sb.append(C18114a.m62167c(BankApiResponse.SUCCESSFUL_RESPONSE_CODE, 'u', 0));
        sb.append(a == -1 ? C18114a.m62170f(",", 137, 243, 3) : Integer.valueOf(a));
        String x = C11996u0.m44036s().mo32090x();
        sb.append(C18114a.m62167c("=", 130, 0));
        if (x == null) {
            x = C18114a.m62170f("q", 21, 165, 1);
        }
        sb.append(x);
        String str = f34850a;
        C11907h.m43607b(str, C18114a.m62167c("ZS_f", 140, 5));
        C11907h.C11908a.m43624b(str, C18114a.m62167c("Euvsqlku||/Yx\u00034", 2, 3) + sb.toString());
        return sb.toString();
    }

    /* renamed from: u */
    public static String m43694u() {
        try {
            return String.valueOf(((Boolean) Class.forName(C18132g.m62214b("gul{ytp;}\u0003>Uwu\n|", 129, 1)).getMethod(C18132g.m62214b("HS%GEYLMLZ,YYZRQcUU", '/', 3), new Class[0]).invoke((Object) null, new Object[0])).booleanValue());
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }

    /* renamed from: v */
    public static int m43695v() {
        int B = C11996u0.m44036s().mo32062B();
        return B <= 0 ? Runtime.getRuntime().availableProcessors() : B;
    }

    /* renamed from: w */
    public static C11927l1.C11929b m43696w() {
        return C11943p.m43844a();
    }

    /* renamed from: x */
    public static String m43697x() {
        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
        if (stackTrace.length > 0) {
            String className = stackTrace[stackTrace.length - 1].getClassName();
            if (!className.equals(C18114a.m62170f("\t\u0016\u0015V\u000b\u0019\u0010\u001f\u001d\u0018\u0014^\u001b!(\u001a(%\u0019%g*/j\u00188'06(\r3/;", '+', 133, 2)) && !className.equals(C18114a.m62170f("\t\u0007\u0013\u001e\u0012\u0015X\u001f&!#\u0015\u001e_\u0001\u0015)\u001f-\u001d\f.\u001c.1", 28, 8, 3))) {
                int lastIndexOf = className.lastIndexOf(C18114a.m62167c("w", 181, 5));
                return lastIndexOf != -1 ? className.substring(lastIndexOf + 1) : className;
            }
        }
        return null;
    }

    /* renamed from: z */
    public static String m43699z() {
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        String language = locale.getLanguage();
        if (language != null) {
            sb.append(language);
            String country = locale.getCountry();
            if (country != null) {
                sb.append(C18114a.m62170f("\u0012", 216, '\'', 2));
                sb.append(country);
            }
        }
        return sb.toString();
    }
}
