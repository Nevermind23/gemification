package i10;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.jvm.internal.C41536l;

/* renamed from: i10.c */
public abstract class C25100c {
    /* renamed from: a */
    public static final Activity m80062a(View view) {
        C41536l.m120489i(view, "<this>");
        Context context = view.getContext();
        C41536l.m120488h(context, "context");
        return m80063b(context);
    }

    /* renamed from: b */
    public static final Activity m80063b(Context context) {
        C41536l.m120489i(context, "<this>");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            C41536l.m120488h(context, "context.baseContext");
        }
        return null;
    }
}
