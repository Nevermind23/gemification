package p017b;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: b.d */
public final class C2106d extends C2101a {

    /* renamed from: a */
    public static final C2107a f6261a = new C2107a((DefaultConstructorMarker) null);

    /* renamed from: b.d$a */
    public static final class C2107a {
        private C2107a() {
        }

        public /* synthetic */ C2107a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    public Intent mo4464a(Context context, Intent intent) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public ActivityResult mo4465c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
