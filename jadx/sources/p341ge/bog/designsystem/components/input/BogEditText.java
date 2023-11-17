package p341ge.bog.designsystem.components.input;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0454j;
import cf1.C40419j;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: ge.bog.designsystem.components.input.BogEditText */
public class BogEditText extends C0454j {

    /* renamed from: d */
    private C43080q f39649d;

    /* renamed from: e */
    private C43075l f39650e;

    /* renamed from: f */
    private C40419j f39651f;

    /* renamed from: g */
    private C43079p f39652g;

    /* renamed from: h */
    private final C41217g f39653h = C41219i.m119470b(new C13352a(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BogEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50257a(int i, String str, int i2) {
        C43080q qVar = this.f39649d;
        if (qVar != null) {
            switch (i) {
                case 16908320:
                case 16908321:
                    ClipData primaryClip = getClipBoardService().getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() > 0) {
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        if (itemAt.getText() != null) {
                            qVar.invoke(str, itemAt.getText().toString(), Integer.valueOf(i2));
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: b */
    private final boolean m50258b(int i) {
        ClipData primaryClip;
        C41238w wVar;
        boolean z = false;
        if ((i != 16908322 && i != 16908337) || (primaryClip = getClipBoardService().getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) {
            return false;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        if (itemAt.getText() == null) {
            return false;
        }
        String obj = itemAt.getText().toString();
        C40419j jVar = this.f39651f;
        if (jVar != null) {
            obj = jVar.mo94490g(obj, "");
        }
        C43075l lVar = this.f39650e;
        if (lVar != null) {
            z = ((Boolean) lVar.invoke(obj)).booleanValue();
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar != null) {
            return z;
        }
        setText(obj);
        return true;
    }

    private final ClipboardManager getClipBoardService() {
        return (ClipboardManager) this.f39653h.getValue();
    }

    public final C43080q getOnClipboardCopyEventListener() {
        return this.f39649d;
    }

    public final C43075l getOnClipboardPasteListener() {
        return this.f39650e;
    }

    public final C40419j getPasteFilterRegex() {
        return this.f39651f;
    }

    public boolean isSuggestionsEnabled() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        C43079p pVar = this.f39652g;
        if (pVar != null) {
            pVar.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        super.onSelectionChanged(i, i2);
    }

    public boolean onTextContextMenuItem(int i) {
        String valueOf = String.valueOf(getText());
        int selectionStart = getSelectionStart();
        boolean b = m50258b(i);
        if (!b) {
            b = super.onTextContextMenuItem(i);
        }
        if (b) {
            m50257a(i, valueOf, selectionStart);
        }
        return b;
    }

    public boolean performLongClick() {
        requestFocus();
        return super.performLongClick();
    }

    public final void setOnClipboardCopyEventListener(C43080q qVar) {
        this.f39649d = qVar;
    }

    public final void setOnClipboardPasteListener(C43075l lVar) {
        this.f39650e = lVar;
    }

    public final void setOnSelectionChangedListener(C43079p pVar) {
        C41536l.m120489i(pVar, "onSelectionChanged");
        this.f39652g = pVar;
    }

    public final void setPasteFilterRegex(C40419j jVar) {
        this.f39651f = jVar;
    }
}
