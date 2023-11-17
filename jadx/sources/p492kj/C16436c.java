package p492kj;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.notificationbadgetext.NotificationBadgeTextView;

/* renamed from: kj.c */
public final class C16436c {

    /* renamed from: a */
    private final String f46427a;

    /* renamed from: b */
    private final NotificationBadgeTextView.C13406a f46428b;

    public C16436c(String str, NotificationBadgeTextView.C13406a aVar) {
        C41536l.m120489i(str, "text");
        C41536l.m120489i(aVar, "badgeProperties");
        this.f46427a = str;
        this.f46428b = aVar;
    }

    /* renamed from: a */
    public final NotificationBadgeTextView.C13406a mo43572a() {
        return this.f46428b;
    }

    /* renamed from: b */
    public final String mo43573b() {
        return this.f46427a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16436c)) {
            return false;
        }
        C16436c cVar = (C16436c) obj;
        return C41536l.m120484d(this.f46427a, cVar.f46427a) && C41536l.m120484d(this.f46428b, cVar.f46428b);
    }

    public int hashCode() {
        return (this.f46427a.hashCode() * 31) + this.f46428b.hashCode();
    }

    public String toString() {
        String str = this.f46427a;
        NotificationBadgeTextView.C13406a aVar = this.f46428b;
        return "StatisticsListItem(text=" + str + ", badgeProperties=" + aVar + ")";
    }
}
