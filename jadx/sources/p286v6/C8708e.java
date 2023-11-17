package p286v6;

import android.content.Context;

/* renamed from: v6.e */
public class C8708e {

    /* renamed from: b */
    private static final C8708e f24530b = new C8708e();

    /* renamed from: a */
    private C8707d f24531a = null;

    /* renamed from: a */
    public static C8707d m32461a(Context context) {
        return f24530b.mo24094b(context);
    }

    /* renamed from: b */
    public final synchronized C8707d mo24094b(Context context) {
        if (this.f24531a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f24531a = new C8707d(context);
        }
        return this.f24531a;
    }
}
