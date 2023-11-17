package p155l5;

import android.util.SparseArray;
import p155l5.C6912i;

/* renamed from: l5.o */
public abstract class C6924o {

    /* renamed from: l5.o$a */
    public static abstract class C6925a {
        /* renamed from: a */
        public abstract C6924o mo21069a();

        /* renamed from: b */
        public abstract C6925a mo21070b(C6926b bVar);

        /* renamed from: c */
        public abstract C6925a mo21071c(C6927c cVar);
    }

    /* renamed from: l5.o$b */
    public enum C6926b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: z */
        private static final SparseArray f20770z = null;

        /* renamed from: d */
        private final int f20771d;

        static {
            C6926b bVar;
            C6926b bVar2;
            C6926b bVar3;
            C6926b bVar4;
            C6926b bVar5;
            C6926b bVar6;
            C6926b bVar7;
            C6926b bVar8;
            C6926b bVar9;
            C6926b bVar10;
            C6926b bVar11;
            C6926b bVar12;
            C6926b bVar13;
            C6926b bVar14;
            C6926b bVar15;
            C6926b bVar16;
            C6926b bVar17;
            C6926b bVar18;
            C6926b bVar19;
            C6926b bVar20;
            SparseArray sparseArray = new SparseArray();
            f20770z = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar20);
            sparseArray.put(13, bVar13);
            sparseArray.put(14, bVar14);
            sparseArray.put(15, bVar15);
            sparseArray.put(16, bVar16);
            sparseArray.put(17, bVar17);
            sparseArray.put(18, bVar18);
            sparseArray.put(19, bVar19);
        }

        private C6926b(int i) {
            this.f20771d = i;
        }

        /* renamed from: a */
        public static C6926b m26916a(int i) {
            return (C6926b) f20770z.get(i);
        }

        /* renamed from: b */
        public int mo21074b() {
            return this.f20771d;
        }
    }

    /* renamed from: l5.o$c */
    public enum C6927c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: x */
        private static final SparseArray f20791x = null;

        /* renamed from: d */
        private final int f20793d;

        static {
            C6927c cVar;
            C6927c cVar2;
            C6927c cVar3;
            C6927c cVar4;
            C6927c cVar5;
            C6927c cVar6;
            C6927c cVar7;
            C6927c cVar8;
            C6927c cVar9;
            C6927c cVar10;
            C6927c cVar11;
            C6927c cVar12;
            C6927c cVar13;
            C6927c cVar14;
            C6927c cVar15;
            C6927c cVar16;
            C6927c cVar17;
            C6927c cVar18;
            C6927c cVar19;
            SparseArray sparseArray = new SparseArray();
            f20791x = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar19);
            sparseArray.put(13, cVar13);
            sparseArray.put(14, cVar14);
            sparseArray.put(15, cVar15);
            sparseArray.put(16, cVar16);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar17);
        }

        private C6927c(int i) {
            this.f20793d = i;
        }

        /* renamed from: a */
        public static C6927c m26918a(int i) {
            return (C6927c) f20791x.get(i);
        }

        /* renamed from: b */
        public int mo21075b() {
            return this.f20793d;
        }
    }

    /* renamed from: a */
    public static C6925a m26910a() {
        return new C6912i.C6914b();
    }

    /* renamed from: b */
    public abstract C6926b mo21064b();

    /* renamed from: c */
    public abstract C6927c mo21065c();
}
