package gf1;

import ef1.C40832l0;
import ef1.C40849p;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.C41584a0;
import kotlinx.coroutines.internal.C41610o;

/* renamed from: gf1.l */
public final class C41108l extends C41118v implements C41116t {

    /* renamed from: g */
    public final Throwable f97029g;

    public C41108l(Throwable th) {
        this.f97029g = th;
    }

    /* renamed from: A */
    public C41584a0 mo95528A(C41610o.C41612b bVar) {
        return C40849p.f96564a;
    }

    /* renamed from: C */
    public C41108l mo95548a() {
        return this;
    }

    /* renamed from: D */
    public C41108l mo95530y() {
        return this;
    }

    /* renamed from: E */
    public final Throwable mo95546E() {
        Throwable th = this.f97029g;
        return th == null ? new ClosedReceiveChannelException("Channel was closed") : th;
    }

    /* renamed from: F */
    public final Throwable mo95547F() {
        Throwable th = this.f97029g;
        return th == null ? new ClosedSendChannelException("Channel was closed") : th;
    }

    /* renamed from: c */
    public void mo95508c(Object obj) {
    }

    /* renamed from: d */
    public C41584a0 mo95509d(Object obj, C41610o.C41612b bVar) {
        return C40849p.f96564a;
    }

    public String toString() {
        return "Closed@" + C40832l0.m118330b(this) + '[' + this.f97029g + ']';
    }

    /* renamed from: x */
    public void mo95529x() {
    }

    /* renamed from: z */
    public void mo95531z(C41108l lVar) {
    }
}
