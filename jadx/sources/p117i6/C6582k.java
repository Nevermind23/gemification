package p117i6;

import java.util.concurrent.ScheduledFuture;
import p337z7.C9219c;
import p337z7.Task;

/* renamed from: i6.k */
public final /* synthetic */ class C6582k implements C9219c {

    /* renamed from: a */
    public final /* synthetic */ C6573b f20091a;

    /* renamed from: b */
    public final /* synthetic */ String f20092b;

    /* renamed from: c */
    public final /* synthetic */ ScheduledFuture f20093c;

    public /* synthetic */ C6582k(C6573b bVar, String str, ScheduledFuture scheduledFuture) {
        this.f20091a = bVar;
        this.f20092b = str;
        this.f20093c = scheduledFuture;
    }

    public final void onComplete(Task task) {
        this.f20091a.mo20570e(this.f20092b, this.f20093c, task);
    }
}
