package p342j$.util.concurrent;

import com.github.mikephil.charting.utils.Utils;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import p342j$.util.stream.C9538F;
import p342j$.util.stream.C9685m0;
import p342j$.util.stream.C9735w0;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.concurrent.ThreadLocalRandom */
public class ThreadLocalRandom extends Random {

    /* renamed from: d */
    private static final AtomicInteger f25992d = new AtomicInteger();

    /* renamed from: e */
    private static final AtomicLong f25993e;

    /* renamed from: f */
    private static final ThreadLocal f25994f = new ThreadLocal();

    /* renamed from: g */
    private static final ThreadLocal f25995g = new C9411x();

    /* renamed from: a */
    long f25996a;

    /* renamed from: b */
    int f25997b;

    /* renamed from: c */
    boolean f25998c = true;

    static {
        long j;
        if (((Boolean) AccessController.doPrivileged(new C9410w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j = ((long) seed[0]) & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (((long) seed[i]) & 255);
            }
        } else {
            j = m34703h(System.nanoTime()) ^ m34703h(System.currentTimeMillis());
        }
        f25993e = new AtomicLong(j);
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    ThreadLocalRandom() {
    }

    /* renamed from: a */
    static final int m34699a(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((ThreadLocalRandom) f25995g.get()).f25997b = i4;
        return i4;
    }

    /* renamed from: b */
    static final int m34700b() {
        return ((ThreadLocalRandom) f25995g.get()).f25997b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f25995g.get();
        if (threadLocalRandom.f25997b == 0) {
            m34701f();
        }
        return threadLocalRandom;
    }

    /* renamed from: f */
    static final void m34701f() {
        int addAndGet = f25992d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h = m34703h(f25993e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f25995g.get();
        threadLocalRandom.f25996a = h;
        threadLocalRandom.f25997b = addAndGet;
    }

    /* renamed from: g */
    private static int m34702g(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        return (int) (((j2 ^ (j2 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    /* renamed from: h */
    private static long m34703h(long j) {
        long j2 = (j ^ (j >>> 33)) * -49064778989728563L;
        long j3 = (j2 ^ (j2 >>> 33)) * -4265267296055464877L;
        return j3 ^ (j3 >>> 33);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final double mo25333c(double d, double d2) {
        double nextLong = ((double) (nextLong() >>> 11)) * 1.1102230246251565E-16d;
        if (d >= d2) {
            return nextLong;
        }
        double d3 = ((d2 - d) * nextLong) + d;
        return d3 >= d2 ? Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1) : d3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo25334d(int i, int i2) {
        int i3;
        int g = m34702g(mo25340i());
        if (i >= i2) {
            return g;
        }
        int i4 = i2 - i;
        int i5 = i4 - 1;
        if ((i4 & i5) == 0) {
            i3 = g & i5;
        } else if (i4 > 0) {
            int i6 = g >>> 1;
            while (true) {
                int i7 = i6 + i5;
                i3 = i6 % i4;
                if (i7 - i3 >= 0) {
                    break;
                }
                i6 = m34702g(mo25340i()) >>> 1;
            }
        } else {
            while (true) {
                if (g >= i && g < i2) {
                    return g;
                }
                g = m34702g(mo25340i());
            }
        }
        return i3 + i;
    }

    public final DoubleStream doubles() {
        return C9538F.m34982u(C9735w0.m35809Y0(new C9412y(0, Long.MAX_VALUE, Double.MAX_VALUE, Utils.DOUBLE_EPSILON)));
    }

    public final DoubleStream doubles(double d, double d2) {
        if (d < d2) {
            return C9538F.m34982u(C9735w0.m35809Y0(new C9412y(0, Long.MAX_VALUE, d, d2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final DoubleStream doubles(long j) {
        if (j >= 0) {
            return C9538F.m34982u(C9735w0.m35809Y0(new C9412y(0, j, Double.MAX_VALUE, Utils.DOUBLE_EPSILON)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final DoubleStream doubles(long j, double d, double d2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (d < d2) {
            return C9538F.m34982u(C9735w0.m35809Y0(new C9412y(0, j, d, d2)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo25339e(long j, long j2) {
        long j3;
        long h = m34703h(mo25340i());
        if (j >= j2) {
            return h;
        }
        long j4 = j2 - j;
        long j5 = j4 - 1;
        if ((j4 & j5) == 0) {
            j3 = h & j5;
        } else if (j4 > 0) {
            while (true) {
                long j6 = h >>> 1;
                long j7 = j6 + j5;
                j3 = j6 % j4;
                if (j7 - j3 >= 0) {
                    break;
                }
                h = m34703h(mo25340i());
            }
        } else {
            while (true) {
                if (h >= j && h < j2) {
                    return h;
                }
                h = m34703h(mo25340i());
            }
        }
        return j3 + j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final long mo25340i() {
        long j = this.f25996a - 7046029254386353131L;
        this.f25996a = j;
        return j;
    }

    public final IntStream ints() {
        return IntStream.Wrapper.convert(C9735w0.m35817i1(new C9413z(0, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    public final java.util.stream.IntStream ints(int i, int i2) {
        if (i < i2) {
            return IntStream.Wrapper.convert(C9735w0.m35817i1(new C9413z(0, Long.MAX_VALUE, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final java.util.stream.IntStream ints(long j) {
        if (j >= 0) {
            return IntStream.Wrapper.convert(C9735w0.m35817i1(new C9413z(0, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final java.util.stream.IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (i < i2) {
            return IntStream.Wrapper.convert(C9735w0.m35817i1(new C9413z(0, j, i, i2)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    public final LongStream longs() {
        return C9685m0.m35637u(C9735w0.m35819k1(new C9387A(0, Long.MAX_VALUE, Long.MAX_VALUE, 0)));
    }

    public final LongStream longs(long j) {
        if (j >= 0) {
            return C9685m0.m35637u(C9735w0.m35819k1(new C9387A(0, j, Long.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final LongStream longs(long j, long j2) {
        if (j < j2) {
            return C9685m0.m35637u(C9735w0.m35819k1(new C9387A(0, Long.MAX_VALUE, j, j2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (j2 < j3) {
            return C9685m0.m35637u(C9735w0.m35819k1(new C9387A(0, j, j2, j3)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* access modifiers changed from: protected */
    public final int next(int i) {
        return (int) (m34703h(mo25340i()) >>> (64 - i));
    }

    public final boolean nextBoolean() {
        return m34702g(mo25340i()) < 0;
    }

    public final double nextDouble() {
        return ((double) (m34703h(mo25340i()) >>> 11)) * 1.1102230246251565E-16d;
    }

    public final float nextFloat() {
        return ((float) (m34702g(mo25340i()) >>> 8)) * 5.9604645E-8f;
    }

    public final double nextGaussian() {
        ThreadLocal threadLocal = f25994f;
        Double d = (Double) threadLocal.get();
        if (d != null) {
            threadLocal.set((Object) null);
            return d.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d2 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d2 < 1.0d && d2 != Utils.DOUBLE_EPSILON) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d2) * -2.0d) / d2);
                f25994f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public final int nextInt() {
        return m34702g(mo25340i());
    }

    public final int nextInt(int i) {
        if (i > 0) {
            int g = m34702g(mo25340i());
            int i2 = i - 1;
            if ((i & i2) == 0) {
                return g & i2;
            }
            while (true) {
                int i3 = g >>> 1;
                int i4 = i3 + i2;
                int i5 = i3 % i;
                if (i4 - i5 >= 0) {
                    return i5;
                }
                g = m34702g(mo25340i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public final long nextLong() {
        return m34703h(mo25340i());
    }

    public final void setSeed(long j) {
        if (this.f25998c) {
            throw new UnsupportedOperationException();
        }
    }
}
