package x30;

import java.util.Calendar;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: x30.a */
public final class C29644a {

    /* renamed from: a */
    public static final C29645a f74811a = new C29645a((DefaultConstructorMarker) null);

    /* renamed from: x30.a$a */
    public static final class C29645a {
        private C29645a() {
        }

        public /* synthetic */ C29645a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final Calendar m89968a() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, instance.getActualMinimum(11));
        instance.set(12, instance.getActualMinimum(12));
        instance.set(13, instance.getActualMinimum(13));
        instance.set(14, instance.getActualMinimum(14));
        C41536l.m120488h(instance, "cal");
        return instance;
    }

    /* renamed from: b */
    public final long mo69560b() {
        return m89968a().getTimeInMillis();
    }

    /* renamed from: c */
    public final long mo69561c() {
        return mo69560b();
    }

    /* renamed from: d */
    public final long mo69562d() {
        Calendar a = m89968a();
        if (a.get(5) < 10) {
            a.add(2, -1);
        }
        a.set(5, a.getActualMinimum(5));
        return a.getTimeInMillis();
    }

    /* renamed from: e */
    public final long mo69563e() {
        Calendar a = m89968a();
        a.setTimeInMillis(mo69562d());
        a.add(1, -2);
        return a.getTimeInMillis();
    }
}
