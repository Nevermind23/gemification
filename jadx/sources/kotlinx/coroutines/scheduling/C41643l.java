package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.C41586b0;

/* renamed from: kotlinx.coroutines.scheduling.l */
public abstract class C41643l {

    /* renamed from: a */
    public static final long f97878a = C41590d0.m120645e("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, (Object) null);

    /* renamed from: b */
    public static final int f97879b = C41590d0.m120644d("kotlinx.coroutines.scheduler.core.pool.size", C43429k.m124585d(C41586b0.m120625a(), 2), 1, 0, 8, (Object) null);

    /* renamed from: c */
    public static final int f97880c = C41590d0.m120644d("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);

    /* renamed from: d */
    public static final long f97881d = TimeUnit.SECONDS.toNanos(C41590d0.m120645e("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 0, 0, 12, (Object) null));

    /* renamed from: e */
    public static C41638g f97882e = C41636e.f97868a;

    /* renamed from: f */
    public static final C41640i f97883f = new C41641j(0);

    /* renamed from: g */
    public static final C41640i f97884g = new C41641j(1);
}
