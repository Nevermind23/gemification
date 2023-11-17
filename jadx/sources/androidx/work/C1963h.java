package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.h */
public final class C1963h {

    /* renamed from: a */
    private final int f5945a;

    /* renamed from: b */
    private final int f5946b;

    /* renamed from: c */
    private final Notification f5947c;

    public C1963h(int i, Notification notification) {
        this(i, notification, 0);
    }

    /* renamed from: a */
    public int mo6739a() {
        return this.f5946b;
    }

    /* renamed from: b */
    public Notification mo6740b() {
        return this.f5947c;
    }

    /* renamed from: c */
    public int mo6741c() {
        return this.f5945a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1963h.class != obj.getClass()) {
            return false;
        }
        C1963h hVar = (C1963h) obj;
        if (this.f5945a == hVar.f5945a && this.f5946b == hVar.f5946b) {
            return this.f5947c.equals(hVar.f5947c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f5945a * 31) + this.f5946b) * 31) + this.f5947c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f5945a + ", mForegroundServiceType=" + this.f5946b + ", mNotification=" + this.f5947c + '}';
    }

    public C1963h(int i, Notification notification, int i2) {
        this.f5945a = i;
        this.f5947c = notification;
        this.f5946b = i2;
    }
}
