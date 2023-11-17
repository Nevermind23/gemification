package p342j$.lang;

import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import p342j$.time.C9288c;
import p342j$.time.temporal.C9333a;
import p342j$.time.temporal.C9343k;
import p342j$.time.temporal.C9344l;
import p342j$.time.temporal.C9346n;
import p342j$.time.temporal.C9347o;
import p342j$.time.temporal.TemporalAccessor;
import p342j$.time.temporal.TemporalField;
import p342j$.util.function.BiConsumer;
import p342j$.util.function.C9475o;
import sun.misc.Unsafe;

/* renamed from: j$.lang.a */
public abstract /* synthetic */ class C9284a {
    /* renamed from: a */
    public static void m34174a(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        biConsumer.getClass();
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    /* renamed from: b */
    public static int m34175b(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        C9347o e = temporalAccessor.mo24917e(temporalField);
        if (e.mo25140g()) {
            long f = temporalAccessor.mo24918f(temporalField);
            if (e.mo25141h(f)) {
                return (int) f;
            }
            throw new C9288c("Invalid value for " + temporalField + " (valid values " + e + "): " + f);
        }
        throw new C9346n("Invalid field " + temporalField + " for get() method, use getLong() instead");
    }

    /* renamed from: c */
    public static Object m34176c(TemporalAccessor temporalAccessor, C9344l lVar) {
        if (lVar == C9343k.m34505g() || lVar == C9343k.m34499a() || lVar == C9343k.m34503e()) {
            return null;
        }
        return lVar.mo25036a(temporalAccessor);
    }

    /* renamed from: d */
    public static C9347o m34177d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (temporalField instanceof C9333a) {
            if (temporalAccessor.mo24916b(temporalField)) {
                return temporalField.mo25112e();
            }
            throw new C9346n("Unsupported field: " + temporalField);
        } else if (temporalField != null) {
            return temporalField.mo25116j(temporalAccessor);
        } else {
            throw new NullPointerException("field");
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m34178e(C9475o oVar, C9475o oVar2, double d) {
        oVar.accept(d);
        oVar2.accept(d);
    }

    /* renamed from: f */
    public static /* synthetic */ long m34179f(long j, long j2) {
        long j3 = j + j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) < 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m34180g(Unsafe unsafe, Object obj, long j, Object obj2) {
        while (!unsafe.compareAndSwapObject(obj, j, (Object) null, obj2)) {
            if (unsafe.getObject(obj, j) != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static /* synthetic */ long m34181h(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* renamed from: i */
    public static /* synthetic */ long m34182i(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (numberOfLeadingZeros >= 64) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            boolean z = true;
            boolean z2 = i >= 0;
            if (j2 == Long.MIN_VALUE) {
                z = false;
            }
            if (z || z2) {
                long j3 = j * j2;
                if (i == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    /* renamed from: j */
    public static /* synthetic */ long m34183j(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    /* renamed from: k */
    public static /* synthetic */ long m34184k(long j, long j2) {
        long j3 = j - j2;
        boolean z = true;
        boolean z2 = (j2 ^ j) >= 0;
        if ((j ^ j3) < 0) {
            z = false;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException();
    }
}
