package com.google.zxing;

import java.util.Map;
import p122ib.C6630c;
import p200ob.C7508b;
import p239rb.C8089b;
import p358bc.C10225d;
import p429gc.C12962b;
import p663xb.C18658b;
import p663xb.C18659b0;
import p663xb.C18661d;
import p663xb.C18664f;
import p663xb.C18666h;
import p663xb.C18668j;
import p663xb.C18670l;
import p663xb.C18673o;
import p663xb.C18679u;

/* renamed from: com.google.zxing.j */
public final class C5760j implements C5768q {

    /* renamed from: com.google.zxing.j$a */
    static /* synthetic */ class C5761a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18191a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.a[] r0 = com.google.zxing.C5751a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18191a = r0
                com.google.zxing.a r1 = com.google.zxing.C5751a.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.a r1 = com.google.zxing.C5751a.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.a r1 = com.google.zxing.C5751a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.a r1 = com.google.zxing.C5751a.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.zxing.a r1 = com.google.zxing.C5751a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f18191a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.zxing.a r1 = com.google.zxing.C5751a.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.C5760j.C5761a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C7508b mo18891a(String str, C5751a aVar, int i, int i2, Map map) {
        C5768q qVar;
        switch (C5761a.f18191a[aVar.ordinal()]) {
            case 1:
                qVar = new C18670l();
                break;
            case 2:
                qVar = new C18659b0();
                break;
            case 3:
                qVar = new C18668j();
                break;
            case 4:
                qVar = new C18679u();
                break;
            case 5:
                qVar = new C12962b();
                break;
            case 6:
                qVar = new C18664f();
                break;
            case 7:
                qVar = new C18666h();
                break;
            case 8:
                qVar = new C18661d();
                break;
            case 9:
                qVar = new C18673o();
                break;
            case 10:
                qVar = new C10225d();
                break;
            case 11:
                qVar = new C18658b();
                break;
            case 12:
                qVar = new C8089b();
                break;
            case 13:
                qVar = new C6630c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return qVar.mo18891a(str, aVar, i, i2, map);
    }
}
