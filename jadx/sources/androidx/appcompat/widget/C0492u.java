package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1127d;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.appcompat.widget.u */
abstract class C0492u {

    /* renamed from: androidx.appcompat.widget.u$a */
    private static final class C0493a {
        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        static boolean m1979a(DragEvent dragEvent, TextView textView, Activity activity) {
            DragAndDropPermissions unused = activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                ViewCompat.m3599h0(textView, new C1127d.C1128a(dragEvent.getClipData(), 3).mo3680a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m1980b(DragEvent dragEvent, View view, Activity activity) {
            DragAndDropPermissions unused = activity.requestDragAndDropPermissions(dragEvent);
            ViewCompat.m3599h0(view, new C1127d.C1128a(dragEvent.getClipData(), 3).mo3680a());
            return true;
        }
    }

    /* renamed from: a */
    static boolean m1976a(View view, DragEvent dragEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && ViewCompat.m3547E(view) != null) {
            Activity c = m1978c(view);
            if (c == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    if (view instanceof TextView) {
                        return C0493a.m1979a(dragEvent, (TextView) view, c);
                    }
                    return C0493a.m1980b(dragEvent, view, c);
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    static boolean m1977b(TextView textView, int i) {
        ClipData clipData;
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.m3547E(textView) == null || (i != 16908322 && i != 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            clipData = null;
        } else {
            clipData = clipboardManager.getPrimaryClip();
        }
        if (clipData != null && clipData.getItemCount() > 0) {
            C1127d.C1128a aVar = new C1127d.C1128a(clipData, 1);
            if (i != 16908322) {
                i2 = 1;
            }
            ViewCompat.m3599h0(textView, aVar.mo3682c(i2).mo3680a());
        }
        return true;
    }

    /* renamed from: c */
    static Activity m1978c(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
