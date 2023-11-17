package com.facetec.sdk;

import java.util.ArrayList;

/* renamed from: com.facetec.sdk.fl */
public final class C3086fl extends C3004eg<Object> {

    /* renamed from: e */
    public static final C3013eo f10254e = new C3013eo() {
        /* renamed from: c */
        public final <T> C3004eg<T> mo9200c(C2972dv dvVar, C3142fw<T> fwVar) {
            if (fwVar.mo9331a() == Object.class) {
                return new C3086fl(dvVar);
            }
            return null;
        }
    };

    /* renamed from: d */
    private final C2972dv f10255d;

    /* renamed from: com.facetec.sdk.fl$5 */
    static /* synthetic */ class C30885 {

        /* renamed from: e */
        static final /* synthetic */ int[] f10256e;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facetec.sdk.fv[] r0 = com.facetec.sdk.C3141fv.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10256e = r0
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10256e     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10256e     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10256e     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f10256e     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f10256e     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facetec.sdk.fv r1 = com.facetec.sdk.C3141fv.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3086fl.C30885.<clinit>():void");
        }
    }

    C3086fl(C2972dv dvVar) {
        this.f10255d = dvVar;
    }

    /* renamed from: b */
    public final void mo8991b(C3160gb gbVar, Object obj) {
        if (obj == null) {
            gbVar.mo9318f();
            return;
        }
        C3004eg<?> b = this.f10255d.mo9134b(obj.getClass());
        if (b instanceof C3086fl) {
            gbVar.mo9316e();
            gbVar.mo9310c();
            return;
        }
        b.mo8991b(gbVar, obj);
    }

    /* renamed from: d */
    public final Object mo8992d(C3143fx fxVar) {
        switch (C30885.f10256e[fxVar.mo9292f().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                fxVar.mo9286b();
                while (fxVar.mo9291e()) {
                    arrayList.add(mo8992d(fxVar));
                }
                fxVar.mo9284a();
                return arrayList;
            case 2:
                C3040ex exVar = new C3040ex();
                fxVar.mo9289d();
                while (fxVar.mo9291e()) {
                    exVar.put(fxVar.mo9293g(), mo8992d(fxVar));
                }
                fxVar.mo9287c();
                return exVar;
            case 3:
                return fxVar.mo9295i();
            case 4:
                return Double.valueOf(fxVar.mo9300n());
            case 5:
                return Boolean.valueOf(fxVar.mo9296j());
            case 6:
                fxVar.mo9298l();
                return null;
            default:
                throw new IllegalStateException();
        }
    }
}
