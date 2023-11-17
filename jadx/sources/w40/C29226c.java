package w40;

import android.graphics.drawable.Drawable;
import fe0.C20464a;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.externallibs.materialcalendar.C23322h;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;

/* renamed from: w40.c */
public final class C29226c implements C20464a {

    /* renamed from: a */
    private final Set f74278a;

    /* renamed from: b */
    private final Drawable f74279b;

    public C29226c(Set set, Drawable drawable) {
        C41536l.m120489i(set, "excludedDates");
        C41536l.m120489i(drawable, "backgroundDrawable");
        this.f74278a = set;
        this.f74279b = drawable;
    }

    /* renamed from: a */
    public boolean mo49008a(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "day");
        return !this.f74278a.contains(calendarDay);
    }

    /* renamed from: b */
    public void mo49009b(C23322h hVar) {
        C41536l.m120489i(hVar, "view");
        hVar.mo59076j(true);
        hVar.mo59077k(this.f74279b);
    }
}
