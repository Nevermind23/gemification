package com.google.gson.internal.bind;

import com.google.gson.C5618p;
import com.google.gson.C5623q;
import com.google.gson.C5624r;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import p316xa.C8982a;
import p328ya.C9143a;
import p328ya.C9145b;
import p328ya.C9146c;

public final class NumberTypeAdapter extends TypeAdapter {

    /* renamed from: b */
    private static final C5624r f17601b = m21966f(C5618p.LAZILY_PARSED_NUMBER);

    /* renamed from: a */
    private final C5623q f17602a;

    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$a */
    static /* synthetic */ class C5508a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17604a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ya.b[] r0 = p328ya.C9145b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17604a = r0
                ya.b r1 = p328ya.C9145b.NULL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17604a     // Catch:{ NoSuchFieldError -> 0x001d }
                ya.b r1 = p328ya.C9145b.NUMBER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17604a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ya.b r1 = p328ya.C9145b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.NumberTypeAdapter.C5508a.<clinit>():void");
        }
    }

    private NumberTypeAdapter(C5623q qVar) {
        this.f17602a = qVar;
    }

    /* renamed from: e */
    public static C5624r m21965e(C5623q qVar) {
        if (qVar == C5618p.LAZILY_PARSED_NUMBER) {
            return f17601b;
        }
        return m21966f(qVar);
    }

    /* renamed from: f */
    private static C5624r m21966f(C5623q qVar) {
        return new C5624r() {
            /* renamed from: a */
            public TypeAdapter mo18225a(Gson gson, C8982a aVar) {
                if (aVar.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* renamed from: g */
    public Number mo18185b(C9143a aVar) {
        C9145b n0 = aVar.mo18348n0();
        int i = C5508a.f17604a[n0.ordinal()];
        if (i == 1) {
            aVar.mo18344f0();
            return null;
        } else if (i == 2 || i == 3) {
            return this.f17602a.mo18461a(aVar);
        } else {
            throw new JsonSyntaxException("Expecting number, got: " + n0 + "; at path " + aVar.mo18353z());
        }
    }

    /* renamed from: h */
    public void mo18186d(C9146c cVar, Number number) {
        cVar.mo18370x0(number);
    }
}
