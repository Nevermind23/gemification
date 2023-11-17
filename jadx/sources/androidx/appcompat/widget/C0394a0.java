package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.C1008h;

/* renamed from: androidx.appcompat.widget.a0 */
final class C0394a0 {

    /* renamed from: a */
    private TextView f2016a;

    /* renamed from: b */
    private TextClassifier f2017b;

    /* renamed from: androidx.appcompat.widget.a0$a */
    private static final class C0395a {
        /* renamed from: a */
        static TextClassifier m1607a(TextView textView) {
            TextClassificationManager a = C0510x.m2054a(textView.getContext().getSystemService(TextClassificationManager.class));
            if (a != null) {
                return a.getTextClassifier();
            }
            return TextClassifier.NO_OP;
        }
    }

    C0394a0(TextView textView) {
        this.f2016a = (TextView) C1008h.m3530g(textView);
    }

    /* renamed from: a */
    public TextClassifier mo1915a() {
        TextClassifier textClassifier = this.f2017b;
        if (textClassifier == null) {
            return C0395a.m1607a(this.f2016a);
        }
        return textClassifier;
    }

    /* renamed from: b */
    public void mo1916b(TextClassifier textClassifier) {
        this.f2017b = textClassifier;
    }
}
