package p341ge.bog.mobilebank.cleanarch.presentation.moneyrequest.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.C0454j;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.moneyrequest.view.SearchView */
public final class SearchView extends C0454j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        C41536l.m120489i(attributeSet, "attributeSet");
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
