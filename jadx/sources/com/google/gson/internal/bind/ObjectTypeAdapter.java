package com.google.gson.internal.bind;

import com.google.gson.C5618p;
import com.google.gson.C5623q;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C5579g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class ObjectTypeAdapter extends TypeAdapter {

    /* renamed from: c */
    private static final C5624r f17605c = m21973f(C5618p.DOUBLE);

    /* renamed from: a */
    private final Gson f17606a;

    /* renamed from: b */
    private final C5623q f17607b;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$a */
    static /* synthetic */ class C5510a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17609a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ya.b[] r0 = p328ya.C9145b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17609a = r0
                ya.b r1 = p328ya.C9145b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17609a     // Catch:{ NoSuchFieldError -> 0x001d }
                ya.b r1 = p328ya.C9145b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17609a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ya.b r1 = p328ya.C9145b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17609a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ya.b r1 = p328ya.C9145b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17609a     // Catch:{ NoSuchFieldError -> 0x003e }
                ya.b r1 = p328ya.C9145b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17609a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ya.b r1 = p328ya.C9145b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ObjectTypeAdapter.C5510a.<clinit>():void");
        }
    }

    /* renamed from: e */
    public static C5624r m21972e(C5623q qVar) {
        if (qVar == C5618p.DOUBLE) {
            return f17605c;
        }
        return m21973f(qVar);
    }

    /* renamed from: f */
    private static C5624r m21973f(final C5623q qVar) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                if (aVar.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(gson, C5623q.this);
                }
                return null;
            }
        };
    }

    /* renamed from: g */
    private Object m21974g(C9143a aVar, C9145b bVar) {
        int i = C5510a.f17609a[bVar.ordinal()];
        if (i == 3) {
            return aVar.mo18335I0();
        }
        if (i == 4) {
            return this.f17607b.mo18461a(aVar);
        }
        if (i == 5) {
            return Boolean.valueOf(aVar.mo18334E0());
        }
        if (i == 6) {
            aVar.mo18344f0();
            return null;
        }
        throw new IllegalStateException("Unexpected token: " + bVar);
    }

    /* renamed from: h */
    private Object m21975h(C9143a aVar, C9145b bVar) {
        int i = C5510a.f17609a[bVar.ordinal()];
        if (i == 1) {
            aVar.mo18340a();
            return new ArrayList();
        } else if (i != 2) {
            return null;
        } else {
            aVar.mo18347k();
            return new C5579g();
        }
    }

    /* renamed from: b */
    public Object mo18185b(C9143a aVar) {
        String str;
        boolean z;
        C9145b n0 = aVar.mo18348n0();
        Object h = m21975h(aVar, n0);
        if (h == null) {
            return m21974g(aVar, n0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.hasNext()) {
                if (h instanceof Map) {
                    str = aVar.mo18342b0();
                } else {
                    str = null;
                }
                C9145b n02 = aVar.mo18348n0();
                Object h2 = m21975h(aVar, n02);
                if (h2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (h2 == null) {
                    h2 = m21974g(aVar, n02);
                }
                if (h instanceof List) {
                    ((List) h).add(h2);
                } else {
                    ((Map) h).put(str, h2);
                }
                if (z) {
                    arrayDeque.addLast(h);
                    h = h2;
                }
            } else {
                if (h instanceof List) {
                    aVar.mo18349s();
                } else {
                    aVar.mo18350t();
                }
                if (arrayDeque.isEmpty()) {
                    return h;
                }
                h = arrayDeque.removeLast();
            }
        }
    }

    /* renamed from: d */
    public void mo18186d(C9146c cVar, Object obj) {
        if (obj == null) {
            cVar.mo18359Q();
            return;
        }
        TypeAdapter p = this.f17606a.mo18174p(obj.getClass());
        if (p instanceof ObjectTypeAdapter) {
            cVar.mo18363o();
            cVar.mo18367s();
            return;
        }
        p.mo18186d(cVar, obj);
    }

    private ObjectTypeAdapter(Gson gson, C5623q qVar) {
        this.f17606a = gson;
        this.f17607b = qVar;
    }
}
