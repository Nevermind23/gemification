package r51;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import t51.C38667h;
import t51.C38669j;

/* renamed from: r51.b */
public final class C38286b {

    /* renamed from: a */
    public static final C38286b f91793a = new C38286b();

    private C38286b() {
    }

    /* renamed from: a */
    public final void mo91838a(List list, C38669j jVar) {
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(jVar, "item");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault());
        String format = simpleDateFormat.format(new Date(jVar.mo92319d()));
        if (list.size() == 0) {
            list.add(new C38667h(format));
        } else {
            Object i0 = C41358y.m120019i0(list);
            C41536l.m120487g(i0, "null cannot be cast to non-null type ge.bog.mobilebank.statements.presentation.landing.RegularItem");
            if (!C41536l.m120484d(format, simpleDateFormat.format(new Date(((C38669j) i0).mo92319d())))) {
                list.add(new C38667h(format));
            }
        }
        list.add(jVar);
    }

    /* renamed from: b */
    public final Calendar mo91839b() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, instance.getActualMinimum(11));
        instance.set(12, instance.getActualMinimum(12));
        instance.set(13, instance.getActualMinimum(13));
        instance.set(14, instance.getActualMinimum(14));
        C41536l.m120488h(instance, "cal");
        return instance;
    }

    /* renamed from: c */
    public final long mo91840c() {
        return mo91839b().getTimeInMillis();
    }

    /* renamed from: d */
    public final long mo91841d() {
        return mo91840c();
    }

    /* renamed from: e */
    public final long mo91842e() {
        Calendar b = mo91839b();
        if (b.get(5) < 10) {
            b.add(2, -1);
        }
        b.set(5, b.getActualMinimum(5));
        return b.getTimeInMillis();
    }

    /* renamed from: f */
    public final long mo91843f(int i) {
        Calendar b = mo91839b();
        b.add(2, -i);
        return b.getTimeInMillis();
    }

    /* renamed from: g */
    public final long mo91844g() {
        Calendar b = mo91839b();
        b.setTimeInMillis(mo91842e());
        b.add(1, -2);
        return b.getTimeInMillis();
    }
}
