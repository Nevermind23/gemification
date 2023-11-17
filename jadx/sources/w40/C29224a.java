package w40;

import android.graphics.drawable.Drawable;
import android.text.style.ForegroundColorSpan;
import fe0.C20464a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.externallibs.materialcalendar.C23322h;
import p341ge.bog.mobilebank.externallibs.materialcalendar.CalendarDay;

/* renamed from: w40.a */
public final class C29224a implements C20464a {

    /* renamed from: a */
    private final CalendarDay f74272a;

    /* renamed from: b */
    private final Drawable f74273b;

    /* renamed from: c */
    private final int f74274c;

    /* renamed from: d */
    private final boolean f74275d;

    public C29224a(CalendarDay calendarDay, Drawable drawable, int i, boolean z) {
        C41536l.m120489i(calendarDay, "dayToDecorate");
        C41536l.m120489i(drawable, "backgroundDrawable");
        this.f74272a = calendarDay;
        this.f74273b = drawable;
        this.f74274c = i;
        this.f74275d = z;
    }

    /* renamed from: a */
    public boolean mo49008a(CalendarDay calendarDay) {
        C41536l.m120489i(calendarDay, "calendarDay");
        return C41536l.m120484d(this.f74272a, calendarDay);
    }

    /* renamed from: b */
    public void mo49009b(C23322h hVar) {
        C41536l.m120489i(hVar, "dayViewFacade");
        hVar.mo59077k(this.f74273b);
        hVar.mo59067a(new ForegroundColorSpan(this.f74274c));
        hVar.mo59076j(this.f74275d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29224a(CalendarDay calendarDay, Drawable drawable, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(calendarDay, drawable, i, (i2 & 8) != 0 ? false : z);
    }
}
