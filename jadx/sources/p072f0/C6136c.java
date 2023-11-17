package p072f0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C1378e;

/* renamed from: f0.c */
final class C6136c extends InputConnectionWrapper {

    /* renamed from: a */
    private final TextView f19093a;

    /* renamed from: b */
    private final C6137a f19094b;

    /* renamed from: f0.c$a */
    public static class C6137a {
        /* renamed from: a */
        public boolean mo19700a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
            return C1378e.m4731e(inputConnection, editable, i, i2, z);
        }

        /* renamed from: b */
        public void mo19701b(EditorInfo editorInfo) {
            if (C1378e.m4734h()) {
                C1378e.m4730b().mo4000u(editorInfo);
            }
        }
    }

    C6136c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new C6137a());
    }

    /* renamed from: a */
    private Editable m24520a() {
        return this.f19093a.getEditableText();
    }

    public boolean deleteSurroundingText(int i, int i2) {
        if (this.f19094b.mo19700a(this, m24520a(), i, i2, false) || super.deleteSurroundingText(i, i2)) {
            return true;
        }
        return false;
    }

    public boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (this.f19094b.mo19700a(this, m24520a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }

    C6136c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, C6137a aVar) {
        super(inputConnection, false);
        this.f19093a = textView;
        this.f19094b = aVar;
        aVar.mo19701b(editorInfo);
    }
}
