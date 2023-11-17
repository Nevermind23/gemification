package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C1115b1;
import androidx.core.view.C1127d;

/* renamed from: androidx.core.widget.y */
public final class C1331y implements C1115b1 {

    /* renamed from: androidx.core.widget.y$a */
    private static final class C1332a {
        /* renamed from: a */
        static CharSequence m4629a(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            if (coerceToText instanceof Spanned) {
                return coerceToText.toString();
            }
            return coerceToText;
        }
    }

    /* renamed from: b */
    private static CharSequence m4626b(Context context, ClipData.Item item, int i) {
        return C1332a.m4629a(context, item, i);
    }

    /* renamed from: c */
    private static void m4627c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* renamed from: a */
    public C1127d mo3674a(View view, C1127d dVar) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + dVar);
        }
        if (dVar.mo3677d() == 2) {
            return dVar;
        }
        ClipData b = dVar.mo3675b();
        int c = dVar.mo3676c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < b.getItemCount(); i++) {
            CharSequence b2 = m4626b(context, b.getItemAt(i), c);
            if (b2 != null) {
                if (!z) {
                    m4627c(editable, b2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), b2);
                }
            }
        }
        return null;
    }
}
